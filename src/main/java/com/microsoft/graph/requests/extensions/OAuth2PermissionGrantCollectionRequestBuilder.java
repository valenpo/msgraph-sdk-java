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
 * The class for the OAuth2Permission Grant Collection Request Builder.
 */
public class OAuth2PermissionGrantCollectionRequestBuilder extends BaseRequestBuilder implements IOAuth2PermissionGrantCollectionRequestBuilder {

    /**
     * The request builder for this collection of OAuth2PermissionGrant
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OAuth2PermissionGrantCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IOAuth2PermissionGrantCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IOAuth2PermissionGrantCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new OAuth2PermissionGrantCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IOAuth2PermissionGrantRequestBuilder byId(final String id) {
        return new OAuth2PermissionGrantRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
