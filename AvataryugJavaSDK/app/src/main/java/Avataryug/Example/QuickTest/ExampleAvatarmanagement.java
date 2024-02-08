package Avataryug.Example.QuickTest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import Avataryug.Client.Handler.AvatarManagementHandler;
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
import com.example.myjavasdkandroid.R;

/**
 * This ExampleAvatarmanagement Class demonstrates API calling methods with temporary data.
 * A simple {@link Fragment} subclass.
 * Use the {@link ExampleAvatarmanagement#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ExampleAvatarmanagement extends Fragment {
    public ExampleAvatarmanagement() {
        // Required empty public constructor
    }

    public static ExampleAvatarmanagement newInstance(String param1, String param2) {
        ExampleAvatarmanagement fragment = new ExampleAvatarmanagement();
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
        View rootView = inflater.inflate(R.layout.fragment_example_avatarmanagement, container, false);

        Button generateAvatarMeshBtn = rootView.findViewById(R.id.GenerateAvatarMeshBtn);
        generateAvatarMeshBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GenerateAvatarMesh();
                Toast.makeText(getActivity(), "Generate AvatarMesh", Toast.LENGTH_SHORT).show();
            }
        });

        Button getAvatarPresetsBtn = rootView.findViewById(R.id.GetAvatarPresetsBtn);
        getAvatarPresetsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetAvatarPresets();
                Toast.makeText(getActivity(), "Get Avatar Presets", Toast.LENGTH_SHORT).show();
            }
        });

        Button getClipsBtn = rootView.findViewById(R.id.GetClipsBtn);
        getClipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetClips();
                Toast.makeText(getActivity(), "Get Clips", Toast.LENGTH_SHORT).show();
            }
        });

        Button getClipsByIDBtn = rootView.findViewById(R.id.GetClipsByIDBtn);
        getClipsByIDBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetClipsByID();
                Toast.makeText(getActivity(), "Get Clips By ID", Toast.LENGTH_SHORT).show();
            }
        });

        Button getExpressionsBtn = rootView.findViewById(R.id.GetExpressionsBtn);
        getExpressionsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetExpressions();
                Toast.makeText(getActivity(), "Get Expressions", Toast.LENGTH_SHORT).show();
            }
        });

        Button getExpressionsByIDBtn = rootView.findViewById(R.id.GetExpressionsByIDBtn);
        getExpressionsByIDBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetExpressionByID();
                Toast.makeText(getActivity(), "Get Expression By ID", Toast.LENGTH_SHORT).show();
            }
        });

        Button getAllBucketVerticesBtn = rootView.findViewById(R.id.GetAllBucketVerticesBtn);
        getAllBucketVerticesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetAllBucketVertices();
                Toast.makeText(getActivity(), "Get All Bucket Vertices", Toast.LENGTH_SHORT).show();
            }
        });

        Button grantAvatarPresetItemsToUserBtn = rootView.findViewById(R.id.GrantAvatarPresetItemsToUserBtn);
        grantAvatarPresetItemsToUserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GrantAvatarPresetItemsToUser();
                Toast.makeText(getActivity(), "Grant Avatar Preset Items To User", Toast.LENGTH_SHORT).show();
            }
        });

        Button renderAvatarImageBtn = rootView.findViewById(R.id.RenderAvatarImageBtn);
        renderAvatarImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RenderAvatarImage();
                Toast.makeText(getActivity(), "Render Avatar Image", Toast.LENGTH_SHORT).show();
            }
        });

        Button syncAvatarsBtn = rootView.findViewById(R.id.SyncAvatarsBtn);
        syncAvatarsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SyncAvatars();
                Toast.makeText(getActivity(), "Sync Avatars", Toast.LENGTH_SHORT).show();
            }
        });

        Button grantAvatarPresetToUserBtn = rootView.findViewById(R.id.GrantAvatarPresetToUserBtn);
        grantAvatarPresetToUserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GrantAvatarPresetToUser();
                Toast.makeText(getActivity(), "Grant Avatar Preset To User", Toast.LENGTH_SHORT).show();
            }
        });

        Button getAvatarPresetsByIDBtn = rootView.findViewById(R.id.GetAvatarPresetsByIDBtn);
        getAvatarPresetsByIDBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                GetAvatarPresetsByID();
                Toast.makeText(getActivity(), "Get Avatar Presets By ID", Toast.LENGTH_SHORT).show();
            }
        });

        // Inflate the layout for this fragment
        return rootView;
    }

    /**
     * Generates the 3D mesh as per the configuration in the Config panel.
     */
    void GenerateAvatarMesh()
    {
        AvatarManagementHandler handler = new AvatarManagementHandler(new AvatarManagementHandler.GenerateAvatarMesh("sjfj","Android"));
        handler.generateAvatarMesh(new AvatarManagementHandler.OnGenerateAvatarMeshListener() {
            @Override
            public void onGenerateAvatarMeshResult(GenerateAvatarMeshResult result) {
                if (result != null) {
                    String responseText = "onGenerateAvatarMesh Response: " + result.toString();
                    Log.i("Result--",responseText);
                }
            }
            @Override
            public void onGenerateAvatarMeshError(Exception error) {
                String errorText = "onGenerateAvatarMesh Error: " + error.getMessage();
                Log.e(" Error--",errorText);
            }
        });
    }

    /**
     * Get all avatar presets.
     */
    void GetAvatarPresets()
    {
        AvatarManagementHandler handler = new AvatarManagementHandler(new AvatarManagementHandler.GetAvatarPresets(1,1));
        handler.getAvatarPresets(new AvatarManagementHandler.OnGetAvatarPresetsListener() {
            @Override
            public void onGetAvatarPresetsResult(GetAvatarPresetsResult result) {
                if (result != null) {
                    String responseText = "onGetAvatarPresets Response: " + result.toString();
                    Log.i("Result--",responseText);
                }
            }
            @Override
            public void onGetAvatarPresetsError(Exception error) {
                String errorText = "onGetAvatarPresets Error: " + error.getMessage();
                Log.e(" Error--",errorText);
            }
        });
    }

    /**
     * Get all the clips by Active status.
     */
    void GetClips()
    {
        AvatarManagementHandler handler = new AvatarManagementHandler(new AvatarManagementHandler.GetClips(1));
        handler.getClips(new AvatarManagementHandler.OnGetClipsListener() {
            @Override
            public void onGetClipsResult(GetClipsResult result) {
                if (result != null) {
                    String responseText = "onGetClips Response: " + result.toString();
                    Log.i("Result--",responseText);
                }
            }
            @Override
            public void onGetClipsError(Exception error) {
                String errorText = "onGetClips Error: " + error.getMessage();
                Log.e(" Error--",errorText);
            }
        });
    }

    /**
     * Get the specified clip's details by providing ClipID.
     */
    void GetClipsByID()
    {
        AvatarManagementHandler handler = new AvatarManagementHandler(new AvatarManagementHandler.GetClipsByID("28f4b149-c696-4d72-aa79-dbd8936e1935"));
        handler.getClipsByID(new AvatarManagementHandler.OnGetClipsByIDListener() {
            @Override
            public void onGetClipsByIDResult(GetClipsByIDResult result) {
                if (result != null) {
                    String responseText = "onGetClipsByID Response: " + result.toString();
                    Log.i("Result--",responseText);
                }
            }
            @Override
            public void onGetClipsByIDError(Exception error) {
                String errorText = "onGetClipsByID Error: " + error.getMessage();
                Log.e(" Error--",errorText);
            }
        });
    }

    /**
     * Get all the active expressions.
     */
    void GetExpressions()
    {
        AvatarManagementHandler handler = new AvatarManagementHandler(new AvatarManagementHandler.GetExpressions(1));
        handler.getExpression(new AvatarManagementHandler.OnGetExpressionsListener() {
            @Override
            public void onGetExpressionsResult(GetExpressionsResult result) {
                if (result != null) {
                    String responseText = "onGetExpressions Response: " + result.toString();
                    Log.i("Result--",responseText);
                }
            }
            @Override
            public void onGetExpressionsError(Exception error) {
                String errorText = "onGetExpressions Error: " + error.getMessage();
                Log.e(" Error--",errorText);
            }
        });
    }

    /**
     * Get the specified expression details by providing ExpressionID.
     */
    void GetExpressionByID()
    {
        AvatarManagementHandler handler = new AvatarManagementHandler(new AvatarManagementHandler.GetExpressionByID("b4380b35-57c3-47ea-ad2d-1496f85255f8"));
        handler.getExpressionByID(new AvatarManagementHandler.OnGetExpressionByIDListener() {
            @Override
            public void onGetExpressionByIDResult(GetExpressionByIDResult result) {
                if (result != null) {
                    String responseText = "onGetExpressionByID Response: " + result.toString();
                    Log.i("Result--",responseText);
                }
            }
            @Override
            public void onGetExpressionByIDError(Exception error) {
                String errorText = "onGetExpressionByID Error: " + error.getMessage();
                Log.e(" Error--",errorText);
            }
        });
    }

    /**
     * Get vertices for all buckets.
     */
    void GetAllBucketVertices()
    {
        AvatarManagementHandler handler = new AvatarManagementHandler(new AvatarManagementHandler.GetAllBucketVertices("Android"));
        handler.getGetallbucketvertices(new AvatarManagementHandler.OnGetAllBucketVerticesListener() {
            @Override
            public void onGetAllBucketVerticesResult(GetAllBucketVerticesResult result) {
                if (result != null) {
                    String responseText = "onGetAllBucketVertices Response: " + result.toString();
                    Log.i("Result--",responseText);
                }
            }
            @Override
            public void onGetAllBucketVerticesError(Exception error) {
                String errorText = "onGetAllBucketVertices Error: " + error.getMessage();
                Log.e(" Error--",errorText);
            }
        });
    }

    /**
     * Grant Avatar Preset Items To User.
     */
    void GrantAvatarPresetItemsToUser()
    {
        GrantAvatarPresetItemsToUserRequest request = new GrantAvatarPresetItemsToUserRequest();
        AvatarManagementHandler handler = new AvatarManagementHandler(new AvatarManagementHandler.GrantAvatarPresetItemsToUser(request));
        handler.grantAvatarPresetItemsToUser(new AvatarManagementHandler.OnGrantAvatarPresetItemsToUserListener() {
            @Override
            public void onGrantAvatarPresetItemsToUserResult(GrantAvatarPresetItemsToUserResult result) {
                if (result != null) {
                    String responseText = "onGrantAvatarPresetItemsToUser Response: " + result.toString();
                    Log.i("Result--",responseText);
                }
            }
            @Override
            public void onGrantAvatarPresetItemsToUserError(Exception error) {
                String errorText = "onGrantAvatarPresetItemsToUser Error: " + error.getMessage();
                Log.e(" Error--",errorText);
            }
        });

    }

    /**
     * Render Avatar Image.
     */
    void RenderAvatarImage()
    {
        RenderAvatarImageRequest request = new RenderAvatarImageRequest();
        AvatarManagementHandler handler = new AvatarManagementHandler(new AvatarManagementHandler.RenderAvatarImage(request));
        handler.renderAvatarImage(new AvatarManagementHandler.OnRenderAvatarImageListener() {
            @Override
            public void onRenderAvatarImageResult(RenderAvatarImageResult result) {
                if (result != null) {
                    String responseText = "onRenderAvatarImage Response: " + result.toString();
                    Log.i("Result--",responseText);
                }
            }
            @Override
            public void onRenderAvatarImageError(Exception error) {
                String errorText = "onRenderAvatarImage Error: " + error.getMessage();
                Log.e(" Error--",errorText);
            }
        });
    }

    /**
     * Creates missing avatars into the mentioned platform for the user.
     */
    void SyncAvatars()
    {
        SyncAvatarsRequest request = new SyncAvatarsRequest();

        AvatarManagementHandler handler = new AvatarManagementHandler(new AvatarManagementHandler.SyncAvatars(request));
        handler.syncAvatars(new AvatarManagementHandler.OnSyncAvatarsListener() {
            @Override
            public void onSyncAvatarsResult(SyncAvatarsResult result) {
                if (result != null) {
                    String responseText = "onSyncAvatars Response: " + result.toString();
                    Log.i("Result--",responseText);
                }
            }
            @Override
            public void onSyncAvatarsError(Exception error) {
                String errorText = "onSyncAvatars Error: " + error.getMessage();
                Log.e(" Error--",errorText);
            }
        });
    }

    /**
     * Grant Avatar Preset To User.
     */
    void GrantAvatarPresetToUser()
    {
        GrantAvatarPresetToUserRequest request = new GrantAvatarPresetToUserRequest();
        request.setAvatarID("kf[psf");
        request.setAvatarUrl("jfapsohjfj");
        request.setAvatarData("jasjf");
        request.setThumbUrl("jfasjf");

        AvatarManagementHandler handler = new AvatarManagementHandler(new AvatarManagementHandler.GrantAvatarPresetToUser(request));
        handler.grantAvatarPresetToUser(new AvatarManagementHandler.OnGrantAvatarPresetToUserListener() {
            @Override
            public void onGrantAvatarPresetToUserResult(GrantAvatarPresetToUserResult result) {
                if (result != null) {
                    String responseText = "onGrantAvatarPresetToUser Response: " + result.toString();
                    Log.i("Result--",responseText);
                }
            }
            @Override
            public void onGrantAvatarPresetToUserError(Exception error) {
                String errorText = "onGrantAvatarPresetToUser Error: " + error.getMessage();
                Log.e(" Error--",errorText);
            }
        });
    }

    /**
     * Retrive Avatar preset by ID
     */
    void GetAvatarPresetsByID()
    {
        AvatarManagementHandler handler = new AvatarManagementHandler(new AvatarManagementHandler.GetAvatarPresetByID("fhsfha"));
        handler.getAvatarPresetsByID(new AvatarManagementHandler.OnGetAvatarPresetsByIDListener() {
            @Override
            public void onGetAvatarPresetsByIDResult(GetAvatarPresetByIDRequest result) {
                if (result != null) {
                    String responseText = "onGetAvatarPresetsByID Response: " + result.toString();
                    Log.i("Result--",responseText);
                }
            }
            @Override
            public void onGetAvatarPresetsByIDError(Exception error) {
                String errorText = "onGetAvatarPresetsByID Error: " + error.getMessage();
                Log.e(" Error--",errorText);
            }
        });
    }

}