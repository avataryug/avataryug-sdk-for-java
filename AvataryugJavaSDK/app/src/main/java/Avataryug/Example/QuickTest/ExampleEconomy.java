package Avataryug.Example.QuickTest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import Avataryug.Client.Handler.EconomyHandler;
import Avataryug.Client.Model.GetEconomyBundleByIDResult;
import Avataryug.Client.Model.GetEconomyBundlesResult;
import Avataryug.Client.Model.GetEconomyContainerByIDResult;
import Avataryug.Client.Model.GetEconomyContainersResult;
import Avataryug.Client.Model.GetEconomyItemsByIDResult;
import Avataryug.Client.Model.GetEconomyItemsResult;
import Avataryug.Client.Model.GetEconomyStoresResult;
import Avataryug.Client.Model.GetStoreItemsByIDResult;
import com.example.myjavasdkandroid.R;

/**
 *  This ExampleEconomy Class demonstrates API calling methods with temporary data.
 * A simple {@link Fragment} subclass.
 * Use the {@link ExampleEconomy#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ExampleEconomy extends Fragment {



    public ExampleEconomy() {
        // Required empty public constructor
    }

    public  String bundlesByids;
    public  String itemsByids;
    public  String containersByids;

    public  String storesByids;

    public static ExampleEconomy newInstance(String param1, String param2) {
        ExampleEconomy fragment = new ExampleEconomy();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_example_economy, container, false);

        Button getEconomyItemBtn = rootView.findViewById(R.id.EconomyItemsBtn);
        getEconomyItemBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetEconomyItems();
                Toast.makeText(getActivity(), "Get Economy Items", Toast.LENGTH_SHORT).show();
            }
        });

        Button getEconomyItembyIdsBtn = rootView.findViewById(R.id.EconomyItemsByIDsBtn);
        getEconomyItembyIdsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetEconomyItemsbyIds();
                Toast.makeText(getActivity(), "Get Economy Items", Toast.LENGTH_SHORT).show();
            }
        });

        Button getBundlesBtn = rootView.findViewById(R.id.EconomyBundlesBtn);
        getBundlesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetBundles();
                Toast.makeText(getActivity(), "Get Bundles Items", Toast.LENGTH_SHORT).show();
            }
        });

        Button getBundlesbyidBtn = rootView.findViewById(R.id.EconomyBundleByIDBtn);
        getBundlesbyidBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetBundlesByIDs();
                Toast.makeText(getActivity(), "Get Bundles By IDs", Toast.LENGTH_SHORT).show();
            }
        });

        Button getContainersBtn = rootView.findViewById(R.id.EconomyContainersBtn);
        getContainersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetContainers();
                Toast.makeText(getActivity(), "Get Containers ", Toast.LENGTH_SHORT).show();
            }
        });

        Button getContainersbyidBtn = rootView.findViewById(R.id.EconomyContainersByIDBtn);
        getContainersbyidBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetContainersByIDs();
                Toast.makeText(getActivity(), "Get Containers By IDs", Toast.LENGTH_SHORT).show();
            }
        });

        Button getStoresBtn = rootView.findViewById(R.id.EconomyStoresBtn);
        getStoresBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetEconomyStore();
                Toast.makeText(getActivity(), "Get Store ", Toast.LENGTH_SHORT).show();
            }
        });

        Button getStoresbyidBtn = rootView.findViewById(R.id.EconomyStoresByIDBtn);
        getStoresbyidBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetEconomyStoreById();
                Toast.makeText(getActivity(), "Get Store By IDs", Toast.LENGTH_SHORT).show();
            }
        });

        // Inflate the layout for this fragment
        return rootView;
    }

    /**
     * Get Economy Items.
     */
    void GetEconomyItems()
    {
        EconomyHandler handler = new EconomyHandler( new EconomyHandler.GetEconomyItems("Top",1,2));
        handler.getEconomyItems(new EconomyHandler.OnGetEconomyItemsListener() {
            @Override
            public void onGetEconomyItemsResult(GetEconomyItemsResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onGetEconomyItems->>Result--",responseText);
                    itemsByids = result.getData().get(0).getID();
                }
            }
            @Override
            public void onGetEconomyItemsError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onGetEconomyItems--->>Error--",errorText);
            }
        });
    }

    /**
     * Get Economy Item by ID.
     */
    void GetEconomyItemsbyIds()
    {
        EconomyHandler handler = new EconomyHandler(new EconomyHandler.GetEconomyItemsByID(itemsByids));
        handler.getEconomyItemsByID(new EconomyHandler.OnGetEconomyItemsByIDListener() {
            @Override
            public void onGetEconomyItemsByIDResult(GetEconomyItemsByIDResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onGetEconomyItemsByID->>Result--",responseText);
                }
            }
            @Override
            public void onGetEconomyItemsByIDError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onGetEconomyItemsByID--->>Error--",errorText);
            }
        });
    }

    /**
     * Get Economy Bundles.
     */
    void GetBundles()
    {
        EconomyHandler handler = new EconomyHandler(new EconomyHandler.GetEconomyBundles(1));
        handler.getEconomyBundles(new EconomyHandler.OnGetEconomyBundlesListener() {
            @Override
            public void onGetEconomyBundlesResult(GetEconomyBundlesResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onGetEconomyBundles->>Result--",responseText);
                    bundlesByids = result.getData().get(0).getID();
                }
            }
            @Override
            public void onGetEconomyBundlesError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onGetEconomyBundles--->>Error--",errorText);
            }
        });
    }

    /**
     * Get Economy Bundles by ID.
     */
    void GetBundlesByIDs()
    {
        EconomyHandler handler = new EconomyHandler(new EconomyHandler.GetEconomyBundleByID(bundlesByids));
        handler.getEconomyBundleByID(new EconomyHandler.OnGetEconomyBundleByIDListener() {
            @Override
            public void onGetEconomyBundleByIDResult(GetEconomyBundleByIDResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onGetEconomyBundlesByID->>Result--",responseText);
                }
            }
            @Override
            public void onGetEconomyBundleByIDError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onGetEconomyBundlesByID--->>Error--",errorText);
            }
        });
    }

    /**
     * Get Economy Containers.
     */
    void GetContainers()
    {
        EconomyHandler handler = new EconomyHandler(new EconomyHandler.GetEconomyContainers(1));
        handler.getEconomyContainers(new EconomyHandler.OnGetEconomyContainersListener() {
            @Override
            public void onGetEconomyContainersResult(GetEconomyContainersResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onGetEconomyContainer->>Result--",responseText);
                    containersByids = result.getData().get(0).getID();
                }
            }
            @Override
            public void onGetEconomyContainersError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onGetEconomyContainer--->>Error--",errorText);
            }
        });
    }

    /**
     * Get Economy Container by ID
     */
    void GetContainersByIDs()
    {
        EconomyHandler handler = new EconomyHandler(new EconomyHandler.GetEconomyContainerByID(containersByids));
        handler.getEconomyContainerByID(new EconomyHandler.OnGetEconomyContainerByIDListener() {
            @Override
            public void onGetEconomyContainerByIDResult(GetEconomyContainerByIDResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onGetEconomyContainerByID->>Result--",responseText);
                }
            }
            @Override
            public void onGetEconomyContainerByIDError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onGetEconomyContainerByID--->>Error--",errorText);
            }
        });
    }

    /**
     * Get Economy Stores
     */
    void GetEconomyStore()
    {
        EconomyHandler handler = new EconomyHandler(new EconomyHandler.GetEconomyStores(1));
        handler.getEconomyStores(new EconomyHandler.OnGetEconomyStoresListener() {
            @Override
            public void onGetEconomyStoresResult(GetEconomyStoresResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onGetEconomyStores->>Result--",responseText);
                    storesByids = result.getData().get(0).getID();
                }
            }
            @Override
            public void onGetEconomyStoresError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onGetEconomyStores--->>Error--",errorText);
            }
        });
    }

    /**
     * Retrieves the set of items defined for the specified store, including all prices defined.
     */
    void GetEconomyStoreById()
    {
        EconomyHandler handler = new EconomyHandler(new EconomyHandler.GetStoreItemsByID(storesByids));
        handler.getStoreItemsByID(new EconomyHandler.OnGetStoreItemsByIDListener() {
            @Override
            public void onGetStoreItemsByIDResult(GetStoreItemsByIDResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onGetEconomyStoresByID->>Result--",responseText);

                }
            }
            @Override
            public void onGetStoreItemsByIDError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onGetEconomyStoresByID--->>Error--",errorText);
            }
        });
    }
}