# AuditLogOrganizationUpdatedChangesRequestedSettings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ThreadsUiVisibility** | Pointer to **string** | Visibility of the threads page which shows messages created with the Assistants API and Playground. One of &#x60;ANY_ROLE&#x60;, &#x60;OWNERS&#x60;, or &#x60;NONE&#x60;. | [optional] 
**UsageDashboardVisibility** | Pointer to **string** | Visibility of the usage dashboard which shows activity and costs for your organization. One of &#x60;ANY_ROLE&#x60; or &#x60;OWNERS&#x60;. | [optional] 

## Methods

### NewAuditLogOrganizationUpdatedChangesRequestedSettings

`func NewAuditLogOrganizationUpdatedChangesRequestedSettings() *AuditLogOrganizationUpdatedChangesRequestedSettings`

NewAuditLogOrganizationUpdatedChangesRequestedSettings instantiates a new AuditLogOrganizationUpdatedChangesRequestedSettings object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuditLogOrganizationUpdatedChangesRequestedSettingsWithDefaults

`func NewAuditLogOrganizationUpdatedChangesRequestedSettingsWithDefaults() *AuditLogOrganizationUpdatedChangesRequestedSettings`

NewAuditLogOrganizationUpdatedChangesRequestedSettingsWithDefaults instantiates a new AuditLogOrganizationUpdatedChangesRequestedSettings object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetThreadsUiVisibility

`func (o *AuditLogOrganizationUpdatedChangesRequestedSettings) GetThreadsUiVisibility() string`

GetThreadsUiVisibility returns the ThreadsUiVisibility field if non-nil, zero value otherwise.

### GetThreadsUiVisibilityOk

`func (o *AuditLogOrganizationUpdatedChangesRequestedSettings) GetThreadsUiVisibilityOk() (*string, bool)`

GetThreadsUiVisibilityOk returns a tuple with the ThreadsUiVisibility field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThreadsUiVisibility

`func (o *AuditLogOrganizationUpdatedChangesRequestedSettings) SetThreadsUiVisibility(v string)`

SetThreadsUiVisibility sets ThreadsUiVisibility field to given value.

### HasThreadsUiVisibility

`func (o *AuditLogOrganizationUpdatedChangesRequestedSettings) HasThreadsUiVisibility() bool`

HasThreadsUiVisibility returns a boolean if a field has been set.

### GetUsageDashboardVisibility

`func (o *AuditLogOrganizationUpdatedChangesRequestedSettings) GetUsageDashboardVisibility() string`

GetUsageDashboardVisibility returns the UsageDashboardVisibility field if non-nil, zero value otherwise.

### GetUsageDashboardVisibilityOk

`func (o *AuditLogOrganizationUpdatedChangesRequestedSettings) GetUsageDashboardVisibilityOk() (*string, bool)`

GetUsageDashboardVisibilityOk returns a tuple with the UsageDashboardVisibility field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsageDashboardVisibility

`func (o *AuditLogOrganizationUpdatedChangesRequestedSettings) SetUsageDashboardVisibility(v string)`

SetUsageDashboardVisibility sets UsageDashboardVisibility field to given value.

### HasUsageDashboardVisibility

`func (o *AuditLogOrganizationUpdatedChangesRequestedSettings) HasUsageDashboardVisibility() bool`

HasUsageDashboardVisibility returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


