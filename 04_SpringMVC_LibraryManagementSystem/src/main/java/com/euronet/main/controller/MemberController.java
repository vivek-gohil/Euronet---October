package com.euronet.main.controller;

import org.apache.tomcat.util.log.UserDataHelper.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.euronet.main.domain.MemberDetails;
import com.euronet.main.service.MemberDetailsServiceInterface;

@Controller
public class MemberController {

	@Autowired
	private MemberDetailsServiceInterface memberDetailsServiceInterface;

	@RequestMapping("memberbymembercode")
	public String showGetMemberByMemberCode(Model model) {
		MemberDetails memberDetails = new MemberDetails();
		model.addAttribute("memberDetails", memberDetails);
		return "getmembersdetails";
	}

	@RequestMapping("showmemberdetails")
	public String showMemberDetails(MemberDetails memberDetails, Model model) {
		memberDetails = memberDetailsServiceInterface.getMemberDetailsByMemberCode(memberDetails.getMemberCode());
		System.out.println(memberDetails);
		model.addAttribute("memberDetails", memberDetails);
		return "showmemberdetails";
	}

	@RequestMapping("updatecountbymembercode")
	public String showUpdateCountByMemberCodePage(Model model) {
		MemberDetails memberDetails = new MemberDetails();
		model.addAttribute("memberDetails", memberDetails);
		return "updatebookissuecount";
	}

	@RequestMapping("updateissuecount")
	public String updateIssueCount(MemberDetails memberDetails) {
		memberDetailsServiceInterface.updateBookIssueCountByMemberCode(memberDetails);
		return "updatesuccess";
	}

}
