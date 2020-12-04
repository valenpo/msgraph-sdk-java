// Template Source: Templates\Java\requests_extensions\BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OutlookUser;
import com.microsoft.graph.models.extensions.LocaleInfo;
import com.microsoft.graph.models.extensions.TimeZoneInformation;
import com.microsoft.graph.models.generated.TimeZoneStandard;
import com.microsoft.graph.requests.extensions.OutlookCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookCategoryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Outlook User Request Builder.
 */
public class OutlookUserRequestBuilder extends BaseRequestBuilder<OutlookUser> {

    /**
     * The request builder for the OutlookUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OutlookUserRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the OutlookUserRequest instance
     */
    @Nonnull
    public OutlookUserRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the OutlookUserRequest instance
     */
    @Nonnull
    public OutlookUserRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.OutlookUserRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the OutlookCategory collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public OutlookCategoryCollectionRequestBuilder masterCategories() {
        return new OutlookCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("masterCategories"), getClient(), null);
    }

    /**
     * Gets a request builder for the OutlookCategory item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public OutlookCategoryRequestBuilder masterCategories(@Nonnull final String id) {
        return new OutlookCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("masterCategories") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public OutlookUserSupportedLanguagesCollectionRequestBuilder supportedLanguages() {
        return new OutlookUserSupportedLanguagesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.supportedLanguages"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public OutlookUserSupportedTimeZonesCollectionRequestBuilder supportedTimeZones() {
        return new OutlookUserSupportedTimeZonesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.supportedTimeZones"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param timeZoneStandard the timeZoneStandard
     */
    @Nonnull
    public OutlookUserSupportedTimeZonesCollectionRequestBuilder supportedTimeZones(@Nullable final TimeZoneStandard timeZoneStandard) {
        return new OutlookUserSupportedTimeZonesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.supportedTimeZones"), getClient(), null, timeZoneStandard);
    }
}
