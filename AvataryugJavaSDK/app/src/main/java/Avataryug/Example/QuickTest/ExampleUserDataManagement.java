package Avataryug.Example.QuickTest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import Avataryug.Client.ConfigurationApi;
import Avataryug.Client.Handler.UserDataManagementHandler;
import Avataryug.Client.Model.AddUserAvatarResult;
import Avataryug.Client.Model.AddVirtualCurrencyToUserResult;
import Avataryug.Client.Model.ConfirmPurchaseResult;
import Avataryug.Client.Model.ConsumeInstanceResult;
import Avataryug.Client.Model.DeleteUserAvatarResult;
import Avataryug.Client.Model.GetPurchaseResult;
import Avataryug.Client.Model.GetUserInventoryResult;
import Avataryug.Client.Model.GetUsersAllAvatarsResult;
import Avataryug.Client.Model.GrantInstanceToUserRequest;
import Avataryug.Client.Model.GrantInstanceToUserResult;
import Avataryug.Client.Model.PayForPurchaseRequest;
import Avataryug.Client.Model.PayForPurchaseResult;
import Avataryug.Client.Model.PurchaseInstanceRequest;
import Avataryug.Client.Model.SubtractUserVirtualCurrencyResult;
import Avataryug.Client.Model.UnlockContainerInstanceResult;
import Avataryug.Client.Model.UpdateUserAvatarRequest;
import Avataryug.Client.Model.UpdateUserAvatarResult;
import com.example.myjavasdkandroid.R;

