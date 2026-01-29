# ListFineTuningJobEventsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | [**[]FineTuningJobEvent**](FineTuningJobEvent.md) |  | 
**Object** | **string** |  | 

## Methods

### NewListFineTuningJobEventsResponse

`func NewListFineTuningJobEventsResponse(data []FineTuningJobEvent, object string, ) *ListFineTuningJobEventsResponse`

NewListFineTuningJobEventsResponse instantiates a new ListFineTuningJobEventsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewListFineTuningJobEventsResponseWithDefaults

`func NewListFineTuningJobEventsResponseWithDefaults() *ListFineTuningJobEventsResponse`

NewListFineTuningJobEventsResponseWithDefaults instantiates a new ListFineTuningJobEventsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *ListFineTuningJobEventsResponse) GetData() []FineTuningJobEvent`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ListFineTuningJobEventsResponse) GetDataOk() (*[]FineTuningJobEvent, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ListFineTuningJobEventsResponse) SetData(v []FineTuningJobEvent)`

SetData sets Data field to given value.


### GetObject

`func (o *ListFineTuningJobEventsResponse) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *ListFineTuningJobEventsResponse) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *ListFineTuningJobEventsResponse) SetObject(v string)`

SetObject sets Object field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


