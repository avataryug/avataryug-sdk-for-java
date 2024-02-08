package Avataryug.Example.QuickTest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import Avataryug.Client.Handler.AdvertisingHandler;
import Avataryug.Client.Model.GetAdPlacementByIDResult;
import Avataryug.Client.Model.GrantAdsRewardResult;
import Avataryug.Client.Model.RecordAdsActivityResult;
import com.example.myjavasdkandroid.R;

/**
 * This ExampleAdvertising Class demonstrates API calling methods with temporary data.
 * A simple {@link Fragment} subclass.
 * Use the {@link ExampleAdvertising#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ExampleAdvertising extends Fragment {

    public ExampleAdvertising() {
        // Required empty public constructor
    }

    public static ExampleAdvertising newInstance(String param1, String param2) {
        ExampleAdvertising fragment = new ExampleAdvertising();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_example_advertising, container, false);


        Button getAdPlacementByIDBtn = rootView.findViewById(R.id.GetAdPlacementByIDBtn);
        getAdPlacementByIDBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetAdPlacementByID();
                Toast.makeText(getActivity(), "Get Ad Placement By ID", Toast.LENGTH_SHORT).show();
            }
        });

        Button grantAdsRewardBtn = rootView.findViewById(R.id.GrantAdsRewardBtn);
        grantAdsRewardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GrantAdsReward();
                Toast.makeText(getActivity(), "Grant Ads Reward", Toast.LENGTH_SHORT).show();
            }
        });

        Button recordAdsActivityBtn = rootView.findViewById(R.id.RecordAdsActivityBtn);
        recordAdsActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RecordAdsActivity();
                Toast.makeText(getActivity(), "Record Ads Activity", Toast.LENGTH_SHORT).show();
            }
        });

        // Inflate the layout for this fragment
        return rootView;
    }

    /**
     * Retrieves a list of ad placements by ID.
     */
    void GetAdPlacementByID()
    {
        AdvertisingHandler adverHandler = new AdvertisingHandler(new AdvertisingHandler.GetAdPlacementByID("a363728f-db74-425b-8f45-942e4c8f2a77"));

        adverHandler.getAdPlacementByID(new AdvertisingHandler.OnGetAdPlacementByIDListener() {
            @Override
            public void onGetAdPlacementByIDResult(GetAdPlacementByIDResult result) {
                // Handle API response here
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("Response--",responseText);
                }
            }
            @Override
            public void onGetAdPlacementByIDError(Exception error) {
                // Handle API error here
                String errorText = "API Error: " + error.getMessage();
                Log.i("ERROR--",errorText);
            }
        });
    }

    /**
     * Grants rewards for ads.
     */
    void GrantAdsReward()
    {
        AdvertisingHandler  adverHandler = new AdvertisingHandler(new AdvertisingHandler.GrantAdsReward("a363728f-db74-425b-8f45-942e4c8f2a77"));

        adverHandler.grantAdsReward(new AdvertisingHandler.OnGrantAdsRewardResultListener() {
            @Override
            public void onGrantAdsRewardResult(GrantAdsRewardResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onGrantAdsRewardResult--",responseText);
                }
            }
            @Override
            public void onGrantAdsRewardError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onGrantAdsRewardError--",errorText);
            }
        });

    }

    /**
     * Stores ads activity data for reporting after ad watch.
     */
    void RecordAdsActivity()
    {
        AdvertisingHandler  adverHandler = new AdvertisingHandler(new AdvertisingHandler.RecordAdsActivity("CCN",3,""));
        adverHandler.recordAdsActivity(new AdvertisingHandler.OnRecordAdsActivityResultListener() {
            @Override
            public void onRecordAdsActivityResult(RecordAdsActivityResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("Response--",responseText);
                }
            }
            @Override
            public void onRecordAdsActivityError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("ERROR--",errorText);
            }
        });
    }
}