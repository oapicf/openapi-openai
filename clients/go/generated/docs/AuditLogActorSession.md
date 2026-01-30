# AuditLogActorSession

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**User** | Pointer to [**AuditLogActorUser**](AuditLogActorUser.md) |  | [optional] 
**IpAddress** | Pointer to **string** | The IP address from which the action was performed. | [optional] 

## Methods

### NewAuditLogActorSession

`func NewAuditLogActorSession() *AuditLogActorSession`

NewAuditLogActorSession instantiates a new AuditLogActorSession object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuditLogActorSessionWithDefaults

`func NewAuditLogActorSessionWithDefaults() *AuditLogActorSession`

NewAuditLogActorSessionWithDefaults instantiates a new AuditLogActorSession object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUser

`func (o *AuditLogActorSession) GetUser() AuditLogActorUser`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *AuditLogActorSession) GetUserOk() (*AuditLogActorUser, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *AuditLogActorSession) SetUser(v AuditLogActorUser)`

SetUser sets User field to given value.

### HasUser

`func (o *AuditLogActorSession) HasUser() bool`

HasUser returns a boolean if a field has been set.

### GetIpAddress

`func (o *AuditLogActorSession) GetIpAddress() string`

GetIpAddress returns the IpAddress field if non-nil, zero value otherwise.

### GetIpAddressOk

`func (o *AuditLogActorSession) GetIpAddressOk() (*string, bool)`

GetIpAddressOk returns a tuple with the IpAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIpAddress

`func (o *AuditLogActorSession) SetIpAddress(v string)`

SetIpAddress sets IpAddress field to given value.

### HasIpAddress

`func (o *AuditLogActorSession) HasIpAddress() bool`

HasIpAddress returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


