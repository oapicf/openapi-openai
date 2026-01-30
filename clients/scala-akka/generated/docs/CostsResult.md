

# CostsResult

The aggregated costs details of the specific time bucket.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`object`** | [**`Object`**](#`Object`) |  | 
**amount** | [**CostsResultAmount**](CostsResultAmount.md) |  |  [optional]
**lineItem** | **String** | When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result. |  [optional]
**projectId** | **String** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result. |  [optional]


## Enum: `Object`
Allowed values: [organization.costs.result]




