package entitites;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private Integer number;
	private Double totalValue;
	private Date date;
	
	List<Installment> installments = new ArrayList<Installment>();
	
	public Contract() {
		
	}

	public Contract(Integer number, Double totalValue, Date date) {
		super();
		this.number = number;
		this.totalValue = totalValue;
		this.date = date;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Installment> getInstallments() {
		return installments;
	}
}
