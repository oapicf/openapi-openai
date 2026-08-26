# AssistantsApiToolChoiceOption



## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | This is a oneOf model. The value must be exactly one of the following types: AssistantsNamedToolChoice, String | Controls which (if any) tool is called by the model. &#x60;none&#x60; means the model will not call any tools and instead generates a message. &#x60;auto&#x60; is the default value and means the model can pick between generating a message or calling one or more tools. &#x60;required&#x60; means the model must call one or more tools before responding to the user. Specifying a particular tool like &#x60;{\&quot;type\&quot;: \&quot;file_search\&quot;}&#x60; or &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that tool.  | [optional] 




[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


