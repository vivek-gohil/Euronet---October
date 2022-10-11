package com.euronet.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.euronet.main.domain.BookDetails;
import com.euronet.main.domain.BookIssueDetails;
import com.euronet.main.service.BookDetailsServiceInterface;
import com.euronet.main.service.BookIssueDetailsServiceInterface;

@Controller
public class HomeController {

	@Autowired
	private BookDetailsServiceInterface bookDetailsServiceInterface;

	@Autowired
	private BookIssueDetailsServiceInterface bookIssueDetailsServiceInterface;

	@RequestMapping("/")
	public String showHomePage() {
		return "lmshome";
	}

	@RequestMapping("books")
	public String showBooksPage(Model model) {
		List<BookDetails> allBookDetails = bookDetailsServiceInterface.getAllBookDetails();
		System.out.println(allBookDetails);
		model.addAttribute("allBookDetails", allBookDetails);
		return "index";
	}

	@RequestMapping("members")
	public String showMembersPage() {
		return "members";
	}

	@RequestMapping("bookissue")
	public String showIssueDetailsPage(Model model) {
		List<BookIssueDetails> allIssueBooks = bookIssueDetailsServiceInterface.getAllBookIssueDetails();
		model.addAttribute("allIssueBooks", allIssueBooks);
		return "bookissuehome";
	}
}
