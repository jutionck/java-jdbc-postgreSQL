package com.enigma.mandiri.jdbc;

import com.enigma.mandiri.jdbc.config.ConnectDb;
import com.enigma.mandiri.jdbc.model.Product;
import com.enigma.mandiri.jdbc.utils.Query;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ConnectDb connectDb = new ConnectDb();
        Connection connection = connectDb.getConnection();

        List<Product> result = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(Query.SQL_SELECT);
            //Get Product by ID
            //preparedStatement.setString(1, "P003");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("product_id");
                String productName = resultSet.getString("product_name");
                Integer productBuyPrice = resultSet.getInt("product_price_buy");
                Integer productSellPrice = resultSet.getInt("product_price_sell");
                String productImage = resultSet.getString("product_image");
                Integer productStatus = resultSet.getInt("product_status");
                Timestamp createdAt = resultSet.getTimestamp("created_at");
                Timestamp updatedAt = resultSet.getTimestamp("updated_at");

                Product product = new Product();
                product.setId(id);
                product.setProductName(productName);
                product.setProductBuyPrice(productBuyPrice);
                product.setProductSellPrice(productSellPrice);
                product.setProductImage(productImage);
                product.setProductStatus(productStatus);
                product.setCreatedAt(createdAt.toLocalDateTime());
                product.setUpdatedAt(updatedAt.toLocalDateTime());

                result.add(product);
            }
            result.forEach(System.out::println);
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
