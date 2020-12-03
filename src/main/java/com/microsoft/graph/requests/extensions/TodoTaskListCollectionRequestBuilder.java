// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Todo;
import com.microsoft.graph.models.extensions.TodoTaskList;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.TodoTaskListCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TodoTaskListRequestBuilder;
import com.microsoft.graph.requests.extensions.TodoTaskListCollectionRequest;
import com.microsoft.graph.requests.extensions.TodoTaskListDeltaCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Todo Task List Collection Request Builder.
 */
public class TodoTaskListCollectionRequestBuilder extends BaseCollectionRequestBuilder<TodoTaskList, TodoTaskListRequestBuilder, TodoTaskListCollectionResponse, TodoTaskListCollectionPage, TodoTaskListCollectionRequest> {

    /**
     * The request builder for this collection of Todo
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TodoTaskListCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TodoTaskListRequestBuilder.class, TodoTaskListCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public TodoTaskListDeltaCollectionRequestBuilder delta() {
        return new TodoTaskListDeltaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.delta"), getClient(), null);
    }

    /**
     * Gets the list of newly created, updated or deleted TodoTaskList
     * 
     * @return a request builder to get the changes
     * @param deltaLink the link returned by the last delta request
     */
    @Nonnull
	public TodoTaskListDeltaCollectionRequestBuilder delta(@Nonnull final String deltaLink) {
        return new TodoTaskListDeltaCollectionRequestBuilder(deltaLink, getClient(), null);
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
