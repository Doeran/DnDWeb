package domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "calibre")
public class Calibre implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "idcalibre", unique = true, nullable = false)
	private int idCalibre;
	
	@Column (name = "calibre", nullable = false )
	private float calibre;


	@Column (name = "sleeve_length", nullable = false)
	private int sleeveLength;
	
	
	@Column (name = "title", nullable = false)
	private String title;
	
	@OneToMany (cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "calibre")
	public List <Weapon> weapons;
	
	
	public Calibre () {
	}
	
	public Calibre (int idCalibre, float calibre, int sleeveLength, String title) {
		this.idCalibre=idCalibre;
		this.calibre=calibre;
		this.sleeveLength=sleeveLength;
		this.title=title;
	}

	public int getIdCalibre() {
		return idCalibre;
	}

	public void setIdCalibre(int idCalibre) {
		this.idCalibre = idCalibre;
	}

	public float getCalibre() {
		return calibre;
	}

	public void setCalibre(float calibre) {
		this.calibre = calibre;
	}

	public int getSleeveLength() {
		return sleeveLength;
	}

	public void setSleeveLength(int sleeveLength) {
		this.sleeveLength = sleeveLength;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Weapon> getWeapons() {
		return weapons;
	}

	public void setWeapons(List<Weapon> weapons) {
		this.weapons = weapons;
	}

	
}
