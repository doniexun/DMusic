package com.d.dmusic.module.greendao.music;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import com.d.dmusic.module.greendao.music.base.MusicModel;

/**
 * Entity mapped to table "CUSTOM_MUSIC0".
 */
public class CustomMusic3 extends MusicModel {

    public CustomMusic3() {
    }

    public CustomMusic3(String url) {
        this.url = url;
    }

    public CustomMusic3(String url, String songName, String singer, String album, Long duration, Long size, String filePostfix, String folder, String lrcName, String lrcUrl, Boolean isCollected, Integer seq, Long timeStamp) {
        super(url, songName, singer, album, duration, size, filePostfix, folder, lrcName, lrcUrl, isCollected, seq, timeStamp);
    }
}