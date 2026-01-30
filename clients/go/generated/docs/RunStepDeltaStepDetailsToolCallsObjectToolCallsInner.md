# RunStepDeltaStepDetailsToolCallsObjectToolCallsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **int32** | The index of the tool call in the tool calls array. | 
**Id** | Pointer to **string** | The ID of the tool call object. | [optional] 
**Type** | **string** | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | 
**CodeInterpreter** | Pointer to [**RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  | [optional] 
**FileSearch** | **map[string]interface{}** | For now, this is always going to be an empty object. | 
**Function** | Pointer to [**RunStepDeltaStepDetailsToolCallsFunctionObjectFunction**](RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.md) |  | [optional] 

## Methods

### NewRunStepDeltaStepDetailsToolCallsObjectToolCallsInner

`func NewRunStepDeltaStepDetailsToolCallsObjectToolCallsInner(index int32, type_ string, fileSearch map[string]interface{}, ) *RunStepDeltaStepDetailsToolCallsObjectToolCallsInner`

NewRunStepDeltaStepDetailsToolCallsObjectToolCallsInner instantiates a new RunStepDeltaStepDetailsToolCallsObjectToolCallsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunStepDeltaStepDetailsToolCallsObjectToolCallsInnerWithDefaults

`func NewRunStepDeltaStepDetailsToolCallsObjectToolCallsInnerWithDefaults() *RunStepDeltaStepDetailsToolCallsObjectToolCallsInner`

NewRunStepDeltaStepDetailsToolCallsObjectToolCallsInnerWithDefaults instantiates a new RunStepDeltaStepDetailsToolCallsObjectToolCallsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIndex

`func (o *RunStepDeltaStepDetailsToolCallsObjectToolCallsInner) GetIndex() int32`

GetIndex returns the Index field if non-nil, zero value otherwise.

### GetIndexOk

`func (o *RunStepDeltaStepDetailsToolCallsObjectToolCallsInner) GetIndexOk() (*int32, bool)`

GetIndexOk returns a tuple with the Index field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndex

`func (o *RunStepDeltaStepDetailsToolCallsObjectToolCallsInner) SetIndex(v int32)`

SetIndex sets Index field to given value.


### GetId

`func (o *RunStepDeltaStepDetailsToolCallsObjectToolCallsInner) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *RunStepDeltaStepDetailsToolCallsObjectToolCallsInner) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *RunStepDeltaStepDetailsToolCallsObjectToolCallsInner) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *RunStepDeltaStepDetailsToolCallsObjectToolCallsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetType

`func (o *RunStepDeltaStepDetailsToolCallsObjectToolCallsInner) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RunStepDeltaStepDetailsToolCallsObjectToolCallsInner) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RunStepDeltaStepDetailsToolCallsObjectToolCallsInner) SetType(v string)`

SetType sets Type field to given value.


### GetCodeInterpreter

`func (o *RunStepDeltaStepDetailsToolCallsObjectToolCallsInner) GetCodeInterpreter() RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter`

GetCodeInterpreter returns the CodeInterpreter field if non-nil, zero value otherwise.

### GetCodeInterpreterOk

`func (o *RunStepDeltaStepDetailsToolCallsObjectToolCallsInner) GetCodeInterpreterOk() (*RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter, bool)`

GetCodeInterpreterOk returns a tuple with the CodeInterpreter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCodeInterpreter

`func (o *RunStepDeltaStepDetailsToolCallsObjectToolCallsInner) SetCodeInterpreter(v RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter)`

SetCodeInterpreter sets CodeInterpreter field to given value.

### HasCodeInterpreter

`func (o *RunStepDeltaStepDetailsToolCallsObjectToolCallsInner) HasCodeInterpreter() bool`

HasCodeInterpreter returns a boolean if a field has been set.

### GetFileSearch

`func (o *RunStepDeltaStepDetailsToolCallsObjectToolCallsInner) GetFileSearch() map[string]interface{}`

GetFileSearch returns the FileSearch field if non-nil, zero value otherwise.

### GetFileSearchOk

`func (o *RunStepDeltaStepDetailsToolCallsObjectToolCallsInner) GetFileSearchOk() (*map[string]interface{}, bool)`

GetFileSearchOk returns a tuple with the FileSearch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileSearch

`func (o *RunStepDeltaStepDetailsToolCallsObjectToolCallsInner) SetFileSearch(v map[string]interface{})`

SetFileSearch sets FileSearch field to given value.


### GetFunction

`func (o *RunStepDeltaStepDetailsToolCallsObjectToolCallsInner) GetFunction() RunStepDeltaStepDetailsToolCallsFunctionObjectFunction`

GetFunction returns the Function field if non-nil, zero value otherwise.

### GetFunctionOk

`func (o *RunStepDeltaStepDetailsToolCallsObjectToolCallsInner) GetFunctionOk() (*RunStepDeltaStepDetailsToolCallsFunctionObjectFunction, bool)`

GetFunctionOk returns a tuple with the Function field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFunction

`func (o *RunStepDeltaStepDetailsToolCallsObjectToolCallsInner) SetFunction(v RunStepDeltaStepDetailsToolCallsFunctionObjectFunction)`

SetFunction sets Function field to given value.

### HasFunction

`func (o *RunStepDeltaStepDetailsToolCallsObjectToolCallsInner) HasFunction() bool`

HasFunction returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


