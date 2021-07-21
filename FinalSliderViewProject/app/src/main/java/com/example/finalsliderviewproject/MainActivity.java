package com.example.finalsliderviewproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;

import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;

import com.yuyakaido.android.cardstackview.CardStackLayoutManager;
import com.yuyakaido.android.cardstackview.CardStackListener;
import com.yuyakaido.android.cardstackview.CardStackView;
import com.yuyakaido.android.cardstackview.Direction;
import com.yuyakaido.android.cardstackview.StackFrom;
import com.yuyakaido.android.cardstackview.SwipeableMethod;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private CardStackLayoutManager manager;
    private CardStackAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardStackView cardStackView=findViewById(R.id.card_stack_view);
        manager=new CardStackLayoutManager(this, new CardStackListener() {
            @Override
            public void onCardDragging(Direction direction, float ratio) {


            }

            @Override
            public void onCardSwiped(Direction direction) {

            }

            @Override
            public void onCardRewound() {

            }

            @Override
            public void onCardCanceled() {

            }

            @Override
            public void onCardAppeared(View view, int position) {

            }

            @Override
            public void onCardDisappeared(View view, int position) {

            }
        });
        manager.setStackFrom(StackFrom.None);
        manager.setVisibleCount(3);
        manager.setTranslationInterval(8.0f);
        manager.setScaleInterval(0.95f);
        manager.setSwipeThreshold(0.3f);
        manager.setMaxDegree(20.0f);
        manager.setDirections(Direction.HORIZONTAL);
        manager.setCanScrollHorizontal(true);
        manager.setSwipeableMethod(SwipeableMethod.Manual);
        manager.setOverlayInterpolator(new LinearInterpolator());
        adapter=new CardStackAdapter(addList());
        cardStackView.setLayoutManager(manager);
        cardStackView.setAdapter(adapter);
        cardStackView.setItemAnimator(new DefaultItemAnimator());
    }

    private List<ItemModel> addList() {
        List<ItemModel> itemModelList=new ArrayList<>();
        for(int i=0;i<20;i++){
            itemModelList.add(new ItemModel(R.drawable.boy3,"Vivian",32,"Ujjan","80%","Person for friendship only and I like travelling so be ready for more fun with me, I am very funny person and like to connect with also same type of persons"));
            itemModelList.add(new ItemModel(R.drawable.boy2,"Shiv",30,"Delhi","40%","Person for friendship only and I like travelling so be ready for more fun with me, I am very funny person and like to connect with also same type of persons"));
            itemModelList.add(new ItemModel(R.drawable.boy4,"Vivian",32,"Ujjan","90%","Person for friendship only and I like travelling so be ready for more fun with me, I am very funny person and like to connect with also same type of persons"));
            itemModelList.add(new ItemModel(R.drawable.girl1,"Raksha",22,"Banguluru","68%","Person for friendship only and I like travelling so be ready for more fun with me, I am very funny person and like to connect with also same type of persons"));
        }
        return itemModelList;
    }
}