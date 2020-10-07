// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.Win32LobAppPowerShellScriptRuleOperationType;
import com.microsoft.graph.models.generated.Win32LobAppRuleOperator;
import com.microsoft.graph.models.generated.RunAsAccountType;
import com.microsoft.graph.models.extensions.Win32LobAppRule;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Win32Lob App Power Shell Script Rule.
 */
public class Win32LobAppPowerShellScriptRule extends Win32LobAppRule implements IJsonBackedObject {


    /**
     * The Comparison Value.
     * The script output comparison value. Do not specify a value if the rule is used for detection.
     */
    @SerializedName(value = "comparisonValue", alternate = {"ComparisonValue"})
    @Expose
    public String comparisonValue;

    /**
     * The Display Name.
     * The display name for the rule. Do not specify this value if the rule is used for detection.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Enforce Signature Check.
     * A value indicating whether a signature check is enforced.
     */
    @SerializedName(value = "enforceSignatureCheck", alternate = {"EnforceSignatureCheck"})
    @Expose
    public Boolean enforceSignatureCheck;

    /**
     * The Operation Type.
     * The script output comparison operation type. Use NotConfigured (the default value) if the rule is used for detection. Possible values are: notConfigured, string, dateTime, integer, float, version, boolean.
     */
    @SerializedName(value = "operationType", alternate = {"OperationType"})
    @Expose
    public Win32LobAppPowerShellScriptRuleOperationType operationType;

    /**
     * The Operator.
     * The script output operator. Use NotConfigured (the default value) if the rule is used for detection. Possible values are: notConfigured, equal, notEqual, greaterThan, greaterThanOrEqual, lessThan, lessThanOrEqual.
     */
    @SerializedName(value = "operator", alternate = {"Operator"})
    @Expose
    public Win32LobAppRuleOperator operator;

    /**
     * The Run As32Bit.
     * A value indicating whether the script should run as 32-bit.
     */
    @SerializedName(value = "runAs32Bit", alternate = {"RunAs32Bit"})
    @Expose
    public Boolean runAs32Bit;

    /**
     * The Run As Account.
     * The execution context of the script. Do not specify this value if the rule is used for detection. Script detection rules will run in the same context as the associated app install context.
     */
    @SerializedName(value = "runAsAccount", alternate = {"RunAsAccount"})
    @Expose
    public RunAsAccountType runAsAccount;

    /**
     * The Script Content.
     * The base64-encoded script content.
     */
    @SerializedName(value = "scriptContent", alternate = {"ScriptContent"})
    @Expose
    public String scriptContent;


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
