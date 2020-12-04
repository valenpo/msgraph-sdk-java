// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookRangeFormat;
import com.microsoft.graph.models.extensions.WorkbookRangeBorder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.WorkbookRangeBorderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeBorderRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeBorderCollectionRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeBorderCountRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeBorderItemAtRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Border Collection Request Builder.
 */
public class WorkbookRangeBorderCollectionRequestBuilder extends BaseCollectionRequestBuilder<WorkbookRangeBorder, WorkbookRangeBorderRequestBuilder, WorkbookRangeBorderCollectionResponse, WorkbookRangeBorderCollectionPage, WorkbookRangeBorderCollectionRequest> {

    /**
     * The request builder for this collection of WorkbookRangeFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRangeBorderCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookRangeBorderRequestBuilder.class, WorkbookRangeBorderCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder 
     */
    @Nonnull
    public WorkbookRangeBorderCountRequestBuilder count() {
        return new WorkbookRangeBorderCountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.count"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     * @param index the index
     */
    @Nonnull
    public WorkbookRangeBorderItemAtRequestBuilder itemAt(@Nullable final Integer index) {
        return new WorkbookRangeBorderItemAtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.itemAt"), getClient(), null, index);
    }
}
