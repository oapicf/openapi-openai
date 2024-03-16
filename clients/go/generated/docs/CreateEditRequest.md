# CreateEditRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Model** | [**CreateEditRequestModel**](CreateEditRequestModel.md) |  | 
**Input** | Pointer to **NullableString** | The input text to use as a starting point for the edit. | [optional] [default to ""]
**Instruction** | **string** | The instruction that tells the model how to edit the prompt. | 
**N** | Pointer to **NullableInt32** | How many edits to generate for the input and instruction. | [optional] [default to 1]
**Temperature** | Pointer to **NullableFloat32** | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both.  | [optional] [default to 1]
**TopP** | Pointer to **NullableFloat32** | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both.  | [optional] [default to 1]

## Methods

### NewCreateEditRequest

`func NewCreateEditRequest(model CreateEditRequestModel, instruction string, ) *CreateEditRequest`

NewCreateEditRequest instantiates a new CreateEditRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateEditRequestWithDefaults

`func NewCreateEditRequestWithDefaults() *CreateEditRequest`

NewCreateEditRequestWithDefaults instantiates a new CreateEditRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetModel

`func (o *CreateEditRequest) GetModel() CreateEditRequestModel`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *CreateEditRequest) GetModelOk() (*CreateEditRequestModel, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *CreateEditRequest) SetModel(v CreateEditRequestModel)`

SetModel sets Model field to given value.


### GetInput

`func (o *CreateEditRequest) GetInput() string`

GetInput returns the Input field if non-nil, zero value otherwise.

### GetInputOk

`func (o *CreateEditRequest) GetInputOk() (*string, bool)`

GetInputOk returns a tuple with the Input field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInput

`func (o *CreateEditRequest) SetInput(v string)`

SetInput sets Input field to given value.

### HasInput

`func (o *CreateEditRequest) HasInput() bool`

HasInput returns a boolean if a field has been set.

### SetInputNil

`func (o *CreateEditRequest) SetInputNil(b bool)`

 SetInputNil sets the value for Input to be an explicit nil

### UnsetInput
`func (o *CreateEditRequest) UnsetInput()`

UnsetInput ensures that no value is present for Input, not even an explicit nil
### GetInstruction

`func (o *CreateEditRequest) GetInstruction() string`

GetInstruction returns the Instruction field if non-nil, zero value otherwise.

### GetInstructionOk

`func (o *CreateEditRequest) GetInstructionOk() (*string, bool)`

GetInstructionOk returns a tuple with the Instruction field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstruction

`func (o *CreateEditRequest) SetInstruction(v string)`

SetInstruction sets Instruction field to given value.


### GetN

`func (o *CreateEditRequest) GetN() int32`

GetN returns the N field if non-nil, zero value otherwise.

### GetNOk

`func (o *CreateEditRequest) GetNOk() (*int32, bool)`

GetNOk returns a tuple with the N field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetN

`func (o *CreateEditRequest) SetN(v int32)`

SetN sets N field to given value.

### HasN

`func (o *CreateEditRequest) HasN() bool`

HasN returns a boolean if a field has been set.

### SetNNil

`func (o *CreateEditRequest) SetNNil(b bool)`

 SetNNil sets the value for N to be an explicit nil

### UnsetN
`func (o *CreateEditRequest) UnsetN()`

UnsetN ensures that no value is present for N, not even an explicit nil
### GetTemperature

`func (o *CreateEditRequest) GetTemperature() float32`

GetTemperature returns the Temperature field if non-nil, zero value otherwise.

### GetTemperatureOk

`func (o *CreateEditRequest) GetTemperatureOk() (*float32, bool)`

GetTemperatureOk returns a tuple with the Temperature field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemperature

`func (o *CreateEditRequest) SetTemperature(v float32)`

SetTemperature sets Temperature field to given value.

### HasTemperature

`func (o *CreateEditRequest) HasTemperature() bool`

HasTemperature returns a boolean if a field has been set.

### SetTemperatureNil

`func (o *CreateEditRequest) SetTemperatureNil(b bool)`

 SetTemperatureNil sets the value for Temperature to be an explicit nil

### UnsetTemperature
`func (o *CreateEditRequest) UnsetTemperature()`

UnsetTemperature ensures that no value is present for Temperature, not even an explicit nil
### GetTopP

`func (o *CreateEditRequest) GetTopP() float32`

GetTopP returns the TopP field if non-nil, zero value otherwise.

### GetTopPOk

`func (o *CreateEditRequest) GetTopPOk() (*float32, bool)`

GetTopPOk returns a tuple with the TopP field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTopP

`func (o *CreateEditRequest) SetTopP(v float32)`

SetTopP sets TopP field to given value.

### HasTopP

`func (o *CreateEditRequest) HasTopP() bool`

HasTopP returns a boolean if a field has been set.

### SetTopPNil

`func (o *CreateEditRequest) SetTopPNil(b bool)`

 SetTopPNil sets the value for TopP to be an explicit nil

### UnsetTopP
`func (o *CreateEditRequest) UnsetTopP()`

UnsetTopP ensures that no value is present for TopP, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


