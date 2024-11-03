# MessageDeltaContentTextObjectText

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Value** | Pointer to **string** | The data that makes up the text. | [optional] 
**Annotations** | Pointer to [**[]MessageDeltaContentTextObjectTextAnnotationsInner**](MessageDeltaContentTextObjectTextAnnotationsInner.md) |  | [optional] 

## Methods

### NewMessageDeltaContentTextObjectText

`func NewMessageDeltaContentTextObjectText() *MessageDeltaContentTextObjectText`

NewMessageDeltaContentTextObjectText instantiates a new MessageDeltaContentTextObjectText object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageDeltaContentTextObjectTextWithDefaults

`func NewMessageDeltaContentTextObjectTextWithDefaults() *MessageDeltaContentTextObjectText`

NewMessageDeltaContentTextObjectTextWithDefaults instantiates a new MessageDeltaContentTextObjectText object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetValue

`func (o *MessageDeltaContentTextObjectText) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *MessageDeltaContentTextObjectText) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *MessageDeltaContentTextObjectText) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *MessageDeltaContentTextObjectText) HasValue() bool`

HasValue returns a boolean if a field has been set.

### GetAnnotations

`func (o *MessageDeltaContentTextObjectText) GetAnnotations() []MessageDeltaContentTextObjectTextAnnotationsInner`

GetAnnotations returns the Annotations field if non-nil, zero value otherwise.

### GetAnnotationsOk

`func (o *MessageDeltaContentTextObjectText) GetAnnotationsOk() (*[]MessageDeltaContentTextObjectTextAnnotationsInner, bool)`

GetAnnotationsOk returns a tuple with the Annotations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAnnotations

`func (o *MessageDeltaContentTextObjectText) SetAnnotations(v []MessageDeltaContentTextObjectTextAnnotationsInner)`

SetAnnotations sets Annotations field to given value.

### HasAnnotations

`func (o *MessageDeltaContentTextObjectText) HasAnnotations() bool`

HasAnnotations returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


