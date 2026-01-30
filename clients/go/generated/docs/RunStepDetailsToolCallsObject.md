# RunStepDetailsToolCallsObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Always &#x60;tool_calls&#x60;. | 
**ToolCalls** | [**[]RunStepDetailsToolCallsObjectToolCallsInner**](RunStepDetailsToolCallsObjectToolCallsInner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.  | 

## Methods

### NewRunStepDetailsToolCallsObject

`func NewRunStepDetailsToolCallsObject(type_ string, toolCalls []RunStepDetailsToolCallsObjectToolCallsInner, ) *RunStepDetailsToolCallsObject`

NewRunStepDetailsToolCallsObject instantiates a new RunStepDetailsToolCallsObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunStepDetailsToolCallsObjectWithDefaults

`func NewRunStepDetailsToolCallsObjectWithDefaults() *RunStepDetailsToolCallsObject`

NewRunStepDetailsToolCallsObjectWithDefaults instantiates a new RunStepDetailsToolCallsObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *RunStepDetailsToolCallsObject) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RunStepDetailsToolCallsObject) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RunStepDetailsToolCallsObject) SetType(v string)`

SetType sets Type field to given value.


### GetToolCalls

`func (o *RunStepDetailsToolCallsObject) GetToolCalls() []RunStepDetailsToolCallsObjectToolCallsInner`

GetToolCalls returns the ToolCalls field if non-nil, zero value otherwise.

### GetToolCallsOk

`func (o *RunStepDetailsToolCallsObject) GetToolCallsOk() (*[]RunStepDetailsToolCallsObjectToolCallsInner, bool)`

GetToolCallsOk returns a tuple with the ToolCalls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolCalls

`func (o *RunStepDetailsToolCallsObject) SetToolCalls(v []RunStepDetailsToolCallsObjectToolCallsInner)`

SetToolCalls sets ToolCalls field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


