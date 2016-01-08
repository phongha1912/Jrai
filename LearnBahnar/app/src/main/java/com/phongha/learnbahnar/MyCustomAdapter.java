package com.phongha.learnbahnar;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.TextView;

/**
 * Created by PHONGHA on 1/7/2016.
 */
public class MyCustomAdapter extends BaseAdapter implements ListAdapter {
    private String[] listMain;
    private String[] listSub;
    private int[] listAudio;
    private int idMain;
    private int idSub;
    private int idButton = -1;
    private Context context;
    private int layout;

    public MyCustomAdapter(String[] lstMain, String[] lstSub, int[] lstAudio, int idMain, int idSub, Context context, int layout, int idButton) {
        this.listMain = lstMain;
        this.listSub = lstSub;
        this.idMain = idMain;
        this.idSub = idSub;
        this.context = context;
        this.layout = layout;
        this.idButton = idButton;
        this.listAudio = lstAudio;
    }

    public MyCustomAdapter(String[] lstMain, String[] lstSub, int idMain, int idSub, Context context, int layout) {
        this.listMain = lstMain;
        this.listSub = lstSub;
        this.idMain = idMain;
        this.idSub = idSub;
        this.context = context;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return listMain.length;
    }

    @Override
    public Object getItem(int pos) {
        return listMain[pos];
    }

    @Override
    public long getItemId(int pos) {
        return 0;
        //just return 0 if your list items do not have an Id variable.
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
        }

        //Handle TextView and display string from your list
        TextView listItem= (TextView)view.findViewById(idMain);
        listItem.setText(listMain[position]);
        TextView listItem1= (TextView)view.findViewById(idSub);
        listItem1.setText(listSub[position]);

        if (idButton != -1) {
            Button addBtn = (Button)view.findViewById(idButton);
            if (position < listAudio.length) {
                final MediaPlayer mp = MediaPlayer.create(context, listAudio[position]);
                //Handle buttons and add onClickListeners
                addBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //do something
                        if (mp != null) {
                            mp.start();
                        }
                    }
                });
            }
        }
        return view;
    }
}
