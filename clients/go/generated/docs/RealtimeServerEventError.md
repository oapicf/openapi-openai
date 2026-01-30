# RealtimeServerEventError

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;error&#x60;. | 
**Error** | [**RealtimeServerEventErrorError**](RealtimeServerEventErrorError.md) |  | 

## Methods

### NewRealtimeServerEventError

`func NewRealtimeServerEventError(eventId string, type_ string, error_ RealtimeServerEventErrorError, ) *RealtimeServerEventError`

NewRealtimeServerEventError instantiates a new RealtimeServerEventError object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeServerEventErrorWithDefaults

`func NewRealtimeServerEventErrorWithDefaults() *RealtimeServerEventError`

NewRealtimeServerEventErrorWithDefaults instantiates a new RealtimeServerEventError object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeServerEventError) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeServerEventError) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeServerEventError) SetEventId(v string)`

SetEventId sets EventId field to given value.


### GetType

`func (o *RealtimeServerEventError) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeServerEventError) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeServerEventError) SetType(v string)`

SetType sets Type field to given value.


### GetError

`func (o *RealtimeServerEventError) GetError() RealtimeServerEventErrorError`

GetError returns the Error field if non-nil, zero value otherwise.

### GetErrorOk

`func (o *RealtimeServerEventError) GetErrorOk() (*RealtimeServerEventErrorError, bool)`

GetErrorOk returns a tuple with the Error field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetError

`func (o *RealtimeServerEventError) SetError(v RealtimeServerEventErrorError)`

SetError sets Error field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


