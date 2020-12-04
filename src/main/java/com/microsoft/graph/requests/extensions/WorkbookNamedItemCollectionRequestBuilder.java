// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookWorksheet;
import com.microsoft.graph.models.extensions.WorkbookNamedItem;
import com.microsoft.graph.models.extensions.WorkbookRange;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.WorkbookNamedItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookNamedItemRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookNamedItemCollectionRequest;
import com.microsoft.graph.requests.extensions.WorkbookNamedItemAddRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookNamedItemAddFormulaLocalRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Named Item Collection Request Builder.
 */
public class WorkbookNamedItemCollectionRequestBuilder extends BaseCollectionRequestBuilder<WorkbookNamedItem, WorkbookNamedItemRequestBuilder, WorkbookNamedItemCollectionResponse, WorkbookNamedItemCollectionPage, WorkbookNamedItemCollectionRequest> {

    /**
     * The request builder for this collection of WorkbookWorksheet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookNamedItemCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookNamedItemRequestBuilder.class, WorkbookNamedItemCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder 
     * @param name the name
     * @param reference the reference
     * @param comment the comment
     */
    @Nonnull
    public WorkbookNamedItemAddRequestBuilder add(@Nullable final String name, @Nullable final com.google.gson.JsonElement reference, @Nullable final String comment) {
        return new WorkbookNamedItemAddRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.add"), getClient(), null, name, reference, comment);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     * @param name the name
     * @param formula the formula
     * @param comment the comment
     */
    @Nonnull
    public WorkbookNamedItemAddFormulaLocalRequestBuilder addFormulaLocal(@Nullable final String name, @Nullable final String formula, @Nullable final String comment) {
        return new WorkbookNamedItemAddFormulaLocalRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.addFormulaLocal"), getClient(), null, name, formula, comment);
    }

    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
