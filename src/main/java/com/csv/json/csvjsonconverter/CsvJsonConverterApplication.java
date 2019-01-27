package com.csv.json.csvjsonconverter;

import javax.annotation.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.csv.json.uploadfiles.storage.StorageService;

@ComponentScan(basePackages = {"com.csv.json.uploadfiles.storage", "com.csv.json.uploadfiles.controller"})
@SpringBootApplication
public class CsvJsonConverterApplication {

	@Resource
	StorageService storageService;
	
	public static void main(String[] args) {
		SpringApplication.run(CsvJsonConverterApplication.class, args);
	}

	public void run(String... arg) throws Exception {
		storageService.deleteAll();
		storageService.init();
	}
}

