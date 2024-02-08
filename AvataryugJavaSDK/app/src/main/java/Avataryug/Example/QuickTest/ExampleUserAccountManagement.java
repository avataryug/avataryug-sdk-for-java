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
import Avataryug.Client.Handler.UserAccountManagementHandler;
import Avataryug.Client.Model.AddGenericServiceIDResult;
import Avataryug.Client.Model.ChangePasswordResult;
import Avataryug.Client.Model.DeleteUserResult;
import Avataryug.Client.Model.GetUserAccountInfoResult;
import Avataryug.Client.Model.GetUserProfileResult;
import Avataryug.Client.Model.LinkAndroidDeviceIDResult;
import Avataryug.Client.Model.LinkAppleResult;
import Avataryug.Client.Model.LinkCustomIDResult;
import Avataryug.Client.Model.LinkFacebookAccountResult;
import Avataryug.Client.Model.LinkGoogleAccountResult;
import Avataryug.Client.Model.LinkIOSDeviceIDResult;
import Avataryug.Client.Model.RemoveGenericServiceIDResult;
import Avataryug.Client.Model.UnlinkAndroidDeviceIDResult;
import Avataryug.Client.Model.UnlinkAppleResult;
import Avataryug.Client.Model.UnlinkCustomIDResult;
import Avataryug.Client.Model.UnlinkFacebookAccountResult;
import Avataryug.Client.Model.UnlinkGoogleAccountResult;
import Avataryug.Client.Model.UnlinkIOSDeviceIDResult;
import Avataryug.Client.Model.UpdateDefaultAvatarIDResult;
import Avataryug.Client.Model.UpdateUserDemographicsResult;
import Avataryug.Client.Model.UpdateUserProjectDisplayNameResult;
import com.example.myjavasdkandroid.R;

