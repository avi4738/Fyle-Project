package com.project.fyle.repository;

import java.util.List;

import com.project.fyle.model.BankBranches;

public interface BanksAndBranchesRepository {
	List<BankBranches> getBankDetails(String IFSCcode,long offset,long limit);

	List<BankBranches> getBankDetails(String name, String city, long offset, long limit);

}
