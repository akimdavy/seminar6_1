package lv.venta.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Table(name = "GradeTable")
@Entity
public class Grade {
	@Setter(value = AccessLevel.NONE)
	@Column(name = "Idg")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idg;
	
	@Min(1)
	@Max(10)
	@NotNull

	@Column(name = "Grvalue")
	private int grvalue;
	
	@ManyToOne
	@JoinColumn(mappedBy = "Ids")
	private Student student;
	

}
