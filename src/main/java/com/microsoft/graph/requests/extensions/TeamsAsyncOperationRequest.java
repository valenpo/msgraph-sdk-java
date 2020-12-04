// Template Source: Templates\Java\requests_extensions\BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsAsyncOperation;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams Async Operation Request.
 */
public class TeamsAsyncOperationRequest extends BaseRequest<TeamsAsyncOperation> {
	
    /**
     * The request for the TeamsAsyncOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsAsyncOperationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamsAsyncOperation.class);
    }

    /**
     * Gets the TeamsAsyncOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super TeamsAsyncOperation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TeamsAsyncOperation from the service
     *
     * @return the TeamsAsyncOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsAsyncOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super TeamsAsyncOperation> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TeamsAsyncOperation with a source
     *
     * @param sourceTeamsAsyncOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final TeamsAsyncOperation sourceTeamsAsyncOperation, @Nonnull final ICallback<? super TeamsAsyncOperation> callback) {
        send(HttpMethod.PATCH, callback, sourceTeamsAsyncOperation);
    }

    /**
     * Patches this TeamsAsyncOperation with a source
     *
     * @param sourceTeamsAsyncOperation the source object with updates
     * @return the updated TeamsAsyncOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsAsyncOperation patch(@Nonnull final TeamsAsyncOperation sourceTeamsAsyncOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceTeamsAsyncOperation);
    }

    /**
     * Creates a TeamsAsyncOperation with a new object
     *
     * @param newTeamsAsyncOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final TeamsAsyncOperation newTeamsAsyncOperation, @Nonnull final ICallback<? super TeamsAsyncOperation> callback) {
        send(HttpMethod.POST, callback, newTeamsAsyncOperation);
    }

    /**
     * Creates a TeamsAsyncOperation with a new object
     *
     * @param newTeamsAsyncOperation the new object to create
     * @return the created TeamsAsyncOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsAsyncOperation post(@Nonnull final TeamsAsyncOperation newTeamsAsyncOperation) throws ClientException {
        return send(HttpMethod.POST, newTeamsAsyncOperation);
    }

    /**
     * Creates a TeamsAsyncOperation with a new object
     *
     * @param newTeamsAsyncOperation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final TeamsAsyncOperation newTeamsAsyncOperation, @Nonnull final ICallback<? super TeamsAsyncOperation> callback) {
        send(HttpMethod.PUT, callback, newTeamsAsyncOperation);
    }

    /**
     * Creates a TeamsAsyncOperation with a new object
     *
     * @param newTeamsAsyncOperation the object to create/update
     * @return the created TeamsAsyncOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsAsyncOperation put(@Nonnull final TeamsAsyncOperation newTeamsAsyncOperation) throws ClientException {
        return send(HttpMethod.PUT, newTeamsAsyncOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TeamsAsyncOperationRequest select(@Nonnull final String value) {
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
     public TeamsAsyncOperationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

