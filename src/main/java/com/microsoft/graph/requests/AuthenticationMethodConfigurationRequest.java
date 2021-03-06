// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AuthenticationMethodConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Method Configuration Request.
 */
public class AuthenticationMethodConfigurationRequest extends BaseRequest<AuthenticationMethodConfiguration> {
	
    /**
     * The request for the AuthenticationMethodConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public AuthenticationMethodConfigurationRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends AuthenticationMethodConfiguration> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the AuthenticationMethodConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuthenticationMethodConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AuthenticationMethodConfiguration.class);
    }

    /**
     * Gets the AuthenticationMethodConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuthenticationMethodConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AuthenticationMethodConfiguration from the service
     *
     * @return the AuthenticationMethodConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AuthenticationMethodConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuthenticationMethodConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AuthenticationMethodConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AuthenticationMethodConfiguration with a source
     *
     * @param sourceAuthenticationMethodConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuthenticationMethodConfiguration> patchAsync(@Nonnull final AuthenticationMethodConfiguration sourceAuthenticationMethodConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceAuthenticationMethodConfiguration);
    }

    /**
     * Patches this AuthenticationMethodConfiguration with a source
     *
     * @param sourceAuthenticationMethodConfiguration the source object with updates
     * @return the updated AuthenticationMethodConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AuthenticationMethodConfiguration patch(@Nonnull final AuthenticationMethodConfiguration sourceAuthenticationMethodConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceAuthenticationMethodConfiguration);
    }

    /**
     * Creates a AuthenticationMethodConfiguration with a new object
     *
     * @param newAuthenticationMethodConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuthenticationMethodConfiguration> postAsync(@Nonnull final AuthenticationMethodConfiguration newAuthenticationMethodConfiguration) {
        return sendAsync(HttpMethod.POST, newAuthenticationMethodConfiguration);
    }

    /**
     * Creates a AuthenticationMethodConfiguration with a new object
     *
     * @param newAuthenticationMethodConfiguration the new object to create
     * @return the created AuthenticationMethodConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AuthenticationMethodConfiguration post(@Nonnull final AuthenticationMethodConfiguration newAuthenticationMethodConfiguration) throws ClientException {
        return send(HttpMethod.POST, newAuthenticationMethodConfiguration);
    }

    /**
     * Creates a AuthenticationMethodConfiguration with a new object
     *
     * @param newAuthenticationMethodConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuthenticationMethodConfiguration> putAsync(@Nonnull final AuthenticationMethodConfiguration newAuthenticationMethodConfiguration) {
        return sendAsync(HttpMethod.PUT, newAuthenticationMethodConfiguration);
    }

    /**
     * Creates a AuthenticationMethodConfiguration with a new object
     *
     * @param newAuthenticationMethodConfiguration the object to create/update
     * @return the created AuthenticationMethodConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AuthenticationMethodConfiguration put(@Nonnull final AuthenticationMethodConfiguration newAuthenticationMethodConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newAuthenticationMethodConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AuthenticationMethodConfigurationRequest select(@Nonnull final String value) {
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
     public AuthenticationMethodConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

