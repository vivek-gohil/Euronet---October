package com.euronet.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.euronet.main.domain.BookIssueDetails;
import com.euronet.main.repository.BookIssueDetailsRepositoryInterface;

@Service
public class BookIssueDetailsService implements BookIssueDetailsServiceInterface {

	@Autowired
	private BookIssueDetailsRepositoryInterface bookIssueDetailsRepositoryInterface;

	@Override
	public boolean issueNewBook(BookIssueDetails bookIssueDetails) {
		return bookIssueDetailsRepositoryInterface.issueNewBook(bookIssueDetails);
	}

	@Override
	public List<BookIssueDetails> getAllBookIssueDetails() {
		return bookIssueDetailsRepositoryInterface.getAllBookIssueDetails();
	}

}
