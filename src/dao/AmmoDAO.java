package dao;

import java.util.List;

import domain.Ammo;

public interface AmmoDAO {

	public void addAmmo(Ammo ammo);

	public List<Ammo> listAmmo();

	public void editAmmo(Ammo ammo);

	public void removeAmmo(int idAmmo);
}
