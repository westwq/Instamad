package sg.edu.np.twq2.instamad;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class InstaAdapter extends RecyclerView.Adapter<InstaViewHolder> {
    private List<Insta> list;
    private Context context;

    public InstaAdapter(Context context, List<Insta> sl)
    {
        this.context = context;
        this.list = sl;
    }

    @Override
    public void onBindViewHolder(@NonNull InstaViewHolder holder, int position) {
        //super.onBindViewHolder(holder, position);
        Insta s = list.get(position);
        holder.name.setText(s.name);
        holder.location.setText(s.location);

    }

    @NonNull
    @Override
    public InstaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_insta, parent, false);
        return new InstaViewHolder(item);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
