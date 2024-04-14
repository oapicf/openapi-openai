# RunStepDetailsToolCallsCodeObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The ID of the tool call. | 
**Type** | **string** | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | 
**CodeInterpreter** | [**RunStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  | 

## Methods

### NewRunStepDetailsToolCallsCodeObject

`func NewRunStepDetailsToolCallsCodeObject(id string, type_ string, codeInterpreter RunStepDetailsToolCallsCodeObjectCodeInterpreter, ) *RunStepDetailsToolCallsCodeObject`

NewRunStepDetailsToolCallsCodeObject instantiates a new RunStepDetailsToolCallsCodeObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunStepDetailsToolCallsCodeObjectWithDefaults

`func NewRunStepDetailsToolCallsCodeObjectWithDefaults() *RunStepDetailsToolCallsCodeObject`

NewRunStepDetailsToolCallsCodeObjectWithDefaults instantiates a new RunStepDetailsToolCallsCodeObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *RunStepDetailsToolCallsCodeObject) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *RunStepDetailsToolCallsCodeObject) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *RunStepDetailsToolCallsCodeObject) SetId(v string)`

SetId sets Id field to given value.


### GetType

`func (o *RunStepDetailsToolCallsCodeObject) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RunStepDetailsToolCallsCodeObject) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RunStepDetailsToolCallsCodeObject) SetType(v string)`

SetType sets Type field to given value.


### GetCodeInterpreter

`func (o *RunStepDetailsToolCallsCodeObject) GetCodeInterpreter() RunStepDetailsToolCallsCodeObjectCodeInterpreter`

GetCodeInterpreter returns the CodeInterpreter field if non-nil, zero value otherwise.

### GetCodeInterpreterOk

`func (o *RunStepDetailsToolCallsCodeObject) GetCodeInterpreterOk() (*RunStepDetailsToolCallsCodeObjectCodeInterpreter, bool)`

GetCodeInterpreterOk returns a tuple with the CodeInterpreter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCodeInterpreter

`func (o *RunStepDetailsToolCallsCodeObject) SetCodeInterpreter(v RunStepDetailsToolCallsCodeObjectCodeInterpreter)`

SetCodeInterpreter sets CodeInterpreter field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


