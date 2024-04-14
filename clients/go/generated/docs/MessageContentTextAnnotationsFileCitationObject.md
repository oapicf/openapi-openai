# MessageContentTextAnnotationsFileCitationObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Always &#x60;file_citation&#x60;. | 
**Text** | **string** | The text in the message content that needs to be replaced. | 
**FileCitation** | [**MessageContentTextAnnotationsFileCitationObjectFileCitation**](MessageContentTextAnnotationsFileCitationObjectFileCitation.md) |  | 
**StartIndex** | **int32** |  | 
**EndIndex** | **int32** |  | 

## Methods

### NewMessageContentTextAnnotationsFileCitationObject

`func NewMessageContentTextAnnotationsFileCitationObject(type_ string, text string, fileCitation MessageContentTextAnnotationsFileCitationObjectFileCitation, startIndex int32, endIndex int32, ) *MessageContentTextAnnotationsFileCitationObject`

NewMessageContentTextAnnotationsFileCitationObject instantiates a new MessageContentTextAnnotationsFileCitationObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageContentTextAnnotationsFileCitationObjectWithDefaults

`func NewMessageContentTextAnnotationsFileCitationObjectWithDefaults() *MessageContentTextAnnotationsFileCitationObject`

NewMessageContentTextAnnotationsFileCitationObjectWithDefaults instantiates a new MessageContentTextAnnotationsFileCitationObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *MessageContentTextAnnotationsFileCitationObject) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *MessageContentTextAnnotationsFileCitationObject) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *MessageContentTextAnnotationsFileCitationObject) SetType(v string)`

SetType sets Type field to given value.


### GetText

`func (o *MessageContentTextAnnotationsFileCitationObject) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *MessageContentTextAnnotationsFileCitationObject) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *MessageContentTextAnnotationsFileCitationObject) SetText(v string)`

SetText sets Text field to given value.


### GetFileCitation

`func (o *MessageContentTextAnnotationsFileCitationObject) GetFileCitation() MessageContentTextAnnotationsFileCitationObjectFileCitation`

GetFileCitation returns the FileCitation field if non-nil, zero value otherwise.

### GetFileCitationOk

`func (o *MessageContentTextAnnotationsFileCitationObject) GetFileCitationOk() (*MessageContentTextAnnotationsFileCitationObjectFileCitation, bool)`

GetFileCitationOk returns a tuple with the FileCitation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileCitation

`func (o *MessageContentTextAnnotationsFileCitationObject) SetFileCitation(v MessageContentTextAnnotationsFileCitationObjectFileCitation)`

SetFileCitation sets FileCitation field to given value.


### GetStartIndex

`func (o *MessageContentTextAnnotationsFileCitationObject) GetStartIndex() int32`

GetStartIndex returns the StartIndex field if non-nil, zero value otherwise.

### GetStartIndexOk

`func (o *MessageContentTextAnnotationsFileCitationObject) GetStartIndexOk() (*int32, bool)`

GetStartIndexOk returns a tuple with the StartIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartIndex

`func (o *MessageContentTextAnnotationsFileCitationObject) SetStartIndex(v int32)`

SetStartIndex sets StartIndex field to given value.


### GetEndIndex

`func (o *MessageContentTextAnnotationsFileCitationObject) GetEndIndex() int32`

GetEndIndex returns the EndIndex field if non-nil, zero value otherwise.

### GetEndIndexOk

`func (o *MessageContentTextAnnotationsFileCitationObject) GetEndIndexOk() (*int32, bool)`

GetEndIndexOk returns a tuple with the EndIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndIndex

`func (o *MessageContentTextAnnotationsFileCitationObject) SetEndIndex(v int32)`

SetEndIndex sets EndIndex field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


