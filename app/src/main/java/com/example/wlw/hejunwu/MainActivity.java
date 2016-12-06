package com.example.wlw.hejunwu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   private ListView mListView;
    private EditText mEditText;
    private Button mButton;
    private MsgAdapter msgAdapter;
    private List<Msg>msgList=new ArrayList<Msg>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ini();
        msgAdapter=new MsgAdapter(this,R.layout.list_item_msg, msgList);
        mListView=(ListView) findViewById(R.id.activity_main_list_view);
        mButton=(Button)findViewById(R.id.activity_main_btn_send);
        mEditText=(EditText)findViewById(R.id.activity_main_list_put);
        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String content=mEditText.getText().toString();
                if (!"".equals(content)){
                    Msg msg=new Msg(content,Msg.TYPE_SENT);
                    msgList.add(msg);
                    msgAdapter.notifyDataSetChanged();
                    mListView.setSelection(msgList.size());
                    mEditText.setText("");
                }
            }

        });
    }
}
