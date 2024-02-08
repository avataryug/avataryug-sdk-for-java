package Avataryug.Client.Handler;

import Avataryug.Client.Api.AvatarManagementApi;
import Avataryug.Client.Model.GenerateAvatarMeshRequest;
import Avataryug.Client.Model.GenerateAvatarMeshResult;
import Avataryug.Client.Model.GetAllBucketVerticesResult;
import Avataryug.Client.Model.GetAvatarPresetByIDRequest;
import Avataryug.Client.Model.GetAvatarPresetsResult;
import Avataryug.Client.Model.GetClipsByIDResult;
import Avataryug.Client.Model.GetClipsResult;
import Avataryug.Client.Model.GetExpressionByIDResult;
import Avataryug.Client.Model.GetExpressionsResult;
import Avataryug.Client.Model.GrantAvatarPresetItemsToUserRequest;
import Avataryug.Client.Model.GrantAvatarPresetItemsToUserResult;
import Avataryug.Client.Model.GrantAvatarPresetToUserRequest;
import Avataryug.Client.Model.GrantAvatarPresetToUserResult;
import Avataryug.Client.Model.RenderAvatarImageRequest;
import Avataryug.Client.Model.RenderAvatarImageResult;
import Avataryug.Client.Model.SyncAvatarsRequest;
import Avataryug.Client.Model.SyncAvatarsResult;
import com.android.volley.Response;
import com.android.volley.VolleyError;

/**
 * Warning: Please refrain from modifying or editing these classes as it may potentially result in breaking the SDK functionality.
 * The "AvatarManagementHandler" class is responsible for managing avatars and making API calls through the "Base" class.
 * It provides multiple function for creating, updating, and retrieving avatars related functionality.
 */
public class AvatarManagementHandler {
    private Base apiBase;
    public AvatarManagementHandler(Base apiBase) {
        this.apiBase = apiBase;
    }

