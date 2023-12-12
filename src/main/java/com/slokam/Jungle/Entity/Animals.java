package com.slokam.Jungle.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Animals {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer animalsId;
	private String animalsList;
	public Integer getAnimalsId() {
		return animalsId;
	}
	public void setAnimalsId(Integer animalsId) {
		this.animalsId = animalsId;
	}
	public String getAnimalsList() {
		return animalsList;
	}
	public void setAnimalsList(String animalsList) {
		this.animalsList = animalsList;
	}
	@Override
	public String toString() {
		return "Animals [animalsId=" + animalsId + ", animalsList=" + animalsList + "]";
	}
	public Animals(Integer animalsId, String animalsList) {
		super();
		this.animalsId = animalsId;
		this.animalsList = animalsList;
	}
	public Animals() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
