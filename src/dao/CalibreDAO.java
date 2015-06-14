package dao;

import java.util.List;

import domain.Calibre;

public interface CalibreDAO {

	public void addCalibre(Calibre calibre);

	public List<Calibre> listCalibre();

	public void editCalibre(Calibre calibre);

	public void removeBullet(int idCalibre);
}
