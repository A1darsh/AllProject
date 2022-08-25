package com.zensar.stockapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.NamedNativeQuery;

//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@ApiModel("this is stock model")
@Entity(name = "MyStock")
@Table(name="stock")

//@NamedQueries({ @NamedQuery(name = "Stock.findStockByItsName", query = "From MyStock s where s.name=?1"),
		//@NamedQuery(name = "Stock.findStockByItsNameAndPrice", query = "From MyStock s where s.name=?1 and s.price=?2") })


//@NamedNativeQuery(name="Stock.findStockByItsName",query="select * from stock where name=?1" ,resultClass=Stock.class)
public class Stock {

	//@ApiModelProperty("stock id of interger type")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Id")
	
	private long stockId;
	
	
	private String name;
	@Column(name="market")
	private String marketName;
	private double price;

}
