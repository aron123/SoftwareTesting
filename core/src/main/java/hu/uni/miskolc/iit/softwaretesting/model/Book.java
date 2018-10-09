package hu.uni.miskolc.iit.softwaretesting.model;

public class Book
{


    /**
     * This object represents a book.
     */
    /**
     * @param id - A unique value to distinguish the books from each other in our database.
     */
    private int id;


    /**
     * @param author - The author of the book.
     */
    private String author;

    /**
     * @param title - The title of the book.
     */
    private String title;

    /**
     * @param isbn - The international standard book number of the book.
     */
    private Long isbn;

    /**
     * @param publishDate - The publish date of the book defined by year.
     */
    private int publishDate;

    /**
     * @param genre - The genre of the book.
     */
    private Genre genre;

    /**
     * @param isLoaned - The status of the book, it can be loaned or not.
     */
    private boolean isLoaned;


    public Book(int id, String author, String title, Long isbn, int publishDate, Genre genre, boolean isLoaned)
    {
        this.id = id;
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.publishDate = publishDate;
        this.genre = genre;
        this.isLoaned = isLoaned;
    }


    public int getId() {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public Long getIsbn()
    {
        return isbn;
    }

    public void setIsbn(Long isbn)
    {
        this.isbn = isbn;
    }

    public int getPublishDate()
    {
        return publishDate;
    }

    public void setPublishDate(int publishDate)
    {
        this.publishDate = publishDate;
    }

    public Genre getGenre()
    {
        return genre;
    }

    public void setGenre(Genre genre)
    {
        this.genre = genre;
    }

    public boolean isLoaned()
    {
        return isLoaned;
    }

    public void setLoaned(boolean loaned)
    {
        isLoaned = loaned;
    }

    @Override
    public String toString()
    {
        return "Details of the book are the following: " +
                "identifier = " + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", isbn=" + isbn +
                ", date of publish =" + publishDate +
                ", genre ='" + genre + '\'' +
                ", is the book loaned? " + isLoaned +
                '.';
    }

}
