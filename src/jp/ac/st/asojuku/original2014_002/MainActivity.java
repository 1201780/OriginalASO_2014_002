package jp.ac.st.asojuku.original2014_002;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
		btnMAINTE.setOnClickListener(this);

		Button btnCHECK = (Button)findViewByid(R.id.btnCHECK);
		btnCHECK.setOnClickListener(this);

	if(sdb == null) {
			helper = new MySQLiteOpenHelper(getApplicationContext());
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

		Intent intent = null;
		switch(v.getId()) {
			case R.id.btnENTRY:

				EditText etv = (EditText)findviewByid(R.id.edtMsg);
				String inputMsg = etv.getText().toString();


				if(inputMsg != null && !inputMsg.isEmpty()){

					helper.insertHitokoto(sdb, inputMsg);
				}


				etv.setText("");
				break;
			case R.id.btnMAINTE:


				intent = new Intent(MainActivity.this, MaintenanceActivity.class);

				startActivity(intent);
			break;
			case R.id.btnCHECK:



				String strHitokoto = helper.selectRandomHitokoto(sdb);


				intent = new Intent(MainActivity.this, HitokotoActivity.class);

				intent.putExtra("hitokoto", strHitokoto);


				startActivity(intent);
			break;


		}
	}
}