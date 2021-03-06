// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.Notebook;
import com.microsoft.graph.requests.NotebookCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.NotebookCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Notebook Collection Page.
 */
public class NotebookCollectionPage extends BaseCollectionPage<Notebook, NotebookCollectionRequestBuilder> {

    /**
     * A collection page for Notebook
     *
     * @param response the serialized NotebookCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public NotebookCollectionPage(@Nonnull final NotebookCollectionResponse response, @Nonnull final NotebookCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Notebook
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public NotebookCollectionPage(@Nonnull final java.util.List<Notebook> pageContents, @Nullable final NotebookCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
