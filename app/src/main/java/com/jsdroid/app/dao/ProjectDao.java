package com.jsdroid.app.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.jsdroid.app.entity.Project;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "PROJECT".
*/
public class ProjectDao extends AbstractDao<Project, Long> {

    public static final String TABLENAME = "PROJECT";

    /**
     * Properties of entity Project.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Fold = new Property(2, String.class, "fold", false, "FOLD");
        public final static Property File = new Property(3, String.class, "file", false, "FILE");
        public final static Property Icon = new Property(4, String.class, "icon", false, "ICON");
        public final static Property Note = new Property(5, String.class, "note", false, "NOTE");
        public final static Property Pkg = new Property(6, String.class, "pkg", false, "PKG");
        public final static Property Version = new Property(7, String.class, "version", false, "VERSION");
        public final static Property CreateTime = new Property(8, java.util.Date.class, "createTime", false, "CREATE_TIME");
        public final static Property UpdateTime = new Property(9, java.util.Date.class, "updateTime", false, "UPDATE_TIME");
    }


    public ProjectDao(DaoConfig config) {
        super(config);
    }
    
    public ProjectDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"PROJECT\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"NAME\" TEXT," + // 1: name
                "\"FOLD\" TEXT," + // 2: fold
                "\"FILE\" TEXT," + // 3: file
                "\"ICON\" TEXT," + // 4: icon
                "\"NOTE\" TEXT," + // 5: note
                "\"PKG\" TEXT," + // 6: pkg
                "\"VERSION\" TEXT," + // 7: version
                "\"CREATE_TIME\" INTEGER," + // 8: createTime
                "\"UPDATE_TIME\" INTEGER);"); // 9: updateTime
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"PROJECT\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Project entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String fold = entity.getFold();
        if (fold != null) {
            stmt.bindString(3, fold);
        }
 
        String file = entity.getFile();
        if (file != null) {
            stmt.bindString(4, file);
        }
 
        String icon = entity.getIcon();
        if (icon != null) {
            stmt.bindString(5, icon);
        }
 
        String note = entity.getNote();
        if (note != null) {
            stmt.bindString(6, note);
        }
 
        String pkg = entity.getPkg();
        if (pkg != null) {
            stmt.bindString(7, pkg);
        }
 
        String version = entity.getVersion();
        if (version != null) {
            stmt.bindString(8, version);
        }
 
        java.util.Date createTime = entity.getCreateTime();
        if (createTime != null) {
            stmt.bindLong(9, createTime.getTime());
        }
 
        java.util.Date updateTime = entity.getUpdateTime();
        if (updateTime != null) {
            stmt.bindLong(10, updateTime.getTime());
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Project entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String fold = entity.getFold();
        if (fold != null) {
            stmt.bindString(3, fold);
        }
 
        String file = entity.getFile();
        if (file != null) {
            stmt.bindString(4, file);
        }
 
        String icon = entity.getIcon();
        if (icon != null) {
            stmt.bindString(5, icon);
        }
 
        String note = entity.getNote();
        if (note != null) {
            stmt.bindString(6, note);
        }
 
        String pkg = entity.getPkg();
        if (pkg != null) {
            stmt.bindString(7, pkg);
        }
 
        String version = entity.getVersion();
        if (version != null) {
            stmt.bindString(8, version);
        }
 
        java.util.Date createTime = entity.getCreateTime();
        if (createTime != null) {
            stmt.bindLong(9, createTime.getTime());
        }
 
        java.util.Date updateTime = entity.getUpdateTime();
        if (updateTime != null) {
            stmt.bindLong(10, updateTime.getTime());
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Project readEntity(Cursor cursor, int offset) {
        Project entity = new Project( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // fold
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // file
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // icon
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // note
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // pkg
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // version
            cursor.isNull(offset + 8) ? null : new java.util.Date(cursor.getLong(offset + 8)), // createTime
            cursor.isNull(offset + 9) ? null : new java.util.Date(cursor.getLong(offset + 9)) // updateTime
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Project entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setFold(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setFile(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setIcon(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setNote(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setPkg(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setVersion(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setCreateTime(cursor.isNull(offset + 8) ? null : new java.util.Date(cursor.getLong(offset + 8)));
        entity.setUpdateTime(cursor.isNull(offset + 9) ? null : new java.util.Date(cursor.getLong(offset + 9)));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Project entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Project entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Project entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}