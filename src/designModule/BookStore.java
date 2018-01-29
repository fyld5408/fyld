package designModule;

import java.text.NumberFormat;
import java.util.ArrayList;

public class BookStore {
     private final static ArrayList<IBook> bookList=new ArrayList<IBook>();
     static{
    	 bookList.add(new OffNovelBook("tt", 3200,"ji" ));
    	 bookList.add(new OffNovelBook("t2", 4200,"j2" ));
    	 bookList.add(new OffNovelBook("t3", 5200,"j3" ));
    	 bookList.add(new OffNovelBook("t4", 6200,"j4" ));
    	 bookList.add(new ComputerBook("t5", 10000, "312", "321"));
     }
     public static void main(String[] args){
    	 NumberFormat formatter=NumberFormat.getCurrencyInstance();
    	 formatter.setMaximumFractionDigits(2);
    	 for(IBook book:bookList){
    		 System.out.println(book.getName()+book.getAuthor()+book.getPrice());
    	 }
     }
}