/**
 * This ExampleUserAccountManagement Class demonstrates API calling methods with temporary data.
 * A simple {@link Fragment} subclass.
 * Use the {@link ExampleUserAccountManagement#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ExampleUserAccountManagement extends Fragment {
    public ExampleUserAccountManagement() {
        // Required empty public constructor
    }
    public static ExampleUserAccountManagement newInstance() {
        ExampleUserAccountManagement fragment = new ExampleUserAccountManagement();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        View rootView =inflater.inflate(R.layout.fragment_example_user_account_management, container, false);

        Button linkCustomBtn = rootView.findViewById(R.id.LinkCustomIDBtn);
        linkCustomBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinkCustom();
                Toast.makeText(getActivity(), "Link Custom", Toast.LENGTH_SHORT).show();
            }
        });

        Button unlinkCustomBtn = rootView.findViewById(R.id.UnlinkCustomBtn);
        unlinkCustomBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UnLinkCustom();
                Toast.makeText(getActivity(), "Unlink Custom", Toast.LENGTH_SHORT).show();
            }
        });

        Button linkAndroidIdBtn = rootView.findViewById(R.id.LinkAndroidDeviceBtn);
        linkAndroidIdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinkAndroidDevice();
                Toast.makeText(getActivity(), "Link Android", Toast.LENGTH_SHORT).show();
            }
        });

        Button unlinkAndroidIdBtn = rootView.findViewById(R.id.UnLinkAndroidDeviceBtn);
        unlinkAndroidIdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UnLinkAndroidDevice();
                Toast.makeText(getActivity(), "Unlink Android", Toast.LENGTH_SHORT).show();
            }
        });

        Button linkIOSDeviceIDBtn = rootView.findViewById(R.id.LinkIOSDeviceBtn);
        linkIOSDeviceIDBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinkIosDevice();
                Toast.makeText(getActivity(), "Link IOS Device", Toast.LENGTH_SHORT).show();
            }
        });

        Button unLinkIOSDeviceIDBtn = rootView.findViewById(R.id.UnLinkIOSDeviceBtn);
        unLinkIOSDeviceIDBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UnLinkIosDevice();
                Toast.makeText(getActivity(), "Unlink IOS Device", Toast.LENGTH_SHORT).show();
            }
        });

        Button linkAppletn = rootView.findViewById(R.id.LinkAppleBtn);
        linkAppletn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinkApple();
                Toast.makeText(getActivity(), "Link Apple", Toast.LENGTH_SHORT).show();
            }
        });

        Button unLinkAppleBtn = rootView.findViewById(R.id.UnLinkAppleBtn);
        unLinkAppleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UnLinkApple();
                Toast.makeText(getActivity(), "Unlink Apple", Toast.LENGTH_SHORT).show();
            }
        });

        Button linkGoogleBtn = rootView.findViewById(R.id.LinkGoogleBtn);
        linkGoogleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinkGoogleAccount();
                Toast.makeText(getActivity(), "Link Google", Toast.LENGTH_SHORT).show();
            }
        });

        Button unLinkGoogleBtn = rootView.findViewById(R.id.UnLinkGoogleBtn);
        unLinkGoogleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UnLinkGoogleAccount();
                Toast.makeText(getActivity(), "Unlink Google", Toast.LENGTH_SHORT).show();
            }
        });

        Button linkFBtn = rootView.findViewById(R.id.LinkFacebookBtn);
        linkFBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinkFB();
                Toast.makeText(getActivity(), "Link FB", Toast.LENGTH_SHORT).show();
            }
        });

        Button unLinkFBBtn = rootView.findViewById(R.id.UnLinkFacebookBtn);
        unLinkFBBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UnlinkFB();
                Toast.makeText(getActivity(), "Unlink FB", Toast.LENGTH_SHORT).show();
            }
        });

        Button addGenericServiceBtn = rootView.findViewById(R.id.AddGenericServiceBtn);
        addGenericServiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddGenericService();
                Toast.makeText(getActivity(), "Add Generic Service", Toast.LENGTH_SHORT).show();
            }
        });

        Button removeGenericServiceBtn = rootView.findViewById(R.id.RemoveGenericServiceBtn);
        removeGenericServiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RemoveGenericService();
                Toast.makeText(getActivity(), "Remove Generic Service", Toast.LENGTH_SHORT).show();
            }
        });

        Button updateProjectNameBtn = rootView.findViewById(R.id.UpdateProjectDisplayNameBtn);
        updateProjectNameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UpdateDisplayname();
                Toast.makeText(getActivity(), "Update Display Name", Toast.LENGTH_SHORT).show();
            }
        });

        Button getUserInfoBtn = rootView.findViewById(R.id.getUserAccountInfo);
        getUserInfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetUserAccountInfo();
                Toast.makeText(getActivity(), "Get User Info", Toast.LENGTH_SHORT).show();
            }
        });

        Button updateDemographicBtn = rootView.findViewById(R.id.UpdateUserDemographicBtn);
        updateDemographicBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UpdateUserDemographic();
                Toast.makeText(getActivity(), "Update User Demographic", Toast.LENGTH_SHORT).show();
            }
        });

        Button getUserprofileBtn = rootView.findViewById(R.id.GetuserProfileBtn);
        getUserprofileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetUserProfile();
                Toast.makeText(getActivity(), "Get User Profile", Toast.LENGTH_SHORT).show();
            }
        });

        Button deleteUserBtn = rootView.findViewById(R.id.DeleteUserBtn);
        deleteUserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DeleteUsers();;
                Toast.makeText(getActivity(), "Delete User", Toast.LENGTH_SHORT).show();
            }
        });

        Button updateDefaultAvatarBtn = rootView.findViewById(R.id.UpdateDefaultAvatarBtn);
        updateDefaultAvatarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UpdateDefaultAvatarID();
                Toast.makeText(getActivity(), "Update Default Avatar By ID", Toast.LENGTH_SHORT).show();
            }
        });

        Button changePasswordBtn = rootView.findViewById(R.id.ChangePasswordBtn);
        changePasswordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Changepassword();
                Toast.makeText(getActivity(), "Change Password", Toast.LENGTH_SHORT).show();
            }
        });

        // Inflate the layout for this fragment
        return rootView;
    }

    /**
     * Links the custom identifier, generated by the Project, to the user's Avataryug account.
     */
    void LinkCustom()
    {
        UserAccountManagementHandler handler = new UserAccountManagementHandler(new UserAccountManagementHandler.LinkCustomID("LInkerCustomIDS",true));
        handler.linkCustomID(new UserAccountManagementHandler.OnLinkCustomIDResultListener() {
            @Override
            public void onLinkCustomIDResult(LinkCustomIDResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onLinkCustomID->>Result--",responseText);
                }
            }
            @Override
            public void onError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onLinkCustomID--->>Error--",errorText);
            }
        });
    }

    /**
     * Unlinks the related custom identifier from the user's Avataryug account.
     */
    void UnLinkCustom()
    {
        UserAccountManagementHandler handler = new UserAccountManagementHandler(new UserAccountManagementHandler.UnlinkCustomID());
        handler.unlinkCustomID(new UserAccountManagementHandler.OnUnlinkCustomIDListener() {
            @Override
            public void onUnlinkCustomIDResult(UnlinkCustomIDResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("UnLinkCustom->>Result--",responseText);
                }
            }
            @Override
            public void onUnlinkCustomIDError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("UnLinkCustom--->>Error--",errorText);
            }
        });
    }

    /**
     * Links the Android device identifier to the user's Avataryug account.
     */
    void LinkAndroidDevice()
    {
        UserAccountManagementHandler handler = new UserAccountManagementHandler( new UserAccountManagementHandler.LinkAndroidDeviceID("Android007",true));
        handler.linkAndroidDeviceID(new UserAccountManagementHandler.LinkAndroidDeviceIDListener() {
            @Override
            public void onLinkAndroidDeviceIDResult(LinkAndroidDeviceIDResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onLinkAndroidDeviceID->>Result--",responseText);
                }
            }

            @Override
            public void onLinkAndroidDeviceIDError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onLinkAndroidDeviceID--->>Error--",errorText);
            }
        });
    }

    /**
     * Unlinks the related Android device identifier from the user's Avataryug account.
     */
    void UnLinkAndroidDevice()
    {
        UserAccountManagementHandler handler = new UserAccountManagementHandler(new UserAccountManagementHandler.UnlinkAndroidDeviceID());
        handler.unlinkAndroidDeviceID(new UserAccountManagementHandler.UnlinkAndroidDeviceIDListener() {
            @Override
            public void onUnlinkAndroidDeviceIDResult(UnlinkAndroidDeviceIDResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onUnlinkAndroidDeviceID->>Result--",responseText);
                }
            }
            @Override
            public void onUnlinkAndroidDeviceIDError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onUnlinkAndroidDeviceID--->>Error--",errorText);
            }
        });
    }

    /**
     * Links the vendor-specific iOS device identifier to the user's Avataryug account.
     */
    void LinkIosDevice()
    {
        UserAccountManagementHandler handler = new UserAccountManagementHandler(new UserAccountManagementHandler.LinkIOSDeviceID("",true));
        handler.linkIOSDeviceID(new UserAccountManagementHandler.LinkIOSDeviceIDListener() {
            @Override
            public void onLinkIOSDeviceIDResult(LinkIOSDeviceIDResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onLinkIOSDeviceID->>Result--",responseText);
                }
            }
            @Override
            public void onLinkIOSDeviceIDError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onLinkIOSDeviceID--->>Error--",errorText);
            }
        });
    }

    /**
     * Unlinks the related iOS device identifier from the user's Avataryug account.
     */
    void UnLinkIosDevice()
    {
        UserAccountManagementHandler handler = new UserAccountManagementHandler(new UserAccountManagementHandler.UnlinkIOSDeviceID());
        handler.unlinkIOSDeviceID(new UserAccountManagementHandler.UnlinkIOSDeviceIDListener() {
            @Override
            public void onUnlinkIOSDeviceIDResult(UnlinkIOSDeviceIDResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onUnlinkIOSDeviceID->>Result--",responseText);
                }
            }
            @Override
            public void onUnlinkIOSDeviceIDError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onUnlinkIOSDeviceID--->>Error--",errorText);
            }
        });
    }

    /**
     *   /// Links the Apple account associated with the token to the user's Avataryug account.
     */
    void LinkApple()
    {
        UserAccountManagementHandler handler = new UserAccountManagementHandler( new UserAccountManagementHandler.LinkApple("APPLE31200",true,"TOKEN APPLE0131"));
        handler.linkApple(new UserAccountManagementHandler.LinkAppleListener() {
            @Override
            public void onLinkAppleResult(LinkAppleResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onLinkApple->>Result--",responseText);
                }
            }
            @Override
            public void onLinkAppleError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onLinkApple--->>Error--",errorText);
            }
        });
    }

    /**
     * Unlinks the related Apple account from the user's Avataryug account.
     */
    void UnLinkApple()
    {
        UserAccountManagementHandler handler = new UserAccountManagementHandler(new UserAccountManagementHandler.UnlinkApple());
        handler.unlinkApple(new UserAccountManagementHandler.UnlinkAppleResultListener() {
            @Override
            public void onUnlinkAppleResult(UnlinkAppleResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onUnlinkApple->>Result--",responseText);
                }
            }
            @Override
            public void onUnlinkAppleError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onUnlinkApple--->>Error--",errorText);
            }
        });
    }

    /**
     * Links the currently signed-in user account to their Google account, using their Google account credentials
     */
    void LinkGoogleAccount()
    {
        UserAccountManagementHandler handler = new UserAccountManagementHandler(new UserAccountManagementHandler.LinkGoogleAccount("GOOGLEULTRAMAX0101",true,"AUTH01010"));
        handler.linkGoogleAccount(new UserAccountManagementHandler.LinkGoogleAccountListener() {
            @Override
            public void onLinkGoogleAccountResult(LinkGoogleAccountResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onLinkGoogleAccount->>Result--",responseText);
                }
            }
            @Override
            public void onLinkGoogleAccountError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onLinkGoogleAccount--->>Error--",errorText);
            }
        });
    }

    /**
     * Unlinks the related Google account from the user's Avataryug account
     */
    void UnLinkGoogleAccount()
    {
        UserAccountManagementHandler handler =  new UserAccountManagementHandler(new UserAccountManagementHandler.UnlinkGoogleAccount());
        handler.unlinkGoogleAccount(new UserAccountManagementHandler.OnUnlinkGoogleAccountResultListener() {
            @Override
            public void onUnlinkGoogleAccountResult(UnlinkGoogleAccountResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onUnlinkGoogleAccount->>Result--",responseText);
                }
            }
            @Override
            public void onUnlinkGoogleAccountError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onUnlinkGoogleAccount--->>Error--",errorText);
            }
        });
    }

    /**
     * Links the Facebook account associated with the provided Facebook access token to the user's Avataryug account.
     */
    void LinkFB()
    {
        UserAccountManagementHandler handler = new UserAccountManagementHandler(new UserAccountManagementHandler.LinkFacebookAccount("",true,""));
        handler.linkFacebookAccount(new UserAccountManagementHandler.OnLinkFacebookAccountListener() {
            @Override
            public void onLinkFacebookAccountResult(LinkFacebookAccountResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onLinkFacebookAccount->>Result--",responseText);
                }
            }
            @Override
            public void onLinkFacebookAccountError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onLinkFacebookAccount--->>Error--",errorText);
            }
        });
    }

    /**
     * Unlinks the related Facebook account from the user's Avataryug account.
     */
    void UnlinkFB()
    {
        UserAccountManagementHandler handler = new UserAccountManagementHandler(new UserAccountManagementHandler.UnlinkFacebookAccount());
        handler.unlinkFacebookAccount(new UserAccountManagementHandler.OnUnlinkFacebookAccountListener() {
            @Override
            public void onUnlinkFacebookAccountResult(UnlinkFacebookAccountResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onUnlinkFacebookAccount->>Result--",responseText);
                }
            }
            @Override
            public void onUnlinkFacebookAccountError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onUnlinkFacebookAccount--->>Error--",errorText);
            }
        });
    }

    /**
     * Adds the specified generic service identifier to the user's Avataryug account.
     * This is designed to allow for a Avataryug ID lookup of any arbitrary service identifier a Project wants to add.
     * This identifier should never be used as authentication credentials, as the intent is that it is easily accessible by other users.
     */
    void AddGenericService()
    {
        UserAccountManagementHandler handler = new UserAccountManagementHandler(new UserAccountManagementHandler.AddGenericServiceID("ADD Generic ID01010"));
        handler.addGenericServiceID(new UserAccountManagementHandler.OnAddGenericServiceIDListener() {
            @Override
            public void onAddGenericServiceIDResult(AddGenericServiceIDResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onAddGenericServiceID->>Result--",responseText);
                }
            }
            @Override
            public void onAddGenericServiceIDError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onAddGenericServiceID--->>Error--",errorText);
            }
        });
    }

    /**
     * Removes the generic service identifier from the user's Avataryug account.
     */
    void RemoveGenericService()
    {
        UserAccountManagementHandler handler = new UserAccountManagementHandler(new UserAccountManagementHandler.RemoveGenericServiceID());
        handler.removeGenericServiceID(new UserAccountManagementHandler.OnRemoveGenericServiceIDListener() {
            @Override
            public void onRemoveGenericServiceIDResult(RemoveGenericServiceIDResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onRemoveGenericServiceID->>Result--",responseText);
                }
            }
            @Override
            public void onRemoveGenericServiceIDError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onRemoveGenericServiceID--->>Error--",errorText);
            }
        });
    }

    /**
     * Updates the display name for the user in the project.
     */
    void UpdateDisplayname()
    {
        UserAccountManagementHandler handler = new UserAccountManagementHandler(new UserAccountManagementHandler.UpdateUserProjectDisplayName("Updated Name Test"));
        handler.updateUserProjectDisplayName(new UserAccountManagementHandler.OnUpdateUserProjectDisplayNameListener() {
            @Override
            public void onUpdateUserProjectDisplayNameResult(UpdateUserProjectDisplayNameResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onUpdateUserProjectDisplayName->>Result--",responseText);
                }
            }
            @Override
            public void onUpdateUserProjectDisplayNameError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onUpdateUserProjectDisplayName--->>Error--",errorText);
            }
        });
    }

    /**
     * Retrieves information about the user's account.
     */
    void GetUserAccountInfo()
    {
        UserAccountManagementHandler handler = new UserAccountManagementHandler(new UserAccountManagementHandler.GetUserAccountInfo());
        handler.getUserAccountInfo(new UserAccountManagementHandler.OnGetUserAccountInfoListener() {
            @Override
            public void onGetUserAccountInfoResult(GetUserAccountInfoResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onGetUserAccountInfo->>Result--",responseText);
                }
            }
            @Override
            public void onGetUserAccountInfoError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onGetUserAccountInfo--->>Error--",errorText);
            }
        });
    }

    /**
     * Updates user demographic information.
     */
    void UpdateUserDemographic()
    {
        UserAccountManagementHandler handler = new UserAccountManagementHandler(new UserAccountManagementHandler.UpdateUserDemographics("1","20-24","Asian"));
        handler.updateUserDemographics(new UserAccountManagementHandler.OnUpdateUserDemographicsListener() {
            @Override
            public void onUpdateUserDemographicsResult(UpdateUserDemographicsResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onUpdateUserDemographics->>Result--",responseText);
                }
            }
            @Override
            public void onUpdateUserDemographicsError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onUpdateUserDemographics--->>Error--",errorText);
            }
        });
    }

    /**
     * etrieves the user's public profile information.
     */
    void  GetUserProfile()
    {
        UserAccountManagementHandler handler = new UserAccountManagementHandler(new UserAccountManagementHandler.GetUserProfile(ConfigurationApi.getuserID()));
        handler.getUserProfile(new UserAccountManagementHandler.OnGetUserProfileListener() {
            @Override
            public void onGetUserProfileResult(GetUserProfileResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onGetUserProfile->>Result--",responseText);
                }
            }
            @Override
            public void onGetUserProfileError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onGetUserProfile--->>Error--",errorText);
            }
        });
    }

    /**
     * Delete User Account from Avataryug platform.
     */
    void DeleteUsers()
    {
        UserAccountManagementHandler handler = new UserAccountManagementHandler(new UserAccountManagementHandler.DeleteUser());
        handler.deleteUser(new UserAccountManagementHandler.OnDeleteUserListener() {
            @Override
            public void onDeleteUserResult(DeleteUserResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onDeleteUse->>Result--",responseText);
                }
            }
            @Override
            public void onDeleteUserError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onDeleteUse--->>Error--",errorText);
            }
        });
    }

    /**
     * Sets the default avatar ID to users account.
     */
    void UpdateDefaultAvatarID()
    {
        UserAccountManagementHandler handler = new UserAccountManagementHandler(new UserAccountManagementHandler.UpdateDefaultAvatarID("fashfh"));
        handler.updateDefaultAvatarID(new UserAccountManagementHandler.OnUpdateDefaultAvatarIDListener() {
            @Override
            public void onUpdateDefaultAvatarIDResult(UpdateDefaultAvatarIDResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onUpdateDefaultAvatarID->>Result--",responseText);
                }
            }
            @Override
            public void onUpdateDefaultAvatarIDError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onUpdateDefaultAvatarID--->>Error--",errorText);
            }
        });
    }

    /**
     * Allows users to change their password.
     */
    void Changepassword()
    {
        UserAccountManagementHandler handler = new UserAccountManagementHandler(new UserAccountManagementHandler.ChangePassword("1212112","fqewtff"));
        handler.changePassword(new UserAccountManagementHandler.OnChangePasswordListener() {
            @Override
            public void onChangePasswordResult(ChangePasswordResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onChangePassword->>Result--",responseText);
                }
            }
            @Override
            public void onChangePasswordError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onChangePassword--->>Error--",errorText);
            }
        });

    }
}