# AuditLog

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The ID of this log. | 
**Type** | [**AuditLogEventType**](AuditLogEventType.md) |  | 
**EffectiveAt** | **int32** | The Unix timestamp (in seconds) of the event. | 
**Project** | Pointer to [**AuditLogProject**](AuditLogProject.md) |  | [optional] 
**Actor** | [**AuditLogActor**](AuditLogActor.md) |  | 
**ApiKeyCreated** | Pointer to [**AuditLogApiKeyCreated**](AuditLogApiKeyCreated.md) |  | [optional] 
**ApiKeyUpdated** | Pointer to [**AuditLogApiKeyUpdated**](AuditLogApiKeyUpdated.md) |  | [optional] 
**ApiKeyDeleted** | Pointer to [**AuditLogApiKeyDeleted**](AuditLogApiKeyDeleted.md) |  | [optional] 
**InviteSent** | Pointer to [**AuditLogInviteSent**](AuditLogInviteSent.md) |  | [optional] 
**InviteAccepted** | Pointer to [**AuditLogInviteAccepted**](AuditLogInviteAccepted.md) |  | [optional] 
**InviteDeleted** | Pointer to [**AuditLogInviteAccepted**](AuditLogInviteAccepted.md) |  | [optional] 
**LoginFailed** | Pointer to [**AuditLogLoginFailed**](AuditLogLoginFailed.md) |  | [optional] 
**LogoutFailed** | Pointer to [**AuditLogLoginFailed**](AuditLogLoginFailed.md) |  | [optional] 
**OrganizationUpdated** | Pointer to [**AuditLogOrganizationUpdated**](AuditLogOrganizationUpdated.md) |  | [optional] 
**ProjectCreated** | Pointer to [**AuditLogProjectCreated**](AuditLogProjectCreated.md) |  | [optional] 
**ProjectUpdated** | Pointer to [**AuditLogProjectUpdated**](AuditLogProjectUpdated.md) |  | [optional] 
**ProjectArchived** | Pointer to [**AuditLogProjectArchived**](AuditLogProjectArchived.md) |  | [optional] 
**RateLimitUpdated** | Pointer to [**AuditLogRateLimitUpdated**](AuditLogRateLimitUpdated.md) |  | [optional] 
**RateLimitDeleted** | Pointer to [**AuditLogRateLimitDeleted**](AuditLogRateLimitDeleted.md) |  | [optional] 
**ServiceAccountCreated** | Pointer to [**AuditLogServiceAccountCreated**](AuditLogServiceAccountCreated.md) |  | [optional] 
**ServiceAccountUpdated** | Pointer to [**AuditLogServiceAccountUpdated**](AuditLogServiceAccountUpdated.md) |  | [optional] 
**ServiceAccountDeleted** | Pointer to [**AuditLogServiceAccountDeleted**](AuditLogServiceAccountDeleted.md) |  | [optional] 
**UserAdded** | Pointer to [**AuditLogUserAdded**](AuditLogUserAdded.md) |  | [optional] 
**UserUpdated** | Pointer to [**AuditLogUserUpdated**](AuditLogUserUpdated.md) |  | [optional] 
**UserDeleted** | Pointer to [**AuditLogUserDeleted**](AuditLogUserDeleted.md) |  | [optional] 

## Methods

### NewAuditLog

`func NewAuditLog(id string, type_ AuditLogEventType, effectiveAt int32, actor AuditLogActor, ) *AuditLog`

NewAuditLog instantiates a new AuditLog object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuditLogWithDefaults

`func NewAuditLogWithDefaults() *AuditLog`

