# MessageDeltaContentTextObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **int32** | The index of the content part in the message. | 
**Type** | **string** | Always &#x60;text&#x60;. | 
**Text** | Pointer to [**MessageDeltaContentTextObjectText**](MessageDeltaContentTextObjectText.md) |  | [optional] 

## Methods

### NewMessageDeltaContentTextObject

`func NewMessageDeltaContentTextObject(index int32, type_ string, ) *MessageDeltaContentTextObject`

NewMessageDeltaContentTextObject instantiates a new MessageDeltaContentTextObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageDeltaContentTextObjectWithDefaults

`func NewMessageDeltaContentTextObjectWithDefaults() *MessageDeltaContentTextObject`

NewMessageDeltaContentTextObjectWithDefaults instantiates a new MessageDeltaContentTextObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIndex

`func (o *MessageDeltaContentTextObject) GetIndex() int32`

GetIndex returns the Index field if non-nil, zero value otherwise.

### GetIndexOk

`func (o *MessageDeltaContentTextObject) GetIndexOk() (*int32, bool)`

GetIndexOk returns a tuple with the Index field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndex

`func (o *MessageDeltaContentTextObject) SetIndex(v int32)`

SetIndex sets Index field to given value.


### GetType

`func (o *MessageDeltaContentTextObject) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *MessageDeltaContentTextObject) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *MessageDeltaContentTextObject) SetType(v string)`

SetType sets Type field to given value.


### GetText

`func (o *MessageDeltaContentTextObject) GetText() MessageDeltaContentTextObjectText`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *MessageDeltaContentTextObject) GetTextOk() (*MessageDeltaContentTextObjectText, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *MessageDeltaContentTextObject) SetText(v MessageDeltaContentTextObjectText)`

SetText sets Text field to given value.

### HasText

`func (o *MessageDeltaContentTextObject) HasText() bool`

HasText returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


