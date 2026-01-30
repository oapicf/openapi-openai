# PredictionContent

Static predicted output content, such as the content of a text file that is being regenerated. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of the predicted content you want to provide. This type is currently always &#x60;content&#x60;.  | 
**content** | [**PredictionContentContent**](PredictionContentContent.md) |  | 

## Example

```python
from openapiopenai.models.prediction_content import PredictionContent

# TODO update the JSON string below
json = "{}"
# create an instance of PredictionContent from a JSON string
prediction_content_instance = PredictionContent.from_json(json)
# print the JSON string representation of the object
print(PredictionContent.to_json())

# convert the object into a dict
prediction_content_dict = prediction_content_instance.to_dict()
# create an instance of PredictionContent from a dict
prediction_content_from_dict = PredictionContent.from_dict(prediction_content_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


