package com.bank.credit.util;

import org.springframework.stereotype.Component;

@Component
public class Pagination {

    private Long start;

    private Long limit = 25L;

    private Long totalCount;

    private String fieldNameSort;

    private String directionSort;

    public Pagination() {
    }

    public Pagination(Object start, Object limit, String sort, String dir) {
        super();
        this.start = Long.valueOf(String.valueOf(start));
        this.limit = Long.valueOf(String.valueOf(limit));
        this.fieldNameSort = sort;
        this.directionSort = dir;
    }

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public String getFieldNameSort() {
        return fieldNameSort;
    }

    public void setFieldNameSort(String fieldNameSort) {
        this.fieldNameSort = fieldNameSort;
    }

    public String getDirectionSort() {
        return directionSort;
    }

    public void setDirectionSort(String directionSort) {
        this.directionSort = directionSort;
    }
}
