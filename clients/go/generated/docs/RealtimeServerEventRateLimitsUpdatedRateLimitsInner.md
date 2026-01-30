# RealtimeServerEventRateLimitsUpdatedRateLimitsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | The name of the rate limit (&#x60;requests&#x60;, &#x60;tokens&#x60;).  | [optional] 
**Limit** | Pointer to **int32** | The maximum allowed value for the rate limit. | [optional] 
**Remaining** | Pointer to **int32** | The remaining value before the limit is reached. | [optional] 
**ResetSeconds** | Pointer to **float32** | Seconds until the rate limit resets. | [optional] 

## Methods

### NewRealtimeServerEventRateLimitsUpdatedRateLimitsInner

`func NewRealtimeServerEventRateLimitsUpdatedRateLimitsInner() *RealtimeServerEventRateLimitsUpdatedRateLimitsInner`

NewRealtimeServerEventRateLimitsUpdatedRateLimitsInner instantiates a new RealtimeServerEventRateLimitsUpdatedRateLimitsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeServerEventRateLimitsUpdatedRateLimitsInnerWithDefaults

`func NewRealtimeServerEventRateLimitsUpdatedRateLimitsInnerWithDefaults() *RealtimeServerEventRateLimitsUpdatedRateLimitsInner`

NewRealtimeServerEventRateLimitsUpdatedRateLimitsInnerWithDefaults instantiates a new RealtimeServerEventRateLimitsUpdatedRateLimitsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *RealtimeServerEventRateLimitsUpdatedRateLimitsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *RealtimeServerEventRateLimitsUpdatedRateLimitsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *RealtimeServerEventRateLimitsUpdatedRateLimitsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *RealtimeServerEventRateLimitsUpdatedRateLimitsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetLimit

`func (o *RealtimeServerEventRateLimitsUpdatedRateLimitsInner) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *RealtimeServerEventRateLimitsUpdatedRateLimitsInner) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *RealtimeServerEventRateLimitsUpdatedRateLimitsInner) SetLimit(v int32)`

SetLimit sets Limit field to given value.

### HasLimit

`func (o *RealtimeServerEventRateLimitsUpdatedRateLimitsInner) HasLimit() bool`

HasLimit returns a boolean if a field has been set.

### GetRemaining

`func (o *RealtimeServerEventRateLimitsUpdatedRateLimitsInner) GetRemaining() int32`

GetRemaining returns the Remaining field if non-nil, zero value otherwise.

### GetRemainingOk

`func (o *RealtimeServerEventRateLimitsUpdatedRateLimitsInner) GetRemainingOk() (*int32, bool)`

GetRemainingOk returns a tuple with the Remaining field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRemaining

`func (o *RealtimeServerEventRateLimitsUpdatedRateLimitsInner) SetRemaining(v int32)`

SetRemaining sets Remaining field to given value.

### HasRemaining

`func (o *RealtimeServerEventRateLimitsUpdatedRateLimitsInner) HasRemaining() bool`

HasRemaining returns a boolean if a field has been set.

### GetResetSeconds

`func (o *RealtimeServerEventRateLimitsUpdatedRateLimitsInner) GetResetSeconds() float32`

GetResetSeconds returns the ResetSeconds field if non-nil, zero value otherwise.

### GetResetSecondsOk

`func (o *RealtimeServerEventRateLimitsUpdatedRateLimitsInner) GetResetSecondsOk() (*float32, bool)`

GetResetSecondsOk returns a tuple with the ResetSeconds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResetSeconds

`func (o *RealtimeServerEventRateLimitsUpdatedRateLimitsInner) SetResetSeconds(v float32)`

SetResetSeconds sets ResetSeconds field to given value.

### HasResetSeconds

`func (o *RealtimeServerEventRateLimitsUpdatedRateLimitsInner) HasResetSeconds() bool`

HasResetSeconds returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


