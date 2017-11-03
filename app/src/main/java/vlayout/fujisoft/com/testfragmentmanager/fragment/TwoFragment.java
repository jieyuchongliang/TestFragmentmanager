package vlayout.fujisoft.com.testfragmentmanager.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import vlayout.fujisoft.com.testfragmentmanager.R;
import vlayout.fujisoft.com.testfragmentmanager.adapter.PersonDetailListAdapter;
import vlayout.fujisoft.com.testfragmentmanager.bean.Person;

/**
 * Created by 860617010 on 2017/11/1.
 */

public class TwoFragment extends Fragment implements View.OnClickListener {

    private ListView listView;
    private Context context;
    private Button btnChangeInfo;
    private PersonDetailListAdapter adapter;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_person_show, container, false);
        listView = (ListView) view.findViewById(R.id.lv_show_person_info);
        btnChangeInfo = (Button) view.findViewById(R.id.btn_change_info);
        btnChangeInfo.setOnClickListener(this);
        initEvent();
        return view;
    }

    private void initEvent() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("刘涛","嘉祥"));
        list.add(new Person("黄磊","德州"));
        list.add(new Person("黄渤","青岛"));
        list.add(new Person("黄圣依","济南"));
        adapter = new PersonDetailListAdapter(context,list);
        listView.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("周星驰","香港"));
        list.add(new Person("周华健","东北"));
        list.add(new Person("周文","青岛"));
        list.add(new Person("周芷若","济南"));
        adapter.setList(list);
        adapter.notifyDataSetChanged();
    }
}
