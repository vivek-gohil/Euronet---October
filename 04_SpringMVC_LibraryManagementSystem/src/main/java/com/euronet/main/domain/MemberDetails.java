package com.euronet.main.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MemberDetails {
	private int memberCode;
	private String firstName;
	private String lastName;
	private String memberType;
	private int bookIssueCount;

	public MemberDetails() {
		System.out.println("Default Constructor Of MemberDetails()");
	}

	public MemberDetails(int memberCode, String firstName, String lastName, String memberType, int bookIssueCount) {
		System.out.println("Parameterized Constructor Of MemberDetails()");
		this.memberCode = memberCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.memberType = memberType;
		this.bookIssueCount = bookIssueCount;
	}

	public int getMemberCode() {
		System.out.println("getMemberCode()");
		return memberCode;
	}

	public void setMemberCode(int memberCode) {
		System.out.println("setMemberCode() " + memberCode);
		this.memberCode = memberCode;
	}

	public String getFirstName() {
		System.out.println("getFirstName()");
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("getFirstName() " + firstName);
		this.firstName = firstName;
	}

	public String getLastName() {
		System.out.println("getLastName()");
		return lastName;
	}

	public void setLastName(String lastName) {
		System.out.println("setLastName() " + lastName);
		this.lastName = lastName;
	}

	public String getMemberType() {
		System.out.println("getMemberType() ");
		return memberType;
	}

	public void setMemberType(String memberType) {
		System.out.println("setMemberType() " + memberType);
		this.memberType = memberType;
	}

	public int getBookIssueCount() {
		System.out.println("getBookIssueCount()");
		return bookIssueCount;
	}

	public void setBookIssueCount(int bookIssueCount) {
		System.out.println("setBookIssueCount() " + bookIssueCount);
		this.bookIssueCount = bookIssueCount;
	}

	@Override
	public String toString() {
		return "MemberDetails [memberCode=" + memberCode + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", memberType=" + memberType + ", bookIssueCount=" + bookIssueCount + "]";
	}
}
