# ProjectUserUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Role** | **string** | &#x60;owner&#x60; or &#x60;member&#x60; | 

## Methods

### NewProjectUserUpdateRequest

`func NewProjectUserUpdateRequest(role string, ) *ProjectUserUpdateRequest`

NewProjectUserUpdateRequest instantiates a new ProjectUserUpdateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewProjectUserUpdateRequestWithDefaults

`func NewProjectUserUpdateRequestWithDefaults() *ProjectUserUpdateRequest`

NewProjectUserUpdateRequestWithDefaults instantiates a new ProjectUserUpdateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRole

`func (o *ProjectUserUpdateRequest) GetRole() string`

GetRole returns the Role field if non-nil, zero value otherwise.

### GetRoleOk

`func (o *ProjectUserUpdateRequest) GetRoleOk() (*string, bool)`

GetRoleOk returns a tuple with the Role field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRole

`func (o *ProjectUserUpdateRequest) SetRole(v string)`

SetRole sets Role field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


