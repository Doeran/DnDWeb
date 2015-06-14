package dao;

import java.util.List;

public interface ArmorDAO {

	public void addArmor(ArmorDAO armor);

	public List<ArmorDAO> listArmor();

	public void editArmor(ArmorDAO armor);

	public void removeArmor(int idArmor);
}
