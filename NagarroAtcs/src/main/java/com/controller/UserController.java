package com.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.google.common.hash.Hashing;
import com.model.Login;
import com.model.Product;
import com.model.Search;
import com.model.User;
import com.model.Pin;

@Controller
public class UserController {

	
	boolean valueascheck=false;
	
	// Return index api //
	@RequestMapping("/Registerpage")  
	public String home() {
		return "Registerpage";
	}

	// Return login api //  
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	
	// Return product api // 
	@RequestMapping("/Addproduct")
	public String addproduct(Model m) {
		m.addAttribute("key3", valueascheck);
		return "Addproduct";
	}
	
	
	// Logout api //
	@RequestMapping("/logout")
	public String logout() {
		valueascheck = false;
		return "login";
	}
	
	
	
	  // Register User's api //
	  
		@RequestMapping(path = "/Register", method = RequestMethod.POST)
		public String createUser(@ModelAttribute User user, Model m) {
			RestTemplate obj = new RestTemplate();
			int pwd = user.getUserpassword().length();
			String password = Hashing.sha256().hashString(user.getUserpassword(), StandardCharsets.UTF_8).toString();
			user.setUserpassword(password);
			String confirmpassword = Hashing.sha256().hashString(user.getUserconfirmpassword(), StandardCharsets.UTF_8)
					.toString();
			user.setUserconfirmpassword(confirmpassword);
			System.out.println(pwd);

			// check if confirm password is correct then call the add function api // if
			if (user.getUserpassword().equals(user.getUserconfirmpassword()) && (pwd >= 8)) {
				obj.postForEntity("http://localhost:8083/adduserregister", user, User.class);

				return "login";
			}

			// otherwise return index page // else {
			return "registermsg";

		}
	 
	
	
	
	
	  // Authentication login Api implementation // boolean adminvalue = false;
	  
		@RequestMapping(path = "/loginprocess", method = RequestMethod.POST)
		public String createUser(@ModelAttribute Login login, Model m) {
			RestTemplate obj = new RestTemplate();
			String loginprocess = Hashing.sha256().hashString(login.getPassword(), StandardCharsets.UTF_8).toString();
			login.setPassword(loginprocess);
			RestTemplate rest = new RestTemplate();
			String getalluserdatapi = "http://localhost:8083/getdata";
			ResponseEntity<User[]> result = rest.getForEntity(getalluserdatapi, User[].class);
			List<User> finalList = Arrays.asList(result.getBody());
			System.out.println(finalList);
			for (User us : finalList) {
				System.out.println(us.getUserpassword());
				System.out.println(us.getUseremail());
				if (us.getUseremail().equals(login.getEmail()) && us.getUserpassword().equals(login.getPassword())) {
					valueascheck = true;
					m.addAttribute("keys", valueascheck);
					callgetalluser(null, m);
					return "frontendblock";

				}
			}
			return "loginmessage";
		}
	 
	
	  
	  
	// Add product Api //
	@RequestMapping(path = "/Addproduct", method = RequestMethod.POST)
	public String createProduct(@ModelAttribute Product product, Model m) {

		RestTemplate rest = new RestTemplate();
		product.setPphotos(imagename);
		int prodprice=product.getProductprice();
		System.out.println(prodprice);
			
		if(prodprice>0)
		{
		m.addAttribute("msgaddproduct", "Product Add Successfully!!!");
		rest.postForEntity("http://localhost:8083/product",product, Product.class);
		return "Addproduct";
		}
		m.addAttribute("negative","price must be positive!! x");
		return "Addproduct";
	}
	
	

    // function of upload images //
	String imagename;
	@RequestMapping(path = "/uploadimage", method = RequestMethod.POST)
	public String fileupload(@RequestParam("profile") CommonsMultipartFile file, HttpSession s, Model m) {
		imagename = file.getOriginalFilename();
		System.out.println(file.getName());  
        
		System.out.println(file.getSize());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());

		byte[] data = file.getBytes();
		// save to this file server ///
		String path = s.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources" + File.separator
				+ "img" + File.separator + file.getOriginalFilename();
		System.out.println(path);

		try {

			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("file upload");
			m.addAttribute("msg", "image upload");
			m.addAttribute("msg1", "successfully");

			m.addAttribute("filename", file.getOriginalFilename());
		} catch (Exception e) {
			e.printStackTrace();
		}
		/* return "showimage"; */
		return "Addproduct";

	}

	
	
	static RestTemplate rest = new RestTemplate();
	public String getallproductapi = "http://localhost:8083/fetch";
	@RequestMapping("/data")
	public String callgetalluser(@ModelAttribute Product product ,Model m) {
		ResponseEntity<Product[]> result = rest.getForEntity(getallproductapi, Product[].class);
		List<Product> finalList = Arrays.asList(result.getBody());
		m.addAttribute("result", finalList);
		m.addAttribute("home", valueascheck);
		return "afterlogin";

	}
	

	// Serach product api //
	@RequestMapping(path = "/search", method = RequestMethod.POST)
	public String createuser(@ModelAttribute Search search, Model m) {

		RestTemplate rest = new RestTemplate();
		ResponseEntity<Product[]> results = rest
				.getForEntity("http://localhost:8083/searchusingname/" + search.getSearchingvalue(), Product[].class);
		List<Product> searchapi = Arrays.asList(results.getBody());
		
		m.addAttribute("searchapi", searchapi);
		m.addAttribute("keys", valueascheck);
		m.addAttribute("key", valueascheck);
		return "searchpage";

	}

	
	// filter product api //
	@RequestMapping(path = "/filterproduct", method = RequestMethod.POST)
	public String filterproducts(@RequestParam("filtering") String filtername, Model m) {

		RestTemplate rest = new RestTemplate();
		System.out.println(filtername);
		ResponseEntity<Product[]> results = rest.getForEntity("http://localhost:8083/filterusingprice/" + filtername,
				Product[].class);
		List<Product> ftr = Arrays.asList(results.getBody());
		m.addAttribute("filter", ftr);
		m.addAttribute("key6", valueascheck);
		return "filterprice";

	}
	
	
	
	// api for pincode //
	@RequestMapping(path = "/pincodes", method = RequestMethod.POST)
	public String pin(@ModelAttribute Pin x, @ModelAttribute Product product, Model m) {

		boolean ares = false;
		ResponseEntity<Product[]> result = rest.getForEntity(getallproductapi, Product[].class);
		List<Product> finalList1 = Arrays.asList(result.getBody());
		m.addAttribute("key6", valueascheck);		
		List<String> ls = new ArrayList<String>();
		for (Product p : finalList1) {

			if (p.getProductcode().contains(x.getPcode())) {
				
				String a = p.getServiceability();

				String b = "";
				char r;
				for (int i = 0; i < a.length(); i++) {
					r = a.charAt(i);
					if (r != ',') {
						b += a.charAt(i);
					} else {
						ls.add(b);
						b = "";
					}
				}
				ares = true;

			}
		}

		if (ares == true) {

			for (String ps : ls) {
				if (ps.equals(x.getPincode())) {
					callgetalluser(product, m);
                    System.out.println(x.getPcode());
                    m.addAttribute("pincode", valueascheck);
                    m.addAttribute("pin1", "Product Available in this pincode!!");
					return "frontendblock";
				}
			}

		}

		callgetalluser(product, m);
		m.addAttribute("pincode1",valueascheck);
		  m.addAttribute("pin2", "Product not Available in this pincode!!");
		return "frontendblock";
	}


}
