// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Person;
import com.microsoft.graph.requests.extensions.PersonCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.PersonCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person Collection Page.
 */
public class PersonCollectionPage extends BaseCollectionPage<Person, PersonCollectionRequestBuilder> {

    /**
     * A collection page for Person
     *
     * @param response the serialized PersonCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PersonCollectionPage(@Nonnull final PersonCollectionResponse response, @Nonnull final PersonCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Person
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PersonCollectionPage(@Nonnull final java.util.List<Person> pageContents, @Nullable final PersonCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
