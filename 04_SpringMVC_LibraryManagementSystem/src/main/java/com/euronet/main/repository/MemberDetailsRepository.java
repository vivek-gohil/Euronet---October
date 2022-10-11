package com.euronet.main.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.euronet.main.domain.MemberDetails;

@Repository
public class MemberDetailsRepository implements MemberDetailsRepositoryInterface {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String GET_MEMBER_DETAILS_BY_MEMBER_CODE = "select * from member_details where member_code = ?";
	private static final String UPDATE_BOOK_ISSUE_COUNT_BY_MEMBER_CODE = "update member_details set book_issue_count = book_issue_count + 1 where member_code = ?";

	@Override
	public MemberDetails getMemberDetailsByMemberCode(int memberCode) {
		MemberDetails memberDetails = jdbcTemplate.queryForObject(GET_MEMBER_DETAILS_BY_MEMBER_CODE,
				new MemberDetailsRowMapper(), memberCode);
		return memberDetails;
	}

	@Override
	public boolean updateBookIssueCountByMemberCode(MemberDetails memberDetails) {
		int count = jdbcTemplate.update(UPDATE_BOOK_ISSUE_COUNT_BY_MEMBER_CODE, memberDetails.getMemberCode());
		if (count > 0)
			return true;
		return false;
	}

}
