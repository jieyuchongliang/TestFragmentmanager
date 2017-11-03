package vlayout.fujisoft.com.testfragmentmanager.adapter;

import android.content.Context;
import android.widget.TextView;

import java.util.List;

import vlayout.fujisoft.com.testfragmentmanager.R;
import vlayout.fujisoft.com.testfragmentmanager.bean.Person;
import vlayout.fujisoft.com.testfragmentmanager.commen.BaseCommenAdapter;

/**
 * Created by 860617010 on 2017/11/1.
 */

public class PersonListAdapter extends BaseCommenAdapter<Person>  {
    private TextView tvName, tvAddress;

    public PersonListAdapter(Context context, List<Person> list) {
        super(context, list);
    }

    @Override
    protected void dataBind(int position) {

    }

    @Override
    protected BaseCommenAdapter.MyHolder getHolder() {
        return null;
    }

    @Override
    protected void findview(MyHolder holder) {

    }

    @Override
    public int getLayout() {
        return R.layout.item_person_list;
    }
}
