import Repo.StandardResponse;
import Repo.StatusResponse;
import com.google.gson.Gson;
import controller.UserController;
import model.User_Info;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.UUID;

import static spark.Spark.*;



public class MainAPI {


    public static void main(String[] args) {

// post sample data router
        post("/v1/user-operation/test-user", (req, res) -> {

            // res.type("application/json");
            // put data through body. JSON
            // User_Info user_info1 = new Gson().fromJson(req.body(), User_Info.class);


            // put data through param
            UUID user_id = UUID.randomUUID();
             String user_name = req.params("user_name");
             String user_image_url = req.params("user_image_url");
             String user_type_login = req.params("user_type_login");
             String user_phone_number = req.params("user_phone_number");
             String user_encrypted_password = req.params("user_encrypted_password");
             boolean user_is_actived = Boolean.parseBoolean(req.params("user_is_actived"));
             boolean user_is_banned = Boolean.parseBoolean(req.params("user_is_banned"));
             boolean user_is_deleted = Boolean.parseBoolean(req.params("user_is_deleted"));
             Timestamp user_actived_since = Timestamp.valueOf(req.params("user_actived_since"));
             Timestamp user_banned_since = Timestamp.valueOf(req.params("user_banned_since"));
             Timestamp user_deleted_since = Timestamp.valueOf(req.params("user_deleted_since"));
             BigInteger user_total_followed_food_place = BigInteger.valueOf(Long.parseLong(req.params("user_total_followed_food_place")));
             BigInteger user_total_gotten_voucher = BigInteger.valueOf(Long.parseLong(req.params("user_total_gotten_voucher")));

            User_Info user_info = new User_Info(user_id,
                                                user_name,
                                                user_image_url,
                                                user_type_login,
                                                user_phone_number,
                                                user_encrypted_password,
                                                user_is_actived,
                                                user_is_banned,
                                                user_is_deleted,
                                                user_actived_since,
                                                user_banned_since,
                                                user_deleted_since,
                                                user_total_followed_food_place,
                                                user_total_gotten_voucher);

            UserController userController = new UserController();
            userController.InsertNewUserController(user_info);

            // add user through JSON
            // userController.InsertNewUserController(user_info1);
            //System.out.println("INSERT DATA TO DB is successful.");
            return res.status();

            //return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS));
        });

// post signup by phone number
        post("/v1/user-operation/signup-phone-number", (req, res) -> {

            res.type("application/json");
            // put data through body. JSON
            User_Info user_info1 = new Gson().fromJson(req.body(), User_Info.class);



            return new Gson()
                    .toJson(new StandardResponse(StatusResponse.SUCCESS));
        });








    }



}
