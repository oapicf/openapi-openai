# RealtimeServerEventRateLimitsUpdated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;rate_limits.updated&#x60;. | 
**RateLimits** | [**[]RealtimeServerEventRateLimitsUpdatedRateLimitsInner**](RealtimeServerEventRateLimitsUpdatedRateLimitsInner.md) | List of rate limit information. | 

## Methods

### NewRealtimeServerEventRateLimitsUpdated

`func NewRealtimeServerEventRateLimitsUpdated(eventId string, type_ string, rateLimits []RealtimeServerEventRateLimitsUpdatedRateLimitsInner, ) *RealtimeServerEventRateLimitsUpdated`

NewRealtimeServerEventRateLimitsUpdated instantiates a new RealtimeServerEventRateLimitsUpdated object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeServerEventRateLimitsUpdatedWithDefaults

`func NewRealtimeServerEventRateLimitsUpdatedWithDefaults() *RealtimeServerEventRateLimitsUpdated`

NewRealtimeServerEventRateLimitsUpdatedWithDefaults instantiates a new RealtimeServerEventRateLimitsUpdated object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeServerEventRateLimitsUpdated) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeServerEventRateLimitsUpdated) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeServerEventRateLimitsUpdated) SetEventId(v string)`

SetEventId sets EventId field to given value.


### GetType

`func (o *RealtimeServerEventRateLimitsUpdated) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeServerEventRateLimitsUpdated) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeServerEventRateLimitsUpdated) SetType(v string)`

SetType sets Type field to given value.


### GetRateLimits

`func (o *RealtimeServerEventRateLimitsUpdated) GetRateLimits() []RealtimeServerEventRateLimitsUpdatedRateLimitsInner`

GetRateLimits returns the RateLimits field if non-nil, zero value otherwise.

### GetRateLimitsOk

`func (o *RealtimeServerEventRateLimitsUpdated) GetRateLimitsOk() (*[]RealtimeServerEventRateLimitsUpdatedRateLimitsInner, bool)`

GetRateLimitsOk returns a tuple with the RateLimits field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRateLimits

`func (o *RealtimeServerEventRateLimitsUpdated) SetRateLimits(v []RealtimeServerEventRateLimitsUpdatedRateLimitsInner)`

SetRateLimits sets RateLimits field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


