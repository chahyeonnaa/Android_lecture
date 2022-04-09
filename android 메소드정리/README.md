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


##### 변수가 비었는지 확인 - 자바 메서드
```
변수명.isEmpty()
```

##### MainActivity에서 글자크기 지정하기
```
변수명.setTextSize(20);
```

##### CheckBox 선택 시 호출하는 리스너
```
변수명.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        });
```

##### 라디오 그룹 스위치문
```
  switch (rGroup1.getCheckedRadioButtonId()){
                    case 라디오버튼 변수:
                        // 해당버튼 클릭 시 일어나게할 동작
                        break;
                    default:
                }
```

##### 해당 변수에 이미지 세팅
```
변수명.setImageResource(R.drawable.이미지 파일명);
```

##### 텍스트 뷰에서 출력할 텍스트 설정
```
변수명.setText();
```

##### 프로그램 종료
```
finish();
```

##### Switch 움직이면 동작하는 리스너
```
     변수명.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
              
            }
        });
```

##### 체크, 선택할 수 있는 모든 것들 미선택 상태로 설정
```
변수명.setChecked(false);
```

##### padding - XML코드 
```
<LinearLayout>
android:padding="30dp"
<Button></Button> 
</LinearLayout>
// 상하좌우에 모두 지정하는 속성, 각각 따로 지정하고싶으면 paddingTop,paddingBottom,paddingLeft,paddingRight 이용
// 버튼에 지정하면, 버튼 내의 글자가 버튼의 경계선에서 일정 간격 떨어져서 표현됨
// 전체 틀에 패딩 속성을 부여해주면, 모든 위젯이 함께 움직인다.
```

##### layout_margin - XML코드
```
android:layout_margin="" // 주위 다른 위젯사이의 간격 조정, 각 위젯의 속성으로 지정해야함
```

##### enabled, clickable - XML코드
```
android:enabled="false" // 위젯의 동작 여부
android:clickable="false" // 클릭이나 터치가 가능하게함
```

##### rotation - XML코드
```
android:rotation="45" // 위젯을 회전시켜서 출력
```

##### text 속성 - XML코드
```
android:textface="" // 글꼴
```

##### ImageView - XML코드
```
android:layout_width="" // 사진 크기 지정
android:layout_height=""
```

##### HorizontalScrollView - 수평 스크롤뷰
```
  <HorizontalScrollView // 하나의 뷰만 포함할 수 있음, 여러 이미지를 넣고싶은 경우 하나의 LinearLayout안에 넣어야함
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        </HorizontalScrollView>
```

##### ScrollView - 수직 스크롤뷰
```
  <ScrollView // 하나의 뷰만 포함할 수 있음, 여러 이미지를 넣고싶은 경우 하나의 LinearLayout안에 넣어야함
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        </lScrollView>
```

##### XML 파일 없이 화면 코딩하기 - LinearLayout 코드
```
        LinearLayout.LayoutParams params= new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        LinearLayout baseLayout= new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(baseLayout,params);
```

##### XML 파일 없이 화면 코딩하기 - 다른 요소들도 이런 형태로 하면 된다.
```
   Button btn=new Button(this); // 버튼 변수 생성
   btn.setText("버튼입니다");
   btn.setBackgroundColor(Color.MAGENTA);
   baseLayout.addView(btn); // 버튼을 레이아웃에 출력
```

##### ConstraintLayout Guidelines 사용하기
- 뷰를 배치하기 위해 뷰그룹 내에 설정할 수 있는 일종의 기준선  
- layout_constraintGuide_begin: 세로 가이드라인이라면 왼쪽(start)에서부터 얼만큼 떨어져있는지, 가로 가이드라인이라면 위에서부터 얼만큼 떨어져있는지를 뜻한다
```
 <androidx.constraintlayout.widget.Guideline
        android:id="@+id/guideline2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        app:layout_constraintGuide_begin="500dp" />
```

##### layout_constraint<S1>_to<S2>Of 
- 해당 속성을 사용하는 위젯의  S1 사이드 부분을 타겟 위젯의 S2 사이드에 Constraint 한다 
- start(left),end(right),top,bottom
- parent는 상하좌우 사이드 벽을 의미
```
// 해당 버튼의 Bottom을 guideline2의 위쪽에 위치시킨다.
app:layout_constraintBottom_toTopOf="@+id/guideline2"
app:layout_constraintEnd_toStartOf="@+id/button2"
```

##### android:layout_<width,height>="0dp"
- 사용 가능한 공간을 최대로 할당

##### android:layout_gravity vs android:gravity
- layout_gravity : 자신을 포함하고 있는 부모 위젯 레이아웃에서 옵션값에 따라 정렬(레이아웃 내 뷰 내에서 사용)
- gravity : 자신의 뷰에서 포함하고 있는 데이터를 정렬(부모가 없는 레이아웃 틀에서 사용)

##### 버튼 뷰에서 버튼 모양 다듬기
```
android:background="@drawable/button1"
- drawble 하위 파일(button.xml)
<shape android:shape="rectangle"> //shape : 모양을 결정할 때 사용한다. rectangle, line, oval, ring 이 있다.

<solid android:color="#ffffff" /> // solid : 모양에 색상을 넣을 때 사용한다.

// stroke : 테두리를 적용하고 싶을 때 사용한다. width 속성을 사용해서 두께를 결정하고, color 속성을 사용해서 테두리 색상을 정한다.
<stroke android:width="2dp" android:color="#ff5722" 

<corners android:radius="10dp" /> // 둥근 모서리를 적용하고 싶을 때 사용한다. 값에 따라 둥근 모서리를 주는 정도를 조절할 수 있다.
</shape>
```




