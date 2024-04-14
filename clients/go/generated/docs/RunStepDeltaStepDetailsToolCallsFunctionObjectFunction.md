# RunStepDeltaStepDetailsToolCallsFunctionObjectFunction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | The name of the function. | [optional] 
**Arguments** | Pointer to **string** | The arguments passed to the function. | [optional] 
**Output** | Pointer to **NullableString** | The output of the function. This will be &#x60;null&#x60; if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet. | [optional] 

## Methods

### NewRunStepDeltaStepDetailsToolCallsFunctionObjectFunction

`func NewRunStepDeltaStepDetailsToolCallsFunctionObjectFunction() *RunStepDeltaStepDetailsToolCallsFunctionObjectFunction`

NewRunStepDeltaStepDetailsToolCallsFunctionObjectFunction instantiates a new RunStepDeltaStepDetailsToolCallsFunctionObjectFunction object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunStepDeltaStepDetailsToolCallsFunctionObjectFunctionWithDefaults

`func NewRunStepDeltaStepDetailsToolCallsFunctionObjectFunctionWithDefaults() *RunStepDeltaStepDetailsToolCallsFunctionObjectFunction`

NewRunStepDeltaStepDetailsToolCallsFunctionObjectFunctionWithDefaults instantiates a new RunStepDeltaStepDetailsToolCallsFunctionObjectFunction object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObjectFunction) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObjectFunction) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObjectFunction) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObjectFunction) HasName() bool`

HasName returns a boolean if a field has been set.

### GetArguments

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObjectFunction) GetArguments() string`

GetArguments returns the Arguments field if non-nil, zero value otherwise.

### GetArgumentsOk

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObjectFunction) GetArgumentsOk() (*string, bool)`

GetArgumentsOk returns a tuple with the Arguments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArguments

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObjectFunction) SetArguments(v string)`

SetArguments sets Arguments field to given value.

### HasArguments

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObjectFunction) HasArguments() bool`

HasArguments returns a boolean if a field has been set.

### GetOutput

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObjectFunction) GetOutput() string`

GetOutput returns the Output field if non-nil, zero value otherwise.

### GetOutputOk

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObjectFunction) GetOutputOk() (*string, bool)`

GetOutputOk returns a tuple with the Output field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutput

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObjectFunction) SetOutput(v string)`

SetOutput sets Output field to given value.

### HasOutput

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObjectFunction) HasOutput() bool`

HasOutput returns a boolean if a field has been set.

### SetOutputNil

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObjectFunction) SetOutputNil(b bool)`

 SetOutputNil sets the value for Output to be an explicit nil

### UnsetOutput
`func (o *RunStepDeltaStepDetailsToolCallsFunctionObjectFunction) UnsetOutput()`

UnsetOutput ensures that no value is present for Output, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


