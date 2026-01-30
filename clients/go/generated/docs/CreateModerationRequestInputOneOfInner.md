# CreateModerationRequestInputOneOfInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Always &#x60;image_url&#x60;. | 
**ImageUrl** | [**CreateModerationRequestInputOneOfInnerOneOfImageUrl**](CreateModerationRequestInputOneOfInnerOneOfImageUrl.md) |  | 
**Text** | **string** | A string of text to classify. | 

## Methods

### NewCreateModerationRequestInputOneOfInner

`func NewCreateModerationRequestInputOneOfInner(type_ string, imageUrl CreateModerationRequestInputOneOfInnerOneOfImageUrl, text string, ) *CreateModerationRequestInputOneOfInner`

NewCreateModerationRequestInputOneOfInner instantiates a new CreateModerationRequestInputOneOfInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateModerationRequestInputOneOfInnerWithDefaults

`func NewCreateModerationRequestInputOneOfInnerWithDefaults() *CreateModerationRequestInputOneOfInner`

NewCreateModerationRequestInputOneOfInnerWithDefaults instantiates a new CreateModerationRequestInputOneOfInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *CreateModerationRequestInputOneOfInner) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CreateModerationRequestInputOneOfInner) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CreateModerationRequestInputOneOfInner) SetType(v string)`

SetType sets Type field to given value.


### GetImageUrl

`func (o *CreateModerationRequestInputOneOfInner) GetImageUrl() CreateModerationRequestInputOneOfInnerOneOfImageUrl`

GetImageUrl returns the ImageUrl field if non-nil, zero value otherwise.

### GetImageUrlOk

`func (o *CreateModerationRequestInputOneOfInner) GetImageUrlOk() (*CreateModerationRequestInputOneOfInnerOneOfImageUrl, bool)`

GetImageUrlOk returns a tuple with the ImageUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageUrl

`func (o *CreateModerationRequestInputOneOfInner) SetImageUrl(v CreateModerationRequestInputOneOfInnerOneOfImageUrl)`

SetImageUrl sets ImageUrl field to given value.


### GetText

`func (o *CreateModerationRequestInputOneOfInner) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *CreateModerationRequestInputOneOfInner) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *CreateModerationRequestInputOneOfInner) SetText(v string)`

SetText sets Text field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


