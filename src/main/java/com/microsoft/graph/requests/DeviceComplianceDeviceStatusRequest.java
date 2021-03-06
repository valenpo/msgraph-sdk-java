// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceComplianceDeviceStatus;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Device Status Request.
 */
public class DeviceComplianceDeviceStatusRequest extends BaseRequest<DeviceComplianceDeviceStatus> {
	
    /**
     * The request for the DeviceComplianceDeviceStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceComplianceDeviceStatusRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceComplianceDeviceStatus.class);
    }

    /**
     * Gets the DeviceComplianceDeviceStatus from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceDeviceStatus> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceComplianceDeviceStatus from the service
     *
     * @return the DeviceComplianceDeviceStatus from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceDeviceStatus get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceDeviceStatus> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceComplianceDeviceStatus delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceComplianceDeviceStatus with a source
     *
     * @param sourceDeviceComplianceDeviceStatus the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceDeviceStatus> patchAsync(@Nonnull final DeviceComplianceDeviceStatus sourceDeviceComplianceDeviceStatus) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceComplianceDeviceStatus);
    }

    /**
     * Patches this DeviceComplianceDeviceStatus with a source
     *
     * @param sourceDeviceComplianceDeviceStatus the source object with updates
     * @return the updated DeviceComplianceDeviceStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceDeviceStatus patch(@Nonnull final DeviceComplianceDeviceStatus sourceDeviceComplianceDeviceStatus) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceComplianceDeviceStatus);
    }

    /**
     * Creates a DeviceComplianceDeviceStatus with a new object
     *
     * @param newDeviceComplianceDeviceStatus the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceDeviceStatus> postAsync(@Nonnull final DeviceComplianceDeviceStatus newDeviceComplianceDeviceStatus) {
        return sendAsync(HttpMethod.POST, newDeviceComplianceDeviceStatus);
    }

    /**
     * Creates a DeviceComplianceDeviceStatus with a new object
     *
     * @param newDeviceComplianceDeviceStatus the new object to create
     * @return the created DeviceComplianceDeviceStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceDeviceStatus post(@Nonnull final DeviceComplianceDeviceStatus newDeviceComplianceDeviceStatus) throws ClientException {
        return send(HttpMethod.POST, newDeviceComplianceDeviceStatus);
    }

    /**
     * Creates a DeviceComplianceDeviceStatus with a new object
     *
     * @param newDeviceComplianceDeviceStatus the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceDeviceStatus> putAsync(@Nonnull final DeviceComplianceDeviceStatus newDeviceComplianceDeviceStatus) {
        return sendAsync(HttpMethod.PUT, newDeviceComplianceDeviceStatus);
    }

    /**
     * Creates a DeviceComplianceDeviceStatus with a new object
     *
     * @param newDeviceComplianceDeviceStatus the object to create/update
     * @return the created DeviceComplianceDeviceStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceDeviceStatus put(@Nonnull final DeviceComplianceDeviceStatus newDeviceComplianceDeviceStatus) throws ClientException {
        return send(HttpMethod.PUT, newDeviceComplianceDeviceStatus);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceComplianceDeviceStatusRequest select(@Nonnull final String value) {
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
     public DeviceComplianceDeviceStatusRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

