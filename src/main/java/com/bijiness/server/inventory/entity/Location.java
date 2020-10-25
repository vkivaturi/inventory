package com.bijiness.server.inventory.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author vijay
 * 
 * Location is a physical facility or corporate office where some business actions and other entities are linked to
 *
 */
@Entity
public class Location {
	
	@GeneratedValue
	@Id
	private UUID id;
	private String locationCode;
	private String locationStatus;
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	private String locality;
	private String city;
	private String district;
	private String state;
	private String postalCode;
	private String notes;
	private String locationType;	
	
	public Location() {
		super();
	}
	
	public Location(UUID id, String locationCode, String locationStatus, String addressLine1, String addressLine2,
			String addressLine3, String locality, String city, String district, String state, String postalCode,
			String notes, String locationType) {
		super();
		this.id = id;
		this.locationStatus = locationStatus;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.locality = locality;
		this.city = city;
		this.district = district;
		this.state = state;
		this.postalCode = postalCode;
		this.notes = notes;
		this.locationType = locationType;
	}

	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getLocationStatus() {
		return locationStatus;
	}

	public void setLocationStatus(String locationStatus) {
		this.locationStatus = locationStatus;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", locationCode=" + locationCode + ", locationStatus=" + locationStatus
				+ ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", addressLine3=" + addressLine3
				+ ", locality=" + locality + ", city=" + city + ", district=" + district + ", state=" + state
				+ ", postalCode=" + postalCode + ", notes=" + notes + ", locationType=" + locationType + "]";
	}

}
