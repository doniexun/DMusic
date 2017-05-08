package com.d.dmusic.module.greendao.music;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.d.dmusic.module.greendao.music.Music;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MUSIC".
*/
public class MusicDao extends AbstractDao<Music, String> {

    public static final String TABLENAME = "MUSIC";

    /**
     * Properties of entity Music.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Url = new Property(0, String.class, "url", true, "URL");
        public final static Property SongName = new Property(1, String.class, "songName", false, "SONG_NAME");
        public final static Property Singer = new Property(2, String.class, "singer", false, "SINGER");
        public final static Property Album = new Property(3, String.class, "album", false, "ALBUM");
        public final static Property Duration = new Property(4, Long.class, "duration", false, "DURATION");
        public final static Property Size = new Property(5, Long.class, "size", false, "SIZE");
        public final static Property FilePostfix = new Property(6, String.class, "filePostfix", false, "FILE_POSTFIX");
        public final static Property Folder = new Property(7, String.class, "folder", false, "FOLDER");
        public final static Property LrcName = new Property(8, String.class, "lrcName", false, "LRC_NAME");
        public final static Property LrcUrl = new Property(9, String.class, "lrcUrl", false, "LRC_URL");
        public final static Property IsCollected = new Property(10, Boolean.class, "isCollected", false, "IS_COLLECTED");
        public final static Property Seq = new Property(11, Integer.class, "seq", false, "SEQ");
        public final static Property TimeStamp = new Property(12, Long.class, "timeStamp", false, "TIME_STAMP");
    };


    public MusicDao(DaoConfig config) {
        super(config);
    }
    
    public MusicDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MUSIC\" (" + //
                "\"URL\" TEXT PRIMARY KEY NOT NULL ," + // 0: url
                "\"SONG_NAME\" TEXT," + // 1: songName
                "\"SINGER\" TEXT," + // 2: singer
                "\"ALBUM\" TEXT," + // 3: album
                "\"DURATION\" INTEGER," + // 4: duration
                "\"SIZE\" INTEGER," + // 5: size
                "\"FILE_POSTFIX\" TEXT," + // 6: filePostfix
                "\"FOLDER\" TEXT," + // 7: folder
                "\"LRC_NAME\" TEXT," + // 8: lrcName
                "\"LRC_URL\" TEXT," + // 9: lrcUrl
                "\"IS_COLLECTED\" INTEGER," + // 10: isCollected
                "\"SEQ\" INTEGER," + // 11: seq
                "\"TIME_STAMP\" INTEGER);"); // 12: timeStamp
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MUSIC\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Music entity) {
        stmt.clearBindings();
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(1, url);
        }
 
        String songName = entity.getSongName();
        if (songName != null) {
            stmt.bindString(2, songName);
        }
 
        String singer = entity.getSinger();
        if (singer != null) {
            stmt.bindString(3, singer);
        }
 
        String album = entity.getAlbum();
        if (album != null) {
            stmt.bindString(4, album);
        }
 
        Long duration = entity.getDuration();
        if (duration != null) {
            stmt.bindLong(5, duration);
        }
 
        Long size = entity.getSize();
        if (size != null) {
            stmt.bindLong(6, size);
        }
 
        String filePostfix = entity.getFilePostfix();
        if (filePostfix != null) {
            stmt.bindString(7, filePostfix);
        }
 
        String folder = entity.getFolder();
        if (folder != null) {
            stmt.bindString(8, folder);
        }
 
        String lrcName = entity.getLrcName();
        if (lrcName != null) {
            stmt.bindString(9, lrcName);
        }
 
        String lrcUrl = entity.getLrcUrl();
        if (lrcUrl != null) {
            stmt.bindString(10, lrcUrl);
        }
 
        Boolean isCollected = entity.getIsCollected();
        if (isCollected != null) {
            stmt.bindLong(11, isCollected ? 1L: 0L);
        }
 
        Integer seq = entity.getSeq();
        if (seq != null) {
            stmt.bindLong(12, seq);
        }
 
        Long timeStamp = entity.getTimeStamp();
        if (timeStamp != null) {
            stmt.bindLong(13, timeStamp);
        }
    }

    /** @inheritdoc */
    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Music readEntity(Cursor cursor, int offset) {
        Music entity = new Music( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // url
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // songName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // singer
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // album
            cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4), // duration
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5), // size
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // filePostfix
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // folder
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // lrcName
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // lrcUrl
            cursor.isNull(offset + 10) ? null : cursor.getShort(offset + 10) != 0, // isCollected
            cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11), // seq
            cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12) // timeStamp
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Music entity, int offset) {
        entity.setUrl(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setSongName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setSinger(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setAlbum(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setDuration(cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4));
        entity.setSize(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
        entity.setFilePostfix(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setFolder(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setLrcName(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setLrcUrl(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setIsCollected(cursor.isNull(offset + 10) ? null : cursor.getShort(offset + 10) != 0);
        entity.setSeq(cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11));
        entity.setTimeStamp(cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12));
     }
    
    /** @inheritdoc */
    @Override
    protected String updateKeyAfterInsert(Music entity, long rowId) {
        return entity.getUrl();
    }
    
    /** @inheritdoc */
    @Override
    public String getKey(Music entity) {
        if(entity != null) {
            return entity.getUrl();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
