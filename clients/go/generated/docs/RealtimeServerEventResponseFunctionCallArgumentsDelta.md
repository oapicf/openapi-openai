# RealtimeServerEventResponseFunctionCallArgumentsDelta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;response.function_call_arguments.delta&#x60;.  | 
**ResponseId** | **string** | The ID of the response. | 
**ItemId** | **string** | The ID of the function call item. | 
**OutputIndex** | **int32** | The index of the output item in the response. | 
**CallId** | **string** | The ID of the function call. | 
**Delta** | **string** | The arguments delta as a JSON string. | 

## Methods

### NewRealtimeServerEventResponseFunctionCallArgumentsDelta

`func NewRealtimeServerEventResponseFunctionCallArgumentsDelta(eventId string, type_ string, responseId string, itemId string, outputIndex int32, callId string, delta string, ) *RealtimeServerEventResponseFunctionCallArgumentsDelta`

NewRealtimeServerEventResponseFunctionCallArgumentsDelta instantiates a new RealtimeServerEventResponseFunctionCallArgumentsDelta object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeServerEventResponseFunctionCallArgumentsDeltaWithDefaults

`func NewRealtimeServerEventResponseFunctionCallArgumentsDeltaWithDefaults() *RealtimeServerEventResponseFunctionCallArgumentsDelta`

NewRealtimeServerEventResponseFunctionCallArgumentsDeltaWithDefaults instantiates a new RealtimeServerEventResponseFunctionCallArgumentsDelta object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDelta) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDelta) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDelta) SetEventId(v string)`

SetEventId sets EventId field to given value.


### GetType

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDelta) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDelta) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDelta) SetType(v string)`

SetType sets Type field to given value.


### GetResponseId

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDelta) GetResponseId() string`

GetResponseId returns the ResponseId field if non-nil, zero value otherwise.

### GetResponseIdOk

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDelta) GetResponseIdOk() (*string, bool)`

GetResponseIdOk returns a tuple with the ResponseId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseId

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDelta) SetResponseId(v string)`

SetResponseId sets ResponseId field to given value.


### GetItemId

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDelta) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDelta) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDelta) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetOutputIndex

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDelta) GetOutputIndex() int32`

GetOutputIndex returns the OutputIndex field if non-nil, zero value otherwise.

### GetOutputIndexOk

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDelta) GetOutputIndexOk() (*int32, bool)`

GetOutputIndexOk returns a tuple with the OutputIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutputIndex

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDelta) SetOutputIndex(v int32)`

SetOutputIndex sets OutputIndex field to given value.


### GetCallId

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDelta) GetCallId() string`

GetCallId returns the CallId field if non-nil, zero value otherwise.

### GetCallIdOk

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDelta) GetCallIdOk() (*string, bool)`

GetCallIdOk returns a tuple with the CallId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCallId

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDelta) SetCallId(v string)`

SetCallId sets CallId field to given value.


### GetDelta

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDelta) GetDelta() string`

GetDelta returns the Delta field if non-nil, zero value otherwise.

### GetDeltaOk

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDelta) GetDeltaOk() (*string, bool)`

GetDeltaOk returns a tuple with the Delta field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDelta

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDelta) SetDelta(v string)`

SetDelta sets Delta field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


