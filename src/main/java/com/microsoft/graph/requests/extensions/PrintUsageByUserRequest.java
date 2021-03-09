// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrintUsageByUser;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Usage By User Request.
 */
public class PrintUsageByUserRequest extends BaseRequest implements IPrintUsageByUserRequest {
	
    /**
     * The request for the PrintUsageByUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintUsageByUserRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrintUsageByUser.class);
    }

    /**
     * Gets the PrintUsageByUser from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super PrintUsageByUser> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PrintUsageByUser from the service
     *
     * @return the PrintUsageByUser from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrintUsageByUser get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super PrintUsageByUser> callback) {
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
     * Patches this PrintUsageByUser with a source
     *
     * @param sourcePrintUsageByUser the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PrintUsageByUser sourcePrintUsageByUser, final ICallback<? super PrintUsageByUser> callback) {
        send(HttpMethod.PATCH, callback, sourcePrintUsageByUser);
    }

    /**
     * Patches this PrintUsageByUser with a source
     *
     * @param sourcePrintUsageByUser the source object with updates
     * @return the updated PrintUsageByUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrintUsageByUser patch(final PrintUsageByUser sourcePrintUsageByUser) throws ClientException {
        return send(HttpMethod.PATCH, sourcePrintUsageByUser);
    }

    /**
     * Creates a PrintUsageByUser with a new object
     *
     * @param newPrintUsageByUser the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PrintUsageByUser newPrintUsageByUser, final ICallback<? super PrintUsageByUser> callback) {
        send(HttpMethod.POST, callback, newPrintUsageByUser);
    }

    /**
     * Creates a PrintUsageByUser with a new object
     *
     * @param newPrintUsageByUser the new object to create
     * @return the created PrintUsageByUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrintUsageByUser post(final PrintUsageByUser newPrintUsageByUser) throws ClientException {
        return send(HttpMethod.POST, newPrintUsageByUser);
    }

    /**
     * Creates a PrintUsageByUser with a new object
     *
     * @param newPrintUsageByUser the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PrintUsageByUser newPrintUsageByUser, final ICallback<? super PrintUsageByUser> callback) {
        send(HttpMethod.PUT, callback, newPrintUsageByUser);
    }

    /**
     * Creates a PrintUsageByUser with a new object
     *
     * @param newPrintUsageByUser the object to create/update
     * @return the created PrintUsageByUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrintUsageByUser put(final PrintUsageByUser newPrintUsageByUser) throws ClientException {
        return send(HttpMethod.PUT, newPrintUsageByUser);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPrintUsageByUserRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PrintUsageByUserRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPrintUsageByUserRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PrintUsageByUserRequest)this;
     }

}
