package pe.edu.upc.Karwas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "persons")
@Getter
@Setter
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="name", length=13, nullable=false)
	private String namePerson;
	
	@Column(name="last_name", length=30, nullable=false)
	private String lastNamePerson;
	
	@Column(name = "dni", length = 8, nullable = false)
	private Integer dni;
	
	@Column(name = "number_phone", length = 9, nullable = false)
	private Integer numberPhone;
	
	@Column(name="district", length=20, nullable=false)
	private String district;
	
	@Column(name="direction", length=40, nullable=false)
	private String direction;
}
