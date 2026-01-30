# RealtimeSessionCreateResponseClientSecret

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Value** | Pointer to **string** | Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side.  | [optional] 
**ExpiresAt** | Pointer to **int32** | Timestamp for when the token expires. Currently, all tokens expire after one minute.  | [optional] 

## Methods

### NewRealtimeSessionCreateResponseClientSecret

`func NewRealtimeSessionCreateResponseClientSecret() *RealtimeSessionCreateResponseClientSecret`

NewRealtimeSessionCreateResponseClientSecret instantiates a new RealtimeSessionCreateResponseClientSecret object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeSessionCreateResponseClientSecretWithDefaults

`func NewRealtimeSessionCreateResponseClientSecretWithDefaults() *RealtimeSessionCreateResponseClientSecret`

NewRealtimeSessionCreateResponseClientSecretWithDefaults instantiates a new RealtimeSessionCreateResponseClientSecret object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetValue

`func (o *RealtimeSessionCreateResponseClientSecret) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *RealtimeSessionCreateResponseClientSecret) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *RealtimeSessionCreateResponseClientSecret) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *RealtimeSessionCreateResponseClientSecret) HasValue() bool`

HasValue returns a boolean if a field has been set.

### GetExpiresAt

`func (o *RealtimeSessionCreateResponseClientSecret) GetExpiresAt() int32`

GetExpiresAt returns the ExpiresAt field if non-nil, zero value otherwise.

### GetExpiresAtOk

`func (o *RealtimeSessionCreateResponseClientSecret) GetExpiresAtOk() (*int32, bool)`

GetExpiresAtOk returns a tuple with the ExpiresAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiresAt

`func (o *RealtimeSessionCreateResponseClientSecret) SetExpiresAt(v int32)`

SetExpiresAt sets ExpiresAt field to given value.

### HasExpiresAt

`func (o *RealtimeSessionCreateResponseClientSecret) HasExpiresAt() bool`

HasExpiresAt returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


