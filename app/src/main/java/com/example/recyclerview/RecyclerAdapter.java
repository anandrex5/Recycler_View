package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.CountryViewHolder> {
    //that's why we created size of the array. .
    private ArrayList<String> countryNameList ;
    private ArrayList<String>detailsList ;
    private ArrayList<Integer> imageList ;

    //Using Context, object will be able to show the total message on the screen by clicking any of the cards
    private Context context;



    //AutoGenerate Constructors

    public RecyclerAdapter(ArrayList<String> countryNameList, ArrayList<String> detailsList, ArrayList<Integer> imageList, Context context) {
       //These are four parameters which we are going to use after in MainActivity
        this.countryNameList = countryNameList;
        this.detailsList = detailsList;
        this.imageList = imageList;
        this.context = context;
    }

    @NonNull
    @Override
    //in this method we define the card design that we've made.
    //we can determine which design will be displayed in the recyclerView.
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //Create an object from the The View Class and transfer the card design into that.
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design,parent,false);

        return new CountryViewHolder(view);
    }

    @Override
    //This method , in which we will specify what should be done when the design is created
    //and then connected to the recycler view
    // Or we can say that ,we will show the data on the screen in recycler view using this method.
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {

        //transfer the data in the arrays to the components, so now lets write the country name.and
        // the TextView country name and of course, we won't be able to directly access the TextView and image components
        //from here that's why we've got to use the Holder object here which we using in our upper line.

        holder.textViewCountryName.setText(countryNameList.get(position));
        holder.textViewDetails.setText(detailsList.get(position));
        holder.imageView.setImageResource(imageList.get(position));
        //after this onBindViewHolder Method,
        // we will need to send the array list object that we created in the main activity to the adapter
        //So, for this we will need to send the array list object that we created in the main activity to the adapter class


        //Now lets add a click feature to the cardView component
        holder.cardView.setOnClickListener(v -> {
            //first we will determine which cardView component was clicked ,So use the position parameter here , which
            //we use in above on OnBindViewHolder
            //and we apply Toast message on three Views for understanding
            if (position == 0){
                Toast.makeText(context,"You selected the Indian Flag", Toast.LENGTH_SHORT).show();
            }else  if (position == 1) {
                Toast.makeText(context, "You selected the Canada Flag", Toast.LENGTH_SHORT).show();
            }else if (position == 2) {
                Toast.makeText(context, "You selected the Israel Flag", Toast.LENGTH_SHORT).show();
            }
        });




    }

    @Override
    //This is the method where we specify the amount of data to be displayed in recycler view.
    public int getItemCount() {
        //here we need to size of the array
        return countryNameList.size();
    }

    //this class represents the card design and we will define the components in the card design

    public class CountryViewHolder extends RecyclerView.ViewHolder {

        //we need to create an Number of  objects from textView which we use in card design.
        private TextView textViewCountryName, textViewDetails;
        private ImageView imageView;

        //declare cardVIew
        private CardView cardView;

        //autoGenerate Constructor
        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewCountryName = itemView.findViewById(R.id.textViewCountryName);
            textViewDetails = itemView.findViewById(R.id.textViewDetails);
            imageView = itemView.findViewById(R.id.imageView);

            //Now we match the CardView component with its ID in the constructor.
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
