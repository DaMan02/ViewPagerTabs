package com.example.dayal.coordinatorapp;

import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class Space extends RecyclerView.ItemDecoration {

   int space,spanCount;
    public Space(int space,int spanCount){
        this.space=space;
        this.spanCount=spanCount;
    }

    public void getItemoffsets(Rect outRect,View view,RecyclerView parent,RecyclerView.State state){
        //Rect holds four integer coordinates for a rectangle
        //outRect	Rect: Rect to receive the output.
       // view	View: The child view to decorate
       // parent	RecyclerView: RecyclerView this ItemDecoration is decorating
        //state	RecyclerView.State: The current state of RecyclerView.
        super.getItemOffsets(outRect, view, parent, state);
        if(parent.getChildLayoutPosition(view)<=spanCount)
            outRect.top=space;
        outRect.right = space;
        outRect.left = space;
        outRect.bottom = space;
    }

}
