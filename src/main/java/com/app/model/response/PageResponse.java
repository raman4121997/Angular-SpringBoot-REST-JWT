package com.app.model.response;

import io.swagger.annotations.*;
import org.springframework.data.domain.*;
import lombok.*;
import java.util.*;
import static com.app.model.response.OperationResponse.*;

//@Data //for getters and setters
public class PageResponse extends OperationResponse {
  @Getter @Setter private boolean  first;
  @Getter @Setter private boolean  last;
  @Getter @Setter private int currentPageNumber;
  @Getter @Setter private int itemsInPage;
  @Getter @Setter private int pageSize;
  @Getter @Setter private int totalPages;
  @Getter @Setter private long totalItems;
  @Getter @Setter private Sort sort;
  private List items;

  public void setPageStats(Page pg, boolean setDefaultMessage){
    this.first             = pg.isFirst();
    this.last              = pg.isLast();
    this.currentPageNumber = pg.getNumber();
    this.itemsInPage       = pg.getNumberOfElements();
    this.pageSize          = pg.getSize();
    this.totalPages        = pg.getTotalPages();
    this.totalItems        = pg.getTotalElements();
    //this.items             = pg.getContent();
    this.sort              = pg.getSort();
    if (setDefaultMessage == true){
      this.setOperationStatus(ResponseStatusEnum.SUCCESS);
      this.setOperationMessage("Page " + (pg.getNumber()+ 1 ) + " of " + pg.getTotalPages() );
    }
  }

  public boolean isFirst() {
	return first;
}

public void setFirst(boolean first) {
	this.first = first;
}

public boolean isLast() {
	return last;
}

public void setLast(boolean last) {
	this.last = last;
}

public int getCurrentPageNumber() {
	return currentPageNumber;
}

public void setCurrentPageNumber(int currentPageNumber) {
	this.currentPageNumber = currentPageNumber;
}

public int getItemsInPage() {
	return itemsInPage;
}

public void setItemsInPage(int itemsInPage) {
	this.itemsInPage = itemsInPage;
}

public int getPageSize() {
	return pageSize;
}

public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
}

public int getTotalPages() {
	return totalPages;
}

public void setTotalPages(int totalPages) {
	this.totalPages = totalPages;
}

public long getTotalItems() {
	return totalItems;
}

public void setTotalItems(long totalItems) {
	this.totalItems = totalItems;
}

public Sort getSort() {
	return sort;
}

public void setSort(Sort sort) {
	this.sort = sort;
}

public List getItems() {
	return items;
}

public void setItems(List items) {
	this.items = items;
}

public void setPageTotal(int count, boolean setDefaultMessage){
    //this.items             = list;
    this.first             = true;
    this.last              = true;
    this.itemsInPage       = count;
    this.totalItems        = count;
    this.totalPages        = 1;
    this.pageSize          = count;
    if (setDefaultMessage == true){
      this.setOperationStatus(ResponseStatusEnum.SUCCESS);
      this.setOperationMessage("Total " + count + " items ");
    }
  }

public void setOperationMessage(String string) {
	// TODO Auto-generated method stub
	
}

public void setOperationStatus(ResponseStatusEnum success) {
	// TODO Auto-generated method stub
	
}

}
