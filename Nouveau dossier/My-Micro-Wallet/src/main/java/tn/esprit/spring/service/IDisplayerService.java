package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.dao.entity.Dialogue_Room;
import tn.esprit.spring.dao.entity.Displayer;

public interface IDisplayerService {
	List<Displayer> retrieveAllDisplayers();
	Displayer addDisplayer(Displayer u);
	void deleteDisplayer(String id);
	Displayer updateDisplayer(Displayer u);
	Displayer retrieveDisplayer(String id);
}
