package com.euronet.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.euronet.main.domain.MemberDetails;

public class MemberDetailsRowMapper implements RowMapper<MemberDetails> {

	@Override
	public MemberDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		int memberCode = rs.getInt("member_code");
		String firstName = rs.getString("first_name");
		String lastName = rs.getString("last_name");
		String memberType = rs.getString("member_type");
		int bookIssueCount = rs.getInt("book_issue_count");

		MemberDetails memberDetails = new MemberDetails(memberCode, firstName, lastName, memberType, bookIssueCount);

		return memberDetails;
	}

}
