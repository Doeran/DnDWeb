package service;

import java.util.List;

import domain.Calibre;;

public interface calibreService {

	public void addCalibre(Calibre calibre);

	public List<Calibre> listcalibre();

	public void editCalibre(Calibre calibre);

	//public void removeBullet(String calibre);
}
