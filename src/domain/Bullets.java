package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bullets")
public class Bullets {

	@Id
	@GeneratedValue
	@Column(name = "idbullets")
	private int idBullets;

	@Column(name = "bonus_damage")
	private int bulletsBonusDamage;

	@Column(name = "bonus_critical")
	private int bulletsBonusCritical;

	public int getIdBullets() {
		return idBullets;
	}

	public void setIdBullets(int idBullets) {
		this.idBullets = idBullets;
	}

	public int getBulletsBonusDamage() {
		return bulletsBonusDamage;
	}

	public void setBulletsBonusDamage(int bulletsBonusDamage) {
		this.bulletsBonusDamage = bulletsBonusDamage;
	}

	public int getBulletsBonusCritical() {
		return bulletsBonusCritical;
	}

	public void setBulletsBonusCritical(int bulletsBonusCritical) {
		this.bulletsBonusCritical = bulletsBonusCritical;
	}
}
