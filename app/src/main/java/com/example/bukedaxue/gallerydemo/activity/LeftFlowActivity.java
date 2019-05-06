package com.example.bukedaxue.gallerydemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.bukedaxue.gallerydemo.Adapter;
import com.example.bukedaxue.gallerydemo.R;
import com.example.bukedaxue.gallerydemo.recyclerflow.RecyclerLeftFlow;

public class LeftFlowActivity extends AppCompatActivity implements Adapter.onItemClick {

    private RecyclerLeftFlow mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_left_flow);
        initList();
    }

    private void initList() {
        mList =  findViewById(R.id.list);
        mList.setAdapter(new Adapter(this, this));
        /*mList.setOnItemSelectedListener(new CoverFlowLayoutManger.OnSelected() {
            @Override
            public void onItemSelected(int position) {
                ((TextView)findViewById(R.id.index)).setText((position+1)+"/"+mList.getLayoutManager().getItemCount());
            }
        });*/
    }

    @Override
    public void clickItem(int pos) {
        mList.smoothScrollToPosition(pos);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
