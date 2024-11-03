# MessageDeltaContentTextAnnotationsFileCitationObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **int32** | The index of the annotation in the text content part. | 
**Type** | **string** | Always &#x60;file_citation&#x60;. | 
**Text** | Pointer to **string** | The text in the message content that needs to be replaced. | [optional] 
**FileCitation** | Pointer to [**MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation**](MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.md) |  | [optional] 
**StartIndex** | Pointer to **int32** |  | [optional] 
**EndIndex** | Pointer to **int32** |  | [optional] 

## Methods

### NewMessageDeltaContentTextAnnotationsFileCitationObject

`func NewMessageDeltaContentTextAnnotationsFileCitationObject(index int32, type_ string, ) *MessageDeltaContentTextAnnotationsFileCitationObject`

NewMessageDeltaContentTextAnnotationsFileCitationObject instantiates a new MessageDeltaContentTextAnnotationsFileCitationObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageDeltaContentTextAnnotationsFileCitationObjectWithDefaults

`func NewMessageDeltaContentTextAnnotationsFileCitationObjectWithDefaults() *MessageDeltaContentTextAnnotationsFileCitationObject`

NewMessageDeltaContentTextAnnotationsFileCitationObjectWithDefaults instantiates a new MessageDeltaContentTextAnnotationsFileCitationObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIndex

`func (o *MessageDeltaContentTextAnnotationsFileCitationObject) GetIndex() int32`

GetIndex returns the Index field if non-nil, zero value otherwise.

### GetIndexOk

`func (o *MessageDeltaContentTextAnnotationsFileCitationObject) GetIndexOk() (*int32, bool)`

GetIndexOk returns a tuple with the Index field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndex

`func (o *MessageDeltaContentTextAnnotationsFileCitationObject) SetIndex(v int32)`

SetIndex sets Index field to given value.


### GetType

`func (o *MessageDeltaContentTextAnnotationsFileCitationObject) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *MessageDeltaContentTextAnnotationsFileCitationObject) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *MessageDeltaContentTextAnnotationsFileCitationObject) SetType(v string)`

SetType sets Type field to given value.


### GetText

`func (o *MessageDeltaContentTextAnnotationsFileCitationObject) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *MessageDeltaContentTextAnnotationsFileCitationObject) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *MessageDeltaContentTextAnnotationsFileCitationObject) SetText(v string)`

SetText sets Text field to given value.

### HasText

`func (o *MessageDeltaContentTextAnnotationsFileCitationObject) HasText() bool`

HasText returns a boolean if a field has been set.

### GetFileCitation

`func (o *MessageDeltaContentTextAnnotationsFileCitationObject) GetFileCitation() MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation`

GetFileCitation returns the FileCitation field if non-nil, zero value otherwise.

### GetFileCitationOk

`func (o *MessageDeltaContentTextAnnotationsFileCitationObject) GetFileCitationOk() (*MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation, bool)`

GetFileCitationOk returns a tuple with the FileCitation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileCitation

`func (o *MessageDeltaContentTextAnnotationsFileCitationObject) SetFileCitation(v MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation)`

SetFileCitation sets FileCitation field to given value.

### HasFileCitation

`func (o *MessageDeltaContentTextAnnotationsFileCitationObject) HasFileCitation() bool`

HasFileCitation returns a boolean if a field has been set.

### GetStartIndex

`func (o *MessageDeltaContentTextAnnotationsFileCitationObject) GetStartIndex() int32`

GetStartIndex returns the StartIndex field if non-nil, zero value otherwise.

### GetStartIndexOk

`func (o *MessageDeltaContentTextAnnotationsFileCitationObject) GetStartIndexOk() (*int32, bool)`

GetStartIndexOk returns a tuple with the StartIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartIndex

`func (o *MessageDeltaContentTextAnnotationsFileCitationObject) SetStartIndex(v int32)`

SetStartIndex sets StartIndex field to given value.

### HasStartIndex

`func (o *MessageDeltaContentTextAnnotationsFileCitationObject) HasStartIndex() bool`

HasStartIndex returns a boolean if a field has been set.

### GetEndIndex

`func (o *MessageDeltaContentTextAnnotationsFileCitationObject) GetEndIndex() int32`

GetEndIndex returns the EndIndex field if non-nil, zero value otherwise.

### GetEndIndexOk

`func (o *MessageDeltaContentTextAnnotationsFileCitationObject) GetEndIndexOk() (*int32, bool)`

GetEndIndexOk returns a tuple with the EndIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndIndex

`func (o *MessageDeltaContentTextAnnotationsFileCitationObject) SetEndIndex(v int32)`

SetEndIndex sets EndIndex field to given value.

### HasEndIndex

`func (o *MessageDeltaContentTextAnnotationsFileCitationObject) HasEndIndex() bool`

HasEndIndex returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


