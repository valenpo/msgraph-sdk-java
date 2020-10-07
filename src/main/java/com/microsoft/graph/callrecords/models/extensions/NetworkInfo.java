// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.callrecords.models.generated.NetworkConnectionType;
import com.microsoft.graph.callrecords.models.generated.WifiBand;
import com.microsoft.graph.callrecords.models.generated.WifiRadioType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Network Info.
 */
public class NetworkInfo implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Bandwidth Low Event Ratio.
     * Fraction of the call that the media endpoint detected the available bandwidth or bandwidth policy was low enough to cause poor quality of the audio sent.
     */
    @SerializedName(value = "bandwidthLowEventRatio", alternate = {"BandwidthLowEventRatio"})
    @Expose
    public float bandwidthLowEventRatio;

    /**
     * The Basic Service Set Identifier.
     * The wireless LAN basic service set identifier of the media endpoint used to connect to the network.
     */
    @SerializedName(value = "basicServiceSetIdentifier", alternate = {"BasicServiceSetIdentifier"})
    @Expose
    public String basicServiceSetIdentifier;

    /**
     * The Connection Type.
     * Type of network used by the media endpoint. Possible values are: unknown, wired, wifi, mobile, tunnel, unknownFutureValue.
     */
    @SerializedName(value = "connectionType", alternate = {"ConnectionType"})
    @Expose
    public NetworkConnectionType connectionType;

    /**
     * The Delay Event Ratio.
     * Fraction of the call that the media endpoint detected the network delay was significant enough to impact the ability to have real-time two-way communication.
     */
    @SerializedName(value = "delayEventRatio", alternate = {"DelayEventRatio"})
    @Expose
    public float delayEventRatio;

    /**
     * The Dns Suffix.
     * DNS suffix associated with the network adapter of the media endpoint.
     */
    @SerializedName(value = "dnsSuffix", alternate = {"DnsSuffix"})
    @Expose
    public String dnsSuffix;

    /**
     * The Ip Address.
     * IP address of the media endpoint.
     */
    @SerializedName(value = "ipAddress", alternate = {"IpAddress"})
    @Expose
    public String ipAddress;

    /**
     * The Link Speed.
     * Link speed in bits per second reported by the network adapter used by the media endpoint.
     */
    @SerializedName(value = "linkSpeed", alternate = {"LinkSpeed"})
    @Expose
    public Long linkSpeed;

    /**
     * The Mac Address.
     * The media access control (MAC) address of the media endpoint's network device.
     */
    @SerializedName(value = "macAddress", alternate = {"MacAddress"})
    @Expose
    public String macAddress;

    /**
     * The Port.
     * Network port number used by media endpoint.
     */
    @SerializedName(value = "port", alternate = {"Port"})
    @Expose
    public Integer port;

    /**
     * The Received Quality Event Ratio.
     * Fraction of the call that the media endpoint detected the network was causing poor quality of the audio received.
     */
    @SerializedName(value = "receivedQualityEventRatio", alternate = {"ReceivedQualityEventRatio"})
    @Expose
    public float receivedQualityEventRatio;

    /**
     * The Reflexive IPAddress.
     * IP address of the media endpoint as seen by the media relay server. This is typically the public internet IP address associated to the endpoint.
     */
    @SerializedName(value = "reflexiveIPAddress", alternate = {"ReflexiveIPAddress"})
    @Expose
    public String reflexiveIPAddress;

    /**
     * The Relay IPAddress.
     * IP address of the media relay server allocated by the media endpoint.
     */
    @SerializedName(value = "relayIPAddress", alternate = {"RelayIPAddress"})
    @Expose
    public String relayIPAddress;

    /**
     * The Relay Port.
     * Network port number allocated on the media relay server by the media endpoint.
     */
    @SerializedName(value = "relayPort", alternate = {"RelayPort"})
    @Expose
    public Integer relayPort;

    /**
     * The Sent Quality Event Ratio.
     * Fraction of the call that the media endpoint detected the network was causing poor quality of the audio sent.
     */
    @SerializedName(value = "sentQualityEventRatio", alternate = {"SentQualityEventRatio"})
    @Expose
    public float sentQualityEventRatio;

    /**
     * The Subnet.
     * Subnet used for media stream by the media endpoint.
     */
    @SerializedName(value = "subnet", alternate = {"Subnet"})
    @Expose
    public String subnet;

    /**
     * The Wifi Band.
     * WiFi band used by the media endpoint. Possible values are: unknown, frequency24GHz, frequency50GHz, frequency60GHz, unknownFutureValue.
     */
    @SerializedName(value = "wifiBand", alternate = {"WifiBand"})
    @Expose
    public WifiBand wifiBand;

    /**
     * The Wifi Battery Charge.
     * Estimated remaining battery charge in percentage reported by the media endpoint.
     */
    @SerializedName(value = "wifiBatteryCharge", alternate = {"WifiBatteryCharge"})
    @Expose
    public Integer wifiBatteryCharge;

    /**
     * The Wifi Channel.
     * WiFi channel used by the media endpoint.
     */
    @SerializedName(value = "wifiChannel", alternate = {"WifiChannel"})
    @Expose
    public Integer wifiChannel;

    /**
     * The Wifi Microsoft Driver.
     * Name of the Microsoft WiFi driver used by the media endpoint. Value may be localized based on the language used by endpoint.
     */
    @SerializedName(value = "wifiMicrosoftDriver", alternate = {"WifiMicrosoftDriver"})
    @Expose
    public String wifiMicrosoftDriver;

    /**
     * The Wifi Microsoft Driver Version.
     * Version of the Microsoft WiFi driver used by the media endpoint.
     */
    @SerializedName(value = "wifiMicrosoftDriverVersion", alternate = {"WifiMicrosoftDriverVersion"})
    @Expose
    public String wifiMicrosoftDriverVersion;

    /**
     * The Wifi Radio Type.
     * Type of WiFi radio used by the media endpoint. Possible values are: unknown, wifi80211a, wifi80211b, wifi80211g, wifi80211n, wifi80211ac, wifi80211ax, unknownFutureValue.
     */
    @SerializedName(value = "wifiRadioType", alternate = {"WifiRadioType"})
    @Expose
    public WifiRadioType wifiRadioType;

    /**
     * The Wifi Signal Strength.
     * WiFi signal strength in percentage reported by the media endpoint.
     */
    @SerializedName(value = "wifiSignalStrength", alternate = {"WifiSignalStrength"})
    @Expose
    public Integer wifiSignalStrength;

    /**
     * The Wifi Vendor Driver.
     * Name of the WiFi driver used by the media endpoint. Value may be localized based on the language used by endpoint.
     */
    @SerializedName(value = "wifiVendorDriver", alternate = {"WifiVendorDriver"})
    @Expose
    public String wifiVendorDriver;

    /**
     * The Wifi Vendor Driver Version.
     * Version of the WiFi driver used by the media endpoint.
     */
    @SerializedName(value = "wifiVendorDriverVersion", alternate = {"WifiVendorDriverVersion"})
    @Expose
    public String wifiVendorDriverVersion;


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
