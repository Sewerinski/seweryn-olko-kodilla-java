package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product p1 = new Product("Słoik");
        Product p2 = new Product("Nakrętka");

        List<Item> items = new ArrayList<>();
        Item item1 = new Item(p1, new BigDecimal(120), 1, new BigDecimal(120));
        Item item2 = new Item(p2, new BigDecimal(50), 2, new BigDecimal(100));
        items.add(item1);
        items.add(item2);
        Invoice i1 = new Invoice("12", items);

        p1.getItems().add(item1);
        p2.getItems().add(item2);

        //When
        productDao.save(p1);
        productDao.save(p2);
        invoiceDao.save(i1);

        itemDao.save(item1);
        itemDao.save(item2);

        //Then
        Assert.assertNotEquals(0, item2.getId());
    }
}
