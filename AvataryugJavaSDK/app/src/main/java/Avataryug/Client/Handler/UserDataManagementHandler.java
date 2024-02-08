package Avataryug.Client.Handler;

import Avataryug.Client.Api.UserDataManagementApi;
import Avataryug.Client.Model.AddUserAvatarRequest;
import Avataryug.Client.Model.AddUserAvatarResult;
import Avataryug.Client.Model.AddVirtualCurrencyToUserRequest;
import Avataryug.Client.Model.AddVirtualCurrencyToUserResult;
import Avataryug.Client.Model.ConfirmPurchaseRequest;
import Avataryug.Client.Model.ConfirmPurchaseResult;
import Avataryug.Client.Model.ConsumeInstanceRequest;
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
import Avataryug.Client.Model.PurchaseInstanceResult;
import Avataryug.Client.Model.SubtractUserVirtualCurrencyRequest;
import Avataryug.Client.Model.SubtractUserVirtualCurrencyResult;
import Avataryug.Client.Model.UnlockContainerInstanceRequest;
import Avataryug.Client.Model.UnlockContainerInstanceResult;
import Avataryug.Client.Model.UpdateUserAvatarRequest;
import Avataryug.Client.Model.UpdateUserAvatarResult;
import com.android.volley.Response;
import com.android.volley.VolleyError;

public class UserDataManagementHandler {
    private Base apiBase;

    public UserDataManagementHandler(Base apiBase) {
        this.apiBase = apiBase;
    }

