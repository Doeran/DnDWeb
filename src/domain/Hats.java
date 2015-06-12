package domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hats")
public class Hats implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -383420768935369405L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idhats", unique = true, nullable = false)
	private int idHats;

	@Column(name = "title", nullable = false, length = 45)
	private String titleOfHats;

	public Hats() {
	}

	public Hats(String titleOfHats) {
		this.titleOfHats = titleOfHats;
	}

	public int getIdHats() {
		return idHats;
	}

	public void setIdHats(int idHats) {
		this.idHats = idHats;
	}

	public String getTitleOfHats() {
		return titleOfHats;
	}

	public void setTitleOfHats(String titleOfHats) {
		this.titleOfHats = titleOfHats;
	}

}
