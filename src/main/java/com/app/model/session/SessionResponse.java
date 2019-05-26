package com.app.model.session;

import io.swagger.annotations.*;
import lombok.*;
import java.util.*;
import com.app.model.response.*;

@Data
@EqualsAndHashCode(callSuper=false)
public class SessionResponse extends OperationResponse {
  @ApiModelProperty(required = true, value = "")
  private SessionItem item;

public SessionItem getItem() {
	return item;
}

public void setItem(SessionItem item) {
	this.item = item;
}

public void setOperationStatus(ResponseStatusEnum error) {
	// TODO Auto-generated method stub
	
}

public void setOperationMessage(String string) {
	// TODO Auto-generated method stub
	
}
}
