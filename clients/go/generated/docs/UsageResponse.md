# UsageResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** |  | 
**Data** | [**[]UsageTimeBucket**](UsageTimeBucket.md) |  | 
**HasMore** | **bool** |  | 
**NextPage** | **string** |  | 

## Methods

### NewUsageResponse

`func NewUsageResponse(object string, data []UsageTimeBucket, hasMore bool, nextPage string, ) *UsageResponse`

NewUsageResponse instantiates a new UsageResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUsageResponseWithDefaults

`func NewUsageResponseWithDefaults() *UsageResponse`

NewUsageResponseWithDefaults instantiates a new UsageResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *UsageResponse) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *UsageResponse) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *UsageResponse) SetObject(v string)`

SetObject sets Object field to given value.


### GetData

`func (o *UsageResponse) GetData() []UsageTimeBucket`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *UsageResponse) GetDataOk() (*[]UsageTimeBucket, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *UsageResponse) SetData(v []UsageTimeBucket)`

SetData sets Data field to given value.


### GetHasMore

`func (o *UsageResponse) GetHasMore() bool`

GetHasMore returns the HasMore field if non-nil, zero value otherwise.

### GetHasMoreOk

`func (o *UsageResponse) GetHasMoreOk() (*bool, bool)`

GetHasMoreOk returns a tuple with the HasMore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasMore

`func (o *UsageResponse) SetHasMore(v bool)`

SetHasMore sets HasMore field to given value.


### GetNextPage

`func (o *UsageResponse) GetNextPage() string`

GetNextPage returns the NextPage field if non-nil, zero value otherwise.

### GetNextPageOk

`func (o *UsageResponse) GetNextPageOk() (*string, bool)`

GetNextPageOk returns a tuple with the NextPage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextPage

`func (o *UsageResponse) SetNextPage(v string)`

SetNextPage sets NextPage field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


