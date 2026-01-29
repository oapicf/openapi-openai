# OpenapiOpenai.MessageDeltaContentTextObjectTextAnnotationsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **Number** | The index of the annotation in the text content part. | 
**type** | **String** | Always &#x60;file_citation&#x60;. | 
**text** | **String** | The text in the message content that needs to be replaced. | [optional] 
**fileCitation** | [**MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation**](MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.md) |  | [optional] 
**startIndex** | **Number** |  | [optional] 
**endIndex** | **Number** |  | [optional] 
**filePath** | [**MessageDeltaContentTextAnnotationsFilePathObjectFilePath**](MessageDeltaContentTextAnnotationsFilePathObjectFilePath.md) |  | [optional] 



## Enum: TypeEnum


* `file_citation` (value: `"file_citation"`)

* `file_path` (value: `"file_path"`)




