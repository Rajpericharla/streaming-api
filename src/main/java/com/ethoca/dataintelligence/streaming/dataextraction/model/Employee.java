package com.ethoca.dataintelligence.streaming.dataextraction.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Employee {
	@ApiModelProperty(notes = "Employee No", name = "employeeNo", required = true, value = "1")
	private String employeeNo;
	private String employeeName;
}
