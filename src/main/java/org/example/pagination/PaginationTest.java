package org.example.pagination;

import java.util.List;

public class PaginationTest {
    public static void main(String[] args) {
        DataService dataService = new DataService();
       List<String> name = dataService.getResult();

       Pagination pagination = new Pagination();
       pagination.perPageRecordsSize=10;
       if (name.size()%10>0){
           pagination.totalPages=name.size()/10+1;
       }else {
           pagination.totalPages=name.size()/10;
       }
    for (int i = 0;i< pagination.totalPages;i++){
        int endIndex =(i* pagination.perPageRecordsSize)+ pagination.perPageRecordsSize;
        if (endIndex>name.size()){
            endIndex=name.size();
        }
        List<String> stringList = name.subList(i* pagination.perPageRecordsSize,
               endIndex );
        System.out.println("Page value" +i+"Values "+ stringList);
    }
    }
}
