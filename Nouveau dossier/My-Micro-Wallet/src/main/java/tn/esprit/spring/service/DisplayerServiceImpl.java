package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.dao.entity.Displayer;
import tn.esprit.spring.dao.repository.DisplayerRepository;

@Service
public class DisplayerServiceImpl implements IDisplayerService {
@Autowired
DisplayerRepository DisplayerRepo;

@Override
public List<Displayer> retrieveAllDisplayers() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Displayer addDisplayer(Displayer u) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deleteDisplayer(String id) {
	// TODO Auto-generated method stub
	
}

@Override
public Displayer updateDisplayer(Displayer u) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Displayer retrieveDisplayer(String id) {
	// TODO Auto-generated method stub
	return null;
} 
}
