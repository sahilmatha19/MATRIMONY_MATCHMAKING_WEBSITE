package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bean.Membership;
import com.dao.MembershipRepository;

@Service
public class MembershipService {
	
	@Autowired
	private MembershipRepository memRepo;

    public Membership addMembership(Membership membership) {
        return memRepo.save(membership);
    }
    
    public int updateMemByType(Membership membership, String memType) {
    	
    	membership.setMemType(memType);
    	memRepo.save(membership);
    	return 1;
    }

    public ResponseEntity<Void> deleteMembership(int memid) {
        try {
			if (!memRepo.existsById(memid)) {
			    return ResponseEntity.notFound().build();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        memRepo.deleteById(memid);
        return ResponseEntity.noContent().build();
    }
    
    public List<Membership> getAllMembership() {
        return memRepo.findAll();
    }

    public ResponseEntity<Membership> getMembershipById(Integer memid) {
        Optional<Membership> membership = memRepo.findById(memid);
        return membership.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

}
