// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.CallOptions;
import com.microsoft.graph.models.CallRoute;
import com.microsoft.graph.models.ChatInfo;
import com.microsoft.graph.models.CallDirection;
import com.microsoft.graph.models.IncomingContext;
import com.microsoft.graph.models.MediaConfig;
import com.microsoft.graph.models.CallMediaState;
import com.microsoft.graph.models.MeetingInfo;
import com.microsoft.graph.models.Modality;
import com.microsoft.graph.models.ResultInfo;
import com.microsoft.graph.models.ParticipantInfo;
import com.microsoft.graph.models.CallState;
import com.microsoft.graph.models.InvitationParticipantInfo;
import com.microsoft.graph.models.ToneInfo;
import com.microsoft.graph.models.CallTranscriptionInfo;
import com.microsoft.graph.models.CommsOperation;
import com.microsoft.graph.models.Participant;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.CommsOperationCollectionPage;
import com.microsoft.graph.requests.ParticipantCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call.
 */
public class Call extends Entity implements IJsonBackedObject {


    /**
     * The Callback Uri.
     * The callback URL on which callbacks will be delivered. Must be https.
     */
    @SerializedName(value = "callbackUri", alternate = {"CallbackUri"})
    @Expose
	@Nullable
    public String callbackUri;

    /**
     * The Call Chain Id.
     * A unique identifier for all the participant calls in a conference or a unique identifier for two participant calls in a P2P call.  This needs to be copied over from Microsoft.Graph.Call.CallChainId.
     */
    @SerializedName(value = "callChainId", alternate = {"CallChainId"})
    @Expose
	@Nullable
    public String callChainId;

    /**
     * The Call Options.
     * 
     */
    @SerializedName(value = "callOptions", alternate = {"CallOptions"})
    @Expose
	@Nullable
    public CallOptions callOptions;

    /**
     * The Call Routes.
     * The routing information on how the call was retargeted. Read-only.
     */
    @SerializedName(value = "callRoutes", alternate = {"CallRoutes"})
    @Expose
	@Nullable
    public java.util.List<CallRoute> callRoutes;

    /**
     * The Chat Info.
     * The chat information. Required information for joining a meeting.
     */
    @SerializedName(value = "chatInfo", alternate = {"ChatInfo"})
    @Expose
	@Nullable
    public ChatInfo chatInfo;

    /**
     * The Direction.
     * The direction of the call. The possible value are incoming or outgoing. Read-only.
     */
    @SerializedName(value = "direction", alternate = {"Direction"})
    @Expose
	@Nullable
    public CallDirection direction;

    /**
     * The Incoming Context.
     * The context associated with an incoming call. Read-only. Server generated.
     */
    @SerializedName(value = "incomingContext", alternate = {"IncomingContext"})
    @Expose
	@Nullable
    public IncomingContext incomingContext;

    /**
     * The Media Config.
     * The media configuration. Required.
     */
    @SerializedName(value = "mediaConfig", alternate = {"MediaConfig"})
    @Expose
	@Nullable
    public MediaConfig mediaConfig;

    /**
     * The Media State.
     * Read-only. The call media state.
     */
    @SerializedName(value = "mediaState", alternate = {"MediaState"})
    @Expose
	@Nullable
    public CallMediaState mediaState;

    /**
     * The Meeting Info.
     * The meeting information that's required for joining a meeting.
     */
    @SerializedName(value = "meetingInfo", alternate = {"MeetingInfo"})
    @Expose
	@Nullable
    public MeetingInfo meetingInfo;

    /**
     * The My Participant Id.
     * 
     */
    @SerializedName(value = "myParticipantId", alternate = {"MyParticipantId"})
    @Expose
	@Nullable
    public String myParticipantId;

    /**
     * The Requested Modalities.
     * 
     */
    @SerializedName(value = "requestedModalities", alternate = {"RequestedModalities"})
    @Expose
	@Nullable
    public java.util.List<Modality> requestedModalities;

    /**
     * The Result Info.
     * 
     */
    @SerializedName(value = "resultInfo", alternate = {"ResultInfo"})
    @Expose
	@Nullable
    public ResultInfo resultInfo;

    /**
     * The Source.
     * 
     */
    @SerializedName(value = "source", alternate = {"Source"})
    @Expose
	@Nullable
    public ParticipantInfo source;

    /**
     * The State.
     * 
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public CallState state;

    /**
     * The Subject.
     * 
     */
    @SerializedName(value = "subject", alternate = {"Subject"})
    @Expose
	@Nullable
    public String subject;

    /**
     * The Targets.
     * 
     */
    @SerializedName(value = "targets", alternate = {"Targets"})
    @Expose
	@Nullable
    public java.util.List<InvitationParticipantInfo> targets;

    /**
     * The Tenant Id.
     * 
     */
    @SerializedName(value = "tenantId", alternate = {"TenantId"})
    @Expose
	@Nullable
    public String tenantId;

    /**
     * The Tone Info.
     * 
     */
    @SerializedName(value = "toneInfo", alternate = {"ToneInfo"})
    @Expose
	@Nullable
    public ToneInfo toneInfo;

    /**
     * The Transcription.
     * The transcription information for the call. Read-only.
     */
    @SerializedName(value = "transcription", alternate = {"Transcription"})
    @Expose
	@Nullable
    public CallTranscriptionInfo transcription;

    /**
     * The Operations.
     * Read-only. Nullable.
     */
    @SerializedName(value = "operations", alternate = {"Operations"})
    @Expose
	@Nullable
    public CommsOperationCollectionPage operations;

    /**
     * The Participants.
     * Read-only. Nullable.
     */
    @SerializedName(value = "participants", alternate = {"Participants"})
    @Expose
	@Nullable
    public ParticipantCollectionPage participants;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("operations")) {
            operations = serializer.deserializeObject(json.get("operations"), CommsOperationCollectionPage.class);
        }

        if (json.has("participants")) {
            participants = serializer.deserializeObject(json.get("participants"), ParticipantCollectionPage.class);
        }
    }
}
