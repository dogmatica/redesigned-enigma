package com.example.williamstultscourseguide.data;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface TermDao {
    @Query("SELECT * FROM term_table ORDER BY term_id")
    List<Term> getTermList();

    @Query("SELECT * FROM term_table WHERE term_id = :termId ORDER BY term_id")
    Term getTerm(int termId);

    @Query("SELECT * FROM term_table WHERE term_name = :termName ORDER BY term_id")
    Term getTermByName(String termName);

    @Query("SELECT * FROM term_table")
    List<Term> getAllTerms();

    @Insert
    void insertTerm(Term term);

    @Insert
    void insertAll(Term... term);

    @Update
    void updateTerm(Term term);

    @Query("DELETE FROM term_table")
    public void nukeTermTable();

    @Query("DELETE FROM term_table WHERE term_id = :termId")
    void deleteTerm(int termId);

}
