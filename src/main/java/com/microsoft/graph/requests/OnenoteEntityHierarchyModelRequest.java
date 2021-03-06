// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.OnenoteEntityHierarchyModel;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Entity Hierarchy Model Request.
 */
public class OnenoteEntityHierarchyModelRequest extends BaseRequest<OnenoteEntityHierarchyModel> {
	
    /**
     * The request for the OnenoteEntityHierarchyModel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public OnenoteEntityHierarchyModelRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends OnenoteEntityHierarchyModel> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the OnenoteEntityHierarchyModel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenoteEntityHierarchyModelRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OnenoteEntityHierarchyModel.class);
    }

    /**
     * Gets the OnenoteEntityHierarchyModel from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OnenoteEntityHierarchyModel> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the OnenoteEntityHierarchyModel from the service
     *
     * @return the OnenoteEntityHierarchyModel from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenoteEntityHierarchyModel get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OnenoteEntityHierarchyModel> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public OnenoteEntityHierarchyModel delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this OnenoteEntityHierarchyModel with a source
     *
     * @param sourceOnenoteEntityHierarchyModel the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OnenoteEntityHierarchyModel> patchAsync(@Nonnull final OnenoteEntityHierarchyModel sourceOnenoteEntityHierarchyModel) {
        return sendAsync(HttpMethod.PATCH, sourceOnenoteEntityHierarchyModel);
    }

    /**
     * Patches this OnenoteEntityHierarchyModel with a source
     *
     * @param sourceOnenoteEntityHierarchyModel the source object with updates
     * @return the updated OnenoteEntityHierarchyModel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenoteEntityHierarchyModel patch(@Nonnull final OnenoteEntityHierarchyModel sourceOnenoteEntityHierarchyModel) throws ClientException {
        return send(HttpMethod.PATCH, sourceOnenoteEntityHierarchyModel);
    }

    /**
     * Creates a OnenoteEntityHierarchyModel with a new object
     *
     * @param newOnenoteEntityHierarchyModel the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OnenoteEntityHierarchyModel> postAsync(@Nonnull final OnenoteEntityHierarchyModel newOnenoteEntityHierarchyModel) {
        return sendAsync(HttpMethod.POST, newOnenoteEntityHierarchyModel);
    }

    /**
     * Creates a OnenoteEntityHierarchyModel with a new object
     *
     * @param newOnenoteEntityHierarchyModel the new object to create
     * @return the created OnenoteEntityHierarchyModel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenoteEntityHierarchyModel post(@Nonnull final OnenoteEntityHierarchyModel newOnenoteEntityHierarchyModel) throws ClientException {
        return send(HttpMethod.POST, newOnenoteEntityHierarchyModel);
    }

    /**
     * Creates a OnenoteEntityHierarchyModel with a new object
     *
     * @param newOnenoteEntityHierarchyModel the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OnenoteEntityHierarchyModel> putAsync(@Nonnull final OnenoteEntityHierarchyModel newOnenoteEntityHierarchyModel) {
        return sendAsync(HttpMethod.PUT, newOnenoteEntityHierarchyModel);
    }

    /**
     * Creates a OnenoteEntityHierarchyModel with a new object
     *
     * @param newOnenoteEntityHierarchyModel the object to create/update
     * @return the created OnenoteEntityHierarchyModel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenoteEntityHierarchyModel put(@Nonnull final OnenoteEntityHierarchyModel newOnenoteEntityHierarchyModel) throws ClientException {
        return send(HttpMethod.PUT, newOnenoteEntityHierarchyModel);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public OnenoteEntityHierarchyModelRequest select(@Nonnull final String value) {
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
     public OnenoteEntityHierarchyModelRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

