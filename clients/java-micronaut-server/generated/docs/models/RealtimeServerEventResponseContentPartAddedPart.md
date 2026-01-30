

# RealtimeServerEventResponseContentPartAddedPart

The content part that was added.

The class is defined in **[RealtimeServerEventResponseContentPartAddedPart.java](../../src/main/java/org/openapitools/model/RealtimeServerEventResponseContentPartAddedPart.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The content type (\&quot;text\&quot;, \&quot;audio\&quot;). |  [optional property]
**text** | `String` | The text content (if type is \&quot;text\&quot;). |  [optional property]
**audio** | `String` | Base64-encoded audio data (if type is \&quot;audio\&quot;). |  [optional property]
**transcript** | `String` | The transcript of the audio (if type is \&quot;audio\&quot;). |  [optional property]

## TypeEnum

Name | Value
---- | -----
AUDIO | `"audio"`
TEXT | `"text"`





