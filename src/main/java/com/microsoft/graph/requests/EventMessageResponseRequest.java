// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EventMessageResponse;
import com.microsoft.graph.models.Recipient;
import com.microsoft.graph.models.Message;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event Message Response Request.
 */
public class EventMessageResponseRequest extends BaseRequest<EventMessageResponse> {
	
    /**
     * The request for the EventMessageResponse
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EventMessageResponseRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EventMessageResponse.class);
    }

    /**
     * Gets the EventMessageResponse from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EventMessageResponse> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the EventMessageResponse from the service
     *
     * @return the EventMessageResponse from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EventMessageResponse get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EventMessageResponse> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public EventMessageResponse delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this EventMessageResponse with a source
     *
     * @param sourceEventMessageResponse the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EventMessageResponse> patchAsync(@Nonnull final EventMessageResponse sourceEventMessageResponse) {
        return sendAsync(HttpMethod.PATCH, sourceEventMessageResponse);
    }

    /**
     * Patches this EventMessageResponse with a source
     *
     * @param sourceEventMessageResponse the source object with updates
     * @return the updated EventMessageResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EventMessageResponse patch(@Nonnull final EventMessageResponse sourceEventMessageResponse) throws ClientException {
        return send(HttpMethod.PATCH, sourceEventMessageResponse);
    }

    /**
     * Creates a EventMessageResponse with a new object
     *
     * @param newEventMessageResponse the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EventMessageResponse> postAsync(@Nonnull final EventMessageResponse newEventMessageResponse) {
        return sendAsync(HttpMethod.POST, newEventMessageResponse);
    }

    /**
     * Creates a EventMessageResponse with a new object
     *
     * @param newEventMessageResponse the new object to create
     * @return the created EventMessageResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EventMessageResponse post(@Nonnull final EventMessageResponse newEventMessageResponse) throws ClientException {
        return send(HttpMethod.POST, newEventMessageResponse);
    }

    /**
     * Creates a EventMessageResponse with a new object
     *
     * @param newEventMessageResponse the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EventMessageResponse> putAsync(@Nonnull final EventMessageResponse newEventMessageResponse) {
        return sendAsync(HttpMethod.PUT, newEventMessageResponse);
    }

    /**
     * Creates a EventMessageResponse with a new object
     *
     * @param newEventMessageResponse the object to create/update
     * @return the created EventMessageResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EventMessageResponse put(@Nonnull final EventMessageResponse newEventMessageResponse) throws ClientException {
        return send(HttpMethod.PUT, newEventMessageResponse);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public EventMessageResponseRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public EventMessageResponseRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

