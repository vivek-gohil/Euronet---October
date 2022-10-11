package com.euronet.main.repository;

import java.util.List;

import com.euronet.main.domain.BookIssueDetails;

public interface BookIssueDetailsRepositoryInterface {
	boolean issueNewBook(BookIssueDetails bookIssueDetails);

	List<BookIssueDetails> getAllBookIssueDetails();

}
