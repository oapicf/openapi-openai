# RunStepDeltaStepDetailsToolCallsObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Always &#x60;tool_calls&#x60;. | 
**ToolCalls** | Pointer to [**[]RunStepDeltaStepDetailsToolCallsObjectToolCallsInner**](RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.  | [optional] 

## Methods

### NewRunStepDeltaStepDetailsToolCallsObject

`func NewRunStepDeltaStepDetailsToolCallsObject(type_ string, ) *RunStepDeltaStepDetailsToolCallsObject`

NewRunStepDeltaStepDetailsToolCallsObject instantiates a new RunStepDeltaStepDetailsToolCallsObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunStepDeltaStepDetailsToolCallsObjectWithDefaults

`func NewRunStepDeltaStepDetailsToolCallsObjectWithDefaults() *RunStepDeltaStepDetailsToolCallsObject`

NewRunStepDeltaStepDetailsToolCallsObjectWithDefaults instantiates a new RunStepDeltaStepDetailsToolCallsObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *RunStepDeltaStepDetailsToolCallsObject) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RunStepDeltaStepDetailsToolCallsObject) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RunStepDeltaStepDetailsToolCallsObject) SetType(v string)`

SetType sets Type field to given value.


### GetToolCalls

`func (o *RunStepDeltaStepDetailsToolCallsObject) GetToolCalls() []RunStepDeltaStepDetailsToolCallsObjectToolCallsInner`

GetToolCalls returns the ToolCalls field if non-nil, zero value otherwise.

### GetToolCallsOk

`func (o *RunStepDeltaStepDetailsToolCallsObject) GetToolCallsOk() (*[]RunStepDeltaStepDetailsToolCallsObjectToolCallsInner, bool)`

GetToolCallsOk returns a tuple with the ToolCalls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolCalls

`func (o *RunStepDeltaStepDetailsToolCallsObject) SetToolCalls(v []RunStepDeltaStepDetailsToolCallsObjectToolCallsInner)`

SetToolCalls sets ToolCalls field to given value.

### HasToolCalls

`func (o *RunStepDeltaStepDetailsToolCallsObject) HasToolCalls() bool`

HasToolCalls returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


