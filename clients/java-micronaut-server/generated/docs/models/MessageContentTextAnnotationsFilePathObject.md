

# MessageContentTextAnnotationsFilePathObject

A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.

The class is defined in **[MessageContentTextAnnotationsFilePathObject.java](../../src/main/java/org/openapitools/model/MessageContentTextAnnotationsFilePathObject.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Always &#x60;file_path&#x60;. | 
**text** | `String` | The text in the message content that needs to be replaced. | 
**filePath** | [`MessageContentTextAnnotationsFilePathObjectFilePath`](MessageContentTextAnnotationsFilePathObjectFilePath.md) |  | 
**startIndex** | `Integer` |  | 
**endIndex** | `Integer` |  | 

## TypeEnum

Name | Value
---- | -----
FILE_PATH | `"file_path"`






