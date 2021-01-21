// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.AssignedLabel;
import com.microsoft.graph.models.AssignedLicense;
import com.microsoft.graph.models.LicenseProcessingState;
import com.microsoft.graph.models.OnPremisesProvisioningError;
import com.microsoft.graph.models.AppRoleAssignment;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.models.ResourceSpecificPermissionGrant;
import com.microsoft.graph.models.GroupSetting;
import com.microsoft.graph.models.Calendar;
import com.microsoft.graph.models.Event;
import com.microsoft.graph.models.Conversation;
import com.microsoft.graph.models.ProfilePhoto;
import com.microsoft.graph.models.ConversationThread;
import com.microsoft.graph.models.Drive;
import com.microsoft.graph.models.Site;
import com.microsoft.graph.models.Extension;
import com.microsoft.graph.models.GroupLifecyclePolicy;
import com.microsoft.graph.models.PlannerGroup;
import com.microsoft.graph.models.Onenote;
import com.microsoft.graph.models.Team;
import com.microsoft.graph.requests.AppRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.DirectoryObjectCollectionPage;
import com.microsoft.graph.requests.ResourceSpecificPermissionGrantCollectionPage;
import com.microsoft.graph.requests.GroupSettingCollectionPage;
import com.microsoft.graph.requests.EventCollectionPage;
import com.microsoft.graph.requests.ConversationCollectionPage;
import com.microsoft.graph.requests.ProfilePhotoCollectionPage;
import com.microsoft.graph.requests.ConversationThreadCollectionPage;
import com.microsoft.graph.requests.DriveCollectionPage;
import com.microsoft.graph.requests.SiteCollectionPage;
import com.microsoft.graph.requests.ExtensionCollectionPage;
import com.microsoft.graph.requests.GroupLifecyclePolicyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group.
 */
