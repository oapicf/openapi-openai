# AuditLogActor

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | Pointer to **string** | The type of actor. Is either &#x60;session&#x60; or &#x60;api_key&#x60;. | [optional] 
**Session** | Pointer to [**AuditLogActorSession**](AuditLogActorSession.md) |  | [optional] 
**ApiKey** | Pointer to [**AuditLogActorApiKey**](AuditLogActorApiKey.md) |  | [optional] 

## Methods

### NewAuditLogActor

`func NewAuditLogActor() *AuditLogActor`

NewAuditLogActor instantiates a new AuditLogActor object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuditLogActorWithDefaults

`func NewAuditLogActorWithDefaults() *AuditLogActor`

NewAuditLogActorWithDefaults instantiates a new AuditLogActor object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *AuditLogActor) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *AuditLogActor) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *AuditLogActor) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *AuditLogActor) HasType() bool`

HasType returns a boolean if a field has been set.

### GetSession

`func (o *AuditLogActor) GetSession() AuditLogActorSession`

GetSession returns the Session field if non-nil, zero value otherwise.

### GetSessionOk

`func (o *AuditLogActor) GetSessionOk() (*AuditLogActorSession, bool)`

GetSessionOk returns a tuple with the Session field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSession

`func (o *AuditLogActor) SetSession(v AuditLogActorSession)`

SetSession sets Session field to given value.

### HasSession

`func (o *AuditLogActor) HasSession() bool`

HasSession returns a boolean if a field has been set.

### GetApiKey

`func (o *AuditLogActor) GetApiKey() AuditLogActorApiKey`

GetApiKey returns the ApiKey field if non-nil, zero value otherwise.

### GetApiKeyOk

`func (o *AuditLogActor) GetApiKeyOk() (*AuditLogActorApiKey, bool)`

GetApiKeyOk returns a tuple with the ApiKey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApiKey

`func (o *AuditLogActor) SetApiKey(v AuditLogActorApiKey)`

SetApiKey sets ApiKey field to given value.

### HasApiKey

`func (o *AuditLogActor) HasApiKey() bool`

HasApiKey returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


