package com.saraya.model.owners.copy;

import java.time.LocalDate;

public class Visit {
private LocalDate date;
private String description;
public Visit(LocalDate date, String description) {
	super();
	this.date = date;
	this.description = description;
}
public Visit() {
	super();
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "Visit [date=" + date + ", description=" + description + "]";
}


}
