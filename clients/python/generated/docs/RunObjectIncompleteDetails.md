# RunObjectIncompleteDetails

Details on why the run is incomplete. Will be `null` if the run is not incomplete.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | **str** | The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run. | [optional] 

## Example

```python
from openapiopenai.models.run_object_incomplete_details import RunObjectIncompleteDetails

# TODO update the JSON string below
json = "{}"
# create an instance of RunObjectIncompleteDetails from a JSON string
run_object_incomplete_details_instance = RunObjectIncompleteDetails.from_json(json)
# print the JSON string representation of the object
print(RunObjectIncompleteDetails.to_json())

# convert the object into a dict
run_object_incomplete_details_dict = run_object_incomplete_details_instance.to_dict()
# create an instance of RunObjectIncompleteDetails from a dict
run_object_incomplete_details_from_dict = RunObjectIncompleteDetails.from_dict(run_object_incomplete_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


