package com.maha.crawler.google.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.bzfree.bzekbox.data.Box;
import com.bzfree.bzekbox.data.BoxParam;
import com.maha.crawler.google.dao.GoogleCrawlerDAO;

@Service
public class GoogleCrawlerServiceImpl implements GoogleCrawlerService {
	
	private static Logger logger = Logger.getLogger(GoogleCrawlerServiceImpl.class);
	
	
	@Resource
	private GoogleCrawlerDAO googleCrawlerDAO;

	public Box getUserData(BoxParam param) throws Exception {
		// TODO Auto-generated method stub
		return googleCrawlerDAO.getUserData(param);
	}
	
	public int regeditUser(BoxParam param) throws Exception {
		return googleCrawlerDAO.regeditUser(param);
	}
	
	public void regeditUserAccount(BoxParam param) throws Exception {
		googleCrawlerDAO.regeditUserAccount(param);
	}
	
	public void insertGoogleData(BoxParam param) throws Exception {
		googleCrawlerDAO.insertGoogleData(param);
	}
	
	public void insertNonDefiniteData(BoxParam param) throws Exception {
		param.put("dataType", "gmail");
		logger.info("gmail::  " + param.getString("data"));
		googleCrawlerDAO.insertNonDefiniteData(param);
	}
}
	
