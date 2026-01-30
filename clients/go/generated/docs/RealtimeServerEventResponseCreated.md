# RealtimeServerEventResponseCreated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;response.created&#x60;. | 
**Response** | [**RealtimeResponse**](RealtimeResponse.md) |  | 

## Methods

### NewRealtimeServerEventResponseCreated

`func NewRealtimeServerEventResponseCreated(eventId string, type_ string, response RealtimeResponse, ) *RealtimeServerEventResponseCreated`

NewRealtimeServerEventResponseCreated instantiates a new RealtimeServerEventResponseCreated object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeServerEventResponseCreatedWithDefaults

`func NewRealtimeServerEventResponseCreatedWithDefaults() *RealtimeServerEventResponseCreated`

NewRealtimeServerEventResponseCreatedWithDefaults instantiates a new RealtimeServerEventResponseCreated object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeServerEventResponseCreated) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeServerEventResponseCreated) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeServerEventResponseCreated) SetEventId(v string)`

SetEventId sets EventId field to given value.


### GetType

`func (o *RealtimeServerEventResponseCreated) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeServerEventResponseCreated) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeServerEventResponseCreated) SetType(v string)`

SetType sets Type field to given value.


### GetResponse

`func (o *RealtimeServerEventResponseCreated) GetResponse() RealtimeResponse`

GetResponse returns the Response field if non-nil, zero value otherwise.

### GetResponseOk

`func (o *RealtimeServerEventResponseCreated) GetResponseOk() (*RealtimeResponse, bool)`

GetResponseOk returns a tuple with the Response field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponse

`func (o *RealtimeServerEventResponseCreated) SetResponse(v RealtimeResponse)`

SetResponse sets Response field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


