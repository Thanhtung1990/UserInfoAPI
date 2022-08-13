package controller;

import Repo.UserRepo;
import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.PreparedStatement;
import com.datastax.oss.driver.api.core.cql.SimpleStatement;
import com.datastax.oss.driver.api.querybuilder.QueryBuilder;
import com.datastax.oss.driver.api.querybuilder.insert.RegularInsert;
import model.User_Info;
import utils.CassandraConnect;

public class UserController {

    private UserRepo userRepo = new UserRepo();
    private static String node="127.0.0.1";
    private static int port=9042;
    private static String DataCenter="datacenter1";

    // CQL Session
    private CqlSession session(){

        CassandraConnect connector = new CassandraConnect();
        connector.connect(node, port, DataCenter);
        CqlSession session = connector.getSession();
        return session;
    }

    // Insert new User
    public String InsertNewUserController(User_Info user_info){

        userRepo.InsertNewUser(session(), user_info);
        if (userRepo.InsertNewUser(session(), user_info).equals("OK")){
            return "OK";
        } else {
            return "ERR";
        }
    }

    // Update user info


    // Select user info


    // Admin role: Update Banned user


    // Admin role: Update removed user


}
