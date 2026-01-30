# PredictionContentContent

The content that should be matched when generating a model response. If generated tokens would match this content, the entire model response can be returned much more quickly. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

## Example

```python
from openapiopenai.models.prediction_content_content import PredictionContentContent

# TODO update the JSON string below
json = "{}"
# create an instance of PredictionContentContent from a JSON string
prediction_content_content_instance = PredictionContentContent.from_json(json)
# print the JSON string representation of the object
print(PredictionContentContent.to_json())

# convert the object into a dict
prediction_content_content_dict = prediction_content_content_instance.to_dict()
# create an instance of PredictionContentContent from a dict
prediction_content_content_from_dict = PredictionContentContent.from_dict(prediction_content_content_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


