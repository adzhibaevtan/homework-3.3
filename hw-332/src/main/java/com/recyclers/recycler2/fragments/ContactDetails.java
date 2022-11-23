package com.recyclers.recycler2.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.recyclers.recycler2.R;
import com.recyclers.recycler2.adapters.ContactsAdapter;
import com.recyclers.recycler2.models.Contact;

import java.util.ArrayList;


public class ContactDetails extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_contact_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.contact);
        ArrayList<Contact> contactArrayList = new ArrayList<Contact>();
        contactArrayList.add(new Contact("Andrew", "(238) 455-4863", R.drawable.man));
        contactArrayList.add(new Contact("Dylan", "(272) 708-3892", R.drawable.man2));
        contactArrayList.add(new Contact("Kevin", "(837) 961-8474", R.drawable.man3));
        contactArrayList.add(new Contact("Bella", "(805) 621-9168", R.drawable.woman));
        contactArrayList.add(new Contact("Trevor", "(362) 537-0637", R.drawable.man2));
        contactArrayList.add(new Contact("Jane", "(841) 702-6597", R.drawable.woman2));
        contactArrayList.add(new Contact("Samantha", "(486) 429-7258", R.drawable.woman3));
        contactArrayList.add(new Contact("Johan", "(622) 912-2002", R.drawable.man));
        contactArrayList.add(new Contact("Jake", "(394) 206-5954", R.drawable.man3));
        contactArrayList.add(new Contact("Peter", "(481) 766-9121", R.drawable.man));
        contactArrayList.add(new Contact("Parker", "(356) 486-8579", R.drawable.man3));
        contactArrayList.add(new Contact("Scott", "(441) 743-8741", R.drawable.man2));


        ContactsAdapter contactsAdapter = new ContactsAdapter((Context) getActivity(), contactArrayList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager((Context) getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setAdapter(contactsAdapter);

    }
}