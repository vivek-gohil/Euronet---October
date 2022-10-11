package com.euronet.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.euronet.main.domain.BookDetails;
import com.euronet.main.service.BookDetailsServiceInterface;

@Controller
public class BookDetailsController {
	@Autowired
	private BookDetailsServiceInterface bookDetailsServiceInterface;

	@RequestMapping("addnewbook")
	public String showAddNewBookDetailsPage(Model model) {
		BookDetails bookDetails = new BookDetails();
		model.addAttribute("bookDetails", bookDetails);
		return "newbookdetails";
	}

	@RequestMapping("confirmation")
	public String showConfirmationPage(BookDetails bookDetails) {
		bookDetailsServiceInterface.addNewBookDetails(bookDetails);
		return "bookconfirmation";
	}

	@RequestMapping("finish")
	public String showFinishPage() {
		return "finish";
	}
}
