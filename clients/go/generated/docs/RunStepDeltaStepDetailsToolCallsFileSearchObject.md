# RunStepDeltaStepDetailsToolCallsFileSearchObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **int32** | The index of the tool call in the tool calls array. | 
**Id** | Pointer to **string** | The ID of the tool call object. | [optional] 
**Type** | **string** | The type of tool call. This is always going to be &#x60;file_search&#x60; for this type of tool call. | 
**FileSearch** | **map[string]interface{}** | For now, this is always going to be an empty object. | 

## Methods

### NewRunStepDeltaStepDetailsToolCallsFileSearchObject

`func NewRunStepDeltaStepDetailsToolCallsFileSearchObject(index int32, type_ string, fileSearch map[string]interface{}, ) *RunStepDeltaStepDetailsToolCallsFileSearchObject`

NewRunStepDeltaStepDetailsToolCallsFileSearchObject instantiates a new RunStepDeltaStepDetailsToolCallsFileSearchObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunStepDeltaStepDetailsToolCallsFileSearchObjectWithDefaults

`func NewRunStepDeltaStepDetailsToolCallsFileSearchObjectWithDefaults() *RunStepDeltaStepDetailsToolCallsFileSearchObject`

NewRunStepDeltaStepDetailsToolCallsFileSearchObjectWithDefaults instantiates a new RunStepDeltaStepDetailsToolCallsFileSearchObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIndex

`func (o *RunStepDeltaStepDetailsToolCallsFileSearchObject) GetIndex() int32`

GetIndex returns the Index field if non-nil, zero value otherwise.

### GetIndexOk

`func (o *RunStepDeltaStepDetailsToolCallsFileSearchObject) GetIndexOk() (*int32, bool)`

GetIndexOk returns a tuple with the Index field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndex

`func (o *RunStepDeltaStepDetailsToolCallsFileSearchObject) SetIndex(v int32)`

SetIndex sets Index field to given value.


### GetId

`func (o *RunStepDeltaStepDetailsToolCallsFileSearchObject) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *RunStepDeltaStepDetailsToolCallsFileSearchObject) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *RunStepDeltaStepDetailsToolCallsFileSearchObject) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *RunStepDeltaStepDetailsToolCallsFileSearchObject) HasId() bool`

HasId returns a boolean if a field has been set.

### GetType

`func (o *RunStepDeltaStepDetailsToolCallsFileSearchObject) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RunStepDeltaStepDetailsToolCallsFileSearchObject) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RunStepDeltaStepDetailsToolCallsFileSearchObject) SetType(v string)`

SetType sets Type field to given value.


### GetFileSearch

`func (o *RunStepDeltaStepDetailsToolCallsFileSearchObject) GetFileSearch() map[string]interface{}`

GetFileSearch returns the FileSearch field if non-nil, zero value otherwise.

### GetFileSearchOk

`func (o *RunStepDeltaStepDetailsToolCallsFileSearchObject) GetFileSearchOk() (*map[string]interface{}, bool)`

GetFileSearchOk returns a tuple with the FileSearch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileSearch

`func (o *RunStepDeltaStepDetailsToolCallsFileSearchObject) SetFileSearch(v map[string]interface{})`

SetFileSearch sets FileSearch field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


