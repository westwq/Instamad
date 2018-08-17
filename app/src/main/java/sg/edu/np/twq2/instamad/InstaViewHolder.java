package sg.edu.np.twq2.instamad;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class InstaViewHolder extends RecyclerView.ViewHolder {
    public TextView name;
    public TextView location;
    public View v;

    public InstaViewHolder(View view)
    {
        super(view);
        v = view;
        name = view.findViewById(R.id.nick);
        location = view.findViewById(R.id.location);
    }
}
