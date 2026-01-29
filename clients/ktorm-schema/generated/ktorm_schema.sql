

-- --------------------------------------------------------------------------
-- Table structure for table `AssistantFileObject` generated from model 'assistantFileObject'
-- A list of [Files](/docs/api-reference/files) attached to an &#x60;assistant&#x60;.
--

CREATE TABLE IF NOT EXISTS `AssistantFileObject` (
  `id` text NOT NULL PRIMARY KEY /*The identifier, which can be referenced in API endpoints.*/,
  `object` text NOT NULL /*The object type, which is always &#x60;assistant.file&#x60;.*/,
  `created_at` int NOT NULL /*The Unix timestamp (in seconds) for when the assistant file was created.*/,
  `assistant_id` text NOT NULL /*The assistant ID that the file is attached to.*/
);  /*A list of [Files](/docs/api-reference/files) attached to an &#x60;assistant&#x60;.*/


-- --------------------------------------------------------------------------
-- Table structure for table `AssistantObject` generated from model 'assistantObject'
-- Represents an &#x60;assistant&#x60; that can call the model and use tools.
--

CREATE TABLE IF NOT EXISTS `AssistantObject` (
  `id` text NOT NULL PRIMARY KEY /*The identifier, which can be referenced in API endpoints.*/,
  `object` text NOT NULL /*The object type, which is always &#x60;assistant&#x60;.*/,
  `created_at` int NOT NULL /*The Unix timestamp (in seconds) for when the assistant was created.*/,
  `name` text NOT NULL /*The name of the assistant. The maximum length is 256 characters. */,
  `description` text NOT NULL /*The description of the assistant. The maximum length is 512 characters. */,
  `model` text NOT NULL /*ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. */,
  `instructions` text NOT NULL /*The system instructions that the assistant uses. The maximum length is 256,000 characters. */,
  `metadata` blob NOT NULL /*Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. */
);  /*Represents an &#x60;assistant&#x60; that can call the model and use tools.*/

-- --------------------------------------------------------------------------
-- Table structure for table `AssistantObjectAssistantObjectToolsInner` generated from model 'AssistantObjectAssistantObjectToolsInner'

