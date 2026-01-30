# ProjectServiceAccountCreateResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** |  | 
**Id** | **string** |  | 
**Name** | **string** |  | 
**Role** | **string** | Service accounts can only have one role of type &#x60;member&#x60; | 
**CreatedAt** | **int32** |  | 
**ApiKey** | [**ProjectServiceAccountApiKey**](ProjectServiceAccountApiKey.md) |  | 

## Methods

### NewProjectServiceAccountCreateResponse

`func NewProjectServiceAccountCreateResponse(object string, id string, name string, role string, createdAt int32, apiKey ProjectServiceAccountApiKey, ) *ProjectServiceAccountCreateResponse`

NewProjectServiceAccountCreateResponse instantiates a new ProjectServiceAccountCreateResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewProjectServiceAccountCreateResponseWithDefaults

`func NewProjectServiceAccountCreateResponseWithDefaults() *ProjectServiceAccountCreateResponse`

NewProjectServiceAccountCreateResponseWithDefaults instantiates a new ProjectServiceAccountCreateResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *ProjectServiceAccountCreateResponse) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *ProjectServiceAccountCreateResponse) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *ProjectServiceAccountCreateResponse) SetObject(v string)`

SetObject sets Object field to given value.


### GetId

`func (o *ProjectServiceAccountCreateResponse) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ProjectServiceAccountCreateResponse) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ProjectServiceAccountCreateResponse) SetId(v string)`

SetId sets Id field to given value.


### GetName

`func (o *ProjectServiceAccountCreateResponse) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ProjectServiceAccountCreateResponse) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ProjectServiceAccountCreateResponse) SetName(v string)`

SetName sets Name field to given value.


### GetRole

`func (o *ProjectServiceAccountCreateResponse) GetRole() string`

GetRole returns the Role field if non-nil, zero value otherwise.

### GetRoleOk

`func (o *ProjectServiceAccountCreateResponse) GetRoleOk() (*string, bool)`

GetRoleOk returns a tuple with the Role field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRole

`func (o *ProjectServiceAccountCreateResponse) SetRole(v string)`

SetRole sets Role field to given value.


### GetCreatedAt

`func (o *ProjectServiceAccountCreateResponse) GetCreatedAt() int32`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *ProjectServiceAccountCreateResponse) GetCreatedAtOk() (*int32, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *ProjectServiceAccountCreateResponse) SetCreatedAt(v int32)`

SetCreatedAt sets CreatedAt field to given value.


### GetApiKey

`func (o *ProjectServiceAccountCreateResponse) GetApiKey() ProjectServiceAccountApiKey`

GetApiKey returns the ApiKey field if non-nil, zero value otherwise.

### GetApiKeyOk

`func (o *ProjectServiceAccountCreateResponse) GetApiKeyOk() (*ProjectServiceAccountApiKey, bool)`

GetApiKeyOk returns a tuple with the ApiKey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApiKey

`func (o *ProjectServiceAccountCreateResponse) SetApiKey(v ProjectServiceAccountApiKey)`

SetApiKey sets ApiKey field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


