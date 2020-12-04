// Template Source: Templates\Java\requests_extensions\BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Site;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.SiteRemoveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteRemoveCollectionPage;
import com.microsoft.graph.requests.extensions.SiteRemoveCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Remove Collection Page.
 */
public class SiteRemoveCollectionPage extends BaseCollectionPage<Site, SiteRemoveCollectionRequestBuilder> {

    /**
     * A collection page for Site.
     *
     * @param response The serialized SiteRemoveCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public SiteRemoveCollectionPage(@Nonnull final SiteRemoveCollectionResponse response, @Nonnull final SiteRemoveCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for SiteRemove
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public SiteRemoveCollectionPage(@Nonnull final java.util.List<Site> pageContents, @Nullable final SiteRemoveCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
