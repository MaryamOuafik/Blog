package bloggy.models;

import java.sql.Date;
import java.util.*;

import jakarta.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPost;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String text;
    
    @Column(nullable = true)
    private Date creation_date;

    @Column(nullable = true)
    private Date publishing_date;
    
    @ManyToOne
    @JoinColumn(name = "publisher")
    private User publisher;
    
    @ManyToOne
    @JoinColumn(name = "reviewer")
    private User reviewer;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "posts_categories",
        joinColumns = @JoinColumn(name = "id_post"),
        inverseJoinColumns = @JoinColumn(name = "id_category")
    )
    private Set<Category> categories = new HashSet<>();


    public Post() {
    }

	public Post(String title, String text, Date creation_date, Date publishing_date, User publisher, User reviewer,
			Set<Category> categories) {
		super();
		this.title = title;
		this.text = text;
		this.creation_date = creation_date;
		this.publishing_date = publishing_date;
		this.publisher = publisher;
		this.reviewer = reviewer;
		this.categories = categories;
	}



	public Long getIdBlog() {
		return idPost;
	}

	public void setIdBlog(Long id) {
		this.idPost = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	

	public User getPublisher() {
		return publisher;
	}

	public void setPublisher(User publisher) {
		this.publisher = publisher;
	}

	public User getReviewer() {
		return reviewer;
	}

	public void setReviewer(User reviewer) {
		this.reviewer = reviewer;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

	public Date getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
	}

	public Date getPublishing_date() {
		return publishing_date;
	}

	public void setPublishing_date(Date publishing_date) {
		this.publishing_date = publishing_date;
	}

	@Override
	public String toString() {
		return "Blog [idBlog=" + idPost + ", title=" + title + ", text=" + text + ", creation_date=" + creation_date
				+ ", publishing_date=" + publishing_date + ", publisher=" + publisher + ", reviewer=" + reviewer
				+ ", categories=" + categories + "]";
	}


}

