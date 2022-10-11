package com.euronet.main.repository;

import com.euronet.main.domain.MemberDetails;

public interface MemberDetailsRepositoryInterface {
	MemberDetails getMemberDetailsByMemberCode(int memberCode);

	boolean updateBookIssueCountByMemberCode(MemberDetails memberDetails);
}
