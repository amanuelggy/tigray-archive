package com.tigrayArchive.home.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxmind.geoip.Location;
import com.tigrayArchive.home.domains.Evidence;
import com.tigrayArchive.home.domains.Media;
import com.tigrayArchive.home.dtos.MediaDto;
import com.tigrayArchive.home.homeRepo.HomeRepo;

@Service
public class EvidenceService {
	
	@Autowired
	private HomeRepo homeRepo;

	public String saveMedia(MediaDto mediaDto) {
		Media media = new Media();
		media.setMediaFile(mediaDto.getBlob());
		Evidence evdnc = new Evidence();
		Location loc = new Location();
		evdnc.setUserLatitud(loc.latitude);
		evdnc.setUserLongitude(loc.longitude);
		evdnc.setMedia(media);
		this.homeRepo.save(evdnc);
		return "test";
	}

}
