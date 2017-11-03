package vlayout.fujisoft.com.testfragmentmanager;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import vlayout.fujisoft.com.testfragmentmanager.fragment.OneFragment;
import vlayout.fujisoft.com.testfragmentmanager.fragment.TwoFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnOne, btnTwo;
//    private FragmentManager fm;
//    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        fm = getSupportFragmentManager();
//        transaction = fm.beginTransaction();
//        OneFragment oneFragment = new OneFragment();
//        TwoFragment twoFragment = new TwoFragment();
//        transaction.add(R.id.container, oneFragment, "one");
//        transaction.add(R.id.container, twoFragment, "two");
//        transaction.hide(twoFragment);
//        transaction.show(oneFragment);
//        transaction.commit();
        initView();
    }

    private void initView() {
        btnOne = (Button) findViewById(R.id.btn_one);
        btnTwo = (Button) findViewById(R.id.btn_second);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_one:
                addFragment();
                break;
            case R.id.btn_second:
                addTwoFragment();
                break;
        }
    }

    private void addTwoFragment() {
//        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//        OneFragment oneFragment = (OneFragment) fm.findFragmentByTag("one");
//        TwoFragment twoFragment = (TwoFragment) fm.findFragmentByTag("two");
//        if (twoFragment.isHidden()) {
//            ft.show(twoFragment);
//            ft.hide(oneFragment);
//        }
//        ft.commit();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container,new TwoFragment(),"two");
        ft.commit();
    }

    private void addFragment() {
//        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//        OneFragment oneFragment = (OneFragment) fm.findFragmentByTag("one");
//        TwoFragment twoFragment = (TwoFragment) fm.findFragmentByTag("two");
//        if (oneFragment.isHidden()) {
//            ft.show(oneFragment);
//            ft.hide(twoFragment);
//        }
//        ft.commit();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container,new OneFragment(),"one");
        ft.commit();
    }
}
