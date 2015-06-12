package domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Ammo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -555363683806283762L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idammo", unique = true, nullable = false)
	private int idAmmo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "calibre_idcalibre", nullable = false)
	private Calibre calibre;

	@Column(name = "title", nullable = false, length = 45)
	private String title;

	@Column(name = "bonus_damage", nullable = false)
	private int bonusDamage;

	@Column(name = "bonus_critical", nullable = false)
	private int bonusCritical;

	@Column(name = "ammo_penetration", nullable = false)
	private float ammoPenetration;

	@Column(name = "weight_of_bullet", nullable = false)
	private float weightOfBullet;

	@Column(name = "price_ammo", nullable = false)
	private int priceAmmo;

	public Ammo() {
	}

	public Ammo(Calibre calibre, String title, int bonusDamage,
			int bonusCritical, float ammoPenetration, float weightOfBullet,
			int priceAmmo) {
		this.calibre = calibre;
		this.title = title;
		this.bonusDamage = bonusDamage;
		this.bonusCritical = bonusCritical;
		this.ammoPenetration = ammoPenetration;
		this.weightOfBullet = weightOfBullet;
		this.priceAmmo = priceAmmo;

	}

	public int getIdAmmo() {
		return idAmmo;
	}

	public void setIdAmmo(int idAmmo) {
		this.idAmmo = idAmmo;
	}

	public Calibre getCalibre() {
		return calibre;
	}

	public void setCalibre(Calibre calibre) {
		this.calibre = calibre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getBonusDamage() {
		return bonusDamage;
	}

	public void setBonusDamage(int bonusDamage) {
		this.bonusDamage = bonusDamage;
	}

	public int getBonusCritical() {
		return bonusCritical;
	}

	public void setBonusCritical(int bonusCritical) {
		this.bonusCritical = bonusCritical;
	}

	public float getAmmoPenetration() {
		return ammoPenetration;
	}

	public void setAmmoPenetration(float ammoPenetration) {
		this.ammoPenetration = ammoPenetration;
	}

	public float getWeightOfBullet() {
		return weightOfBullet;
	}

	public void setWeightOfBullet(float weightOfBullet) {
		this.weightOfBullet = weightOfBullet;
	}

	public int getPriceAmmo() {
		return priceAmmo;
	}

	public void setPriceAmmo(int priceAmmo) {
		this.priceAmmo = priceAmmo;
	}

}
