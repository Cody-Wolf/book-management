package org.zjucsdb.library_management_system.utils;

public interface DBInitializer {

    String sqlDropBook();
    String sqlDropCard();
    String sqlDropBorrow();
    String sqlCreateBook();
    String sqlCreateCard();
    String sqlCreateBorrow();

}
