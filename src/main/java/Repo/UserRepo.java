package Repo;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.BoundStatement;
import com.datastax.oss.driver.api.core.cql.PreparedStatement;
import com.datastax.oss.driver.api.core.cql.SimpleStatement;
import com.datastax.oss.driver.api.querybuilder.QueryBuilder;
import com.datastax.oss.driver.api.querybuilder.insert.RegularInsert;
import model.User_Info;

public class UserRepo {

    private static String TABLE_NAME="user_info";
    private static String KEYSPACE ="localdb";

    // Insert new User
    public String InsertNewUser(CqlSession session, User_Info user_info) {

        // build san INSERT statement
        RegularInsert insertInto = QueryBuilder.insertInto(TABLE_NAME)
                .value("user_id", QueryBuilder.bindMarker())
                .value("user_name", QueryBuilder.bindMarker())
                .value("user_image_url", QueryBuilder.bindMarker())
                .value("user_type_login", QueryBuilder.bindMarker())
                .value("user_phone_number", QueryBuilder.bindMarker())
                .value("user_encrypted_password", QueryBuilder.bindMarker())
                .value("user_is_actived", QueryBuilder.bindMarker())
                .value("user_is_banned", QueryBuilder.bindMarker())
                .value("user_is_deleted", QueryBuilder.bindMarker())
                .value("user_actived_since", QueryBuilder.bindMarker())
                .value("user_banned_since", QueryBuilder.bindMarker())
                .value("user_deleted_since", QueryBuilder.bindMarker())
                .value("user_total_followed_food_place", QueryBuilder.bindMarker())
                .value("user_total_gotten_voucher", QueryBuilder.bindMarker()
                );

        // beginning building CQL statement
        SimpleStatement insertStatement = insertInto.build();
        insertStatement = insertStatement.setKeyspace(KEYSPACE);

        try{

            // putting data each object to columns in table
            PreparedStatement preparedStatement = session.prepare(insertStatement);
            BoundStatement statement = preparedStatement.bind()
                    .setUuid(0, user_info.getUser_id())
                    .setString(1, user_info.getUser_name())
                    .setString(2, user_info.getUser_image_url())
                    .setString(3, user_info.getUser_type_login())
                    .setString(4, user_info.getUser_phone_number())
                    .setString(5, user_info.getUser_encrypted_password())
                    .setBoolean(6, user_info.isUser_is_actived())
                    .setBoolean(7, user_info.isUser_is_banned())
                    .setBoolean(8, user_info.isUser_is_deleted())
                    .setInstant(9, user_info.getUser_actived_since().toInstant())
                    .setInstant(10, user_info.getUser_banned_since().toInstant())
                    .setInstant(11, user_info.getUser_deleted_since().toInstant())
                    .setBigInteger(12, user_info.getUser_total_followed_food_place())
                    .setBigInteger(13, user_info.getUser_total_gotten_voucher());

            session.execute(statement);
            return "OK";
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error: " + e);
            return "ERR";
        }
    }

}
