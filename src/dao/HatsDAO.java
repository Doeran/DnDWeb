package dao;

import java.util.List;

import domain.Hats;

public interface HatsDAO {

	public void addHats(Hats hats);

	public List<Hats> listHats();

	public void editHats(Hats hats);

	public void removeHats(int idHats);
}
