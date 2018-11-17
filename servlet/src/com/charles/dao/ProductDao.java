package com.charles.dao;

import com.charles.bean.Product;
import com.charles.jdbc.Connect;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    /**
     * 查询产品列表
     *
     * @param page 页码
     * @return 产品列表
     */
    public List<Product> find(int page) {
        List<Product> productList = new ArrayList<>();
        Connection conn = (new Connect()).getMysqlConn();
        String sql = "select * from tb_products limit ?,?";
        int offset = (page - 1) * Product.PAGE_SIZE;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, offset);
            ps.setInt(2, Product.PAGE_SIZE);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setNum(rs.getInt("num"));
                product.setPrice(rs.getDouble("price"));
                product.setUnit(rs.getString("unit"));
                productList.add(product);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

    public int getCount() {
        Connection conn = (new Connect()).getMysqlConn();
        String sql = "select count(*) as total from tb_products";
        int count = 0;
        try {
            Statement statement = conn.createStatement();
            ResultSet set = statement.executeQuery(sql);
            if (set.next()) {
                count = set.getInt("total");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
}
