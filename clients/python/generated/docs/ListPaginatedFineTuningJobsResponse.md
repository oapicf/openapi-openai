# ListPaginatedFineTuningJobsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List[FineTuningJob]**](FineTuningJob.md) |  | 
**has_more** | **bool** |  | 
**object** | **str** |  | 

## Example

```python
from openapiopenai.models.list_paginated_fine_tuning_jobs_response import ListPaginatedFineTuningJobsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListPaginatedFineTuningJobsResponse from a JSON string
list_paginated_fine_tuning_jobs_response_instance = ListPaginatedFineTuningJobsResponse.from_json(json)
# print the JSON string representation of the object
print(ListPaginatedFineTuningJobsResponse.to_json())

# convert the object into a dict
list_paginated_fine_tuning_jobs_response_dict = list_paginated_fine_tuning_jobs_response_instance.to_dict()
# create an instance of ListPaginatedFineTuningJobsResponse from a dict
list_paginated_fine_tuning_jobs_response_from_dict = ListPaginatedFineTuningJobsResponse.from_dict(list_paginated_fine_tuning_jobs_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


