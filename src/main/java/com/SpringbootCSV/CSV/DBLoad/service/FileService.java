package com.SpringbootCSV.CSV.DBLoad.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {

	boolean hasCsvformat(MultipartFile file);

	void processAndSaveData(MultipartFile file);

}
