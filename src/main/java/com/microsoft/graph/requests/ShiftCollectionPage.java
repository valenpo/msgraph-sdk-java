// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.Shift;
import com.microsoft.graph.requests.ShiftCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.ShiftCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Shift Collection Page.
 */
public class ShiftCollectionPage extends BaseCollectionPage<Shift, ShiftCollectionRequestBuilder> {

    /**
     * A collection page for Shift
     *
     * @param response the serialized ShiftCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ShiftCollectionPage(@Nonnull final ShiftCollectionResponse response, @Nonnull final ShiftCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Shift
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ShiftCollectionPage(@Nonnull final java.util.List<Shift> pageContents, @Nullable final ShiftCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
