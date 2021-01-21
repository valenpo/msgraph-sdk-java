// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DomainDnsRecord;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Domain Dns Record Request.
 */
public class DomainDnsRecordRequest extends BaseRequest<DomainDnsRecord> {
	
    /**
     * The request for the DomainDnsRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public DomainDnsRecordRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends DomainDnsRecord> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the DomainDnsRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DomainDnsRecordRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DomainDnsRecord.class);
    }

    /**
     * Gets the DomainDnsRecord from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DomainDnsRecord> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DomainDnsRecord from the service
     *
     * @return the DomainDnsRecord from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DomainDnsRecord get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DomainDnsRecord> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DomainDnsRecord delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DomainDnsRecord with a source
     *
     * @param sourceDomainDnsRecord the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DomainDnsRecord> patchAsync(@Nonnull final DomainDnsRecord sourceDomainDnsRecord) {
        return sendAsync(HttpMethod.PATCH, sourceDomainDnsRecord);
    }

    /**
     * Patches this DomainDnsRecord with a source
     *
     * @param sourceDomainDnsRecord the source object with updates
     * @return the updated DomainDnsRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DomainDnsRecord patch(@Nonnull final DomainDnsRecord sourceDomainDnsRecord) throws ClientException {
        return send(HttpMethod.PATCH, sourceDomainDnsRecord);
    }

    /**
     * Creates a DomainDnsRecord with a new object
     *
     * @param newDomainDnsRecord the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DomainDnsRecord> postAsync(@Nonnull final DomainDnsRecord newDomainDnsRecord) {
        return sendAsync(HttpMethod.POST, newDomainDnsRecord);
    }

    /**
     * Creates a DomainDnsRecord with a new object
     *
     * @param newDomainDnsRecord the new object to create
     * @return the created DomainDnsRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DomainDnsRecord post(@Nonnull final DomainDnsRecord newDomainDnsRecord) throws ClientException {
        return send(HttpMethod.POST, newDomainDnsRecord);
    }

    /**
     * Creates a DomainDnsRecord with a new object
     *
     * @param newDomainDnsRecord the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DomainDnsRecord> putAsync(@Nonnull final DomainDnsRecord newDomainDnsRecord) {
        return sendAsync(HttpMethod.PUT, newDomainDnsRecord);
    }

    /**
     * Creates a DomainDnsRecord with a new object
     *
     * @param newDomainDnsRecord the object to create/update
     * @return the created DomainDnsRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DomainDnsRecord put(@Nonnull final DomainDnsRecord newDomainDnsRecord) throws ClientException {
        return send(HttpMethod.PUT, newDomainDnsRecord);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DomainDnsRecordRequest select(@Nonnull final String value) {
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
     public DomainDnsRecordRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
