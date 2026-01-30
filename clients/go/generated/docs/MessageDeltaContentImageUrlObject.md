# MessageDeltaContentImageUrlObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **int32** | The index of the content part in the message. | 
**Type** | **string** | Always &#x60;image_url&#x60;. | 
**ImageUrl** | Pointer to [**MessageDeltaContentImageUrlObjectImageUrl**](MessageDeltaContentImageUrlObjectImageUrl.md) |  | [optional] 

## Methods

### NewMessageDeltaContentImageUrlObject

`func NewMessageDeltaContentImageUrlObject(index int32, type_ string, ) *MessageDeltaContentImageUrlObject`

NewMessageDeltaContentImageUrlObject instantiates a new MessageDeltaContentImageUrlObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageDeltaContentImageUrlObjectWithDefaults

`func NewMessageDeltaContentImageUrlObjectWithDefaults() *MessageDeltaContentImageUrlObject`

NewMessageDeltaContentImageUrlObjectWithDefaults instantiates a new MessageDeltaContentImageUrlObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIndex

`func (o *MessageDeltaContentImageUrlObject) GetIndex() int32`

GetIndex returns the Index field if non-nil, zero value otherwise.

### GetIndexOk

`func (o *MessageDeltaContentImageUrlObject) GetIndexOk() (*int32, bool)`

GetIndexOk returns a tuple with the Index field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndex

`func (o *MessageDeltaContentImageUrlObject) SetIndex(v int32)`

SetIndex sets Index field to given value.


### GetType

`func (o *MessageDeltaContentImageUrlObject) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *MessageDeltaContentImageUrlObject) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *MessageDeltaContentImageUrlObject) SetType(v string)`

SetType sets Type field to given value.


### GetImageUrl

`func (o *MessageDeltaContentImageUrlObject) GetImageUrl() MessageDeltaContentImageUrlObjectImageUrl`

GetImageUrl returns the ImageUrl field if non-nil, zero value otherwise.

### GetImageUrlOk

`func (o *MessageDeltaContentImageUrlObject) GetImageUrlOk() (*MessageDeltaContentImageUrlObjectImageUrl, bool)`

GetImageUrlOk returns a tuple with the ImageUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageUrl

`func (o *MessageDeltaContentImageUrlObject) SetImageUrl(v MessageDeltaContentImageUrlObjectImageUrl)`

SetImageUrl sets ImageUrl field to given value.

### HasImageUrl

`func (o *MessageDeltaContentImageUrlObject) HasImageUrl() bool`

HasImageUrl returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


