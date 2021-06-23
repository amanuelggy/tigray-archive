package com.tigrayArchive.home.domains;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="MEDIA")
public class Media {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="MEDIA_ID")
	private Long mediaId;
	
	@Column(name="MEDIA_FILE")
	private Blob mediaFile;
	
	@OneToOne(mappedBy="EVDNC_ID")
	private Evidence evidence;
	
	public Media() {
		
	}

	public Long getMediaId() {
		return mediaId;
	}

	public void setMediaId(Long mediaId) {
		this.mediaId = mediaId;
	}

	public Blob getMediaFile() {
		return mediaFile;
	}

	public void setMediaFile(Blob mediaFile) {
		this.mediaFile = mediaFile;
	}

	public Evidence getEvidence() {
		return evidence;
	}

	public void setEvidence(Evidence evidence) {
		this.evidence = evidence;
	}

	@Override
	public String toString() {
		return "Media [mediaId=" + mediaId + ", mediaFile=" + mediaFile + ", account=" + evidence + "]";
	}
	
}
