# RunStepDetailsToolCallsCodeObjectCodeInterpreter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Input** | **string** | The input to the Code Interpreter tool call. | 
**Outputs** | [**[]RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner**](RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.md) | The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (&#x60;logs&#x60;) or images (&#x60;image&#x60;). Each of these are represented by a different object type. | 

## Methods

### NewRunStepDetailsToolCallsCodeObjectCodeInterpreter

`func NewRunStepDetailsToolCallsCodeObjectCodeInterpreter(input string, outputs []RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner, ) *RunStepDetailsToolCallsCodeObjectCodeInterpreter`

NewRunStepDetailsToolCallsCodeObjectCodeInterpreter instantiates a new RunStepDetailsToolCallsCodeObjectCodeInterpreter object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunStepDetailsToolCallsCodeObjectCodeInterpreterWithDefaults

`func NewRunStepDetailsToolCallsCodeObjectCodeInterpreterWithDefaults() *RunStepDetailsToolCallsCodeObjectCodeInterpreter`

NewRunStepDetailsToolCallsCodeObjectCodeInterpreterWithDefaults instantiates a new RunStepDetailsToolCallsCodeObjectCodeInterpreter object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetInput

`func (o *RunStepDetailsToolCallsCodeObjectCodeInterpreter) GetInput() string`

GetInput returns the Input field if non-nil, zero value otherwise.

### GetInputOk

`func (o *RunStepDetailsToolCallsCodeObjectCodeInterpreter) GetInputOk() (*string, bool)`

GetInputOk returns a tuple with the Input field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInput

`func (o *RunStepDetailsToolCallsCodeObjectCodeInterpreter) SetInput(v string)`

SetInput sets Input field to given value.


### GetOutputs

`func (o *RunStepDetailsToolCallsCodeObjectCodeInterpreter) GetOutputs() []RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner`

GetOutputs returns the Outputs field if non-nil, zero value otherwise.

### GetOutputsOk

`func (o *RunStepDetailsToolCallsCodeObjectCodeInterpreter) GetOutputsOk() (*[]RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner, bool)`

GetOutputsOk returns a tuple with the Outputs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutputs

`func (o *RunStepDetailsToolCallsCodeObjectCodeInterpreter) SetOutputs(v []RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner)`

SetOutputs sets Outputs field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


