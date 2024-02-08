package Avataryug.Client.Handler;

import Avataryug.Client.Api.AuthenticationApi;
import Avataryug.Client.Model.LoginWithAndroidDeviceIDRequest;
import Avataryug.Client.Model.LoginWithAndroidDeviceIDResult;
import Avataryug.Client.Model.LoginWithAppleRequest;
import Avataryug.Client.Model.LoginWithAppleResult;
import Avataryug.Client.Model.LoginWithCustomIDRequest;
import Avataryug.Client.Model.LoginWithCustomIDResult;
import Avataryug.Client.Model.LoginWithEmailAddressRequest;
import Avataryug.Client.Model.LoginWithEmailAddressResult;
import Avataryug.Client.Model.LoginWithFacebookRequest;
import Avataryug.Client.Model.LoginWithFacebookResult;
import Avataryug.Client.Model.LoginWithGoogleRequest;
import Avataryug.Client.Model.LoginWithGoogleResult;
import Avataryug.Client.Model.LoginWithIOSDeviceIDRequest;
import Avataryug.Client.Model.LoginWithIOSDeviceIDResult;
import Avataryug.Client.Model.RegisterUserRequest;
import Avataryug.Client.Model.RegisterUserResult;
import com.android.volley.Response;
import com.android.volley.VolleyError;

/**
 * Warning: Please refrain from modifying or editing these classes as it may potentially result in breaking the SDK functionality.
 * The "AuthenticateHandler" class facilitates authentication operations by utilizing the "Base" class for API calls.
 * It offers multiple functions for various authentication scenarios,
 * These functions accept callback parameters to handle response and error conditions.
 * By leveraging the "callApi" instance, the class ensures appropriate API calls are made and callbacks are invoked accordingly.
 */
public class AuthenticateHandler {
    private Base apiBase;

    public AuthenticateHandler(Base apiBase) {
        this.apiBase = apiBase;
    }

