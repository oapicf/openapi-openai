# MessageContentTextObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Always &#x60;text&#x60;. | 
**Text** | [**MessageContentTextObjectText**](MessageContentTextObjectText.md) |  | 

## Methods

### NewMessageContentTextObject

`func NewMessageContentTextObject(type_ string, text MessageContentTextObjectText, ) *MessageContentTextObject`

NewMessageContentTextObject instantiates a new MessageContentTextObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageContentTextObjectWithDefaults

`func NewMessageContentTextObjectWithDefaults() *MessageContentTextObject`

NewMessageContentTextObjectWithDefaults instantiates a new MessageContentTextObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *MessageContentTextObject) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *MessageContentTextObject) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *MessageContentTextObject) SetType(v string)`

SetType sets Type field to given value.


### GetText

`func (o *MessageContentTextObject) GetText() MessageContentTextObjectText`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *MessageContentTextObject) GetTextOk() (*MessageContentTextObjectText, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *MessageContentTextObject) SetText(v MessageContentTextObjectText)`

SetText sets Text field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


