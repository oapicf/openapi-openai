# RunStepDeltaStepDetailsToolCallsFunctionObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **int32** | The index of the tool call in the tool calls array. | 
**Id** | Pointer to **string** | The ID of the tool call object. | [optional] 
**Type** | **string** | The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call. | 
**Function** | Pointer to [**RunStepDeltaStepDetailsToolCallsFunctionObjectFunction**](RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.md) |  | [optional] 

## Methods

### NewRunStepDeltaStepDetailsToolCallsFunctionObject

`func NewRunStepDeltaStepDetailsToolCallsFunctionObject(index int32, type_ string, ) *RunStepDeltaStepDetailsToolCallsFunctionObject`

NewRunStepDeltaStepDetailsToolCallsFunctionObject instantiates a new RunStepDeltaStepDetailsToolCallsFunctionObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunStepDeltaStepDetailsToolCallsFunctionObjectWithDefaults

`func NewRunStepDeltaStepDetailsToolCallsFunctionObjectWithDefaults() *RunStepDeltaStepDetailsToolCallsFunctionObject`

NewRunStepDeltaStepDetailsToolCallsFunctionObjectWithDefaults instantiates a new RunStepDeltaStepDetailsToolCallsFunctionObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIndex

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObject) GetIndex() int32`

GetIndex returns the Index field if non-nil, zero value otherwise.

### GetIndexOk

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObject) GetIndexOk() (*int32, bool)`

GetIndexOk returns a tuple with the Index field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndex

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObject) SetIndex(v int32)`

SetIndex sets Index field to given value.


### GetId

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObject) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObject) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObject) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObject) HasId() bool`

HasId returns a boolean if a field has been set.

### GetType

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObject) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObject) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObject) SetType(v string)`

SetType sets Type field to given value.


### GetFunction

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObject) GetFunction() RunStepDeltaStepDetailsToolCallsFunctionObjectFunction`

GetFunction returns the Function field if non-nil, zero value otherwise.

### GetFunctionOk

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObject) GetFunctionOk() (*RunStepDeltaStepDetailsToolCallsFunctionObjectFunction, bool)`

GetFunctionOk returns a tuple with the Function field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFunction

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObject) SetFunction(v RunStepDeltaStepDetailsToolCallsFunctionObjectFunction)`

SetFunction sets Function field to given value.

### HasFunction

`func (o *RunStepDeltaStepDetailsToolCallsFunctionObject) HasFunction() bool`

HasFunction returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


