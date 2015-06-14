package dao;

import java.util.List;

import domain.Helmets;

public interface HelmetsDAO {

	public void addHelmets(Helmets helmets);

	public List<Helmets> listHelmets();

	public void editHelmets(Helmets helmets);

	public void removeHelmet(int idHelmets);
}