CREATE TABLE IF NOT EXISTS `AssistantObjectAssistantObjectToolsInner` (
  `assistantObject` long NOT NULL
  `assistantObjectToolsInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AssistantObjectFileIds` generated from model 'AssistantObjectFileIds'

CREATE TABLE IF NOT EXISTS `AssistantObjectFileIds` (
  `assistantObject` long NOT NULL
  `fileIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AssistantObject_tools_inner` generated from model 'assistantObjectToolsInner'
--

CREATE TABLE IF NOT EXISTS `AssistantObject_tools_inner` (
  `type` text NOT NULL /*The type of tool being defined: &#x60;code_interpreter&#x60;*/,
  `function` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AssistantStreamEvent` generated from model 'assistantStreamEvent'
-- Represents an event emitted when streaming a Run.  Each event in a server-sent events stream has an &#x60;event&#x60; and &#x60;data&#x60; property:  &#x60;&#x60;&#x60; event: thread.created data: {\&quot;id\&quot;: \&quot;thread_123\&quot;, \&quot;object\&quot;: \&quot;thread\&quot;, ...} &#x60;&#x60;&#x60;  We emit events whenever a new object is created, transitions to a new state, or is being streamed in parts (deltas). For example, we emit &#x60;thread.run.created&#x60; when a new run is created, &#x60;thread.run.completed&#x60; when a run completes, and so on. When an Assistant chooses to create a message during a run, we emit a &#x60;thread.message.created event&#x60;, a &#x60;thread.message.in_progress&#x60; event, many &#x60;thread.message.delta&#x60; events, and finally a &#x60;thread.message.completed&#x60; event.  We may add additional events over time, so we recommend handling unknown events gracefully in your code. See the [Assistants API quickstart](/docs/assistants/overview) to learn how to integrate the Assistants API with streaming. 
--

CREATE TABLE IF NOT EXISTS `AssistantStreamEvent` (
  `event` text NOT NULL,
  `data` text NOT NULL
);  /*Represents an event emitted when streaming a Run.  Each event in a server-sent events stream has an &#x60;event&#x60; and &#x60;data&#x60; property:  &#x60;&#x60;&#x60; event: thread.created data: {\&quot;id\&quot;: \&quot;thread_123\&quot;, \&quot;object\&quot;: \&quot;thread\&quot;, ...} &#x60;&#x60;&#x60;  We emit events whenever a new object is created, transitions to a new state, or is being streamed in parts (deltas). For example, we emit &#x60;thread.run.created&#x60; when a new run is created, &#x60;thread.run.completed&#x60; when a run completes, and so on. When an Assistant chooses to create a message during a run, we emit a &#x60;thread.message.created event&#x60;, a &#x60;thread.message.in_progress&#x60; event, many &#x60;thread.message.delta&#x60; events, and finally a &#x60;thread.message.completed&#x60; event.  We may add additional events over time, so we recommend handling unknown events gracefully in your code. See the [Assistants API quickstart](/docs/assistants/overview) to learn how to integrate the Assistants API with streaming. */


-- --------------------------------------------------------------------------
-- Table structure for table `AssistantToolsCode` generated from model 'assistantToolsCode'
--

CREATE TABLE IF NOT EXISTS `AssistantToolsCode` (
  `type` text NOT NULL /*The type of tool being defined: &#x60;code_interpreter&#x60;*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AssistantToolsFunction` generated from model 'assistantToolsFunction'
--

CREATE TABLE IF NOT EXISTS `AssistantToolsFunction` (
  `type` text NOT NULL /*The type of tool being defined: &#x60;function&#x60;*/,
  `function` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AssistantToolsRetrieval` generated from model 'assistantToolsRetrieval'
--

CREATE TABLE IF NOT EXISTS `AssistantToolsRetrieval` (
  `type` text NOT NULL /*The type of tool being defined: &#x60;retrieval&#x60;*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AssistantsApiNamedToolChoice` generated from model 'assistantsApiNamedToolChoice'
-- Specifies a tool the model should use. Use to force the model to call a specific tool.
--

CREATE TABLE IF NOT EXISTS `AssistantsApiNamedToolChoice` (
  `type` text NOT NULL /*The type of the tool. If type is &#x60;function&#x60;, the function name must be set*/,
  `function` long
);  /*Specifies a tool the model should use. Use to force the model to call a specific tool.*/


-- --------------------------------------------------------------------------
-- Table structure for table `AssistantsApiResponseFormat` generated from model 'assistantsApiResponseFormat'
-- An object describing the expected output of the model. If &#x60;json_object&#x60; only &#x60;function&#x60; type &#x60;tools&#x60; are allowed to be passed to the Run. If &#x60;text&#x60; the model can return text or any value needed. 
--

CREATE TABLE IF NOT EXISTS `AssistantsApiResponseFormat` (
  `type` text /*Must be one of &#x60;text&#x60; or &#x60;json_object&#x60;.*/
);  /*An object describing the expected output of the model. If &#x60;json_object&#x60; only &#x60;function&#x60; type &#x60;tools&#x60; are allowed to be passed to the Run. If &#x60;text&#x60; the model can return text or any value needed. */


-- --------------------------------------------------------------------------
-- Table structure for table `AssistantsApiResponseFormatOption` generated from model 'assistantsApiResponseFormatOption'
-- Specifies the format that the model must output. Compatible with [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than &#x60;gpt-3.5-turbo-1106&#x60;.  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_object\&quot; }&#x60; enables JSON mode, which guarantees the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \&quot;stuck\&quot; request. Also note that the message content may be partially cut off if &#x60;finish_reason&#x3D;\&quot;length\&quot;&#x60;, which indicates the generation exceeded &#x60;max_tokens&#x60; or the conversation exceeded the max context length. 
--

CREATE TABLE IF NOT EXISTS `AssistantsApiResponseFormatOption` (
  `type` text /*Must be one of &#x60;text&#x60; or &#x60;json_object&#x60;.*/
);  /*Specifies the format that the model must output. Compatible with [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than &#x60;gpt-3.5-turbo-1106&#x60;.  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_object\&quot; }&#x60; enables JSON mode, which guarantees the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \&quot;stuck\&quot; request. Also note that the message content may be partially cut off if &#x60;finish_reason&#x3D;\&quot;length\&quot;&#x60;, which indicates the generation exceeded &#x60;max_tokens&#x60; or the conversation exceeded the max context length. */


-- --------------------------------------------------------------------------
-- Table structure for table `AssistantsApiToolChoiceOption` generated from model 'assistantsApiToolChoiceOption'
-- Controls which (if any) tool is called by the model. &#x60;none&#x60; means the model will not call any tools and instead generates a message. &#x60;auto&#x60; is the default value and means the model can pick between generating a message or calling a tool. Specifying a particular tool like &#x60;{\&quot;type\&quot;: \&quot;TOOL_TYPE\&quot;}&#x60; or &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that tool. 
--

CREATE TABLE IF NOT EXISTS `AssistantsApiToolChoiceOption` (
  `type` text NOT NULL /*The type of the tool. If type is &#x60;function&#x60;, the function name must be set*/,
  `function` long
);  /*Controls which (if any) tool is called by the model. &#x60;none&#x60; means the model will not call any tools and instead generates a message. &#x60;auto&#x60; is the default value and means the model can pick between generating a message or calling a tool. Specifying a particular tool like &#x60;{\&quot;type\&quot;: \&quot;TOOL_TYPE\&quot;}&#x60; or &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that tool. */


-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionFunctionCallOption` generated from model 'chatCompletionFunctionCallOption'
-- Specifying a particular function via &#x60;{\&quot;name\&quot;: \&quot;my_function\&quot;}&#x60; forces the model to call that function. 
--

CREATE TABLE IF NOT EXISTS `ChatCompletionFunctionCallOption` (
  `name` text NOT NULL /*The name of the function to call.*/
);  /*Specifying a particular function via &#x60;{\&quot;name\&quot;: \&quot;my_function\&quot;}&#x60; forces the model to call that function. */


-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionFunctions` generated from model 'chatCompletionFunctions'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionFunctions` (
  `name` text NOT NULL /*The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.*/,
  `description` text /*A description of what the function does, used by the model to choose when and how to call the function.*/,
  `parameters` blob /*The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/text-generation/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting &#x60;parameters&#x60; defines a function with an empty parameter list.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionMessageToolCall` generated from model 'chatCompletionMessageToolCall'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionMessageToolCall` (
  `id` text NOT NULL PRIMARY KEY /*The ID of the tool call.*/,
  `type` text NOT NULL /*The type of the tool. Currently, only &#x60;function&#x60; is supported.*/,
  `function` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionMessageToolCallChunk` generated from model 'chatCompletionMessageToolCallChunk'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionMessageToolCallChunk` (
  `index` int NOT NULL,
  `id` text PRIMARY KEY /*The ID of the tool call.*/,
  `type` text /*The type of the tool. Currently, only &#x60;function&#x60; is supported.*/,
  `function` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionMessageToolCallChunk_function` generated from model 'chatCompletionMessageToolCallChunkFunction'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionMessageToolCallChunk_function` (
  `name` text /*The name of the function to call.*/,
  `arguments` text /*The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionMessageToolCall_function` generated from model 'chatCompletionMessageToolCallFunction'
-- The function that the model called.
--

CREATE TABLE IF NOT EXISTS `ChatCompletionMessageToolCall_function` (
  `name` text NOT NULL /*The name of the function to call.*/,
  `arguments` text NOT NULL /*The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.*/
);  /*The function that the model called.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionNamedToolChoice` generated from model 'chatCompletionNamedToolChoice'
-- Specifies a tool the model should use. Use to force the model to call a specific function.
--

CREATE TABLE IF NOT EXISTS `ChatCompletionNamedToolChoice` (
  `type` text NOT NULL /*The type of the tool. Currently, only &#x60;function&#x60; is supported.*/,
  `function` long NOT NULL
);  /*Specifies a tool the model should use. Use to force the model to call a specific function.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionNamedToolChoice_function` generated from model 'chatCompletionNamedToolChoiceFunction'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionNamedToolChoice_function` (
  `name` text NOT NULL /*The name of the function to call.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionRequestAssistantMessage` generated from model 'chatCompletionRequestAssistantMessage'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionRequestAssistantMessage` (
  `role` text NOT NULL /*The role of the messages author, in this case &#x60;assistant&#x60;.*/,
  `content` text /*The contents of the assistant message. Required unless &#x60;tool_calls&#x60; or &#x60;function_call&#x60; is specified. */,
  `name` text /*An optional name for the participant. Provides the model information to differentiate between participants of the same role.*/,
  `function_call` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionRequestAssistantMessageChatCompletionMessageToolCall` generated from model 'ChatCompletionRequestAssistantMessageChatCompletionMessageToolCall'

CREATE TABLE IF NOT EXISTS `ChatCompletionRequestAssistantMessageChatCompletionMessageToolCall` (
  `chatCompletionRequestAssistantMessage` long NOT NULL
  `chatCompletionMessageToolCall` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionRequestAssistantMessage_function_call` generated from model 'chatCompletionRequestAssistantMessageFunctionCall'
-- Deprecated and replaced by &#x60;tool_calls&#x60;. The name and arguments of a function that should be called, as generated by the model.
--

CREATE TABLE IF NOT EXISTS `ChatCompletionRequestAssistantMessage_function_call` (
  `arguments` text NOT NULL /*The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.*/,
  `name` text NOT NULL /*The name of the function to call.*/
);  /*Deprecated and replaced by &#x60;tool_calls&#x60;. The name and arguments of a function that should be called, as generated by the model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionRequestFunctionMessage` generated from model 'chatCompletionRequestFunctionMessage'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionRequestFunctionMessage` (
  `role` text NOT NULL /*The role of the messages author, in this case &#x60;function&#x60;.*/,
  `content` text NOT NULL /*The contents of the function message.*/,
  `name` text NOT NULL /*The name of the function to call.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionRequestMessage` generated from model 'chatCompletionRequestMessage'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionRequestMessage` (
  `content` text NOT NULL /*The contents of the function message.*/,
  `role` text NOT NULL /*The role of the messages author, in this case &#x60;function&#x60;.*/,
  `name` text NOT NULL /*The name of the function to call.*/,
  `tool_call_id` text NOT NULL /*Tool call that this message is responding to.*/,
  `function_call` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionRequestMessageChatCompletionMessageToolCall` generated from model 'ChatCompletionRequestMessageChatCompletionMessageToolCall'

CREATE TABLE IF NOT EXISTS `ChatCompletionRequestMessageChatCompletionMessageToolCall` (
  `chatCompletionRequestMessage` long NOT NULL
  `chatCompletionMessageToolCall` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionRequestMessageContentPart` generated from model 'chatCompletionRequestMessageContentPart'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionRequestMessageContentPart` (
  `type` text NOT NULL /*The type of the content part.*/,
  `text` text NOT NULL /*The text content.*/,
  `image_url` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionRequestMessageContentPartImage` generated from model 'chatCompletionRequestMessageContentPartImage'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionRequestMessageContentPartImage` (
  `type` text NOT NULL /*The type of the content part.*/,
  `image_url` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionRequestMessageContentPartImage_image_url` generated from model 'chatCompletionRequestMessageContentPartImageImageUrl'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionRequestMessageContentPartImage_image_url` (
  `url` text NOT NULL /*Either a URL of the image or the base64 encoded image data.*/,
  `detail` text /*Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionRequestMessageContentPartText` generated from model 'chatCompletionRequestMessageContentPartText'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionRequestMessageContentPartText` (
  `type` text NOT NULL /*The type of the content part.*/,
  `text` text NOT NULL /*The text content.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionRequestSystemMessage` generated from model 'chatCompletionRequestSystemMessage'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionRequestSystemMessage` (
  `content` text NOT NULL /*The contents of the system message.*/,
  `role` text NOT NULL /*The role of the messages author, in this case &#x60;system&#x60;.*/,
  `name` text /*An optional name for the participant. Provides the model information to differentiate between participants of the same role.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionRequestToolMessage` generated from model 'chatCompletionRequestToolMessage'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionRequestToolMessage` (
  `role` text NOT NULL /*The role of the messages author, in this case &#x60;tool&#x60;.*/,
  `content` text NOT NULL /*The contents of the tool message.*/,
  `tool_call_id` text NOT NULL /*Tool call that this message is responding to.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionRequestUserMessage` generated from model 'chatCompletionRequestUserMessage'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionRequestUserMessage` (
  `content` long NOT NULL,
  `role` text NOT NULL /*The role of the messages author, in this case &#x60;user&#x60;.*/,
  `name` text /*An optional name for the participant. Provides the model information to differentiate between participants of the same role.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionResponseMessage` generated from model 'chatCompletionResponseMessage'
-- A chat completion message generated by the model.
--

CREATE TABLE IF NOT EXISTS `ChatCompletionResponseMessage` (
  `content` text NOT NULL /*The contents of the message.*/,
  `role` text NOT NULL /*The role of the author of this message.*/,
  `function_call` long
);  /*A chat completion message generated by the model.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionResponseMessageChatCompletionMessageToolCall` generated from model 'ChatCompletionResponseMessageChatCompletionMessageToolCall'

CREATE TABLE IF NOT EXISTS `ChatCompletionResponseMessageChatCompletionMessageToolCall` (
  `chatCompletionResponseMessage` long NOT NULL
  `chatCompletionMessageToolCall` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionStreamResponseDelta` generated from model 'chatCompletionStreamResponseDelta'
-- A chat completion delta generated by streamed model responses.
--

CREATE TABLE IF NOT EXISTS `ChatCompletionStreamResponseDelta` (
  `content` text /*The contents of the chunk message.*/,
  `function_call` long,
  `role` text /*The role of the author of this message.*/
);  /*A chat completion delta generated by streamed model responses.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionStreamResponseDeltaChatCompletionMessageToolCallChunk` generated from model 'ChatCompletionStreamResponseDeltaChatCompletionMessageToolCallChunk'

CREATE TABLE IF NOT EXISTS `ChatCompletionStreamResponseDeltaChatCompletionMessageToolCallChunk` (
  `chatCompletionStreamResponseDelta` long NOT NULL
  `chatCompletionMessageToolCallChunk` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionStreamResponseDelta_function_call` generated from model 'chatCompletionStreamResponseDeltaFunctionCall'
-- Deprecated and replaced by &#x60;tool_calls&#x60;. The name and arguments of a function that should be called, as generated by the model.
--

CREATE TABLE IF NOT EXISTS `ChatCompletionStreamResponseDelta_function_call` (
  `arguments` text /*The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.*/,
  `name` text /*The name of the function to call.*/
);  /*Deprecated and replaced by &#x60;tool_calls&#x60;. The name and arguments of a function that should be called, as generated by the model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionTokenLogprob` generated from model 'chatCompletionTokenLogprob'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionTokenLogprob` (
  `token` text NOT NULL /*The token.*/,
  `logprob` decimal NOT NULL /*The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value &#x60;-9999.0&#x60; is used to signify that the token is very unlikely.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionTokenLogprobBytes` generated from model 'ChatCompletionTokenLogprobBytes'

CREATE TABLE IF NOT EXISTS `ChatCompletionTokenLogprobBytes` (
  `chatCompletionTokenLogprob` long NOT NULL
  `bytes` int NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionTokenLogprobChatCompletionTokenLogprobTopLogprobsInner` generated from model 'ChatCompletionTokenLogprobChatCompletionTokenLogprobTopLogprobsInner'

CREATE TABLE IF NOT EXISTS `ChatCompletionTokenLogprobChatCompletionTokenLogprobTopLogprobsInner` (
  `chatCompletionTokenLogprob` long NOT NULL
  `chatCompletionTokenLogprobTopLogprobsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionTokenLogprob_top_logprobs_inner` generated from model 'chatCompletionTokenLogprobTopLogprobsInner'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionTokenLogprob_top_logprobs_inner` (
  `token` text NOT NULL /*The token.*/,
  `logprob` decimal NOT NULL /*The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value &#x60;-9999.0&#x60; is used to signify that the token is very unlikely.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionTokenLogprobTopLogprobsInnerBytes` generated from model 'ChatCompletionTokenLogprobTopLogprobsInnerBytes'

CREATE TABLE IF NOT EXISTS `ChatCompletionTokenLogprobTopLogprobsInnerBytes` (
  `chatCompletionTokenLogprobTopLogprobsInner` long NOT NULL
  `bytes` int NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionTool` generated from model 'chatCompletionTool'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionTool` (
  `type` text NOT NULL /*The type of the tool. Currently, only &#x60;function&#x60; is supported.*/,
  `function` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ChatCompletionToolChoiceOption` generated from model 'chatCompletionToolChoiceOption'
-- Controls which (if any) function is called by the model. &#x60;none&#x60; means the model will not call a function and instead generates a message. &#x60;auto&#x60; means the model can pick between generating a message or calling a function. Specifying a particular function via &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that function.  &#x60;none&#x60; is the default when no functions are present. &#x60;auto&#x60; is the default if functions are present. 
--

CREATE TABLE IF NOT EXISTS `ChatCompletionToolChoiceOption` (
  `type` text NOT NULL /*The type of the tool. Currently, only &#x60;function&#x60; is supported.*/,
  `function` long NOT NULL
);  /*Controls which (if any) function is called by the model. &#x60;none&#x60; means the model will not call a function and instead generates a message. &#x60;auto&#x60; means the model can pick between generating a message or calling a function. Specifying a particular function via &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that function.  &#x60;none&#x60; is the default when no functions are present. &#x60;auto&#x60; is the default if functions are present. */


-- --------------------------------------------------------------------------
-- Table structure for table `CompletionUsage` generated from model 'completionUsage'
-- Usage statistics for the completion request.
--

CREATE TABLE IF NOT EXISTS `CompletionUsage` (
  `completion_tokens` int NOT NULL /*Number of tokens in the generated completion.*/,
  `prompt_tokens` int NOT NULL /*Number of tokens in the prompt.*/,
  `total_tokens` int NOT NULL /*Total number of tokens used in the request (prompt + completion).*/
);  /*Usage statistics for the completion request.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CreateAssistantFileRequest` generated from model 'createAssistantFileRequest'
--

CREATE TABLE IF NOT EXISTS `CreateAssistantFileRequest` (
  `file_id` text NOT NULL /*A [File](/docs/api-reference/files) ID (with &#x60;purpose&#x3D;\&quot;assistants\&quot;&#x60;) that the assistant should use. Useful for tools like &#x60;retrieval&#x60; and &#x60;code_interpreter&#x60; that can access files.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CreateAssistantRequest` generated from model 'createAssistantRequest'
--

CREATE TABLE IF NOT EXISTS `CreateAssistantRequest` (
  `model` long NOT NULL,
  `name` text /*The name of the assistant. The maximum length is 256 characters. */,
  `description` text /*The description of the assistant. The maximum length is 512 characters. */,
  `instructions` text /*The system instructions that the assistant uses. The maximum length is 256,000 characters. */,
  `metadata` blob /*Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. */
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CreateAssistantRequestAssistantObjectToolsInner` generated from model 'CreateAssistantRequestAssistantObjectToolsInner'

CREATE TABLE IF NOT EXISTS `CreateAssistantRequestAssistantObjectToolsInner` (
  `createAssistantRequest` long NOT NULL
  `assistantObjectToolsInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CreateAssistantRequestFileIds` generated from model 'CreateAssistantRequestFileIds'

CREATE TABLE IF NOT EXISTS `CreateAssistantRequestFileIds` (
  `createAssistantRequest` long NOT NULL
  `fileIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateChatCompletionFunctionResponse` generated from model 'createChatCompletionFunctionResponse'
-- Represents a chat completion response returned by model, based on the provided input.
--

CREATE TABLE IF NOT EXISTS `CreateChatCompletionFunctionResponse` (
  `id` text NOT NULL PRIMARY KEY /*A unique identifier for the chat completion.*/,
  `created` int NOT NULL /*The Unix timestamp (in seconds) of when the chat completion was created.*/,
  `model` text NOT NULL /*The model used for the chat completion.*/,
  `object` text NOT NULL /*The object type, which is always &#x60;chat.completion&#x60;.*/,
  `system_fingerprint` text /*This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. */,
  `usage` long
);  /*Represents a chat completion response returned by model, based on the provided input.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CreateChatCompletionFunctionResponseCreateChatCompletionFunctionResponseChoicesInner` generated from model 'CreateChatCompletionFunctionResponseCreateChatCompletionFunctionResponseChoicesInner'

CREATE TABLE IF NOT EXISTS `CreateChatCompletionFunctionResponseCreateChatCompletionFunctionResponseChoicesInner` (
  `createChatCompletionFunctionResponse` long NOT NULL
  `createChatCompletionFunctionResponseChoicesInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateChatCompletionFunctionResponse_choices_inner` generated from model 'createChatCompletionFunctionResponseChoicesInner'
--

CREATE TABLE IF NOT EXISTS `CreateChatCompletionFunctionResponse_choices_inner` (
  `finish_reason` text NOT NULL /*The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, or &#x60;function_call&#x60; if the model called a function. */,
  `index` int NOT NULL /*The index of the choice in the list of choices.*/,
  `message` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CreateChatCompletionRequest` generated from model 'createChatCompletionRequest'
--

CREATE TABLE IF NOT EXISTS `CreateChatCompletionRequest` (
  `model` long NOT NULL,
  `frequency_penalty` decimal /*Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model&#39;s likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) */,
  `logit_bias` blob /*Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. */,
  `logprobs` boolean /*Whether to return log probabilities of the output tokens or not. If true, returns the log probabilities of each output token returned in the &#x60;content&#x60; of &#x60;message&#x60;.*/,
  `top_logprobs` int UNSIGNED /*An integer between 0 and 20 specifying the number of most likely tokens to return at each token position, each with an associated log probability. &#x60;logprobs&#x60; must be set to &#x60;true&#x60; if this parameter is used.*/,
  `max_tokens` int /*The maximum number of [tokens](/tokenizer) that can be generated in the chat completion.  The total length of input tokens and generated tokens is limited by the model&#39;s context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. */,
  `n` int UNSIGNED /*How many chat completion choices to generate for each input message. Note that you will be charged based on the number of generated tokens across all of the choices. Keep &#x60;n&#x60; as &#x60;1&#x60; to minimize costs.*/,
  `presence_penalty` decimal /*Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model&#39;s likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) */,
  `response_format` long,
  `seed` int /*This feature is in Beta. If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same &#x60;seed&#x60; and parameters should return the same result. Determinism is not guaranteed, and you should refer to the &#x60;system_fingerprint&#x60; response parameter to monitor changes in the backend. */,
  `stop` long,
  `stream` boolean /*If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a &#x60;data: [DONE]&#x60; message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). */,
  `temperature` decimal /*What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both. */,
  `top_p` decimal /*An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both. */,
  `tool_choice` long,
  `user` text /*A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). */,
  `function_call` long,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CreateChatCompletionRequestChatCompletionRequestMessage` generated from model 'CreateChatCompletionRequestChatCompletionRequestMessage'

CREATE TABLE IF NOT EXISTS `CreateChatCompletionRequestChatCompletionRequestMessage` (
  `createChatCompletionRequest` long NOT NULL
  `chatCompletionRequestMessage` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CreateChatCompletionRequestChatCompletionTool` generated from model 'CreateChatCompletionRequestChatCompletionTool'

CREATE TABLE IF NOT EXISTS `CreateChatCompletionRequestChatCompletionTool` (
  `createChatCompletionRequest` long NOT NULL
  `chatCompletionTool` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CreateChatCompletionRequestChatCompletionFunctions` generated from model 'CreateChatCompletionRequestChatCompletionFunctions'

CREATE TABLE IF NOT EXISTS `CreateChatCompletionRequestChatCompletionFunctions` (
  `createChatCompletionRequest` long NOT NULL
  `chatCompletionFunctions` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateChatCompletionRequest_function_call` generated from model 'createChatCompletionRequestFunctionCall'
-- Deprecated in favor of &#x60;tool_choice&#x60;.  Controls which (if any) function is called by the model. &#x60;none&#x60; means the model will not call a function and instead generates a message. &#x60;auto&#x60; means the model can pick between generating a message or calling a function. Specifying a particular function via &#x60;{\&quot;name\&quot;: \&quot;my_function\&quot;}&#x60; forces the model to call that function.  &#x60;none&#x60; is the default when no functions are present. &#x60;auto&#x60; is the default if functions are present. 
--

CREATE TABLE IF NOT EXISTS `CreateChatCompletionRequest_function_call` (
  `name` text NOT NULL /*The name of the function to call.*/
);  /*Deprecated in favor of &#x60;tool_choice&#x60;.  Controls which (if any) function is called by the model. &#x60;none&#x60; means the model will not call a function and instead generates a message. &#x60;auto&#x60; means the model can pick between generating a message or calling a function. Specifying a particular function via &#x60;{\&quot;name\&quot;: \&quot;my_function\&quot;}&#x60; forces the model to call that function.  &#x60;none&#x60; is the default when no functions are present. &#x60;auto&#x60; is the default if functions are present. */


-- --------------------------------------------------------------------------
-- Table structure for table `CreateChatCompletionRequest_response_format` generated from model 'createChatCompletionRequestResponseFormat'
-- An object specifying the format that the model must output. Compatible with [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than &#x60;gpt-3.5-turbo-1106&#x60;.  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_object\&quot; }&#x60; enables JSON mode, which guarantees the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \&quot;stuck\&quot; request. Also note that the message content may be partially cut off if &#x60;finish_reason&#x3D;\&quot;length\&quot;&#x60;, which indicates the generation exceeded &#x60;max_tokens&#x60; or the conversation exceeded the max context length. 
--

CREATE TABLE IF NOT EXISTS `CreateChatCompletionRequest_response_format` (
  `type` text /*Must be one of &#x60;text&#x60; or &#x60;json_object&#x60;.*/
);  /*An object specifying the format that the model must output. Compatible with [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than &#x60;gpt-3.5-turbo-1106&#x60;.  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_object\&quot; }&#x60; enables JSON mode, which guarantees the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \&quot;stuck\&quot; request. Also note that the message content may be partially cut off if &#x60;finish_reason&#x3D;\&quot;length\&quot;&#x60;, which indicates the generation exceeded &#x60;max_tokens&#x60; or the conversation exceeded the max context length. */


-- --------------------------------------------------------------------------
-- Table structure for table `CreateChatCompletionResponse` generated from model 'createChatCompletionResponse'
-- Represents a chat completion response returned by model, based on the provided input.
--

CREATE TABLE IF NOT EXISTS `CreateChatCompletionResponse` (
  `id` text NOT NULL PRIMARY KEY /*A unique identifier for the chat completion.*/,
  `created` int NOT NULL /*The Unix timestamp (in seconds) of when the chat completion was created.*/,
  `model` text NOT NULL /*The model used for the chat completion.*/,
  `object` text NOT NULL /*The object type, which is always &#x60;chat.completion&#x60;.*/,
  `system_fingerprint` text /*This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. */,
  `usage` long
);  /*Represents a chat completion response returned by model, based on the provided input.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CreateChatCompletionResponseCreateChatCompletionResponseChoicesInner` generated from model 'CreateChatCompletionResponseCreateChatCompletionResponseChoicesInner'

CREATE TABLE IF NOT EXISTS `CreateChatCompletionResponseCreateChatCompletionResponseChoicesInner` (
  `createChatCompletionResponse` long NOT NULL
  `createChatCompletionResponseChoicesInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateChatCompletionResponse_choices_inner` generated from model 'createChatCompletionResponseChoicesInner'
--

CREATE TABLE IF NOT EXISTS `CreateChatCompletionResponse_choices_inner` (
  `finish_reason` text NOT NULL /*The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, &#x60;tool_calls&#x60; if the model called a tool, or &#x60;function_call&#x60; (deprecated) if the model called a function. */,
  `index` int NOT NULL /*The index of the choice in the list of choices.*/,
  `message` long NOT NULL,
  `logprobs` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CreateChatCompletionResponse_choices_inner_logprobs` generated from model 'createChatCompletionResponseChoicesInnerLogprobs'
-- Log probability information for the choice.
--

CREATE TABLE IF NOT EXISTS `CreateChatCompletionResponse_choices_inner_logprobs` (
);  /*Log probability information for the choice.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CreateChatCompletionResponseChoicesInnerLogprobsChatCompletionTokenLogprob` generated from model 'CreateChatCompletionResponseChoicesInnerLogprobsChatCompletionTokenLogprob'

CREATE TABLE IF NOT EXISTS `CreateChatCompletionResponseChoicesInnerLogprobsChatCompletionTokenLogprob` (
  `createChatCompletionResponseChoicesInnerLogprobs` long NOT NULL
  `chatCompletionTokenLogprob` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateChatCompletionStreamResponse` generated from model 'createChatCompletionStreamResponse'
-- Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
--

CREATE TABLE IF NOT EXISTS `CreateChatCompletionStreamResponse` (
  `id` text NOT NULL PRIMARY KEY /*A unique identifier for the chat completion. Each chunk has the same ID.*/,
  `created` int NOT NULL /*The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.*/,
  `model` text NOT NULL /*The model to generate the completion.*/,
  `object` text NOT NULL /*The object type, which is always &#x60;chat.completion.chunk&#x60;.*/,
  `system_fingerprint` text /*This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. */
);  /*Represents a streamed chunk of a chat completion response returned by model, based on the provided input.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CreateChatCompletionStreamResponseCreateChatCompletionStreamResponseChoicesInner` generated from model 'CreateChatCompletionStreamResponseCreateChatCompletionStreamResponseChoicesInner'

CREATE TABLE IF NOT EXISTS `CreateChatCompletionStreamResponseCreateChatCompletionStreamResponseChoicesInner` (
  `createChatCompletionStreamResponse` long NOT NULL
  `createChatCompletionStreamResponseChoicesInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateChatCompletionStreamResponse_choices_inner` generated from model 'createChatCompletionStreamResponseChoicesInner'
--

CREATE TABLE IF NOT EXISTS `CreateChatCompletionStreamResponse_choices_inner` (
  `delta` long NOT NULL,
  `finish_reason` text NOT NULL /*The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, &#x60;tool_calls&#x60; if the model called a tool, or &#x60;function_call&#x60; (deprecated) if the model called a function. */,
  `index` int NOT NULL /*The index of the choice in the list of choices.*/,
  `logprobs` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CreateCompletionRequest` generated from model 'createCompletionRequest'
--

CREATE TABLE IF NOT EXISTS `CreateCompletionRequest` (
  `model` long NOT NULL,
  `prompt` long NOT NULL,
  `best_of` int UNSIGNED /*Generates &#x60;best_of&#x60; completions server-side and returns the \&quot;best\&quot; (the one with the highest log probability per token). Results cannot be streamed.  When used with &#x60;n&#x60;, &#x60;best_of&#x60; controls the number of candidate completions and &#x60;n&#x60; specifies how many to return – &#x60;best_of&#x60; must be greater than &#x60;n&#x60;.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for &#x60;max_tokens&#x60; and &#x60;stop&#x60;. */,
  `echo` boolean /*Echo back the prompt in addition to the completion */,
  `frequency_penalty` decimal /*Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model&#39;s likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) */,
  `logit_bias` blob /*Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view&#x3D;bpe) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass &#x60;{\&quot;50256\&quot;: -100}&#x60; to prevent the &lt;|endoftext|&gt; token from being generated. */,
  `logprobs` int UNSIGNED /*Include the log probabilities on the &#x60;logprobs&#x60; most likely output tokens, as well the chosen tokens. For example, if &#x60;logprobs&#x60; is 5, the API will return a list of the 5 most likely tokens. The API will always return the &#x60;logprob&#x60; of the sampled token, so there may be up to &#x60;logprobs+1&#x60; elements in the response.  The maximum value for &#x60;logprobs&#x60; is 5. */,
  `max_tokens` int UNSIGNED /*The maximum number of [tokens](/tokenizer) that can be generated in the completion.  The token count of your prompt plus &#x60;max_tokens&#x60; cannot exceed the model&#39;s context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. */,
  `n` int UNSIGNED /*How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for &#x60;max_tokens&#x60; and &#x60;stop&#x60;. */,
  `presence_penalty` decimal /*Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model&#39;s likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) */,
  `seed` int /*If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same &#x60;seed&#x60; and parameters should return the same result.  Determinism is not guaranteed, and you should refer to the &#x60;system_fingerprint&#x60; response parameter to monitor changes in the backend. */,
  `stop` long,
  `stream` boolean /*Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a &#x60;data: [DONE]&#x60; message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). */,
  `suffix` text /*The suffix that comes after a completion of inserted text.  This parameter is only supported for &#x60;gpt-3.5-turbo-instruct&#x60;. */,
  `temperature` decimal /*What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both. */,
  `top_p` decimal /*An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both. */,
  `user` text /*A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). */
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CreateCompletionResponse` generated from model 'createCompletionResponse'
-- Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 
--

CREATE TABLE IF NOT EXISTS `CreateCompletionResponse` (
  `id` text NOT NULL PRIMARY KEY /*A unique identifier for the completion.*/,
  `created` int NOT NULL /*The Unix timestamp (in seconds) of when the completion was created.*/,
  `model` text NOT NULL /*The model used for completion.*/,
  `object` text NOT NULL /*The object type, which is always \&quot;text_completion\&quot;*/,
  `system_fingerprint` text /*This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. */,
  `usage` long
);  /*Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). */

-- --------------------------------------------------------------------------
-- Table structure for table `CreateCompletionResponseCreateCompletionResponseChoicesInner` generated from model 'CreateCompletionResponseCreateCompletionResponseChoicesInner'

CREATE TABLE IF NOT EXISTS `CreateCompletionResponseCreateCompletionResponseChoicesInner` (
  `createCompletionResponse` long NOT NULL
  `createCompletionResponseChoicesInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateCompletionResponse_choices_inner` generated from model 'createCompletionResponseChoicesInner'
--

CREATE TABLE IF NOT EXISTS `CreateCompletionResponse_choices_inner` (
  `finish_reason` text NOT NULL /*The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, or &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters. */,
  `index` int NOT NULL,
  `logprobs` long NOT NULL,
  `text` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CreateCompletionResponse_choices_inner_logprobs` generated from model 'createCompletionResponseChoicesInnerLogprobs'
--

CREATE TABLE IF NOT EXISTS `CreateCompletionResponse_choices_inner_logprobs` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CreateCompletionResponseChoicesInnerLogprobsTextOffset` generated from model 'CreateCompletionResponseChoicesInnerLogprobsTextOffset'

CREATE TABLE IF NOT EXISTS `CreateCompletionResponseChoicesInnerLogprobsTextOffset` (
  `createCompletionResponseChoicesInnerLogprobs` long NOT NULL
  `textOffset` int NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CreateCompletionResponseChoicesInnerLogprobsTokenLogprobs` generated from model 'CreateCompletionResponseChoicesInnerLogprobsTokenLogprobs'

CREATE TABLE IF NOT EXISTS `CreateCompletionResponseChoicesInnerLogprobsTokenLogprobs` (
  `createCompletionResponseChoicesInnerLogprobs` long NOT NULL
  `tokenLogprobs` decimal NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CreateCompletionResponseChoicesInnerLogprobsTokens` generated from model 'CreateCompletionResponseChoicesInnerLogprobsTokens'

CREATE TABLE IF NOT EXISTS `CreateCompletionResponseChoicesInnerLogprobsTokens` (
  `createCompletionResponseChoicesInnerLogprobs` long NOT NULL
  `tokens` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CreateCompletionResponseChoicesInnerLogprobsTopLogprobs` generated from model 'CreateCompletionResponseChoicesInnerLogprobsTopLogprobs'

CREATE TABLE IF NOT EXISTS `CreateCompletionResponseChoicesInnerLogprobsTopLogprobs` (
  `createCompletionResponseChoicesInnerLogprobs` long NOT NULL
  `topLogprobs` blob NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateEmbeddingRequest` generated from model 'createEmbeddingRequest'
--

CREATE TABLE IF NOT EXISTS `CreateEmbeddingRequest` (
  `input` long NOT NULL,
  `model` long NOT NULL,
  `encoding_format` text /*The format to return the embeddings in. Can be either &#x60;float&#x60; or [&#x60;base64&#x60;](https://pypi.org/project/pybase64/).*/,
  `dimensions` int UNSIGNED /*The number of dimensions the resulting output embeddings should have. Only supported in &#x60;text-embedding-3&#x60; and later models. */,
  `user` text /*A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). */
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CreateEmbeddingResponse` generated from model 'createEmbeddingResponse'
--

CREATE TABLE IF NOT EXISTS `CreateEmbeddingResponse` (
  `model` text NOT NULL /*The name of the model used to generate the embedding.*/,
  `object` text NOT NULL /*The object type, which is always \&quot;list\&quot;.*/,
  `usage` long NOT NULL
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CreateEmbeddingResponseEmbedding` generated from model 'CreateEmbeddingResponseEmbedding'

CREATE TABLE IF NOT EXISTS `CreateEmbeddingResponseEmbedding` (
  `createEmbeddingResponse` long NOT NULL
  `embedding` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateEmbeddingResponse_usage` generated from model 'createEmbeddingResponseUsage'
-- The usage information for the request.
--

CREATE TABLE IF NOT EXISTS `CreateEmbeddingResponse_usage` (
  `prompt_tokens` int NOT NULL /*The number of tokens used by the prompt.*/,
  `total_tokens` int NOT NULL /*The total number of tokens used by the request.*/
);  /*The usage information for the request.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CreateFineTuningJobRequest` generated from model 'createFineTuningJobRequest'
--

CREATE TABLE IF NOT EXISTS `CreateFineTuningJobRequest` (
  `model` long NOT NULL,
  `training_file` text NOT NULL /*The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. */,
  `hyperparameters` long,
  `suffix` text /*A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a &#x60;suffix&#x60; of \&quot;custom-model-name\&quot; would produce a model name like &#x60;ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel&#x60;. */,
  `validation_file` text /*The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. */,
  `seed` int UNSIGNED /*The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. */
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CreateFineTuningJobRequestCreateFineTuningJobRequestIntegrationsInner` generated from model 'CreateFineTuningJobRequestCreateFineTuningJobRequestIntegrationsInner'

CREATE TABLE IF NOT EXISTS `CreateFineTuningJobRequestCreateFineTuningJobRequestIntegrationsInner` (
  `createFineTuningJobRequest` long NOT NULL
  `createFineTuningJobRequestIntegrationsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateFineTuningJobRequest_hyperparameters` generated from model 'createFineTuningJobRequestHyperparameters'
-- The hyperparameters used for the fine-tuning job.
--

CREATE TABLE IF NOT EXISTS `CreateFineTuningJobRequest_hyperparameters` (
  `batch_size` long,
  `learning_rate_multiplier` long,
  `n_epochs` long
);  /*The hyperparameters used for the fine-tuning job.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CreateFineTuningJobRequest_integrations_inner` generated from model 'createFineTuningJobRequestIntegrationsInner'
--

CREATE TABLE IF NOT EXISTS `CreateFineTuningJobRequest_integrations_inner` (
  `type` text NOT NULL,
  `wandb` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CreateFineTuningJobRequest_integrations_inner_wandb` generated from model 'createFineTuningJobRequestIntegrationsInnerWandb'
-- The settings for your integration with Weights and Biases. This payload specifies the project that metrics will be sent to. Optionally, you can set an explicit display name for your run, add tags to your run, and set a default entity (team, username, etc) to be associated with your run. 
--

CREATE TABLE IF NOT EXISTS `CreateFineTuningJobRequest_integrations_inner_wandb` (
  `project` text NOT NULL /*The name of the project that the new run will be created under. */,
  `name` text /*A display name to set for the run. If not set, we will use the Job ID as the name. */,
  `entity` text /*The entity to use for the run. This allows you to set the team or username of the WandB user that you would like associated with the run. If not set, the default entity for the registered WandB API key is used. */,
);  /*The settings for your integration with Weights and Biases. This payload specifies the project that metrics will be sent to. Optionally, you can set an explicit display name for your run, add tags to your run, and set a default entity (team, username, etc) to be associated with your run. */

-- --------------------------------------------------------------------------
-- Table structure for table `CreateFineTuningJobRequestIntegrationsInnerWandbTags` generated from model 'CreateFineTuningJobRequestIntegrationsInnerWandbTags'

CREATE TABLE IF NOT EXISTS `CreateFineTuningJobRequestIntegrationsInnerWandbTags` (
  `createFineTuningJobRequestIntegrationsInnerWandb` long NOT NULL
  `tags` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateImageRequest` generated from model 'createImageRequest'
--

CREATE TABLE IF NOT EXISTS `CreateImageRequest` (
  `prompt` text NOT NULL /*A text description of the desired image(s). The maximum length is 1000 characters for &#x60;dall-e-2&#x60; and 4000 characters for &#x60;dall-e-3&#x60;.*/,
  `model` long,
  `n` int UNSIGNED /*The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported.*/,
  `quality` text /*The quality of the image that will be generated. &#x60;hd&#x60; creates images with finer details and greater consistency across the image. This param is only supported for &#x60;dall-e-3&#x60;.*/,
  `response_format` text /*The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.*/,
  `size` text /*The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60; for &#x60;dall-e-2&#x60;. Must be one of &#x60;1024x1024&#x60;, &#x60;1792x1024&#x60;, or &#x60;1024x1792&#x60; for &#x60;dall-e-3&#x60; models.*/,
  `style` text /*The style of the generated images. Must be one of &#x60;vivid&#x60; or &#x60;natural&#x60;. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for &#x60;dall-e-3&#x60;.*/,
  `user` text /*A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). */
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CreateMessageRequest` generated from model 'createMessageRequest'
--

CREATE TABLE IF NOT EXISTS `CreateMessageRequest` (
  `role` text NOT NULL /*The role of the entity that is creating the message. Allowed values include: - &#x60;user&#x60;: Indicates the message is sent by an actual user and should be used in most cases to represent user-generated messages. - &#x60;assistant&#x60;: Indicates the message is generated by the assistant. Use this value to insert messages from the assistant into the conversation. */,
  `content` text NOT NULL /*The content of the message.*/,
  `metadata` blob /*Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. */
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CreateMessageRequestFileIds` generated from model 'CreateMessageRequestFileIds'

CREATE TABLE IF NOT EXISTS `CreateMessageRequestFileIds` (
  `createMessageRequest` long NOT NULL
  `fileIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateModerationRequest` generated from model 'createModerationRequest'
--

CREATE TABLE IF NOT EXISTS `CreateModerationRequest` (
  `input` long NOT NULL,
  `model` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CreateModerationResponse` generated from model 'createModerationResponse'
-- Represents if a given text input is potentially harmful.
--

CREATE TABLE IF NOT EXISTS `CreateModerationResponse` (
  `id` text NOT NULL PRIMARY KEY /*The unique identifier for the moderation request.*/,
  `model` text NOT NULL /*The model used to generate the moderation results.*/,
);  /*Represents if a given text input is potentially harmful.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CreateModerationResponseCreateModerationResponseResultsInner` generated from model 'CreateModerationResponseCreateModerationResponseResultsInner'

CREATE TABLE IF NOT EXISTS `CreateModerationResponseCreateModerationResponseResultsInner` (
  `createModerationResponse` long NOT NULL
  `createModerationResponseResultsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateModerationResponse_results_inner` generated from model 'createModerationResponseResultsInner'
--

CREATE TABLE IF NOT EXISTS `CreateModerationResponse_results_inner` (
  `flagged` boolean NOT NULL /*Whether any of the below categories are flagged.*/,
  `categories` long NOT NULL,
  `category_scores` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CreateModerationResponse_results_inner_categories` generated from model 'createModerationResponseResultsInnerCategories'
-- A list of the categories, and whether they are flagged or not.
--

CREATE TABLE IF NOT EXISTS `CreateModerationResponse_results_inner_categories` (
  `hate` boolean NOT NULL /*Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.*/,
  `hatethreatening` boolean NOT NULL /*Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.*/,
  `harassment` boolean NOT NULL /*Content that expresses, incites, or promotes harassing language towards any target.*/,
  `harassmentthreatening` boolean NOT NULL /*Harassment content that also includes violence or serious harm towards any target.*/,
  `selfharm` boolean NOT NULL /*Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.*/,
  `selfharmintent` boolean NOT NULL /*Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.*/,
  `selfharminstructions` boolean NOT NULL /*Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.*/,
  `sexual` boolean NOT NULL /*Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).*/,
  `sexualminors` boolean NOT NULL /*Sexual content that includes an individual who is under 18 years old.*/,
  `violence` boolean NOT NULL /*Content that depicts death, violence, or physical injury.*/,
  `violencegraphic` boolean NOT NULL /*Content that depicts death, violence, or physical injury in graphic detail.*/
);  /*A list of the categories, and whether they are flagged or not.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CreateModerationResponse_results_inner_category_scores` generated from model 'createModerationResponseResultsInnerCategoryScores'
-- A list of the categories along with their scores as predicted by model.
--

CREATE TABLE IF NOT EXISTS `CreateModerationResponse_results_inner_category_scores` (
  `hate` decimal NOT NULL /*The score for the category &#39;hate&#39;.*/,
  `hatethreatening` decimal NOT NULL /*The score for the category &#39;hate/threatening&#39;.*/,
  `harassment` decimal NOT NULL /*The score for the category &#39;harassment&#39;.*/,
  `harassmentthreatening` decimal NOT NULL /*The score for the category &#39;harassment/threatening&#39;.*/,
  `selfharm` decimal NOT NULL /*The score for the category &#39;self-harm&#39;.*/,
  `selfharmintent` decimal NOT NULL /*The score for the category &#39;self-harm/intent&#39;.*/,
  `selfharminstructions` decimal NOT NULL /*The score for the category &#39;self-harm/instructions&#39;.*/,
  `sexual` decimal NOT NULL /*The score for the category &#39;sexual&#39;.*/,
  `sexualminors` decimal NOT NULL /*The score for the category &#39;sexual/minors&#39;.*/,
  `violence` decimal NOT NULL /*The score for the category &#39;violence&#39;.*/,
  `violencegraphic` decimal NOT NULL /*The score for the category &#39;violence/graphic&#39;.*/
);  /*A list of the categories along with their scores as predicted by model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CreateRunRequest` generated from model 'createRunRequest'
--

CREATE TABLE IF NOT EXISTS `CreateRunRequest` (
  `assistant_id` text NOT NULL /*The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.*/,
  `model` long,
  `instructions` text /*Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.*/,
  `additional_instructions` text /*Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.*/,
  `metadata` blob /*Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. */,
  `temperature` decimal /*What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. */,
  `stream` boolean /*If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message. */,
  `max_prompt_tokens` int UNSIGNED /*The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status &#x60;complete&#x60;. See &#x60;incomplete_details&#x60; for more info. */,
  `max_completion_tokens` int UNSIGNED /*The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status &#x60;complete&#x60;. See &#x60;incomplete_details&#x60; for more info. */,
  `truncation_strategy` long,
  `tool_choice` long,
  `response_format` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CreateRunRequestCreateMessageRequest` generated from model 'CreateRunRequestCreateMessageRequest'

CREATE TABLE IF NOT EXISTS `CreateRunRequestCreateMessageRequest` (
  `createRunRequest` long NOT NULL
  `createMessageRequest` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CreateRunRequestAssistantObjectToolsInner` generated from model 'CreateRunRequestAssistantObjectToolsInner'

CREATE TABLE IF NOT EXISTS `CreateRunRequestAssistantObjectToolsInner` (
  `createRunRequest` long NOT NULL
  `assistantObjectToolsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateSpeechRequest` generated from model 'createSpeechRequest'
--

CREATE TABLE IF NOT EXISTS `CreateSpeechRequest` (
  `model` long NOT NULL,
  `input` text NOT NULL /*The text to generate audio for. The maximum length is 4096 characters.*/,
  `voice` text NOT NULL /*The voice to use when generating the audio. Supported voices are &#x60;alloy&#x60;, &#x60;echo&#x60;, &#x60;fable&#x60;, &#x60;onyx&#x60;, &#x60;nova&#x60;, and &#x60;shimmer&#x60;. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).*/,
  `response_format` text /*The format to audio in. Supported formats are &#x60;mp3&#x60;, &#x60;opus&#x60;, &#x60;aac&#x60;, &#x60;flac&#x60;, &#x60;wav&#x60;, and &#x60;pcm&#x60;.*/,
  `speed` decimal /*The speed of the generated audio. Select a value from &#x60;0.25&#x60; to &#x60;4.0&#x60;. &#x60;1.0&#x60; is the default.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CreateThreadAndRunRequest` generated from model 'createThreadAndRunRequest'
--

CREATE TABLE IF NOT EXISTS `CreateThreadAndRunRequest` (
  `assistant_id` text NOT NULL /*The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.*/,
  `thread` long,
  `model` long,
  `instructions` text /*Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.*/,
  `metadata` blob /*Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. */,
  `temperature` decimal /*What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. */,
  `stream` boolean /*If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message. */,
  `max_prompt_tokens` int UNSIGNED /*The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status &#x60;complete&#x60;. See &#x60;incomplete_details&#x60; for more info. */,
  `max_completion_tokens` int UNSIGNED /*The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info. */,
  `truncation_strategy` long,
  `tool_choice` long,
  `response_format` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CreateThreadAndRunRequestCreateThreadAndRunRequestToolsInner` generated from model 'CreateThreadAndRunRequestCreateThreadAndRunRequestToolsInner'

CREATE TABLE IF NOT EXISTS `CreateThreadAndRunRequestCreateThreadAndRunRequestToolsInner` (
  `createThreadAndRunRequest` long NOT NULL
  `createThreadAndRunRequestToolsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateThreadAndRunRequest_tools_inner` generated from model 'createThreadAndRunRequestToolsInner'
--

CREATE TABLE IF NOT EXISTS `CreateThreadAndRunRequest_tools_inner` (
  `type` text NOT NULL /*The type of tool being defined: &#x60;code_interpreter&#x60;*/,
  `function` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CreateThreadRequest` generated from model 'createThreadRequest'
--

CREATE TABLE IF NOT EXISTS `CreateThreadRequest` (
  `metadata` blob /*Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. */
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CreateThreadRequestCreateMessageRequest` generated from model 'CreateThreadRequestCreateMessageRequest'

CREATE TABLE IF NOT EXISTS `CreateThreadRequestCreateMessageRequest` (
  `createThreadRequest` long NOT NULL
  `createMessageRequest` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `createTranscription_200_response` generated from model 'createTranscription200Response'
--

CREATE TABLE IF NOT EXISTS `createTranscription_200_response` (
  `text` text NOT NULL /*The transcribed text.*/,
  `language` text NOT NULL /*The language of the input audio.*/,
  `duration` text NOT NULL /*The duration of the input audio.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CreateTranscription200ResponseTranscriptionWord` generated from model 'CreateTranscription200ResponseTranscriptionWord'

CREATE TABLE IF NOT EXISTS `CreateTranscription200ResponseTranscriptionWord` (
  `createTranscription200Response` long NOT NULL
  `transcriptionWord` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CreateTranscription200ResponseTranscriptionSegment` generated from model 'CreateTranscription200ResponseTranscriptionSegment'

CREATE TABLE IF NOT EXISTS `CreateTranscription200ResponseTranscriptionSegment` (
  `createTranscription200Response` long NOT NULL
  `transcriptionSegment` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateTranscriptionResponseJson` generated from model 'createTranscriptionResponseJson'
-- Represents a transcription response returned by model, based on the provided input.
--

CREATE TABLE IF NOT EXISTS `CreateTranscriptionResponseJson` (
  `text` text NOT NULL /*The transcribed text.*/
);  /*Represents a transcription response returned by model, based on the provided input.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CreateTranscriptionResponseVerboseJson` generated from model 'createTranscriptionResponseVerboseJson'
-- Represents a verbose json transcription response returned by model, based on the provided input.
--

CREATE TABLE IF NOT EXISTS `CreateTranscriptionResponseVerboseJson` (
  `language` text NOT NULL /*The language of the input audio.*/,
  `duration` text NOT NULL /*The duration of the input audio.*/,
  `text` text NOT NULL /*The transcribed text.*/,
);  /*Represents a verbose json transcription response returned by model, based on the provided input.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CreateTranscriptionResponseVerboseJsonTranscriptionWord` generated from model 'CreateTranscriptionResponseVerboseJsonTranscriptionWord'

CREATE TABLE IF NOT EXISTS `CreateTranscriptionResponseVerboseJsonTranscriptionWord` (
  `createTranscriptionResponseVerboseJson` long NOT NULL
  `transcriptionWord` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CreateTranscriptionResponseVerboseJsonTranscriptionSegment` generated from model 'CreateTranscriptionResponseVerboseJsonTranscriptionSegment'

CREATE TABLE IF NOT EXISTS `CreateTranscriptionResponseVerboseJsonTranscriptionSegment` (
  `createTranscriptionResponseVerboseJson` long NOT NULL
  `transcriptionSegment` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `createTranslation_200_response` generated from model 'createTranslation200Response'
--

CREATE TABLE IF NOT EXISTS `createTranslation_200_response` (
  `text` text NOT NULL /*The translated text.*/,
  `language` text NOT NULL /*The language of the output translation (always &#x60;english&#x60;).*/,
  `duration` text NOT NULL /*The duration of the input audio.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CreateTranslation200ResponseTranscriptionSegment` generated from model 'CreateTranslation200ResponseTranscriptionSegment'

CREATE TABLE IF NOT EXISTS `CreateTranslation200ResponseTranscriptionSegment` (
  `createTranslation200Response` long NOT NULL
  `transcriptionSegment` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateTranslationResponseJson` generated from model 'createTranslationResponseJson'
--

CREATE TABLE IF NOT EXISTS `CreateTranslationResponseJson` (
  `text` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CreateTranslationResponseVerboseJson` generated from model 'createTranslationResponseVerboseJson'
--

CREATE TABLE IF NOT EXISTS `CreateTranslationResponseVerboseJson` (
  `language` text NOT NULL /*The language of the output translation (always &#x60;english&#x60;).*/,
  `duration` text NOT NULL /*The duration of the input audio.*/,
  `text` text NOT NULL /*The translated text.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CreateTranslationResponseVerboseJsonTranscriptionSegment` generated from model 'CreateTranslationResponseVerboseJsonTranscriptionSegment'

CREATE TABLE IF NOT EXISTS `CreateTranslationResponseVerboseJsonTranscriptionSegment` (
  `createTranslationResponseVerboseJson` long NOT NULL
  `transcriptionSegment` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteAssistantFileResponse` generated from model 'deleteAssistantFileResponse'
-- Deletes the association between the assistant and the file, but does not delete the [File](/docs/api-reference/files) object itself.
--

CREATE TABLE IF NOT EXISTS `DeleteAssistantFileResponse` (
  `id` text NOT NULL PRIMARY KEY,
  `deleted` boolean NOT NULL,
  `object` text NOT NULL
);  /*Deletes the association between the assistant and the file, but does not delete the [File](/docs/api-reference/files) object itself.*/


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteAssistantResponse` generated from model 'deleteAssistantResponse'
--

CREATE TABLE IF NOT EXISTS `DeleteAssistantResponse` (
  `id` text NOT NULL PRIMARY KEY,
  `deleted` boolean NOT NULL,
  `object` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteFileResponse` generated from model 'deleteFileResponse'
--

CREATE TABLE IF NOT EXISTS `DeleteFileResponse` (
  `id` text NOT NULL PRIMARY KEY,
  `object` text NOT NULL,
  `deleted` boolean NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteMessageResponse` generated from model 'deleteMessageResponse'
--

CREATE TABLE IF NOT EXISTS `DeleteMessageResponse` (
  `id` text NOT NULL PRIMARY KEY,
  `deleted` boolean NOT NULL,
  `object` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteModelResponse` generated from model 'deleteModelResponse'
--

CREATE TABLE IF NOT EXISTS `DeleteModelResponse` (
  `id` text NOT NULL PRIMARY KEY,
  `deleted` boolean NOT NULL,
  `object` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteThreadResponse` generated from model 'deleteThreadResponse'
--

CREATE TABLE IF NOT EXISTS `DeleteThreadResponse` (
  `id` text NOT NULL PRIMARY KEY,
  `deleted` boolean NOT NULL,
  `object` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `DoneEvent` generated from model 'doneEvent'
-- Occurs when a stream ends.
--

CREATE TABLE IF NOT EXISTS `DoneEvent` (
  `event` text NOT NULL,
  `data` text NOT NULL
);  /*Occurs when a stream ends.*/


-- --------------------------------------------------------------------------
-- Table structure for table `Embedding` generated from model 'embedding'
-- Represents an embedding vector returned by embedding endpoint. 
--

CREATE TABLE IF NOT EXISTS `Embedding` (
  `index` int NOT NULL /*The index of the embedding in the list of embeddings.*/,
  `object` text NOT NULL /*The object type, which is always \&quot;embedding\&quot;.*/
);  /*Represents an embedding vector returned by embedding endpoint. */

-- --------------------------------------------------------------------------
-- Table structure for table `EmbeddingEmbedding` generated from model 'EmbeddingEmbedding'

CREATE TABLE IF NOT EXISTS `EmbeddingEmbedding` (
  `embedding` long NOT NULL
  `embedding` decimal NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `Error` generated from model 'error'
--

CREATE TABLE IF NOT EXISTS `Error` (
  `code` text NOT NULL,
  `message` text NOT NULL,
  `param` text NOT NULL,
  `type` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ErrorEvent` generated from model 'errorEvent'
-- Occurs when an [error](/docs/guides/error-codes/api-errors) occurs. This can happen due to an internal server error or a timeout.
--

CREATE TABLE IF NOT EXISTS `ErrorEvent` (
  `event` text NOT NULL,
  `data` long NOT NULL
);  /*Occurs when an [error](/docs/guides/error-codes/api-errors) occurs. This can happen due to an internal server error or a timeout.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ErrorResponse` generated from model 'errorResponse'
--

CREATE TABLE IF NOT EXISTS `ErrorResponse` (
  `error` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `FineTuningIntegration` generated from model 'fineTuningIntegration'
--

CREATE TABLE IF NOT EXISTS `FineTuningIntegration` (
  `type` text NOT NULL /*The type of the integration being enabled for the fine-tuning job*/,
  `wandb` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `FineTuningJob` generated from model 'fineTuningJob'
-- The &#x60;fine_tuning.job&#x60; object represents a fine-tuning job that has been created through the API. 
--

CREATE TABLE IF NOT EXISTS `FineTuningJob` (
  `id` text NOT NULL PRIMARY KEY /*The object identifier, which can be referenced in the API endpoints.*/,
  `created_at` int NOT NULL /*The Unix timestamp (in seconds) for when the fine-tuning job was created.*/,
  `error` long NOT NULL,
  `fine_tuned_model` text NOT NULL /*The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.*/,
  `finished_at` int NOT NULL /*The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.*/,
  `hyperparameters` long NOT NULL,
  `model` text NOT NULL /*The base model that is being fine-tuned.*/,
  `object` text NOT NULL /*The object type, which is always \&quot;fine_tuning.job\&quot;.*/,
  `organization_id` text NOT NULL /*The organization that owns the fine-tuning job.*/,
  `status` text NOT NULL /*The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;.*/,
  `trained_tokens` int NOT NULL /*The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.*/,
  `training_file` text NOT NULL /*The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).*/,
  `validation_file` text NOT NULL /*The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).*/,
  `seed` int NOT NULL /*The seed used for the fine-tuning job.*/,
);  /*The &#x60;fine_tuning.job&#x60; object represents a fine-tuning job that has been created through the API. */

-- --------------------------------------------------------------------------
-- Table structure for table `FineTuningJobResultFiles` generated from model 'FineTuningJobResultFiles'

CREATE TABLE IF NOT EXISTS `FineTuningJobResultFiles` (
  `fineTuningJob` long NOT NULL
  `resultFiles` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `FineTuningJobFineTuningJobIntegrationsInner` generated from model 'FineTuningJobFineTuningJobIntegrationsInner'

CREATE TABLE IF NOT EXISTS `FineTuningJobFineTuningJobIntegrationsInner` (
  `fineTuningJob` long NOT NULL
  `fineTuningJobIntegrationsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `FineTuningJobCheckpoint` generated from model 'fineTuningJobCheckpoint'
-- The &#x60;fine_tuning.job.checkpoint&#x60; object represents a model checkpoint for a fine-tuning job that is ready to use. 
--

CREATE TABLE IF NOT EXISTS `FineTuningJobCheckpoint` (
  `id` text NOT NULL PRIMARY KEY /*The checkpoint identifier, which can be referenced in the API endpoints.*/,
  `created_at` int NOT NULL /*The Unix timestamp (in seconds) for when the checkpoint was created.*/,
  `fine_tuned_model_checkpoint` text NOT NULL /*The name of the fine-tuned checkpoint model that is created.*/,
  `step_number` int NOT NULL /*The step number that the checkpoint was created at.*/,
  `metrics` long NOT NULL,
  `fine_tuning_job_id` text NOT NULL /*The name of the fine-tuning job that this checkpoint was created from.*/,
  `object` text NOT NULL /*The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;.*/
);  /*The &#x60;fine_tuning.job.checkpoint&#x60; object represents a model checkpoint for a fine-tuning job that is ready to use. */


-- --------------------------------------------------------------------------
-- Table structure for table `FineTuningJobCheckpoint_metrics` generated from model 'fineTuningJobCheckpointMetrics'
-- Metrics at the step number during the fine-tuning job.
--

CREATE TABLE IF NOT EXISTS `FineTuningJobCheckpoint_metrics` (
  `step` decimal,
  `train_loss` decimal,
  `train_mean_token_accuracy` decimal,
  `valid_loss` decimal,
  `valid_mean_token_accuracy` decimal,
  `full_valid_loss` decimal,
  `full_valid_mean_token_accuracy` decimal
);  /*Metrics at the step number during the fine-tuning job.*/


-- --------------------------------------------------------------------------
-- Table structure for table `FineTuningJob_error` generated from model 'fineTuningJobError'
-- For fine-tuning jobs that have &#x60;failed&#x60;, this will contain more information on the cause of the failure.
--

CREATE TABLE IF NOT EXISTS `FineTuningJob_error` (
  `code` text NOT NULL /*A machine-readable error code.*/,
  `message` text NOT NULL /*A human-readable error message.*/,
  `param` text NOT NULL /*The parameter that was invalid, usually &#x60;training_file&#x60; or &#x60;validation_file&#x60;. This field will be null if the failure was not parameter-specific.*/
);  /*For fine-tuning jobs that have &#x60;failed&#x60;, this will contain more information on the cause of the failure.*/


-- --------------------------------------------------------------------------
-- Table structure for table `FineTuningJobEvent` generated from model 'fineTuningJobEvent'
-- Fine-tuning job event object
--

CREATE TABLE IF NOT EXISTS `FineTuningJobEvent` (
  `id` text NOT NULL PRIMARY KEY,
  `created_at` int NOT NULL,
  `level` text NOT NULL,
  `message` text NOT NULL,
  `object` text NOT NULL
);  /*Fine-tuning job event object*/


-- --------------------------------------------------------------------------
-- Table structure for table `FineTuningJob_hyperparameters` generated from model 'fineTuningJobHyperparameters'
-- The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
--

CREATE TABLE IF NOT EXISTS `FineTuningJob_hyperparameters` (
  `n_epochs` long NOT NULL
);  /*The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.*/


-- --------------------------------------------------------------------------
-- Table structure for table `FineTuningJob_integrations_inner` generated from model 'fineTuningJobIntegrationsInner'
--

CREATE TABLE IF NOT EXISTS `FineTuningJob_integrations_inner` (
  `type` text NOT NULL /*The type of the integration being enabled for the fine-tuning job*/,
  `wandb` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `FunctionObject` generated from model 'functionObject'
--

CREATE TABLE IF NOT EXISTS `FunctionObject` (
  `name` text NOT NULL /*The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.*/,
  `description` text /*A description of what the function does, used by the model to choose when and how to call the function.*/,
  `parameters` blob /*The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/text-generation/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting &#x60;parameters&#x60; defines a function with an empty parameter list.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Image` generated from model 'image'
-- Represents the url or the content of an image generated by the OpenAI API.
--

CREATE TABLE IF NOT EXISTS `Image` (
  `b64_json` text /*The base64-encoded JSON of the generated image, if &#x60;response_format&#x60; is &#x60;b64_json&#x60;.*/,
  `url` text /*The URL of the generated image, if &#x60;response_format&#x60; is &#x60;url&#x60; (default).*/,
  `revised_prompt` text /*The prompt that was used to generate the image, if there was any revision to the prompt.*/
);  /*Represents the url or the content of an image generated by the OpenAI API.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ImagesResponse` generated from model 'imagesResponse'
--

CREATE TABLE IF NOT EXISTS `ImagesResponse` (
  `created` int NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ImagesResponseImage` generated from model 'ImagesResponseImage'

CREATE TABLE IF NOT EXISTS `ImagesResponseImage` (
  `imagesResponse` long NOT NULL
  `image` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ListAssistantFilesResponse` generated from model 'listAssistantFilesResponse'
--

CREATE TABLE IF NOT EXISTS `ListAssistantFilesResponse` (
  `object` text NOT NULL,
  `first_id` text NOT NULL,
  `last_id` text NOT NULL,
  `has_more` boolean NOT NULL
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ListAssistantFilesResponseAssistantFileObject` generated from model 'ListAssistantFilesResponseAssistantFileObject'

CREATE TABLE IF NOT EXISTS `ListAssistantFilesResponseAssistantFileObject` (
  `listAssistantFilesResponse` long NOT NULL
  `assistantFileObject` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ListAssistantsResponse` generated from model 'listAssistantsResponse'
--

CREATE TABLE IF NOT EXISTS `ListAssistantsResponse` (
  `object` text NOT NULL,
  `first_id` text NOT NULL,
  `last_id` text NOT NULL,
  `has_more` boolean NOT NULL
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ListAssistantsResponseAssistantObject` generated from model 'ListAssistantsResponseAssistantObject'

CREATE TABLE IF NOT EXISTS `ListAssistantsResponseAssistantObject` (
  `listAssistantsResponse` long NOT NULL
  `assistantObject` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ListFilesResponse` generated from model 'listFilesResponse'
--

CREATE TABLE IF NOT EXISTS `ListFilesResponse` (
  `object` text NOT NULL
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ListFilesResponseOpenAIFile` generated from model 'ListFilesResponseOpenAIFile'

CREATE TABLE IF NOT EXISTS `ListFilesResponseOpenAIFile` (
  `listFilesResponse` long NOT NULL
  `openAIFile` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ListFineTuningJobCheckpointsResponse` generated from model 'listFineTuningJobCheckpointsResponse'
--

CREATE TABLE IF NOT EXISTS `ListFineTuningJobCheckpointsResponse` (
  `object` text NOT NULL,
  `has_more` boolean NOT NULL,
  `first_id` text,
  `last_id` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ListFineTuningJobCheckpointsResponseFineTuningJobCheckpoint` generated from model 'ListFineTuningJobCheckpointsResponseFineTuningJobCheckpoint'

CREATE TABLE IF NOT EXISTS `ListFineTuningJobCheckpointsResponseFineTuningJobCheckpoint` (
  `listFineTuningJobCheckpointsResponse` long NOT NULL
  `fineTuningJobCheckpoint` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ListFineTuningJobEventsResponse` generated from model 'listFineTuningJobEventsResponse'
--

CREATE TABLE IF NOT EXISTS `ListFineTuningJobEventsResponse` (
  `object` text NOT NULL
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ListFineTuningJobEventsResponseFineTuningJobEvent` generated from model 'ListFineTuningJobEventsResponseFineTuningJobEvent'

CREATE TABLE IF NOT EXISTS `ListFineTuningJobEventsResponseFineTuningJobEvent` (
  `listFineTuningJobEventsResponse` long NOT NULL
  `fineTuningJobEvent` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ListMessageFilesResponse` generated from model 'listMessageFilesResponse'
--

CREATE TABLE IF NOT EXISTS `ListMessageFilesResponse` (
  `object` text NOT NULL,
  `first_id` text NOT NULL,
  `last_id` text NOT NULL,
  `has_more` boolean NOT NULL
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ListMessageFilesResponseMessageFileObject` generated from model 'ListMessageFilesResponseMessageFileObject'

CREATE TABLE IF NOT EXISTS `ListMessageFilesResponseMessageFileObject` (
  `listMessageFilesResponse` long NOT NULL
  `messageFileObject` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ListMessagesResponse` generated from model 'listMessagesResponse'
--

CREATE TABLE IF NOT EXISTS `ListMessagesResponse` (
  `object` text NOT NULL,
  `first_id` text NOT NULL,
  `last_id` text NOT NULL,
  `has_more` boolean NOT NULL
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ListMessagesResponseMessageObject` generated from model 'ListMessagesResponseMessageObject'

CREATE TABLE IF NOT EXISTS `ListMessagesResponseMessageObject` (
  `listMessagesResponse` long NOT NULL
  `messageObject` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ListModelsResponse` generated from model 'listModelsResponse'
--

CREATE TABLE IF NOT EXISTS `ListModelsResponse` (
  `object` text NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ListModelsResponseModel` generated from model 'ListModelsResponseModel'

CREATE TABLE IF NOT EXISTS `ListModelsResponseModel` (
  `listModelsResponse` long NOT NULL
  `model` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ListPaginatedFineTuningJobsResponse` generated from model 'listPaginatedFineTuningJobsResponse'
--

CREATE TABLE IF NOT EXISTS `ListPaginatedFineTuningJobsResponse` (
  `has_more` boolean NOT NULL,
  `object` text NOT NULL
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ListPaginatedFineTuningJobsResponseFineTuningJob` generated from model 'ListPaginatedFineTuningJobsResponseFineTuningJob'

CREATE TABLE IF NOT EXISTS `ListPaginatedFineTuningJobsResponseFineTuningJob` (
  `listPaginatedFineTuningJobsResponse` long NOT NULL
  `fineTuningJob` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ListRunStepsResponse` generated from model 'listRunStepsResponse'
--

CREATE TABLE IF NOT EXISTS `ListRunStepsResponse` (
  `object` text NOT NULL,
  `first_id` text NOT NULL,
  `last_id` text NOT NULL,
  `has_more` boolean NOT NULL
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ListRunStepsResponseRunStepObject` generated from model 'ListRunStepsResponseRunStepObject'

CREATE TABLE IF NOT EXISTS `ListRunStepsResponseRunStepObject` (
  `listRunStepsResponse` long NOT NULL
  `runStepObject` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ListRunsResponse` generated from model 'listRunsResponse'
--

CREATE TABLE IF NOT EXISTS `ListRunsResponse` (
  `object` text NOT NULL,
  `first_id` text NOT NULL,
  `last_id` text NOT NULL,
  `has_more` boolean NOT NULL
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ListRunsResponseRunObject` generated from model 'ListRunsResponseRunObject'

CREATE TABLE IF NOT EXISTS `ListRunsResponseRunObject` (
  `listRunsResponse` long NOT NULL
  `runObject` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ListThreadsResponse` generated from model 'listThreadsResponse'
--

CREATE TABLE IF NOT EXISTS `ListThreadsResponse` (
  `object` text NOT NULL,
  `first_id` text NOT NULL,
  `last_id` text NOT NULL,
  `has_more` boolean NOT NULL
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ListThreadsResponseThreadObject` generated from model 'ListThreadsResponseThreadObject'

CREATE TABLE IF NOT EXISTS `ListThreadsResponseThreadObject` (
  `listThreadsResponse` long NOT NULL
  `threadObject` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MessageContentImageFileObject` generated from model 'messageContentImageFileObject'
-- References an image [File](/docs/api-reference/files) in the content of a message.
--

CREATE TABLE IF NOT EXISTS `MessageContentImageFileObject` (
  `type` text NOT NULL /*Always &#x60;image_file&#x60;.*/,
  `image_file` long NOT NULL
);  /*References an image [File](/docs/api-reference/files) in the content of a message.*/


-- --------------------------------------------------------------------------
-- Table structure for table `MessageContentImageFileObject_image_file` generated from model 'messageContentImageFileObjectImageFile'
--

CREATE TABLE IF NOT EXISTS `MessageContentImageFileObject_image_file` (
  `file_id` text NOT NULL /*The [File](/docs/api-reference/files) ID of the image in the message content.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MessageContentTextAnnotationsFileCitationObject` generated from model 'messageContentTextAnnotationsFileCitationObject'
-- A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;retrieval\&quot; tool to search files.
--

CREATE TABLE IF NOT EXISTS `MessageContentTextAnnotationsFileCitationObject` (
  `type` text NOT NULL /*Always &#x60;file_citation&#x60;.*/,
  `text` text NOT NULL /*The text in the message content that needs to be replaced.*/,
  `file_citation` long NOT NULL,
  `start_index` int UNSIGNED NOT NULL,
  `end_index` int UNSIGNED NOT NULL
);  /*A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;retrieval\&quot; tool to search files.*/


-- --------------------------------------------------------------------------
-- Table structure for table `MessageContentTextAnnotationsFileCitationObject_file_citation` generated from model 'messageContentTextAnnotationsFileCitationObjectFileCitation'
--

CREATE TABLE IF NOT EXISTS `MessageContentTextAnnotationsFileCitationObject_file_citation` (
  `file_id` text NOT NULL /*The ID of the specific File the citation is from.*/,
  `quote` text NOT NULL /*The specific quote in the file.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MessageContentTextAnnotationsFilePathObject` generated from model 'messageContentTextAnnotationsFilePathObject'
-- A URL for the file that&#39;s generated when the assistant used the &#x60;code_interpreter&#x60; tool to generate a file.
--

CREATE TABLE IF NOT EXISTS `MessageContentTextAnnotationsFilePathObject` (
  `type` text NOT NULL /*Always &#x60;file_path&#x60;.*/,
  `text` text NOT NULL /*The text in the message content that needs to be replaced.*/,
  `file_path` long NOT NULL,
  `start_index` int UNSIGNED NOT NULL,
  `end_index` int UNSIGNED NOT NULL
);  /*A URL for the file that&#39;s generated when the assistant used the &#x60;code_interpreter&#x60; tool to generate a file.*/


-- --------------------------------------------------------------------------
-- Table structure for table `MessageContentTextAnnotationsFilePathObject_file_path` generated from model 'messageContentTextAnnotationsFilePathObjectFilePath'
--

CREATE TABLE IF NOT EXISTS `MessageContentTextAnnotationsFilePathObject_file_path` (
  `file_id` text NOT NULL /*The ID of the file that was generated.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MessageContentTextObject` generated from model 'messageContentTextObject'
-- The text content that is part of a message.
--

CREATE TABLE IF NOT EXISTS `MessageContentTextObject` (
  `type` text NOT NULL /*Always &#x60;text&#x60;.*/,
  `text` long NOT NULL
);  /*The text content that is part of a message.*/


-- --------------------------------------------------------------------------
-- Table structure for table `MessageContentTextObject_text` generated from model 'messageContentTextObjectText'
--

CREATE TABLE IF NOT EXISTS `MessageContentTextObject_text` (
  `value` text NOT NULL /*The data that makes up the text.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `MessageContentTextObjectTextMessageContentTextObjectTextAnnotationsInner` generated from model 'MessageContentTextObjectTextMessageContentTextObjectTextAnnotationsInner'

CREATE TABLE IF NOT EXISTS `MessageContentTextObjectTextMessageContentTextObjectTextAnnotationsInner` (
  `messageContentTextObjectText` long NOT NULL
  `messageContentTextObjectTextAnnotationsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MessageContentTextObject_text_annotations_inner` generated from model 'messageContentTextObjectTextAnnotationsInner'
--

CREATE TABLE IF NOT EXISTS `MessageContentTextObject_text_annotations_inner` (
  `type` text NOT NULL /*Always &#x60;file_citation&#x60;.*/,
  `text` text NOT NULL /*The text in the message content that needs to be replaced.*/,
  `file_citation` long NOT NULL,
  `start_index` int UNSIGNED NOT NULL,
  `end_index` int UNSIGNED NOT NULL,
  `file_path` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MessageDeltaContentImageFileObject` generated from model 'messageDeltaContentImageFileObject'
-- References an image [File](/docs/api-reference/files) in the content of a message.
--

CREATE TABLE IF NOT EXISTS `MessageDeltaContentImageFileObject` (
  `index` int NOT NULL /*The index of the content part in the message.*/,
  `type` text NOT NULL /*Always &#x60;image_file&#x60;.*/,
  `image_file` long
);  /*References an image [File](/docs/api-reference/files) in the content of a message.*/


-- --------------------------------------------------------------------------
-- Table structure for table `MessageDeltaContentImageFileObject_image_file` generated from model 'messageDeltaContentImageFileObjectImageFile'
--

CREATE TABLE IF NOT EXISTS `MessageDeltaContentImageFileObject_image_file` (
  `file_id` text /*The [File](/docs/api-reference/files) ID of the image in the message content.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MessageDeltaContentTextAnnotationsFileCitationObject` generated from model 'messageDeltaContentTextAnnotationsFileCitationObject'
-- A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;retrieval\&quot; tool to search files.
--

CREATE TABLE IF NOT EXISTS `MessageDeltaContentTextAnnotationsFileCitationObject` (
  `index` int NOT NULL /*The index of the annotation in the text content part.*/,
  `type` text NOT NULL /*Always &#x60;file_citation&#x60;.*/,
  `text` text /*The text in the message content that needs to be replaced.*/,
  `file_citation` long,
  `start_index` int UNSIGNED,
  `end_index` int UNSIGNED
);  /*A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;retrieval\&quot; tool to search files.*/


-- --------------------------------------------------------------------------
-- Table structure for table `MessageDeltaContentTextAnnotationsFileCitationObject_file_citation` generated from model 'messageDeltaContentTextAnnotationsFileCitationObjectFileCitation'
--

CREATE TABLE IF NOT EXISTS `MessageDeltaContentTextAnnotationsFileCitationObject_file_citation` (
  `file_id` text /*The ID of the specific File the citation is from.*/,
  `quote` text /*The specific quote in the file.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MessageDeltaContentTextAnnotationsFilePathObject` generated from model 'messageDeltaContentTextAnnotationsFilePathObject'
-- A URL for the file that&#39;s generated when the assistant used the &#x60;code_interpreter&#x60; tool to generate a file.
--

CREATE TABLE IF NOT EXISTS `MessageDeltaContentTextAnnotationsFilePathObject` (
  `index` int NOT NULL /*The index of the annotation in the text content part.*/,
  `type` text NOT NULL /*Always &#x60;file_path&#x60;.*/,
  `text` text /*The text in the message content that needs to be replaced.*/,
  `file_path` long,
  `start_index` int UNSIGNED,
  `end_index` int UNSIGNED
);  /*A URL for the file that&#39;s generated when the assistant used the &#x60;code_interpreter&#x60; tool to generate a file.*/


-- --------------------------------------------------------------------------
-- Table structure for table `MessageDeltaContentTextAnnotationsFilePathObject_file_path` generated from model 'messageDeltaContentTextAnnotationsFilePathObjectFilePath'
--

CREATE TABLE IF NOT EXISTS `MessageDeltaContentTextAnnotationsFilePathObject_file_path` (
  `file_id` text /*The ID of the file that was generated.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MessageDeltaContentTextObject` generated from model 'messageDeltaContentTextObject'
-- The text content that is part of a message.
--

CREATE TABLE IF NOT EXISTS `MessageDeltaContentTextObject` (
  `index` int NOT NULL /*The index of the content part in the message.*/,
  `type` text NOT NULL /*Always &#x60;text&#x60;.*/,
  `text` long
);  /*The text content that is part of a message.*/


-- --------------------------------------------------------------------------
-- Table structure for table `MessageDeltaContentTextObject_text` generated from model 'messageDeltaContentTextObjectText'
--

CREATE TABLE IF NOT EXISTS `MessageDeltaContentTextObject_text` (
  `value` text /*The data that makes up the text.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `MessageDeltaContentTextObjectTextMessageDeltaContentTextObjectTextAnnotationsInner` generated from model 'MessageDeltaContentTextObjectTextMessageDeltaContentTextObjectTextAnnotationsInner'

CREATE TABLE IF NOT EXISTS `MessageDeltaContentTextObjectTextMessageDeltaContentTextObjectTextAnnotationsInner` (
  `messageDeltaContentTextObjectText` long NOT NULL
  `messageDeltaContentTextObjectTextAnnotationsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MessageDeltaContentTextObject_text_annotations_inner` generated from model 'messageDeltaContentTextObjectTextAnnotationsInner'
--

CREATE TABLE IF NOT EXISTS `MessageDeltaContentTextObject_text_annotations_inner` (
  `index` int NOT NULL /*The index of the annotation in the text content part.*/,
  `type` text NOT NULL /*Always &#x60;file_citation&#x60;.*/,
  `text` text /*The text in the message content that needs to be replaced.*/,
  `file_citation` long,
  `start_index` int UNSIGNED,
  `end_index` int UNSIGNED,
  `file_path` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MessageDeltaObject` generated from model 'messageDeltaObject'
-- Represents a message delta i.e. any changed fields on a message during streaming. 
--

CREATE TABLE IF NOT EXISTS `MessageDeltaObject` (
  `id` text NOT NULL PRIMARY KEY /*The identifier of the message, which can be referenced in API endpoints.*/,
  `object` text NOT NULL /*The object type, which is always &#x60;thread.message.delta&#x60;.*/,
  `delta` long NOT NULL
);  /*Represents a message delta i.e. any changed fields on a message during streaming. */


-- --------------------------------------------------------------------------
-- Table structure for table `MessageDeltaObject_delta` generated from model 'messageDeltaObjectDelta'
-- The delta containing the fields that have changed on the Message.
--

CREATE TABLE IF NOT EXISTS `MessageDeltaObject_delta` (
  `role` text /*The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.*/,
);  /*The delta containing the fields that have changed on the Message.*/

-- --------------------------------------------------------------------------
-- Table structure for table `MessageDeltaObjectDeltaMessageDeltaObjectDeltaContentInner` generated from model 'MessageDeltaObjectDeltaMessageDeltaObjectDeltaContentInner'

CREATE TABLE IF NOT EXISTS `MessageDeltaObjectDeltaMessageDeltaObjectDeltaContentInner` (
  `messageDeltaObjectDelta` long NOT NULL
  `messageDeltaObjectDeltaContentInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MessageDeltaObjectDeltaFileIds` generated from model 'MessageDeltaObjectDeltaFileIds'

CREATE TABLE IF NOT EXISTS `MessageDeltaObjectDeltaFileIds` (
  `messageDeltaObjectDelta` long NOT NULL
  `fileIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MessageDeltaObject_delta_content_inner` generated from model 'messageDeltaObjectDeltaContentInner'
--

CREATE TABLE IF NOT EXISTS `MessageDeltaObject_delta_content_inner` (
  `index` int NOT NULL /*The index of the content part in the message.*/,
  `type` text NOT NULL /*Always &#x60;image_file&#x60;.*/,
  `image_file` long,
  `text` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MessageFileObject` generated from model 'messageFileObject'
-- A list of files attached to a &#x60;message&#x60;.
--

CREATE TABLE IF NOT EXISTS `MessageFileObject` (
  `id` text NOT NULL PRIMARY KEY /*The identifier, which can be referenced in API endpoints.*/,
  `object` text NOT NULL /*The object type, which is always &#x60;thread.message.file&#x60;.*/,
  `created_at` int NOT NULL /*The Unix timestamp (in seconds) for when the message file was created.*/,
  `message_id` text NOT NULL /*The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.*/
);  /*A list of files attached to a &#x60;message&#x60;.*/


-- --------------------------------------------------------------------------
-- Table structure for table `MessageObject` generated from model 'messageObject'
-- Represents a message within a [thread](/docs/api-reference/threads).
--

CREATE TABLE IF NOT EXISTS `MessageObject` (
  `id` text NOT NULL PRIMARY KEY /*The identifier, which can be referenced in API endpoints.*/,
  `object` text NOT NULL /*The object type, which is always &#x60;thread.message&#x60;.*/,
  `created_at` int NOT NULL /*The Unix timestamp (in seconds) for when the message was created.*/,
  `thread_id` text NOT NULL /*The [thread](/docs/api-reference/threads) ID that this message belongs to.*/,
  `status` text NOT NULL /*The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;.*/,
  `incomplete_details` long NOT NULL,
  `completed_at` int NOT NULL /*The Unix timestamp (in seconds) for when the message was completed.*/,
  `incomplete_at` int NOT NULL /*The Unix timestamp (in seconds) for when the message was marked as incomplete.*/,
  `role` text NOT NULL /*The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.*/,
  `assistant_id` text NOT NULL /*If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.*/,
  `run_id` text NOT NULL /*The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints.*/,
  `metadata` blob NOT NULL /*Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. */
);  /*Represents a message within a [thread](/docs/api-reference/threads).*/

-- --------------------------------------------------------------------------
-- Table structure for table `MessageObjectMessageObjectContentInner` generated from model 'MessageObjectMessageObjectContentInner'

CREATE TABLE IF NOT EXISTS `MessageObjectMessageObjectContentInner` (
  `messageObject` long NOT NULL
  `messageObjectContentInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MessageObjectFileIds` generated from model 'MessageObjectFileIds'

CREATE TABLE IF NOT EXISTS `MessageObjectFileIds` (
  `messageObject` long NOT NULL
  `fileIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MessageObject_content_inner` generated from model 'messageObjectContentInner'
--

CREATE TABLE IF NOT EXISTS `MessageObject_content_inner` (
  `type` text NOT NULL /*Always &#x60;image_file&#x60;.*/,
  `image_file` long NOT NULL,
  `text` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MessageObject_incomplete_details` generated from model 'messageObjectIncompleteDetails'
-- On an incomplete message, details about why the message is incomplete.
--

CREATE TABLE IF NOT EXISTS `MessageObject_incomplete_details` (
  `reason` text NOT NULL /*The reason the message is incomplete.*/
);  /*On an incomplete message, details about why the message is incomplete.*/


-- --------------------------------------------------------------------------
-- Table structure for table `MessageStreamEvent` generated from model 'messageStreamEvent'
--

CREATE TABLE IF NOT EXISTS `MessageStreamEvent` (
  `event` text NOT NULL,
  `data` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MessageStreamEvent_oneOf` generated from model 'messageStreamEventOneOf'
-- Occurs when a [message](/docs/api-reference/messages/object) is created.
--

CREATE TABLE IF NOT EXISTS `MessageStreamEvent_oneOf` (
  `event` text NOT NULL,
  `data` long NOT NULL
);  /*Occurs when a [message](/docs/api-reference/messages/object) is created.*/


-- --------------------------------------------------------------------------
-- Table structure for table `MessageStreamEvent_oneOf_1` generated from model 'messageStreamEventOneOf1'
-- Occurs when a [message](/docs/api-reference/messages/object) moves to an &#x60;in_progress&#x60; state.
--

CREATE TABLE IF NOT EXISTS `MessageStreamEvent_oneOf_1` (
  `event` text NOT NULL,
  `data` long NOT NULL
);  /*Occurs when a [message](/docs/api-reference/messages/object) moves to an &#x60;in_progress&#x60; state.*/


-- --------------------------------------------------------------------------
-- Table structure for table `MessageStreamEvent_oneOf_2` generated from model 'messageStreamEventOneOf2'
-- Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
--

CREATE TABLE IF NOT EXISTS `MessageStreamEvent_oneOf_2` (
  `event` text NOT NULL,
  `data` long NOT NULL
);  /*Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.*/


-- --------------------------------------------------------------------------
-- Table structure for table `MessageStreamEvent_oneOf_3` generated from model 'messageStreamEventOneOf3'
-- Occurs when a [message](/docs/api-reference/messages/object) is completed.
--

CREATE TABLE IF NOT EXISTS `MessageStreamEvent_oneOf_3` (
  `event` text NOT NULL,
  `data` long NOT NULL
);  /*Occurs when a [message](/docs/api-reference/messages/object) is completed.*/


-- --------------------------------------------------------------------------
-- Table structure for table `MessageStreamEvent_oneOf_4` generated from model 'messageStreamEventOneOf4'
-- Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.
--

CREATE TABLE IF NOT EXISTS `MessageStreamEvent_oneOf_4` (
  `event` text NOT NULL,
  `data` long NOT NULL
);  /*Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.*/


-- --------------------------------------------------------------------------
-- Table structure for table `Model` generated from model 'model'
-- Describes an OpenAI model offering that can be used with the API.
--

CREATE TABLE IF NOT EXISTS `Model` (
  `id` text NOT NULL PRIMARY KEY /*The model identifier, which can be referenced in the API endpoints.*/,
  `created` int NOT NULL /*The Unix timestamp (in seconds) when the model was created.*/,
  `object` text NOT NULL /*The object type, which is always \&quot;model\&quot;.*/,
  `owned_by` text NOT NULL /*The organization that owns the model.*/
);  /*Describes an OpenAI model offering that can be used with the API.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ModifyAssistantRequest` generated from model 'modifyAssistantRequest'
--

CREATE TABLE IF NOT EXISTS `ModifyAssistantRequest` (
  `model` text,
  `name` text /*The name of the assistant. The maximum length is 256 characters. */,
  `description` text /*The description of the assistant. The maximum length is 512 characters. */,
  `instructions` text /*The system instructions that the assistant uses. The maximum length is 256,000 characters. */,
  `metadata` blob /*Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. */
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ModifyAssistantRequestAssistantObjectToolsInner` generated from model 'ModifyAssistantRequestAssistantObjectToolsInner'

CREATE TABLE IF NOT EXISTS `ModifyAssistantRequestAssistantObjectToolsInner` (
  `modifyAssistantRequest` long NOT NULL
  `assistantObjectToolsInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ModifyAssistantRequestFileIds` generated from model 'ModifyAssistantRequestFileIds'

CREATE TABLE IF NOT EXISTS `ModifyAssistantRequestFileIds` (
  `modifyAssistantRequest` long NOT NULL
  `fileIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ModifyMessageRequest` generated from model 'modifyMessageRequest'
--

CREATE TABLE IF NOT EXISTS `ModifyMessageRequest` (
  `metadata` blob /*Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. */
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ModifyRunRequest` generated from model 'modifyRunRequest'
--

CREATE TABLE IF NOT EXISTS `ModifyRunRequest` (
  `metadata` blob /*Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. */
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ModifyThreadRequest` generated from model 'modifyThreadRequest'
--

CREATE TABLE IF NOT EXISTS `ModifyThreadRequest` (
  `metadata` blob /*Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. */
); 


-- --------------------------------------------------------------------------
-- Table structure for table `OpenAIFile` generated from model 'openAIFile'
-- The &#x60;File&#x60; object represents a document that has been uploaded to OpenAI.
--

CREATE TABLE IF NOT EXISTS `OpenAIFile` (
  `id` text NOT NULL PRIMARY KEY /*The file identifier, which can be referenced in the API endpoints.*/,
  `bytes` int NOT NULL /*The size of the file, in bytes.*/,
  `created_at` int NOT NULL /*The Unix timestamp (in seconds) for when the file was created.*/,
  `filename` text NOT NULL /*The name of the file.*/,
  `object` text NOT NULL /*The object type, which is always &#x60;file&#x60;.*/,
  `purpose` text NOT NULL /*The intended purpose of the file. Supported values are &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60;, &#x60;assistants&#x60;, and &#x60;assistants_output&#x60;.*/,
  `status` text NOT NULL /*Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;.*/,
  `status_details` text /*Deprecated. For details on why a fine-tuning training file failed validation, see the &#x60;error&#x60; field on &#x60;fine_tuning.job&#x60;.*/
);  /*The &#x60;File&#x60; object represents a document that has been uploaded to OpenAI.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunCompletionUsage` generated from model 'runCompletionUsage'
-- Usage statistics related to the run. This value will be &#x60;null&#x60; if the run is not in a terminal state (i.e. &#x60;in_progress&#x60;, &#x60;queued&#x60;, etc.).
--

CREATE TABLE IF NOT EXISTS `RunCompletionUsage` (
  `completion_tokens` int NOT NULL /*Number of completion tokens used over the course of the run.*/,
  `prompt_tokens` int NOT NULL /*Number of prompt tokens used over the course of the run.*/,
  `total_tokens` int NOT NULL /*Total number of tokens used (prompt + completion).*/
);  /*Usage statistics related to the run. This value will be &#x60;null&#x60; if the run is not in a terminal state (i.e. &#x60;in_progress&#x60;, &#x60;queued&#x60;, etc.).*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunObject` generated from model 'runObject'
-- Represents an execution run on a [thread](/docs/api-reference/threads).
--

CREATE TABLE IF NOT EXISTS `RunObject` (
  `id` text NOT NULL PRIMARY KEY /*The identifier, which can be referenced in API endpoints.*/,
  `object` text NOT NULL /*The object type, which is always &#x60;thread.run&#x60;.*/,
  `created_at` int NOT NULL /*The Unix timestamp (in seconds) for when the run was created.*/,
  `thread_id` text NOT NULL /*The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.*/,
  `assistant_id` text NOT NULL /*The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.*/,
  `status` text NOT NULL /*The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;.*/,
  `required_action` long NOT NULL,
  `last_error` long NOT NULL,
  `expires_at` int NOT NULL /*The Unix timestamp (in seconds) for when the run will expire.*/,
  `started_at` int NOT NULL /*The Unix timestamp (in seconds) for when the run was started.*/,
  `cancelled_at` int NOT NULL /*The Unix timestamp (in seconds) for when the run was cancelled.*/,
  `failed_at` int NOT NULL /*The Unix timestamp (in seconds) for when the run failed.*/,
  `completed_at` int NOT NULL /*The Unix timestamp (in seconds) for when the run was completed.*/,
  `incomplete_details` long NOT NULL,
  `model` text NOT NULL /*The model that the [assistant](/docs/api-reference/assistants) used for this run.*/,
  `instructions` text NOT NULL /*The instructions that the [assistant](/docs/api-reference/assistants) used for this run.*/,
  `metadata` blob NOT NULL /*Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. */,
  `usage` long NOT NULL,
  `max_prompt_tokens` int UNSIGNED NOT NULL /*The maximum number of prompt tokens specified to have been used over the course of the run. */,
  `max_completion_tokens` int UNSIGNED NOT NULL /*The maximum number of completion tokens specified to have been used over the course of the run. */,
  `truncation_strategy` long NOT NULL,
  `tool_choice` long NOT NULL,
  `response_format` long NOT NULL,
  `temperature` decimal /*The sampling temperature used for this run. If not set, defaults to 1.*/
);  /*Represents an execution run on a [thread](/docs/api-reference/threads).*/

-- --------------------------------------------------------------------------
-- Table structure for table `RunObjectAssistantObjectToolsInner` generated from model 'RunObjectAssistantObjectToolsInner'

CREATE TABLE IF NOT EXISTS `RunObjectAssistantObjectToolsInner` (
  `runObject` long NOT NULL
  `assistantObjectToolsInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `RunObjectFileIds` generated from model 'RunObjectFileIds'

CREATE TABLE IF NOT EXISTS `RunObjectFileIds` (
  `runObject` long NOT NULL
  `fileIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `RunObject_incomplete_details` generated from model 'runObjectIncompleteDetails'
-- Details on why the run is incomplete. Will be &#x60;null&#x60; if the run is not incomplete.
--

CREATE TABLE IF NOT EXISTS `RunObject_incomplete_details` (
  `reason` text /*The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.*/
);  /*Details on why the run is incomplete. Will be &#x60;null&#x60; if the run is not incomplete.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunObject_last_error` generated from model 'runObjectLastError'
-- The last error associated with this run. Will be &#x60;null&#x60; if there are no errors.
--

CREATE TABLE IF NOT EXISTS `RunObject_last_error` (
  `code` text NOT NULL /*One of &#x60;server_error&#x60;, &#x60;rate_limit_exceeded&#x60;, or &#x60;invalid_prompt&#x60;.*/,
  `message` text NOT NULL /*A human-readable description of the error.*/
);  /*The last error associated with this run. Will be &#x60;null&#x60; if there are no errors.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunObject_required_action` generated from model 'runObjectRequiredAction'
-- Details on the action required to continue the run. Will be &#x60;null&#x60; if no action is required.
--

CREATE TABLE IF NOT EXISTS `RunObject_required_action` (
  `type` text NOT NULL /*For now, this is always &#x60;submit_tool_outputs&#x60;.*/,
  `submit_tool_outputs` long NOT NULL
);  /*Details on the action required to continue the run. Will be &#x60;null&#x60; if no action is required.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunObject_required_action_submit_tool_outputs` generated from model 'runObjectRequiredActionSubmitToolOutputs'
-- Details on the tool outputs needed for this run to continue.
--

CREATE TABLE IF NOT EXISTS `RunObject_required_action_submit_tool_outputs` (
);  /*Details on the tool outputs needed for this run to continue.*/

-- --------------------------------------------------------------------------
-- Table structure for table `RunObjectRequiredActionSubmitToolOutputsRunToolCallObject` generated from model 'RunObjectRequiredActionSubmitToolOutputsRunToolCallObject'

CREATE TABLE IF NOT EXISTS `RunObjectRequiredActionSubmitToolOutputsRunToolCallObject` (
  `runObjectRequiredActionSubmitToolOutputs` long NOT NULL
  `runToolCallObject` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepCompletionUsage` generated from model 'runStepCompletionUsage'
-- Usage statistics related to the run step. This value will be &#x60;null&#x60; while the run step&#39;s status is &#x60;in_progress&#x60;.
--

CREATE TABLE IF NOT EXISTS `RunStepCompletionUsage` (
  `completion_tokens` int NOT NULL /*Number of completion tokens used over the course of the run step.*/,
  `prompt_tokens` int NOT NULL /*Number of prompt tokens used over the course of the run step.*/,
  `total_tokens` int NOT NULL /*Total number of tokens used (prompt + completion).*/
);  /*Usage statistics related to the run step. This value will be &#x60;null&#x60; while the run step&#39;s status is &#x60;in_progress&#x60;.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDeltaObject` generated from model 'runStepDeltaObject'
-- Represents a run step delta i.e. any changed fields on a run step during streaming. 
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaObject` (
  `id` text NOT NULL PRIMARY KEY /*The identifier of the run step, which can be referenced in API endpoints.*/,
  `object` text NOT NULL /*The object type, which is always &#x60;thread.run.step.delta&#x60;.*/,
  `delta` long NOT NULL
);  /*Represents a run step delta i.e. any changed fields on a run step during streaming. */


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDeltaObject_delta` generated from model 'runStepDeltaObjectDelta'
-- The delta containing the fields that have changed on the run step.
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaObject_delta` (
  `step_details` long
);  /*The delta containing the fields that have changed on the run step.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDeltaObject_delta_step_details` generated from model 'runStepDeltaObjectDeltaStepDetails'
-- The details of the run step.
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaObject_delta_step_details` (
  `type` text NOT NULL /*Always &#x60;message_creation&#x60;.*/,
  `message_creation` long,
);  /*The details of the run step.*/

-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDeltaObjectDeltaStepDetailsRunStepDeltaStepDetailsToolCallsObjectToolCallsInner` generated from model 'RunStepDeltaObjectDeltaStepDetailsRunStepDeltaStepDetailsToolCallsObjectToolCallsInner'

CREATE TABLE IF NOT EXISTS `RunStepDeltaObjectDeltaStepDetailsRunStepDeltaStepDetailsToolCallsObjectToolCallsInner` (
  `runStepDeltaObjectDeltaStepDetails` long NOT NULL
  `runStepDeltaStepDetailsToolCallsObjectToolCallsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDeltaStepDetailsMessageCreationObject` generated from model 'runStepDeltaStepDetailsMessageCreationObject'
-- Details of the message creation by the run step.
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsMessageCreationObject` (
  `type` text NOT NULL /*Always &#x60;message_creation&#x60;.*/,
  `message_creation` long
);  /*Details of the message creation by the run step.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDeltaStepDetailsMessageCreationObject_message_creation` generated from model 'runStepDeltaStepDetailsMessageCreationObjectMessageCreation'
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsMessageCreationObject_message_creation` (
  `message_id` text /*The ID of the message that was created by this run step.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDeltaStepDetailsToolCallsCodeObject` generated from model 'runStepDeltaStepDetailsToolCallsCodeObject'
-- Details of the Code Interpreter tool call the run step was involved in.
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsToolCallsCodeObject` (
  `index` int NOT NULL /*The index of the tool call in the tool calls array.*/,
  `type` text NOT NULL /*The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.*/,
  `id` text PRIMARY KEY /*The ID of the tool call.*/,
  `code_interpreter` long
);  /*Details of the Code Interpreter tool call the run step was involved in.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter` generated from model 'runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter'
-- The Code Interpreter tool call definition.
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter` (
  `input` text /*The input to the Code Interpreter tool call.*/,
);  /*The Code Interpreter tool call definition.*/

-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner` generated from model 'RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner'

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner` (
  `runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter` long NOT NULL
  `runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner` generated from model 'runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner'
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner` (
  `index` int NOT NULL /*The index of the output in the outputs array.*/,
  `type` text NOT NULL /*Always &#x60;logs&#x60;.*/,
  `logs` text /*The text output from the Code Interpreter tool call.*/,
  `image` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDeltaStepDetailsToolCallsCodeOutputImageObject` generated from model 'runStepDeltaStepDetailsToolCallsCodeOutputImageObject'
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsToolCallsCodeOutputImageObject` (
  `index` int NOT NULL /*The index of the output in the outputs array.*/,
  `type` text NOT NULL /*Always &#x60;image&#x60;.*/,
  `image` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image` generated from model 'runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage'
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image` (
  `file_id` text /*The [file](/docs/api-reference/files) ID of the image.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject` generated from model 'runStepDeltaStepDetailsToolCallsCodeOutputLogsObject'
-- Text output from the Code Interpreter tool call as part of a run step.
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject` (
  `index` int NOT NULL /*The index of the output in the outputs array.*/,
  `type` text NOT NULL /*Always &#x60;logs&#x60;.*/,
  `logs` text /*The text output from the Code Interpreter tool call.*/
);  /*Text output from the Code Interpreter tool call as part of a run step.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDeltaStepDetailsToolCallsFunctionObject` generated from model 'runStepDeltaStepDetailsToolCallsFunctionObject'
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsToolCallsFunctionObject` (
  `index` int NOT NULL /*The index of the tool call in the tool calls array.*/,
  `type` text NOT NULL /*The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call.*/,
  `id` text PRIMARY KEY /*The ID of the tool call object.*/,
  `function` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDeltaStepDetailsToolCallsFunctionObject_function` generated from model 'runStepDeltaStepDetailsToolCallsFunctionObjectFunction'
-- The definition of the function that was called.
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsToolCallsFunctionObject_function` (
  `name` text /*The name of the function.*/,
  `arguments` text /*The arguments passed to the function.*/,
  `output` text /*The output of the function. This will be &#x60;null&#x60; if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.*/
);  /*The definition of the function that was called.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDeltaStepDetailsToolCallsObject` generated from model 'runStepDeltaStepDetailsToolCallsObject'
-- Details of the tool call.
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsToolCallsObject` (
  `type` text NOT NULL /*Always &#x60;tool_calls&#x60;.*/,
);  /*Details of the tool call.*/

-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDeltaStepDetailsToolCallsObjectRunStepDeltaStepDetailsToolCallsObjectToolCallsInner` generated from model 'RunStepDeltaStepDetailsToolCallsObjectRunStepDeltaStepDetailsToolCallsObjectToolCallsInner'

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsToolCallsObjectRunStepDeltaStepDetailsToolCallsObjectToolCallsInner` (
  `runStepDeltaStepDetailsToolCallsObject` long NOT NULL
  `runStepDeltaStepDetailsToolCallsObjectToolCallsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner` generated from model 'runStepDeltaStepDetailsToolCallsObjectToolCallsInner'
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner` (
  `index` int NOT NULL /*The index of the tool call in the tool calls array.*/,
  `type` text NOT NULL /*The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.*/,
  `id` text PRIMARY KEY /*The ID of the tool call object.*/,
  `code_interpreter` long,
  `retrieval` blob /*For now, this is always going to be an empty object.*/,
  `function` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDeltaStepDetailsToolCallsRetrievalObject` generated from model 'runStepDeltaStepDetailsToolCallsRetrievalObject'
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsToolCallsRetrievalObject` (
  `index` int NOT NULL /*The index of the tool call in the tool calls array.*/,
  `type` text NOT NULL /*The type of tool call. This is always going to be &#x60;retrieval&#x60; for this type of tool call.*/,
  `id` text PRIMARY KEY /*The ID of the tool call object.*/,
  `retrieval` blob /*For now, this is always going to be an empty object.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDetailsMessageCreationObject` generated from model 'runStepDetailsMessageCreationObject'
-- Details of the message creation by the run step.
--

CREATE TABLE IF NOT EXISTS `RunStepDetailsMessageCreationObject` (
  `type` text NOT NULL /*Always &#x60;message_creation&#x60;.*/,
  `message_creation` long NOT NULL
);  /*Details of the message creation by the run step.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDetailsMessageCreationObject_message_creation` generated from model 'runStepDetailsMessageCreationObjectMessageCreation'
--

CREATE TABLE IF NOT EXISTS `RunStepDetailsMessageCreationObject_message_creation` (
  `message_id` text NOT NULL /*The ID of the message that was created by this run step.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDetailsToolCallsCodeObject` generated from model 'runStepDetailsToolCallsCodeObject'
-- Details of the Code Interpreter tool call the run step was involved in.
--

CREATE TABLE IF NOT EXISTS `RunStepDetailsToolCallsCodeObject` (
  `id` text NOT NULL PRIMARY KEY /*The ID of the tool call.*/,
  `type` text NOT NULL /*The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.*/,
  `code_interpreter` long NOT NULL
);  /*Details of the Code Interpreter tool call the run step was involved in.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDetailsToolCallsCodeObject_code_interpreter` generated from model 'runStepDetailsToolCallsCodeObjectCodeInterpreter'
-- The Code Interpreter tool call definition.
--

CREATE TABLE IF NOT EXISTS `RunStepDetailsToolCallsCodeObject_code_interpreter` (
  `input` text NOT NULL /*The input to the Code Interpreter tool call.*/,
);  /*The Code Interpreter tool call definition.*/

-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDetailsToolCallsCodeObjectCodeInterpreterRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner` generated from model 'RunStepDetailsToolCallsCodeObjectCodeInterpreterRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner'

CREATE TABLE IF NOT EXISTS `RunStepDetailsToolCallsCodeObjectCodeInterpreterRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner` (
  `runStepDetailsToolCallsCodeObjectCodeInterpreter` long NOT NULL
  `runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner` generated from model 'runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner'
--

CREATE TABLE IF NOT EXISTS `RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner` (
  `type` text NOT NULL /*Always &#x60;logs&#x60;.*/,
  `logs` text NOT NULL /*The text output from the Code Interpreter tool call.*/,
  `image` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDetailsToolCallsCodeOutputImageObject` generated from model 'runStepDetailsToolCallsCodeOutputImageObject'
--

CREATE TABLE IF NOT EXISTS `RunStepDetailsToolCallsCodeOutputImageObject` (
  `type` text NOT NULL /*Always &#x60;image&#x60;.*/,
  `image` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDetailsToolCallsCodeOutputImageObject_image` generated from model 'runStepDetailsToolCallsCodeOutputImageObjectImage'
--

CREATE TABLE IF NOT EXISTS `RunStepDetailsToolCallsCodeOutputImageObject_image` (
  `file_id` text NOT NULL /*The [file](/docs/api-reference/files) ID of the image.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDetailsToolCallsCodeOutputLogsObject` generated from model 'runStepDetailsToolCallsCodeOutputLogsObject'
-- Text output from the Code Interpreter tool call as part of a run step.
--

CREATE TABLE IF NOT EXISTS `RunStepDetailsToolCallsCodeOutputLogsObject` (
  `type` text NOT NULL /*Always &#x60;logs&#x60;.*/,
  `logs` text NOT NULL /*The text output from the Code Interpreter tool call.*/
);  /*Text output from the Code Interpreter tool call as part of a run step.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDetailsToolCallsFunctionObject` generated from model 'runStepDetailsToolCallsFunctionObject'
--

CREATE TABLE IF NOT EXISTS `RunStepDetailsToolCallsFunctionObject` (
  `id` text NOT NULL PRIMARY KEY /*The ID of the tool call object.*/,
  `type` text NOT NULL /*The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call.*/,
  `function` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDetailsToolCallsFunctionObject_function` generated from model 'runStepDetailsToolCallsFunctionObjectFunction'
-- The definition of the function that was called.
--

CREATE TABLE IF NOT EXISTS `RunStepDetailsToolCallsFunctionObject_function` (
  `name` text NOT NULL /*The name of the function.*/,
  `arguments` text NOT NULL /*The arguments passed to the function.*/,
  `output` text NOT NULL /*The output of the function. This will be &#x60;null&#x60; if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.*/
);  /*The definition of the function that was called.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDetailsToolCallsObject` generated from model 'runStepDetailsToolCallsObject'
-- Details of the tool call.
--

CREATE TABLE IF NOT EXISTS `RunStepDetailsToolCallsObject` (
  `type` text NOT NULL /*Always &#x60;tool_calls&#x60;.*/,
);  /*Details of the tool call.*/

-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDetailsToolCallsObjectRunStepDetailsToolCallsObjectToolCallsInner` generated from model 'RunStepDetailsToolCallsObjectRunStepDetailsToolCallsObjectToolCallsInner'

CREATE TABLE IF NOT EXISTS `RunStepDetailsToolCallsObjectRunStepDetailsToolCallsObjectToolCallsInner` (
  `runStepDetailsToolCallsObject` long NOT NULL
  `runStepDetailsToolCallsObjectToolCallsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDetailsToolCallsObject_tool_calls_inner` generated from model 'runStepDetailsToolCallsObjectToolCallsInner'
--

CREATE TABLE IF NOT EXISTS `RunStepDetailsToolCallsObject_tool_calls_inner` (
  `id` text NOT NULL PRIMARY KEY /*The ID of the tool call object.*/,
  `type` text NOT NULL /*The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.*/,
  `code_interpreter` long NOT NULL,
  `retrieval` blob NOT NULL /*For now, this is always going to be an empty object.*/,
  `function` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepDetailsToolCallsRetrievalObject` generated from model 'runStepDetailsToolCallsRetrievalObject'
--

CREATE TABLE IF NOT EXISTS `RunStepDetailsToolCallsRetrievalObject` (
  `id` text NOT NULL PRIMARY KEY /*The ID of the tool call object.*/,
  `type` text NOT NULL /*The type of tool call. This is always going to be &#x60;retrieval&#x60; for this type of tool call.*/,
  `retrieval` blob NOT NULL /*For now, this is always going to be an empty object.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepObject` generated from model 'runStepObject'
-- Represents a step in execution of a run. 
--

CREATE TABLE IF NOT EXISTS `RunStepObject` (
  `id` text NOT NULL PRIMARY KEY /*The identifier of the run step, which can be referenced in API endpoints.*/,
  `object` text NOT NULL /*The object type, which is always &#x60;thread.run.step&#x60;.*/,
  `created_at` int NOT NULL /*The Unix timestamp (in seconds) for when the run step was created.*/,
  `assistant_id` text NOT NULL /*The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.*/,
  `thread_id` text NOT NULL /*The ID of the [thread](/docs/api-reference/threads) that was run.*/,
  `run_id` text NOT NULL /*The ID of the [run](/docs/api-reference/runs) that this run step is a part of.*/,
  `type` text NOT NULL /*The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;.*/,
  `status` text NOT NULL /*The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;.*/,
  `step_details` long NOT NULL,
  `last_error` long NOT NULL,
  `expired_at` int NOT NULL /*The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.*/,
  `cancelled_at` int NOT NULL /*The Unix timestamp (in seconds) for when the run step was cancelled.*/,
  `failed_at` int NOT NULL /*The Unix timestamp (in seconds) for when the run step failed.*/,
  `completed_at` int NOT NULL /*The Unix timestamp (in seconds) for when the run step completed.*/,
  `metadata` blob NOT NULL /*Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. */,
  `usage` long NOT NULL
);  /*Represents a step in execution of a run. */


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepObject_last_error` generated from model 'runStepObjectLastError'
-- The last error associated with this run step. Will be &#x60;null&#x60; if there are no errors.
--

CREATE TABLE IF NOT EXISTS `RunStepObject_last_error` (
  `code` text NOT NULL /*One of &#x60;server_error&#x60; or &#x60;rate_limit_exceeded&#x60;.*/,
  `message` text NOT NULL /*A human-readable description of the error.*/
);  /*The last error associated with this run step. Will be &#x60;null&#x60; if there are no errors.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepObject_step_details` generated from model 'runStepObjectStepDetails'
-- The details of the run step.
--

CREATE TABLE IF NOT EXISTS `RunStepObject_step_details` (
  `type` text NOT NULL /*Always &#x60;message_creation&#x60;.*/,
  `message_creation` long NOT NULL,
);  /*The details of the run step.*/

-- --------------------------------------------------------------------------
-- Table structure for table `RunStepObjectStepDetailsRunStepDetailsToolCallsObjectToolCallsInner` generated from model 'RunStepObjectStepDetailsRunStepDetailsToolCallsObjectToolCallsInner'

CREATE TABLE IF NOT EXISTS `RunStepObjectStepDetailsRunStepDetailsToolCallsObjectToolCallsInner` (
  `runStepObjectStepDetails` long NOT NULL
  `runStepDetailsToolCallsObjectToolCallsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepStreamEvent` generated from model 'runStepStreamEvent'
--

CREATE TABLE IF NOT EXISTS `RunStepStreamEvent` (
  `event` text NOT NULL,
  `data` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepStreamEvent_oneOf` generated from model 'runStepStreamEventOneOf'
-- Occurs when a [run step](/docs/api-reference/runs/step-object) is created.
--

CREATE TABLE IF NOT EXISTS `RunStepStreamEvent_oneOf` (
  `event` text NOT NULL,
  `data` long NOT NULL
);  /*Occurs when a [run step](/docs/api-reference/runs/step-object) is created.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepStreamEvent_oneOf_1` generated from model 'runStepStreamEventOneOf1'
-- Occurs when a [run step](/docs/api-reference/runs/step-object) moves to an &#x60;in_progress&#x60; state.
--

CREATE TABLE IF NOT EXISTS `RunStepStreamEvent_oneOf_1` (
  `event` text NOT NULL,
  `data` long NOT NULL
);  /*Occurs when a [run step](/docs/api-reference/runs/step-object) moves to an &#x60;in_progress&#x60; state.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepStreamEvent_oneOf_2` generated from model 'runStepStreamEventOneOf2'
-- Occurs when parts of a [run step](/docs/api-reference/runs/step-object) are being streamed.
--

CREATE TABLE IF NOT EXISTS `RunStepStreamEvent_oneOf_2` (
  `event` text NOT NULL,
  `data` long NOT NULL
);  /*Occurs when parts of a [run step](/docs/api-reference/runs/step-object) are being streamed.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepStreamEvent_oneOf_3` generated from model 'runStepStreamEventOneOf3'
-- Occurs when a [run step](/docs/api-reference/runs/step-object) is completed.
--

CREATE TABLE IF NOT EXISTS `RunStepStreamEvent_oneOf_3` (
  `event` text NOT NULL,
  `data` long NOT NULL
);  /*Occurs when a [run step](/docs/api-reference/runs/step-object) is completed.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepStreamEvent_oneOf_4` generated from model 'runStepStreamEventOneOf4'
-- Occurs when a [run step](/docs/api-reference/runs/step-object) fails.
--

CREATE TABLE IF NOT EXISTS `RunStepStreamEvent_oneOf_4` (
  `event` text NOT NULL,
  `data` long NOT NULL
);  /*Occurs when a [run step](/docs/api-reference/runs/step-object) fails.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepStreamEvent_oneOf_5` generated from model 'runStepStreamEventOneOf5'
-- Occurs when a [run step](/docs/api-reference/runs/step-object) is cancelled.
--

CREATE TABLE IF NOT EXISTS `RunStepStreamEvent_oneOf_5` (
  `event` text NOT NULL,
  `data` long NOT NULL
);  /*Occurs when a [run step](/docs/api-reference/runs/step-object) is cancelled.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunStepStreamEvent_oneOf_6` generated from model 'runStepStreamEventOneOf6'
-- Occurs when a [run step](/docs/api-reference/runs/step-object) expires.
--

CREATE TABLE IF NOT EXISTS `RunStepStreamEvent_oneOf_6` (
  `event` text NOT NULL,
  `data` long NOT NULL
);  /*Occurs when a [run step](/docs/api-reference/runs/step-object) expires.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunStreamEvent` generated from model 'runStreamEvent'
--

CREATE TABLE IF NOT EXISTS `RunStreamEvent` (
  `event` text NOT NULL,
  `data` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `RunStreamEvent_oneOf` generated from model 'runStreamEventOneOf'
-- Occurs when a new [run](/docs/api-reference/runs/object) is created.
--

CREATE TABLE IF NOT EXISTS `RunStreamEvent_oneOf` (
  `event` text NOT NULL,
  `data` long NOT NULL
);  /*Occurs when a new [run](/docs/api-reference/runs/object) is created.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunStreamEvent_oneOf_1` generated from model 'runStreamEventOneOf1'
-- Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;queued&#x60; status.
--

CREATE TABLE IF NOT EXISTS `RunStreamEvent_oneOf_1` (
  `event` text NOT NULL,
  `data` long NOT NULL
);  /*Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;queued&#x60; status.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunStreamEvent_oneOf_2` generated from model 'runStreamEventOneOf2'
-- Occurs when a [run](/docs/api-reference/runs/object) moves to an &#x60;in_progress&#x60; status.
--

CREATE TABLE IF NOT EXISTS `RunStreamEvent_oneOf_2` (
  `event` text NOT NULL,
  `data` long NOT NULL
);  /*Occurs when a [run](/docs/api-reference/runs/object) moves to an &#x60;in_progress&#x60; status.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunStreamEvent_oneOf_3` generated from model 'runStreamEventOneOf3'
-- Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;requires_action&#x60; status.
--

CREATE TABLE IF NOT EXISTS `RunStreamEvent_oneOf_3` (
  `event` text NOT NULL,
  `data` long NOT NULL
);  /*Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;requires_action&#x60; status.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunStreamEvent_oneOf_4` generated from model 'runStreamEventOneOf4'
-- Occurs when a [run](/docs/api-reference/runs/object) is completed.
--

CREATE TABLE IF NOT EXISTS `RunStreamEvent_oneOf_4` (
  `event` text NOT NULL,
  `data` long NOT NULL
);  /*Occurs when a [run](/docs/api-reference/runs/object) is completed.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunStreamEvent_oneOf_5` generated from model 'runStreamEventOneOf5'
-- Occurs when a [run](/docs/api-reference/runs/object) fails.
--

CREATE TABLE IF NOT EXISTS `RunStreamEvent_oneOf_5` (
  `event` text NOT NULL,
  `data` long NOT NULL
);  /*Occurs when a [run](/docs/api-reference/runs/object) fails.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunStreamEvent_oneOf_6` generated from model 'runStreamEventOneOf6'
-- Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;cancelling&#x60; status.
--

CREATE TABLE IF NOT EXISTS `RunStreamEvent_oneOf_6` (
  `event` text NOT NULL,
  `data` long NOT NULL
);  /*Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;cancelling&#x60; status.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunStreamEvent_oneOf_7` generated from model 'runStreamEventOneOf7'
-- Occurs when a [run](/docs/api-reference/runs/object) is cancelled.
--

CREATE TABLE IF NOT EXISTS `RunStreamEvent_oneOf_7` (
  `event` text NOT NULL,
  `data` long NOT NULL
);  /*Occurs when a [run](/docs/api-reference/runs/object) is cancelled.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunStreamEvent_oneOf_8` generated from model 'runStreamEventOneOf8'
-- Occurs when a [run](/docs/api-reference/runs/object) expires.
--

CREATE TABLE IF NOT EXISTS `RunStreamEvent_oneOf_8` (
  `event` text NOT NULL,
  `data` long NOT NULL
);  /*Occurs when a [run](/docs/api-reference/runs/object) expires.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunToolCallObject` generated from model 'runToolCallObject'
-- Tool call objects
--

CREATE TABLE IF NOT EXISTS `RunToolCallObject` (
  `id` text NOT NULL PRIMARY KEY /*The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.*/,
  `type` text NOT NULL /*The type of tool call the output is required for. For now, this is always &#x60;function&#x60;.*/,
  `function` long NOT NULL
);  /*Tool call objects*/


-- --------------------------------------------------------------------------
-- Table structure for table `RunToolCallObject_function` generated from model 'runToolCallObjectFunction'
-- The function definition.
--

CREATE TABLE IF NOT EXISTS `RunToolCallObject_function` (
  `name` text NOT NULL /*The name of the function.*/,
  `arguments` text NOT NULL /*The arguments that the model expects you to pass to the function.*/
);  /*The function definition.*/


-- --------------------------------------------------------------------------
-- Table structure for table `SubmitToolOutputsRunRequest` generated from model 'submitToolOutputsRunRequest'
--

CREATE TABLE IF NOT EXISTS `SubmitToolOutputsRunRequest` (
  `stream` boolean /*If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message. */
); 

-- --------------------------------------------------------------------------
-- Table structure for table `SubmitToolOutputsRunRequestSubmitToolOutputsRunRequestToolOutputsInner` generated from model 'SubmitToolOutputsRunRequestSubmitToolOutputsRunRequestToolOutputsInner'

CREATE TABLE IF NOT EXISTS `SubmitToolOutputsRunRequestSubmitToolOutputsRunRequestToolOutputsInner` (
  `submitToolOutputsRunRequest` long NOT NULL
  `submitToolOutputsRunRequestToolOutputsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SubmitToolOutputsRunRequest_tool_outputs_inner` generated from model 'submitToolOutputsRunRequestToolOutputsInner'
--

CREATE TABLE IF NOT EXISTS `SubmitToolOutputsRunRequest_tool_outputs_inner` (
  `tool_call_id` text /*The ID of the tool call in the &#x60;required_action&#x60; object within the run object the output is being submitted for.*/,
  `output` text /*The output of the tool call to be submitted to continue the run.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ThreadObject` generated from model 'threadObject'
-- Represents a thread that contains [messages](/docs/api-reference/messages).
--

CREATE TABLE IF NOT EXISTS `ThreadObject` (
  `id` text NOT NULL PRIMARY KEY /*The identifier, which can be referenced in API endpoints.*/,
  `object` text NOT NULL /*The object type, which is always &#x60;thread&#x60;.*/,
  `created_at` int NOT NULL /*The Unix timestamp (in seconds) for when the thread was created.*/,
  `metadata` blob NOT NULL /*Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. */
);  /*Represents a thread that contains [messages](/docs/api-reference/messages).*/


-- --------------------------------------------------------------------------
-- Table structure for table `ThreadStreamEvent` generated from model 'threadStreamEvent'
-- Occurs when a new [thread](/docs/api-reference/threads/object) is created.
--

CREATE TABLE IF NOT EXISTS `ThreadStreamEvent` (
  `event` text NOT NULL,
  `data` long NOT NULL
);  /*Occurs when a new [thread](/docs/api-reference/threads/object) is created.*/


-- --------------------------------------------------------------------------
-- Table structure for table `TranscriptionSegment` generated from model 'transcriptionSegment'
--

CREATE TABLE IF NOT EXISTS `TranscriptionSegment` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*Unique identifier of the segment.*/,
  `seek` int NOT NULL /*Seek offset of the segment.*/,
  `start` float NOT NULL /*Start time of the segment in seconds.*/,
  `end` float NOT NULL /*End time of the segment in seconds.*/,
  `text` text NOT NULL /*Text content of the segment.*/,
  `temperature` float NOT NULL /*Temperature parameter used for generating the segment.*/,
  `avg_logprob` float NOT NULL /*Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.*/,
  `compression_ratio` float NOT NULL /*Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.*/,
  `no_speech_prob` float NOT NULL /*Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TranscriptionSegmentTokens` generated from model 'TranscriptionSegmentTokens'

CREATE TABLE IF NOT EXISTS `TranscriptionSegmentTokens` (
  `transcriptionSegment` long NOT NULL
  `tokens` int NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TranscriptionWord` generated from model 'transcriptionWord'
--

CREATE TABLE IF NOT EXISTS `TranscriptionWord` (
  `word` text NOT NULL /*The text content of the word.*/,
  `start` float NOT NULL /*Start time of the word in seconds.*/,
  `end` float NOT NULL /*End time of the word in seconds.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TruncationObject` generated from model 'truncationObject'
--

CREATE TABLE IF NOT EXISTS `TruncationObject` (
  `type` text /*The truncation strategy to use for the thread. The default is &#x60;auto&#x60;. If set to &#x60;last_messages&#x60;, the thread will be truncated to the n most recent messages in the thread. When set to &#x60;auto&#x60;, messages in the middle of the thread will be dropped to fit the context length of the model, &#x60;max_prompt_tokens&#x60;.*/,
  `last_messages` int UNSIGNED /*The number of most recent messages from the thread when constructing the context for the run.*/
); 



--
-- Table structure for table `_db_version`
--
CREATE TABLE IF NOT EXISTS `_db_version` (
  `version`    LONG    DEFAULT 1
);
