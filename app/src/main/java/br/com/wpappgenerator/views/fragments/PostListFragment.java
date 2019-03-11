package br.com.wpappgenerator.views.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.wpappgenerator.R;
import br.com.wpappgenerator.controllers.PostController;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class PostListFragment extends Fragment {

    private Unbinder unbinder;

    private PostController postController;

    //

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_postlist, container, false);

        unbinder = ButterKnife.bind(this, view);

        postController = new PostController(getContext());

        return view;
    }



    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
