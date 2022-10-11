package com.euronet.main.service;

import java.util.List;

import com.euronet.main.domain.BookDetails;

public interface BookDetailsServiceInterface {
	boolean addNewBookDetails(BookDetails bookDetails);

	BookDetails getBookDetailsByBookCode(int bookCode);

	boolean updateIssueStatusByBookCode(BookDetails bookDetails);

	List<BookDetails> getAllBookDetails();
}
