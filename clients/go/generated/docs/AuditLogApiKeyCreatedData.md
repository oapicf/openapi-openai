# AuditLogApiKeyCreatedData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Scopes** | Pointer to **[]string** | A list of scopes allowed for the API key, e.g. &#x60;[\&quot;api.model.request\&quot;]&#x60; | [optional] 

## Methods

### NewAuditLogApiKeyCreatedData

`func NewAuditLogApiKeyCreatedData() *AuditLogApiKeyCreatedData`

NewAuditLogApiKeyCreatedData instantiates a new AuditLogApiKeyCreatedData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuditLogApiKeyCreatedDataWithDefaults

`func NewAuditLogApiKeyCreatedDataWithDefaults() *AuditLogApiKeyCreatedData`

NewAuditLogApiKeyCreatedDataWithDefaults instantiates a new AuditLogApiKeyCreatedData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetScopes

`func (o *AuditLogApiKeyCreatedData) GetScopes() []string`

GetScopes returns the Scopes field if non-nil, zero value otherwise.

### GetScopesOk

`func (o *AuditLogApiKeyCreatedData) GetScopesOk() (*[]string, bool)`

GetScopesOk returns a tuple with the Scopes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScopes

`func (o *AuditLogApiKeyCreatedData) SetScopes(v []string)`

SetScopes sets Scopes field to given value.

### HasScopes

`func (o *AuditLogApiKeyCreatedData) HasScopes() bool`

HasScopes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


