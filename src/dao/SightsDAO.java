package dao;

import java.util.List;

import domain.Sights;

public interface SightsDAO {

	public void addSight(Sights sights);

	public List<Sights> listSights();

	public void editSight(Sights sight);

	public void removeSight(int idSights);
}