NewAuditLogWithDefaults instantiates a new AuditLog object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *AuditLog) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AuditLog) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AuditLog) SetId(v string)`

SetId sets Id field to given value.


### GetType

`func (o *AuditLog) GetType() AuditLogEventType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *AuditLog) GetTypeOk() (*AuditLogEventType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *AuditLog) SetType(v AuditLogEventType)`

SetType sets Type field to given value.


### GetEffectiveAt

`func (o *AuditLog) GetEffectiveAt() int32`

GetEffectiveAt returns the EffectiveAt field if non-nil, zero value otherwise.

### GetEffectiveAtOk

`func (o *AuditLog) GetEffectiveAtOk() (*int32, bool)`

GetEffectiveAtOk returns a tuple with the EffectiveAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectiveAt

`func (o *AuditLog) SetEffectiveAt(v int32)`

SetEffectiveAt sets EffectiveAt field to given value.


### GetProject

`func (o *AuditLog) GetProject() AuditLogProject`

GetProject returns the Project field if non-nil, zero value otherwise.

### GetProjectOk

`func (o *AuditLog) GetProjectOk() (*AuditLogProject, bool)`

GetProjectOk returns a tuple with the Project field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProject

`func (o *AuditLog) SetProject(v AuditLogProject)`

SetProject sets Project field to given value.

### HasProject

`func (o *AuditLog) HasProject() bool`

HasProject returns a boolean if a field has been set.

### GetActor

`func (o *AuditLog) GetActor() AuditLogActor`

GetActor returns the Actor field if non-nil, zero value otherwise.

### GetActorOk

`func (o *AuditLog) GetActorOk() (*AuditLogActor, bool)`

GetActorOk returns a tuple with the Actor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActor

`func (o *AuditLog) SetActor(v AuditLogActor)`

SetActor sets Actor field to given value.


### GetApiKeyCreated

`func (o *AuditLog) GetApiKeyCreated() AuditLogApiKeyCreated`

GetApiKeyCreated returns the ApiKeyCreated field if non-nil, zero value otherwise.

### GetApiKeyCreatedOk

`func (o *AuditLog) GetApiKeyCreatedOk() (*AuditLogApiKeyCreated, bool)`

GetApiKeyCreatedOk returns a tuple with the ApiKeyCreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApiKeyCreated

`func (o *AuditLog) SetApiKeyCreated(v AuditLogApiKeyCreated)`

SetApiKeyCreated sets ApiKeyCreated field to given value.

### HasApiKeyCreated

`func (o *AuditLog) HasApiKeyCreated() bool`

HasApiKeyCreated returns a boolean if a field has been set.

### GetApiKeyUpdated

`func (o *AuditLog) GetApiKeyUpdated() AuditLogApiKeyUpdated`

GetApiKeyUpdated returns the ApiKeyUpdated field if non-nil, zero value otherwise.

### GetApiKeyUpdatedOk

`func (o *AuditLog) GetApiKeyUpdatedOk() (*AuditLogApiKeyUpdated, bool)`

GetApiKeyUpdatedOk returns a tuple with the ApiKeyUpdated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApiKeyUpdated

`func (o *AuditLog) SetApiKeyUpdated(v AuditLogApiKeyUpdated)`

SetApiKeyUpdated sets ApiKeyUpdated field to given value.

### HasApiKeyUpdated

`func (o *AuditLog) HasApiKeyUpdated() bool`

HasApiKeyUpdated returns a boolean if a field has been set.

### GetApiKeyDeleted

`func (o *AuditLog) GetApiKeyDeleted() AuditLogApiKeyDeleted`

GetApiKeyDeleted returns the ApiKeyDeleted field if non-nil, zero value otherwise.

### GetApiKeyDeletedOk

`func (o *AuditLog) GetApiKeyDeletedOk() (*AuditLogApiKeyDeleted, bool)`

GetApiKeyDeletedOk returns a tuple with the ApiKeyDeleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApiKeyDeleted

`func (o *AuditLog) SetApiKeyDeleted(v AuditLogApiKeyDeleted)`

SetApiKeyDeleted sets ApiKeyDeleted field to given value.

### HasApiKeyDeleted

`func (o *AuditLog) HasApiKeyDeleted() bool`

HasApiKeyDeleted returns a boolean if a field has been set.

### GetInviteSent

`func (o *AuditLog) GetInviteSent() AuditLogInviteSent`

GetInviteSent returns the InviteSent field if non-nil, zero value otherwise.

### GetInviteSentOk

`func (o *AuditLog) GetInviteSentOk() (*AuditLogInviteSent, bool)`

GetInviteSentOk returns a tuple with the InviteSent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInviteSent

`func (o *AuditLog) SetInviteSent(v AuditLogInviteSent)`

SetInviteSent sets InviteSent field to given value.

### HasInviteSent

`func (o *AuditLog) HasInviteSent() bool`

HasInviteSent returns a boolean if a field has been set.

### GetInviteAccepted

`func (o *AuditLog) GetInviteAccepted() AuditLogInviteAccepted`

GetInviteAccepted returns the InviteAccepted field if non-nil, zero value otherwise.

### GetInviteAcceptedOk

`func (o *AuditLog) GetInviteAcceptedOk() (*AuditLogInviteAccepted, bool)`

GetInviteAcceptedOk returns a tuple with the InviteAccepted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInviteAccepted

`func (o *AuditLog) SetInviteAccepted(v AuditLogInviteAccepted)`

SetInviteAccepted sets InviteAccepted field to given value.

### HasInviteAccepted

`func (o *AuditLog) HasInviteAccepted() bool`

HasInviteAccepted returns a boolean if a field has been set.

### GetInviteDeleted

`func (o *AuditLog) GetInviteDeleted() AuditLogInviteAccepted`

GetInviteDeleted returns the InviteDeleted field if non-nil, zero value otherwise.

### GetInviteDeletedOk

`func (o *AuditLog) GetInviteDeletedOk() (*AuditLogInviteAccepted, bool)`

GetInviteDeletedOk returns a tuple with the InviteDeleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInviteDeleted

`func (o *AuditLog) SetInviteDeleted(v AuditLogInviteAccepted)`

SetInviteDeleted sets InviteDeleted field to given value.

### HasInviteDeleted

`func (o *AuditLog) HasInviteDeleted() bool`

HasInviteDeleted returns a boolean if a field has been set.

### GetLoginFailed

`func (o *AuditLog) GetLoginFailed() AuditLogLoginFailed`

GetLoginFailed returns the LoginFailed field if non-nil, zero value otherwise.

### GetLoginFailedOk

`func (o *AuditLog) GetLoginFailedOk() (*AuditLogLoginFailed, bool)`

GetLoginFailedOk returns a tuple with the LoginFailed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLoginFailed

`func (o *AuditLog) SetLoginFailed(v AuditLogLoginFailed)`

SetLoginFailed sets LoginFailed field to given value.

### HasLoginFailed

`func (o *AuditLog) HasLoginFailed() bool`

HasLoginFailed returns a boolean if a field has been set.

### GetLogoutFailed

`func (o *AuditLog) GetLogoutFailed() AuditLogLoginFailed`

GetLogoutFailed returns the LogoutFailed field if non-nil, zero value otherwise.

### GetLogoutFailedOk

`func (o *AuditLog) GetLogoutFailedOk() (*AuditLogLoginFailed, bool)`

GetLogoutFailedOk returns a tuple with the LogoutFailed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogoutFailed

`func (o *AuditLog) SetLogoutFailed(v AuditLogLoginFailed)`

SetLogoutFailed sets LogoutFailed field to given value.

### HasLogoutFailed

`func (o *AuditLog) HasLogoutFailed() bool`

HasLogoutFailed returns a boolean if a field has been set.

### GetOrganizationUpdated

`func (o *AuditLog) GetOrganizationUpdated() AuditLogOrganizationUpdated`

GetOrganizationUpdated returns the OrganizationUpdated field if non-nil, zero value otherwise.

### GetOrganizationUpdatedOk

`func (o *AuditLog) GetOrganizationUpdatedOk() (*AuditLogOrganizationUpdated, bool)`

GetOrganizationUpdatedOk returns a tuple with the OrganizationUpdated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrganizationUpdated

`func (o *AuditLog) SetOrganizationUpdated(v AuditLogOrganizationUpdated)`

SetOrganizationUpdated sets OrganizationUpdated field to given value.

### HasOrganizationUpdated

`func (o *AuditLog) HasOrganizationUpdated() bool`

HasOrganizationUpdated returns a boolean if a field has been set.

### GetProjectCreated

`func (o *AuditLog) GetProjectCreated() AuditLogProjectCreated`

GetProjectCreated returns the ProjectCreated field if non-nil, zero value otherwise.

### GetProjectCreatedOk

`func (o *AuditLog) GetProjectCreatedOk() (*AuditLogProjectCreated, bool)`

GetProjectCreatedOk returns a tuple with the ProjectCreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProjectCreated

`func (o *AuditLog) SetProjectCreated(v AuditLogProjectCreated)`

SetProjectCreated sets ProjectCreated field to given value.

### HasProjectCreated

`func (o *AuditLog) HasProjectCreated() bool`

HasProjectCreated returns a boolean if a field has been set.

### GetProjectUpdated

`func (o *AuditLog) GetProjectUpdated() AuditLogProjectUpdated`

GetProjectUpdated returns the ProjectUpdated field if non-nil, zero value otherwise.

### GetProjectUpdatedOk

`func (o *AuditLog) GetProjectUpdatedOk() (*AuditLogProjectUpdated, bool)`

GetProjectUpdatedOk returns a tuple with the ProjectUpdated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProjectUpdated

`func (o *AuditLog) SetProjectUpdated(v AuditLogProjectUpdated)`

SetProjectUpdated sets ProjectUpdated field to given value.

### HasProjectUpdated

`func (o *AuditLog) HasProjectUpdated() bool`

HasProjectUpdated returns a boolean if a field has been set.

### GetProjectArchived

`func (o *AuditLog) GetProjectArchived() AuditLogProjectArchived`

GetProjectArchived returns the ProjectArchived field if non-nil, zero value otherwise.

### GetProjectArchivedOk

`func (o *AuditLog) GetProjectArchivedOk() (*AuditLogProjectArchived, bool)`

GetProjectArchivedOk returns a tuple with the ProjectArchived field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProjectArchived

`func (o *AuditLog) SetProjectArchived(v AuditLogProjectArchived)`

SetProjectArchived sets ProjectArchived field to given value.

### HasProjectArchived

`func (o *AuditLog) HasProjectArchived() bool`

HasProjectArchived returns a boolean if a field has been set.

### GetRateLimitUpdated

`func (o *AuditLog) GetRateLimitUpdated() AuditLogRateLimitUpdated`

GetRateLimitUpdated returns the RateLimitUpdated field if non-nil, zero value otherwise.

### GetRateLimitUpdatedOk

`func (o *AuditLog) GetRateLimitUpdatedOk() (*AuditLogRateLimitUpdated, bool)`

GetRateLimitUpdatedOk returns a tuple with the RateLimitUpdated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRateLimitUpdated

`func (o *AuditLog) SetRateLimitUpdated(v AuditLogRateLimitUpdated)`

SetRateLimitUpdated sets RateLimitUpdated field to given value.

### HasRateLimitUpdated

`func (o *AuditLog) HasRateLimitUpdated() bool`

HasRateLimitUpdated returns a boolean if a field has been set.

### GetRateLimitDeleted

`func (o *AuditLog) GetRateLimitDeleted() AuditLogRateLimitDeleted`

GetRateLimitDeleted returns the RateLimitDeleted field if non-nil, zero value otherwise.

### GetRateLimitDeletedOk

`func (o *AuditLog) GetRateLimitDeletedOk() (*AuditLogRateLimitDeleted, bool)`

GetRateLimitDeletedOk returns a tuple with the RateLimitDeleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRateLimitDeleted

`func (o *AuditLog) SetRateLimitDeleted(v AuditLogRateLimitDeleted)`

SetRateLimitDeleted sets RateLimitDeleted field to given value.

### HasRateLimitDeleted

`func (o *AuditLog) HasRateLimitDeleted() bool`

HasRateLimitDeleted returns a boolean if a field has been set.

### GetServiceAccountCreated

`func (o *AuditLog) GetServiceAccountCreated() AuditLogServiceAccountCreated`

GetServiceAccountCreated returns the ServiceAccountCreated field if non-nil, zero value otherwise.

### GetServiceAccountCreatedOk

`func (o *AuditLog) GetServiceAccountCreatedOk() (*AuditLogServiceAccountCreated, bool)`

GetServiceAccountCreatedOk returns a tuple with the ServiceAccountCreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServiceAccountCreated

`func (o *AuditLog) SetServiceAccountCreated(v AuditLogServiceAccountCreated)`

SetServiceAccountCreated sets ServiceAccountCreated field to given value.

### HasServiceAccountCreated

`func (o *AuditLog) HasServiceAccountCreated() bool`

HasServiceAccountCreated returns a boolean if a field has been set.

### GetServiceAccountUpdated

`func (o *AuditLog) GetServiceAccountUpdated() AuditLogServiceAccountUpdated`

GetServiceAccountUpdated returns the ServiceAccountUpdated field if non-nil, zero value otherwise.

### GetServiceAccountUpdatedOk

`func (o *AuditLog) GetServiceAccountUpdatedOk() (*AuditLogServiceAccountUpdated, bool)`

GetServiceAccountUpdatedOk returns a tuple with the ServiceAccountUpdated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServiceAccountUpdated

`func (o *AuditLog) SetServiceAccountUpdated(v AuditLogServiceAccountUpdated)`

SetServiceAccountUpdated sets ServiceAccountUpdated field to given value.

### HasServiceAccountUpdated

`func (o *AuditLog) HasServiceAccountUpdated() bool`

HasServiceAccountUpdated returns a boolean if a field has been set.

### GetServiceAccountDeleted

`func (o *AuditLog) GetServiceAccountDeleted() AuditLogServiceAccountDeleted`

GetServiceAccountDeleted returns the ServiceAccountDeleted field if non-nil, zero value otherwise.

### GetServiceAccountDeletedOk

`func (o *AuditLog) GetServiceAccountDeletedOk() (*AuditLogServiceAccountDeleted, bool)`

GetServiceAccountDeletedOk returns a tuple with the ServiceAccountDeleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServiceAccountDeleted

`func (o *AuditLog) SetServiceAccountDeleted(v AuditLogServiceAccountDeleted)`

SetServiceAccountDeleted sets ServiceAccountDeleted field to given value.

### HasServiceAccountDeleted

`func (o *AuditLog) HasServiceAccountDeleted() bool`

HasServiceAccountDeleted returns a boolean if a field has been set.

### GetUserAdded

`func (o *AuditLog) GetUserAdded() AuditLogUserAdded`

GetUserAdded returns the UserAdded field if non-nil, zero value otherwise.

### GetUserAddedOk

`func (o *AuditLog) GetUserAddedOk() (*AuditLogUserAdded, bool)`

GetUserAddedOk returns a tuple with the UserAdded field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserAdded

`func (o *AuditLog) SetUserAdded(v AuditLogUserAdded)`

SetUserAdded sets UserAdded field to given value.

### HasUserAdded

`func (o *AuditLog) HasUserAdded() bool`

HasUserAdded returns a boolean if a field has been set.

### GetUserUpdated

`func (o *AuditLog) GetUserUpdated() AuditLogUserUpdated`

GetUserUpdated returns the UserUpdated field if non-nil, zero value otherwise.

### GetUserUpdatedOk

`func (o *AuditLog) GetUserUpdatedOk() (*AuditLogUserUpdated, bool)`

GetUserUpdatedOk returns a tuple with the UserUpdated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserUpdated

`func (o *AuditLog) SetUserUpdated(v AuditLogUserUpdated)`

SetUserUpdated sets UserUpdated field to given value.

### HasUserUpdated

`func (o *AuditLog) HasUserUpdated() bool`

HasUserUpdated returns a boolean if a field has been set.

### GetUserDeleted

`func (o *AuditLog) GetUserDeleted() AuditLogUserDeleted`

GetUserDeleted returns the UserDeleted field if non-nil, zero value otherwise.

### GetUserDeletedOk

`func (o *AuditLog) GetUserDeletedOk() (*AuditLogUserDeleted, bool)`

GetUserDeletedOk returns a tuple with the UserDeleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserDeleted

`func (o *AuditLog) SetUserDeleted(v AuditLogUserDeleted)`

SetUserDeleted sets UserDeleted field to given value.

### HasUserDeleted

`func (o *AuditLog) HasUserDeleted() bool`

HasUserDeleted returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


