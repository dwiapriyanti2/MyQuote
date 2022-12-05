package com.si5a.myquote.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.si5a.myquote.Model.QuoteModel;
import com.si5a.myquote.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterQuote extends RecyclerView.Adapter<AdapterQuote.viewHolderQuote>{
    private List<QuoteModel> listQuote = new ArrayList<>();
    private Context ctx;

    public AdapterQuote(List<QuoteModel> listQuote, Context ctx) {
        this.listQuote = listQuote;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public viewHolderQuote onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(ctx).inflate(R.layout.item_quote, parent, false);
        return new viewHolderQuote(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderQuote holder, int position) {
        QuoteModel QM = listQuote.get(position);
        holder.tvText.setText(QM.getText());
        holder.tvAuthor.setText(QM.getAuthor());
    }

    @Override
    public int getItemCount() {
        return listQuote.size();
    }

    public class viewHolderQuote extends RecyclerView.ViewHolder {
        TextView tvText, tvAuthor;

        public viewHolderQuote(@NonNull View itemView) {
            super(itemView);
            tvText = itemView.findViewById(R.id.tv_text);
            tvAuthor = itemView.findViewById(R.id.tv_author);
        }
    }
}
