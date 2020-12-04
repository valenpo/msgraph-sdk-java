// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AdministrativeUnit;
import com.microsoft.graph.requests.extensions.AdministrativeUnitCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.AdministrativeUnitCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Administrative Unit Collection Page.
 */
public class AdministrativeUnitCollectionPage extends BaseCollectionPage<AdministrativeUnit, AdministrativeUnitCollectionRequestBuilder> {

    /**
     * A collection page for AdministrativeUnit
     *
     * @param response the serialized AdministrativeUnitCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AdministrativeUnitCollectionPage(@Nonnull final AdministrativeUnitCollectionResponse response, @Nonnull final AdministrativeUnitCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for AdministrativeUnit
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AdministrativeUnitCollectionPage(@Nonnull final java.util.List<AdministrativeUnit> pageContents, @Nullable final AdministrativeUnitCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
