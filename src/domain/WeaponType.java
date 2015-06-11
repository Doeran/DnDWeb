package domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "weapon_type")

public class WeaponType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3345400111550089341L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "idweapon_type", nullable = false, unique = true)
	private int idWeaponType;
	
	@Column (name = "title", nullable = false, length = 45)
	private String title;
	
	public WeaponType (){
		
	}
	
	public WeaponType (String title){
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
