package com.csv.json.uploadfiles.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CsvJson {
@JsonIgnore
public String[] header;
public List<String[]> rows;
public String[] getHeader() {
	return header;
}
public void setHeader(String[] columns) {
	this.header = columns;
}
public List<String[]> getRows() {
	return rows;
}
public void setRows(List<String[]> rows) {
	this.rows = rows;
}
}
