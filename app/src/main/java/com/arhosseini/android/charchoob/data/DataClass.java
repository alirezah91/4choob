package com.arhosseini.android.charchoob.data;

import android.net.Uri;

/**
 * Created by Alireza on 04/12/2015.
 */
public class DataClass {

    // The "Content authority" is a name for the entire content provider
    public static final String CONTENT_AUTHORITY = "com.arhosseini.android.charchoob";

    // Use CONTENT_AUTHORITY to create the base of all URI's which apps will use to contact
    // the content provider.
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    // Possible paths (appended to base content URI for possible URI's)
    public static final String PATH_PRODUCT_CATEGORY = "product_category";
    public static final String PATH_PRODUCT = "product";
    public static final String PATH_USER = "user";

}
