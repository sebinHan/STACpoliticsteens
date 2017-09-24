package droidmentor.PoliticTeens_Client.Fragment;


import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

//import com.greenfrvr.hashtagview.HashtagView;

import java.util.Arrays;
import java.util.List;

import droidmentor.PoliticTeens_Client.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyJungdangFragment_SearchJungdang extends Fragment {

    FragmentManager manager;  //Fragment를 관리하는 클래스의 참조변수
    FragmentTransaction tran;  //실제로 Fragment를 추가/삭제/재배치 하는 클래스의 참조변수
    //HashtagView hashtagView2;
    public static final List<String> DATA = Arrays.asList("android", "library", "collection",
            "hashtags", "min14sdk", "UI", "view", "github", "opensource", "project", "widget");

    public MyJungdangFragment_SearchJungdang() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_myjungdangs_searchjungdang, container, false);
        manager = (FragmentManager) getFragmentManager();

        //SegmentedButtonGroup myjundang_buttonGroup = (SegmentedButtonGroup) rootView.findViewById(R.id.myjundang_buttonGroup);
        /*myjundang_buttonGroup.setOnClickListener( new SegmentedButtonGroup.OnClickedButtonPosition(){
            @Override
            public  void onClickedButtonPosition(){

            }
        });*/
        TextView my = (TextView) view.findViewById(R.id.my_jungdang);
        my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manager.beginTransaction().remove(MyJungdangFragment_SearchJungdang.this).commit();
                manager.popBackStack();

            }
        });

        /*hashtagView2 = (HashtagView) view.findViewById(R.id.hashtags2);
        hashtagView2.setData(DATA, new HashtagView.DataTransform<String>() {
            @Override
            public CharSequence prepare(String item) {
                SpannableString spannableString = new SpannableString("#" + item);
                spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#85F5F5F5")), 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                return spannableString;
            }
        });
        hashtagView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText("Selected items: "+ hashtagView2.getSelectedItems().toArray(), Toast.LENGTH_SHORT).show();
                //Toast.makeText(hashtagView2.getSelectedItems().toArray().toString(),Toast.LENGTH_LONG).show();
            }
        });
        */
        return view;
    }


}
