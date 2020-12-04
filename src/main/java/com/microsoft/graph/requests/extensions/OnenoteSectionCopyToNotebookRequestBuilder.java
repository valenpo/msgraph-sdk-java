// Template Source: Templates\Java\requests_extensions\BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.OnenoteSectionCopyToNotebookRequest;
import com.microsoft.graph.models.extensions.OnenoteSection;
import com.microsoft.graph.models.extensions.OnenoteOperation;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Section Copy To Notebook Request Builder.
 */
public class OnenoteSectionCopyToNotebookRequestBuilder extends BaseActionRequestBuilder<OnenoteOperation> {

    /**
     * The request builder for this OnenoteSectionCopyToNotebook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param id the id
     * @param groupId the groupId
     * @param renameAs the renameAs
     * @param siteCollectionId the siteCollectionId
     * @param siteId the siteId
     */
    public OnenoteSectionCopyToNotebookRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final String id, @Nullable final String groupId, @Nullable final String renameAs, @Nullable final String siteCollectionId, @Nullable final String siteId) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("id", id);
        bodyParams.put("groupId", groupId);
        bodyParams.put("renameAs", renameAs);
        bodyParams.put("siteCollectionId", siteCollectionId);
        bodyParams.put("siteId", siteId);
    }

    /**
     * Creates the OnenoteSectionCopyToNotebookRequest
     *
     * @param requestOptions the options for the request
     * @return the OnenoteSectionCopyToNotebookRequest instance
     */
    @Nonnull
    public OnenoteSectionCopyToNotebookRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the OnenoteSectionCopyToNotebookRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the OnenoteSectionCopyToNotebookRequest instance
     */
    @Nonnull
    public OnenoteSectionCopyToNotebookRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        OnenoteSectionCopyToNotebookRequest request = new OnenoteSectionCopyToNotebookRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("id")) {
            request.body.id = getParameter("id");
        }

        if (hasParameter("groupId")) {
            request.body.groupId = getParameter("groupId");
        }

        if (hasParameter("renameAs")) {
            request.body.renameAs = getParameter("renameAs");
        }

        if (hasParameter("siteCollectionId")) {
            request.body.siteCollectionId = getParameter("siteCollectionId");
        }

        if (hasParameter("siteId")) {
            request.body.siteId = getParameter("siteId");
        }

        return request;
    }
}
