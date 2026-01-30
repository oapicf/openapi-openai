# CostsResult

The aggregated costs details of the specific time bucket.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**amount** | [**CostsResultAmount**](CostsResultAmount.md) |  | [optional] 
**line_item** | **str** | When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result. | [optional] 
**project_id** | **str** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result. | [optional] 

## Example

```python
from openapiopenai.models.costs_result import CostsResult

# TODO update the JSON string below
json = "{}"
# create an instance of CostsResult from a JSON string
costs_result_instance = CostsResult.from_json(json)
# print the JSON string representation of the object
print(CostsResult.to_json())

# convert the object into a dict
costs_result_dict = costs_result_instance.to_dict()
# create an instance of CostsResult from a dict
costs_result_from_dict = CostsResult.from_dict(costs_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


