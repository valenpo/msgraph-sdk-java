// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ThreatAssessmentResult;
import com.microsoft.graph.requests.extensions.ThreatAssessmentResultCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.ThreatAssessmentResultCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Threat Assessment Result Collection Page.
 */
public class ThreatAssessmentResultCollectionPage extends BaseCollectionPage<ThreatAssessmentResult, ThreatAssessmentResultCollectionRequestBuilder> {

    /**
     * A collection page for ThreatAssessmentResult
     *
     * @param response the serialized ThreatAssessmentResultCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ThreatAssessmentResultCollectionPage(@Nonnull final ThreatAssessmentResultCollectionResponse response, @Nonnull final ThreatAssessmentResultCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ThreatAssessmentResult
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ThreatAssessmentResultCollectionPage(@Nonnull final java.util.List<ThreatAssessmentResult> pageContents, @Nullable final ThreatAssessmentResultCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
