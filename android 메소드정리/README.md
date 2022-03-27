메소드 정리
===========
##### AVD에서 앱 아이콘 출력하기
```
// MainActivity
getSupportActionBar().setDisplayShowHomeEnabled(true);
getSupportActionBar().setIcon(R.drawable.파일명);

// AndroidMainifest.xml 11행 수정
android:theme="@style/Theme.AppCompat.Light.DarkActionBar"
```

##### text 속성
```
// activity_main.xml
android:text="@string+/변수명" 
(android:text="~" // 넣고싶은 문자열 바로 넣어도 가능)

// string.xml
<string name="변수명">쓰고싶은 말</string>
```

##### 실질적으로 앱을 실행시키는 메소드 : OnCreate(=main)
```
public class MainActivity extends AppCompatActivity {

    @Override 
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 화면에 레이아웃이 보이게함
        setContentView(R.layout.activity_main);
    }
}
```

##### 위젯에 이벤트가 발생했을 때의 동작 순서
```
// 1. 위젯변수 선언
 Button button1;
 
// 2. 변수에 activity_main.xml 파일의 위젯 id 대입
button1=(Button) findViewById(R.id.button1);

// 3. 이벤트 발생 시 동작하는 클래스를 위젯에 정의
button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
```

##### 메세지를 잠시 나타내주는 메소드
```
// 이벤트 발생 시 동작
Toast.makeText(getApplicationContext(),"버튼을 눌렀어요",Toast.LENGTH_LONG).show();
```

##### 홈페이지 열기
```
Intent mIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("url"));
startActivity(mIntent);
```

##### 전화걸기
```
Intent mIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/전화번호"));
startActivity(mIntent);
```

##### 갤러리 열기
```
Intent mIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("content://경로"));
startActivity(mIntent);
```

##### 버튼 배경색상 변경
```
버튼변수명.setBackgroundColor(Color.GREEN);
```
##### 버튼 글자색상 변경
```
버튼변수명.setTextColor(Color.BALCK);
```

##### Edit Text에서 입력받은 내용 가져오기
```
변수명.getText().toString() // String으로 가져오기
```

##### Linear layout에서 요소들 수직배치
```
android:orientation="vertical"
```

##### 변수가 비었는지 확인
```
변수명.isEmpty()
```


