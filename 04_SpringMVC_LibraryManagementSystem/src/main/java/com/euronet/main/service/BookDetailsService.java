package com.euronet.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.euronet.main.domain.BookDetails;
import com.euronet.main.repository.BookDetailsRepository;
import com.euronet.main.repository.BookDetailsRepositoryInterface;

@Service
public class BookDetailsService implements BookDetailsServiceInterface {

	@Autowired
	private BookDetailsRepositoryInterface bookDetailsRepositoryInterface;

	@Override
	public boolean addNewBookDetails(BookDetails bookDetails) {
		return bookDetailsRepositoryInterface.addNewBookDetails(bookDetails);
	}

	@Override
	public BookDetails getBookDetailsByBookCode(int bookCode) {
		return bookDetailsRepositoryInterface.getBookDetailsByBookCode(bookCode);
	}

	@Override
	public boolean updateIssueStatusByBookCode(BookDetails bookDetails) {
		return bookDetailsRepositoryInterface.updateIssueStatusByBookCode(bookDetails);
	}

	@Override
	public List<BookDetails> getAllBookDetails() {
		return bookDetailsRepositoryInterface.getAllBookDetails();
	}

}
