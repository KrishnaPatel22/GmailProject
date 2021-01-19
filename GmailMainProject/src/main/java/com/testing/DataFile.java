package com.testing;

public interface DataFile {

	Xls_Reader d = new Xls_Reader("F:\\GmailMainProject\\ProjectData\\testData.xlsx");
	
	public String URL = d.getCellData("URL", 1, 1);
	

	public String email = d.getCellData("SearchData", 1, 1);
	public String email2 = d.getCellData("SearchData", 1, 2);
	public String abc = d.getCellData("SearchData", 1, 3);
	
}