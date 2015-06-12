package domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "catridge")
public class Catridge implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2785698204544913539L;

	@Id
	@Column(name = "idcatridge", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCatridge;

	@Column(name = "size", nullable = false)
	private int size;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "calibre_idcalibre", nullable = false)
	private Calibre calibre;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "weapon_idweapon", nullable = false)
	private Weapon weapon;

	public Catridge() {
	}

	public Catridge(int size, Calibre calibre, Weapon weapon) {
		this.size = size;
		this.calibre = calibre;
		this.weapon = weapon;
	}

	public int getIdCatridge() {
		return idCatridge;
	}

	public void setIdCatridge(int idCatridge) {
		this.idCatridge = idCatridge;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Calibre getCalibre() {
		return calibre;
	}

	public void setCalibre(Calibre calibre) {
		this.calibre = calibre;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

}
