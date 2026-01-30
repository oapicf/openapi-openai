# AuditLogApiKeyUpdated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | The tracking ID of the API key. | [optional] 
**ChangesRequested** | Pointer to [**AuditLogApiKeyUpdatedChangesRequested**](AuditLogApiKeyUpdatedChangesRequested.md) |  | [optional] 

## Methods

### NewAuditLogApiKeyUpdated

`func NewAuditLogApiKeyUpdated() *AuditLogApiKeyUpdated`

NewAuditLogApiKeyUpdated instantiates a new AuditLogApiKeyUpdated object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuditLogApiKeyUpdatedWithDefaults

`func NewAuditLogApiKeyUpdatedWithDefaults() *AuditLogApiKeyUpdated`

NewAuditLogApiKeyUpdatedWithDefaults instantiates a new AuditLogApiKeyUpdated object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *AuditLogApiKeyUpdated) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AuditLogApiKeyUpdated) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AuditLogApiKeyUpdated) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *AuditLogApiKeyUpdated) HasId() bool`

HasId returns a boolean if a field has been set.

### GetChangesRequested

`func (o *AuditLogApiKeyUpdated) GetChangesRequested() AuditLogApiKeyUpdatedChangesRequested`

GetChangesRequested returns the ChangesRequested field if non-nil, zero value otherwise.

### GetChangesRequestedOk

`func (o *AuditLogApiKeyUpdated) GetChangesRequestedOk() (*AuditLogApiKeyUpdatedChangesRequested, bool)`

GetChangesRequestedOk returns a tuple with the ChangesRequested field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChangesRequested

`func (o *AuditLogApiKeyUpdated) SetChangesRequested(v AuditLogApiKeyUpdatedChangesRequested)`

SetChangesRequested sets ChangesRequested field to given value.

### HasChangesRequested

`func (o *AuditLogApiKeyUpdated) HasChangesRequested() bool`

HasChangesRequested returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


