package com.euronet.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.euronet.main.domain.BookDetails;

@Controller
public class BookDetailsController {

	@RequestMapping("/")
	public String showHomePage() {
		return "index";
	}

	@RequestMapping("addnewbook")
	public String showAddNewBookDetailsPage(Model model) {
		BookDetails bookDetails = new BookDetails();
		model.addAttribute("bookDetails", bookDetails);
		return "newbookdetails";
	}

	@RequestMapping("confirmation")
	public String showConfirmationPage(BookDetails bookDetails) {
		return "bookconfirmation";
	}

	@RequestMapping("finish")
	public String showFinishPage() {
		return "finish";
	}
}
