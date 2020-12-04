// Template Source: Templates\Java\requests_extensions\BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.HomeRealmDiscoveryPolicy;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseReferenceRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Home Realm Discovery Policy Reference Request.
 */
public class HomeRealmDiscoveryPolicyReferenceRequest extends BaseReferenceRequest<HomeRealmDiscoveryPolicy> {

    /**
     * The request for the HomeRealmDiscoveryPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public HomeRealmDiscoveryPolicyReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, HomeRealmDiscoveryPolicy.class);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public HomeRealmDiscoveryPolicyReferenceRequest select(@Nonnull final String value) {
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
    public HomeRealmDiscoveryPolicyReferenceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }
    /**
     * Puts the HomeRealmDiscoveryPolicy
     *
     * @param srcHomeRealmDiscoveryPolicy the HomeRealmDiscoveryPolicy reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final HomeRealmDiscoveryPolicy srcHomeRealmDiscoveryPolicy, @Nonnull final ICallback<? super HomeRealmDiscoveryPolicy> callback) {
        send(HttpMethod.PUT, callback, srcHomeRealmDiscoveryPolicy);
    }

    /**
     * Puts the HomeRealmDiscoveryPolicy
     *
     * @param srcHomeRealmDiscoveryPolicy the HomeRealmDiscoveryPolicy reference to PUT
     * @return the HomeRealmDiscoveryPolicy
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public HomeRealmDiscoveryPolicy put(@Nonnull final HomeRealmDiscoveryPolicy srcHomeRealmDiscoveryPolicy) throws ClientException {
        return send(HttpMethod.PUT, srcHomeRealmDiscoveryPolicy);
    }
}
