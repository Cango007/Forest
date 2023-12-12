package com.slokam.Jungle.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class NationalPark {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer nationalparkId;
	private String nationalparkName;
	private Integer count;
    private String type;
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name="Fk_Key",referencedColumnName = "nationalParkId")
    private List<Animals> animals;
	public Integer getNationalparkId() {
		return nationalparkId;
	}
	public void setNationalparkId(Integer nationalparkId) {
		this.nationalparkId = nationalparkId;
	}
	public String getNationalparkName() {
		return nationalparkName;
	}
	public void setNationalparkName(String nationalparkName) {
		this.nationalparkName = nationalparkName;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Animals> getAnimals() {
		return animals;
	}
	public void setAnimals(List<Animals> animals) {
		this.animals = animals;
	}
	@Override
	public String toString() {
		return "NationalPark [nationalparkId=" + nationalparkId + ", nationalparkName=" + nationalparkName + ", count="
				+ count + ", type=" + type + ", animals=" + animals + "]";
	}
	public NationalPark(Integer nationalparkId, String nationalparkName, Integer count, String type,
			List<Animals> animals) {
		super();
		this.nationalparkId = nationalparkId;
		this.nationalparkName = nationalparkName;
		this.count = count;
		this.type = type;
		this.animals = animals;
	}
	public NationalPark() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
}
