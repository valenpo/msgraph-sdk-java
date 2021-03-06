// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.requests;
import com.microsoft.graph.callrecords.models.Session;
import com.microsoft.graph.callrecords.requests.SessionCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.callrecords.requests.SessionCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Session Collection Page.
 */
public class SessionCollectionPage extends BaseCollectionPage<Session, SessionCollectionRequestBuilder> {

    /**
     * A collection page for Session
     *
     * @param response the serialized SessionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SessionCollectionPage(@Nonnull final SessionCollectionResponse response, @Nonnull final SessionCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Session
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public SessionCollectionPage(@Nonnull final java.util.List<Session> pageContents, @Nullable final SessionCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
