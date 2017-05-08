package com.d.dmusic.module.greendao.music;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.d.dmusic.module.greendao.music.CustomList;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CUSTOM_LIST".
*/
public class CustomListDao extends AbstractDao<CustomList, Long> {

    public static final String TABLENAME = "CUSTOM_LIST";

    /**
     * Properties of entity CustomList.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property ListName = new Property(1, String.class, "listName", false, "LIST_NAME");
        public final static Property SongCount = new Property(2, Long.class, "songCount", false, "SONG_COUNT");
        public final static Property Seq = new Property(3, Integer.class, "seq", false, "SEQ");
        public final static Property SortBy = new Property(4, Integer.class, "sortBy", false, "SORT_BY");
        public final static Property Pointer = new Property(5, Integer.class, "pointer", false, "POINTER");
    };


    public CustomListDao(DaoConfig config) {
        super(config);
    }
    
    public CustomListDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CUSTOM_LIST\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"LIST_NAME\" TEXT," + // 1: listName
                "\"SONG_COUNT\" INTEGER," + // 2: songCount
                "\"SEQ\" INTEGER," + // 3: seq
                "\"SORT_BY\" INTEGER," + // 4: sortBy
                "\"POINTER\" INTEGER);"); // 5: pointer
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CUSTOM_LIST\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, CustomList entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String listName = entity.getListName();
        if (listName != null) {
            stmt.bindString(2, listName);
        }
 
        Long songCount = entity.getSongCount();
        if (songCount != null) {
            stmt.bindLong(3, songCount);
        }
 
        Integer seq = entity.getSeq();
        if (seq != null) {
            stmt.bindLong(4, seq);
        }
 
        Integer sortBy = entity.getSortBy();
        if (sortBy != null) {
            stmt.bindLong(5, sortBy);
        }
 
        Integer pointer = entity.getPointer();
        if (pointer != null) {
            stmt.bindLong(6, pointer);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public CustomList readEntity(Cursor cursor, int offset) {
        CustomList entity = new CustomList( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // listName
            cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2), // songCount
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // seq
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // sortBy
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5) // pointer
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, CustomList entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setListName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setSongCount(cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2));
        entity.setSeq(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setSortBy(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setPointer(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(CustomList entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(CustomList entity) {
        if(entity != null) {
            return entity.getId();
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