    /**
     * Signs the user in using a custom unique identifier, which can be a combination of strings, integers, numbers, and symbols.
     * @param listener
     */
    public void loginWithCustomID(final LoginWithCustomIDListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof LoginWithCustomIDResult) {
                    if (listener != null) {
                        listener.onLoginWithCustomIDResult((LoginWithCustomIDResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onLoginWithCustomIDError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onLoginWithCustomIDError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the LoginWithCustomID method
     */
    public interface LoginWithCustomIDListener {
        void onLoginWithCustomIDResult(LoginWithCustomIDResult result);
        void onLoginWithCustomIDError(Exception error);
    }

    /**
     * Signs the user in using a custom unique identifier, which can be a combination of strings, integers, numbers, and symbols,
     * creating a session identifier for subsequent API calls that require an authenticated user.
     */
    public static class LoginWithCustomID implements Base{
        private boolean createAccount;
        private String customID;

        public LoginWithCustomID(String customID, boolean createAccount) {
            this.createAccount = createAccount;
            this.customID = customID;
        }

        @Override
        public void callApi(final OnApiResultListener listener) {
            LoginWithCustomIDRequest loginWithCustomIDRequest = new LoginWithCustomIDRequest();
            loginWithCustomIDRequest.setCustomID(customID);
            loginWithCustomIDRequest.setCreateAccount(createAccount);
            AuthenticationApi.loginWithCustomID(loginWithCustomIDRequest, new Response.Listener<LoginWithCustomIDResult>() {
                @Override
                public void onResponse(LoginWithCustomIDResult response) {

                    listener.onResult(response);
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    listener.onError(error);
                }
            });
        }
    }

    /**
     *Signs the user in using the Android device identifier.
     * @param listener
     */
    public void loginWithAndroidDeviceID(final LoginWithAndroidDeviceIDListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof LoginWithAndroidDeviceIDResult) {
                    if (listener != null) {
                        listener.onLoginWithAndroidDeviceIDResult((LoginWithAndroidDeviceIDResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onLoginWithAndroidDeviceIDError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onLoginWithAndroidDeviceIDError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the LoginWithAndroidDeviceID method
     */
    public interface LoginWithAndroidDeviceIDListener {
        void onLoginWithAndroidDeviceIDResult(LoginWithAndroidDeviceIDResult result);
        void onLoginWithAndroidDeviceIDError(Exception error);
    }

    /**
     * Signs the user in using the Android device identifier,
     *  returning a session identifier that can subsequently be used for API calls which require an authenticated user.
     */
    public static class LoginWithAndroidDeviceID implements Base {

        private boolean createAccount;
        private String androidDeviceID;

        public LoginWithAndroidDeviceID(String androidDeviceID, boolean createAccount) {
            this.createAccount = createAccount;
            this.androidDeviceID = androidDeviceID;
        }

        @Override
        public void callApi(final OnApiResultListener listener) {
            LoginWithAndroidDeviceIDRequest loginWithAndroidDeviceIDRequest = new LoginWithAndroidDeviceIDRequest();
            loginWithAndroidDeviceIDRequest.setAndroidDeviceID(androidDeviceID);
            loginWithAndroidDeviceIDRequest.setCreateAccount(createAccount);
            AuthenticationApi.loginWithAndroidDeviceID(loginWithAndroidDeviceIDRequest, new Response.Listener<LoginWithAndroidDeviceIDResult>() {
                @Override
                public void onResponse(LoginWithAndroidDeviceIDResult response) {
                    listener.onResult(response);
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    listener.onError(error);
                }
            });
        }
    }

    /**
     *  Register user with email id.
     * @param listener
     */
    public void registerUser(final RegisterUserListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof RegisterUserResult) {
                    if (listener != null) {
                        listener.onRegisterUserResult((RegisterUserResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onRegisterUserError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onRegisterUserError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the RegisterUser method.
     */
    public interface RegisterUserListener {
        void onRegisterUserResult(RegisterUserResult result);
        void onRegisterUserError(Exception error);
    }

    /**
     * Register user with email id,
     * creating a session identifier for subsequent API calls that require an authenticated user.
     */
    public static class RegisterUser implements Base {
        private String addDisplayName;
        private String emailID;
        private String password;

        public RegisterUser(String addDisplayName, String emailID, String password) {
            this.addDisplayName = addDisplayName;
            this.emailID = emailID;
            this.password = password;
        }

        @Override
        public void callApi(final OnApiResultListener listener) {
            RegisterUserRequest registerUserRequest = new RegisterUserRequest();
            registerUserRequest.setDisplayName(addDisplayName);
            registerUserRequest.setEmailID(emailID);
            registerUserRequest.setPassword(password);
            AuthenticationApi.registerUser(registerUserRequest, new Response.Listener<RegisterUserResult>() {
                @Override
                public void onResponse(RegisterUserResult response) {
                    listener.onResult(response);
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    listener.onError(error);
                }
            });
        }
    }

    /**
     * Signs the user into the Avataryug account.
     * @param listener
     */
    public void loginWithEmailAddress(final OnLoginWithEmailAddressListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof LoginWithEmailAddressResult) {
                    if (listener != null) {
                        listener.onLoginWithEmailAddressResult((LoginWithEmailAddressResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onLoginWithEmailAddressError(new Exception("Invalid response type"));
                    }
                }
            }
            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onLoginWithEmailAddressError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the LoginWithEmailAddress method.
     */
    public interface OnLoginWithEmailAddressListener {
        void onLoginWithEmailAddressResult(LoginWithEmailAddressResult result);
        void onLoginWithEmailAddressError(Exception error);
    }

    /**
     * Signs the user into the Avataryug account, returning a session identifier that can subsequently be used for API calls which require an authenticated user.
     * Unlike most other login API calls, LoginWithEmailAddress does not permit the creation of new accounts via the CreateAccountFlag.
     */
    public static class LoginWithEmailAddress implements Base {
        private String emailID;
        private String password;
        private Boolean createAccount;

        public LoginWithEmailAddress(String emailID, String password, Boolean createAccount) {
            this.emailID = emailID;
            this.password = password;
            this.createAccount = createAccount;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {
            // Use Retrofit to make the API call
            LoginWithEmailAddressRequest request = new LoginWithEmailAddressRequest();
            request.setEmailID(emailID);
            request.setPassword(password);
            request.setCreateAccount(createAccount);
            AuthenticationApi.loginWithEmailAddress(request, new Response.Listener<LoginWithEmailAddressResult>() {
                @Override
                public void onResponse(LoginWithEmailAddressResult response) {
                    listener.onResult(response);
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    listener.onError(error);
                }
            });
        }
    }

    /**
     * Signs in the user using an identity token obtained from Sign in with Apple.
     * @param listener
     */
    public void loginWithApple(final LoginWithAppleListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof LoginWithAppleResult) {
                    if (listener != null) {
                        listener.onLoginWithAppleResult((LoginWithAppleResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onLoginWithAppleError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onLoginWithAppleError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the LoginWithApple method.
     */
    public interface LoginWithAppleListener {
        void onLoginWithAppleResult(LoginWithAppleResult result);
        void onLoginWithAppleError(Exception error);
    }

    /**
     * Signs in the user using an identity token obtained from Sign in with Apple,
     * returning a session identifier that can subsequently be used for API calls which require an authenticated user
     */
    public static class LoginWithApple implements Base {
        private boolean createAccount;
        private String appleIdentityToken;
        private String appleID;

        public LoginWithApple(String appleIdentityToken, boolean createAccount, String appleID) {
            this.createAccount = createAccount;
            this.appleIdentityToken = appleIdentityToken;
            this.appleID = appleID;
        }

        @Override
        public void callApi(final OnApiResultListener listener) {
            LoginWithAppleRequest loginWithAppleRequest = new LoginWithAppleRequest();
            loginWithAppleRequest.setAppleID(appleID);
            loginWithAppleRequest.setCreateAccount(createAccount);
            loginWithAppleRequest.setAppleIdentityToken(appleIdentityToken);
            AuthenticationApi.loginWithApple(loginWithAppleRequest, new Response.Listener<LoginWithAppleResult>() {
                @Override
                public void onResponse(LoginWithAppleResult response) {
                    listener.onResult(response);
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    listener.onError(error);
                }
            });
        }
    }

    /**
     * Signs the user in using the vendor-specific iOS device identifier.
     * @param listener
     */
    public void loginWithIOSDeviceID(final LoginWithIOSDeviceIDListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof LoginWithIOSDeviceIDResult) {
                    if (listener != null) {
                        listener.onLoginWithIOSDeviceIDResult((LoginWithIOSDeviceIDResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onLoginWithIOSDeviceIDError(new Exception("Invalid response type"));
                    }
                }
            }
            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onLoginWithIOSDeviceIDError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the LoginWithIOSDeviceID method.
     */
    public interface LoginWithIOSDeviceIDListener {
        void onLoginWithIOSDeviceIDResult(LoginWithIOSDeviceIDResult result);
        void onLoginWithIOSDeviceIDError(Exception error);
    }

    /**
     * Signs the user in using the vendor specific iOS device identifier,
     * returning a session identifier that can subsequently be used for API calls which require an authenticated user.
     */
    public static class LoginWithIOSDeviceID implements Base {
        private boolean createAccount;
        private String iOSDeviceID;

        public LoginWithIOSDeviceID(String iOSDeviceID, boolean createAccount) {
            this.createAccount = createAccount;
            this.iOSDeviceID = iOSDeviceID;
        }

        @Override
        public void callApi(final OnApiResultListener listener) {
            LoginWithIOSDeviceIDRequest loginWithIOSDeviceID = new LoginWithIOSDeviceIDRequest();
            loginWithIOSDeviceID.setIOSDeviceID(iOSDeviceID);
            loginWithIOSDeviceID.setCreateAccount(createAccount);
            AuthenticationApi.loginWithIOSDeviceID(loginWithIOSDeviceID, new Response.Listener<LoginWithIOSDeviceIDResult>() {
                @Override
                public void onResponse(LoginWithIOSDeviceIDResult response) {
                    listener.onResult(response);
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    listener.onError(error);
                }
            });
        }
    }

    /**
     * Signs the user in using their Google account credentials.
     * @param listener
     */
    public void loginWithGoogle(final LoginWithGoogleListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof LoginWithGoogleResult) {
                    if (listener != null) {
                        listener.onLoginWithGoogleResult((LoginWithGoogleResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onLoginWithGoogleError(new Exception("Invalid response type"));
                    }
                }
            }
            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onLoginWithGoogleError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the LoginWithGoogle method.
     */
    public interface LoginWithGoogleListener {
        void onLoginWithGoogleResult(LoginWithGoogleResult result);
        void onLoginWithGoogleError(Exception error);
    }

    /**
     *  Signs the user in using their Google account credentials,
     *  returning a session identifier that can subsequently be used for API calls which require an authenticated user
     */
    public static class LoginWithGoogle implements Base {
        private boolean createAccount;
        private String googleServerAuthCode;
        private String googleID;

        public LoginWithGoogle(String googleServerAuthCode, boolean createAccount, String googleID) {
            this.createAccount = createAccount;
            this.googleServerAuthCode = googleServerAuthCode;
            this.googleID = googleID;
        }

        @Override
        public void callApi(final OnApiResultListener listener) {
            LoginWithGoogleRequest loginWithGoogleRequest = new LoginWithGoogleRequest();
            loginWithGoogleRequest.setGoogleID(googleID);
            loginWithGoogleRequest.setGoogleServerAuthCode(googleServerAuthCode);
            loginWithGoogleRequest.setCreateAccount(createAccount);

            AuthenticationApi.loginWithGoogle(loginWithGoogleRequest,
                    new Response.Listener<LoginWithGoogleResult>() {
                        @Override
                        public void onResponse(LoginWithGoogleResult response) {
                            listener.onResult(response);
                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            listener.onError(error);
                        }
                    });
        }
    }

    /**
     * Signs the user in using a Facebook access token.
     * @param listener
     */
    public void loginWithFacebook(final LoginWithFacebookListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof LoginWithFacebookResult) {
                    if (listener != null) {
                        listener.onLoginWithFacebookResult((LoginWithFacebookResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onLoginWithFacebookError(new Exception("Invalid response type"));
                    }
                }
            }
            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onLoginWithFacebookError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the LoginWithFacebook method.
     */
    public interface LoginWithFacebookListener {
        void onLoginWithFacebookResult(LoginWithFacebookResult result);
        void onLoginWithFacebookError(Exception error);
    }

    /**
     *  Signs the user in using a Facebook access token,
     *  returning a session identifier that can subsequently be used for API calls which require an authenticated user
     */
    public static class LoginWithFacebook implements Base {
        private boolean createAccount;
        private String fbAccessToken;
        private String facebookID;

        public LoginWithFacebook(String fbAccessToken, boolean createAccount, String facebookID) {
            this.fbAccessToken = fbAccessToken;
            this.createAccount = createAccount;
            this.facebookID = facebookID;
        }

        @Override
        public void callApi(final  OnApiResultListener listener) {
            LoginWithFacebookRequest loginWithFacebookRequest = new LoginWithFacebookRequest();
            loginWithFacebookRequest.setFacebookID(facebookID);
            loginWithFacebookRequest.setFbAccessToken(fbAccessToken);
            loginWithFacebookRequest.setCreateAccount(createAccount);

            AuthenticationApi.loginWithFacebook(loginWithFacebookRequest, new Response.Listener<LoginWithFacebookResult>() {
                @Override
                public void onResponse(LoginWithFacebookResult response) {
                    listener.onResult(response);
                }

            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    listener.onError(error);
                }
            });
        }
    }
}
