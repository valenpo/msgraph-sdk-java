// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.ManagedDeviceMobileAppConfigurationUserStatus;
import com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationUserStatusCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Mobile App Configuration User Status Collection Page.
 */
public class ManagedDeviceMobileAppConfigurationUserStatusCollectionPage extends BaseCollectionPage<ManagedDeviceMobileAppConfigurationUserStatus, ManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder> {

    /**
     * A collection page for ManagedDeviceMobileAppConfigurationUserStatus
     *
     * @param response the serialized ManagedDeviceMobileAppConfigurationUserStatusCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ManagedDeviceMobileAppConfigurationUserStatusCollectionPage(@Nonnull final ManagedDeviceMobileAppConfigurationUserStatusCollectionResponse response, @Nonnull final ManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ManagedDeviceMobileAppConfigurationUserStatus
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ManagedDeviceMobileAppConfigurationUserStatusCollectionPage(@Nonnull final java.util.List<ManagedDeviceMobileAppConfigurationUserStatus> pageContents, @Nullable final ManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
