# UsageTimeBucket


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**start_time** | **int** |  | 
**end_time** | **int** |  | 
**result** | [**List[UsageTimeBucketResultInner]**](UsageTimeBucketResultInner.md) |  | 

## Example

```python
from openapiopenai.models.usage_time_bucket import UsageTimeBucket

# TODO update the JSON string below
json = "{}"
# create an instance of UsageTimeBucket from a JSON string
usage_time_bucket_instance = UsageTimeBucket.from_json(json)
# print the JSON string representation of the object
print(UsageTimeBucket.to_json())

# convert the object into a dict
usage_time_bucket_dict = usage_time_bucket_instance.to_dict()
# create an instance of UsageTimeBucket from a dict
usage_time_bucket_from_dict = UsageTimeBucket.from_dict(usage_time_bucket_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


