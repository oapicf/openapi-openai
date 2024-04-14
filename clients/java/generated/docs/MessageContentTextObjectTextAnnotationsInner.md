

# MessageContentTextObjectTextAnnotationsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Always &#x60;file_citation&#x60;. |  |
|**text** | **String** | The text in the message content that needs to be replaced. |  |
|**fileCitation** | [**MessageContentTextAnnotationsFileCitationObjectFileCitation**](MessageContentTextAnnotationsFileCitationObjectFileCitation.md) |  |  |
|**startIndex** | **Integer** |  |  |
|**endIndex** | **Integer** |  |  |
|**filePath** | [**MessageContentTextAnnotationsFilePathObjectFilePath**](MessageContentTextAnnotationsFilePathObjectFilePath.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CITATION | &quot;file_citation&quot; |
| PATH | &quot;file_path&quot; |



