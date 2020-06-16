// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the OAuth2Permission Grant Collection Request.
 */
public class OAuth2PermissionGrantCollectionRequest extends BaseCollectionRequest<OAuth2PermissionGrantCollectionResponse, IOAuth2PermissionGrantCollectionPage> implements IOAuth2PermissionGrantCollectionRequest {

    /**
     * The request builder for this collection of OAuth2PermissionGrant
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OAuth2PermissionGrantCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, OAuth2PermissionGrantCollectionResponse.class, IOAuth2PermissionGrantCollectionPage.class);
    }

    public void get(final ICallback<IOAuth2PermissionGrantCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IOAuth2PermissionGrantCollectionPage get() throws ClientException {
        final OAuth2PermissionGrantCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final OAuth2PermissionGrant newOAuth2PermissionGrant, final ICallback<OAuth2PermissionGrant> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new OAuth2PermissionGrantRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newOAuth2PermissionGrant, callback);
    }

    public OAuth2PermissionGrant post(final OAuth2PermissionGrant newOAuth2PermissionGrant) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new OAuth2PermissionGrantRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newOAuth2PermissionGrant);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IOAuth2PermissionGrantCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (OAuth2PermissionGrantCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IOAuth2PermissionGrantCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (OAuth2PermissionGrantCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IOAuth2PermissionGrantCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (OAuth2PermissionGrantCollectionRequest)this;
    }

    public IOAuth2PermissionGrantCollectionPage buildFromResponse(final OAuth2PermissionGrantCollectionResponse response) {
        final IOAuth2PermissionGrantCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new OAuth2PermissionGrantCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final OAuth2PermissionGrantCollectionPage page = new OAuth2PermissionGrantCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
