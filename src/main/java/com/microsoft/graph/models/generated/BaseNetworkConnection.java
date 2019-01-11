// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ConnectionDirection;
import com.microsoft.graph.models.generated.SecurityNetworkProtocol;
import com.microsoft.graph.models.generated.ConnectionStatus;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Network Connection.
 */
public class BaseNetworkConnection implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Application Name.
     * Name of the application managing the network connection (for example, Facebook, SMTP, etc.).
     */
    @SerializedName("applicationName")
    @Expose
    public String applicationName;

    /**
     * The Destination Address.
     * Destination IP address (of the network connection).
     */
    @SerializedName("destinationAddress")
    @Expose
    public String destinationAddress;

    /**
     * The Destination Domain.
     * Destination domain portion of the destination URL. (for example 'www.contoso.com').
     */
    @SerializedName("destinationDomain")
    @Expose
    public String destinationDomain;

    /**
     * The Destination Port.
     * Destination port (of the network connection).
     */
    @SerializedName("destinationPort")
    @Expose
    public String destinationPort;

    /**
     * The Destination Url.
     * Network connection URL/URI string - excluding parameters. (for example 'www.contoso.com/products/default.html')
     */
    @SerializedName("destinationUrl")
    @Expose
    public String destinationUrl;

    /**
     * The Direction.
     * Network connection direction. Possible values are: unknown, inbound, outbound.
     */
    @SerializedName("direction")
    @Expose
    public ConnectionDirection direction;

    /**
     * The Domain Registered Date Time.
     * Date when the destination domain was registered. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName("domainRegisteredDateTime")
    @Expose
    public java.util.Calendar domainRegisteredDateTime;

    /**
     * The Local Dns Name.
     * The local DNS name resolution as it appears in the host's local DNS cache (for example, in case the 'hosts' file was tampered with).
     */
    @SerializedName("localDnsName")
    @Expose
    public String localDnsName;

    /**
     * The Nat Destination Address.
     * Network Address Translation destination IP address.
     */
    @SerializedName("natDestinationAddress")
    @Expose
    public String natDestinationAddress;

    /**
     * The Nat Destination Port.
     * Network Address Translation destination port.
     */
    @SerializedName("natDestinationPort")
    @Expose
    public String natDestinationPort;

    /**
     * The Nat Source Address.
     * Network Address Translation source IP address.
     */
    @SerializedName("natSourceAddress")
    @Expose
    public String natSourceAddress;

    /**
     * The Nat Source Port.
     * Network Address Translation source port.
     */
    @SerializedName("natSourcePort")
    @Expose
    public String natSourcePort;

    /**
     * The Protocol.
     * Network protocol. Possible values are: unknown, ip, icmp, igmp, ggp, ipv4, tcp, pup, udp, idp, ipv6, ipv6RoutingHeader, ipv6FragmentHeader, ipSecEncapsulatingSecurityPayload, ipSecAuthenticationHeader, icmpV6, ipv6NoNextHeader, ipv6DestinationOptions, nd, raw, ipx, spx, spxII.
     */
    @SerializedName("protocol")
    @Expose
    public SecurityNetworkProtocol protocol;

    /**
     * The Risk Score.
     * Provider generated/calculated risk score of the network connection. Recommended value range of 0-1, which equates to a percentage.
     */
    @SerializedName("riskScore")
    @Expose
    public String riskScore;

    /**
     * The Source Address.
     * Source (i.e. origin) IP address (of the network connection).
     */
    @SerializedName("sourceAddress")
    @Expose
    public String sourceAddress;

    /**
     * The Source Port.
     * Source (i.e. origin) IP port (of the network connection).
     */
    @SerializedName("sourcePort")
    @Expose
    public String sourcePort;

    /**
     * The Status.
     * Network connection status. Possible values are: unknown, attempted, succeeded, blocked, failed.
     */
    @SerializedName("status")
    @Expose
    public ConnectionStatus status;

    /**
     * The Url Parameters.
     * Parameters (suffix) of the destination URL.
     */
    @SerializedName("urlParameters")
    @Expose
    public String urlParameters;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}