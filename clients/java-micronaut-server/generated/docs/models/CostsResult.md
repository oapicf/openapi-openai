

# CostsResult

The aggregated costs details of the specific time bucket.

The class is defined in **[CostsResult.java](../../src/main/java/org/openapitools/model/CostsResult.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_object** | [**ObjectEnum**](#ObjectEnum) |  | 
**amount** | [`CostsResultAmount`](CostsResultAmount.md) |  |  [optional property]
**lineItem** | `String` | When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result. |  [optional property]
**projectId** | `String` | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result. |  [optional property]

## ObjectEnum

Name | Value
---- | -----
ORGANIZATION_COSTS_RESULT | `"organization.costs.result"`





