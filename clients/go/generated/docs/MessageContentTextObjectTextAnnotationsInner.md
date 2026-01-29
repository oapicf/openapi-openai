# MessageContentTextObjectTextAnnotationsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Always &#x60;file_citation&#x60;. | 
**Text** | **string** | The text in the message content that needs to be replaced. | 
**FileCitation** | [**MessageContentTextAnnotationsFileCitationObjectFileCitation**](MessageContentTextAnnotationsFileCitationObjectFileCitation.md) |  | 
**StartIndex** | **int32** |  | 
**EndIndex** | **int32** |  | 
**FilePath** | [**MessageContentTextAnnotationsFilePathObjectFilePath**](MessageContentTextAnnotationsFilePathObjectFilePath.md) |  | 

## Methods

### NewMessageContentTextObjectTextAnnotationsInner

`func NewMessageContentTextObjectTextAnnotationsInner(type_ string, text string, fileCitation MessageContentTextAnnotationsFileCitationObjectFileCitation, startIndex int32, endIndex int32, filePath MessageContentTextAnnotationsFilePathObjectFilePath, ) *MessageContentTextObjectTextAnnotationsInner`

NewMessageContentTextObjectTextAnnotationsInner instantiates a new MessageContentTextObjectTextAnnotationsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageContentTextObjectTextAnnotationsInnerWithDefaults

`func NewMessageContentTextObjectTextAnnotationsInnerWithDefaults() *MessageContentTextObjectTextAnnotationsInner`

NewMessageContentTextObjectTextAnnotationsInnerWithDefaults instantiates a new MessageContentTextObjectTextAnnotationsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *MessageContentTextObjectTextAnnotationsInner) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *MessageContentTextObjectTextAnnotationsInner) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *MessageContentTextObjectTextAnnotationsInner) SetType(v string)`

SetType sets Type field to given value.


### GetText

`func (o *MessageContentTextObjectTextAnnotationsInner) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *MessageContentTextObjectTextAnnotationsInner) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *MessageContentTextObjectTextAnnotationsInner) SetText(v string)`

SetText sets Text field to given value.


### GetFileCitation

`func (o *MessageContentTextObjectTextAnnotationsInner) GetFileCitation() MessageContentTextAnnotationsFileCitationObjectFileCitation`

GetFileCitation returns the FileCitation field if non-nil, zero value otherwise.

### GetFileCitationOk

`func (o *MessageContentTextObjectTextAnnotationsInner) GetFileCitationOk() (*MessageContentTextAnnotationsFileCitationObjectFileCitation, bool)`

GetFileCitationOk returns a tuple with the FileCitation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileCitation

`func (o *MessageContentTextObjectTextAnnotationsInner) SetFileCitation(v MessageContentTextAnnotationsFileCitationObjectFileCitation)`

SetFileCitation sets FileCitation field to given value.


### GetStartIndex

`func (o *MessageContentTextObjectTextAnnotationsInner) GetStartIndex() int32`

GetStartIndex returns the StartIndex field if non-nil, zero value otherwise.

### GetStartIndexOk

`func (o *MessageContentTextObjectTextAnnotationsInner) GetStartIndexOk() (*int32, bool)`

GetStartIndexOk returns a tuple with the StartIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartIndex

`func (o *MessageContentTextObjectTextAnnotationsInner) SetStartIndex(v int32)`

SetStartIndex sets StartIndex field to given value.


### GetEndIndex

`func (o *MessageContentTextObjectTextAnnotationsInner) GetEndIndex() int32`

GetEndIndex returns the EndIndex field if non-nil, zero value otherwise.

### GetEndIndexOk

`func (o *MessageContentTextObjectTextAnnotationsInner) GetEndIndexOk() (*int32, bool)`

GetEndIndexOk returns a tuple with the EndIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndIndex

`func (o *MessageContentTextObjectTextAnnotationsInner) SetEndIndex(v int32)`

SetEndIndex sets EndIndex field to given value.


### GetFilePath

`func (o *MessageContentTextObjectTextAnnotationsInner) GetFilePath() MessageContentTextAnnotationsFilePathObjectFilePath`

GetFilePath returns the FilePath field if non-nil, zero value otherwise.

### GetFilePathOk

`func (o *MessageContentTextObjectTextAnnotationsInner) GetFilePathOk() (*MessageContentTextAnnotationsFilePathObjectFilePath, bool)`

GetFilePathOk returns a tuple with the FilePath field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilePath

`func (o *MessageContentTextObjectTextAnnotationsInner) SetFilePath(v MessageContentTextAnnotationsFilePathObjectFilePath)`

SetFilePath sets FilePath field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


