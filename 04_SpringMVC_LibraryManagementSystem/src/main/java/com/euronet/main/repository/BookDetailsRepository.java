package com.euronet.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.euronet.main.domain.BookDetails;

@Repository
public class BookDetailsRepository implements BookDetailsRepositoryInterface {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String ADD_NEW_BOOK_DETAILS = "insert into book_details(title,author,price,is_issuable) values(?,?,?,?)";
	private static final String GET_SINGLE_BOOK_BY_BOOK_CODE = "select * from book_details where book_code = ?";
	private static final String UPDATE_BOOK_ISSUE_STATUS_BY_BOOK_CODE = "update book_details set is_issuable = ? where book_code = ?";
	private static final String GET_ALL_BOOK_DETAILS = "select * from book_details";

	@Override
	public boolean addNewBookDetails(BookDetails bookDetails) {
		Object[] params = { bookDetails.getTitle(), bookDetails.getAuthor(), bookDetails.getPrice(),
				bookDetails.getIsIssuable() };
		int count = jdbcTemplate.update(ADD_NEW_BOOK_DETAILS, params);
		if (count > 0)
			return true;
		return false;
	}

	@Override
	public BookDetails getBookDetailsByBookCode(int bookCode) {

		BookDetails bookDetails = jdbcTemplate.queryForObject(GET_SINGLE_BOOK_BY_BOOK_CODE, new BookDetailsRowMapper(),
				bookCode);

		return bookDetails;
	}

	@Override
	public boolean updateIssueStatusByBookCode(BookDetails bookDetails) {
		Object[] params = { bookDetails.getIsIssuable(), bookDetails.getBookCode() };
		int count = jdbcTemplate.update(UPDATE_BOOK_ISSUE_STATUS_BY_BOOK_CODE, params);
		if (count > 0)
			return true;
		return false;
	}

	@Override
	public List<BookDetails> getAllBookDetails() {
		List<BookDetails> allBooks = jdbcTemplate.query(GET_ALL_BOOK_DETAILS, new BookDetailsRowMapper());
		return allBooks;
	}

}