    /**
     * Retrieves the user's current inventory of virtual goods.
     * @param listener
     */
    public void getUserInventory(final OnGetUserInventoryListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof GetUserInventoryResult) {
                    if (listener != null) {
                        listener.onGetUserInventoryResult((GetUserInventoryResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onGetUserInventoryError(new Exception("Invalid response type"));
                    }
                }
            }
            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onGetUserInventoryError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the GetUserInventory method.
     */
    public interface OnGetUserInventoryListener {
        void onGetUserInventoryResult(GetUserInventoryResult result);
        void onGetUserInventoryError(Exception error);
    }

    /**
     * Retrieves the user's current inventory of virtual goods.
     */
    public static class GetUserInventory implements Base {
        private String userID;
        public GetUserInventory(String userID) {
            this.userID = userID;
        }

        @Override
        public void callApi(final OnApiResultListener listener) {
            UserDataManagementApi.getUserInventory(userID, new Response.Listener<GetUserInventoryResult>() {
                @Override
                public void onResponse(GetUserInventoryResult response) {
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
     * Lists all of the avatars that belong to a specific user.
     * @param listener
     */
    public void getUsersAllAvatars(final OnGetUsersAllAvatarsListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof GetUsersAllAvatarsResult) {
                    if (listener != null) {
                        listener.onGetUsersAllAvatarsResult((GetUsersAllAvatarsResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onGetUsersAllAvatarsError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onGetUsersAllAvatarsError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the GetUsersAllAvatars method
     */
    public interface OnGetUsersAllAvatarsListener {
        void onGetUsersAllAvatarsResult(GetUsersAllAvatarsResult result);

        void onGetUsersAllAvatarsError(Exception error);
    }

    /**
     * Lists all of the avatars that belong to a specific user.
     */
    public static class GetUsersAllAvatars implements Base {
        private String userID;
        public GetUsersAllAvatars(String userID) {
            this.userID = userID;
        }

        @Override
        public void callApi(final OnApiResultListener listener) {
            UserDataManagementApi.getUsersAllAvatars(userID, new Response.Listener<GetUsersAllAvatarsResult>() {
                @Override
                public void onResponse(GetUsersAllAvatarsResult response) {
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
     * Adds the specified items to the specified user's inventory.
     * @param listener
     */
    public void grantInstanceToUser(final OnGrantInstanceToUserListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof GrantInstanceToUserResult) {
                    if (listener != null) {
                        listener.onGrantInstanceToUserResult((GrantInstanceToUserResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onGrantInstanceToUserError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onGrantInstanceToUserError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the GrantInstanceToUser method
     */
    public interface OnGrantInstanceToUserListener {
        void onGrantInstanceToUserResult(GrantInstanceToUserResult result);
        void onGrantInstanceToUserError(Exception error);
    }

    /**
     * Adds the specified items to the specified user's inventory.
     */
    public static class GrantInstanceToUser implements Base {
        private GrantInstanceToUserRequest grantInstanceToUserRequest;
        public GrantInstanceToUser(GrantInstanceToUserRequest grantInstanceToUserRequest) {
            this.grantInstanceToUserRequest = grantInstanceToUserRequest;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {

            UserDataManagementApi.grantInstanceToUser(grantInstanceToUserRequest, new Response.Listener<GrantInstanceToUserResult>() {
                @Override
                public void onResponse(GrantInstanceToUserResult response) {
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
     * Update Avatar for the user.
     * @param listener
     */
    public void updateUserAvatar(final OnUpdateUserAvatarListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof UpdateUserAvatarResult) {
                    if (listener != null) {
                        listener.onUpdateUserAvatarResult((UpdateUserAvatarResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onUpdateUserAvatarError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onUpdateUserAvatarError(error);
                }
            }
        });
    }

    /**
     *  Define the listener interface for the UpdateUserAvatar method
     */
    public interface OnUpdateUserAvatarListener {
        void onUpdateUserAvatarResult(UpdateUserAvatarResult result);
        void onUpdateUserAvatarError(Exception error);
    }

    /**
     * Update Avatar for the user.
     */
    public static class UpdateUserAvatar implements Base {
        private UpdateUserAvatarRequest userAvatarRequest;
        public UpdateUserAvatar(UpdateUserAvatarRequest userAvatarRequest) {
            this.userAvatarRequest = userAvatarRequest;
        }

        @Override
        public void callApi(final OnApiResultListener listener) {

            UserDataManagementApi.updateUserAvatar(userAvatarRequest, new Response.Listener<UpdateUserAvatarResult>() {
                @Override
                public void onResponse(UpdateUserAvatarResult response) {
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
     * Consume uses of a consumable item. When all uses are consumed, it will be removed from the user's inventory.
     * @param listener
     */
    public void consumeInstance(final OnConsumeInstanceListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof ConsumeInstanceResult) {
                    if (listener != null) {
                        listener.onConsumeInstanceResult((ConsumeInstanceResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onConsumeInstanceError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onConsumeInstanceError(error);
                }
            }
        });
    }

    /**
     *  Define the listener interface for the ConsumeInstance method.
     */
    public interface OnConsumeInstanceListener {
        void onConsumeInstanceResult(ConsumeInstanceResult result);
        void onConsumeInstanceError(Exception error);
    }

    /**
     * Consume uses of a consumable item. When all uses are consumed, it will be removed from the user's inventory.
     */
    public static class ConsumeInstance implements Base {
        private String ID;
        private Integer instanceCount;

        public ConsumeInstance(String ID, Integer instanceCount) {
            this.ID = ID;
            this.instanceCount = instanceCount;
        }

        @Override
        public void callApi(final OnApiResultListener listener) {
            ConsumeInstanceRequest request = new ConsumeInstanceRequest();
            request.setUserID(ID);
            request.setInstanceCount(instanceCount);
            UserDataManagementApi.consumeInstance(request, new Response.Listener<ConsumeInstanceResult>() {
                @Override
                public void onResponse(ConsumeInstanceResult response) {
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
     *Buys a single item with virtual currency. You must specify both the virtual currency to use to purchase,
     * as well as what the client believes the price to be. This lets the server fail the purchase if the price has changed.
     * @param listener
     */
    public void purchaseInstance(final OnPurchaseInstanceListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof String) {
                    if (listener != null) {
                        listener.onPurchaseInstanceResult((String) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onPurchaseInstanceError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onPurchaseInstanceError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the PurchaseInstance method.
     */
    public interface OnPurchaseInstanceListener {
        void onPurchaseInstanceResult(String result);

        void onPurchaseInstanceError(Exception error);
    }

    /**
     * Buys a single item with virtual currency.
     * You must specify both the virtual currency to use to purchase, as well as what the client believes the price to be.
     * This lets the server fail the purchase if the price has changed.
     */
    public static class PurchaseInstance implements Base {

        private PurchaseInstanceRequest purchaseInstanceRequest;

        public PurchaseInstance(PurchaseInstanceRequest purchaseInstanceRequest) {
            this.purchaseInstanceRequest = purchaseInstanceRequest;
        }

        @Override
        public void callApi(final OnApiResultListener listener) {

            UserDataManagementApi.purchaseInstance(purchaseInstanceRequest, new Response.Listener<PurchaseInstanceResult>() {
                @Override
                public void onResponse(PurchaseInstanceResult response) {
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
     * Increments the user's balance of the specified virtual currency by the stated amount.
     * @param listener
     */
    public void addVirtualCurrencyToUser(final OnAddVirtualCurrencyToUserListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof AddVirtualCurrencyToUserResult) {
                    if (listener != null) {
                        listener.onAddVirtualCurrencyToUserResult((AddVirtualCurrencyToUserResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onAddVirtualCurrencyToUserError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onAddVirtualCurrencyToUserError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the AddVirtualCurrencyToUser method
     */
    public interface OnAddVirtualCurrencyToUserListener {
        void onAddVirtualCurrencyToUserResult(AddVirtualCurrencyToUserResult result);

        void onAddVirtualCurrencyToUserError(Exception error);
    }

    /**
     * Increments the user's balance of the specified virtual currency by the stated amount.
     */
    public static class AddVirtualCurrencyToUser implements Base {

        private String virtualCurrency;
        private Integer amount;

        public AddVirtualCurrencyToUser(String virtualCurrency, Integer amount) {
            this.virtualCurrency = virtualCurrency;
            this.amount = amount;
        }

        @Override
        public void callApi(final OnApiResultListener listener) {
            AddVirtualCurrencyToUserRequest request = new AddVirtualCurrencyToUserRequest();
            request.setVirtualCurrency(virtualCurrency);
            request.setAmount(amount);
            UserDataManagementApi.addVirtualCurrencyToUser(request, new Response.Listener<AddVirtualCurrencyToUserResult>() {
                @Override
                public void onResponse(AddVirtualCurrencyToUserResult response) {
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
     * Decrements the user's balance of the specified virtual currency by the stated amount. It is possible to make a VC balance negative with this API
     * @param listener
     */
    public void subtractUserVirtualCurrency(final OnSubtractUserVirtualCurrencyListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof SubtractUserVirtualCurrencyResult) {
                    if (listener != null) {
                        listener.onSubtractUserVirtualCurrencyResult((SubtractUserVirtualCurrencyResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onSubtractUserVirtualCurrencyError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onSubtractUserVirtualCurrencyError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the SubtractUserVirtualCurrency method
     */
    public interface OnSubtractUserVirtualCurrencyListener {
        void onSubtractUserVirtualCurrencyResult(SubtractUserVirtualCurrencyResult result);
        void onSubtractUserVirtualCurrencyError(Exception error);
    }

    /**
     * Decrements the user's balance of the specified virtual currency by the stated amount.
     * It is possible to make a VC balance negative with this API.
     */
    public static class SubtractUserVirtualCurrency implements Base {
        private String virtualCurrency;
        private Integer amount;
        public SubtractUserVirtualCurrency(String virtualCurrency, Integer amount) {
            this.virtualCurrency = virtualCurrency;
            this.amount = amount;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {
            SubtractUserVirtualCurrencyRequest request = new SubtractUserVirtualCurrencyRequest();
            request.setVirtualCurrency(virtualCurrency);
            request.setAmount(amount);

            UserDataManagementApi.subtractUserVirtualCurrency(request, new Response.Listener<SubtractUserVirtualCurrencyResult>() {
                @Override
                public void onResponse(SubtractUserVirtualCurrencyResult response) {
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
     * Add Avatar to the user.
     * @param listener
     */
    public void addUserAvatar(final OnAddUserAvatarListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof AddUserAvatarResult) {
                    if (listener != null) {
                        listener.onAddUserAvatarResult((AddUserAvatarResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onAddUserAvatarError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onAddUserAvatarError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the AddUserAvatar method
     */
    public interface OnAddUserAvatarListener {
        void onAddUserAvatarResult(AddUserAvatarResult result);
        void onAddUserAvatarError(Exception error);
    }

    /**
     * Add Avatar to the user.
     */
    public static class AddUserAvatar implements Base {
        private String avatarData;
        public AddUserAvatar(String avatarData) {
            this.avatarData = avatarData;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {
            AddUserAvatarRequest request = new AddUserAvatarRequest();
            request.setAvatarID(avatarData);

            UserDataManagementApi.addUserAvatar(request, new Response.Listener<AddUserAvatarResult>() {
                @Override
                public void onResponse(AddUserAvatarResult response) {
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
     * Delete specified Avatar for the user.
     * @param listener
     */
    public void deleteUserAvatar(final OnDeleteUserAvatarListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof DeleteUserAvatarResult) {
                    if (listener != null) {
                        listener.onDeleteUserAvatarResult((DeleteUserAvatarResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onDeleteUserAvatarError(new Exception("Invalid response type"));
                    }
                }
            }
            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onDeleteUserAvatarError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the DeleteUserAvatar method
     */
    public interface OnDeleteUserAvatarListener {
        void onDeleteUserAvatarResult(DeleteUserAvatarResult result);
        void onDeleteUserAvatarError(Exception error);
    }

    /**
     * Delete specified Avatar for the user
     */
    public static class DeleteUserAvatar implements Base {
        private String avatarID;
        public DeleteUserAvatar(String avatarID) {
            this.avatarID = avatarID;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {
            UserDataManagementApi.deleteUserAvatar(avatarID, new Response.Listener<DeleteUserAvatarResult>() {
                @Override
                public void onResponse(DeleteUserAvatarResult response) {
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
     * Confirms with the payment provider that the purchase was approved (if applicable) and adjusts inventory and virtual currency balances as appropriate.
     * @param listener
     */
    public void confirmPurchase(final OnConfirmPurchaseListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof ConfirmPurchaseResult) {
                    if (listener != null) {
                        listener.onConfirmPurchaseResult((ConfirmPurchaseResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onConfirmPurchaseError(new Exception("Invalid response type"));
                    }
                }
            }
            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onConfirmPurchaseError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the DeleteUserAvatar method
     */
    public interface OnConfirmPurchaseListener {
        void onConfirmPurchaseResult(ConfirmPurchaseResult result);
        void onConfirmPurchaseError(Exception error);
    }

    /**
     * Confirms with the payment provider that the purchase was approved (if applicable) and adjusts inventory and virtual currency balances as appropriate.
     */
    public static class ConfirmPurchase implements Base {
        private String TransactionID;
        public ConfirmPurchase(String TransactionID) {
            this.TransactionID = TransactionID;
        }

        @Override
        public void callApi(final OnApiResultListener listener) {
            ConfirmPurchaseRequest request = new ConfirmPurchaseRequest();
            request.setTransactionID(TransactionID);

            UserDataManagementApi.confirmPurchase(request, new Response.Listener<ConfirmPurchaseResult>() {
                @Override
                public void onResponse(ConfirmPurchaseResult response) {
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
     * Get the purchase detials
     * @param listener
     */
    public void getPurchase(final OnGetPurchaseListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof GetPurchaseResult) {
                    if (listener != null) {
                        listener.onGetPurchaseResult((GetPurchaseResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onGetPurchaseError(new Exception("Invalid response type"));
                    }
                }
            }
            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onGetPurchaseError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the DeleteUserAvatar method
     */
    public interface OnGetPurchaseListener {
        void onGetPurchaseResult(GetPurchaseResult result);
        void onGetPurchaseError(Exception error);
    }

    /**
     * Retrieves a purchase along with its current Avataryug status.
     * Returns inventory items from the purchase that are still active.
     */
    public static class GetPurchase implements Base {
        @Override
        public void callApi(final OnApiResultListener listener) {

            UserDataManagementApi.getPurchase(new Response.Listener<GetPurchaseResult>() {
                @Override
                public void onResponse(GetPurchaseResult response) {
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
     * Buys a single item with virtual currency. You must specify both the virtual currency to use to purchase,
     * as well as what the client believes the price to be. This lets the server fail the purchase if the price has changed.
     * @param listener
     */
    public void payForPurchase(final OnPayForPurchaseListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof GetPurchaseResult) {
                    if (listener != null) {
                        listener.onPayForPurchaseResult((PayForPurchaseResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onPayForPurchaseError(new Exception("Invalid response type"));
                    }
                }
            }
            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onPayForPurchaseError(error);
                }
            }
        });
    }

    /**
     *  Define the listener interface for the DeleteUserAvatar method
     */
    public interface OnPayForPurchaseListener {
        void onPayForPurchaseResult(PayForPurchaseResult result);
        void onPayForPurchaseError(Exception error);
    }

    /**
     * Pay For purchase items.
     */
    public static class PayForPurchase implements Base {
        private PayForPurchaseRequest purchaseRequest;
        public PayForPurchase(PayForPurchaseRequest purchaseRequest) {
            this.purchaseRequest = purchaseRequest;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {

            UserDataManagementApi.payForPurchase(purchaseRequest, new Response.Listener<PayForPurchaseResult>() {
                @Override
                public void onResponse(PayForPurchaseResult response) {
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
     * Opens the specified container, with the specified key (when required),and returns the contents of the opened container.
     * If the container (and key when relevant) are consumable (RemainingUses > 0),their RemainingUses will be decremented, consistent with the operation of ConsumeItem.
     * @param listener
     */
    public void unlockContainerInstance(final OnUnlockContainerInstanceListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof UnlockContainerInstanceResult) {
                    if (listener != null) {
                        listener.onUnlockContainerInstanceResult((UnlockContainerInstanceResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onUnlockContainerInstanceError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onUnlockContainerInstanceError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the UnlockContainerInstance method
     */
    public interface OnUnlockContainerInstanceListener {
        void onUnlockContainerInstanceResult(UnlockContainerInstanceResult result);
        void onUnlockContainerInstanceError(Exception error);
    }

    /**
     * Opens the specified container, with the specified key (when required), and returns the contents of the opened container.
     * If the container (and key when relevant) are consumable (RemainingUses > 0), their RemainingUses will be decremented, consistent with the operation of ConsumeItem.
     */
    public static class UnlockContainerInstance implements Base {
        private String containerInstanceID;
        private String keyInstanceID;

        public UnlockContainerInstance(String containerInstanceID,String keyInstanceID) {
            this.containerInstanceID = containerInstanceID;
            this.keyInstanceID = keyInstanceID;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {
            UnlockContainerInstanceRequest request = new UnlockContainerInstanceRequest();
            request.setContainerInstanceID(containerInstanceID);
            request.setKeyInstanceID(keyInstanceID);

            UserDataManagementApi.unlockContainerInstance(request, new Response.Listener<UnlockContainerInstanceResult>() {
                @Override
                public void onResponse(UnlockContainerInstanceResult response) {
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
