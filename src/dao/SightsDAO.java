package dao;

import java.util.List;

import domain.Sights;

public interface SightsDAO {

	public void addSi(Sights sights);

	public List<Sights> listSights();

	public void editSight(Sights sight);

	public void removeSight(int idSights);
}
