package vlayout.fujisoft.com.testfragmentmanager.commen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by 860617010 on 2017/11/1.
 */

public abstract class BaseCommenAdapter<T> extends CommenAdapter<T> {


    private int layout;

    public BaseCommenAdapter(Context context, List<T> list) {
        super(context, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyHolder holder = null;
        if (convertView == null) {
            holder = getHolder();
            int layout = getLayout();
            convertView = LayoutInflater.from(context).inflate(layout, parent, false);
            findview(holder);
            convertView.setTag(holder);
        }else {
            holder = (MyHolder) convertView.getTag();
        }
        dataBind(position);
        return convertView;
    }

    /**
     * 绑定数据
     */
    protected abstract void dataBind(int position);

    /**
     * 获取MyHolder对象
     * @return
     */
    protected abstract MyHolder getHolder();

    /**
     * 寻找控件
     */
    protected abstract void findview(MyHolder holder);

    /**
     * 获取listview的布局
     * @return
     */
    public abstract int getLayout();

    public interface MyHolder{};
}
