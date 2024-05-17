package lv.venta.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "StudentTable")
@Entity
public class Student {
	@Setter(value = AccessLevel.NONE)
	@Column(name = "Idp")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idp;
	
	@NotNull
	@Pattern(regexp = "[A-Z]{1}[a-z]" )
	@Size(min = 2, max = 16)
	@Column(name = "name")
	private String name;
	
	@NotNull
	@Pattern(regexp = "[A-Z]{1}[a-z]" )
	@Size(min = 2, max = 20)
	@Column(name = "surname")
	private String surname;
	
	@NotNull
	private Degree degree;
	public Student(String name, String Surname, Degree degree) {
		setName(name);
		setSurname(surname);
		setDegree(degree);
	}
}
