package com.example.framlayout;
//do it android 2_5

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //xml과 자바 소스코드가 분리 되어있음으로 자바코드에서 xml에서 사진을 찾아야지 changeImage 함수에서 사용이 가능하다
    //Imageview를 가르킬 변수를 선언한다.
    ImageView imageView1;
    ImageView imageView2;

    int imageIndex =0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //onCreate메소드에서 첫 번째 변수인 imageView1에 id를 이용해 view를 찾는 함수인 findViewById를 이용해
        //id를(xml에서) 찾고 첫번째 변수에 할당 해준다.
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);//이제 두변수에 모두 사진을 찾아서 넣음
    }

    public void onButton_1_Clicked(View v){
        changeImage();
    }

    public void changeImage(){
        //번갈아 가면서 보여줘야 하기 떄문에 if문을 사용한다.
            if (imageIndex == 0) {
                //setVisibility: 이미지가 보이는것의 유무를 설정해준다.
                //VISIBLE: 보이게 하는것 
                imageView1.setVisibility(View.VISIBLE); //첫번쨰 변수에 담긴 이미지를 보이게 해줌
                imageView2.setVisibility((View.INVISIBLE));//두번째 변수에 담긴 이미지는 보여주지 않는다.
                imageIndex =1;
            }
            else if(imageIndex == 1)  
            {
                imageView1.setVisibility(View.INVISIBLE); //첫번쨰 변수에 담긴 이미지를 보이게 해줌
                imageView2.setVisibility((View.VISIBLE));//두번째 변수에 담긴 이미지는 보여주지 않는다.
                imageIndex =0;
            }   
    }
}