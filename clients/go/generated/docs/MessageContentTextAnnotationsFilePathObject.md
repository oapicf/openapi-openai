# MessageContentTextAnnotationsFilePathObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Always &#x60;file_path&#x60;. | 
**Text** | **string** | The text in the message content that needs to be replaced. | 
**FilePath** | [**MessageContentTextAnnotationsFilePathObjectFilePath**](MessageContentTextAnnotationsFilePathObjectFilePath.md) |  | 
**StartIndex** | **int32** |  | 
**EndIndex** | **int32** |  | 

## Methods

### NewMessageContentTextAnnotationsFilePathObject

`func NewMessageContentTextAnnotationsFilePathObject(type_ string, text string, filePath MessageContentTextAnnotationsFilePathObjectFilePath, startIndex int32, endIndex int32, ) *MessageContentTextAnnotationsFilePathObject`

NewMessageContentTextAnnotationsFilePathObject instantiates a new MessageContentTextAnnotationsFilePathObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageContentTextAnnotationsFilePathObjectWithDefaults

`func NewMessageContentTextAnnotationsFilePathObjectWithDefaults() *MessageContentTextAnnotationsFilePathObject`

NewMessageContentTextAnnotationsFilePathObjectWithDefaults instantiates a new MessageContentTextAnnotationsFilePathObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *MessageContentTextAnnotationsFilePathObject) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *MessageContentTextAnnotationsFilePathObject) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *MessageContentTextAnnotationsFilePathObject) SetType(v string)`

SetType sets Type field to given value.


### GetText

`func (o *MessageContentTextAnnotationsFilePathObject) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *MessageContentTextAnnotationsFilePathObject) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *MessageContentTextAnnotationsFilePathObject) SetText(v string)`

SetText sets Text field to given value.


### GetFilePath

`func (o *MessageContentTextAnnotationsFilePathObject) GetFilePath() MessageContentTextAnnotationsFilePathObjectFilePath`

GetFilePath returns the FilePath field if non-nil, zero value otherwise.

### GetFilePathOk

`func (o *MessageContentTextAnnotationsFilePathObject) GetFilePathOk() (*MessageContentTextAnnotationsFilePathObjectFilePath, bool)`

GetFilePathOk returns a tuple with the FilePath field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilePath

`func (o *MessageContentTextAnnotationsFilePathObject) SetFilePath(v MessageContentTextAnnotationsFilePathObjectFilePath)`

SetFilePath sets FilePath field to given value.


### GetStartIndex

`func (o *MessageContentTextAnnotationsFilePathObject) GetStartIndex() int32`

GetStartIndex returns the StartIndex field if non-nil, zero value otherwise.

### GetStartIndexOk

`func (o *MessageContentTextAnnotationsFilePathObject) GetStartIndexOk() (*int32, bool)`

GetStartIndexOk returns a tuple with the StartIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartIndex

`func (o *MessageContentTextAnnotationsFilePathObject) SetStartIndex(v int32)`

SetStartIndex sets StartIndex field to given value.


### GetEndIndex

`func (o *MessageContentTextAnnotationsFilePathObject) GetEndIndex() int32`

GetEndIndex returns the EndIndex field if non-nil, zero value otherwise.

### GetEndIndexOk

`func (o *MessageContentTextAnnotationsFilePathObject) GetEndIndexOk() (*int32, bool)`

GetEndIndexOk returns a tuple with the EndIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndIndex

`func (o *MessageContentTextAnnotationsFilePathObject) SetEndIndex(v int32)`

SetEndIndex sets EndIndex field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


