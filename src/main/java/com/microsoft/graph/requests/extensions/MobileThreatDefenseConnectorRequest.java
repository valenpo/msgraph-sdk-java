// Template Source: Templates\Java\requests_extensions\BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileThreatDefenseConnector;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile Threat Defense Connector Request.
 */
public class MobileThreatDefenseConnectorRequest extends BaseRequest<MobileThreatDefenseConnector> {
	
    /**
     * The request for the MobileThreatDefenseConnector
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileThreatDefenseConnectorRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileThreatDefenseConnector.class);
    }

    /**
     * Gets the MobileThreatDefenseConnector from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super MobileThreatDefenseConnector> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MobileThreatDefenseConnector from the service
     *
     * @return the MobileThreatDefenseConnector from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileThreatDefenseConnector get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super MobileThreatDefenseConnector> callback) {
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
     * Patches this MobileThreatDefenseConnector with a source
     *
     * @param sourceMobileThreatDefenseConnector the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final MobileThreatDefenseConnector sourceMobileThreatDefenseConnector, @Nonnull final ICallback<? super MobileThreatDefenseConnector> callback) {
        send(HttpMethod.PATCH, callback, sourceMobileThreatDefenseConnector);
    }

    /**
     * Patches this MobileThreatDefenseConnector with a source
     *
     * @param sourceMobileThreatDefenseConnector the source object with updates
     * @return the updated MobileThreatDefenseConnector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileThreatDefenseConnector patch(@Nonnull final MobileThreatDefenseConnector sourceMobileThreatDefenseConnector) throws ClientException {
        return send(HttpMethod.PATCH, sourceMobileThreatDefenseConnector);
    }

    /**
     * Creates a MobileThreatDefenseConnector with a new object
     *
     * @param newMobileThreatDefenseConnector the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final MobileThreatDefenseConnector newMobileThreatDefenseConnector, @Nonnull final ICallback<? super MobileThreatDefenseConnector> callback) {
        send(HttpMethod.POST, callback, newMobileThreatDefenseConnector);
    }

    /**
     * Creates a MobileThreatDefenseConnector with a new object
     *
     * @param newMobileThreatDefenseConnector the new object to create
     * @return the created MobileThreatDefenseConnector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileThreatDefenseConnector post(@Nonnull final MobileThreatDefenseConnector newMobileThreatDefenseConnector) throws ClientException {
        return send(HttpMethod.POST, newMobileThreatDefenseConnector);
    }

    /**
     * Creates a MobileThreatDefenseConnector with a new object
     *
     * @param newMobileThreatDefenseConnector the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final MobileThreatDefenseConnector newMobileThreatDefenseConnector, @Nonnull final ICallback<? super MobileThreatDefenseConnector> callback) {
        send(HttpMethod.PUT, callback, newMobileThreatDefenseConnector);
    }

    /**
     * Creates a MobileThreatDefenseConnector with a new object
     *
     * @param newMobileThreatDefenseConnector the object to create/update
     * @return the created MobileThreatDefenseConnector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileThreatDefenseConnector put(@Nonnull final MobileThreatDefenseConnector newMobileThreatDefenseConnector) throws ClientException {
        return send(HttpMethod.PUT, newMobileThreatDefenseConnector);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MobileThreatDefenseConnectorRequest select(@Nonnull final String value) {
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
     public MobileThreatDefenseConnectorRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

