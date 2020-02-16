package com.alaaddin.fayhaa.module;

public class Course_item {

    // default course
    private  String mcourse;
    private  int  mImageResourceId=NO_image_provided;
    // وصعنا الحالة الافتراضية لايوجد صورة لذلك عمدما يتغيير يكون هناك صورة
    private static final int NO_image_provided=-1;
    //(-1) قيمة خارج نطاق جميع قيم معرف الصورة mImageResourceId الصالحة والممكنة

    public boolean hasImage(){
        return mImageResourceId != NO_image_provided;
    }

    public Course_item(String mcourse, int mImageResourceId) {
        this.mcourse = mcourse;
        this.mImageResourceId = mImageResourceId;
    }

    public Course_item(String mcourse) {
        this.mcourse = mcourse;
    }

    public String getMcourse() {
        return mcourse;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

}
