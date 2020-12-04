// Template Source: Templates\Java\requests_extensions\BaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ApplePushNotificationCertificate;
import com.microsoft.graph.requests.extensions.ApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequest;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Apple Push Notification Certificate Download Apple Push Notification Certificate Signing Request Request.
 */
public class ApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequest extends BaseRequest<String> {

    /**
     * The request for this ApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, String.class);
    }

    /**
     * Gets the String
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super String> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the String
     *
     * @return the String
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public String get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public ApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public ApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public ApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public ApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public ApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public ApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequest count() {
        addCountOption(true);
        return this;
    }
}
