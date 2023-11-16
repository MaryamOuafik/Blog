package bloggy.models;
import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategory;
	
	 @Column(nullable = false)
	 private String name;
	 
	 public Category() {
		 
	 }
	public Category(Long idCategory, String name) {
		super();
		this.idCategory = idCategory;
		this.name = name;
	}
	public Long getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Category [idCategory=" + idCategory + ", name=" + name + "]";
	}
	 
	
	 
}
