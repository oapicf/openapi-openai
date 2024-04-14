

# MessageDeltaContentTextObjectTextAnnotationsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**index** | **Integer** | The index of the annotation in the text content part. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Always &#x60;file_citation&#x60;. |  |
|**text** | **String** | The text in the message content that needs to be replaced. |  [optional] |
|**fileCitation** | [**MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation**](MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.md) |  |  [optional] |
|**startIndex** | **Integer** |  |  [optional] |
|**endIndex** | **Integer** |  |  [optional] |
|**filePath** | [**MessageDeltaContentTextAnnotationsFilePathObjectFilePath**](MessageDeltaContentTextAnnotationsFilePathObjectFilePath.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CITATION | &quot;file_citation&quot; |
| PATH | &quot;file_path&quot; |



