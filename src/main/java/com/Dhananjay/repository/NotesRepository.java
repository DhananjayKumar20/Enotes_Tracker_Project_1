package com.Dhananjay.repository;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Dhananjay.entity.Notes;
import com.Dhananjay.entity.User;

public interface NotesRepository extends JpaRepository<Notes, Integer>{

	public Page<Notes> findByUser(User user,Pageable pageable);
}
