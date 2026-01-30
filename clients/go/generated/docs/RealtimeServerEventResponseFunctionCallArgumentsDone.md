# RealtimeServerEventResponseFunctionCallArgumentsDone

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;response.function_call_arguments.done&#x60;.  | 
**ResponseId** | **string** | The ID of the response. | 
**ItemId** | **string** | The ID of the function call item. | 
**OutputIndex** | **int32** | The index of the output item in the response. | 
**CallId** | **string** | The ID of the function call. | 
**Arguments** | **string** | The final arguments as a JSON string. | 

## Methods

### NewRealtimeServerEventResponseFunctionCallArgumentsDone

`func NewRealtimeServerEventResponseFunctionCallArgumentsDone(eventId string, type_ string, responseId string, itemId string, outputIndex int32, callId string, arguments string, ) *RealtimeServerEventResponseFunctionCallArgumentsDone`

NewRealtimeServerEventResponseFunctionCallArgumentsDone instantiates a new RealtimeServerEventResponseFunctionCallArgumentsDone object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeServerEventResponseFunctionCallArgumentsDoneWithDefaults

`func NewRealtimeServerEventResponseFunctionCallArgumentsDoneWithDefaults() *RealtimeServerEventResponseFunctionCallArgumentsDone`

NewRealtimeServerEventResponseFunctionCallArgumentsDoneWithDefaults instantiates a new RealtimeServerEventResponseFunctionCallArgumentsDone object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDone) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDone) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDone) SetEventId(v string)`

SetEventId sets EventId field to given value.


### GetType

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDone) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDone) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDone) SetType(v string)`

SetType sets Type field to given value.


### GetResponseId

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDone) GetResponseId() string`

GetResponseId returns the ResponseId field if non-nil, zero value otherwise.

### GetResponseIdOk

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDone) GetResponseIdOk() (*string, bool)`

GetResponseIdOk returns a tuple with the ResponseId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseId

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDone) SetResponseId(v string)`

SetResponseId sets ResponseId field to given value.


### GetItemId

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDone) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDone) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDone) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetOutputIndex

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDone) GetOutputIndex() int32`

GetOutputIndex returns the OutputIndex field if non-nil, zero value otherwise.

### GetOutputIndexOk

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDone) GetOutputIndexOk() (*int32, bool)`

GetOutputIndexOk returns a tuple with the OutputIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutputIndex

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDone) SetOutputIndex(v int32)`

SetOutputIndex sets OutputIndex field to given value.


### GetCallId

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDone) GetCallId() string`

GetCallId returns the CallId field if non-nil, zero value otherwise.

### GetCallIdOk

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDone) GetCallIdOk() (*string, bool)`

GetCallIdOk returns a tuple with the CallId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCallId

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDone) SetCallId(v string)`

SetCallId sets CallId field to given value.


### GetArguments

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDone) GetArguments() string`

GetArguments returns the Arguments field if non-nil, zero value otherwise.

### GetArgumentsOk

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDone) GetArgumentsOk() (*string, bool)`

GetArgumentsOk returns a tuple with the Arguments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArguments

`func (o *RealtimeServerEventResponseFunctionCallArgumentsDone) SetArguments(v string)`

SetArguments sets Arguments field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


