package com.example.fantasyhnl.club;

import java.util.Objects;

public class Club {
	private int id;
	private String name;
	private String code;
	private String country;
	private int founded;
	private boolean national;
	private String logo;
	
	public Club(int id, String name, String code, String country, int founded, boolean national, String logo) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.country = country;
		this.founded = founded;
		this.national = national;
		this.logo = logo;
	}
	
	public ClubDto toClubDto() {
		return new ClubDto(id, name, code, country, founded, national, logo);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public String getCountry() {
		return country;
	}

	public int getFounded() {
		return founded;
	}

	public boolean isNational() {
		return national;
	}

	public String getLogo() {
		return logo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, country, founded, id, logo, name, national);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Club other = (Club) obj;
		return Objects.equals(code, other.code) && Objects.equals(country, other.country)
				&& Objects.equals(founded, other.founded) && id == other.id && Objects.equals(logo, other.logo)
				&& Objects.equals(name, other.name) && national == other.national;
	}

	@Override
	public String toString() {
		return "Club [id=" + id + ", name=" + name + ", code=" + code + ", country=" + country + ", founded=" + founded
				+ ", national=" + national + ", logo=" + logo + "]";
	}
	
	
}
