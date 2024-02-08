package Avataryug.Example.QuickTest;

import static android.widget.Toast.LENGTH_SHORT;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import Avataryug.Client.ConfigurationApi;
import Avataryug.Client.Handler.AuthenticateHandler;
import Avataryug.Client.Model.LoginWithAndroidDeviceIDResult;
import Avataryug.Client.Model.LoginWithAppleResult;
import Avataryug.Client.Model.LoginWithCustomIDResult;
import Avataryug.Client.Model.LoginWithEmailAddressResult;
import Avataryug.Client.Model.LoginWithFacebookResult;
import Avataryug.Client.Model.LoginWithGoogleResult;
import Avataryug.Client.Model.LoginWithIOSDeviceIDResult;
import Avataryug.Client.Model.RegisterUserResult;
import com.example.myjavasdkandroid.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/**
 * This ExampleAuthentication Class demonstrates API calling methods with temporary data.
 * A simple {@link Fragment} subclass.
 * Use the {@link ExampleAuthentication#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ExampleAuthentication extends Fragment {

    public ExampleAuthentication() {
        // Required empty public constructor
    }

    public static ExampleAuthentication newInstance() {
        ExampleAuthentication fragment = new ExampleAuthentication();
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
        View rootView = inflater.inflate(R.layout.fragment_example_authentication, container, false);

        FloatingActionButton backButton = rootView.findViewById(R.id.AuthBackButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(rootView.getContext(), StartScreen.class);
                startActivity(i);
                Toast.makeText(rootView.getContext(), "BACK", LENGTH_SHORT).show();
            }
        });

        // Find the button by its ID
        Button CustomIDBtn = rootView.findViewById(R.id.CustomIDBtn);
        // Set the click listener for the button
        CustomIDBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show the Toast message when the button is clicked
                Toast.makeText(getActivity(), "Login with Custom ID", Toast.LENGTH_SHORT).show();
                LoginWithCustom();
            }
        });

        Button androidDeviceBtn = rootView.findViewById(R.id.AndroidIDBtn);
        androidDeviceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginWithAndroidID();
                Toast.makeText(getActivity(), "Android Login", Toast.LENGTH_SHORT).show();
            }
        });

        Button iOSDeviceBtn = rootView.findViewById(R.id.IOSDeviceIDBtn);
        iOSDeviceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginWithIOSID();
                Toast.makeText(getActivity(), "IOS Device Login", Toast.LENGTH_SHORT).show();
            }
        });

        Button appleBtn = rootView.findViewById(R.id.LoginwithAppleBtn);
        appleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginWithApple();
                Toast.makeText(getActivity(), "Apple Login", Toast.LENGTH_SHORT).show();
            }
        });

        Button newAccountBtn = rootView.findViewById(R.id.newAccountBtn);
        newAccountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateNewAccounts();
                Toast.makeText(getActivity(), "Create Account", Toast.LENGTH_SHORT).show();
            }
        });

        Button loginEmailBtn = rootView.findViewById(R.id.loginEmailBtn);
        loginEmailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginWithEmail();
                Toast.makeText(getActivity(), "Login Email", Toast.LENGTH_SHORT).show();
            }
        });

        Button faceBookBtn = rootView.findViewById(R.id.LoginFacebookBtn);
        faceBookBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginWthFB();
                Toast.makeText(getActivity(), "Login FACEBOOK", Toast.LENGTH_SHORT).show();
            }
        });

        Button googleBtn = rootView.findViewById(R.id.SignINBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoogleSignIn();
                Toast.makeText(getActivity(), "Login GOGGLE", Toast.LENGTH_SHORT).show();
            }
        });

        // Inflate the layout for this fragment
        return rootView;
    }

    /**
     * Signs the user in using a custom unique identifier, which can be a combination of strings, integers, numbers, and symbols,
     * creating a session identifier for subsequent API calls that require an authenticated use
     */
    void LoginWithCustom()
    {
        AuthenticateHandler handler = new AuthenticateHandler( new AuthenticateHandler.LoginWithCustomID("OHHHHHNOOOOO98",true));
        handler.loginWithCustomID(new AuthenticateHandler.LoginWithCustomIDListener() {
            @Override
            public void onLoginWithCustomIDResult(LoginWithCustomIDResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onLoginWithCustomID-->>Result--",responseText);
                    ConfigurationApi.setAccessToken(result.getData().getAccessToken());
                    ConfigurationApi.setuserID(result.getData().getUser().getUserID());
                }
            }
            @Override
            public void onLoginWithCustomIDError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onLoginWithCustomID--->>Error--",errorText);
            }
        });
    }

    /**
     * Signs the user in using the Android device identifier,
     * returning a session identifier that can subsequently be used for API calls which require an authenticated user.
     */
    void LoginWithAndroidID()
    {
        AuthenticateHandler handler = new AuthenticateHandler( new AuthenticateHandler.LoginWithAndroidDeviceID("VISION404",true));
        handler.loginWithAndroidDeviceID(new AuthenticateHandler.LoginWithAndroidDeviceIDListener() {
            @Override
            public void onLoginWithAndroidDeviceIDResult(LoginWithAndroidDeviceIDResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onLoginWithAndroidDeviceID->>Result--",responseText);
                    ConfigurationApi.setAccessToken(result.getData().getAccessToken());
                    ConfigurationApi.setuserID(result.getData().getUser().getUserID());
                }
            }

            @Override
            public void onLoginWithAndroidDeviceIDError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onLoginWithAndroidDeviceID--->>Error--",errorText);
            }
        });

    }

    /**
     * Register user with email id,
     * creating a session identifier for subsequent API calls that require an authenticated user.
     */
    void CreateNewAccounts()
    {
        AuthenticateHandler handler = new AuthenticateHandler( new AuthenticateHandler.RegisterUser("AndroidSDK 21Test","selej10756@quipas.com","12"));
        handler.registerUser(new AuthenticateHandler.RegisterUserListener() {
            @Override
            public void onRegisterUserResult(RegisterUserResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onRegisterUser->>Result--",responseText);
                    ConfigurationApi.setAccessToken(result.getData().getAccessToken());
                    ConfigurationApi.setuserID(result.getData().getUser().getUserID());
                }
            }

            @Override
            public void onRegisterUserError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onRegisterUser--->>Error--",errorText);
            }
        });
    }

    /**
     * Signs the user into the Avataryug account, returning a session identifier that can subsequently be used for API calls which require an authenticated user.
     * Unlike most other login API calls, LoginWithEmailAddress does not permit the creation of new accounts via the CreateAccountFlag.
     */
    void LoginWithEmail()
    {
        AuthenticateHandler handler = new AuthenticateHandler(new AuthenticateHandler.LoginWithEmailAddress("selej10756@quipas.com","12",true));
        handler.loginWithEmailAddress(new AuthenticateHandler.OnLoginWithEmailAddressListener() {
            @Override
            public void onLoginWithEmailAddressResult(LoginWithEmailAddressResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onLoginWithEmailAddress->>Result--",responseText);
                    ConfigurationApi.setAccessToken(result.getData().getAccessToken());
                    ConfigurationApi.setuserID(result.getData().getUser().getUserID());
                }
            }
            @Override
            public void onLoginWithEmailAddressError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onLoginWithEmailAddress--->>Error--",errorText);
            }
        });
    }

    /**
     * Signs in the user using an identity token obtained from Sign in with Apple,
     * returning a session identifier that can subsequently be used for API calls which require an authenticated user.
     */
    void LoginWithApple()
    {
        AuthenticateHandler handler = new AuthenticateHandler(new AuthenticateHandler.LoginWithApple("TOKEN TAKEN 023",true,"PINEAPPLE143"));
        handler.loginWithApple(new AuthenticateHandler.LoginWithAppleListener() {
            @Override
            public void onLoginWithAppleResult(LoginWithAppleResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onLoginWithApple->>Result--",responseText);
                    ConfigurationApi.setAccessToken(result.getData().getAccessToken());
                    ConfigurationApi.setuserID(result.getData().getUser().getUserID());
                }
            }

            @Override
            public void onLoginWithAppleError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onLoginWithApple--->>Error--",errorText);
            }
        });
    }

    /**
     * Signs the user in using the vendor-specific iOS device identifier,
     * returning a session identifier that can subsequently be used for API calls which require an authenticated user
     */
    void LoginWithIOSID()
    {
        AuthenticateHandler handler = new AuthenticateHandler(new AuthenticateHandler.LoginWithIOSDeviceID("IOS SOI1019",true));
        handler.loginWithIOSDeviceID(new AuthenticateHandler.LoginWithIOSDeviceIDListener() {
            @Override
            public void onLoginWithIOSDeviceIDResult(LoginWithIOSDeviceIDResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onLoginWithIOSDeviceID->>Result--",responseText);
                    ConfigurationApi.setAccessToken(result.getData().getAccessToken());
                    ConfigurationApi.setuserID(result.getData().getUser().getUserID());
                }
            }
            @Override
            public void onLoginWithIOSDeviceIDError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onLoginWithIOSDeviceID--->>Error--",errorText);
            }
        });
    }

    /**
     * Signs the user in using their Google account credentials,
     * returning a session identifier that can subsequently be used for API calls which require an authenticated user.
     */
    void GoogleSignIn()
    {
        AuthenticateHandler handler = new AuthenticateHandler(new AuthenticateHandler.LoginWithGoogle("AUTHCODE123",true,"GOOGLESH ID 007"));
        handler.loginWithGoogle(new AuthenticateHandler.LoginWithGoogleListener() {
            @Override
            public void onLoginWithGoogleResult(LoginWithGoogleResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onLoginWithGoogle->>Result--",responseText);
                    ConfigurationApi.setAccessToken(result.getData().getAccessToken());
                    ConfigurationApi.setuserID(result.getData().getUser().getUserID());
                }
            }
            @Override
            public void onLoginWithGoogleError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onLoginWithGoogle--->>Error--",errorText);
            }
        });
    }

    /**
     * Signs the user in using a Facebook access token,
     * returning a session identifier that can subsequently be used for API calls which require an authenticated user.
     */
    void LoginWthFB()
    {
        AuthenticateHandler handler = new AuthenticateHandler(new AuthenticateHandler.LoginWithFacebook("AccessTokensFB111",true,"FBID00111"));
        handler.loginWithFacebook(new AuthenticateHandler.LoginWithFacebookListener() {
            @Override
            public void onLoginWithFacebookResult(LoginWithFacebookResult result) {
                if (result != null) {
                    String responseText = "API Response: " + result.toString();
                    Log.i("onLoginWithFacebook->>Result--",responseText);
                    ConfigurationApi.setAccessToken(result.getData().getAccessToken());
                    ConfigurationApi.setuserID(result.getData().getUser().getUserID());
                }
            }
            @Override
            public void onLoginWithFacebookError(Exception error) {
                String errorText = "API Error: " + error.getMessage();
                Log.e("onLoginWithFacebook--->>Error--",errorText);
            }
        });
    }
}