# ProjectRateLimit

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String!** | The object type, which is always &#x60;project.rate_limit&#x60; | [default to null]
**Id_** | **String!** | The identifier, which can be referenced in API endpoints. | [default to null]
**model** | **String!** | The model this rate limit applies to. | [default to null]
**maxRequestsPer1Minute** | **Int!** | The maximum requests per minute. | [default to null]
**maxTokensPer1Minute** | **Int!** | The maximum tokens per minute. | [default to null]
**maxImagesPer1Minute** | **Int!** | The maximum images per minute. Only present for relevant models. | [optional] [default to null]
**maxAudioMegabytesPer1Minute** | **Int!** | The maximum audio megabytes per minute. Only present for relevant models. | [optional] [default to null]
**maxRequestsPer1Day** | **Int!** | The maximum requests per day. Only present for relevant models. | [optional] [default to null]
**batch1DayMaxInputTokens** | **Int!** | The maximum batch input tokens per day. Only present for relevant models. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


