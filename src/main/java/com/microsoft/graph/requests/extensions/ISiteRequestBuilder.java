// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ISiteRequest;
import com.microsoft.graph.requests.extensions.IItemAnalyticsWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContentTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContentTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRequestBuilder;
import com.microsoft.graph.requests.extensions.IBaseItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBaseItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IListCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IListRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteGetActivitiesByIntervalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteGetActivitiesByIntervalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteGetByPathRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Site Request Builder.
 */
public interface ISiteRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the ISiteRequest instance
     */
    ISiteRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ISiteRequest instance
     */
    ISiteRequest buildRequest(final java.util.List<? extends Option> requestOptions);


    /**
     * Gets the request builder for ItemAnalytics
     *
     * @return the IItemAnalyticsWithReferenceRequestBuilder instance
     */
    IItemAnalyticsWithReferenceRequestBuilder analytics();

    IColumnDefinitionCollectionRequestBuilder columns();

    IColumnDefinitionRequestBuilder columns(final String id);

    IContentTypeCollectionRequestBuilder contentTypes();

    IContentTypeRequestBuilder contentTypes(final String id);

    /**
     * Gets the request builder for Drive
     *
     * @return the IDriveRequestBuilder instance
     */
    IDriveRequestBuilder drive();

    IDriveCollectionRequestBuilder drives();

    IDriveRequestBuilder drives(final String id);

    IBaseItemCollectionRequestBuilder items();

    IBaseItemRequestBuilder items(final String id);

    IListCollectionRequestBuilder lists();

    IListRequestBuilder lists(final String id);

    ISiteCollectionRequestBuilder sites();

    ISiteRequestBuilder sites(final String id);

    /**
     * Gets the request builder for Onenote
     *
     * @return the IOnenoteRequestBuilder instance
     */
    IOnenoteRequestBuilder onenote();

    ISiteGetActivitiesByIntervalCollectionRequestBuilder getActivitiesByInterval();

    ISiteGetActivitiesByIntervalCollectionRequestBuilder getActivitiesByInterval(final String startDateTime, final String endDateTime, final String interval);
    ISiteGetByPathRequestBuilder getByPath(final String path);

}
