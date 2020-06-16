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
 * The class for the Home Realm Discovery Policy Collection Request.
 */
public class HomeRealmDiscoveryPolicyCollectionRequest extends BaseCollectionRequest<HomeRealmDiscoveryPolicyCollectionResponse, IHomeRealmDiscoveryPolicyCollectionPage> implements IHomeRealmDiscoveryPolicyCollectionRequest {

    /**
     * The request builder for this collection of HomeRealmDiscoveryPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public HomeRealmDiscoveryPolicyCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, HomeRealmDiscoveryPolicyCollectionResponse.class, IHomeRealmDiscoveryPolicyCollectionPage.class);
    }

    public void get(final ICallback<IHomeRealmDiscoveryPolicyCollectionPage> callback) {
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

    public IHomeRealmDiscoveryPolicyCollectionPage get() throws ClientException {
        final HomeRealmDiscoveryPolicyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final HomeRealmDiscoveryPolicy newHomeRealmDiscoveryPolicy, final ICallback<HomeRealmDiscoveryPolicy> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new HomeRealmDiscoveryPolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newHomeRealmDiscoveryPolicy, callback);
    }

    public HomeRealmDiscoveryPolicy post(final HomeRealmDiscoveryPolicy newHomeRealmDiscoveryPolicy) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new HomeRealmDiscoveryPolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newHomeRealmDiscoveryPolicy);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IHomeRealmDiscoveryPolicyCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (HomeRealmDiscoveryPolicyCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IHomeRealmDiscoveryPolicyCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (HomeRealmDiscoveryPolicyCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IHomeRealmDiscoveryPolicyCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (HomeRealmDiscoveryPolicyCollectionRequest)this;
    }

    public IHomeRealmDiscoveryPolicyCollectionPage buildFromResponse(final HomeRealmDiscoveryPolicyCollectionResponse response) {
        final IHomeRealmDiscoveryPolicyCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new HomeRealmDiscoveryPolicyCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final HomeRealmDiscoveryPolicyCollectionPage page = new HomeRealmDiscoveryPolicyCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
