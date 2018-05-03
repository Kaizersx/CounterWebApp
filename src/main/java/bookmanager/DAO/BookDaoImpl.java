package bookmanager.DAO;

import bookmanager.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class BookDaoImpl implements BookDao {

    private static final Logger logger = LoggerFactory.getLogger(BookDaoImpl.class);

    private SessionFactory sessionFactory;


    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addBook(Book book) {

        Session session=this.sessionFactory.getCurrentSession();
        session.persist(book);
        logger.info( "Book successfully saved. Book detail: "+book);

    }

    public void updateBook(Book book) {

    }

    public void removeBook(int id) {

    }

    public Book getBookById(int id) {
        return null;
    }

    public List<Book> listBooks() {
        return null;
    }
}
