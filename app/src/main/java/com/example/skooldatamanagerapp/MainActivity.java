package com.example.skooldatamanagerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button sendData;
    private EditText name1, name2, name3, name4,name5, marks1, marks2, marks3, marks4, marks5
            , grade1,grade2,grade3,grade4,grade5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          sendData = (Button)findViewById(R.id.bt_send_information_id);
          name1 = (EditText)findViewById(R.id.et_student1_id);
          name2 = (EditText)findViewById(R.id.et_student2_id);
          name3 = (EditText)findViewById(R.id.et_student3_id);
          name4 = (EditText)findViewById(R.id.et_student4_id);
          name5 = (EditText)findViewById(R.id.et_student5_id);
          marks1 = (EditText)findViewById(R.id.et_marks1_id);
          marks2 = (EditText)findViewById(R.id.et_marks2_id);
        marks3 = (EditText)findViewById(R.id.et_marks3_id);
        marks4 = (EditText)findViewById(R.id.et_marks4_id);
        marks5 = (EditText)findViewById(R.id.et_marks5_id);
        grade1 = (EditText)findViewById(R.id.et_grade1_id);
        grade2 = (EditText)findViewById(R.id.et_grade2_id);
        grade3 = (EditText)findViewById(R.id.et_grade3_id);
        grade4 = (EditText)findViewById(R.id.et_grade4_id);
        grade5 = (EditText)findViewById(R.id.et_grade5_id);
        sendData.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  sendToDataBase();

              }
          });

    }

    private void sendToDataBase() {
        String Student1 =name1.getText().toString();
        String Student2 =name2.getText().toString();
        String Student3 =name3.getText().toString();
        String Student4 =name4.getText().toString();
        String Student5 =name5.getText().toString();

        String Marks1 = marks1.getText().toString();
        String Marks2 = marks2.getText().toString();
        String Marks3 = marks3.getText().toString();
        String Marks4 = marks4.getText().toString();
        String Marks5 = marks5.getText().toString();

        String Grade1 = grade1.getText().toString();
        String Grade2 = grade2.getText().toString();
        String Grade3 = grade3.getText().toString();
        String Grade4 = grade4.getText().toString();
        String Grade5 = grade5.getText().toString();

        if (!TextUtils.isEmpty(Student1)&& !TextUtils.isEmpty(Student2)&&!TextUtils.isEmpty(Student3)&&
                !TextUtils.isEmpty(Student4)&&!TextUtils.isEmpty(Student5)&&!TextUtils.isEmpty(Marks1)&&!TextUtils.isEmpty(Marks2)&&
                 !TextUtils.isEmpty(Marks3)&&!TextUtils.isEmpty(Marks4)&&!TextUtils.isEmpty(Marks5)&&!TextUtils.isEmpty(Grade1)&&
                  !TextUtils.isEmpty(Grade2)&& !TextUtils.isEmpty(Grade3)&& !TextUtils.isEmpty(Grade4)&&!TextUtils.isEmpty(Grade5)){

        }else{}







    }
}
