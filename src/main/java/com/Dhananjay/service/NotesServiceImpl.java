package com.Dhananjay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.Dhananjay.entity.Notes;
import com.Dhananjay.entity.User;
import com.Dhananjay.repository.NotesRepository;

@Service
public class NotesServiceImpl implements NotesService{
	
	@Autowired
	private NotesRepository noteRepository;
	

	@Override
	public Notes saveNotes(Notes notes) {
		// TODO Auto-generated method stub
		return noteRepository.save(notes);
	}

	@Override
	public Notes getNotesById(int id) {
		// TODO Auto-generated method stub
		return noteRepository.findById(id).get();
	}

	@Override
	public Page<Notes>  getNotesByUser(User user, int pageNo) {
		// TODO Auto-generated method stub
		PageRequest pageable= PageRequest.of(pageNo, 5);
		return noteRepository.findByUser(user,pageable);
	}

	@Override
	public Notes updateNotes(Notes notes) {
		// TODO Auto-generated method stub
		return noteRepository.save(notes);
	}

	@Override
	public boolean deleteNotes(int id) {
		// TODO Auto-generated method stub
		Notes notes = noteRepository.findById(id).get();
		if(notes!=null)
		{
			noteRepository.delete(notes);
			return true;
		}
		return false ;
	}

}
