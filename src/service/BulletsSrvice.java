package service;

import java.util.List;

import domain.Bullets;

public interface BulletsSrvice {

	public void addBullet(Bullets bullet);

	public List<Bullets> listBullets();

	public void editByllets(Bullets bullet);

	public void removeBullet(String calibre);
}
