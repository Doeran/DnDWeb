package domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sights")
public class Sights implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2634707184499513551L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idsights", unique = true, nullable = false)
	private int idSights;

	@Column(name = "title", nullable = false, length = 45)
	private String titleOfSights;

	@Column(name = "zoom", nullable = false)
	private int zoom;

	@Column(name = "extra_range", nullable = false)
	private int extraRange;

	@Column(name = "price_sights", nullable = false)
	private int priceOfSights;

	@Column(name = "weight_of_sights", nullable = false)
	private float weightOfSights;

	public Sights() {
	}

	public Sights(String titleOfSights, int zoom, int extraRange,
			int priceOfSights, float weghtOfSights) {
		this.titleOfSights = titleOfSights;
		this.zoom = zoom;
		this.extraRange = extraRange;
		this.priceOfSights = priceOfSights;
		this.weightOfSights = weghtOfSights;
	}

	public int getIdSights() {
		return idSights;
	}

	public void setIdSights(int idSights) {
		this.idSights = idSights;
	}

	public String getTitleOfSights() {
		return titleOfSights;
	}

	public void setTitleOfSights(String titleOfSights) {
		this.titleOfSights = titleOfSights;
	}

	public int getZoom() {
		return zoom;
	}

	public void setZoom(int zoom) {
		this.zoom = zoom;
	}

	public int getExtraRange() {
		return extraRange;
	}

	public void setExtraRange(int extraRange) {
		this.extraRange = extraRange;
	}

	public int getPriceOfSights() {
		return priceOfSights;
	}

	public void setPriceOfSights(int priceOfSights) {
		this.priceOfSights = priceOfSights;
	}

	public float getWeightOfSights() {
		return weightOfSights;
	}

	public void setWeightOfSights(float weightOfSights) {
		this.weightOfSights = weightOfSights;
	}

}
