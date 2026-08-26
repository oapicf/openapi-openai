

# MessageDeltaContentTextAnnotationsFilePathObject

A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**index** | **Integer** | The index of the annotation in the text content part. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Always &#x60;file_path&#x60;. |  |
|**text** | **String** | The text in the message content that needs to be replaced. |  [optional] |
|**filePath** | [**MessageDeltaContentTextAnnotationsFilePathObjectFilePath**](MessageDeltaContentTextAnnotationsFilePathObjectFilePath.md) |  |  [optional] |
|**startIndex** | **Integer** |  |  [optional] |
|**endIndex** | **Integer** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FILE_PATH | &quot;file_path&quot; |



