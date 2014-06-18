package jp.ac.st.asojuku.original2014_002;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

public class MainActivity extends Activity implements View.OnClickListener {
	
	SQLiteDatabase sdb = null;
	MySQLiteOpenHelper helper = null;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
		Button btnENTRY = (Button)findviewByid(R.id.btnENTRY);
		btnENTRY.setOnClickListener(this);
		
		Button btnMAINTE = (Button)findViewByid(R.id.btnMAINTE);
		btnMAINTE.setOnClickListener
		
		Button btnCHECK = (Button)findViewByid(R.id.btnCHECK);
		btnCHECK.setOnClickListener(this);
	}
	if(sdb == null) {
			helper = new MySQLiteOpenHelper(getApplicatContext());			
	}
	try{
		sdb = helper.getWritableDatabase();
	}catch(SQLiteException e){
			
		return;		
		}
	}
	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		
	}
		
}