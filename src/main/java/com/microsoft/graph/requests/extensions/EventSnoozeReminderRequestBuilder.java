// Template Source: Templates\Java\requests_extensions\BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.EventSnoozeReminderRequest;
import com.microsoft.graph.models.extensions.Event;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event Snooze Reminder Request Builder.
 */
public class EventSnoozeReminderRequestBuilder extends BaseActionRequestBuilder<Event> {

    /**
     * The request builder for this EventSnoozeReminder
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param newReminderTime the newReminderTime
     */
    public EventSnoozeReminderRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final DateTimeTimeZone newReminderTime) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("newReminderTime", newReminderTime);
    }

    /**
     * Creates the EventSnoozeReminderRequest
     *
     * @param requestOptions the options for the request
     * @return the EventSnoozeReminderRequest instance
     */
    @Nonnull
    public EventSnoozeReminderRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the EventSnoozeReminderRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the EventSnoozeReminderRequest instance
     */
    @Nonnull
    public EventSnoozeReminderRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        EventSnoozeReminderRequest request = new EventSnoozeReminderRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("newReminderTime")) {
            request.body.newReminderTime = getParameter("newReminderTime");
        }

        return request;
    }
}
