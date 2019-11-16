package ga.freenas.day5_07_listeview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    private LayoutInflater mInflater;

    private ArrayList<String> dataS;
    public MyAdapter (MainActivity mainActivity) {
        mInflater =  LayoutInflater.from(mainActivity);
    }

    public void setDataS(ArrayList<String> dataS) {
        this.dataS = dataS;
    }

    @Override
    public int getCount() {
        return dataS!=null?dataS.size():0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tv=null;
        if (convertView==null){
            convertView = mInflater.inflate(android.R.layout.simple_list_item_1, null);
            tv = convertView.findViewById(android.R.id.text1);
            convertView.setTag(tv);
        }else   {
            tv= (TextView) convertView.getTag();
        }
        tv.setText(dataS.get(position));
        return convertView;
    }

    @Override
    public Object getItem(int position) {
        return dataS!=null?dataS.get(position):null;
    }

    @Override
    public long getItemId(int position) {
        return 5;
    }
}
