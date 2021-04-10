package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

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
	return (List<Displayer>) DisplayerRepo.findAll();
}

@Override
public Displayer addDisplayer(Displayer u) {
	// TODO Auto-generated method stub
	DisplayerRepo.save(u);
	return u;
}

@Override
public void deleteDisplayer(String id) {
	// TODO Auto-generated method stub
	int DisplayerId=Integer.parseInt(id);
	DisplayerRepo.deleteById(DisplayerId);
}

@Override
public Displayer updateDisplayer(Displayer u) {
	// TODO Auto-generated method stub
	DisplayerRepo.save(u);
	return u;
}

@Override
public Optional<Displayer> retrieveDisplayer(String id) {
	// TODO Auto-generated method stub
	int DisplayerId=Integer.parseInt(id);
	return DisplayerRepo.findById(DisplayerId);
} 
}
