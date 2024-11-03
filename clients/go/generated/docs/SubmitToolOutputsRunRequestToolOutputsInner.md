# SubmitToolOutputsRunRequestToolOutputsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ToolCallId** | Pointer to **string** | The ID of the tool call in the &#x60;required_action&#x60; object within the run object the output is being submitted for. | [optional] 
**Output** | Pointer to **string** | The output of the tool call to be submitted to continue the run. | [optional] 

## Methods

### NewSubmitToolOutputsRunRequestToolOutputsInner

`func NewSubmitToolOutputsRunRequestToolOutputsInner() *SubmitToolOutputsRunRequestToolOutputsInner`

NewSubmitToolOutputsRunRequestToolOutputsInner instantiates a new SubmitToolOutputsRunRequestToolOutputsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSubmitToolOutputsRunRequestToolOutputsInnerWithDefaults

`func NewSubmitToolOutputsRunRequestToolOutputsInnerWithDefaults() *SubmitToolOutputsRunRequestToolOutputsInner`

NewSubmitToolOutputsRunRequestToolOutputsInnerWithDefaults instantiates a new SubmitToolOutputsRunRequestToolOutputsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetToolCallId

`func (o *SubmitToolOutputsRunRequestToolOutputsInner) GetToolCallId() string`

GetToolCallId returns the ToolCallId field if non-nil, zero value otherwise.

### GetToolCallIdOk

`func (o *SubmitToolOutputsRunRequestToolOutputsInner) GetToolCallIdOk() (*string, bool)`

GetToolCallIdOk returns a tuple with the ToolCallId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolCallId

`func (o *SubmitToolOutputsRunRequestToolOutputsInner) SetToolCallId(v string)`

SetToolCallId sets ToolCallId field to given value.

### HasToolCallId

`func (o *SubmitToolOutputsRunRequestToolOutputsInner) HasToolCallId() bool`

HasToolCallId returns a boolean if a field has been set.

### GetOutput

`func (o *SubmitToolOutputsRunRequestToolOutputsInner) GetOutput() string`

GetOutput returns the Output field if non-nil, zero value otherwise.

### GetOutputOk

`func (o *SubmitToolOutputsRunRequestToolOutputsInner) GetOutputOk() (*string, bool)`

GetOutputOk returns a tuple with the Output field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutput

`func (o *SubmitToolOutputsRunRequestToolOutputsInner) SetOutput(v string)`

SetOutput sets Output field to given value.

### HasOutput

`func (o *SubmitToolOutputsRunRequestToolOutputsInner) HasOutput() bool`

HasOutput returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


