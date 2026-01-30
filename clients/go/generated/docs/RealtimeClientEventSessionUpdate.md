# RealtimeClientEventSessionUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | Pointer to **string** | Optional client-generated ID used to identify this event. | [optional] 
**Type** | **string** | The event type, must be &#x60;session.update&#x60;. | 
**Session** | [**RealtimeSessionCreateRequest**](RealtimeSessionCreateRequest.md) |  | 

## Methods

### NewRealtimeClientEventSessionUpdate

`func NewRealtimeClientEventSessionUpdate(type_ string, session RealtimeSessionCreateRequest, ) *RealtimeClientEventSessionUpdate`

NewRealtimeClientEventSessionUpdate instantiates a new RealtimeClientEventSessionUpdate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeClientEventSessionUpdateWithDefaults

`func NewRealtimeClientEventSessionUpdateWithDefaults() *RealtimeClientEventSessionUpdate`

NewRealtimeClientEventSessionUpdateWithDefaults instantiates a new RealtimeClientEventSessionUpdate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeClientEventSessionUpdate) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeClientEventSessionUpdate) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeClientEventSessionUpdate) SetEventId(v string)`

SetEventId sets EventId field to given value.

### HasEventId

`func (o *RealtimeClientEventSessionUpdate) HasEventId() bool`

HasEventId returns a boolean if a field has been set.

### GetType

`func (o *RealtimeClientEventSessionUpdate) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeClientEventSessionUpdate) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeClientEventSessionUpdate) SetType(v string)`

SetType sets Type field to given value.


### GetSession

`func (o *RealtimeClientEventSessionUpdate) GetSession() RealtimeSessionCreateRequest`

GetSession returns the Session field if non-nil, zero value otherwise.

### GetSessionOk

`func (o *RealtimeClientEventSessionUpdate) GetSessionOk() (*RealtimeSessionCreateRequest, bool)`

GetSessionOk returns a tuple with the Session field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSession

`func (o *RealtimeClientEventSessionUpdate) SetSession(v RealtimeSessionCreateRequest)`

SetSession sets Session field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


