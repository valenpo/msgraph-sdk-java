// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ManagedAppProtection;
import com.microsoft.graph.models.ManagedMobileApp;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Protection Request.
 */
public class ManagedAppProtectionRequest extends BaseRequest<ManagedAppProtection> {
	
    /**
     * The request for the ManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public ManagedAppProtectionRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends ManagedAppProtection> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the ManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppProtectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedAppProtection.class);
    }

    /**
     * Gets the ManagedAppProtection from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedAppProtection> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ManagedAppProtection from the service
     *
     * @return the ManagedAppProtection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAppProtection get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedAppProtection> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ManagedAppProtection delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ManagedAppProtection with a source
     *
     * @param sourceManagedAppProtection the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedAppProtection> patchAsync(@Nonnull final ManagedAppProtection sourceManagedAppProtection) {
        return sendAsync(HttpMethod.PATCH, sourceManagedAppProtection);
    }

    /**
     * Patches this ManagedAppProtection with a source
     *
     * @param sourceManagedAppProtection the source object with updates
     * @return the updated ManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAppProtection patch(@Nonnull final ManagedAppProtection sourceManagedAppProtection) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedAppProtection);
    }

    /**
     * Creates a ManagedAppProtection with a new object
     *
     * @param newManagedAppProtection the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedAppProtection> postAsync(@Nonnull final ManagedAppProtection newManagedAppProtection) {
        return sendAsync(HttpMethod.POST, newManagedAppProtection);
    }

    /**
     * Creates a ManagedAppProtection with a new object
     *
     * @param newManagedAppProtection the new object to create
     * @return the created ManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAppProtection post(@Nonnull final ManagedAppProtection newManagedAppProtection) throws ClientException {
        return send(HttpMethod.POST, newManagedAppProtection);
    }

    /**
     * Creates a ManagedAppProtection with a new object
     *
     * @param newManagedAppProtection the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedAppProtection> putAsync(@Nonnull final ManagedAppProtection newManagedAppProtection) {
        return sendAsync(HttpMethod.PUT, newManagedAppProtection);
    }

    /**
     * Creates a ManagedAppProtection with a new object
     *
     * @param newManagedAppProtection the object to create/update
     * @return the created ManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAppProtection put(@Nonnull final ManagedAppProtection newManagedAppProtection) throws ClientException {
        return send(HttpMethod.PUT, newManagedAppProtection);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ManagedAppProtectionRequest select(@Nonnull final String value) {
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
     public ManagedAppProtectionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

