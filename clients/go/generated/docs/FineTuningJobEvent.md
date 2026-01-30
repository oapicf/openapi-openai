# FineTuningJobEvent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** | The object type, which is always \&quot;fine_tuning.job.event\&quot;. | 
**Id** | **string** | The object identifier. | 
**CreatedAt** | **int32** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | 
**Level** | **string** | The log level of the event. | 
**Message** | **string** | The message of the event. | 
**Type** | Pointer to **string** | The type of event. | [optional] 
**Data** | Pointer to **map[string]interface{}** | The data associated with the event. | [optional] 

## Methods

### NewFineTuningJobEvent

`func NewFineTuningJobEvent(object string, id string, createdAt int32, level string, message string, ) *FineTuningJobEvent`

NewFineTuningJobEvent instantiates a new FineTuningJobEvent object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFineTuningJobEventWithDefaults

`func NewFineTuningJobEventWithDefaults() *FineTuningJobEvent`

NewFineTuningJobEventWithDefaults instantiates a new FineTuningJobEvent object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *FineTuningJobEvent) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *FineTuningJobEvent) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *FineTuningJobEvent) SetObject(v string)`

SetObject sets Object field to given value.


### GetId

`func (o *FineTuningJobEvent) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *FineTuningJobEvent) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *FineTuningJobEvent) SetId(v string)`

SetId sets Id field to given value.


### GetCreatedAt

`func (o *FineTuningJobEvent) GetCreatedAt() int32`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *FineTuningJobEvent) GetCreatedAtOk() (*int32, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *FineTuningJobEvent) SetCreatedAt(v int32)`

SetCreatedAt sets CreatedAt field to given value.


### GetLevel

`func (o *FineTuningJobEvent) GetLevel() string`

GetLevel returns the Level field if non-nil, zero value otherwise.

### GetLevelOk

`func (o *FineTuningJobEvent) GetLevelOk() (*string, bool)`

GetLevelOk returns a tuple with the Level field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLevel

`func (o *FineTuningJobEvent) SetLevel(v string)`

SetLevel sets Level field to given value.


### GetMessage

`func (o *FineTuningJobEvent) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *FineTuningJobEvent) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *FineTuningJobEvent) SetMessage(v string)`

SetMessage sets Message field to given value.


### GetType

`func (o *FineTuningJobEvent) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *FineTuningJobEvent) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *FineTuningJobEvent) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *FineTuningJobEvent) HasType() bool`

HasType returns a boolean if a field has been set.

### GetData

`func (o *FineTuningJobEvent) GetData() map[string]interface{}`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *FineTuningJobEvent) GetDataOk() (*map[string]interface{}, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *FineTuningJobEvent) SetData(v map[string]interface{})`

SetData sets Data field to given value.

### HasData

`func (o *FineTuningJobEvent) HasData() bool`

HasData returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


