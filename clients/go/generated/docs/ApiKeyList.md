# ApiKeyList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | Pointer to **string** |  | [optional] 
**Data** | Pointer to [**[]AdminApiKey**](AdminApiKey.md) |  | [optional] 
**HasMore** | Pointer to **bool** |  | [optional] 
**FirstId** | Pointer to **string** |  | [optional] 
**LastId** | Pointer to **string** |  | [optional] 

## Methods

### NewApiKeyList

`func NewApiKeyList() *ApiKeyList`

NewApiKeyList instantiates a new ApiKeyList object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewApiKeyListWithDefaults

`func NewApiKeyListWithDefaults() *ApiKeyList`

NewApiKeyListWithDefaults instantiates a new ApiKeyList object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *ApiKeyList) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *ApiKeyList) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *ApiKeyList) SetObject(v string)`

SetObject sets Object field to given value.

### HasObject

`func (o *ApiKeyList) HasObject() bool`

HasObject returns a boolean if a field has been set.

### GetData

`func (o *ApiKeyList) GetData() []AdminApiKey`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ApiKeyList) GetDataOk() (*[]AdminApiKey, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ApiKeyList) SetData(v []AdminApiKey)`

SetData sets Data field to given value.

### HasData

`func (o *ApiKeyList) HasData() bool`

HasData returns a boolean if a field has been set.

### GetHasMore

`func (o *ApiKeyList) GetHasMore() bool`

GetHasMore returns the HasMore field if non-nil, zero value otherwise.

### GetHasMoreOk

`func (o *ApiKeyList) GetHasMoreOk() (*bool, bool)`

GetHasMoreOk returns a tuple with the HasMore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasMore

`func (o *ApiKeyList) SetHasMore(v bool)`

SetHasMore sets HasMore field to given value.

### HasHasMore

`func (o *ApiKeyList) HasHasMore() bool`

HasHasMore returns a boolean if a field has been set.

### GetFirstId

`func (o *ApiKeyList) GetFirstId() string`

GetFirstId returns the FirstId field if non-nil, zero value otherwise.

### GetFirstIdOk

`func (o *ApiKeyList) GetFirstIdOk() (*string, bool)`

GetFirstIdOk returns a tuple with the FirstId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstId

`func (o *ApiKeyList) SetFirstId(v string)`

SetFirstId sets FirstId field to given value.

### HasFirstId

`func (o *ApiKeyList) HasFirstId() bool`

HasFirstId returns a boolean if a field has been set.

### GetLastId

`func (o *ApiKeyList) GetLastId() string`

GetLastId returns the LastId field if non-nil, zero value otherwise.

### GetLastIdOk

`func (o *ApiKeyList) GetLastIdOk() (*string, bool)`

GetLastIdOk returns a tuple with the LastId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastId

`func (o *ApiKeyList) SetLastId(v string)`

SetLastId sets LastId field to given value.

### HasLastId

`func (o *ApiKeyList) HasLastId() bool`

HasLastId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


