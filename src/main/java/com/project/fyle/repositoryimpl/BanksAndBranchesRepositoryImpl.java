package com.project.fyle.repositoryimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.fyle.model.BankBranches;
import com.project.fyle.repository.BanksAndBranchesRepository;

@Repository
public class BanksAndBranchesRepositoryImpl implements BanksAndBranchesRepository{
	 @Autowired
	    private EntityManager em;
	    @SuppressWarnings("unchecked")
		@Override
		public List<BankBranches> getBankDetails(String IFSCcode, long offset, long limit) {
	    	System.out.println("inside repo");
	        String query = "Select * from bank_branches where ifsc= '"+"ABHY0065056"+"'";
	        		/*"Select * from bank_branches "
	                + "where  ifsc = '"+IFSCcode+"'";*/
	        Query nativeQuery = em.createNativeQuery(query);
	        //Paginering
	        //nativeQuery.setParameter("somethingElseId", "ABHY0065056");
	        nativeQuery.setFirstResult((int) offset);
	        nativeQuery.setMaxResults((int) limit);
	        List<BankBranches> resultList = nativeQuery.getResultList();
	        System.out.println(resultList);
	        return resultList;
		}
		@Override
		public List<BankBranches> getBankDetails(String name, String city, long offset, long limit) {
			System.out.println("inside repo");
	        String query = "Select * from bank_branches where city= '"+city+"'";
	        		/*"Select * from bank_branches "
	                + "where  ifsc = '"+IFSCcode+"'";*/
	        Query nativeQuery = em.createNativeQuery(query);
	        //Paginering
	        //nativeQuery.setParameter("name", name);
	        //nativeQuery.setParameter("sec", city);
	        nativeQuery.setFirstResult((int) offset);
	        nativeQuery.setMaxResults((int) limit);
	        List<BankBranches> resultList = nativeQuery.getResultList();
	        System.out.println(resultList);
	        return resultList;
		}
	}
