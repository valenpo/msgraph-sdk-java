// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.AuthenticationMethod;
import com.microsoft.graph.requests.AuthenticationMethodCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.AuthenticationMethodCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Method Collection Page.
 */
public class AuthenticationMethodCollectionPage extends BaseCollectionPage<AuthenticationMethod, AuthenticationMethodCollectionRequestBuilder> {

    /**
     * A collection page for AuthenticationMethod
     *
     * @param response the serialized AuthenticationMethodCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AuthenticationMethodCollectionPage(@Nonnull final AuthenticationMethodCollectionResponse response, @Nonnull final AuthenticationMethodCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for AuthenticationMethod
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AuthenticationMethodCollectionPage(@Nonnull final java.util.List<AuthenticationMethod> pageContents, @Nullable final AuthenticationMethodCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
