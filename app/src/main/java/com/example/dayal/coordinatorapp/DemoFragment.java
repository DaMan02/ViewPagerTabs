package com.example.dayal.coordinatorapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link DemoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DemoFragment extends Fragment {
    public DemoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.

     * @return A new instance of fragment DemoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DemoFragment newInstance() {
        DemoFragment fragment = new DemoFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.frament_demo,container,false);
        RecyclerView recyclerView=(RecyclerView)view.findViewById(R.id.recycler_view_demo);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new Space(20,1));
        recyclerView.setAdapter(new DemoAdapter(feedItems(),getContext()));

        return view;
    }
    private List<DemoItem> feedItems(){
        String[] ImageUrls={"http://animals.sandiegozoo.org/sites/default/files/2016-10/animals_hero_fennec2.jpg","http://animals.sandiegozoo.org/sites/default/files/2016-09/animals_hero_panda.jpg","http://animals.sandiegozoo.org/sites/default/files/2016-10/animals_hero_fennec2.jpg","http://animals.sandiegozoo.org/sites/default/files/2016-10/animals_hero_fennec2.jpg","https://static.pexels.com/photos/145939/pexels-photo-145939.jpeg","http://animals.sandiegozoo.org/sites/default/files/2016-10/animals_hero_fennec2.jpg","http://animals.sandiegozoo.org/sites/default/files/2016-09/animals_hero_panda.jpg"};
        List<DemoItem> demoItems=new ArrayList<>();
        for(int i=0;i<3;i++){
            DemoItem mItem=new DemoItem(ImageUrls[i]);
            demoItems.add(mItem);
        }
         return(demoItems);
    }

    }