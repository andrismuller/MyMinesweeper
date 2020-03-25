package hu.armando.muller.myminesweeper.ui.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import hu.armando.muller.myminesweeper.R;
import hu.armando.muller.myminesweeper.model.MineFieldRow;

public class MineFieldAdapter extends RecyclerView.Adapter<MineFieldAdapter.MineFieldViewHolder> {
    private List<MineFieldRow> mineFieldRowList;
    RecyclerView.RecycledViewPool viewPool = new RecyclerView.RecycledViewPool();

    public MineFieldAdapter(List<MineFieldRow> rows){
        mineFieldRowList = rows;
    }

    @NonNull
    @Override
    public MineFieldViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.minefield_rows_rv, parent,false);
        return new MineFieldViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MineFieldViewHolder holder, int position) {
        MineFieldRow mineFieldRow = mineFieldRowList.get(position);
        holder.rowRV.setAdapter(new MineFieldRowAdapter());
        holder.rowRV.setRecycledViewPool(viewPool);
    }

    @Override
    public int getItemCount() {
        return mineFieldRowList.size();
    }

    @Override
    public long getItemId(int position) {
        return mineFieldRowList.get(position).getId();
    }

    class MineFieldViewHolder extends RecyclerView.ViewHolder {

        RecyclerView rowRV;

        public MineFieldViewHolder(@NonNull View itemView) {
            super(itemView);
            rowRV = itemView.findViewById(R.id.minefield_row_rv);
        }
    }
}
