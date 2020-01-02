package controller;

import model.Book;
import model.BookReaderManagement;
import model.Reader;

import java.util.ArrayList;

public class DataUtility {
    public ArrayList<BookReaderManagement> UpdateBRMInfo(ArrayList<BookReaderManagement> brms, BookReaderManagement brm){
        boolean isUpdate = false;
        for (int i = 0; i < brms.size(); i++) {
            BookReaderManagement b = brms.get(i);
            if (b.getBook().getBookID() == brm.getBook().getBookID() &&
                b.getReader().getReaderID() == brm.getReader().getReaderID()){
                brms.set(i, brm);
                isUpdate = true;
                break;
            }
        }
        if (!isUpdate){
            brms.add(brm);
        }
        return brms;
    }

    public ArrayList<BookReaderManagement> UpdateTotalBorrow(ArrayList<BookReaderManagement> brms){
        for (int i = 0; i < brms.size(); i++) {
            int count = 0;
            BookReaderManagement b = brms.get(i);
            for (int j = 0; j < brms.size(); j++) {
                if (b.getReader().getReaderID() == brms.get(j).getReader().getReaderID()){
                    count += brms.get(j).getNumOfBorrow();
                }
            }
            b.setTotalBorrow(count);
            brms.set(i, b);
        }
        return brms;
    }

    //Sort readers by id
    public void SortByID(ArrayList<Reader> readers){
        for (int i = 0; i < readers.size() - 1; i++) {
            for(int j = readers.size() - 1; j > i; j--){
                Reader r1 = readers.get(j - 1);
                Reader r2 = readers.get(j);
                if (r1.getReaderID() > r2.getReaderID()){
                    Reader rt = r1;
                    readers.set(j - 1, r2);
                    readers.set(j, rt);
                }
            }
        }
    }

    //sort books by id
    public void SortByID(ArrayList<Book> books, int id){
        for (int i = 0; i < books.size() - 1; i++) {
            for(int j = books.size() - 1; j > i; j--){
                Book b1 = books.get(j - 1);
                Book b2 = books.get(j);
                if (b1.getBookID() > b2.getBookID()){
                    Book bt = b1;
                    books.set(j - 1, b2);
                    books.set(j, bt);
                }
            }
        }
    }

    //sort reader by name
    public void SortByName(ArrayList<Reader> readers){
        String regex = "\\s+";
        for (int i = 0; i < readers.size() - 1; i++) {
            for(int j = readers.size() - 1; j > i; j--){
                String[] r1 = readers.get(j - 1).getFullName().split(regex);
                String[] r2 = readers.get(j).getFullName().split(regex);

                if (r1[r1.length - 1].toLowerCase().compareTo(r2[r2.length - 1].toLowerCase()) > 0){
                    Reader rt = readers.get(j - 1);
                    readers.set(j - 1, readers.get(j));
                    readers.set(j, rt);
                }
            }
        }
    }

    //sort books by name
    public void SortByName(ArrayList<Book> books, int id){
        String regex = "\\s+";
        for (int i = 0; i < books.size() - 1; i++) {
            for(int j = books.size() - 1; j > i; j--){
                String[] r1 = books.get(j - 1).getBookName().split(regex);
                String[] r2 = books.get(j).getBookName().split(regex);

                if (r1[r1.length - 1].toLowerCase().compareTo(r2[r2.length - 1].toLowerCase()) > 0){
                    Book rt = books.get(j - 1);
                    books.set(j - 1, books.get(j));
                    books.set(j, rt);
                }
            }
        }
    }

    //sort brm by ReaderID
    public void SortBRMByReaderID(ArrayList<BookReaderManagement> brm){
        for (int i = 0; i < brm.size() - 1; i++) {
            for(int j = brm.size() - 1; j > i; j--){
                int brm1 = brm.get(j - 1).getReader().getReaderID();
                int brm2 = brm.get(j).getReader().getReaderID();

                if (brm1 > brm2){
                    BookReaderManagement brmt = brm.get(j - 1);
                    brm.set(j - 1, brm.get(j));
                    brm.set(j, brmt);
                }
            }
        }
    }

