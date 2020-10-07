// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.AttendeeBase;
import com.microsoft.graph.models.extensions.LocationConstraint;
import com.microsoft.graph.models.extensions.TimeConstraint;
import com.microsoft.graph.models.extensions.MeetingTimeSuggestionsResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Find Meeting Times Body.
 */
public class UserFindMeetingTimesBody {

    /**
     * The attendees.
     * 
     */
    @SerializedName(value = "attendees", alternate = {"Attendees"})
    @Expose
    public java.util.List<AttendeeBase> attendees;

    /**
     * The location Constraint.
     * 
     */
    @SerializedName(value = "locationConstraint", alternate = {"LocationConstraint"})
    @Expose
    public LocationConstraint locationConstraint;

    /**
     * The time Constraint.
     * 
     */
    @SerializedName(value = "timeConstraint", alternate = {"TimeConstraint"})
    @Expose
    public TimeConstraint timeConstraint;

    /**
     * The meeting Duration.
     * 
     */
    @SerializedName(value = "meetingDuration", alternate = {"MeetingDuration"})
    @Expose
    public javax.xml.datatype.Duration meetingDuration;

    /**
     * The max Candidates.
     * 
     */
    @SerializedName(value = "maxCandidates", alternate = {"MaxCandidates"})
    @Expose
    public Integer maxCandidates;

    /**
     * The is Organizer Optional.
     * 
     */
    @SerializedName(value = "isOrganizerOptional", alternate = {"IsOrganizerOptional"})
    @Expose
    public Boolean isOrganizerOptional;

    /**
     * The return Suggestion Reasons.
     * 
     */
    @SerializedName(value = "returnSuggestionReasons", alternate = {"ReturnSuggestionReasons"})
    @Expose
    public Boolean returnSuggestionReasons;

    /**
     * The minimum Attendee Percentage.
     * 
     */
    @SerializedName(value = "minimumAttendeePercentage", alternate = {"MinimumAttendeePercentage"})
    @Expose
    public Double minimumAttendeePercentage;


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
