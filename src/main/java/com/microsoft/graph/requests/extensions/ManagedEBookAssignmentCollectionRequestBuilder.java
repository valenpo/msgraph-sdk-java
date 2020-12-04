// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedEBook;
import com.microsoft.graph.models.extensions.ManagedEBookAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.ManagedEBookAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedEBookAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedEBookAssignmentCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed EBook Assignment Collection Request Builder.
 */
public class ManagedEBookAssignmentCollectionRequestBuilder extends BaseCollectionRequestBuilder<ManagedEBookAssignment, ManagedEBookAssignmentRequestBuilder, ManagedEBookAssignmentCollectionResponse, ManagedEBookAssignmentCollectionPage, ManagedEBookAssignmentCollectionRequest> {

    /**
     * The request builder for this collection of ManagedEBook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedEBookAssignmentCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedEBookAssignmentRequestBuilder.class, ManagedEBookAssignmentCollectionRequest.class);
    }


}
