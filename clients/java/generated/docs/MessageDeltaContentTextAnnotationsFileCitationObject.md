

# MessageDeltaContentTextAnnotationsFileCitationObject

A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"file_search\" tool to search files.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**index** | **Integer** | The index of the annotation in the text content part. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Always &#x60;file_citation&#x60;. |  |
|**text** | **String** | The text in the message content that needs to be replaced. |  [optional] |
|**fileCitation** | [**MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation**](MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.md) |  |  [optional] |
|**startIndex** | **Integer** |  |  [optional] |
|**endIndex** | **Integer** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FILE_CITATION | &quot;file_citation&quot; |



