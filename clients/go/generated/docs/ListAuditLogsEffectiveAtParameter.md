# ListAuditLogsEffectiveAtParameter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Gt** | Pointer to **int32** | Return only events whose &#x60;effective_at&#x60; (Unix seconds) is greater than this value. | [optional] 
**Gte** | Pointer to **int32** | Return only events whose &#x60;effective_at&#x60; (Unix seconds) is greater than or equal to this value. | [optional] 
**Lt** | Pointer to **int32** | Return only events whose &#x60;effective_at&#x60; (Unix seconds) is less than this value. | [optional] 
**Lte** | Pointer to **int32** | Return only events whose &#x60;effective_at&#x60; (Unix seconds) is less than or equal to this value. | [optional] 

## Methods

### NewListAuditLogsEffectiveAtParameter

`func NewListAuditLogsEffectiveAtParameter() *ListAuditLogsEffectiveAtParameter`

NewListAuditLogsEffectiveAtParameter instantiates a new ListAuditLogsEffectiveAtParameter object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewListAuditLogsEffectiveAtParameterWithDefaults

`func NewListAuditLogsEffectiveAtParameterWithDefaults() *ListAuditLogsEffectiveAtParameter`

NewListAuditLogsEffectiveAtParameterWithDefaults instantiates a new ListAuditLogsEffectiveAtParameter object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGt

`func (o *ListAuditLogsEffectiveAtParameter) GetGt() int32`

GetGt returns the Gt field if non-nil, zero value otherwise.

### GetGtOk

`func (o *ListAuditLogsEffectiveAtParameter) GetGtOk() (*int32, bool)`

GetGtOk returns a tuple with the Gt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGt

`func (o *ListAuditLogsEffectiveAtParameter) SetGt(v int32)`

SetGt sets Gt field to given value.

### HasGt

`func (o *ListAuditLogsEffectiveAtParameter) HasGt() bool`

HasGt returns a boolean if a field has been set.

### GetGte

`func (o *ListAuditLogsEffectiveAtParameter) GetGte() int32`

GetGte returns the Gte field if non-nil, zero value otherwise.

### GetGteOk

`func (o *ListAuditLogsEffectiveAtParameter) GetGteOk() (*int32, bool)`

GetGteOk returns a tuple with the Gte field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGte

`func (o *ListAuditLogsEffectiveAtParameter) SetGte(v int32)`

SetGte sets Gte field to given value.

### HasGte

`func (o *ListAuditLogsEffectiveAtParameter) HasGte() bool`

HasGte returns a boolean if a field has been set.

### GetLt

`func (o *ListAuditLogsEffectiveAtParameter) GetLt() int32`

GetLt returns the Lt field if non-nil, zero value otherwise.

### GetLtOk

`func (o *ListAuditLogsEffectiveAtParameter) GetLtOk() (*int32, bool)`

GetLtOk returns a tuple with the Lt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLt

`func (o *ListAuditLogsEffectiveAtParameter) SetLt(v int32)`

SetLt sets Lt field to given value.

### HasLt

`func (o *ListAuditLogsEffectiveAtParameter) HasLt() bool`

HasLt returns a boolean if a field has been set.

### GetLte

`func (o *ListAuditLogsEffectiveAtParameter) GetLte() int32`

GetLte returns the Lte field if non-nil, zero value otherwise.

### GetLteOk

`func (o *ListAuditLogsEffectiveAtParameter) GetLteOk() (*int32, bool)`

GetLteOk returns a tuple with the Lte field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLte

`func (o *ListAuditLogsEffectiveAtParameter) SetLte(v int32)`

SetLte sets Lte field to given value.

### HasLte

`func (o *ListAuditLogsEffectiveAtParameter) HasLte() bool`

HasLte returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


