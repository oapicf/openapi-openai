# RunStepDetailsToolCallsFunctionObjectFunction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | The name of the function. | 
**Arguments** | **string** | The arguments passed to the function. | 
**Output** | **NullableString** | The output of the function. This will be &#x60;null&#x60; if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet. | 

## Methods

### NewRunStepDetailsToolCallsFunctionObjectFunction

`func NewRunStepDetailsToolCallsFunctionObjectFunction(name string, arguments string, output NullableString, ) *RunStepDetailsToolCallsFunctionObjectFunction`

NewRunStepDetailsToolCallsFunctionObjectFunction instantiates a new RunStepDetailsToolCallsFunctionObjectFunction object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunStepDetailsToolCallsFunctionObjectFunctionWithDefaults

`func NewRunStepDetailsToolCallsFunctionObjectFunctionWithDefaults() *RunStepDetailsToolCallsFunctionObjectFunction`

NewRunStepDetailsToolCallsFunctionObjectFunctionWithDefaults instantiates a new RunStepDetailsToolCallsFunctionObjectFunction object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *RunStepDetailsToolCallsFunctionObjectFunction) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *RunStepDetailsToolCallsFunctionObjectFunction) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *RunStepDetailsToolCallsFunctionObjectFunction) SetName(v string)`

SetName sets Name field to given value.


### GetArguments

`func (o *RunStepDetailsToolCallsFunctionObjectFunction) GetArguments() string`

GetArguments returns the Arguments field if non-nil, zero value otherwise.

### GetArgumentsOk

`func (o *RunStepDetailsToolCallsFunctionObjectFunction) GetArgumentsOk() (*string, bool)`

GetArgumentsOk returns a tuple with the Arguments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArguments

`func (o *RunStepDetailsToolCallsFunctionObjectFunction) SetArguments(v string)`

SetArguments sets Arguments field to given value.


### GetOutput

`func (o *RunStepDetailsToolCallsFunctionObjectFunction) GetOutput() string`

GetOutput returns the Output field if non-nil, zero value otherwise.

### GetOutputOk

`func (o *RunStepDetailsToolCallsFunctionObjectFunction) GetOutputOk() (*string, bool)`

GetOutputOk returns a tuple with the Output field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutput

`func (o *RunStepDetailsToolCallsFunctionObjectFunction) SetOutput(v string)`

SetOutput sets Output field to given value.


### SetOutputNil

`func (o *RunStepDetailsToolCallsFunctionObjectFunction) SetOutputNil(b bool)`

 SetOutputNil sets the value for Output to be an explicit nil

### UnsetOutput
`func (o *RunStepDetailsToolCallsFunctionObjectFunction) UnsetOutput()`

UnsetOutput ensures that no value is present for Output, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


