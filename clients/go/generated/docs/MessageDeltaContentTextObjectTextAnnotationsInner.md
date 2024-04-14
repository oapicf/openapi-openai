# MessageDeltaContentTextObjectTextAnnotationsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **int32** | The index of the annotation in the text content part. | 
**Type** | **string** | Always &#x60;file_citation&#x60;. | 
**Text** | Pointer to **string** | The text in the message content that needs to be replaced. | [optional] 
**FileCitation** | Pointer to [**MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation**](MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.md) |  | [optional] 
**StartIndex** | Pointer to **int32** |  | [optional] 
**EndIndex** | Pointer to **int32** |  | [optional] 
**FilePath** | Pointer to [**MessageDeltaContentTextAnnotationsFilePathObjectFilePath**](MessageDeltaContentTextAnnotationsFilePathObjectFilePath.md) |  | [optional] 

## Methods

### NewMessageDeltaContentTextObjectTextAnnotationsInner

`func NewMessageDeltaContentTextObjectTextAnnotationsInner(index int32, type_ string, ) *MessageDeltaContentTextObjectTextAnnotationsInner`

NewMessageDeltaContentTextObjectTextAnnotationsInner instantiates a new MessageDeltaContentTextObjectTextAnnotationsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageDeltaContentTextObjectTextAnnotationsInnerWithDefaults

`func NewMessageDeltaContentTextObjectTextAnnotationsInnerWithDefaults() *MessageDeltaContentTextObjectTextAnnotationsInner`

NewMessageDeltaContentTextObjectTextAnnotationsInnerWithDefaults instantiates a new MessageDeltaContentTextObjectTextAnnotationsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIndex

`func (o *MessageDeltaContentTextObjectTextAnnotationsInner) GetIndex() int32`

GetIndex returns the Index field if non-nil, zero value otherwise.

### GetIndexOk

`func (o *MessageDeltaContentTextObjectTextAnnotationsInner) GetIndexOk() (*int32, bool)`

GetIndexOk returns a tuple with the Index field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndex

`func (o *MessageDeltaContentTextObjectTextAnnotationsInner) SetIndex(v int32)`

SetIndex sets Index field to given value.


### GetType

`func (o *MessageDeltaContentTextObjectTextAnnotationsInner) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *MessageDeltaContentTextObjectTextAnnotationsInner) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *MessageDeltaContentTextObjectTextAnnotationsInner) SetType(v string)`

SetType sets Type field to given value.


### GetText

`func (o *MessageDeltaContentTextObjectTextAnnotationsInner) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *MessageDeltaContentTextObjectTextAnnotationsInner) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *MessageDeltaContentTextObjectTextAnnotationsInner) SetText(v string)`

SetText sets Text field to given value.

### HasText

`func (o *MessageDeltaContentTextObjectTextAnnotationsInner) HasText() bool`

HasText returns a boolean if a field has been set.

### GetFileCitation

`func (o *MessageDeltaContentTextObjectTextAnnotationsInner) GetFileCitation() MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation`

GetFileCitation returns the FileCitation field if non-nil, zero value otherwise.

### GetFileCitationOk

`func (o *MessageDeltaContentTextObjectTextAnnotationsInner) GetFileCitationOk() (*MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation, bool)`

GetFileCitationOk returns a tuple with the FileCitation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileCitation

`func (o *MessageDeltaContentTextObjectTextAnnotationsInner) SetFileCitation(v MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation)`

SetFileCitation sets FileCitation field to given value.

### HasFileCitation

`func (o *MessageDeltaContentTextObjectTextAnnotationsInner) HasFileCitation() bool`

HasFileCitation returns a boolean if a field has been set.

### GetStartIndex

`func (o *MessageDeltaContentTextObjectTextAnnotationsInner) GetStartIndex() int32`

GetStartIndex returns the StartIndex field if non-nil, zero value otherwise.

### GetStartIndexOk

`func (o *MessageDeltaContentTextObjectTextAnnotationsInner) GetStartIndexOk() (*int32, bool)`

GetStartIndexOk returns a tuple with the StartIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartIndex

`func (o *MessageDeltaContentTextObjectTextAnnotationsInner) SetStartIndex(v int32)`

SetStartIndex sets StartIndex field to given value.

### HasStartIndex

`func (o *MessageDeltaContentTextObjectTextAnnotationsInner) HasStartIndex() bool`

HasStartIndex returns a boolean if a field has been set.

### GetEndIndex

`func (o *MessageDeltaContentTextObjectTextAnnotationsInner) GetEndIndex() int32`

GetEndIndex returns the EndIndex field if non-nil, zero value otherwise.

### GetEndIndexOk

`func (o *MessageDeltaContentTextObjectTextAnnotationsInner) GetEndIndexOk() (*int32, bool)`

GetEndIndexOk returns a tuple with the EndIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndIndex

`func (o *MessageDeltaContentTextObjectTextAnnotationsInner) SetEndIndex(v int32)`

SetEndIndex sets EndIndex field to given value.

### HasEndIndex

`func (o *MessageDeltaContentTextObjectTextAnnotationsInner) HasEndIndex() bool`

HasEndIndex returns a boolean if a field has been set.

### GetFilePath

`func (o *MessageDeltaContentTextObjectTextAnnotationsInner) GetFilePath() MessageDeltaContentTextAnnotationsFilePathObjectFilePath`

GetFilePath returns the FilePath field if non-nil, zero value otherwise.

### GetFilePathOk

`func (o *MessageDeltaContentTextObjectTextAnnotationsInner) GetFilePathOk() (*MessageDeltaContentTextAnnotationsFilePathObjectFilePath, bool)`

GetFilePathOk returns a tuple with the FilePath field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilePath

`func (o *MessageDeltaContentTextObjectTextAnnotationsInner) SetFilePath(v MessageDeltaContentTextAnnotationsFilePathObjectFilePath)`

SetFilePath sets FilePath field to given value.

### HasFilePath

`func (o *MessageDeltaContentTextObjectTextAnnotationsInner) HasFilePath() bool`

HasFilePath returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