/**
 * This ExampleUserDataManagement Class demonstrates API calling methods with temporary data.
 * A simple {@link Fragment} subclass.
 * Use the {@link ExampleUserDataManagement#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ExampleUserDataManagement extends Fragment {

    public ExampleUserDataManagement() {
        // Required empty public constructor
    }

    public static ExampleUserDataManagement newInstance() {
        ExampleUserDataManagement fragment = new ExampleUserDataManagement();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {

        View rootView  = inflater.inflate(R.layout.fragment_example_user_data_management, container, false);

        Button getUserInventoryBtn = rootView.findViewById(R.id.GetUserInventoryBtn);
        getUserInventoryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetuserInventory();
                Toast.makeText(getActivity(), "Get User Inventory", Toast.LENGTH_SHORT).show();
            }
        });

        Button getUserAllAvatarBtn = rootView.findViewById(R.id.GetUsersAllAvatarsBtn);
        getUserAllAvatarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetUsersAllAvatars();
                Toast.makeText(getActivity(), "Get Users All Avatars", Toast.LENGTH_SHORT).show();
            }
        });

        Button grantInstanceToUserBtn = rootView.findViewById(R.id.GrantInstanceToUserBtn);
        grantInstanceToUserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GrantInstanceToUser();
                Toast.makeText(getActivity(), "Grant Instance To User ", Toast.LENGTH_SHORT).show();
            }
        });

        Button consumeInstanceBtn = rootView.findViewById(R.id.ConsumeInstanceBtn);
        consumeInstanceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConsumeInstance();
                Toast.makeText(getActivity(), "Consume Instance  ", Toast.LENGTH_SHORT).show();
            }
        });

        Button purchaseInstanceBtn = rootView.findViewById(R.id.PurchaseInstanceBtn);
        purchaseInstanceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PurchaseInstance();
                Toast.makeText(getActivity(), "Purchase Instance  ", Toast.LENGTH_SHORT).show();
            }
        });

        Button addVirtualCurrencyToUserBtn = rootView.findViewById(R.id.AddVirtualCurrencyToUserBtn);
        addVirtualCurrencyToUserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddVirtualCurrencyToUser();
                Toast.makeText(getActivity(), "Add VirtualCurrency To User", Toast.LENGTH_SHORT).show();
            }
        });

        Button subtractUserVirtualCurrencyBtn = rootView.findViewById(R.id.SubtractUserVirtualCurrencyBtn);
        subtractUserVirtualCurrencyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SubtractUserVirtualCurrency();
                Toast.makeText(getActivity(), "Subtract VirtualCurrency To User", Toast.LENGTH_SHORT).show();
            }
        });

        Button addUserAvatarBtn = rootView.findViewById(R.id.AddUserAvatarBtn);
        addUserAvatarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddUserAvatar();
                Toast.makeText(getActivity(), "Add User Avatar", Toast.LENGTH_SHORT).show();
            }
        });

        Button DeleteUserAvatarBtn = rootView.findViewById(R.id.DeleteUserAvatarBtn);
        DeleteUserAvatarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DeleteUserAvatar();
                Toast.makeText(getActivity(), "Delete User Avatar", Toast.LENGTH_SHORT).show();
            }
        });


        Button updateUserAvatarBtn = rootView.findViewById(R.id.UpdateUserAvatarBtn);
        updateUserAvatarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UpdateUserAvatar();
                Toast.makeText(getActivity(), "Update User Avatar", Toast.LENGTH_SHORT).show();
            }
        });

        Button confirmPurchaseBtn = rootView.findViewById(R.id.ConfirmPurchaseBtn);
        confirmPurchaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ConfirmPurchase();
                Toast.makeText(getActivity(), "Confirm Purchase", Toast.LENGTH_SHORT).show();
            }
        });

        Button getPurchaseBtn = rootView.findViewById(R.id.GetPurchaseBtn);
        getPurchaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                GetPurchase();
                Toast.makeText(getActivity(), " Get Purchase", Toast.LENGTH_SHORT).show();
            }
        });

        Button payForPurchaseBtn = rootView.findViewById(R.id.PayForPurchaseBtn);
        payForPurchaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PayForPurchase();
                Toast.makeText(getActivity(), "Pay For Purchase", Toast.LENGTH_SHORT).show();
            }
        });

        Button unlockContainerInstanceBtn = rootView.findViewById(R.id.UnlockContainerInstanceBtn);
        unlockContainerInstanceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UnlockContainerInstance();
                Toast.makeText(getActivity(), " Unlock Container Instance", Toast.LENGTH_SHORT).show();
            }
        });

        // Inflate the layout for this fragment
        return rootView;
    }

    /**
     * Retrieves the user's current inventory of virtual goods.
     */
    void GetuserInventory()
    {
        UserDataManagementHandler handler = new UserDataManagementHandler(new UserDataManagementHandler.GetUserInventory(ConfigurationApi.getuserID()));
        handler.getUserInventory(new UserDataManagementHandler.OnGetUserInventoryListener() {
            @Override
            public void onGetUserInventoryResult(GetUserInventoryResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onGetUserInventory->>Result--",responseText);
                }
            }
            @Override
            public void onGetUserInventoryError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e(" onGetUserInventory--->>Error--",errorText);
            }
        });
    }

    /**
     * Lists all of the avatars that belong to a specific user.
     */
    void GetUsersAllAvatars()
    {
        UserDataManagementHandler handler = new UserDataManagementHandler(new UserDataManagementHandler.GetUsersAllAvatars(ConfigurationApi.getuserID()));
        handler.getUsersAllAvatars(new UserDataManagementHandler.OnGetUsersAllAvatarsListener() {
            @Override
            public void onGetUsersAllAvatarsResult(GetUsersAllAvatarsResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onGetUsersAllAvatars->>Result--",responseText);
                }
            }
            @Override
            public void onGetUsersAllAvatarsError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e(" onGetUsersAllAvatars--->>Error--",errorText);
            }
        });
    }

    /**
     * Adds the specified items to the specified user's inventory.
     */
    void GrantInstanceToUser()
    {
        GrantInstanceToUserRequest grantInstanceToUserRequest = new GrantInstanceToUserRequest();
        UserDataManagementHandler handler = new UserDataManagementHandler(new UserDataManagementHandler.GrantInstanceToUser(grantInstanceToUserRequest));
        handler.grantInstanceToUser(new UserDataManagementHandler.OnGrantInstanceToUserListener() {
            @Override
            public void onGrantInstanceToUserResult(GrantInstanceToUserResult result) {
                if (result != null) {
                    String responseText = "onGrantInstanceToUser Response: " + result.toString();
                    Log.i("Result--",responseText);
                }
            }
            @Override
            public void onGrantInstanceToUserError(Exception error) {
                String errorText = "onGrantInstanceToUser Error: " + error.getMessage();
                Log.e(" Error--",errorText);
            }
        });
    }

    /**
     * Update Avatar for the user.
     */
    void UpdateUserAvatar()
    {
        UpdateUserAvatarRequest updateUserAvatarRequest = new UpdateUserAvatarRequest();
        updateUserAvatarRequest.setAvatarID("");
        updateUserAvatarRequest.setAvatarUrl("dasf");
        updateUserAvatarRequest.setAvatarID("sfaf");
        updateUserAvatarRequest.setThumbUrl("");

        UserDataManagementHandler handler = new UserDataManagementHandler(new UserDataManagementHandler.UpdateUserAvatar(updateUserAvatarRequest));
        handler.updateUserAvatar(new UserDataManagementHandler.OnUpdateUserAvatarListener() {
            @Override
            public void onUpdateUserAvatarResult(UpdateUserAvatarResult result) {
                if (result != null) {
                    String responseText = "onUpdateUserAvatar Response: " + result.toString();
                    Log.i("Result--",responseText);
                }
            }
            @Override
            public void onUpdateUserAvatarError(Exception error) {
                String errorText = "onUpdateUserAvatar Error: " + error.getMessage();
                Log.e(" Error--",errorText);
            }
        });
    }

    /**
     * Consume uses of a consumable item. When all uses are consumed, it will be removed from the user's inventory.
     */
    void ConsumeInstance()
    {
        UserDataManagementHandler handler = new UserDataManagementHandler(new UserDataManagementHandler.ConsumeInstance("",1));
        handler.consumeInstance(new UserDataManagementHandler.OnConsumeInstanceListener() {
            @Override
            public void onConsumeInstanceResult(ConsumeInstanceResult result) {
                if (result != null) {
                    String responseText = "onConsumeInstance Response: " + result.toString();
                    Log.i("Result--",responseText);
                }
            }
            @Override
            public void onConsumeInstanceError(Exception error) {
                String errorText = "onConsumeInstance Error: " + error.getMessage();
                Log.e(" Error--",errorText);
            }
        });
    }

    /**
     * Buys a single item with virtual currency.
     * You must specify both the virtual currency to use to purchase, as well as what the client believes the price to be.
     * This lets the server fail the purchase if the price has changed.
     */
    void PurchaseInstance()
    {
        PurchaseInstanceRequest purchaseInstanceRequest = new PurchaseInstanceRequest();
        purchaseInstanceRequest.setInstanceID("");
        purchaseInstanceRequest.setInstanceType("");
        purchaseInstanceRequest.setPrice(0);
        purchaseInstanceRequest.setVirtualCurrency("CC");
        purchaseInstanceRequest.setUserID("");
        purchaseInstanceRequest.setStoreID("");

        UserDataManagementHandler handler = new UserDataManagementHandler(new UserDataManagementHandler.PurchaseInstance(purchaseInstanceRequest));
        handler.purchaseInstance(new UserDataManagementHandler.OnPurchaseInstanceListener() {
            @Override
            public void onPurchaseInstanceResult(String result) {
                if (result != null) {
                    String responseText = "onPurchaseInstance Response: " + result.toString();
                    Log.i("Result--",responseText);
                }
            }
            @Override
            public void onPurchaseInstanceError(Exception error) {
                String errorText = "onPurchaseInstance Error: " + error.getMessage();
                Log.e(" Error--",errorText);
            }
        });
    }

    /**
     * Increments the user's balance of the specified virtual currency by the stated amount.
     */
    void AddVirtualCurrencyToUser()
    {
        UserDataManagementHandler handler = new UserDataManagementHandler(new UserDataManagementHandler.AddVirtualCurrencyToUser("CN",10));
        handler.addVirtualCurrencyToUser(new UserDataManagementHandler.OnAddVirtualCurrencyToUserListener() {
            @Override
            public void onAddVirtualCurrencyToUserResult(AddVirtualCurrencyToUserResult result) {
                if (result != null) {
                    String responseText = "onAddVirtualCurrencyToUser Response: " + result.toString();
                    Log.i("Result--",responseText);
                }
            }
            @Override
            public void onAddVirtualCurrencyToUserError(Exception error) {
                String errorText = "onAddVirtualCurrencyToUser Error: " + error.getMessage();
                Log.e(" Error--",errorText);
            }
        });
    }

    /**
     * Decrements the user's balance of the specified virtual currency by the stated amount.
     * It is possible to make a VC balance negative with this API.
     */
    void SubtractUserVirtualCurrency()
    {
        UserDataManagementHandler handler = new UserDataManagementHandler(new UserDataManagementHandler.SubtractUserVirtualCurrency("CN",5));
        handler.subtractUserVirtualCurrency(new UserDataManagementHandler.OnSubtractUserVirtualCurrencyListener() {
            @Override
            public void onSubtractUserVirtualCurrencyResult(SubtractUserVirtualCurrencyResult result) {
                if (result != null) {
                    String responseText = "onAddVirtualCurrencyToUser Response: " + result.toString();
                    Log.i("Result--",responseText);
                }
            }
            @Override
            public void onSubtractUserVirtualCurrencyError(Exception error) {
                String errorText = "onAddVirtualCurrencyToUser Error: " + error.getMessage();
                Log.e(" Error--",errorText);
            }
        });
    }

    /**
     * Add Avatar to the user.
     */
    void AddUserAvatar()
    {
        UserDataManagementHandler handler = new UserDataManagementHandler(new UserDataManagementHandler.AddUserAvatar("ffsfasf"));
        handler.addUserAvatar(new UserDataManagementHandler.OnAddUserAvatarListener() {
            @Override
            public void onAddUserAvatarResult(AddUserAvatarResult result) {
                if (result != null) {
                    String responseText = "onAddUserAvatar Response: " + result.toString();
                    Log.i("Result--",responseText);
                }
            }
            @Override
            public void onAddUserAvatarError(Exception error) {
                String errorText = "onAddUserAvatar Error: " + error.getMessage();
                Log.e(" Error--",errorText);
            }
        });
    }

    /**
     * Delete specified Avatar for the use
     */
    void DeleteUserAvatar()
    {
        UserDataManagementHandler handler = new UserDataManagementHandler(new UserDataManagementHandler.DeleteUserAvatar(""));
        handler.deleteUserAvatar(new UserDataManagementHandler.OnDeleteUserAvatarListener() {
            @Override
            public void onDeleteUserAvatarResult(DeleteUserAvatarResult result) {
                if (result != null) {
                    String responseText = "onDeleteUserAvatar Response: " + result.toString();
                    Log.i("Result--",responseText);
                }
            }
            @Override
            public void onDeleteUserAvatarError(Exception error) {
                String errorText = "onDeleteUserAvatar Error: " + error.getMessage();
                Log.e(" Error--",errorText);
            }
        });
    }

    void ConfirmPurchase()
    {
        UserDataManagementHandler handler = new UserDataManagementHandler(new UserDataManagementHandler.ConfirmPurchase("sfas[ff"));
        handler.confirmPurchase(new UserDataManagementHandler.OnConfirmPurchaseListener() {
            @Override
            public void onConfirmPurchaseResult(ConfirmPurchaseResult result) {
                if (result != null) {
                    String responseText = "onconfirmPurchase Response: " + result.toString();
                    Log.i("Result--",responseText);
                }
            }
            @Override
            public void onConfirmPurchaseError(Exception error) {
                String errorText = "onconfirmPurchase Error: " + error.getMessage();
                Log.e(" Error--",errorText);
            }
        });

    }

    void GetPurchase()
    {
        UserDataManagementHandler handler = new UserDataManagementHandler(new UserDataManagementHandler.GetPurchase());
        handler.getPurchase(new UserDataManagementHandler.OnGetPurchaseListener() {
            @Override
            public void onGetPurchaseResult(GetPurchaseResult result) {
                if (result != null) {
                    String responseText = "onGetPurchase Response: " + result.toString();
                    Log.i("Result--",responseText);
                }
            }
            @Override
            public void onGetPurchaseError(Exception error) {
                String errorText = "onGetPurchase Error: " + error.getMessage();
                Log.e(" Error--",errorText);
            }
        });
    }

    void PayForPurchase()
    {
        PayForPurchaseRequest purchaseRequest = new PayForPurchaseRequest();

        purchaseRequest.setCurrencyCode("CC");
        purchaseRequest.setMetadata("");
        purchaseRequest.setUserID(ConfigurationApi.getuserID());
        purchaseRequest.setPaymentProvider("sfas");
        purchaseRequest.setTransactionID("fsasfafqr");

        UserDataManagementHandler handler = new UserDataManagementHandler(new UserDataManagementHandler.PayForPurchase(purchaseRequest));
        handler.payForPurchase(new UserDataManagementHandler.OnPayForPurchaseListener() {
            @Override
            public void onPayForPurchaseResult(PayForPurchaseResult result) {
                if (result != null) {
                    String responseText = "onPayForPurchase Response: " + result.toString();
                    Log.i("Result--",responseText);
                }
            }
            @Override
            public void onPayForPurchaseError(Exception error) {
                String errorText = "onPayForPurchase Error: " + error.getMessage();
                Log.e(" Error--",errorText);
            }
        });

    }

    /**
     * Opens the specified container, with the specified key (when required), and returns the contents of the opened container.
     * If the container (and key when relevant) are consumable (RemainingUses > 0), their RemainingUses will be decremented, consistent with the operation of ConsumeItem.
     */
    void UnlockContainerInstance()
    {
        UserDataManagementHandler handler = new UserDataManagementHandler(new UserDataManagementHandler.UnlockContainerInstance("sofhh","sfihasiv"));
        handler.unlockContainerInstance(new UserDataManagementHandler.OnUnlockContainerInstanceListener() {
            @Override
            public void onUnlockContainerInstanceResult(UnlockContainerInstanceResult result) {
                if (result != null) {
                    String responseText = "onUnlockContainer Response: " + result.toString();
                    Log.i("Result--",responseText);
                }
            }
            @Override
            public void onUnlockContainerInstanceError(Exception error) {
                String errorText = "onUnlockContainer Error: " + error.getMessage();
                Log.e(" Error--",errorText);
            }
        });
    }
}