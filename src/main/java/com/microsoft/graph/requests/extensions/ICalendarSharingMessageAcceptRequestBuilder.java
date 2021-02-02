// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ICalendarSharingMessageAcceptRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Calendar Sharing Message Accept Request Builder.
 */
public interface ICalendarSharingMessageAcceptRequestBuilder extends IRequestBuilder {

    /**
     * Creates the ICalendarSharingMessageAcceptRequest
     *
     * @param requestOptions the options for the request
     * @return the ICalendarSharingMessageAcceptRequest instance
     */
    ICalendarSharingMessageAcceptRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the ICalendarSharingMessageAcceptRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the ICalendarSharingMessageAcceptRequest instance
     */
    ICalendarSharingMessageAcceptRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}