package com.tigrayArchive.home.dtos;

import java.sql.Blob;

public class MediaDto {

	private String mediaTitle;
	private Blob blob;
	
	public MediaDto() {
		
	}

	public String getMediaTitle() {
		return mediaTitle;
	}

	public void setMediaTitle(String mediaTitle) {
		this.mediaTitle = mediaTitle;
	}

	public Blob getBlob() {
		return blob;
	}

	public void setBlob(Blob blob) {
		this.blob = blob;
	}

	@Override
	public String toString() {
		return "MediaDto [mediaTitle=" + mediaTitle + ", blob=" + blob + "]";
	}
	
}
