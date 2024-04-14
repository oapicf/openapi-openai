
# Table `MessageDeltaContentTextAnnotationsFilePathObject`
(mapped from: MessageDeltaContentTextAnnotationsFilePathObject)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**index** | index | int NOT NULL |  | **kotlin.Int** | The index of the annotation in the text content part. | 
**type** | type | text NOT NULL |  | [**type**](#Type) | Always &#x60;file_path&#x60;. | 
**text** | text | text |  | **kotlin.String** | The text in the message content that needs to be replaced. |  [optional]
**filePath** | file_path | long |  | [**MessageDeltaContentTextAnnotationsFilePathObjectFilePath**](MessageDeltaContentTextAnnotationsFilePathObjectFilePath.md) |  |  [optional] [foreignkey]
**startIndex** | start_index | int UNSIGNED |  | **kotlin.Int** |  |  [optional]
**endIndex** | end_index | int UNSIGNED |  | **kotlin.Int** |  |  [optional]








