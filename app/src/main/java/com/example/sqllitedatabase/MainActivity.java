package com.example.sqllitedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener{

    EditText editRollno,editName,editMarks;
    Button btnAdd,btnDelete,btnModify,btnView,btnViewAll,btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editRollno=findViewById(R.id.editRollno);
        editName=findViewById(R.id.editName);
        editMarks=findViewById(R.id.editRollno);
        btnAdd=findViewById(R.id.btnAdd);
        btnDelete=findViewById(R.id.btnDelete);
        btnModify=findViewById(R.id.btnModify);
        btnView=findViewById(R.id.btnView);
        btnViewAll=findViewById(R.id.btnViewAll);
        btnShow=findViewById(R.id.btnShow);




        btnAdd.setOnClickListener(this);
        btnDelete.setOnClickListener(this);
        btnModify.setOnClickListener(this);
        btnView.setOnClickListener(this);
        btnViewAll.setOnClickListener(this);
        btnShow.setOnClickListener(this);
        editRollno.setOnClickListener(this);
        editName.setOnClickListener(this);
        editMarks.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {


        switch (view.getId()){

            case R.id.btnAdd:
                Toast.makeText(this,"Add",Toast.LENGTH_SHORT).show();
                break;


            case R.id.btnDelete:
                Toast.makeText(this,"Add",Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnModify:
                Toast.makeText(this,"Add",Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnView:
                Toast.makeText(this,"Add",Toast.LENGTH_SHORT).show();
                break;


            case R.id.btnViewAll:
                Toast.makeText(this,"Add",Toast.LENGTH_SHORT).show();
                break;


            case R.id.btnShow:
                Toast.makeText(this,"Add",Toast.LENGTH_SHORT).show();
                break;



            case R.id.editName:
                Toast.makeText(this,"Add",Toast.LENGTH_SHORT).show();
                break;



            case R.id.editRollno:
                Toast.makeText(this,"Add",Toast.LENGTH_SHORT).show();
                break;


            case R.id.editMarks:
                Toast.makeText(this,"Add",Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
