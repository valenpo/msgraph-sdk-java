// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DirectoryObject;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.DirectoryObjectGetByIdsCollectionRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectGetByIdsCollectionRequest;
import com.microsoft.graph.requests.DirectoryObjectGetByIdsCollectionResponse;
import com.microsoft.graph.models.DirectoryObjectGetByIdsParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Object Get By Ids Collection Request Builder.
 */
public class DirectoryObjectGetByIdsCollectionRequestBuilder extends BaseActionCollectionRequestBuilder<DirectoryObject, DirectoryObjectGetByIdsCollectionRequestBuilder, DirectoryObjectGetByIdsCollectionResponse, DirectoryObjectGetByIdsCollectionPage, DirectoryObjectGetByIdsCollectionRequest> {

    /**
     * The request builder for this collection of DirectoryObject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryObjectGetByIdsCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DirectoryObjectGetByIdsCollectionRequestBuilder.class, DirectoryObjectGetByIdsCollectionRequest.class);
    }
    private DirectoryObjectGetByIdsParameterSet body;
    /**
     * The request builder for this collection of DirectoryObject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DirectoryObjectGetByIdsCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DirectoryObjectGetByIdsParameterSet parameters) {
        super(requestUrl, client, requestOptions, DirectoryObjectGetByIdsCollectionRequestBuilder.class, DirectoryObjectGetByIdsCollectionRequest.class);
        this.body = parameters;
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DirectoryObjectGetByIdsCollectionRequest instance
     */
    @Override
    @Nonnull
    public DirectoryObjectGetByIdsCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final DirectoryObjectGetByIdsCollectionRequest request = super.buildRequest(requestOptions);
            request.body = this.body;
            return request;
    }
}
