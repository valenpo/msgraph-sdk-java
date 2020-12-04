// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SignIn;
import com.microsoft.graph.requests.extensions.SignInCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.SignInCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sign In Collection Page.
 */
public class SignInCollectionPage extends BaseCollectionPage<SignIn, SignInCollectionRequestBuilder> {

    /**
     * A collection page for SignIn
     *
     * @param response the serialized SignInCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SignInCollectionPage(@Nonnull final SignInCollectionResponse response, @Nonnull final SignInCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for SignIn
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public SignInCollectionPage(@Nonnull final java.util.List<SignIn> pageContents, @Nullable final SignInCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
