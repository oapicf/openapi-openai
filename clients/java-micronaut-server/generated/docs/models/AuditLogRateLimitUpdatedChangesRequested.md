

# AuditLogRateLimitUpdatedChangesRequested

The payload used to update the rate limits.

The class is defined in **[AuditLogRateLimitUpdatedChangesRequested.java](../../src/main/java/org/openapitools/model/AuditLogRateLimitUpdatedChangesRequested.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxRequestsPer1Minute** | `Integer` | The maximum requests per minute. |  [optional property]
**maxTokensPer1Minute** | `Integer` | The maximum tokens per minute. |  [optional property]
**maxImagesPer1Minute** | `Integer` | The maximum images per minute. Only relevant for certain models. |  [optional property]
**maxAudioMegabytesPer1Minute** | `Integer` | The maximum audio megabytes per minute. Only relevant for certain models. |  [optional property]
**maxRequestsPer1Day** | `Integer` | The maximum requests per day. Only relevant for certain models. |  [optional property]
**batch1DayMaxInputTokens** | `Integer` | The maximum batch input tokens per day. Only relevant for certain models. |  [optional property]








