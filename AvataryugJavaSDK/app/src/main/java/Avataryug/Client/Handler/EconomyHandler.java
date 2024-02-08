package Avataryug.Client.Handler;

import Avataryug.Client.Api.EconomyApi;
import Avataryug.Client.Model.GetEconomyBundleByIDResult;
import Avataryug.Client.Model.GetEconomyBundlesResult;
import Avataryug.Client.Model.GetEconomyContainerByIDResult;
import Avataryug.Client.Model.GetEconomyContainersResult;
import Avataryug.Client.Model.GetEconomyItemsByIDResult;
import Avataryug.Client.Model.GetEconomyItemsResult;
import Avataryug.Client.Model.GetEconomyStoresResult;
import Avataryug.Client.Model.GetStoreItemsByIDResult;
import com.android.volley.Response;
import com.android.volley.VolleyError;

/**
 * The "EconomyHandler" class handles bundle containers, currencies, and items for economy-related operations.
 * It utilizes the "Base" class for making API calls and provides methods for managing
 * bundles, currencies, store, and items within the economy system.
 */
public class EconomyHandler {
    private Base apiBase;
    public EconomyHandler(Base apiBase) {
        this.apiBase = apiBase;
    }

    /**
     * Get Economy Items
     * @param listener
     */
    public void getEconomyItems(final OnGetEconomyItemsListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof GetEconomyItemsResult) {
                    if (listener != null) {
                        listener.onGetEconomyItemsResult((GetEconomyItemsResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onGetEconomyItemsError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onGetEconomyItemsError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the GetEconomyItems method
     */
    public interface OnGetEconomyItemsListener {
        void onGetEconomyItemsResult(GetEconomyItemsResult result);
        void onGetEconomyItemsError(Exception error);
    }

    /**
     *  Get Economy Items
     */
    public static class GetEconomyItems implements Base {
        private String category;
        private int status;
        private int gender;

        public GetEconomyItems(String category, int status, int gender) {
            this.category = category;
            this.status = status;
            this.gender = gender;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {
            EconomyApi.getEconomyItems(category, status, gender, new Response.Listener<GetEconomyItemsResult>() {
                @Override
                public void onResponse(GetEconomyItemsResult response) {
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
     *  Get Economy Item by ID
     * @param listener
     */
    public void getEconomyItemsByID(final OnGetEconomyItemsByIDListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof GetEconomyItemsByIDResult) {
                    if (listener != null) {
                        listener.onGetEconomyItemsByIDResult((GetEconomyItemsByIDResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onGetEconomyItemsByIDError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onGetEconomyItemsByIDError(error);
                }
            }
        });
    }

     /**
     * Define the listener interface for the GetEconomyItemsByID method
     */
    public interface OnGetEconomyItemsByIDListener {
        void onGetEconomyItemsByIDResult(GetEconomyItemsByIDResult result);
        void onGetEconomyItemsByIDError(Exception error);
    }

    /**
     * Get Economy Item by ID
     */
    public static class GetEconomyItemsByID implements Base {
        private String itemID;
        public GetEconomyItemsByID(String itemID) {
            this.itemID = itemID;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {
            EconomyApi.getEconomyItemsByID(itemID, new Response.Listener<GetEconomyItemsByIDResult>() {
                @Override
                public void onResponse(GetEconomyItemsByIDResult response) {
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
     * Get Economy Bundle
     * @param listener
     */
    public void getEconomyBundles(final OnGetEconomyBundlesListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof GetEconomyBundlesResult) {
                    if (listener != null) {
                        listener.onGetEconomyBundlesResult((GetEconomyBundlesResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onGetEconomyBundlesError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onGetEconomyBundlesError(error);
                }
            }
        });
    }

    /**
     *  Define the listener interface for the GetEconomyBundles method
     */
    public interface OnGetEconomyBundlesListener {
        void onGetEconomyBundlesResult(GetEconomyBundlesResult result);
        void onGetEconomyBundlesError(Exception error);
    }

    /**
     * Get Economy Bundle
     */
    public static class GetEconomyBundles implements Base {
        private Integer status;
        public GetEconomyBundles(Integer status) {
            this.status = status;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {

            EconomyApi.getEconomyBundles(status, new Response.Listener<GetEconomyBundlesResult>() {
                @Override
                public void onResponse(GetEconomyBundlesResult response) {
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
     * Get Economy Bundles by ID
     * @param listener
     */
    public void getEconomyBundleByID(final OnGetEconomyBundleByIDListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof GetEconomyBundleByIDResult) {
                    if (listener != null) {
                        listener.onGetEconomyBundleByIDResult((GetEconomyBundleByIDResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onGetEconomyBundleByIDError(new Exception("Invalid response type"));
                    }
                }
            }
            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onGetEconomyBundleByIDError(error);
                }
            }
        });
    }

     /**
     *Define the listener interface for the GetEconomyBundleByID methodm
     */
    public interface OnGetEconomyBundleByIDListener {
        void onGetEconomyBundleByIDResult(GetEconomyBundleByIDResult result);
        void onGetEconomyBundleByIDError(Exception error);
    }

    /**
     * Get Economy Bundles by ID
     */
    public static class GetEconomyBundleByID implements Base {

        private String bundleID;
        public GetEconomyBundleByID(String bundleID) {
            this.bundleID = bundleID;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {
            EconomyApi.getEconomyBundleByID(bundleID, new Response.Listener<GetEconomyBundleByIDResult>() {
                @Override
                public void onResponse(GetEconomyBundleByIDResult response) {
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
     *  Get Economy Container by ID
     * @param listener
     */
    public void getEconomyContainers(final OnGetEconomyContainersListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof GetEconomyContainersResult) {
                    if (listener != null) {
                        listener.onGetEconomyContainersResult((GetEconomyContainersResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onGetEconomyContainersError(new Exception("Invalid response type"));
                    }
                }
            }
            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onGetEconomyContainersError(error);
                }
            }
        });
    }
    // Define the listener interface for the GetEconomyContainers method

    /**
     *  Define the listener interface for the GetEconomyContainers method
     */
    public interface OnGetEconomyContainersListener {
        void onGetEconomyContainersResult(GetEconomyContainersResult result);
        void onGetEconomyContainersError(Exception error);
    }

    /**
     *Get Economy Containers
     */
    public static class GetEconomyContainers implements Base {
        private Integer containersStatus;
        public GetEconomyContainers(Integer containersStatus) {
            this.containersStatus = containersStatus;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {
            EconomyApi.getEconomyContainers(containersStatus, new Response.Listener<GetEconomyContainersResult>() {
                @Override
                public void onResponse(GetEconomyContainersResult response) {
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
     *  Get Economy Container by ID
     * @param listener
     */
    public void getEconomyContainerByID(final OnGetEconomyContainerByIDListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof GetEconomyContainerByIDResult) {
                    if (listener != null) {
                        listener.onGetEconomyContainerByIDResult((GetEconomyContainerByIDResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onGetEconomyContainerByIDError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onGetEconomyContainerByIDError(error);
                }
            }
        });
    }

    /**
     *  Define the listener interface for the GetEconomyContainerByID method
     */
    public interface OnGetEconomyContainerByIDListener {
        void onGetEconomyContainerByIDResult(GetEconomyContainerByIDResult result);
        void onGetEconomyContainerByIDError(Exception error);
    }

    /**
     * Get Economy Container by ID
     */
    public static class GetEconomyContainerByID implements Base {
        private String containerID;
        public GetEconomyContainerByID(String containerID) {
            this.containerID = containerID;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {
            EconomyApi.getEconomyContainerByID(containerID, new Response.Listener<GetEconomyContainerByIDResult>() {
                @Override
                public void onResponse(GetEconomyContainerByIDResult response) {
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
     * Get Economy Stores
     * @param listener
     */
    public void getEconomyStores(final OnGetEconomyStoresListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof GetEconomyStoresResult) {
                    if (listener != null) {
                        listener.onGetEconomyStoresResult((GetEconomyStoresResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onGetEconomyStoresError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onGetEconomyStoresError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the GetEconomyStores method
     */
    public interface OnGetEconomyStoresListener {
        void onGetEconomyStoresResult(GetEconomyStoresResult result);
        void onGetEconomyStoresError(Exception error);
    }

    /**
     * Get Economy Stores
     */
    public static class GetEconomyStores implements Base {

        private Integer storesStatus;
        public GetEconomyStores(Integer storesStatus) {
            this.storesStatus = storesStatus;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {
            // Use Retrofit to make the API call
            EconomyApi.getEconomyStores(storesStatus, new Response.Listener<GetEconomyStoresResult>() {
                @Override
                public void onResponse(GetEconomyStoresResult response) {
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
     * Retrieves the set of items defined for the specified store, including all prices defined
     * @param listener
     */
    public void getStoreItemsByID(final OnGetStoreItemsByIDListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof GetStoreItemsByIDResult) {
                    if (listener != null) {
                        listener.onGetStoreItemsByIDResult((GetStoreItemsByIDResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onGetStoreItemsByIDError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onGetStoreItemsByIDError(error);
                }
            }
        });
    }

    /**
     *  Define the listener interface for the getStoreItemsByID method
     */
    public interface OnGetStoreItemsByIDListener {
        void onGetStoreItemsByIDResult(GetStoreItemsByIDResult result);
        void onGetStoreItemsByIDError(Exception error);
    }

    /**
     *Retrieves the set of items defined for the specified store, including all prices defined
     */
    public static class GetStoreItemsByID implements Base {

        private String storeID;
        public GetStoreItemsByID(String storeID) {
            this.storeID = storeID;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {
            EconomyApi.getStoreItemsByID(storeID, new Response.Listener<GetStoreItemsByIDResult>() {
                @Override
                public void onResponse(GetStoreItemsByIDResult response) {
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
