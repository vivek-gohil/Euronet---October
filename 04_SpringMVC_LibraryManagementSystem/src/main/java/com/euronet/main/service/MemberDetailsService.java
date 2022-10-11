package com.euronet.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.euronet.main.domain.MemberDetails;
import com.euronet.main.repository.MemberDetailsRepositoryInterface;

@Service
public class MemberDetailsService implements MemberDetailsServiceInterface {

	@Autowired
	private MemberDetailsRepositoryInterface memberDetailsRepositoryInterface;

	@Override
	public MemberDetails getMemberDetailsByMemberCode(int memberCode) {
		return memberDetailsRepositoryInterface.getMemberDetailsByMemberCode(memberCode);
	}

	@Override
	public boolean updateBookIssueCountByMemberCode(MemberDetails memberDetails) {
		return memberDetailsRepositoryInterface.updateBookIssueCountByMemberCode(memberDetails);
	}

}
