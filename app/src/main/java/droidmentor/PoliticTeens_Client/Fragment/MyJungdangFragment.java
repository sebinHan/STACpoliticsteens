package droidmentor.PoliticTeens_Client.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import co.ceryle.segmentedbutton.SegmentedButtonGroup;
import droidmentor.PoliticTeens_Client.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyJungdangFragment extends Fragment {


    public MyJungdangFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_myjundangs, container, false);

        SegmentedButtonGroup myjundang_buttonGroup = (SegmentedButtonGroup) view.findViewById(R.id.myjundang_buttonGroup);
        /*myjundang_buttonGroup.setOnClickListener( new SegmentedButtonGroup.OnClickedButtonPosition(){
            @Override
            public  void onClickedButtonPosition(){

            }
        });*/

        return inflater.inflate(R.layout.fragment_myjundangs, container, false);

    }

}
