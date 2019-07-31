package com.project.fyle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.fyle.model.BankBranches;
import com.project.fyle.service.BanksAndBranchesService;
import com.project.fyle.util.PagedResult;


@RestController
public class BankAndBranchesController {
	@Autowired
	private BanksAndBranchesService banksAndBranchesService; 
	
	@GetMapping("/BankDetails")
	public ResponseEntity<Object> BankDetails(@RequestParam(name="IFSCcode") String IFSCcode,@RequestParam(name = "offset") long offset,@RequestParam(name = "limit") long limit) {
	try {
		PagedResult<BankBranches> resultList=banksAndBranchesService.getBankDetails(IFSCcode,offset,limit);
	return new ResponseEntity<Object>(resultList, HttpStatus.OK);
	}catch(Exception e) {
		return new ResponseEntity<Object>("Error Occured", HttpStatus.INTERNAL_SERVER_ERROR);
	}		
	}
}
