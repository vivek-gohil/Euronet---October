package com.euronet.main.domain;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BookIssueDetails {
	private int issueSerialNumber;
	private LocalDate issueDate;
	private LocalDate returnDate;

	private BookDetails bookDetails;

	private MemberDetails memberDetails;

	public BookIssueDetails() {
		System.out.println("Default Constructor Of BookIssueDetails()");
	}

	public BookIssueDetails(int issueSerialNumber, LocalDate issueDate, LocalDate returnDate, BookDetails bookDetails,
			MemberDetails memberDetails) {
		System.out.println("Parameterized Constructor Of BookIssueDetails()");
		this.issueSerialNumber = issueSerialNumber;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
		this.bookDetails = bookDetails;
		this.memberDetails = memberDetails;
	}

	public int getIssueSerialNumber() {
		System.out.println("getIssueSerialNumber()");
		return issueSerialNumber;
	}

	public void setIssueSerialNumber(int issueSerialNumber) {
		System.out.println("setIssueSerialNumber() " + issueSerialNumber);
		this.issueSerialNumber = issueSerialNumber;
	}

	public LocalDate getIssueDate() {
		System.out.println("getIssueDate()");
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		System.out.println("setIssueDate() " + issueDate);
		this.issueDate = issueDate;
	}

	public LocalDate getReturnDate() {
		System.out.println("getReturnDate()");
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		System.out.println("setReturnDate() " + returnDate);
		this.returnDate = returnDate;
	}

	public BookDetails getBookDetails() {
		System.out.println("getBookDetails()");
		return bookDetails;
	}

	@Autowired
	public void setBookDetails(BookDetails bookDetails) {
		System.out.println("setBookDetails() " + bookDetails);
		this.bookDetails = bookDetails;
	}

	public MemberDetails getMemberDetails() {
		System.out.println("getMemberDetails()");
		return memberDetails;
	}

	@Autowired
	public void setMemberDetails(MemberDetails memberDetails) {
		System.out.println("setMemberDetails() " + memberDetails);
		this.memberDetails = memberDetails;
	}

	@Override
	public String toString() {
		return "BookIssueDetails [issueSerialNumber=" + issueSerialNumber + ", issueDate=" + issueDate + ", returnDate="
				+ returnDate + ", bookDetails=" + bookDetails + ", memberDetails=" + memberDetails + "]";
	}

}
