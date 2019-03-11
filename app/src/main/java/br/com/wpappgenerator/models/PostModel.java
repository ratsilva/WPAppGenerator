package br.com.wpappgenerator.models;

import android.content.ContentValues;
import android.content.Context;

import java.util.ArrayList;

import br.com.wpappgenerator.models.contracts.PostContract;
import br.com.wpappgenerator.models.util.CRUDModel;
import br.com.wpappgenerator.objects.Post;

public class PostModel extends MainModel implements CRUDModel {

    public PostModel(Context ctx_) {
        super(ctx_);
    }

    @Override
    public int insert(Object obj) {

        Post post = (Post) obj;

        accessDB(OPEN_MODE);

        ContentValues values = new ContentValues();

        values.put(PostContract.ID_POST		    , 	post.getId()	        );
        values.put(PostContract.DATE		    , 	post.getDate()	        );
        values.put(PostContract.LINK		    , 	post.getLink()  	    );
        values.put(PostContract.TITLE		    , 	post.getTitle()     	);
        values.put(PostContract.CONTENT		    , 	post.getContent()	    );
        values.put(PostContract.EXCERPT		    , 	post.getExcerpt()	    );

        long idpost = sqlite.insert(PostContract.TABLE_NAME, null, values);

        accessDB(CLOSE_MODE);

        return (int) idpost;

    }

    @Override
    public boolean delete(Object obj) {
        return false;
    }

    @Override
    public boolean deleteAll(String where) {
        return false;
    }

    @Override
    public int update(Object obj) {
        return 0;
    }

    @Override
    public Object select(Object obj) {
        return null;
    }

    @Override
    public ArrayList<Object> selectAll(String where) {
        return null;
    }

}
