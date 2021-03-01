// Template Source: BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.HomeRealmDiscoveryPolicy;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.models.ExtensionProperty;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseReferenceRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonObject;

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
    public HomeRealmDiscoveryPolicyReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
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
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<HomeRealmDiscoveryPolicy> putAsync(@Nonnull final HomeRealmDiscoveryPolicy srcHomeRealmDiscoveryPolicy) {
        final JsonObject payload = new JsonObject();
        payload.add("@odata.id", new JsonPrimitive(this.getClient().getServiceRoot() + "/policies/homeRealmDiscoveryPolicies/" + srcHomeRealmDiscoveryPolicy.id));
        return sendAsync(HttpMethod.PUT, payload);
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
        final JsonObject payload = new JsonObject();
        payload.add("@odata.id", new JsonPrimitive(this.getClient().getServiceRoot() + "/policies/homeRealmDiscoveryPolicies/" + srcHomeRealmDiscoveryPolicy.id));
        return send(HttpMethod.PUT, payload);
    }
}
