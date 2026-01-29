# Org.OpenAPITools.Model.MessageDeltaContentTextAnnotationsFileCitationObject
A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"retrieval\" tool to search files.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **int** | The index of the annotation in the text content part. | 
**Type** | **string** | Always &#x60;file_citation&#x60;. | 
**Text** | **string** | The text in the message content that needs to be replaced. | [optional] 
**FileCitation** | [**MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation**](MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.md) |  | [optional] 
**StartIndex** | **int** |  | [optional] 
**EndIndex** | **int** |  | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

