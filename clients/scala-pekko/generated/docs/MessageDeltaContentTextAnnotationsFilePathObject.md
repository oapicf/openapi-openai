

# MessageDeltaContentTextAnnotationsFilePathObject

A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **Int** | The index of the annotation in the text content part. | 
**`type`** | [**`Type`**](#`Type`) | Always &#x60;file_path&#x60;. | 
**text** | **String** | The text in the message content that needs to be replaced. |  [optional]
**filePath** | [**MessageDeltaContentTextAnnotationsFilePathObjectFilePath**](MessageDeltaContentTextAnnotationsFilePathObjectFilePath.md) |  |  [optional]
**startIndex** | **Int** |  |  [optional]
**endIndex** | **Int** |  |  [optional]


## Enum: `Type`
Allowed values: [file_path]




