# MessageContentImageUrlObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | The type of the content part. | 
**ImageUrl** | [**MessageContentImageUrlObjectImageUrl**](MessageContentImageUrlObjectImageUrl.md) |  | 

## Methods

### NewMessageContentImageUrlObject

`func NewMessageContentImageUrlObject(type_ string, imageUrl MessageContentImageUrlObjectImageUrl, ) *MessageContentImageUrlObject`

NewMessageContentImageUrlObject instantiates a new MessageContentImageUrlObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageContentImageUrlObjectWithDefaults

`func NewMessageContentImageUrlObjectWithDefaults() *MessageContentImageUrlObject`

NewMessageContentImageUrlObjectWithDefaults instantiates a new MessageContentImageUrlObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *MessageContentImageUrlObject) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *MessageContentImageUrlObject) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *MessageContentImageUrlObject) SetType(v string)`

SetType sets Type field to given value.


### GetImageUrl

`func (o *MessageContentImageUrlObject) GetImageUrl() MessageContentImageUrlObjectImageUrl`

GetImageUrl returns the ImageUrl field if non-nil, zero value otherwise.

### GetImageUrlOk

`func (o *MessageContentImageUrlObject) GetImageUrlOk() (*MessageContentImageUrlObjectImageUrl, bool)`

GetImageUrlOk returns a tuple with the ImageUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageUrl

`func (o *MessageContentImageUrlObject) SetImageUrl(v MessageContentImageUrlObjectImageUrl)`

SetImageUrl sets ImageUrl field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


