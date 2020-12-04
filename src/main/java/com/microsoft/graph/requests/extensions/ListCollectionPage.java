// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.List;
import com.microsoft.graph.requests.extensions.ListCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.ListCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the List Collection Page.
 */
public class ListCollectionPage extends BaseCollectionPage<List, ListCollectionRequestBuilder> {

    /**
     * A collection page for List
     *
     * @param response the serialized ListCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ListCollectionPage(@Nonnull final ListCollectionResponse response, @Nonnull final ListCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for List
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ListCollectionPage(@Nonnull final java.util.List<List> pageContents, @Nullable final ListCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
