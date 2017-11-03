package vlayout.fujisoft.com.testfragmentmanager.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import vlayout.fujisoft.com.testfragmentmanager.commen.CommenAdapter;
import vlayout.fujisoft.com.testfragmentmanager.R;
import vlayout.fujisoft.com.testfragmentmanager.bean.Person;

/**
 * Created by 860617010 on 2017/11/1.
 */

public class PersonDetailListAdapter extends CommenAdapter<Person> {

    public PersonDetailListAdapter(Context context, List<Person> list) {
        super(context, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyHolder holder = null;
        if (convertView == null) {
            holder = new MyHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_person_list, parent, false);
            holder.tvAddress = (TextView) convertView.findViewById(R.id.tv_address);
            holder.tvName = (TextView) convertView.findViewById(R.id.tv_name);
            convertView.setTag(holder);
        } else {
            holder = (MyHolder) convertView.getTag();
        }
        holder.tvName.setText(list.get(position).getName());
        holder.tvAddress.setText(list.get(position).getAddress());
        return convertView;
    }

    class MyHolder {
        private TextView tvName, tvAddress;
    }
}
