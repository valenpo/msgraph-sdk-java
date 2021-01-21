// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.EducationGender;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Student.
 */
public class EducationStudent implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Birth Date.
     * Birth date of the student.
     */
    @SerializedName(value = "birthDate", alternate = {"BirthDate"})
    @Expose
	@Nullable
    public com.microsoft.graph.core.DateOnly birthDate;

    /**
     * The External Id.
     * ID of the student in the source system.
     */
    @SerializedName(value = "externalId", alternate = {"ExternalId"})
    @Expose
	@Nullable
    public String externalId;

    /**
     * The Gender.
     * The possible values are: female, male, other, unknownFutureValue.
     */
    @SerializedName(value = "gender", alternate = {"Gender"})
    @Expose
	@Nullable
    public EducationGender gender;

    /**
     * The Grade.
     * Current grade level of the student.
     */
    @SerializedName(value = "grade", alternate = {"Grade"})
    @Expose
	@Nullable
    public String grade;

    /**
     * The Graduation Year.
     * Year the student is graduating from the school.
     */
    @SerializedName(value = "graduationYear", alternate = {"GraduationYear"})
    @Expose
	@Nullable
    public String graduationYear;

    /**
     * The Student Number.
     * Student Number.
     */
    @SerializedName(value = "studentNumber", alternate = {"StudentNumber"})
    @Expose
	@Nullable
    public String studentNumber;


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
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
	@Override
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}