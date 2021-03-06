// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Identity;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Scoped Role Membership.
 */
public class ScopedRoleMembership extends Entity implements IJsonBackedObject {


    /**
     * The Administrative Unit Id.
     * Unique identifier for the administrative unit that the directory role is scoped to
     */
    @SerializedName(value = "administrativeUnitId", alternate = {"AdministrativeUnitId"})
    @Expose
	@Nullable
    public String administrativeUnitId;

    /**
     * The Role Id.
     * Unique identifier for the directory role that the member is in.
     */
    @SerializedName(value = "roleId", alternate = {"RoleId"})
    @Expose
	@Nullable
    public String roleId;

    /**
     * The Role Member Info.
     * Role member identity information. Represents the user that is a member of this scoped-role.
     */
    @SerializedName(value = "roleMemberInfo", alternate = {"RoleMemberInfo"})
    @Expose
	@Nullable
    public Identity roleMemberInfo;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
