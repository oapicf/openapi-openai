# ProjectRateLimit
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **object** | **String** | The object type, which is always &#x60;project.rate_limit&#x60; | [default to null] |
| **id** | **String** | The identifier, which can be referenced in API endpoints. | [default to null] |
| **model** | **String** | The model this rate limit applies to. | [default to null] |
| **max\_requests\_per\_1\_minute** | **Integer** | The maximum requests per minute. | [default to null] |
| **max\_tokens\_per\_1\_minute** | **Integer** | The maximum tokens per minute. | [default to null] |
| **max\_images\_per\_1\_minute** | **Integer** | The maximum images per minute. Only present for relevant models. | [optional] [default to null] |
| **max\_audio\_megabytes\_per\_1\_minute** | **Integer** | The maximum audio megabytes per minute. Only present for relevant models. | [optional] [default to null] |
| **max\_requests\_per\_1\_day** | **Integer** | The maximum requests per day. Only present for relevant models. | [optional] [default to null] |
| **batch\_1\_day\_max\_input\_tokens** | **Integer** | The maximum batch input tokens per day. Only present for relevant models. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

