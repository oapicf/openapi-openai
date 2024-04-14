

# MessageDeltaContentTextAnnotationsFilePathObject

A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.

The class is defined in **[MessageDeltaContentTextAnnotationsFilePathObject.java](../../src/main/java/org/openapitools/model/MessageDeltaContentTextAnnotationsFilePathObject.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | `Integer` | The index of the annotation in the text content part. | 
**type** | [**TypeEnum**](#TypeEnum) | Always &#x60;file_path&#x60;. | 
**text** | `String` | The text in the message content that needs to be replaced. |  [optional property]
**filePath** | [`MessageDeltaContentTextAnnotationsFilePathObjectFilePath`](MessageDeltaContentTextAnnotationsFilePathObjectFilePath.md) |  |  [optional property]
**startIndex** | `Integer` |  |  [optional property]
**endIndex** | `Integer` |  |  [optional property]


## TypeEnum

Name | Value
---- | -----
FILE_PATH | `"file_path"`






