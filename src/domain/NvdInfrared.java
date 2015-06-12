package domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nvd_infrared")
public class NvdInfrared implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6793942001032714741L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idNVD_infrared", unique = true, nullable = false)
	private int idNVDInfrared;

	@Column(name = "title", nullable = false)
	private String titleOfNVDInfrared;

	@Column(name = "range_of_visibility", nullable = false)
	private int rangeOfVisibility;

	@Column(name = "weight_NVD", nullable = false)
	private float weightOfNVDInfrared;

	@Column(name = "price_NVD", nullable = false)
	private int priceOfNVDInrfared;

	public NvdInfrared() {
	}

	public NvdInfrared(String titleOfNVDInfrared, int rangeOfVisibility,
			float weightOfNVDInfrared, int priceOfNVDInfrared) {
		this.titleOfNVDInfrared = titleOfNVDInfrared;
		this.rangeOfVisibility = rangeOfVisibility;
		this.weightOfNVDInfrared = weightOfNVDInfrared;
		this.priceOfNVDInrfared = priceOfNVDInfrared;
	}

	public int getIdNVDInfrared() {
		return idNVDInfrared;
	}

	public void setIdNVDInfrared(int idNVDInfrared) {
		this.idNVDInfrared = idNVDInfrared;
	}

	public String getTitleOfNVDInfrared() {
		return titleOfNVDInfrared;
	}

	public void setTitleOfNVDInfrared(String titleOfNVDInfrared) {
		this.titleOfNVDInfrared = titleOfNVDInfrared;
	}

	public float getRangeOfVisibility() {
		return rangeOfVisibility;
	}

	public void setRangeOfVisibility(int rangeOfVisibility) {
		this.rangeOfVisibility = rangeOfVisibility;
	}

	public float getWeightOfNVDInfrared() {
		return weightOfNVDInfrared;
	}

	public void setWeightOfNVDInfrared(float weightOfNVDInfrared) {
		this.weightOfNVDInfrared = weightOfNVDInfrared;
	}

	public int getPriceOfNVDInrfared() {
		return priceOfNVDInrfared;
	}

	public void setPriceOfNVDInrfared(int priceOfNVDInrfared) {
		this.priceOfNVDInrfared = priceOfNVDInrfared;
	}

}
