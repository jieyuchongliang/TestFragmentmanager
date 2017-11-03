package vlayout.fujisoft.com.testfragmentmanager.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import vlayout.fujisoft.com.testfragmentmanager.R;

/**
 * Created by 860617010 on 2017/11/1.
 */

public class OneFragment extends Fragment {

    private static final String TAG = "OneFragment";
    private Context context;
    private EditText editText;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
        Log.i(TAG, "------onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "------onCreate: ");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one,container,false);
        editText = (EditText) view.findViewById(R.id.et_edit);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG, "------onActivityCreated: ");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "------onStart: ");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "------onResume: ");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "------onPause: ");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "------onStop: ");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "------onDestroyView: ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "------onDestroy: ");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, "------onDetach: ");
    }

    public void log(String string) {
        Log.i(TAG, "log: 我尼玛"+string);
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        Log.i(TAG, "onHiddenChanged: " + hidden);
    }
}
