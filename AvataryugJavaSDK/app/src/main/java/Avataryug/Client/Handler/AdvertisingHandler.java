package Avataryug.Client.Handler;

import Avataryug.Client.Api.AdvertisingApi;
import Avataryug.Client.Model.GetAdPlacementByIDResult;
import Avataryug.Client.Model.GrantAdsRewardRequest;
import Avataryug.Client.Model.GrantAdsRewardResult;
import Avataryug.Client.Model.RecordAdsActivityRequest;
import Avataryug.Client.Model.RecordAdsActivityResult;
import com.android.volley.Response;
import com.android.volley.VolleyError;

/**
 * Warning: Please refrain from modifying or editing these classes as it may potentially result in breaking the SDK functionality.
 * The "AdvertisingHandler" class is responsible for handling advertising operations.
 * It uses the "Base" class for making API calls.
 * The class provides three functions:
 * "GetAdsPlacement" retrieves a list of ad placements by ID,
 * "RecordAdsActivity" stores ads activity data for reporting, and
 * "GrantAdsReward" grants rewards for ads.
 *  Each function takes callbacks for handling the response and error conditions.
 */
public class AdvertisingHandler {
    private Base apiBase;

    public AdvertisingHandler(Base apiBase) {
        this.apiBase = apiBase;
    }

    /**
     * Retrieves a list of ad placements by ID.
     * @param listener
     */
    public void getAdPlacementByID(final OnGetAdPlacementByIDListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof GetAdPlacementByIDResult) {
                    if (listener != null) {
                        listener.onGetAdPlacementByIDResult((GetAdPlacementByIDResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onGetAdPlacementByIDError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onGetAdPlacementByIDError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the GetAdPlacementByID method
     */
    public interface OnGetAdPlacementByIDListener {
        void onGetAdPlacementByIDResult(GetAdPlacementByIDResult result);
        void onGetAdPlacementByIDError(Exception error);
    }

    /**
     * Retrieves a list of ad placements by ID
     */
    public static class GetAdPlacementByID implements Base{

        private String placementID;

        public GetAdPlacementByID(String placementID) {
            this.placementID = placementID;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {
            AdvertisingApi.getAdPlacementByID(placementID, new Response.Listener<GetAdPlacementByIDResult>() {
                @Override
                public void onResponse(GetAdPlacementByIDResult response) {
                    if (response != null) {
                        listener.onResult(response);

                    } else {
                        listener.onError(new Exception("API response is null"));
                    }
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
     * Stores ads activity data for reporting after ad watch
     * @param listener
     */
    public void recordAdsActivity( final OnRecordAdsActivityResultListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof RecordAdsActivityResult) {
                    if (listener != null) {
                        listener.onRecordAdsActivityResult((RecordAdsActivityResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onRecordAdsActivityError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onRecordAdsActivityError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the RecordAdsActivity method
     */
    public interface OnRecordAdsActivityResultListener {
        void onRecordAdsActivityResult(RecordAdsActivityResult result);
        void onRecordAdsActivityError(Exception error);
    }

    /**
     * Stores ads activity data for reporting after ad watch.
     */
    public static class RecordAdsActivity implements Base {
        private String revenueCurrency;
        private int adRevenue;
        private String placementID;

        public RecordAdsActivity(String revenueCurrency, int adRevenue, String placementID) {
            this.revenueCurrency = revenueCurrency;
            this.adRevenue = adRevenue;
            this.placementID = placementID;
        }

        @Override
        public void callApi(final OnApiResultListener listener) {
            RecordAdsActivityRequest recordAdsActivityRequest  = new RecordAdsActivityRequest();
            recordAdsActivityRequest.setRevenueCurrency(revenueCurrency);

            recordAdsActivityRequest.setAdRevenue(adRevenue);

            recordAdsActivityRequest.setPlacementID(placementID);

            AdvertisingApi.recordAdsActivity(recordAdsActivityRequest, new Response.Listener<RecordAdsActivityResult>() {
                @Override
                public void onResponse(RecordAdsActivityResult response) {
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
     * Grants rewards for ads.
     */
    public void grantAdsReward( final OnGrantAdsRewardResultListener listener) {

        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof GrantAdsRewardResult) {
                    if (listener != null) {
                        listener.onGrantAdsRewardResult((GrantAdsRewardResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onGrantAdsRewardError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onGrantAdsRewardError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the GrantAdsReward method
     */
    public interface OnGrantAdsRewardResultListener {
        void onGrantAdsRewardResult(GrantAdsRewardResult result);
        void onGrantAdsRewardError(Exception error);
    }

    /**
     * Grants rewards for ads.
     */
    public static class GrantAdsReward implements Base{
        private String placementID;

        public GrantAdsReward(String placementID) {
            this.placementID = placementID;
        }

        @Override
        public void callApi(final OnApiResultListener listener) {
            GrantAdsRewardRequest grantAdsRewardRequest = new GrantAdsRewardRequest();
            grantAdsRewardRequest.setPlacementID(placementID);
            AdvertisingApi.grantAdsReward(grantAdsRewardRequest, new Response.Listener<GrantAdsRewardResult>() {
                @Override
                public void onResponse(GrantAdsRewardResult response) {
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
