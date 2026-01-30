# RealtimeServerEventErrorError

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | The type of error (e.g., \&quot;invalid_request_error\&quot;, \&quot;server_error\&quot;).  | 
**Code** | Pointer to **NullableString** | Error code, if any. | [optional] 
**Message** | **string** | A human-readable error message. | 
**Param** | Pointer to **NullableString** | Parameter related to the error, if any. | [optional] 
**EventId** | Pointer to **NullableString** | The event_id of the client event that caused the error, if applicable.  | [optional] 

## Methods

### NewRealtimeServerEventErrorError

`func NewRealtimeServerEventErrorError(type_ string, message string, ) *RealtimeServerEventErrorError`

NewRealtimeServerEventErrorError instantiates a new RealtimeServerEventErrorError object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeServerEventErrorErrorWithDefaults

`func NewRealtimeServerEventErrorErrorWithDefaults() *RealtimeServerEventErrorError`

NewRealtimeServerEventErrorErrorWithDefaults instantiates a new RealtimeServerEventErrorError object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *RealtimeServerEventErrorError) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeServerEventErrorError) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeServerEventErrorError) SetType(v string)`

SetType sets Type field to given value.


### GetCode

`func (o *RealtimeServerEventErrorError) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *RealtimeServerEventErrorError) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *RealtimeServerEventErrorError) SetCode(v string)`

SetCode sets Code field to given value.

### HasCode

`func (o *RealtimeServerEventErrorError) HasCode() bool`

HasCode returns a boolean if a field has been set.

### SetCodeNil

`func (o *RealtimeServerEventErrorError) SetCodeNil(b bool)`

 SetCodeNil sets the value for Code to be an explicit nil

### UnsetCode
`func (o *RealtimeServerEventErrorError) UnsetCode()`

UnsetCode ensures that no value is present for Code, not even an explicit nil
### GetMessage

`func (o *RealtimeServerEventErrorError) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *RealtimeServerEventErrorError) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *RealtimeServerEventErrorError) SetMessage(v string)`

SetMessage sets Message field to given value.


### GetParam

`func (o *RealtimeServerEventErrorError) GetParam() string`

GetParam returns the Param field if non-nil, zero value otherwise.

### GetParamOk

`func (o *RealtimeServerEventErrorError) GetParamOk() (*string, bool)`

GetParamOk returns a tuple with the Param field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParam

`func (o *RealtimeServerEventErrorError) SetParam(v string)`

SetParam sets Param field to given value.

### HasParam

`func (o *RealtimeServerEventErrorError) HasParam() bool`

HasParam returns a boolean if a field has been set.

### SetParamNil

`func (o *RealtimeServerEventErrorError) SetParamNil(b bool)`

 SetParamNil sets the value for Param to be an explicit nil

### UnsetParam
`func (o *RealtimeServerEventErrorError) UnsetParam()`

UnsetParam ensures that no value is present for Param, not even an explicit nil
### GetEventId

`func (o *RealtimeServerEventErrorError) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeServerEventErrorError) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeServerEventErrorError) SetEventId(v string)`

SetEventId sets EventId field to given value.

### HasEventId

`func (o *RealtimeServerEventErrorError) HasEventId() bool`

HasEventId returns a boolean if a field has been set.

### SetEventIdNil

`func (o *RealtimeServerEventErrorError) SetEventIdNil(b bool)`

 SetEventIdNil sets the value for EventId to be an explicit nil

### UnsetEventId
`func (o *RealtimeServerEventErrorError) UnsetEventId()`

UnsetEventId ensures that no value is present for EventId, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


