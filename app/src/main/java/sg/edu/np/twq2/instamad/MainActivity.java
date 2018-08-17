package sg.edu.np.twq2.instamad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Insta> list = new ArrayList<Insta>();
    private RecyclerView recyclerView;
    private InstaAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.add(new Insta("John","Kataragama"));
        list.add(new Insta("Peter","SAFRA Yishun"));
        list.add(new Insta("June","Ngee Ann Polytechnic"));

        recyclerView = (RecyclerView) findViewById(R.id.story);

        mAdapter = new InstaAdapter(this, list);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }
}
