// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionWithReferencesRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OrgContact;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PasswordCredential;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Collection With References Request Builder.
 */
public class ServicePrincipalCollectionWithReferencesRequestBuilder extends BaseCollectionWithReferencesRequestBuilder<ServicePrincipal, ServicePrincipalWithReferenceRequest, ServicePrincipalReferenceRequestBuilder, ServicePrincipalWithReferenceRequestBuilder, ServicePrincipalCollectionResponse, ServicePrincipalCollectionWithReferencesPage, ServicePrincipalCollectionReferenceRequest, ServicePrincipalCollectionReferenceRequestBuilder> {

    /**
     * The request builder for this collection of OrgContact
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ServicePrincipalCollectionWithReferencesRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ServicePrincipalReferenceRequestBuilder.class, ServicePrincipalCollectionReferenceRequest.class, ServicePrincipalCollectionReferenceRequestBuilder.class);
    }
}
