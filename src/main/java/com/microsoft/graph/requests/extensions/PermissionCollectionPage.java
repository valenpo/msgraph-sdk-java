// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Permission;
import com.microsoft.graph.requests.extensions.PermissionCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.PermissionCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Permission Collection Page.
 */
public class PermissionCollectionPage extends BaseCollectionPage<Permission, PermissionCollectionRequestBuilder> {

    /**
     * A collection page for Permission
     *
     * @param response the serialized PermissionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PermissionCollectionPage(@Nonnull final PermissionCollectionResponse response, @Nonnull final PermissionCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Permission
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PermissionCollectionPage(@Nonnull final java.util.List<Permission> pageContents, @Nullable final PermissionCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
