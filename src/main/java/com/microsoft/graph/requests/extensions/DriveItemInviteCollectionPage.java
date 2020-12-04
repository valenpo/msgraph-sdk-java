// Template Source: Templates\Java\requests_extensions\BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DriveRecipient;
import com.microsoft.graph.models.extensions.Permission;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DriveItemInviteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemInviteCollectionPage;
import com.microsoft.graph.requests.extensions.DriveItemInviteCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Invite Collection Page.
 */
public class DriveItemInviteCollectionPage extends BaseCollectionPage<Permission, DriveItemInviteCollectionRequestBuilder> {

    /**
     * A collection page for Permission.
     *
     * @param response The serialized DriveItemInviteCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public DriveItemInviteCollectionPage(@Nonnull final DriveItemInviteCollectionResponse response, @Nonnull final DriveItemInviteCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for DriveItemInvite
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DriveItemInviteCollectionPage(@Nonnull final java.util.List<Permission> pageContents, @Nullable final DriveItemInviteCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
