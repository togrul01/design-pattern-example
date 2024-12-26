package org.company.singleton;

public class Main {
    public static void main(String[] args) {
        var connection = DbConnection.getInstance();
        connection.addQuery("SELECT * FROM users");
        connection.addQuery("SELECT * FROM products");
        connection.addQuery("SELECT * FROM orders");
        connection.showQueries();
    }
}
