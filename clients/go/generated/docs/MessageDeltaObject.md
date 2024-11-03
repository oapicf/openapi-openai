# MessageDeltaObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The identifier of the message, which can be referenced in API endpoints. | 
**Object** | **string** | The object type, which is always &#x60;thread.message.delta&#x60;. | 
**Delta** | [**MessageDeltaObjectDelta**](MessageDeltaObjectDelta.md) |  | 

## Methods

### NewMessageDeltaObject

`func NewMessageDeltaObject(id string, object string, delta MessageDeltaObjectDelta, ) *MessageDeltaObject`

NewMessageDeltaObject instantiates a new MessageDeltaObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageDeltaObjectWithDefaults

`func NewMessageDeltaObjectWithDefaults() *MessageDeltaObject`

NewMessageDeltaObjectWithDefaults instantiates a new MessageDeltaObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *MessageDeltaObject) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *MessageDeltaObject) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *MessageDeltaObject) SetId(v string)`

SetId sets Id field to given value.


### GetObject

`func (o *MessageDeltaObject) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *MessageDeltaObject) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *MessageDeltaObject) SetObject(v string)`

SetObject sets Object field to given value.


### GetDelta

`func (o *MessageDeltaObject) GetDelta() MessageDeltaObjectDelta`

GetDelta returns the Delta field if non-nil, zero value otherwise.

### GetDeltaOk

`func (o *MessageDeltaObject) GetDeltaOk() (*MessageDeltaObjectDelta, bool)`

GetDeltaOk returns a tuple with the Delta field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDelta

`func (o *MessageDeltaObject) SetDelta(v MessageDeltaObjectDelta)`

SetDelta sets Delta field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


