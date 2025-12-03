package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Immeuble {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ; 
	private String nomImmeuble ; 
	private String Adresse ; 
	private float surfaceTotale ; 
	private String description ; 
	private String[] photos ; 
	private Proprietaire proprio ; 
	private float prixTotal ; 
	private float prixAFinancer ; 
	private float prixDejaFiancer ; 
	private float rentaNet ; 
	private float plusvalueNet ; 
	private String horizonremboursement ; 
	
	
}
