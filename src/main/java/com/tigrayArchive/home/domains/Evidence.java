package com.tigrayArchive.home.domains;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Table(name="EVDNS")
public class Evidence {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="EVDNC_ID")
	private Long evidenceId;
	
	@Column(name="MEDIA_PATH")
	private String mediaPath;
	
	@Column(name="MEDIA_LATITUDE")
	private Float mediaLatitude;
	
	@Column(name="MEDIA_LONGITUD")
	private Float mediaLongtitud;
	
	@Column(name="MEDIA_LATITUD")
	private Float userLatitud;
	
	@Column(name="MEDIA_LONGITUDE")
	private Float userLongitude;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="MEDIA_ID")
	private Media media;
	
	@ManyToOne
	@JoinColumn(name="ACCT_ID")
	private Account account;
	
	@Column(name="CREATED_AT")
	private Date createdAt;
	
	@Column(name="UPDATED_AT")
	private Date updatedAt;
	
	public Evidence() {
		
	}

	public Long getEvidenceId() {
		return evidenceId;
	}

	public void setEvidenceId(Long evidenceId) {
		this.evidenceId = evidenceId;
	}

	public String getMediaPath() {
		return mediaPath;
	}

	public void setMediaPath(String mediaPath) {
		this.mediaPath = mediaPath;
	}

	public float getMediaLatitude() {
		return mediaLatitude;
	}

	public void setMediaLatitude(float latitude) {
		this.mediaLatitude = latitude;
	}

	public float getMediaLongtitud() {
		return mediaLongtitud;
	}

	public void setMediaLongtitud(float longitude) {
		this.mediaLongtitud = longitude;
	}

	public float getUserLatitud() {
		return userLatitud;
	}

	public void setUserLatitud(float userLatitud) {
		this.userLatitud = userLatitud;
	}

	public float getUserLongitude() {
		return userLongitude;
	}

	public void setUserLongitude(float userLongitude) {
		this.userLongitude = userLongitude;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Media getMedia() {
		return media;
	}

	public void setMedia(Media media) {
		this.media = media;
	}

	public void setMediaLatitude(Float mediaLatitude) {
		this.mediaLatitude = mediaLatitude;
	}

	public void setMediaLongtitud(Float mediaLongtitud) {
		this.mediaLongtitud = mediaLongtitud;
	}

	public void setUserLatitud(Float userLatitud) {
		this.userLatitud = userLatitud;
	}

	public void setUserLongitude(Float userLongitude) {
		this.userLongitude = userLongitude;
	}

	@Override
	public String toString() {
		return "Evidence [evidenceId=" + evidenceId + ", mediaPath=" + mediaPath + ", mediaLatitude=" + mediaLatitude
				+ ", mediaLongtitud=" + mediaLongtitud + ", userLatitud=" + userLatitud + ", userLongitude="
				+ userLongitude + ", account=" + account + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ "]";
	}
	
}
