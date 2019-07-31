package com.project.fyle.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.fyle.model.BankBranches;
import com.project.fyle.repository.BanksAndBranchesRepository;
import com.project.fyle.service.BanksAndBranchesService;
import com.project.fyle.util.PagedResult;

@Service("banksAndBranchesService")
public class BanksAndBranchesServiceImpl implements BanksAndBranchesService {

	@Autowired
	private BanksAndBranchesRepository banksAndBranchesRepository; 
	@Override
	public PagedResult<BankBranches> getBankDetails(String iFSCcode, long offset,long limit) {
		List<BankBranches> resultList= banksAndBranchesRepository.getBankDetails(iFSCcode, offset, limit);
		return new PagedResult<BankBranches>(resultList,offset,limit,resultList.size());
	    }

}
