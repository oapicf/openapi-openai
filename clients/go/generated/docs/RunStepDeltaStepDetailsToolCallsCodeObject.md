# RunStepDeltaStepDetailsToolCallsCodeObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **int32** | The index of the tool call in the tool calls array. | 
**Id** | Pointer to **string** | The ID of the tool call. | [optional] 
**Type** | **string** | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | 
**CodeInterpreter** | Pointer to [**RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  | [optional] 

## Methods

### NewRunStepDeltaStepDetailsToolCallsCodeObject

`func NewRunStepDeltaStepDetailsToolCallsCodeObject(index int32, type_ string, ) *RunStepDeltaStepDetailsToolCallsCodeObject`

NewRunStepDeltaStepDetailsToolCallsCodeObject instantiates a new RunStepDeltaStepDetailsToolCallsCodeObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunStepDeltaStepDetailsToolCallsCodeObjectWithDefaults

`func NewRunStepDeltaStepDetailsToolCallsCodeObjectWithDefaults() *RunStepDeltaStepDetailsToolCallsCodeObject`

NewRunStepDeltaStepDetailsToolCallsCodeObjectWithDefaults instantiates a new RunStepDeltaStepDetailsToolCallsCodeObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIndex

`func (o *RunStepDeltaStepDetailsToolCallsCodeObject) GetIndex() int32`

GetIndex returns the Index field if non-nil, zero value otherwise.

### GetIndexOk

`func (o *RunStepDeltaStepDetailsToolCallsCodeObject) GetIndexOk() (*int32, bool)`

GetIndexOk returns a tuple with the Index field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndex

`func (o *RunStepDeltaStepDetailsToolCallsCodeObject) SetIndex(v int32)`

SetIndex sets Index field to given value.


### GetId

`func (o *RunStepDeltaStepDetailsToolCallsCodeObject) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *RunStepDeltaStepDetailsToolCallsCodeObject) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *RunStepDeltaStepDetailsToolCallsCodeObject) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *RunStepDeltaStepDetailsToolCallsCodeObject) HasId() bool`

HasId returns a boolean if a field has been set.

### GetType

`func (o *RunStepDeltaStepDetailsToolCallsCodeObject) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RunStepDeltaStepDetailsToolCallsCodeObject) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RunStepDeltaStepDetailsToolCallsCodeObject) SetType(v string)`

SetType sets Type field to given value.


### GetCodeInterpreter

`func (o *RunStepDeltaStepDetailsToolCallsCodeObject) GetCodeInterpreter() RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter`

GetCodeInterpreter returns the CodeInterpreter field if non-nil, zero value otherwise.

### GetCodeInterpreterOk

`func (o *RunStepDeltaStepDetailsToolCallsCodeObject) GetCodeInterpreterOk() (*RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter, bool)`

GetCodeInterpreterOk returns a tuple with the CodeInterpreter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCodeInterpreter

`func (o *RunStepDeltaStepDetailsToolCallsCodeObject) SetCodeInterpreter(v RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter)`

SetCodeInterpreter sets CodeInterpreter field to given value.

### HasCodeInterpreter

`func (o *RunStepDeltaStepDetailsToolCallsCodeObject) HasCodeInterpreter() bool`

HasCodeInterpreter returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


