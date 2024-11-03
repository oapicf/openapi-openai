# RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **int32** | The index of the output in the outputs array. | 
**Type** | **string** | Always &#x60;logs&#x60;. | 
**Logs** | Pointer to **string** | The text output from the Code Interpreter tool call. | [optional] 

## Methods

### NewRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject

`func NewRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(index int32, type_ string, ) *RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject`

NewRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject instantiates a new RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectWithDefaults

`func NewRunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectWithDefaults() *RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject`

NewRunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectWithDefaults instantiates a new RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIndex

`func (o *RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject) GetIndex() int32`

GetIndex returns the Index field if non-nil, zero value otherwise.

### GetIndexOk

`func (o *RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject) GetIndexOk() (*int32, bool)`

GetIndexOk returns a tuple with the Index field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndex

`func (o *RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject) SetIndex(v int32)`

SetIndex sets Index field to given value.


### GetType

`func (o *RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject) SetType(v string)`

SetType sets Type field to given value.


### GetLogs

`func (o *RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject) GetLogs() string`

GetLogs returns the Logs field if non-nil, zero value otherwise.

### GetLogsOk

`func (o *RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject) GetLogsOk() (*string, bool)`

GetLogsOk returns a tuple with the Logs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogs

`func (o *RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject) SetLogs(v string)`

SetLogs sets Logs field to given value.

### HasLogs

`func (o *RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject) HasLogs() bool`

HasLogs returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


