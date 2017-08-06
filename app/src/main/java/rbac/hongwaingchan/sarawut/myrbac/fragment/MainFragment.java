package rbac.hongwaingchan.sarawut.myrbac.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import rbac.hongwaingchan.sarawut.myrbac.R;
import rbac.hongwaingchan.sarawut.myrbac.SignUpFragment;

/**
 * Created by Administrator on 5/8/2560.
 */
public class MainFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.main_fragment, container, false);
        return view;

    }   //onCreateView

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        //Register Controller
        registerController();


    }

    private void registerController() {
        TextView textView = (TextView) getView().findViewById(R.id.txtNewRegister);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SignUpFragment signUpFragment = new SignUpFragment();
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.mainContrainer, signUpFragment)
                        .addToBackStack(null)
                        .commit();

            }
        });

    }
} // Main Class
