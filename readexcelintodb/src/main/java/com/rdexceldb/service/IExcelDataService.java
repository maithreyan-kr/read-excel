package com.rdexceldb.service;

import java.util.List;

import com.rdexceldb.model.Invoice;

public interface IExcelDataService {

	List<Invoice> getExcelDataAsList();
	
	int saveExcelData(List<Invoice> invoices);
}