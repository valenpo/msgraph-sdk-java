// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.OpenTypeExtension;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Open Type Extension Request.
 */
public class OpenTypeExtensionRequest extends BaseRequest<OpenTypeExtension> {
	
    /**
     * The request for the OpenTypeExtension
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OpenTypeExtensionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OpenTypeExtension.class);
    }

    /**
     * Gets the OpenTypeExtension from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OpenTypeExtension> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the OpenTypeExtension from the service
     *
     * @return the OpenTypeExtension from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OpenTypeExtension get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OpenTypeExtension> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public OpenTypeExtension delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this OpenTypeExtension with a source
     *
     * @param sourceOpenTypeExtension the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OpenTypeExtension> patchAsync(@Nonnull final OpenTypeExtension sourceOpenTypeExtension) {
        return sendAsync(HttpMethod.PATCH, sourceOpenTypeExtension);
    }

    /**
     * Patches this OpenTypeExtension with a source
     *
     * @param sourceOpenTypeExtension the source object with updates
     * @return the updated OpenTypeExtension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OpenTypeExtension patch(@Nonnull final OpenTypeExtension sourceOpenTypeExtension) throws ClientException {
        return send(HttpMethod.PATCH, sourceOpenTypeExtension);
    }

    /**
     * Creates a OpenTypeExtension with a new object
     *
     * @param newOpenTypeExtension the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OpenTypeExtension> postAsync(@Nonnull final OpenTypeExtension newOpenTypeExtension) {
        return sendAsync(HttpMethod.POST, newOpenTypeExtension);
    }

    /**
     * Creates a OpenTypeExtension with a new object
     *
     * @param newOpenTypeExtension the new object to create
     * @return the created OpenTypeExtension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OpenTypeExtension post(@Nonnull final OpenTypeExtension newOpenTypeExtension) throws ClientException {
        return send(HttpMethod.POST, newOpenTypeExtension);
    }

    /**
     * Creates a OpenTypeExtension with a new object
     *
     * @param newOpenTypeExtension the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OpenTypeExtension> putAsync(@Nonnull final OpenTypeExtension newOpenTypeExtension) {
        return sendAsync(HttpMethod.PUT, newOpenTypeExtension);
    }

    /**
     * Creates a OpenTypeExtension with a new object
     *
     * @param newOpenTypeExtension the object to create/update
     * @return the created OpenTypeExtension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OpenTypeExtension put(@Nonnull final OpenTypeExtension newOpenTypeExtension) throws ClientException {
        return send(HttpMethod.PUT, newOpenTypeExtension);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public OpenTypeExtensionRequest select(@Nonnull final String value) {
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
     public OpenTypeExtensionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

