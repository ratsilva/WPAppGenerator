package br.com.wpappgenerator.models.util;

import java.util.ArrayList;

public interface CRUDModel {

    // Insert
    int insert(Object obj);

    // Delete
    boolean delete(Object obj);
    boolean deleteAll(String where);

    // Update
    int update(Object obj);

    // Select
    Object select(Object obj);
    ArrayList<Object> selectAll(String where);

}
