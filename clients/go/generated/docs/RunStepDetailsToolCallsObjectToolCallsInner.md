# RunStepDetailsToolCallsObjectToolCallsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The ID of the tool call object. | 
**Type** | **string** | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | 
**CodeInterpreter** | [**RunStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  | 
**FileSearch** | [**RunStepDetailsToolCallsFileSearchObjectFileSearch**](RunStepDetailsToolCallsFileSearchObjectFileSearch.md) |  | 
**Function** | [**RunStepDetailsToolCallsFunctionObjectFunction**](RunStepDetailsToolCallsFunctionObjectFunction.md) |  | 

## Methods

### NewRunStepDetailsToolCallsObjectToolCallsInner

`func NewRunStepDetailsToolCallsObjectToolCallsInner(id string, type_ string, codeInterpreter RunStepDetailsToolCallsCodeObjectCodeInterpreter, fileSearch RunStepDetailsToolCallsFileSearchObjectFileSearch, function RunStepDetailsToolCallsFunctionObjectFunction, ) *RunStepDetailsToolCallsObjectToolCallsInner`

NewRunStepDetailsToolCallsObjectToolCallsInner instantiates a new RunStepDetailsToolCallsObjectToolCallsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunStepDetailsToolCallsObjectToolCallsInnerWithDefaults

`func NewRunStepDetailsToolCallsObjectToolCallsInnerWithDefaults() *RunStepDetailsToolCallsObjectToolCallsInner`

NewRunStepDetailsToolCallsObjectToolCallsInnerWithDefaults instantiates a new RunStepDetailsToolCallsObjectToolCallsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *RunStepDetailsToolCallsObjectToolCallsInner) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *RunStepDetailsToolCallsObjectToolCallsInner) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *RunStepDetailsToolCallsObjectToolCallsInner) SetId(v string)`

SetId sets Id field to given value.


### GetType

`func (o *RunStepDetailsToolCallsObjectToolCallsInner) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RunStepDetailsToolCallsObjectToolCallsInner) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RunStepDetailsToolCallsObjectToolCallsInner) SetType(v string)`

SetType sets Type field to given value.


### GetCodeInterpreter

`func (o *RunStepDetailsToolCallsObjectToolCallsInner) GetCodeInterpreter() RunStepDetailsToolCallsCodeObjectCodeInterpreter`

GetCodeInterpreter returns the CodeInterpreter field if non-nil, zero value otherwise.

### GetCodeInterpreterOk

`func (o *RunStepDetailsToolCallsObjectToolCallsInner) GetCodeInterpreterOk() (*RunStepDetailsToolCallsCodeObjectCodeInterpreter, bool)`

GetCodeInterpreterOk returns a tuple with the CodeInterpreter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCodeInterpreter

`func (o *RunStepDetailsToolCallsObjectToolCallsInner) SetCodeInterpreter(v RunStepDetailsToolCallsCodeObjectCodeInterpreter)`

SetCodeInterpreter sets CodeInterpreter field to given value.


### GetFileSearch

`func (o *RunStepDetailsToolCallsObjectToolCallsInner) GetFileSearch() RunStepDetailsToolCallsFileSearchObjectFileSearch`

GetFileSearch returns the FileSearch field if non-nil, zero value otherwise.

### GetFileSearchOk

`func (o *RunStepDetailsToolCallsObjectToolCallsInner) GetFileSearchOk() (*RunStepDetailsToolCallsFileSearchObjectFileSearch, bool)`

GetFileSearchOk returns a tuple with the FileSearch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileSearch

`func (o *RunStepDetailsToolCallsObjectToolCallsInner) SetFileSearch(v RunStepDetailsToolCallsFileSearchObjectFileSearch)`

SetFileSearch sets FileSearch field to given value.


### GetFunction

`func (o *RunStepDetailsToolCallsObjectToolCallsInner) GetFunction() RunStepDetailsToolCallsFunctionObjectFunction`

GetFunction returns the Function field if non-nil, zero value otherwise.

### GetFunctionOk

`func (o *RunStepDetailsToolCallsObjectToolCallsInner) GetFunctionOk() (*RunStepDetailsToolCallsFunctionObjectFunction, bool)`

GetFunctionOk returns a tuple with the Function field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFunction

`func (o *RunStepDetailsToolCallsObjectToolCallsInner) SetFunction(v RunStepDetailsToolCallsFunctionObjectFunction)`

SetFunction sets Function field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


