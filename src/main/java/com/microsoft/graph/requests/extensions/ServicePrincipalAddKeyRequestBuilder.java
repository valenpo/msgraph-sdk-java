// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IServicePrincipalAddKeyRequest;
import com.microsoft.graph.requests.extensions.ServicePrincipalAddKeyRequest;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PasswordCredential;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Add Key Request Builder.
 */
public class ServicePrincipalAddKeyRequestBuilder extends BaseActionRequestBuilder implements IServicePrincipalAddKeyRequestBuilder {

    /**
     * The request builder for this ServicePrincipalAddKey
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param keyCredential the keyCredential
     * @param passwordCredential the passwordCredential
     * @param proof the proof
     */
    public ServicePrincipalAddKeyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final KeyCredential keyCredential, final PasswordCredential passwordCredential, final String proof) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("keyCredential", keyCredential);
        bodyParams.put("passwordCredential", passwordCredential);
        bodyParams.put("proof", proof);
    }

    /**
     * Creates the IServicePrincipalAddKeyRequest
     *
     * @return the IServicePrincipalAddKeyRequest instance
     */
    public IServicePrincipalAddKeyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IServicePrincipalAddKeyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IServicePrincipalAddKeyRequest instance
     */
    public IServicePrincipalAddKeyRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ServicePrincipalAddKeyRequest request = new ServicePrincipalAddKeyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("keyCredential")) {
            request.body.keyCredential = getParameter("keyCredential");
        }

        if (hasParameter("passwordCredential")) {
            request.body.passwordCredential = getParameter("passwordCredential");
        }

        if (hasParameter("proof")) {
            request.body.proof = getParameter("proof");
        }

        return request;
    }
}
