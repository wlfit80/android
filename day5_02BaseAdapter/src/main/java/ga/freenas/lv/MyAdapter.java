package ga.freenas.lv;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class  MyAdapter extends BaseAdapter {
    private ArrayList<String> mDatas;
    public MyAdapter(ArrayList<String> datas) {
        mDatas=datas;

    }

    @Override
    public int getCount() {
        Log.v("520it","getCount");
        return mDatas.size();
    }

    /**
     *
     * @param position 索引
     * @param convertView
     * @param parent 每个ItemView里面的容器,返回View直接
     * @return
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
//        View view = layoutInflater.inflate(R.layout.lv_item_layout, null);
//        View view = layoutInflater.inflate(android.R.layout.simple_list_item_1, null);
//        TextView tv = view.findViewById(R.id.tv);
//        TextView tv = view.findViewById(android.R.id.text1);
            View view = layoutInflater.inflate(android.R.layout.simple_list_item_2, null);
            convertView = view;
        }
//        Log.v("520it", "getView position="+position);
/*        TextView tv = new TextView(parent.getContext());
        //设置宽高
        tv.setLayoutParams(new AbsListView.LayoutParams(
                AbsListView.LayoutParams.MATCH_PARENT,
                AbsListView.LayoutParams.WRAP_CONTENT
        ));
        //设置字体大小
        tv.setTextSize(30);
        //添加数据
        tv.setText(mDatas.get(position));*/
        //LayoutInflater 布局冲气的一个类,就是将一个布局转换成View
        TextView tv1 = convertView.findViewById(android.R.id.text1);
        TextView tv2 = convertView.findViewById(android.R.id.text2);
        tv1.setText(mDatas.get(position));
        tv2.setText(mDatas.get(position));
        return convertView;
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
