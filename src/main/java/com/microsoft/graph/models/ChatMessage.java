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
import com.microsoft.graph.models.ChatMessageAttachment;
import com.microsoft.graph.models.ItemBody;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.graph.models.ChatMessageImportance;
import com.microsoft.graph.models.ChatMessageMention;
import com.microsoft.graph.models.ChatMessageType;
import com.microsoft.graph.models.ChatMessagePolicyViolation;
import com.microsoft.graph.models.ChatMessageReaction;
import com.microsoft.graph.models.ChatMessageHostedContent;
import com.microsoft.graph.models.ChatMessage;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.ChatMessageHostedContentCollectionPage;
import com.microsoft.graph.requests.ChatMessageCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Message.
 */
public class ChatMessage extends Entity implements IJsonBackedObject {


    /**
     * The Attachments.
     * Attached files. Attachments are currently read-only – sending attachments is not supported.
     */
    @SerializedName(value = "attachments", alternate = {"Attachments"})
    @Expose
	@Nullable
    public java.util.List<ChatMessageAttachment> attachments;

    /**
     * The Body.
     * Plaintext/HTML representation of the content of the chat message. Representation is specified by the contentType inside the body. The content is always in HTML if the chat message contains a chatMessageMention.
     */
    @SerializedName(value = "body", alternate = {"Body"})
    @Expose
	@Nullable
    public ItemBody body;

    /**
     * The Created Date Time.
     * Read only. Timestamp of when the chat message was created.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Deleted Date Time.
     * Read only. Timestamp at which the chat message was deleted, or null if not deleted.
     */
    @SerializedName(value = "deletedDateTime", alternate = {"DeletedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime deletedDateTime;

    /**
     * The Etag.
     * Read-only. Version number of the chat message.
     */
    @SerializedName(value = "etag", alternate = {"Etag"})
    @Expose
	@Nullable
    public String etag;

    /**
     * The From.
     * Read only. Details of the sender of the chat message.
     */
    @SerializedName(value = "from", alternate = {"From"})
    @Expose
	@Nullable
    public IdentitySet from;

    /**
     * The Importance.
     * The importance of the chat message. The possible values are: normal, high, urgent.
     */
    @SerializedName(value = "importance", alternate = {"Importance"})
    @Expose
	@Nullable
    public ChatMessageImportance importance;

    /**
     * The Last Edited Date Time.
     * Read only. Timestamp when edits to the chat message were made. Triggers an 'Edited' flag in the Microsoft Teams UI. If no edits are made the value is null.
     */
    @SerializedName(value = "lastEditedDateTime", alternate = {"LastEditedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastEditedDateTime;

    /**
     * The Last Modified Date Time.
     * Read only. Timestamp when the chat message is created (initial setting) or edited, including when a reaction is added or removed.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Locale.
     * Locale of the chat message set by the client.
     */
    @SerializedName(value = "locale", alternate = {"Locale"})
    @Expose
	@Nullable
    public String locale;

    /**
     * The Mentions.
     * List of entities mentioned in the chat message. Currently supports user, bot, team, channel.
     */
    @SerializedName(value = "mentions", alternate = {"Mentions"})
    @Expose
	@Nullable
    public java.util.List<ChatMessageMention> mentions;

    /**
     * The Message Type.
     * The type of chat message. The possible values are: message.
     */
    @SerializedName(value = "messageType", alternate = {"MessageType"})
    @Expose
	@Nullable
    public ChatMessageType messageType;

    /**
     * The Policy Violation.
     * Defines the properties of a policy violation set by a data loss prevention (DLP) application.
     */
    @SerializedName(value = "policyViolation", alternate = {"PolicyViolation"})
    @Expose
	@Nullable
    public ChatMessagePolicyViolation policyViolation;

    /**
     * The Reactions.
     * Reactions for this chat message (for example, Like).
     */
    @SerializedName(value = "reactions", alternate = {"Reactions"})
    @Expose
	@Nullable
    public java.util.List<ChatMessageReaction> reactions;

    /**
     * The Reply To Id.
     * Read-only. Id of the parent chat message or root chat message of the thread. (Only applies to chat messages in channels not chats)
     */
    @SerializedName(value = "replyToId", alternate = {"ReplyToId"})
    @Expose
	@Nullable
    public String replyToId;

    /**
     * The Subject.
     * The subject of the chat message, in plaintext.
     */
    @SerializedName(value = "subject", alternate = {"Subject"})
    @Expose
	@Nullable
    public String subject;

    /**
     * The Summary.
     * Summary text of the chat message that could be used for push notifications and summary views or fall back views. Only applies to channel chat messages, not chat messages in a chat.
     */
    @SerializedName(value = "summary", alternate = {"Summary"})
    @Expose
	@Nullable
    public String summary;

    /**
     * The Web Url.
     * 
     */
    @SerializedName(value = "webUrl", alternate = {"WebUrl"})
    @Expose
	@Nullable
    public String webUrl;

    /**
     * The Hosted Contents.
     * 
     */
    @SerializedName(value = "hostedContents", alternate = {"HostedContents"})
    @Expose
	@Nullable
    public ChatMessageHostedContentCollectionPage hostedContents;

    /**
     * The Replies.
     * 
     */
    @SerializedName(value = "replies", alternate = {"Replies"})
    @Expose
	@Nullable
    public ChatMessageCollectionPage replies;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("hostedContents")) {
            hostedContents = serializer.deserializeObject(json.get("hostedContents"), ChatMessageHostedContentCollectionPage.class);
        }

        if (json.has("replies")) {
            replies = serializer.deserializeObject(json.get("replies"), ChatMessageCollectionPage.class);
        }
    }
}
