# SubmitToolOutputsRunRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ToolOutputs** | [**[]SubmitToolOutputsRunRequestToolOutputsInner**](SubmitToolOutputsRunRequestToolOutputsInner.md) | A list of tools for which the outputs are being submitted. | 
**Stream** | Pointer to **NullableBool** | If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message.  | [optional] 

## Methods

### NewSubmitToolOutputsRunRequest

`func NewSubmitToolOutputsRunRequest(toolOutputs []SubmitToolOutputsRunRequestToolOutputsInner, ) *SubmitToolOutputsRunRequest`

NewSubmitToolOutputsRunRequest instantiates a new SubmitToolOutputsRunRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSubmitToolOutputsRunRequestWithDefaults

`func NewSubmitToolOutputsRunRequestWithDefaults() *SubmitToolOutputsRunRequest`

NewSubmitToolOutputsRunRequestWithDefaults instantiates a new SubmitToolOutputsRunRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetToolOutputs

`func (o *SubmitToolOutputsRunRequest) GetToolOutputs() []SubmitToolOutputsRunRequestToolOutputsInner`

GetToolOutputs returns the ToolOutputs field if non-nil, zero value otherwise.

### GetToolOutputsOk

`func (o *SubmitToolOutputsRunRequest) GetToolOutputsOk() (*[]SubmitToolOutputsRunRequestToolOutputsInner, bool)`

GetToolOutputsOk returns a tuple with the ToolOutputs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolOutputs

`func (o *SubmitToolOutputsRunRequest) SetToolOutputs(v []SubmitToolOutputsRunRequestToolOutputsInner)`

SetToolOutputs sets ToolOutputs field to given value.


### GetStream

`func (o *SubmitToolOutputsRunRequest) GetStream() bool`

GetStream returns the Stream field if non-nil, zero value otherwise.

### GetStreamOk

`func (o *SubmitToolOutputsRunRequest) GetStreamOk() (*bool, bool)`

GetStreamOk returns a tuple with the Stream field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStream

`func (o *SubmitToolOutputsRunRequest) SetStream(v bool)`

SetStream sets Stream field to given value.

### HasStream

`func (o *SubmitToolOutputsRunRequest) HasStream() bool`

HasStream returns a boolean if a field has been set.

### SetStreamNil

`func (o *SubmitToolOutputsRunRequest) SetStreamNil(b bool)`

 SetStreamNil sets the value for Stream to be an explicit nil

### UnsetStream
`func (o *SubmitToolOutputsRunRequest) UnsetStream()`

UnsetStream ensures that no value is present for Stream, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


