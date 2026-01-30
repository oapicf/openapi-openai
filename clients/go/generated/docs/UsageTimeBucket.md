# UsageTimeBucket

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** |  | 
**StartTime** | **int32** |  | 
**EndTime** | **int32** |  | 
**Result** | [**[]UsageTimeBucketResultInner**](UsageTimeBucketResultInner.md) |  | 

## Methods

### NewUsageTimeBucket

`func NewUsageTimeBucket(object string, startTime int32, endTime int32, result []UsageTimeBucketResultInner, ) *UsageTimeBucket`

NewUsageTimeBucket instantiates a new UsageTimeBucket object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUsageTimeBucketWithDefaults

`func NewUsageTimeBucketWithDefaults() *UsageTimeBucket`

NewUsageTimeBucketWithDefaults instantiates a new UsageTimeBucket object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *UsageTimeBucket) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *UsageTimeBucket) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *UsageTimeBucket) SetObject(v string)`

SetObject sets Object field to given value.


### GetStartTime

`func (o *UsageTimeBucket) GetStartTime() int32`

GetStartTime returns the StartTime field if non-nil, zero value otherwise.

### GetStartTimeOk

`func (o *UsageTimeBucket) GetStartTimeOk() (*int32, bool)`

GetStartTimeOk returns a tuple with the StartTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartTime

`func (o *UsageTimeBucket) SetStartTime(v int32)`

SetStartTime sets StartTime field to given value.


### GetEndTime

`func (o *UsageTimeBucket) GetEndTime() int32`

GetEndTime returns the EndTime field if non-nil, zero value otherwise.

### GetEndTimeOk

`func (o *UsageTimeBucket) GetEndTimeOk() (*int32, bool)`

GetEndTimeOk returns a tuple with the EndTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndTime

`func (o *UsageTimeBucket) SetEndTime(v int32)`

SetEndTime sets EndTime field to given value.


### GetResult

`func (o *UsageTimeBucket) GetResult() []UsageTimeBucketResultInner`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *UsageTimeBucket) GetResultOk() (*[]UsageTimeBucketResultInner, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *UsageTimeBucket) SetResult(v []UsageTimeBucketResultInner)`

SetResult sets Result field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


