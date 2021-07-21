package com.example.swipcardprojexct;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;

import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

//import com.lorentzos.flingswipe.SwipeFlingAdapterView;
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
        manager.setDirections(Direction.FREEDOM);
        manager.setCanScrollHorizontal(true);
        manager.setSwipeableMethod(SwipeableMethod.Manual);
        manager.setOverlayInterpolator(new LinearInterpolator());
        adapter=new CardStackAdapter(addList());
        cardStackView.setLayoutManager(manager);
        cardStackView.setAdapter(adapter);
        cardStackView.setItemAnimator(new DefaultItemAnimator());
    }

    private List<ItemModel> addList() {
        List<ItemModel> itemes=new ArrayList<>();
        itemes.add(new ItemModel(R.drawable.boy3,"Vivian",32,"* Ujjan","80%","My self-summary","Befor swiping.. if ur ready to verify on snap or telegram only then we can go ahead for a conversation....No threesome shit,Boys Fake account ...stay away Hiw I am looking a good person for friendship and lets see how it goes... with"));
        itemes.add(new ItemModel(R.drawable.girl1,"shaliee",25,"* Delhi","57%","My self-summary","Befor swiping.. if ur ready to verify on snap or telegram only then we can go ahead for a conversation....No threesome shit,Boys Fake account ...stay away Hiw I am looking a good person for friendship and lets see how it goes... with"));
        itemes.add(new ItemModel(R.drawable.girls2,"Rupali",28,"* Bina","90%","My self-summary","Befor swiping.. if ur ready to verify on snap or telegram only then we can go ahead for a conversation....No threesome shit,Boys Fake account ...stay away Hiw I am looking a good person for friendship and lets see how it goes... with"));
        itemes.add(new ItemModel(R.drawable.girl3,"Ritu",25,"* Bhopla","60%","My self-summary","Befor swiping.. if ur ready to verify on snap or telegram only then we can go ahead for a conversation....No threesome shit,Boys Fake account ...stay away Hiw I am looking a good person for friendship and lets see how it goes... with"));
        itemes.add(new ItemModel(R.drawable.girls4,"Shapna ",24,"* Indore","56%","My self-summary","Befor swiping.. if ur ready to verify on snap or telegram only then we can go ahead for a conversation....No threesome shit,Boys Fake account ...stay away Hiw I am looking a good person for friendship and lets see how it goes... with"));
        itemes.add(new ItemModel(R.drawable.girl6,"Ayushi",23,"* Ujjan","98%","My self-summary","Befor swiping.. if ur ready to verify on snap or telegram only then we can go ahead for a conversation....No threesome shit,Boys Fake account ...stay away Hiw I am looking a good person for friendship and lets see how it goes... with"));
        itemes.add(new ItemModel(R.drawable.boy4,"Shiv",20,"* Gwaliyar","54%","My self-summary","Befor swiping.. if ur ready to verify on snap or telegram only then we can go ahead for a conversation....No threesome shit,Boys Fake account ...stay away Hiw I am looking a good person for friendship and lets see how it goes... with"));
        itemes.add(new ItemModel(R.drawable.girl5,"Sikha",21,"* Chennai","20%","My self-summary","Befor swiping.. if ur ready to verify on snap or telegram only then we can go ahead for a conversation....No threesome shit,Boys Fake account ...stay away Hiw I am looking a good person for friendship and lets see how it goes... with"));
        itemes.add(new ItemModel(R.drawable.girl1,"Deeksha",25,"* Goa","70%","My self-summary","Befor swiping.. if ur ready to verify on snap or telegram only then we can go ahead for a conversation....No threesome shit,Boys Fake account ...stay away Hiw I am looking a good person for friendship and lets see how it goes... with"));
        return  itemes;
    }
}