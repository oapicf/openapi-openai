# AuditLogRateLimitUpdated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | The rate limit ID | [optional] 
**ChangesRequested** | Pointer to [**AuditLogRateLimitUpdatedChangesRequested**](AuditLogRateLimitUpdatedChangesRequested.md) |  | [optional] 

## Methods

### NewAuditLogRateLimitUpdated

`func NewAuditLogRateLimitUpdated() *AuditLogRateLimitUpdated`

NewAuditLogRateLimitUpdated instantiates a new AuditLogRateLimitUpdated object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuditLogRateLimitUpdatedWithDefaults

`func NewAuditLogRateLimitUpdatedWithDefaults() *AuditLogRateLimitUpdated`

NewAuditLogRateLimitUpdatedWithDefaults instantiates a new AuditLogRateLimitUpdated object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *AuditLogRateLimitUpdated) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AuditLogRateLimitUpdated) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AuditLogRateLimitUpdated) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *AuditLogRateLimitUpdated) HasId() bool`

HasId returns a boolean if a field has been set.

### GetChangesRequested

`func (o *AuditLogRateLimitUpdated) GetChangesRequested() AuditLogRateLimitUpdatedChangesRequested`

GetChangesRequested returns the ChangesRequested field if non-nil, zero value otherwise.

### GetChangesRequestedOk

`func (o *AuditLogRateLimitUpdated) GetChangesRequestedOk() (*AuditLogRateLimitUpdatedChangesRequested, bool)`

GetChangesRequestedOk returns a tuple with the ChangesRequested field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChangesRequested

`func (o *AuditLogRateLimitUpdated) SetChangesRequested(v AuditLogRateLimitUpdatedChangesRequested)`

SetChangesRequested sets ChangesRequested field to given value.

### HasChangesRequested

`func (o *AuditLogRateLimitUpdated) HasChangesRequested() bool`

HasChangesRequested returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


