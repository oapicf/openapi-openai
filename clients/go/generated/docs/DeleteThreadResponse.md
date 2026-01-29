# DeleteThreadResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** |  | 
**Deleted** | **bool** |  | 
**Object** | **string** |  | 

## Methods

### NewDeleteThreadResponse

`func NewDeleteThreadResponse(id string, deleted bool, object string, ) *DeleteThreadResponse`

NewDeleteThreadResponse instantiates a new DeleteThreadResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDeleteThreadResponseWithDefaults

`func NewDeleteThreadResponseWithDefaults() *DeleteThreadResponse`

NewDeleteThreadResponseWithDefaults instantiates a new DeleteThreadResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *DeleteThreadResponse) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *DeleteThreadResponse) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *DeleteThreadResponse) SetId(v string)`

SetId sets Id field to given value.


### GetDeleted

`func (o *DeleteThreadResponse) GetDeleted() bool`

GetDeleted returns the Deleted field if non-nil, zero value otherwise.

### GetDeletedOk

`func (o *DeleteThreadResponse) GetDeletedOk() (*bool, bool)`

GetDeletedOk returns a tuple with the Deleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeleted

`func (o *DeleteThreadResponse) SetDeleted(v bool)`

SetDeleted sets Deleted field to given value.


### GetObject

`func (o *DeleteThreadResponse) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *DeleteThreadResponse) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *DeleteThreadResponse) SetObject(v string)`

SetObject sets Object field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