    /**
     * Generates the 3D mesh as per the configuration in the Config panel.
     * @param listener
     */
    public void generateAvatarMesh(final OnGenerateAvatarMeshListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof GenerateAvatarMeshResult) {
                    if (listener != null) {
                        listener.onGenerateAvatarMeshResult((GenerateAvatarMeshResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onGenerateAvatarMeshError(new Exception("Invalid response type"));
                    }
                }
            }
            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onGenerateAvatarMeshError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the GenerateAvatarMesh method
     */
    public interface OnGenerateAvatarMeshListener {
        void onGenerateAvatarMeshResult(GenerateAvatarMeshResult result);
        void onGenerateAvatarMeshError(Exception error);
    }

    /**
     * Generates the 3D mesh as per the configuration in the Config panel
     */
    public static class GenerateAvatarMesh implements Base {
        private String AvatarID;
        private String Platform;

        public GenerateAvatarMesh(String AvatarID, String Platform) {
            this.AvatarID = AvatarID;
            this.Platform = Platform;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {
            GenerateAvatarMeshRequest request = new GenerateAvatarMeshRequest();
            request.setAvatarID(AvatarID);
            request.setPlatform(Platform);
            AvatarManagementApi.generateAvatarMesh(request, new Response.Listener<GenerateAvatarMeshResult>() {
                @Override
                public void onResponse(GenerateAvatarMeshResult response) {
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
     * Get all avatar presets
     * @param listener
     */
    public void getAvatarPresets(final OnGetAvatarPresetsListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof GetAvatarPresetsResult) {
                    if (listener != null) {
                        listener.onGetAvatarPresetsResult((GetAvatarPresetsResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onGetAvatarPresetsError(new Exception("Invalid response type"));
                    }
                }
            }
            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onGetAvatarPresetsError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the GetAvatarPresets method
     */
    public interface OnGetAvatarPresetsListener {
        void onGetAvatarPresetsResult(GetAvatarPresetsResult result);
        void onGetAvatarPresetsError(Exception error);
    }

    /**
     * Get all avatar presets
     */
    public static class GetAvatarPresets implements Base {
        private Integer status;
        private Integer gender;

        public GetAvatarPresets(Integer status, Integer gender) {
            this.status = status;
            this.gender = gender;
        }

        @Override
        public void callApi(final OnApiResultListener listener) {

            AvatarManagementApi.getAvatarPresets(status, gender, new Response.Listener<GetAvatarPresetsResult>() {
                @Override
                public void onResponse(GetAvatarPresetsResult response) {
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
     * Get all the clips by Active status
     * @param listener
     */
    public void getClips(final OnGetClipsListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof GetClipsResult) {
                    if (listener != null) {
                        listener.onGetClipsResult((GetClipsResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onGetClipsError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onGetClipsError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the GetClips method
     */
    public interface OnGetClipsListener {
        void onGetClipsResult(GetClipsResult result);
        void onGetClipsError(Exception error);
    }

    /**
     * Get all the clips by Active status
     */
    public static class GetClips implements Base {
        private Integer status;

        public GetClips(Integer status) {
            this.status = status;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {
            AvatarManagementApi.getClips(status, new Response.Listener<GetClipsResult>() {
                @Override
                public void onResponse(GetClipsResult response) {
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
     *Get the specified clip's details by providing ClipID.
     * @param listener
     */
    public void getClipsByID(final OnGetClipsByIDListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof GetClipsByIDResult) {
                    if (listener != null) {
                        listener.onGetClipsByIDResult((GetClipsByIDResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onGetClipsByIDError(new Exception("Invalid response type"));
                    }
                }
            }
            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onGetClipsByIDError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the GetClipsByID method
     */
    public interface OnGetClipsByIDListener {
        void onGetClipsByIDResult(GetClipsByIDResult result);
        void onGetClipsByIDError(Exception error);
    }

    /**
     * Get the specified clip's details by providing ClipID
     */
    public static class GetClipsByID implements Base {
        private String clipId;
        public GetClipsByID(String clipId) {
            this.clipId = clipId;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {
            AvatarManagementApi.getClipsByID(clipId, new Response.Listener<GetClipsByIDResult>() {
                @Override
                public void onResponse(GetClipsByIDResult response) {
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
     *Retrieve all expressions based on the provided status.
     *  0 = Draft,
     *  1 = Active,
     *  2 = Inactive,
     *  3 = Expired
     * @param listener
     */
    public void getExpression(final OnGetExpressionsListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof GetExpressionsResult) {
                    if (listener != null) {
                        listener.onGetExpressionsResult((GetExpressionsResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onGetExpressionsError(new Exception("Invalid response type"));
                    }
                }
            }
            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onGetExpressionsError(error);
                }
            }
        });
    }

    /** Define the listener interface for the GetExpression method
     *
     */
    public interface OnGetExpressionsListener {
        void onGetExpressionsResult(GetExpressionsResult result);
        void onGetExpressionsError(Exception error);
    }

    /**
     * Get all the active expressions
     */
    public static class GetExpressions implements Base {
        private Integer status;

        public GetExpressions(Integer status) {
            this.status = status;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {
            AvatarManagementApi.getExpressions(status, new Response.Listener<GetExpressionsResult>() {
                @Override
                public void onResponse(GetExpressionsResult response) {
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
     * Get the specified expression details by providing ExpressionID
     * @param listener
     */
    public void getExpressionByID(final OnGetExpressionByIDListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof GetExpressionByIDResult) {
                    if (listener != null) {
                        listener.onGetExpressionByIDResult((GetExpressionByIDResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onGetExpressionByIDError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onGetExpressionByIDError(error);
                }
            }
        });
    }

    /** Define the listener interface for the GetExpressionByID method
     *
     */
    public interface OnGetExpressionByIDListener {
        void onGetExpressionByIDResult(GetExpressionByIDResult result);
        void onGetExpressionByIDError(Exception error);
    }

    /**
     * Get the specified expression details by providing ExpressionID.
     */
    public static class GetExpressionByID implements Base {
        private String expressionID;
        public GetExpressionByID(String expressionID) {
            this.expressionID = expressionID;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {

            AvatarManagementApi.getExpressionByID(expressionID, new Response.Listener<GetExpressionByIDResult>() {
                @Override
                public void onResponse(GetExpressionByIDResult response) {
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
     *Get vertices for all buckets.
     * @param listener
     */
    public void getGetallbucketvertices(final OnGetAllBucketVerticesListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof GetAllBucketVerticesResult) {
                    if (listener != null) {
                        listener.onGetAllBucketVerticesResult((GetAllBucketVerticesResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onGetAllBucketVerticesError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onGetAllBucketVerticesError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the GetGetallbucketvertices method
     */
    public interface OnGetAllBucketVerticesListener {
        void onGetAllBucketVerticesResult(GetAllBucketVerticesResult result);
        void onGetAllBucketVerticesError(Exception error);
    }

    /**
     * Get vertices for all buckets
     */
    public static class GetAllBucketVertices implements Base {
        private String platform;
        public GetAllBucketVertices(String platform) {
            this.platform = platform;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {
            AvatarManagementApi.getGetallbucketvertices(platform, new Response.Listener<GetAllBucketVerticesResult>() {
                @Override
                public void onResponse(GetAllBucketVerticesResult response) {
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
     *Grant the selected avatar and its associated items to the user's inventory.
     * @param listener
     */
    public void grantAvatarPresetItemsToUser(final OnGrantAvatarPresetItemsToUserListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof GrantAvatarPresetItemsToUserResult) {
                    if (listener != null) {
                        listener.onGrantAvatarPresetItemsToUserResult((GrantAvatarPresetItemsToUserResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onGrantAvatarPresetItemsToUserError(new Exception("Invalid response type"));
                    }
                }
            }
            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onGrantAvatarPresetItemsToUserError(error);
                }
            }
        });
    }

    /** Define the listener interface for the GrantAvatarPresetItemsToUser method
     *
     * */
    public interface OnGrantAvatarPresetItemsToUserListener {
        void onGrantAvatarPresetItemsToUserResult(GrantAvatarPresetItemsToUserResult result);
        void onGrantAvatarPresetItemsToUserError(Exception error);
    }

    /**Grant Avatar Preset Items To User
     *
     * */
    public static class GrantAvatarPresetItemsToUser implements Base {
       private GrantAvatarPresetItemsToUserRequest request;
        public GrantAvatarPresetItemsToUser(GrantAvatarPresetItemsToUserRequest request) {
            this.request = request;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {
            AvatarManagementApi.grantAvatarPresetItemsToUser(request, new Response.Listener<GrantAvatarPresetItemsToUserResult>() {
                @Override
                public void onResponse(GrantAvatarPresetItemsToUserResult response) {
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
     * Utilize the specified API to render the image of the avatar associated with the provided avatar ID.
     * This API is specifically designed to generate and retrieve the rendered image of the avatar.
     * @param listener
     */
    public void renderAvatarImage(final OnRenderAvatarImageListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof RenderAvatarImageResult) {
                    if (listener != null) {
                        listener.onRenderAvatarImageResult((RenderAvatarImageResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onRenderAvatarImageError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onRenderAvatarImageError(error);
                }
            }
        });
    }

    /**
     *  Define the listener interface for the RenderAvatarImage method
     */
    public interface OnRenderAvatarImageListener {
        void onRenderAvatarImageResult(RenderAvatarImageResult result);
        void onRenderAvatarImageError(Exception error);
    }

    /**
     * Render Avatar Image
     */
    public static class RenderAvatarImage implements Base {
       private RenderAvatarImageRequest request;

        public RenderAvatarImage(RenderAvatarImageRequest request) {
            this.request = request;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {
            AvatarManagementApi.renderAvatarImage(request, new Response.Listener<RenderAvatarImageResult>() {
                @Override
                public void onResponse(RenderAvatarImageResult response) {
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
     * Creates missing avatars into the mentioned platform for the user.
     * @param listener
     */
    public void syncAvatars(final OnSyncAvatarsListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof SyncAvatarsResult) {
                    if (listener != null) {
                        listener.onSyncAvatarsResult((SyncAvatarsResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onSyncAvatarsError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onSyncAvatarsError(error);
                }
            }
        });
    }

    /**
     *  Define the listener interface for the SyncAvatars method
     */
    public interface OnSyncAvatarsListener {
        void onSyncAvatarsResult(SyncAvatarsResult result);
        void onSyncAvatarsError(Exception error);
    }

    /**
     * The SyncAvatars class is responsible for making an API call to Creates missing avatars into the mentioned platform for the user.
     */
    public static class SyncAvatars implements Base {
        private SyncAvatarsRequest syncAvatarsRequest;
        public SyncAvatars(SyncAvatarsRequest syncAvatarsRequest) {
            this.syncAvatarsRequest = syncAvatarsRequest;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {
            AvatarManagementApi.syncAvatars(syncAvatarsRequest, new Response.Listener<SyncAvatarsResult>() {
                @Override
                public void onResponse(SyncAvatarsResult response) {
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
     *Grant Avatar Preset To User
     * @param listener
     */
    public void grantAvatarPresetToUser(final OnGrantAvatarPresetToUserListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof GrantAvatarPresetToUserResult) {
                    if (listener != null) {
                        listener.onGrantAvatarPresetToUserResult((GrantAvatarPresetToUserResult) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onGrantAvatarPresetToUserError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onGrantAvatarPresetToUserError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the GrantAvatarPresetToUser method
     */
    public interface OnGrantAvatarPresetToUserListener {
        void onGrantAvatarPresetToUserResult(GrantAvatarPresetToUserResult result);
        void onGrantAvatarPresetToUserError(Exception error);
    }

    /**
     *The GrantAvatarPresetToUser class is responsible for making an API call to Grant Avatar Preset To User.
     */
    public static class GrantAvatarPresetToUser implements Base {

        private GrantAvatarPresetToUserRequest request;

        public GrantAvatarPresetToUser(GrantAvatarPresetToUserRequest request)
        {
            this.request = request;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {

            AvatarManagementApi.grantAvatarPresetToUser(request, new Response.Listener<GrantAvatarPresetToUserResult>() {
                @Override
                public void onResponse(GrantAvatarPresetToUserResult response) {
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
     * Retrive Avatar preset by ID
     * @param listener
     */
    public void getAvatarPresetsByID(final OnGetAvatarPresetsByIDListener listener) {
        apiBase.callApi(new Base.OnApiResultListener() {
            @Override
            public void onResult(Object response) {
                if (response instanceof GetAvatarPresetByIDRequest) {
                    if (listener != null) {
                        listener.onGetAvatarPresetsByIDResult((GetAvatarPresetByIDRequest) response);
                    }
                } else {
                    if (listener != null) {
                        listener.onGetAvatarPresetsByIDError(new Exception("Invalid response type"));
                    }
                }
            }

            @Override
            public void onError(Exception error) {
                if (listener != null) {
                    listener.onGetAvatarPresetsByIDError(error);
                }
            }
        });
    }

    /**
     * Define the listener interface for the GetAvatarPresetsByID method
     */
    public interface OnGetAvatarPresetsByIDListener {
        void onGetAvatarPresetsByIDResult(GetAvatarPresetByIDRequest result);
        void onGetAvatarPresetsByIDError(Exception error);
    }

    /**
     *The GetAvatarPresetByID class is responsible for making an API call to retrieve an avatar preset by its ID.
     */
    public static class GetAvatarPresetByID implements Base {

        private String avatarPresetID;

        public GetAvatarPresetByID(String avatarPresetID) {
            this.avatarPresetID = avatarPresetID;
        }
        @Override
        public void callApi(final OnApiResultListener listener) {
            AvatarManagementApi.getAvatarPresetsByID(avatarPresetID, new Response.Listener<GetAvatarPresetByIDRequest>() {
                @Override
                public void onResponse(GetAvatarPresetByIDRequest response) {
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
