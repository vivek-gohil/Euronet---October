package com.euronet.main.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.euronet.main.domain.BookDetails;
import com.euronet.main.domain.BookIssueDetails;
import com.euronet.main.domain.MemberDetails;
import com.euronet.main.service.BookDetailsServiceInterface;
import com.euronet.main.service.BookIssueDetailsServiceInterface;
import com.euronet.main.service.MemberDetailsServiceInterface;

@Controller
public class BookIssueDetailsController {

	@Autowired
	private MemberDetailsServiceInterface memberDetailsServiceInterface;

	@Autowired
	private BookDetailsServiceInterface bookDetailsServiceInterface;

	@RequestMapping("issuenewbook")
	public String showBookIssuePageOne(Model model) {
		BookIssueDetails bookIssueDetails = new BookIssueDetails();
		model.addAttribute("bookIssueDetails", bookIssueDetails);
		return "issuenewbookpageone";
	}

	@RequestMapping("issuenewbookpagetwo")
	public String showBookIssuePageTwo(BookIssueDetails bookIssueDetails, Model model) {
		System.out.println("in BookIssueDetailsController :: issuenewbookpagetwo ");

		MemberDetails memberDetails = memberDetailsServiceInterface
				.getMemberDetailsByMemberCode(bookIssueDetails.getMemberDetails().getMemberCode());
		bookIssueDetails.setMemberDetails(memberDetails);
		System.out.println(bookIssueDetails);
		model.addAttribute("loadedBookIssueDetails", bookIssueDetails);
		return "issuenewbookpagetwo";
	}

	@RequestMapping("issuenewbookpagethree")
	public String showBookIssuePageThree(BookIssueDetails bookIssueDetails, Model model) {
		System.out.println("in BookIssueDetailsController :: showBookIssuePageThree ");
		System.out.println(bookIssueDetails);

		MemberDetails memberDetails = memberDetailsServiceInterface
				.getMemberDetailsByMemberCode(bookIssueDetails.getMemberDetails().getMemberCode());
		bookIssueDetails.setMemberDetails(memberDetails);

		BookDetails bookDetails = bookDetailsServiceInterface
				.getBookDetailsByBookCode(bookIssueDetails.getBookDetails().getBookCode());

		bookIssueDetails.setBookDetails(bookDetails);
		bookIssueDetails.setMemberDetails(memberDetails);

		model.addAttribute("bookIssueDetails", bookIssueDetails);

		String memberType = memberDetails.getMemberType();
		LocalDate issueDate = LocalDate.now();
		LocalDate returnDate = LocalDate.now();
		if (memberType.equals("student")) {
			returnDate = returnDate.plusDays(8);
		}
		if (memberType.equals("faculty")) {
			returnDate = returnDate.plusDays(40);
		}

		bookIssueDetails.setIssueDate(issueDate);
		bookIssueDetails.setReturnDate(returnDate);

		return "issuenewbookpagethree";
	}
}
