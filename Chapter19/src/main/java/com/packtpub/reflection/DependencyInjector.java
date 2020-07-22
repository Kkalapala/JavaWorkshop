package com.packtpub.reflection;

import java.lang.reflect.Field;

public class DependencyInjector {
    void setField(Object object, Class c, String fieldname, Object value) {
        try {
            Field field = c.getDeclaredField(fieldname);

            field.setAccessible(true);

            field.set(object, value);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public Database init(String username, String password, String url, String driver) {
        Database database = new Database();
        Class c = Database.class;
        // Set values.
        setField(database, c, "username", username);
        setField(database, c, "password", password);
        setField(database, c, "url", url);
        setField(database, c, "driver", driver);
        return database;
    }

    public static void main(String[] args) {
        DependencyInjector injecter = new DependencyInjector();
        Database database = injecter.init("bobmarley", "password",
                "jdbc:h2:~/test", "org.h2.Driver");
        System.out.println(database.toString());
    }
}
