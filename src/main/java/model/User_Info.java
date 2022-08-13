package model;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.UUID;

public class User_Info {

    private UUID user_id;
    private String user_name;
    private String user_image_url;
    private String user_type_login;
    private String user_phone_number;
    private String user_encrypted_password;
    private boolean user_is_actived;
    private boolean user_is_banned;
    private boolean user_is_deleted;
    private Timestamp user_actived_since;
    private Timestamp user_banned_since;
    private Timestamp user_deleted_since;
    private BigInteger user_total_followed_food_place;
    private BigInteger user_total_gotten_voucher;

    // constructor
    public User_Info(UUID user_id,
                     String user_name,
                     String user_image_url,
                     String user_type_login,
                     String user_phone_number,
                     String user_encrypted_password,
                     boolean user_is_actived,
                     boolean user_is_banned,
                     boolean user_is_deleted,
                     Timestamp user_actived_since,
                     Timestamp user_banned_since,
                     Timestamp user_deleted_since,
                     BigInteger user_total_followed_food_place,
                     BigInteger user_total_gotten_voucher) {

        this.user_id = user_id;
        this.user_name = user_name;
        this.user_image_url = user_image_url;
        this.user_type_login = user_type_login;
        this.user_phone_number = user_phone_number;
        this.user_encrypted_password = user_encrypted_password;
        this.user_is_actived = user_is_actived;
        this.user_is_banned = user_is_banned;
        this.user_is_deleted = user_is_deleted;
        this.user_actived_since = user_actived_since;
        this.user_banned_since = user_banned_since;
        this.user_deleted_since = user_deleted_since;
        this.user_total_followed_food_place = user_total_followed_food_place;
        this.user_total_gotten_voucher = user_total_gotten_voucher;
    }

    // Get and set


    public UUID getUser_id() {
        return user_id;
    }

    public void setUser_id(UUID user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_image_url() {
        return user_image_url;
    }

    public void setUser_image_url(String user_image_url) {
        this.user_image_url = user_image_url;
    }

    public String getUser_type_login() {
        return user_type_login;
    }

    public void setUser_type_login(String user_type_login) {
        this.user_type_login = user_type_login;
    }

    public String getUser_phone_number() {
        return user_phone_number;
    }

    public void setUser_phone_number(String user_phone_number) {
        this.user_phone_number = user_phone_number;
    }

    public String getUser_encrypted_password() {
        return user_encrypted_password;
    }

    public void setUser_encrypted_password(String user_encrypted_password) {
        this.user_encrypted_password = user_encrypted_password;
    }

    public boolean isUser_is_actived() {
        return user_is_actived;
    }

    public void setUser_is_actived(boolean user_is_actived) {
        this.user_is_actived = user_is_actived;
    }

    public boolean isUser_is_banned() {
        return user_is_banned;
    }

    public void setUser_is_banned(boolean user_is_banned) {
        this.user_is_banned = user_is_banned;
    }

    public boolean isUser_is_deleted() {
        return user_is_deleted;
    }

    public void setUser_is_deleted(boolean user_is_deleted) {
        this.user_is_deleted = user_is_deleted;
    }

    public Timestamp getUser_actived_since() {
        return user_actived_since;
    }

    public void setUser_actived_since(Timestamp user_actived_since) {
        this.user_actived_since = user_actived_since;
    }

    public Timestamp getUser_banned_since() {
        return user_banned_since;
    }

    public void setUser_banned_since(Timestamp user_banned_since) {
        this.user_banned_since = user_banned_since;
    }

    public Timestamp getUser_deleted_since() {
        return user_deleted_since;
    }

    public void setUser_deleted_since(Timestamp user_deleted_since) {
        this.user_deleted_since = user_deleted_since;
    }

    public BigInteger getUser_total_followed_food_place() {
        return user_total_followed_food_place;
    }

    public void setUser_total_followed_food_place(BigInteger user_total_followed_food_place) {
        this.user_total_followed_food_place = user_total_followed_food_place;
    }

    public BigInteger getUser_total_gotten_voucher() {
        return user_total_gotten_voucher;
    }

    public void setUser_total_gotten_voucher(BigInteger user_total_gotten_voucher) {
        this.user_total_gotten_voucher = user_total_gotten_voucher;
    }
}
