package Avataryug.Client.Handler;

/**
 * The abstracted base class is designed to simplify API calling by providing a reusable foundation that can be utilized in various programming contexts.
 */
public interface Base {
    void callApi(OnApiResultListener listener);

    interface OnApiResultListener {
        void onResult(Object response);
        void onError(Exception error);
    }
}
