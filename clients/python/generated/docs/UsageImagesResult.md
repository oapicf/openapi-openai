# UsageImagesResult

The aggregated images usage details of the specific time bucket.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**images** | **int** | The number of images processed. | 
**num_model_requests** | **int** | The count of requests made to the model. | 
**source** | **str** | When &#x60;group_by&#x3D;source&#x60;, this field provides the source of the grouped usage result, possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60;. | [optional] 
**size** | **str** | When &#x60;group_by&#x3D;size&#x60;, this field provides the image size of the grouped usage result. | [optional] 
**project_id** | **str** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] 
**user_id** | **str** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] 
**api_key_id** | **str** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] 
**model** | **str** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] 

## Example

```python
from openapiopenai.models.usage_images_result import UsageImagesResult

# TODO update the JSON string below
json = "{}"
# create an instance of UsageImagesResult from a JSON string
usage_images_result_instance = UsageImagesResult.from_json(json)
# print the JSON string representation of the object
print(UsageImagesResult.to_json())

# convert the object into a dict
usage_images_result_dict = usage_images_result_instance.to_dict()
# create an instance of UsageImagesResult from a dict
usage_images_result_from_dict = UsageImagesResult.from_dict(usage_images_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


