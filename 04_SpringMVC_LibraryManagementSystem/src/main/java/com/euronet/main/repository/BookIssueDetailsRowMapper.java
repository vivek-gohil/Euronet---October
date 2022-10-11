package com.euronet.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.jdbc.core.RowMapper;

import com.euronet.main.domain.BookDetails;
import com.euronet.main.domain.BookIssueDetails;
import com.euronet.main.domain.MemberDetails;

public class BookIssueDetailsRowMapper implements RowMapper<BookIssueDetails> {

	@Override
	public BookIssueDetails mapRow(ResultSet rs, int rowNum) throws SQLException {

		int issueSerialNumber = rs.getInt("issue_serial_number");
		LocalDate issueDate = rs.getDate("issue_date").toLocalDate();
		LocalDate returnDate = rs.getDate("return_date").toLocalDate();

		int bookCode = rs.getInt("book_code");
		String title = rs.getString("title");
		String author = rs.getString("author");
		double price = rs.getDouble("price");
		boolean isIssuable = rs.getBoolean("is_issuable");

		BookDetails bookDetails = new BookDetails(bookCode, title, author, price, isIssuable);

		int memberCode = rs.getInt("member_code");
		String firstName = rs.getString("first_name");
		String lastName = rs.getString("last_name");
		String memberType = rs.getString("member_type");
		int bookIssueCount = rs.getInt("book_issue_count");

		MemberDetails memberDetails = new MemberDetails(memberCode, firstName, lastName, memberType, bookIssueCount);

		BookIssueDetails bookIssueDetails = new BookIssueDetails(issueSerialNumber, issueDate, returnDate, bookDetails,
				memberDetails);

		return bookIssueDetails;
	}

}
