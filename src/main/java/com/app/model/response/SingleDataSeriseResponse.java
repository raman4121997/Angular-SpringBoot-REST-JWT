//This is a common http response model for providing data series

package com.app.model.response;

import lombok.*;
import java.util.*;
import io.swagger.annotations.*;
import com.app.model.data.*;

@Data
@EqualsAndHashCode(callSuper=false)
public class SingleDataSeriseResponse extends OperationResponse {
    public List<SingleSerise> getItems() {
		return items;
	}

	public void setItems(List<SingleSerise> items) {
		this.items = items;
	}

	private List<SingleSerise> items;
}
