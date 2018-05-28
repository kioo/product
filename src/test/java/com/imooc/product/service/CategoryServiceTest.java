package com.imooc.product.service;

import com.imooc.product.ProductApplicationTests;
import com.imooc.product.dataobject.ProductCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@Component
public class CategoryServiceTest extends ProductApplicationTests{

    @Autowired
    private CategoryService categoryService;
    @Test
    public void findByCategoryTypeIn() throws  Exception{
        List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(11,22));
        assertTrue(list.size() > 0);
    }
}