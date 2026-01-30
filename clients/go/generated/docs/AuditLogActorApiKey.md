# AuditLogActorApiKey

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | The tracking id of the API key. | [optional] 
**Type** | Pointer to **string** | The type of API key. Can be either &#x60;user&#x60; or &#x60;service_account&#x60;. | [optional] 
**User** | Pointer to [**AuditLogActorUser**](AuditLogActorUser.md) |  | [optional] 
**ServiceAccount** | Pointer to [**AuditLogActorServiceAccount**](AuditLogActorServiceAccount.md) |  | [optional] 

## Methods

### NewAuditLogActorApiKey

`func NewAuditLogActorApiKey() *AuditLogActorApiKey`

NewAuditLogActorApiKey instantiates a new AuditLogActorApiKey object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuditLogActorApiKeyWithDefaults

`func NewAuditLogActorApiKeyWithDefaults() *AuditLogActorApiKey`

NewAuditLogActorApiKeyWithDefaults instantiates a new AuditLogActorApiKey object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *AuditLogActorApiKey) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AuditLogActorApiKey) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AuditLogActorApiKey) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *AuditLogActorApiKey) HasId() bool`

HasId returns a boolean if a field has been set.

### GetType

`func (o *AuditLogActorApiKey) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *AuditLogActorApiKey) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *AuditLogActorApiKey) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *AuditLogActorApiKey) HasType() bool`

HasType returns a boolean if a field has been set.

### GetUser

`func (o *AuditLogActorApiKey) GetUser() AuditLogActorUser`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *AuditLogActorApiKey) GetUserOk() (*AuditLogActorUser, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *AuditLogActorApiKey) SetUser(v AuditLogActorUser)`

SetUser sets User field to given value.

### HasUser

`func (o *AuditLogActorApiKey) HasUser() bool`

HasUser returns a boolean if a field has been set.

### GetServiceAccount

`func (o *AuditLogActorApiKey) GetServiceAccount() AuditLogActorServiceAccount`

GetServiceAccount returns the ServiceAccount field if non-nil, zero value otherwise.

### GetServiceAccountOk

`func (o *AuditLogActorApiKey) GetServiceAccountOk() (*AuditLogActorServiceAccount, bool)`

GetServiceAccountOk returns a tuple with the ServiceAccount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServiceAccount

`func (o *AuditLogActorApiKey) SetServiceAccount(v AuditLogActorServiceAccount)`

SetServiceAccount sets ServiceAccount field to given value.

### HasServiceAccount

`func (o *AuditLogActorApiKey) HasServiceAccount() bool`

HasServiceAccount returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


