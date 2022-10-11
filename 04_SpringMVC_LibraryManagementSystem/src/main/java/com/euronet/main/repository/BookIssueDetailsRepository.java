package com.euronet.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.euronet.main.domain.BookIssueDetails;

@Repository
public class BookIssueDetailsRepository implements BookIssueDetailsRepositoryInterface {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String ISSUE_NEW_BOOK = "insert into book_issue_details(issue_date,return_date,book_code,member_code) values(?,?,?,?)";
	private static final String GET_ALL_BOOK_ISSUE_DETAILS = "select "
			+ "	bid.issue_serial_number , bid.issue_date , bid.return_date , "
			+ "	bd.book_code , bd.title , bd.author,  bd.price, bd.is_issuable , "
			+ "    md.member_code , md.first_name , md.last_name , md.member_type , md.book_issue_count " + "from "
			+ "	book_issue_details bid " + "    join book_details bd " + "    join member_details md " + "on "
			+ "	bid.book_code = bd.book_code " + "	and " + "    bid.member_code = md.member_code;" + "";

	@Override
	public boolean issueNewBook(BookIssueDetails bookIssueDetails) {
		Object[] params = { bookIssueDetails.getIssueDate(), bookIssueDetails.getReturnDate(),
				bookIssueDetails.getBookDetails().getBookCode(), bookIssueDetails.getMemberDetails().getMemberCode() };
		int count = jdbcTemplate.update(ISSUE_NEW_BOOK, params);
		if (count > 0)
			return true;
		return false;
	}

	@Override
	public List<BookIssueDetails> getAllBookIssueDetails() {
		List<BookIssueDetails> allBookIssueDetails = jdbcTemplate.query(GET_ALL_BOOK_ISSUE_DETAILS,
				new BookIssueDetailsRowMapper());

		return allBookIssueDetails;
	}

}