public class Group extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Assigned Labels.
     * The list of sensitivity label pairs (label ID, label name) associated with an Microsoft 365 group. Returned only on $select. Read-only.
     */
    @SerializedName(value = "assignedLabels", alternate = {"AssignedLabels"})
    @Expose
	@Nullable
    public java.util.List<AssignedLabel> assignedLabels;

    /**
     * The Assigned Licenses.
     * The licenses that are assigned to the group. Returned only on $select. Read-only.
     */
    @SerializedName(value = "assignedLicenses", alternate = {"AssignedLicenses"})
    @Expose
	@Nullable
    public java.util.List<AssignedLicense> assignedLicenses;

    /**
     * The Classification.
     * Describes a classification for the group (such as low, medium or high business impact). Valid values for this property are defined by creating a ClassificationList setting value, based on the template definition.Returned by default.
     */
    @SerializedName(value = "classification", alternate = {"Classification"})
    @Expose
	@Nullable
    public String classification;

    /**
     * The Created Date Time.
     * Timestamp of when the group was created. The value cannot be modified and is automatically populated when the group is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Description.
     * An optional description for the group. Returned by default.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * The display name for the group. This property is required when a group is created and cannot be cleared during updates. Returned by default. Supports $filter and $orderby.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Expiration Date Time.
     * Timestamp of when the group is set to expire. The value cannot be modified and is automatically populated when the group is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only.
     */
    @SerializedName(value = "expirationDateTime", alternate = {"ExpirationDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime expirationDateTime;

    /**
     * The Group Types.
     * Specifies the group type and its membership.  If the collection contains Unified, the group is a Microsoft 365 group; otherwise, it's either a security group or distribution group. For details, see groups overview.If the collection includes DynamicMembership, the group has dynamic membership; otherwise, membership is static.  Returned by default. Supports $filter.
     */
    @SerializedName(value = "groupTypes", alternate = {"GroupTypes"})
    @Expose
	@Nullable
    public java.util.List<String> groupTypes;

    /**
     * The Has Members With License Errors.
     * Indicates whether there are members in this group that have license errors from its group-based license assignment. This property is never returned on a GET operation. You can use it as a $filter argument to get groups that have members with license errors (that is, filter for this property being true). See an example.
     */
    @SerializedName(value = "hasMembersWithLicenseErrors", alternate = {"HasMembersWithLicenseErrors"})
    @Expose
	@Nullable
    public Boolean hasMembersWithLicenseErrors;

    /**
     * The License Processing State.
     * Indicates status of the group license assignment to all members of the group. Default value is false. Read-only. Possible values: QueuedForProcessing, ProcessingInProgress, and ProcessingComplete.Returned only on $select. Read-only.
     */
    @SerializedName(value = "licenseProcessingState", alternate = {"LicenseProcessingState"})
    @Expose
	@Nullable
    public LicenseProcessingState licenseProcessingState;

    /**
     * The Mail.
     * The SMTP address for the group, for example, 'serviceadmins@contoso.onmicrosoft.com'. Returned by default. Read-only. Supports $filter.
     */
    @SerializedName(value = "mail", alternate = {"Mail"})
    @Expose
	@Nullable
    public String mail;

    /**
     * The Mail Enabled.
     * Specifies whether the group is mail-enabled. Returned by default.
     */
    @SerializedName(value = "mailEnabled", alternate = {"MailEnabled"})
    @Expose
	@Nullable
    public Boolean mailEnabled;

    /**
     * The Mail Nickname.
     * 
     */
    @SerializedName(value = "mailNickname", alternate = {"MailNickname"})
    @Expose
	@Nullable
    public String mailNickname;

    /**
     * The Membership Rule.
     * The rule that determines members for this group if the group is a dynamic group (groupTypes contains DynamicMembership). For more information about the syntax of the membership rule, see Membership Rules syntax. Returned by default.
     */
    @SerializedName(value = "membershipRule", alternate = {"MembershipRule"})
    @Expose
	@Nullable
    public String membershipRule;

    /**
     * The Membership Rule Processing State.
     * Indicates whether the dynamic membership processing is on or paused. Possible values are 'On' or 'Paused'. Returned by default.
     */
    @SerializedName(value = "membershipRuleProcessingState", alternate = {"MembershipRuleProcessingState"})
    @Expose
	@Nullable
    public String membershipRuleProcessingState;

    /**
     * The On Premises Domain Name.
     * 
     */
    @SerializedName(value = "onPremisesDomainName", alternate = {"OnPremisesDomainName"})
    @Expose
	@Nullable
    public String onPremisesDomainName;

    /**
     * The On Premises Last Sync Date Time.
     * 
     */
    @SerializedName(value = "onPremisesLastSyncDateTime", alternate = {"OnPremisesLastSyncDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime onPremisesLastSyncDateTime;

    /**
     * The On Premises Net Bios Name.
     * 
     */
    @SerializedName(value = "onPremisesNetBiosName", alternate = {"OnPremisesNetBiosName"})
    @Expose
	@Nullable
    public String onPremisesNetBiosName;

    /**
     * The On Premises Provisioning Errors.
     * 
     */
    @SerializedName(value = "onPremisesProvisioningErrors", alternate = {"OnPremisesProvisioningErrors"})
    @Expose
	@Nullable
    public java.util.List<OnPremisesProvisioningError> onPremisesProvisioningErrors;

    /**
     * The On Premises Sam Account Name.
     * Contains the on-premises SAM account name synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect.Returned by default. Read-only.
     */
    @SerializedName(value = "onPremisesSamAccountName", alternate = {"OnPremisesSamAccountName"})
    @Expose
	@Nullable
    public String onPremisesSamAccountName;

    /**
     * The On Premises Security Identifier.
     * Contains the on-premises security identifier (SID) for the group that was synchronized from on-premises to the cloud. Returned by default. Read-only.
     */
    @SerializedName(value = "onPremisesSecurityIdentifier", alternate = {"OnPremisesSecurityIdentifier"})
    @Expose
	@Nullable
    public String onPremisesSecurityIdentifier;

    /**
     * The On Premises Sync Enabled.
     * true if this group is synced from an on-premises directory; false if this group was originally synced from an on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory (default). Returned by default. Read-only. Supports $filter.
     */
    @SerializedName(value = "onPremisesSyncEnabled", alternate = {"OnPremisesSyncEnabled"})
    @Expose
	@Nullable
    public Boolean onPremisesSyncEnabled;

    /**
     * The Preferred Data Location.
     * The preferred data location for the group. For more information, see  OneDrive Online Multi-Geo. Returned by default.
     */
    @SerializedName(value = "preferredDataLocation", alternate = {"PreferredDataLocation"})
    @Expose
	@Nullable
    public String preferredDataLocation;

    /**
     * The Preferred Language.
     * The preferred language for an Microsoft 365 group. Should follow ISO 639-1 Code; for example 'en-US'. Returned by default.
     */
    @SerializedName(value = "preferredLanguage", alternate = {"PreferredLanguage"})
    @Expose
	@Nullable
    public String preferredLanguage;

    /**
     * The Proxy Addresses.
     * Email addresses for the group that direct to the same group mailbox. For example: ['SMTP: bob@contoso.com', 'smtp: bob@sales.contoso.com']. The any operator is required to filter expressions on multi-valued properties. Returned by default. Read-only. Not nullable. Supports $filter.
     */
    @SerializedName(value = "proxyAddresses", alternate = {"ProxyAddresses"})
    @Expose
	@Nullable
    public java.util.List<String> proxyAddresses;

    /**
     * The Renewed Date Time.
     * Timestamp of when the group was last renewed. This cannot be modified directly and is only updated via the renew service action. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only.
     */
    @SerializedName(value = "renewedDateTime", alternate = {"RenewedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime renewedDateTime;

    /**
     * The Security Enabled.
     * Specifies whether the group is a security group. Returned by default. Supports $filter.
     */
    @SerializedName(value = "securityEnabled", alternate = {"SecurityEnabled"})
    @Expose
	@Nullable
    public Boolean securityEnabled;

    /**
     * The Security Identifier.
     * Security identifier of the group, used in Windows scenarios. Returned by default.
     */
    @SerializedName(value = "securityIdentifier", alternate = {"SecurityIdentifier"})
    @Expose
	@Nullable
    public String securityIdentifier;

    /**
     * The Theme.
     * Specifies an Microsoft 365 group's color theme. Possible values are Teal, Purple, Green, Blue, Pink, Orange or Red. Returned by default.
     */
    @SerializedName(value = "theme", alternate = {"Theme"})
    @Expose
	@Nullable
    public String theme;

    /**
     * The Visibility.
     * Specifies the visibility of a Microsoft 365 group. Possible values are: Private, Public, or Hiddenmembership; blank values are treated as public.  See group visibility options to learn more.Visibility can be set only when a group is created; it is not editable.Visibility is supported only for unified groups; it is not supported for security groups. Returned by default.
     */
    @SerializedName(value = "visibility", alternate = {"Visibility"})
    @Expose
	@Nullable
    public String visibility;

    /**
     * The Allow External Senders.
     * Indicates if people external to the organization can send messages to the group. Default value is false. Returned only on $select.
     */
    @SerializedName(value = "allowExternalSenders", alternate = {"AllowExternalSenders"})
    @Expose
	@Nullable
    public Boolean allowExternalSenders;

    /**
     * The Auto Subscribe New Members.
     * Indicates if new members added to the group will be auto-subscribed to receive email notifications. You can set this property in a PATCH request for the group; do not set it in the initial POST request that creates the group. Default value is false. Returned only on $select.
     */
    @SerializedName(value = "autoSubscribeNewMembers", alternate = {"AutoSubscribeNewMembers"})
    @Expose
	@Nullable
    public Boolean autoSubscribeNewMembers;

    /**
     * The Hide From Address Lists.
     * True if the group is not displayed in certain parts of the Outlook UI: the Address Book, address lists for selecting message recipients, and the Browse Groups dialog for searching groups; otherwise, false. Default value is false. Returned only on $select.
     */
    @SerializedName(value = "hideFromAddressLists", alternate = {"HideFromAddressLists"})
    @Expose
	@Nullable
    public Boolean hideFromAddressLists;

    /**
     * The Hide From Outlook Clients.
     * True if the group is not displayed in Outlook clients, such as Outlook for Windows and Outlook on the web; otherwise, false. Default value is false. Returned only on $select.
     */
    @SerializedName(value = "hideFromOutlookClients", alternate = {"HideFromOutlookClients"})
    @Expose
	@Nullable
    public Boolean hideFromOutlookClients;

    /**
     * The Is Subscribed By Mail.
     * Indicates whether the signed-in user is subscribed to receive email conversations. Default value is true. Returned only on $select.
     */
    @SerializedName(value = "isSubscribedByMail", alternate = {"IsSubscribedByMail"})
    @Expose
	@Nullable
    public Boolean isSubscribedByMail;

    /**
     * The Unseen Count.
     * Count of conversations that have received new posts since the signed-in user last visited the group. Returned only on $select.
     */
    @SerializedName(value = "unseenCount", alternate = {"UnseenCount"})
    @Expose
	@Nullable
    public Integer unseenCount;

    /**
     * The Is Archived.
     * 
     */
    @SerializedName(value = "isArchived", alternate = {"IsArchived"})
    @Expose
	@Nullable
    public Boolean isArchived;

    /**
     * The App Role Assignments.
     * 
     */
    @SerializedName(value = "appRoleAssignments", alternate = {"AppRoleAssignments"})
    @Expose
	@Nullable
    public AppRoleAssignmentCollectionPage appRoleAssignments;

    /**
     * The Created On Behalf Of.
     * The user (or application) that created the group. NOTE: This is not set if the user is an administrator. Read-only.
     */
    @SerializedName(value = "createdOnBehalfOf", alternate = {"CreatedOnBehalfOf"})
    @Expose
	@Nullable
    public DirectoryObject createdOnBehalfOf;

    /**
     * The Member Of.
     * Groups that this group is a member of. HTTP Methods: GET (supported for all groups). Read-only. Nullable.
     */
	@Nullable
    public DirectoryObjectCollectionPage memberOf;

    /**
     * The Members.
     * Users and groups that are members of this group. HTTP Methods: GET (supported for all groups), POST (supported for Microsoft 365 groups, security groups and mail-enabled security groups), DELETE (supported for Microsoft 365 groups and security groups) Nullable.
     */
	@Nullable
    public DirectoryObjectCollectionPage members;

    /**
     * The Members With License Errors.
     * A list of group members with license errors from this group-based license assignment. Read-only.
     */
	@Nullable
    public DirectoryObjectCollectionPage membersWithLicenseErrors;

    /**
     * The Owners.
     * The owners of the group. The owners are a set of non-admin users who are allowed to modify this object. Limited to 100 owners. HTTP Methods: GET (supported for all groups), POST (supported for Microsoft 365 groups, security groups and mail-enabled security groups), DELETE (supported for Microsoft 365 groups and security groups). Nullable.
     */
	@Nullable
    public DirectoryObjectCollectionPage owners;

    /**
     * The Permission Grants.
     * 
     */
    @SerializedName(value = "permissionGrants", alternate = {"PermissionGrants"})
    @Expose
	@Nullable
    public ResourceSpecificPermissionGrantCollectionPage permissionGrants;

    /**
     * The Settings.
     * Read-only. Nullable.
     */
    @SerializedName(value = "settings", alternate = {"Settings"})
    @Expose
	@Nullable
    public GroupSettingCollectionPage settings;

    /**
     * The Transitive Member Of.
     * 
     */
	@Nullable
    public DirectoryObjectCollectionPage transitiveMemberOf;

    /**
     * The Transitive Members.
     * 
     */
	@Nullable
    public DirectoryObjectCollectionPage transitiveMembers;

    /**
     * The Accepted Senders.
     * The list of users or groups that are allowed to create post's or calendar events in this group. If this list is non-empty then only users or groups listed here are allowed to post.
     */
    @SerializedName(value = "acceptedSenders", alternate = {"AcceptedSenders"})
    @Expose
	@Nullable
    public DirectoryObjectCollectionPage acceptedSenders;

    /**
     * The Calendar.
     * The group's calendar. Read-only.
     */
    @SerializedName(value = "calendar", alternate = {"Calendar"})
    @Expose
	@Nullable
    public Calendar calendar;

    /**
     * The Calendar View.
     * The calendar view for the calendar. Read-only.
     */
    @SerializedName(value = "calendarView", alternate = {"CalendarView"})
    @Expose
	@Nullable
    public EventCollectionPage calendarView;

    /**
     * The Conversations.
     * The group's conversations.
     */
    @SerializedName(value = "conversations", alternate = {"Conversations"})
    @Expose
	@Nullable
    public ConversationCollectionPage conversations;

    /**
     * The Events.
     * The group's calendar events.
     */
    @SerializedName(value = "events", alternate = {"Events"})
    @Expose
	@Nullable
    public EventCollectionPage events;

    /**
     * The Photo.
     * The group's profile photo
     */
    @SerializedName(value = "photo", alternate = {"Photo"})
    @Expose
	@Nullable
    public ProfilePhoto photo;

    /**
     * The Photos.
     * The profile photos owned by the group. Read-only. Nullable.
     */
    @SerializedName(value = "photos", alternate = {"Photos"})
    @Expose
	@Nullable
    public ProfilePhotoCollectionPage photos;

    /**
     * The Rejected Senders.
     * The list of users or groups that are not allowed to create posts or calendar events in this group. Nullable
     */
    @SerializedName(value = "rejectedSenders", alternate = {"RejectedSenders"})
    @Expose
	@Nullable
    public DirectoryObjectCollectionPage rejectedSenders;

    /**
     * The Threads.
     * The group's conversation threads. Nullable.
     */
    @SerializedName(value = "threads", alternate = {"Threads"})
    @Expose
	@Nullable
    public ConversationThreadCollectionPage threads;

    /**
     * The Drive.
     * The group's default drive. Read-only.
     */
    @SerializedName(value = "drive", alternate = {"Drive"})
    @Expose
	@Nullable
    public Drive drive;

    /**
     * The Drives.
     * The group's drives. Read-only.
     */
    @SerializedName(value = "drives", alternate = {"Drives"})
    @Expose
	@Nullable
    public DriveCollectionPage drives;

    /**
     * The Sites.
     * The list of SharePoint sites in this group. Access the default site with /sites/root.
     */
    @SerializedName(value = "sites", alternate = {"Sites"})
    @Expose
	@Nullable
    public SiteCollectionPage sites;

    /**
     * The Extensions.
     * The collection of open extensions defined for the group. Read-only. Nullable.
     */
    @SerializedName(value = "extensions", alternate = {"Extensions"})
    @Expose
	@Nullable
    public ExtensionCollectionPage extensions;

    /**
     * The Group Lifecycle Policies.
     * The collection of lifecycle policies for this group. Read-only. Nullable.
     */
    @SerializedName(value = "groupLifecyclePolicies", alternate = {"GroupLifecyclePolicies"})
    @Expose
	@Nullable
    public GroupLifecyclePolicyCollectionPage groupLifecyclePolicies;

    /**
     * The Planner.
     * Entry-point to Planner resource that might exist for a Unified Group.
     */
    @SerializedName(value = "planner", alternate = {"Planner"})
    @Expose
	@Nullable
    public PlannerGroup planner;

    /**
     * The Onenote.
     * Read-only.
     */
    @SerializedName(value = "onenote", alternate = {"Onenote"})
    @Expose
	@Nullable
    public Onenote onenote;

    /**
     * The Team.
     * 
     */
    @SerializedName(value = "team", alternate = {"Team"})
    @Expose
	@Nullable
    public Team team;


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


        if (json.has("appRoleAssignments")) {
            appRoleAssignments = serializer.deserializeObject(json.get("appRoleAssignments").toString(), AppRoleAssignmentCollectionPage.class);
        }

        if (json.has("memberOf")) {
            memberOf = serializer.deserializeObject(json.get("memberOf").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("members")) {
            members = serializer.deserializeObject(json.get("members").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("membersWithLicenseErrors")) {
            membersWithLicenseErrors = serializer.deserializeObject(json.get("membersWithLicenseErrors").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("owners")) {
            owners = serializer.deserializeObject(json.get("owners").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("permissionGrants")) {
            permissionGrants = serializer.deserializeObject(json.get("permissionGrants").toString(), ResourceSpecificPermissionGrantCollectionPage.class);
        }

        if (json.has("settings")) {
            settings = serializer.deserializeObject(json.get("settings").toString(), GroupSettingCollectionPage.class);
        }

        if (json.has("transitiveMemberOf")) {
            transitiveMemberOf = serializer.deserializeObject(json.get("transitiveMemberOf").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("transitiveMembers")) {
            transitiveMembers = serializer.deserializeObject(json.get("transitiveMembers").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("acceptedSenders")) {
            acceptedSenders = serializer.deserializeObject(json.get("acceptedSenders").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("calendarView")) {
            calendarView = serializer.deserializeObject(json.get("calendarView").toString(), EventCollectionPage.class);
        }

        if (json.has("conversations")) {
            conversations = serializer.deserializeObject(json.get("conversations").toString(), ConversationCollectionPage.class);
        }

        if (json.has("events")) {
            events = serializer.deserializeObject(json.get("events").toString(), EventCollectionPage.class);
        }

        if (json.has("photos")) {
            photos = serializer.deserializeObject(json.get("photos").toString(), ProfilePhotoCollectionPage.class);
        }

        if (json.has("rejectedSenders")) {
            rejectedSenders = serializer.deserializeObject(json.get("rejectedSenders").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("threads")) {
            threads = serializer.deserializeObject(json.get("threads").toString(), ConversationThreadCollectionPage.class);
        }

        if (json.has("drives")) {
            drives = serializer.deserializeObject(json.get("drives").toString(), DriveCollectionPage.class);
        }

        if (json.has("sites")) {
            sites = serializer.deserializeObject(json.get("sites").toString(), SiteCollectionPage.class);
        }

        if (json.has("extensions")) {
            extensions = serializer.deserializeObject(json.get("extensions").toString(), ExtensionCollectionPage.class);
        }

        if (json.has("groupLifecyclePolicies")) {
            groupLifecyclePolicies = serializer.deserializeObject(json.get("groupLifecyclePolicies").toString(), GroupLifecyclePolicyCollectionPage.class);
        }
    }
}