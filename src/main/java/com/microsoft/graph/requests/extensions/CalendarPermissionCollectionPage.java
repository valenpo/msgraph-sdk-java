// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.CalendarPermission;
import com.microsoft.graph.requests.extensions.CalendarPermissionCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.CalendarPermissionCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Permission Collection Page.
 */
public class CalendarPermissionCollectionPage extends BaseCollectionPage<CalendarPermission, CalendarPermissionCollectionRequestBuilder> {

    /**
     * A collection page for CalendarPermission
     *
     * @param response the serialized CalendarPermissionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CalendarPermissionCollectionPage(@Nonnull final CalendarPermissionCollectionResponse response, @Nonnull final CalendarPermissionCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for CalendarPermission
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public CalendarPermissionCollectionPage(@Nonnull final java.util.List<CalendarPermission> pageContents, @Nullable final CalendarPermissionCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
