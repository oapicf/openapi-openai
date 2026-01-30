# RunStepDetailsToolCallsFileSearchObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The ID of the tool call object. | 
**Type** | **string** | The type of tool call. This is always going to be &#x60;file_search&#x60; for this type of tool call. | 
**FileSearch** | [**RunStepDetailsToolCallsFileSearchObjectFileSearch**](RunStepDetailsToolCallsFileSearchObjectFileSearch.md) |  | 

## Methods

### NewRunStepDetailsToolCallsFileSearchObject

`func NewRunStepDetailsToolCallsFileSearchObject(id string, type_ string, fileSearch RunStepDetailsToolCallsFileSearchObjectFileSearch, ) *RunStepDetailsToolCallsFileSearchObject`

NewRunStepDetailsToolCallsFileSearchObject instantiates a new RunStepDetailsToolCallsFileSearchObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunStepDetailsToolCallsFileSearchObjectWithDefaults

`func NewRunStepDetailsToolCallsFileSearchObjectWithDefaults() *RunStepDetailsToolCallsFileSearchObject`

NewRunStepDetailsToolCallsFileSearchObjectWithDefaults instantiates a new RunStepDetailsToolCallsFileSearchObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *RunStepDetailsToolCallsFileSearchObject) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *RunStepDetailsToolCallsFileSearchObject) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *RunStepDetailsToolCallsFileSearchObject) SetId(v string)`

SetId sets Id field to given value.


### GetType

`func (o *RunStepDetailsToolCallsFileSearchObject) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RunStepDetailsToolCallsFileSearchObject) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RunStepDetailsToolCallsFileSearchObject) SetType(v string)`

SetType sets Type field to given value.


### GetFileSearch

`func (o *RunStepDetailsToolCallsFileSearchObject) GetFileSearch() RunStepDetailsToolCallsFileSearchObjectFileSearch`

GetFileSearch returns the FileSearch field if non-nil, zero value otherwise.

### GetFileSearchOk

`func (o *RunStepDetailsToolCallsFileSearchObject) GetFileSearchOk() (*RunStepDetailsToolCallsFileSearchObjectFileSearch, bool)`

GetFileSearchOk returns a tuple with the FileSearch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileSearch

`func (o *RunStepDetailsToolCallsFileSearchObject) SetFileSearch(v RunStepDetailsToolCallsFileSearchObjectFileSearch)`

SetFileSearch sets FileSearch field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


