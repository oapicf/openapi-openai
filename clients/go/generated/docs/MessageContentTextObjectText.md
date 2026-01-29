# MessageContentTextObjectText

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Value** | **string** | The data that makes up the text. | 
**Annotations** | [**[]MessageContentTextObjectTextAnnotationsInner**](MessageContentTextObjectTextAnnotationsInner.md) |  | 

## Methods

### NewMessageContentTextObjectText

`func NewMessageContentTextObjectText(value string, annotations []MessageContentTextObjectTextAnnotationsInner, ) *MessageContentTextObjectText`

NewMessageContentTextObjectText instantiates a new MessageContentTextObjectText object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageContentTextObjectTextWithDefaults

`func NewMessageContentTextObjectTextWithDefaults() *MessageContentTextObjectText`

NewMessageContentTextObjectTextWithDefaults instantiates a new MessageContentTextObjectText object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetValue

`func (o *MessageContentTextObjectText) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *MessageContentTextObjectText) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *MessageContentTextObjectText) SetValue(v string)`

SetValue sets Value field to given value.


### GetAnnotations

`func (o *MessageContentTextObjectText) GetAnnotations() []MessageContentTextObjectTextAnnotationsInner`

GetAnnotations returns the Annotations field if non-nil, zero value otherwise.

### GetAnnotationsOk

`func (o *MessageContentTextObjectText) GetAnnotationsOk() (*[]MessageContentTextObjectTextAnnotationsInner, bool)`

GetAnnotationsOk returns a tuple with the Annotations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAnnotations

`func (o *MessageContentTextObjectText) SetAnnotations(v []MessageContentTextObjectTextAnnotationsInner)`

SetAnnotations sets Annotations field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


