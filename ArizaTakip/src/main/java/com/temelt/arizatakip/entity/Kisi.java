package com.temelt.arizatakip.entity;

/**
 * 
 * @author I��l
 *
 */
public class Kisi extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2372710385278536291L;
	private Long id;
	private String ad;
	private String soyad;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

}
