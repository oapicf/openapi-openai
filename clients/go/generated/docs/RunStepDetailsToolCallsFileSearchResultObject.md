# RunStepDetailsToolCallsFileSearchResultObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FileId** | **string** | The ID of the file that result was found in. | 
**FileName** | **string** | The name of the file that result was found in. | 
**Score** | **float32** | The score of the result. All values must be a floating point number between 0 and 1. | 
**Content** | Pointer to [**[]RunStepDetailsToolCallsFileSearchResultObjectContentInner**](RunStepDetailsToolCallsFileSearchResultObjectContentInner.md) | The content of the result that was found. The content is only included if requested via the include query parameter. | [optional] 

## Methods

### NewRunStepDetailsToolCallsFileSearchResultObject

`func NewRunStepDetailsToolCallsFileSearchResultObject(fileId string, fileName string, score float32, ) *RunStepDetailsToolCallsFileSearchResultObject`

NewRunStepDetailsToolCallsFileSearchResultObject instantiates a new RunStepDetailsToolCallsFileSearchResultObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunStepDetailsToolCallsFileSearchResultObjectWithDefaults

`func NewRunStepDetailsToolCallsFileSearchResultObjectWithDefaults() *RunStepDetailsToolCallsFileSearchResultObject`

NewRunStepDetailsToolCallsFileSearchResultObjectWithDefaults instantiates a new RunStepDetailsToolCallsFileSearchResultObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFileId

`func (o *RunStepDetailsToolCallsFileSearchResultObject) GetFileId() string`

GetFileId returns the FileId field if non-nil, zero value otherwise.

### GetFileIdOk

`func (o *RunStepDetailsToolCallsFileSearchResultObject) GetFileIdOk() (*string, bool)`

GetFileIdOk returns a tuple with the FileId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileId

`func (o *RunStepDetailsToolCallsFileSearchResultObject) SetFileId(v string)`

SetFileId sets FileId field to given value.


### GetFileName

`func (o *RunStepDetailsToolCallsFileSearchResultObject) GetFileName() string`

GetFileName returns the FileName field if non-nil, zero value otherwise.

### GetFileNameOk

`func (o *RunStepDetailsToolCallsFileSearchResultObject) GetFileNameOk() (*string, bool)`

GetFileNameOk returns a tuple with the FileName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileName

`func (o *RunStepDetailsToolCallsFileSearchResultObject) SetFileName(v string)`

SetFileName sets FileName field to given value.


### GetScore

`func (o *RunStepDetailsToolCallsFileSearchResultObject) GetScore() float32`

GetScore returns the Score field if non-nil, zero value otherwise.

### GetScoreOk

`func (o *RunStepDetailsToolCallsFileSearchResultObject) GetScoreOk() (*float32, bool)`

GetScoreOk returns a tuple with the Score field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScore

`func (o *RunStepDetailsToolCallsFileSearchResultObject) SetScore(v float32)`

SetScore sets Score field to given value.


### GetContent

`func (o *RunStepDetailsToolCallsFileSearchResultObject) GetContent() []RunStepDetailsToolCallsFileSearchResultObjectContentInner`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *RunStepDetailsToolCallsFileSearchResultObject) GetContentOk() (*[]RunStepDetailsToolCallsFileSearchResultObjectContentInner, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *RunStepDetailsToolCallsFileSearchResultObject) SetContent(v []RunStepDetailsToolCallsFileSearchResultObjectContentInner)`

SetContent sets Content field to given value.

### HasContent

`func (o *RunStepDetailsToolCallsFileSearchResultObject) HasContent() bool`

HasContent returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


