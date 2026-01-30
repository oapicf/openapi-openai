

# RealtimeServerEventRateLimitsUpdatedRateLimitsInner

The class is defined in **[RealtimeServerEventRateLimitsUpdatedRateLimitsInner.java](../../src/main/java/org/openapitools/model/RealtimeServerEventRateLimitsUpdatedRateLimitsInner.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**NameEnum**](#NameEnum) | The name of the rate limit (&#x60;requests&#x60;, &#x60;tokens&#x60;).  |  [optional property]
**limit** | `Integer` | The maximum allowed value for the rate limit. |  [optional property]
**remaining** | `Integer` | The remaining value before the limit is reached. |  [optional property]
**resetSeconds** | `BigDecimal` | Seconds until the rate limit resets. |  [optional property]

## NameEnum

Name | Value
---- | -----
REQUESTS | `"requests"`
TOKENS | `"tokens"`





