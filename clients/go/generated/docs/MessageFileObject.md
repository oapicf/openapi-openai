# MessageFileObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The identifier, which can be referenced in API endpoints. | 
**Object** | **string** | The object type, which is always &#x60;thread.message.file&#x60;. | 
**CreatedAt** | **int32** | The Unix timestamp (in seconds) for when the message file was created. | 
**MessageId** | **string** | The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to. | 

## Methods

### NewMessageFileObject

`func NewMessageFileObject(id string, object string, createdAt int32, messageId string, ) *MessageFileObject`

NewMessageFileObject instantiates a new MessageFileObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageFileObjectWithDefaults

`func NewMessageFileObjectWithDefaults() *MessageFileObject`

NewMessageFileObjectWithDefaults instantiates a new MessageFileObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *MessageFileObject) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *MessageFileObject) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *MessageFileObject) SetId(v string)`

SetId sets Id field to given value.


### GetObject

`func (o *MessageFileObject) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *MessageFileObject) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *MessageFileObject) SetObject(v string)`

SetObject sets Object field to given value.


### GetCreatedAt

`func (o *MessageFileObject) GetCreatedAt() int32`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *MessageFileObject) GetCreatedAtOk() (*int32, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *MessageFileObject) SetCreatedAt(v int32)`

SetCreatedAt sets CreatedAt field to given value.


### GetMessageId

`func (o *MessageFileObject) GetMessageId() string`

GetMessageId returns the MessageId field if non-nil, zero value otherwise.

### GetMessageIdOk

`func (o *MessageFileObject) GetMessageIdOk() (*string, bool)`

GetMessageIdOk returns a tuple with the MessageId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageId

`func (o *MessageFileObject) SetMessageId(v string)`

SetMessageId sets MessageId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


