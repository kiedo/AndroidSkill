package test.cn.example.com.androidskill;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by xgxg on 2017/8/9.
 * view的工作原理
 */
public class ChapterFourActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charapter_four);
        initView();

    }

    private void initView() {
        Button circleView = (Button)findViewById(R.id.circleView);
        circleView.setOnClickListener(this);
        Button customTitleView01 = (Button)findViewById(R.id.customTitleView01);
        customTitleView01.setOnClickListener(this);
    }




    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.circleView:
                startActivity(new Intent(ChapterFourActivity.this,CircleViewActivity.class));
                break;
            case R.id.customTitleView01:
                startActivity(new Intent(ChapterFourActivity.this,CircleViewActivity.class));
                break;
            default:
                break;
        }
    }
}
