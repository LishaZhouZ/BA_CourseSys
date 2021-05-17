package com.course;

import java.util.Date;

import javax.persistence.Entity;

import org.springframework.context.annotation.PropertySource;

import com.exception.InputException;

@Entity
public class Course {
	private Integer cno;
	private String cname;
	private Integer credit;
	private String cstart;
	private Integer teachNo;
	private Integer mark;
	private String ctime;
	private String tname;
	
	
	
    /* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
    public boolean equals(Object obj) {

        Course Obj = (Course)obj;

        if(Obj.getCno()==this.getCno())
        {
            return true;
        }else{
            return false;
        }
    }

	/**
	 * @return the tname
	 */
	public String getTname() {
		return tname;
	}
	/**
	 * @param tname the tname to set
	 */
	public void setTname(String tname) {
		this.tname = tname;
	}
	/**
	 * @return the cno
	 */
	public Integer getCno() {
		return cno;
	}
	/**
	 * @return the cname
	 */
	public String getCname() {
		return cname;
	}
	/**
	 * @return the credit
	 */
	public Integer getCredit() {
		return credit;
	}
	/**
	 * @return the cStart
	 */
	public String getCstart() {
		return cstart;
	}
	/**
	 * @return the teachNo
	 */
	public Integer getTeachNo() {
		return teachNo;
	}
	/**
	 * @param cno the cno to set
	 */
	public void setCno(Integer cno) {
		this.cno = cno;
	}
	/**
	 * @param cname the cname to set
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}
	/**
	 * @param credit the credit to set
	 */
	public void setCredit(Integer credit) {
		this.credit = credit;
	}
	/**
	 * @param cStart the cStart to set
	 */
	public void setCstart(String cStart) {
		this.cstart = cStart;
	}
	/**
	 * @param teachNo the teachNo to set
	 */
	public void setTeachNo(Integer teachNo) {
		this.teachNo = teachNo;
	}
	/**
	 * @return the mark
	 */
	public Integer getMark() {
		return mark;
	}
	/**
	 * @param mark the mark to set
	 */
	public void setMark(Integer mark) {
		this.mark = mark;
	}
	/**
	 * @return the ctime
	 */
	public String getCtime() {
		return ctime;
	}
	/**
	 * @param ctime the ctime to set
	 */
	public void setCtime(String ctime) {
		this.ctime = ctime;
	}

	
	/**
	 * @param teachNo the teachNo to set
	 * @throws InputException 
	 */
//	public void setTeachNo(int teachNo) throws InputException {
//		if ((teachNo>=1000)&&(teachNo<10000)){
//			TeachNo = teachNo;}
//			else{
//				throw new InputException("Teacher's No. input wrong!");
//			}
//		
//	}
	

}
