public class Book { 
    private Integer bookId; 
    private String bookName;
    private String muallif; 
    private String nashriyot;
    private String chiqarilganYil;

    public Book(String bookName, String muallif, String nashriyot, String chiqarilganYil) {
        this.bookName = bookName;
        this.muallif = muallif;
        this.nashriyot = nashriyot;
        this.chiqarilganYil = chiqarilganYil;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getMuallif() {
        return muallif;
    }

    public void setMuallif(String muallif) {
        this.muallif = muallif;
    }

    public String getNashriyot() {
        return nashriyot;
    }

    public void setNashriyot(String nashriyot) {
        this.nashriyot = nashriyot;
    }

    public String getChiqarilganYil() {
        return chiqarilganYil;
    }

    public void setChiqarilganYil(String chiqarilganYil) {
        this.chiqarilganYil = chiqarilganYil;
    }

    public String toBook() {
        return "BookService{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", muallif='" + muallif + '\'' +
                ", nashriyot='" + nashriyot + '\'' +
                ", chiqarilganYil='" + chiqarilganYil + '\'' +
                '}';
    }
}
