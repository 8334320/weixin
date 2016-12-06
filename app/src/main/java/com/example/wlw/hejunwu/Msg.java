package com.example.wlw.hejunwu;

/**
 * Created by wlw on 2016/12/5.
 */
public class Msg {
       public static final int TYPE_RECEIVED=0;
       public static final int TYPE_SENT=1;
       private String mContent;
       private int mType;
    public Msg(String Content,int type) {
        this.mContent = Content;
        this.mType = type;
    }
    public String getContent(){
          return  mContent;
    }
    public int getType(){
        return mType;
    }
}
