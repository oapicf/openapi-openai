

# MessageContentTextAnnotationsFilePathObject

A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Always &#x60;file_path&#x60;. |  |
|**text** | **String** | The text in the message content that needs to be replaced. |  |
|**filePath** | [**MessageContentTextAnnotationsFilePathObjectFilePath**](MessageContentTextAnnotationsFilePathObjectFilePath.md) |  |  |
|**startIndex** | **Integer** |  |  |
|**endIndex** | **Integer** |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FILE_PATH | &quot;file_path&quot; |



