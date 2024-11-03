# ListPaginatedFineTuningJobsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | [**[]FineTuningJob**](FineTuningJob.md) |  | 
**HasMore** | **bool** |  | 
**Object** | **string** |  | 

## Methods

### NewListPaginatedFineTuningJobsResponse

`func NewListPaginatedFineTuningJobsResponse(data []FineTuningJob, hasMore bool, object string, ) *ListPaginatedFineTuningJobsResponse`

NewListPaginatedFineTuningJobsResponse instantiates a new ListPaginatedFineTuningJobsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewListPaginatedFineTuningJobsResponseWithDefaults

`func NewListPaginatedFineTuningJobsResponseWithDefaults() *ListPaginatedFineTuningJobsResponse`

NewListPaginatedFineTuningJobsResponseWithDefaults instantiates a new ListPaginatedFineTuningJobsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *ListPaginatedFineTuningJobsResponse) GetData() []FineTuningJob`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ListPaginatedFineTuningJobsResponse) GetDataOk() (*[]FineTuningJob, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ListPaginatedFineTuningJobsResponse) SetData(v []FineTuningJob)`

SetData sets Data field to given value.


### GetHasMore

`func (o *ListPaginatedFineTuningJobsResponse) GetHasMore() bool`

GetHasMore returns the HasMore field if non-nil, zero value otherwise.

### GetHasMoreOk

`func (o *ListPaginatedFineTuningJobsResponse) GetHasMoreOk() (*bool, bool)`

GetHasMoreOk returns a tuple with the HasMore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasMore

`func (o *ListPaginatedFineTuningJobsResponse) SetHasMore(v bool)`

SetHasMore sets HasMore field to given value.


### GetObject

`func (o *ListPaginatedFineTuningJobsResponse) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *ListPaginatedFineTuningJobsResponse) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *ListPaginatedFineTuningJobsResponse) SetObject(v string)`

SetObject sets Object field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


