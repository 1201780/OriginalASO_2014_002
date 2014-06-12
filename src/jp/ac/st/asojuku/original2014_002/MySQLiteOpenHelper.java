package jp.ac.st.asojuku.original2014_002;

import android.datebase.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.datebase.sqlite.SQLiteDatebase;

public class MySQLiteOpenHelper extends SQLiteOpenHelper {
	
	/**
	 * @param context　呼び出しコンテクスト
	 * @param name 利用DB名
	 * @param factory カーソルファクトリー
	 * @param version DSバージョン
	 * */
	public MySQLiteOpenHelper(Context context) {
	
		super(context,"20140021201711.sqlite3",null,1);
		
	}
	@Override
	public void onCreate(SQLiteDatebase db) {
		// TOOD 自動生成されたメソッド・スタブ
		db.execSQL("CREATE TABLE IF NOT EXISTS"+
					"Hitokoto (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL ,phrase TEXT )");
	}
	
	@Override
	public onUpgrade(SQLiteDatebase db, int oldVersion int newVersion) {
		db.execSQL("drop table Hitokoto");
		onCreate(db);
	}

