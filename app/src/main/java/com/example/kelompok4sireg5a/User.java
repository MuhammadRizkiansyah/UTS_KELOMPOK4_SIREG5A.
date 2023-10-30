package com.example.kelompok4sireg5a;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
    private String username,name,Alamat,Email,repository,followers,following,alamat;
    private int avatar;

    public User() {

    }
    public void setAlamat(String alamat){this.alamat = alamat;}

    public  String getAlamat(){return alamat;}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public String getFollowers() {
        return followers;
    }

    public void setFollowers(String followers) {
        this.followers = followers;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }




    public static Creator<User> getCREATOR() {
        return CREATOR;
    }

    protected User(Parcel in) {
        username = in.readString();
        name = in.readString();
        Alamat = in.readString();
        Email = in.readString();
        repository = in.readString();
        followers = in.readString();
        following = in.readString();
        avatar = in.readInt();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(username);
        dest.writeString(name);
        dest.writeString(Alamat);
        dest.writeString(Email);
        dest.writeString(repository);
        dest.writeString(followers);
        dest.writeString(following);
        dest.writeInt(avatar);
    }
}