package com.example.hemadry.project004;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MovieAdepter extends RecyclerView.Adapter<MovieAdepter.MovieViewHolder>{

    private Context context;
    private List<Movie>movies;

    public MovieAdepter(Context context, List<Movie> movies) {
        this.context = context;
        this.movies = movies;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater  =LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.movie_item,parent,false);
        MovieViewHolder viewHolder = new MovieViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {

        holder.movieNameTV.setText(movies.get(position).getMovieName());
        holder.movieCatagorieTV.setText(movies.get(position).getMovieCatagorie());
        holder.imageIV.setImageResource(movies.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {

        ImageView imageIV;
        TextView movieNameTV;
        TextView movieCatagorieTV;

        public MovieViewHolder(View itemView) {
            super(itemView);

            movieNameTV = itemView.findViewById(R.id.movieN);
            movieCatagorieTV = itemView.findViewById(R.id.movieC);
            imageIV = itemView.findViewById(R.id.movieI);
        }
    }
}

