package com.project.fyle.service;

import java.util.List;

import com.project.fyle.model.BankBranches;
import com.project.fyle.util.PagedResult;

public interface BanksAndBranchesService {

	PagedResult<BankBranches> getBankDetails(String iFSCcode, long offset, long limit);

	PagedResult<BankBranches> getBankDetails(String name, String city, long offset, long limit);

}
