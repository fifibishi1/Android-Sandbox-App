package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DeleteUserFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DeleteUserFragment extends Fragment {
    private EditText usId;
    private Button deleteAns;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DeleteUserFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DeleteUserFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DeleteUserFragment newInstance(String param1, String param2) {
        DeleteUserFragment fragment = new DeleteUserFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_delete_user, container, false);
        usId = view.findViewById(R.id.usId);
        deleteAns = view.findViewById(R.id.delete);

        deleteAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int uId = Integer.parseInt(usId.getText().toString());
                User user = new User();
                user.setId(uId);
                dbActivity.myAppDatabase.myDao().deleteUser(user);

                Toast.makeText(getActivity(), "Answer successfully removed!", Toast.LENGTH_SHORT).show();
                usId.setText("");
            }
        });
        return view;
    }
}