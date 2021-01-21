// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ManagedEBook;
import com.microsoft.graph.models.ManagedEBookAssignment;
import com.microsoft.graph.requests.ManagedEBookAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagedEBookAssignmentRequestBuilder;
import com.microsoft.graph.requests.DeviceInstallStateCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceInstallStateRequestBuilder;
import com.microsoft.graph.requests.UserInstallStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.UserInstallStateSummaryRequestBuilder;
import com.microsoft.graph.requests.EBookInstallSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed EBook Request.
 */
public class ManagedEBookRequest extends BaseRequest<ManagedEBook> {
	
    /**
     * The request for the ManagedEBook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public ManagedEBookRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends ManagedEBook> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the ManagedEBook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedEBookRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedEBook.class);
    }

    /**
     * Gets the ManagedEBook from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedEBook> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ManagedEBook from the service
     *
     * @return the ManagedEBook from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedEBook get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedEBook> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ManagedEBook delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ManagedEBook with a source
     *
     * @param sourceManagedEBook the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedEBook> patchAsync(@Nonnull final ManagedEBook sourceManagedEBook) {
        return sendAsync(HttpMethod.PATCH, sourceManagedEBook);
    }

    /**
     * Patches this ManagedEBook with a source
     *
     * @param sourceManagedEBook the source object with updates
     * @return the updated ManagedEBook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedEBook patch(@Nonnull final ManagedEBook sourceManagedEBook) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedEBook);
    }

    /**
     * Creates a ManagedEBook with a new object
     *
     * @param newManagedEBook the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedEBook> postAsync(@Nonnull final ManagedEBook newManagedEBook) {
        return sendAsync(HttpMethod.POST, newManagedEBook);
    }

    /**
     * Creates a ManagedEBook with a new object
     *
     * @param newManagedEBook the new object to create
     * @return the created ManagedEBook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedEBook post(@Nonnull final ManagedEBook newManagedEBook) throws ClientException {
        return send(HttpMethod.POST, newManagedEBook);
    }

    /**
     * Creates a ManagedEBook with a new object
     *
     * @param newManagedEBook the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedEBook> putAsync(@Nonnull final ManagedEBook newManagedEBook) {
        return sendAsync(HttpMethod.PUT, newManagedEBook);
    }

    /**
     * Creates a ManagedEBook with a new object
     *
     * @param newManagedEBook the object to create/update
     * @return the created ManagedEBook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedEBook put(@Nonnull final ManagedEBook newManagedEBook) throws ClientException {
        return send(HttpMethod.PUT, newManagedEBook);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ManagedEBookRequest select(@Nonnull final String value) {
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
     public ManagedEBookRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
