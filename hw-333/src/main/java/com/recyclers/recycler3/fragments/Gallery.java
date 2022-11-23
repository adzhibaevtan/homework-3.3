package com.recyclers.recycler3.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.recyclers.recycler3.R;
import com.recyclers.recycler3.adapters.GalleryAdapter;
import com.recyclers.recycler3.models.GalleryPicture;

import java.util.ArrayList;


public class Gallery extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_gallery, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_gallery);
        RecyclerView.LayoutManager columns = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(columns);

        ArrayList<GalleryPicture> photoArrayList = new ArrayList<>();

        photoArrayList.add(new GalleryPicture("https://media1.giphy.com/media/l44Qohad7fiYnfXDG/giphy.gif"));
        photoArrayList.add(new GalleryPicture("https://media4.giphy.com/media/26BGPbUld0xmdpogU/giphy.gif"));
        photoArrayList.add(new GalleryPicture("https://media0.giphy.com/media/26BGrYhvL4TeszznW/giphy.gif"));
        photoArrayList.add(new GalleryPicture("https://media3.giphy.com/media/l44QlmTpfBz1HXrDG/giphy.gif"));
        photoArrayList.add(new GalleryPicture("https://media1.giphy.com/media/26BGtEmjcrxkOsYr6/giphy.gif"));
        photoArrayList.add(new GalleryPicture("https://media0.giphy.com/media/l44QxCqq7n29AejNC/giphy.gif"));
        photoArrayList.add(new GalleryPicture("https://media4.giphy.com/media/l44QASbzE1bTSnHCo/giphy.gif"));
        photoArrayList.add(new GalleryPicture("https://media2.giphy.com/media/26BGr0rhc3GJq0C9W/giphy.gif"));

        photoArrayList.add(new GalleryPicture("https://media1.giphy.com/media/l44QeV7MzNt245OQ8/giphy.gif"));
        photoArrayList.add(new GalleryPicture("https://media1.giphy.com/media/l44QpfkYArJG9JGYE/giphy.gif"));
        photoArrayList.add(new GalleryPicture("https://media1.giphy.com/media/l44QmBAecZqkx8RR6/giphy.gif"));
        photoArrayList.add(new GalleryPicture("https://media0.giphy.com/media/26BGFdU0Z0bqEWTcc/giphy.gif"));
        photoArrayList.add(new GalleryPicture("https://media3.giphy.com/media/26BGKDJxtNCQyFuOk/giphy.gif"));
        photoArrayList.add(new GalleryPicture("https://media4.giphy.com/media/26BGtZNtBrIpHTF4c/giphy.gif"));
        photoArrayList.add(new GalleryPicture("https://user-images.githubusercontent.com/98197909/203657292-b5fdafac-f773-42d8-a056-1fc6f7238739.gif"));
        /*photoArrayList.add(new GalleryPicture("https://i.giphy.com/media/3oKIPD7IWVJ7UYXaUw/giphy.gif"));
        photoArrayList.add(new GalleryPicture("https://i.giphy.com/media/Y08bx6Fea1BafzTlvc/giphy.gif"));
        photoArrayList.add(new GalleryPicture("https://i.giphy.com/media/3oKIPaihAcHpS6iFPO/giphy.gif"));
        photoArrayList.add(new GalleryPicture("https://i.giphy.com/media/26BRzAYHZE8HoRQA0/giphy.gif"));
        photoArrayList.add(new GalleryPicture("https://i.giphy.com/media/DS89v1NqpzCqA/giphy.gif"));*/
        GalleryAdapter galleryAdapter = new GalleryAdapter(photoArrayList);

        recyclerView.setAdapter(galleryAdapter);

        recyclerView.setHasFixedSize(true);
    }
}