package com.book.domain;

import java.io.Serializable;
import java.util.Date;

public class Lend implements Serializable {

    private long sernum;
    private long bookId;
    private int readerId;
    private Date lendDate;
    private Date backDate;

    public int getReaderId() {
        return readerId;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public Date getBackDate() {
        return backDate;
    }

    public void setBackDate(Date backDate) {
        this.backDate = backDate;
    }

    public Date getLendDate() {
        return lendDate;
    }

    public void setLendDate(Date lendDate) {
        this.lendDate = lendDate;
    }

    public long getSernum() {
        return sernum;
    }

    public void setSernum(long sernum) {
        this.sernum = sernum;
    }
}
