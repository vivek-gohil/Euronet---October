package com.euronet.main.service;

import com.euronet.main.domain.MemberDetails;

public interface MemberDetailsServiceInterface {
	MemberDetails getMemberDetailsByMemberCode(int memberCode);

	boolean updateBookIssueCountByMemberCode(MemberDetails memberDetails);
}
