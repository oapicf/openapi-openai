# CostsResultAmount

The monetary value in its associated currency.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **float** | The numeric value of the cost. | [optional] 
**currency** | **str** | Lowercase ISO-4217 currency e.g. \&quot;usd\&quot; | [optional] 

## Example

```python
from openapiopenai.models.costs_result_amount import CostsResultAmount

# TODO update the JSON string below
json = "{}"
# create an instance of CostsResultAmount from a JSON string
costs_result_amount_instance = CostsResultAmount.from_json(json)
# print the JSON string representation of the object
print(CostsResultAmount.to_json())

# convert the object into a dict
costs_result_amount_dict = costs_result_amount_instance.to_dict()
# create an instance of CostsResultAmount from a dict
costs_result_amount_from_dict = CostsResultAmount.from_dict(costs_result_amount_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


