package com.sarah.hoppersreceipt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReceiptController {
	@RequestMapping("/")
	public String index(Model model) {
		
		// given variables
		String name = "Grace Hopper";
		String itemName = "Copper wire";
		double price = 5.25;
		String description = "Metal strips, also an illustration of nanoseconds.";
		String vendor = "Little Things Corner Store";
		
		// adding variables to model
		model.addAttribute(name);
		model.addAttribute(itemName);
		model.addAttribute(price);
		model.addAttribute(description);
		model.addAttribute(vendor);
		
		return "index.jsp";
	}
}