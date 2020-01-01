package controller;

import model.BookReaderManagement;

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
}
