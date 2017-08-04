package com.gwc.denise.listapp;

/**
 * Created by denise on 7/31/17.
 */

public class Sisters {

    // The name of my GWC Sisters
    private String mName;

    // My GWC SIster's email address (to keep in touch!)
    private String mEmailAddress;

    //Store image resource ID
    private int mImageResID;

    public Sisters(String name, String emailAddress){
        mName = name;
        mEmailAddress = emailAddress;
    }

    public Sisters(String name, String emailAddress, int imageResID){
        mName = name;
        mEmailAddress = emailAddress;
        mImageResID = imageResID;
    }

    public String getName(){
        return mName;
    }

    public String getEmailAddress(){
        return mEmailAddress;
    }

    public int getImageResID() { return mImageResID;}
}
