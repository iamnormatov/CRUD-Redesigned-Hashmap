import java.util.HashMap;
import java.util.Map;

public class BookService {
    private Map<Integer, Book> bookMap;
    private Integer bookIndex;
    public BookService(){
        this.bookMap = new HashMap<>();
        this.bookIndex = 0;
    }
    public String createBook(Integer bookId, Book book){
        if (bookId == null){
            return "Error book";
        }
        book.setBookId(++this.bookIndex);
        this.bookMap.put(bookId, book);
        return "Book successful created";
    }

    public String getBook(Integer bookId){
        if (this.bookMap.containsKey(bookId)){
            return this.bookMap.get(bookId).toBook();
        }
        return "Book is not found";
    }

    public String updateBook(Integer bookId, Book book){
        Integer bookOn;
        if (this.bookMap.containsKey(bookId)){
            bookOn = this.bookMap.get(bookId).getBookId();
            book.setBookId(bookOn);
            this.bookMap.replace(bookId, this.bookMap.get(bookId), book);
            return "Book successful updated";
        }
        return "Book is not found";
    }

    public String deleteBook(Integer bookId){
        if (this.bookMap.containsKey(bookId)){
            if (this.bookMap.remove(bookId, this.bookMap.get(bookMap))){
                return "Book successful deleted";
            }
        }
        return "Book is not found";
    }
}
