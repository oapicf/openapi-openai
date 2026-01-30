# openapi::CostsResult

The aggregated costs details of the specific time bucket.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **character** |  | [Enum: [organization.costs.result]] 
**amount** | [**CostsResultAmount**](CostsResult_amount.md) |  | [optional] 
**line_item** | **character** | When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result. | [optional] 
**project_id** | **character** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result. | [optional] 


