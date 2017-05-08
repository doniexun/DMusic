package com.d.dmusic.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.d.dmusic.R;

/**
 * Created by D on 2017/5/7.
 */

public class SongHeaderView extends LinearLayout implements View.OnClickListener {
    private ImageView ivPlayAll;
    private LinearLayout llytPlayAll;
    private TextView tvSongCount;
    private ImageView ivHandler;
    private OnHeaderListener listener;

    public SongHeaderView(Context context) {
        this(context, null);
    }

    public SongHeaderView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SongHeaderView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        View root = LayoutInflater.from(context).inflate(R.layout.header_song, this);
        ivPlayAll = (ImageView) root.findViewById(R.id.iv_header_song_play_all);
        llytPlayAll = (LinearLayout) root.findViewById(R.id.llyt_header_song_play_all);
        tvSongCount = (TextView) root.findViewById(R.id.tv_header_song_count);
        ivHandler = (ImageView) root.findViewById(R.id.iv_header_song_handler);
        ivPlayAll.setOnClickListener(this);
        llytPlayAll.setOnClickListener(this);
        ivHandler.setOnClickListener(this);
    }

    public void setSongCount(int count) {
        tvSongCount.setText(count + "首");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_header_song_play_all:
            case R.id.llyt_header_song_play_all:
                if (listener != null) {
                    listener.onPlayAll();
                }
                break;
            case R.id.iv_header_song_handler:
                if (listener != null) {
                    listener.onHandle();
                }
                break;
        }
    }

    public interface OnHeaderListener {
        void onPlayAll();

        void onHandle();
    }

    public void setOnHeaderListener(OnHeaderListener listener) {
        this.listener = listener;
    }
}
