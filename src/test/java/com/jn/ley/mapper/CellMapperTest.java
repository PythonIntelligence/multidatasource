package com.jn.ley.mapper;

import com.jn.ley.mapper.db1mapper.Cell1Mapper;
import com.jn.ley.mapper.db2mapper.Cell2Mapper;
import com.jn.ley.model.Cell;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CellMapperTest {

    @Autowired
    private Cell1Mapper cell1Mapper;

    @Autowired
    private Cell2Mapper cell2Mapper;

    @Test
    public void testGetAll(){
        List<Cell> res = cell1Mapper.getAll();
        System.out.println(res.size());
        for(Cell cell: res){
            System.out.println(cell.getId() + cell.getName());
        }
        System.out.println(" --------------------- ");

        res = cell2Mapper.getAll();
        System.out.println(res.size());
        for(Cell cell: res){
            System.out.println(cell.getId() + cell.getName());
        }
    }
}
