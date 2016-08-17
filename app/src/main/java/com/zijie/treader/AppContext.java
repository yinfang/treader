package com.zijie.treader;

import android.content.Context;

import com.zijie.treader.db.BookList;
import com.zijie.treader.util.PageFactory;
import com.zijie.treader.util.PageFactory1;

import org.litepal.LitePalApplication;
import org.litepal.crud.DataSupport;

import java.util.List;

/**
 * Created by Administrator on 2016/7/8 0008.
 */
public class AppContext extends LitePalApplication {
    public static volatile Context applicationContext = null;
    private List<BookList> books;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationContext = getApplicationContext();

        LitePalApplication.initialize(this);
        Config.createConfig(this);
        PageFactory1.createPageFactory(this);
    }

    public List<BookList> getBookList(){
        if (books == null){
            books = DataSupport.findAll(BookList.class);
        }
        return books;
    }

    public boolean addBookList(){

        return true;
    }
}
