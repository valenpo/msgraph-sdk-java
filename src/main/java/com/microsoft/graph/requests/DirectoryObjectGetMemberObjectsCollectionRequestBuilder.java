// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;

import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.DirectoryObjectGetMemberObjectsCollectionRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectGetMemberObjectsCollectionRequest;
import com.microsoft.graph.requests.DirectoryObjectGetMemberObjectsCollectionResponse;
import com.microsoft.graph.models.DirectoryObjectGetMemberObjectsParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Object Get Member Objects Collection Request Builder.
 */
public class DirectoryObjectGetMemberObjectsCollectionRequestBuilder extends BaseActionCollectionRequestBuilder<String, DirectoryObjectGetMemberObjectsCollectionRequestBuilder, DirectoryObjectGetMemberObjectsCollectionResponse, DirectoryObjectGetMemberObjectsCollectionPage, DirectoryObjectGetMemberObjectsCollectionRequest> {

    /**
     * The request builder for this collection of DirectoryObject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryObjectGetMemberObjectsCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DirectoryObjectGetMemberObjectsCollectionRequestBuilder.class, DirectoryObjectGetMemberObjectsCollectionRequest.class);
    }
    private DirectoryObjectGetMemberObjectsParameterSet body;
    /**
     * The request builder for this collection of DirectoryObject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DirectoryObjectGetMemberObjectsCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DirectoryObjectGetMemberObjectsParameterSet parameters) {
        super(requestUrl, client, requestOptions, DirectoryObjectGetMemberObjectsCollectionRequestBuilder.class, DirectoryObjectGetMemberObjectsCollectionRequest.class);
        this.body = parameters;
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DirectoryObjectGetMemberObjectsCollectionRequest instance
     */
    @Override
    @Nonnull
    public DirectoryObjectGetMemberObjectsCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final DirectoryObjectGetMemberObjectsCollectionRequest request = super.buildRequest(requestOptions);
            request.body = this.body;
            return request;
    }
}
