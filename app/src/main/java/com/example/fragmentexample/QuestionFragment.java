package com.example.fragmentexample;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.example.fragmentexample.databinding.FragmentQuestionBinding;

public class QuestionFragment extends Fragment {

    private FragmentQuestionBinding binding;
    public static final int YES = 0;
    public static final int NO = 1;

    public QuestionFragment() {
        // Required empty public constructor
    }

    public static QuestionFragment newInstance(String param1, String param2) {
        QuestionFragment fragment = new QuestionFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentQuestionBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
           if (checkedId == R.id.radio_button_yes) {
                binding.tvQuestionText.setText(R.string.yes_message);
           }

           if (checkedId == R.id.radio_button_no) {
               binding.tvQuestionText.setText(R.string.no_message);
           }
        });
    }
}