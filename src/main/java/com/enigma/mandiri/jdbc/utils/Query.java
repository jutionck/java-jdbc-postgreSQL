package com.enigma.mandiri.jdbc.utils;

public class Query {
    public final static String SQL_SELECT_PRODUCT = "SELECT * FROM mst_product";
    public final static String SQL_SELECT_BY_ID_PRODUCT = "SELECT * FROM mst_product WHERE product_id = ?";
    public final static String SQL_INSERT_PRODUCT = "INSERT INTO m_product (id,product_name,price) VALUES (?,?,?)";
    public final static String SQL_UPDATE_PRODUCT = "UPDATE m_product SET product_name = ?, price = ? WHERE id = ?";
    public final static String SQL_DELETE_PRODUCT = "DELETE m_product WHERE id = ?";

}
