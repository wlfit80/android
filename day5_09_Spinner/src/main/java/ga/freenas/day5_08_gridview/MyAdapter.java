package ga.freenas.day5_08_gridview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    private ArrayList<String> mDataS;
    public MyAdapter(ArrayList<String> dataS) {
        mDataS=dataS;
    }

    @Override
    public int getCount() {
        return mDataS.size();
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.lv_item_layout, null);
        TextView tv = view.findViewById(R.id.tv);
        tv.setText(mDataS.get(position));
        return view;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


}
