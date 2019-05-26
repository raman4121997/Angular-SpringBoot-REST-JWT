/**
    This is the common structure for all responses
    if the response contains a list(array) then it will have 'items' field
    if the response contains a single item then it will have 'item'  field
 */


package com.app.model.response;

import io.swagger.annotations.*;
import lombok.*;

@Data //for getters and setters
public class OperationResponse {
  public enum ResponseStatusEnum {SUCCESS, ERROR, WARNING, NO_ACCESS};
  @ApiModelProperty(required = true)
  private ResponseStatusEnum  operationStatus;
  private String  operationMessage;
public void setOperationStatus(ResponseStatusEnum error) {
	// TODO Auto-generated method stub
	
}
public void setOperationMessage(String message) {
	// TODO Auto-generated method stub
	
}
}