    //sort brm by name
    public void SortBRMByName(ArrayList<BookReaderManagement> brm){
        String regex = "\\s+";
        for (int i = 0; i < brm.size() - 1; i++) {
            for(int j = brm.size() - 1; j > i; j--){
                String[] r1 = brm.get(j - 1).getReader().getFullName().split(regex);
                String[] r2 = brm.get(j).getReader().getFullName().split(regex);

                if (r1[r1.length - 1].toLowerCase().compareTo(r2[r2.length - 1].toLowerCase()) > 0){
                    BookReaderManagement brmt = brm.get(j - 1);
                    brm.set(j - 1, brm.get(j));
                    brm.set(j, brmt);
                }
            }
        }
    }

    //sort brm by TotalBorrow
    public void SortBRMByTotalBorrow(ArrayList<BookReaderManagement> brm){
        for (int i = 0; i < brm.size() - 1; i++) {
            for(int j = brm.size() - 1; j > i; j--){
                int r1 = brm.get(j - 1).getTotalBorrow();
                int r2 = brm.get(j).getTotalBorrow();

                if (r1 < r2){
                    BookReaderManagement brmt = brm.get(j - 1);
                    brm.set(j - 1, brm.get(j));
                    brm.set(j, brmt);
                }
            }
        }
    }

    //search book by ID
    public Book SearchBookByID(ArrayList<Book> books, int id){
        int l = 0, r = books.size() - 1;
        while (l <= r){
            int m = l + (r - l)/2;
            if (books.get(m).getBookID() == id){
                return books.get(m);
            }
            if (books.get(m).getBookID() > id){
                r = m - 1;
            }
            if (books.get(m).getBookID() < id){
                l = m + 1;
            }
        }
        return null;
    }

    //search book by Name
    public ArrayList<Book> SearchBookByName(ArrayList<Book> books, String name){
        ArrayList<Book> list = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookName().contains(name)){
                list.add(books.get(i));
            }
        }
        return list;
    }

    //search reader by ID
    public Reader SearchReaderByID(ArrayList<Reader> readers, int id){
        int l = 0, r = readers.size() - 1;
        while (l <= r){
            int m = l + (r - l)/2;
            if (readers.get(m).getReaderID() == id){
                return readers.get(m);
            }
            if (readers.get(m).getReaderID() > id){
                r = m - 1;
            }
            if (readers.get(m).getReaderID() < id){
                l = m + 1;
            }
        }
        return null;
    }

    //search reader by Name
    public ArrayList<Reader> SearchReaderByName(ArrayList<Reader> readers, String name){
        ArrayList<Reader> list = new ArrayList<>();
        for (int i = 0; i < readers.size(); i++) {
            if (readers.get(i).getFullName().contains(name)){
                list.add(readers.get(i));
            }
        }
        return list;
    }

    //search brm by readerID
    public ArrayList<BookReaderManagement> SearchBRMByReaderID(ArrayList<BookReaderManagement> brms, int id){
        ArrayList<BookReaderManagement> list = new ArrayList<>();
        for (int i = 0; i < brms.size(); i++) {
            if (brms.get(i).getReader().getReaderID() == id){
                list.add(brms.get(i));
            }
        }
        return list;
    }

    //search brm by readerName
    public ArrayList<BookReaderManagement> SearchBRMByReaderName(ArrayList<BookReaderManagement> brms, String name){
        ArrayList<BookReaderManagement> list = new ArrayList<>();
        for (int i = 0; i < brms.size(); i++) {
            if (brms.get(i).getReader().getFullName().contains(name)){
                list.add(brms.get(i));
            }
        }
        return list;
    }
}
