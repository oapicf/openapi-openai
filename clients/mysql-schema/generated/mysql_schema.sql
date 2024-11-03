/* SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO"; */
/* SET AUTOCOMMIT = 0; */
/* START TRANSACTION; */
/* SET time_zone = "+00:00"; */

-- --------------------------------------------------------

--
-- Table structure for table `AssistantFileObject` generated from model 'AssistantFileObject'
-- A list of [Files](/docs/api-reference/files) attached to an &#x60;assistant&#x60;.
--

CREATE TABLE IF NOT EXISTS `AssistantFileObject` (
  `id` TEXT NOT NULL COMMENT 'The identifier, which can be referenced in API endpoints.',
  `object` ENUM('assistant.file') NOT NULL COMMENT 'The object type, which is always &#x60;assistant.file&#x60;.',
  `created_at` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) for when the assistant file was created.',
  `assistant_id` TEXT NOT NULL COMMENT 'The assistant ID that the file is attached to.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A list of [Files](/docs/api-reference/files) attached to an &#x60;assistant&#x60;.';

--
-- Table structure for table `AssistantObject` generated from model 'AssistantObject'
-- Represents an &#x60;assistant&#x60; that can call the model and use tools.
--

CREATE TABLE IF NOT EXISTS `AssistantObject` (
  `id` TEXT NOT NULL COMMENT 'The identifier, which can be referenced in API endpoints.',
  `object` ENUM('assistant') NOT NULL COMMENT 'The object type, which is always &#x60;assistant&#x60;.',
  `created_at` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) for when the assistant was created.',
  `name` TEXT NOT NULL COMMENT 'The name of the assistant. The maximum length is 256 characters. ',
  `description` TEXT NOT NULL COMMENT 'The description of the assistant. The maximum length is 512 characters. ',
  `model` TEXT NOT NULL COMMENT 'ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. ',
  `instructions` MEDIUMTEXT NOT NULL COMMENT 'The system instructions that the assistant uses. The maximum length is 256,000 characters. ',
  `tools` JSON NOT NULL COMMENT 'A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. ',
  `file_ids` JSON NOT NULL COMMENT 'A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. ',
  `metadata` JSON NOT NULL COMMENT 'Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Represents an &#x60;assistant&#x60; that can call the model and use tools.';

--
-- Table structure for table `AssistantObject_tools_inner` generated from model 'AssistantObjectUnderscoretoolsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `AssistantObject_tools_inner` (
  `type` ENUM('code_interpreter', 'retrieval', 'function') NOT NULL COMMENT 'The type of tool being defined: &#x60;code_interpreter&#x60;',
  `function` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AssistantStreamEvent` generated from model 'AssistantStreamEvent'
-- Represents an event emitted when streaming a Run.  Each event in a server-sent events stream has an &#x60;event&#x60; and &#x60;data&#x60; property:  &#x60;&#x60;&#x60; event: thread.created data: {\&quot;id\&quot;: \&quot;thread_123\&quot;, \&quot;object\&quot;: \&quot;thread\&quot;, ...} &#x60;&#x60;&#x60;  We emit events whenever a new object is created, transitions to a new state, or is being streamed in parts (deltas). For example, we emit &#x60;thread.run.created&#x60; when a new run is created, &#x60;thread.run.completed&#x60; when a run completes, and so on. When an Assistant chooses to create a message during a run, we emit a &#x60;thread.message.created event&#x60;, a &#x60;thread.message.in_progress&#x60; event, many &#x60;thread.message.delta&#x60; events, and finally a &#x60;thread.message.completed&#x60; event.  We may add additional events over time, so we recommend handling unknown events gracefully in your code. See the [Assistants API quickstart](/docs/assistants/overview) to learn how to integrate the Assistants API with streaming. 
--

CREATE TABLE IF NOT EXISTS `AssistantStreamEvent` (
  `event` ENUM('done') NOT NULL,
  `data` ENUM('[DONE]') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Represents an event emitted when streaming a Run.  Each event in a server-sent events stream has an &#x60;event&#x60; and &#x60;data&#x60; property:  &#x60;&#x60;&#x60; event: thread.created data: {\&quot;id\&quot;: \&quot;thread_123\&quot;, \&quot;object\&quot;: \&quot;thread\&quot;, ...} &#x60;&#x60;&#x60;  We emit events whenever a new object is created, transitions to a new state, or is being streamed in parts (deltas). For example, we emit &#x60;thread.run.created&#x60; when a new run is created, &#x60;thread.run.completed&#x60; when a run completes, and so on. When an Assistant chooses to create a message during a run, we emit a &#x60;thread.message.created event&#x60;, a &#x60;thread.message.in_progress&#x60; event, many &#x60;thread.message.delta&#x60; events, and finally a &#x60;thread.message.completed&#x60; event.  We may add additional events over time, so we recommend handling unknown events gracefully in your code. See the [Assistants API quickstart](/docs/assistants/overview) to learn how to integrate the Assistants API with streaming. ';

--
-- Table structure for table `AssistantToolsCode` generated from model 'AssistantToolsCode'
--

CREATE TABLE IF NOT EXISTS `AssistantToolsCode` (
  `type` ENUM('code_interpreter') NOT NULL COMMENT 'The type of tool being defined: &#x60;code_interpreter&#x60;'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AssistantToolsFunction` generated from model 'AssistantToolsFunction'
--

CREATE TABLE IF NOT EXISTS `AssistantToolsFunction` (
  `type` ENUM('function') NOT NULL COMMENT 'The type of tool being defined: &#x60;function&#x60;',
  `function` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AssistantToolsRetrieval` generated from model 'AssistantToolsRetrieval'
--

CREATE TABLE IF NOT EXISTS `AssistantToolsRetrieval` (
  `type` ENUM('retrieval') NOT NULL COMMENT 'The type of tool being defined: &#x60;retrieval&#x60;'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AssistantsApiNamedToolChoice` generated from model 'AssistantsApiNamedToolChoice'
-- Specifies a tool the model should use. Use to force the model to call a specific tool.
--

CREATE TABLE IF NOT EXISTS `AssistantsApiNamedToolChoice` (
  `type` ENUM('function', 'code_interpreter', 'retrieval') NOT NULL COMMENT 'The type of the tool. If type is &#x60;function&#x60;, the function name must be set',
  `function` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Specifies a tool the model should use. Use to force the model to call a specific tool.';

--
-- Table structure for table `AssistantsApiResponseFormat` generated from model 'AssistantsApiResponseFormat'
-- An object describing the expected output of the model. If &#x60;json_object&#x60; only &#x60;function&#x60; type &#x60;tools&#x60; are allowed to be passed to the Run. If &#x60;text&#x60; the model can return text or any value needed. 
--

CREATE TABLE IF NOT EXISTS `AssistantsApiResponseFormat` (
  `type` ENUM('text', 'json_object') DEFAULT 'text' COMMENT 'Must be one of &#x60;text&#x60; or &#x60;json_object&#x60;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An object describing the expected output of the model. If &#x60;json_object&#x60; only &#x60;function&#x60; type &#x60;tools&#x60; are allowed to be passed to the Run. If &#x60;text&#x60; the model can return text or any value needed. ';

--
-- Table structure for table `AssistantsApiResponseFormatOption` generated from model 'AssistantsApiResponseFormatOption'
-- Specifies the format that the model must output. Compatible with [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than &#x60;gpt-3.5-turbo-1106&#x60;.  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_object\&quot; }&#x60; enables JSON mode, which guarantees the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \&quot;stuck\&quot; request. Also note that the message content may be partially cut off if &#x60;finish_reason&#x3D;\&quot;length\&quot;&#x60;, which indicates the generation exceeded &#x60;max_tokens&#x60; or the conversation exceeded the max context length. 
--

CREATE TABLE IF NOT EXISTS `AssistantsApiResponseFormatOption` (
  `type` ENUM('text', 'json_object') DEFAULT 'text' COMMENT 'Must be one of &#x60;text&#x60; or &#x60;json_object&#x60;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Specifies the format that the model must output. Compatible with [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than &#x60;gpt-3.5-turbo-1106&#x60;.  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_object\&quot; }&#x60; enables JSON mode, which guarantees the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \&quot;stuck\&quot; request. Also note that the message content may be partially cut off if &#x60;finish_reason&#x3D;\&quot;length\&quot;&#x60;, which indicates the generation exceeded &#x60;max_tokens&#x60; or the conversation exceeded the max context length. ';

--
-- Table structure for table `AssistantsApiToolChoiceOption` generated from model 'AssistantsApiToolChoiceOption'
-- Controls which (if any) tool is called by the model. &#x60;none&#x60; means the model will not call any tools and instead generates a message. &#x60;auto&#x60; is the default value and means the model can pick between generating a message or calling a tool. Specifying a particular tool like &#x60;{\&quot;type\&quot;: \&quot;TOOL_TYPE\&quot;}&#x60; or &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that tool. 
--

CREATE TABLE IF NOT EXISTS `AssistantsApiToolChoiceOption` (
  `type` ENUM('function', 'code_interpreter', 'retrieval') NOT NULL COMMENT 'The type of the tool. If type is &#x60;function&#x60;, the function name must be set',
  `function` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Controls which (if any) tool is called by the model. &#x60;none&#x60; means the model will not call any tools and instead generates a message. &#x60;auto&#x60; is the default value and means the model can pick between generating a message or calling a tool. Specifying a particular tool like &#x60;{\&quot;type\&quot;: \&quot;TOOL_TYPE\&quot;}&#x60; or &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that tool. ';

--
-- Table structure for table `ChatCompletionFunctionCallOption` generated from model 'ChatCompletionFunctionCallOption'
-- Specifying a particular function via &#x60;{\&quot;name\&quot;: \&quot;my_function\&quot;}&#x60; forces the model to call that function. 
--

CREATE TABLE IF NOT EXISTS `ChatCompletionFunctionCallOption` (
  `name` TEXT NOT NULL COMMENT 'The name of the function to call.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Specifying a particular function via &#x60;{\&quot;name\&quot;: \&quot;my_function\&quot;}&#x60; forces the model to call that function. ';

--
-- Table structure for table `ChatCompletionFunctions` generated from model 'ChatCompletionFunctions'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionFunctions` (
  `description` TEXT DEFAULT NULL COMMENT 'A description of what the function does, used by the model to choose when and how to call the function.',
  `name` TEXT NOT NULL COMMENT 'The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.',
  `parameters` JSON DEFAULT NULL COMMENT 'The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/text-generation/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting &#x60;parameters&#x60; defines a function with an empty parameter list.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ChatCompletionMessageToolCall` generated from model 'ChatCompletionMessageToolCall'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionMessageToolCall` (
  `id` TEXT NOT NULL COMMENT 'The ID of the tool call.',
  `type` ENUM('function') NOT NULL COMMENT 'The type of the tool. Currently, only &#x60;function&#x60; is supported.',
  `function` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ChatCompletionMessageToolCallChunk` generated from model 'ChatCompletionMessageToolCallChunk'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionMessageToolCallChunk` (
  `index` INT NOT NULL,
  `id` TEXT DEFAULT NULL COMMENT 'The ID of the tool call.',
  `type` ENUM('function') DEFAULT NULL COMMENT 'The type of the tool. Currently, only &#x60;function&#x60; is supported.',
  `function` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ChatCompletionMessageToolCallChunk_function` generated from model 'ChatCompletionMessageToolCallChunkUnderscorefunction'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionMessageToolCallChunk_function` (
  `name` TEXT DEFAULT NULL COMMENT 'The name of the function to call.',
  `arguments` TEXT DEFAULT NULL COMMENT 'The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ChatCompletionMessageToolCall_function` generated from model 'ChatCompletionMessageToolCallUnderscorefunction'
-- The function that the model called.
--

CREATE TABLE IF NOT EXISTS `ChatCompletionMessageToolCall_function` (
  `name` TEXT NOT NULL COMMENT 'The name of the function to call.',
  `arguments` TEXT NOT NULL COMMENT 'The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The function that the model called.';

--
-- Table structure for table `ChatCompletionNamedToolChoice` generated from model 'ChatCompletionNamedToolChoice'
-- Specifies a tool the model should use. Use to force the model to call a specific function.
--

CREATE TABLE IF NOT EXISTS `ChatCompletionNamedToolChoice` (
  `type` ENUM('function') NOT NULL COMMENT 'The type of the tool. Currently, only &#x60;function&#x60; is supported.',
  `function` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Specifies a tool the model should use. Use to force the model to call a specific function.';

--
-- Table structure for table `ChatCompletionNamedToolChoice_function` generated from model 'ChatCompletionNamedToolChoiceUnderscorefunction'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionNamedToolChoice_function` (
  `name` TEXT NOT NULL COMMENT 'The name of the function to call.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ChatCompletionRequestAssistantMessage` generated from model 'ChatCompletionRequestAssistantMessage'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionRequestAssistantMessage` (
  `content` TEXT DEFAULT NULL COMMENT 'The contents of the assistant message. Required unless &#x60;tool_calls&#x60; or &#x60;function_call&#x60; is specified. ',
  `role` ENUM('assistant') NOT NULL COMMENT 'The role of the messages author, in this case &#x60;assistant&#x60;.',
  `name` TEXT DEFAULT NULL COMMENT 'An optional name for the participant. Provides the model information to differentiate between participants of the same role.',
  `tool_calls` JSON DEFAULT NULL COMMENT 'The tool calls generated by the model, such as function calls.',
  `function_call` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ChatCompletionRequestAssistantMessage_function_call` generated from model 'ChatCompletionRequestAssistantMessageUnderscorefunctionUnderscorecall'
-- Deprecated and replaced by &#x60;tool_calls&#x60;. The name and arguments of a function that should be called, as generated by the model.
--

CREATE TABLE IF NOT EXISTS `ChatCompletionRequestAssistantMessage_function_call` (
  `arguments` TEXT NOT NULL COMMENT 'The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.',
  `name` TEXT NOT NULL COMMENT 'The name of the function to call.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Deprecated and replaced by &#x60;tool_calls&#x60;. The name and arguments of a function that should be called, as generated by the model.';

--
-- Table structure for table `ChatCompletionRequestFunctionMessage` generated from model 'ChatCompletionRequestFunctionMessage'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionRequestFunctionMessage` (
  `role` ENUM('function') NOT NULL COMMENT 'The role of the messages author, in this case &#x60;function&#x60;.',
  `content` TEXT NOT NULL COMMENT 'The contents of the function message.',
  `name` TEXT NOT NULL COMMENT 'The name of the function to call.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ChatCompletionRequestMessage` generated from model 'ChatCompletionRequestMessage'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionRequestMessage` (
  `content` TEXT NOT NULL COMMENT 'The contents of the function message.',
  `role` ENUM('function') NOT NULL COMMENT 'The role of the messages author, in this case &#x60;function&#x60;.',
  `name` TEXT NOT NULL COMMENT 'The name of the function to call.',
  `tool_calls` JSON DEFAULT NULL COMMENT 'The tool calls generated by the model, such as function calls.',
  `function_call` TEXT DEFAULT NULL,
  `tool_call_id` TEXT NOT NULL COMMENT 'Tool call that this message is responding to.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ChatCompletionRequestMessageContentPart` generated from model 'ChatCompletionRequestMessageContentPart'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionRequestMessageContentPart` (
  `type` ENUM('text', 'image_url') NOT NULL COMMENT 'The type of the content part.',
  `text` TEXT NOT NULL COMMENT 'The text content.',
  `image_url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ChatCompletionRequestMessageContentPartImage` generated from model 'ChatCompletionRequestMessageContentPartImage'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionRequestMessageContentPartImage` (
  `type` ENUM('image_url') NOT NULL COMMENT 'The type of the content part.',
  `image_url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ChatCompletionRequestMessageContentPartImage_image_url` generated from model 'ChatCompletionRequestMessageContentPartImageUnderscoreimageUnderscoreurl'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionRequestMessageContentPartImage_image_url` (
  `url` TEXT NOT NULL COMMENT 'Either a URL of the image or the base64 encoded image data.',
  `detail` ENUM('auto', 'low', 'high') DEFAULT 'auto' COMMENT 'Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ChatCompletionRequestMessageContentPartText` generated from model 'ChatCompletionRequestMessageContentPartText'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionRequestMessageContentPartText` (
  `type` ENUM('text') NOT NULL COMMENT 'The type of the content part.',
  `text` TEXT NOT NULL COMMENT 'The text content.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ChatCompletionRequestSystemMessage` generated from model 'ChatCompletionRequestSystemMessage'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionRequestSystemMessage` (
  `content` TEXT NOT NULL COMMENT 'The contents of the system message.',
  `role` ENUM('system') NOT NULL COMMENT 'The role of the messages author, in this case &#x60;system&#x60;.',
  `name` TEXT DEFAULT NULL COMMENT 'An optional name for the participant. Provides the model information to differentiate between participants of the same role.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ChatCompletionRequestToolMessage` generated from model 'ChatCompletionRequestToolMessage'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionRequestToolMessage` (
  `role` ENUM('tool') NOT NULL COMMENT 'The role of the messages author, in this case &#x60;tool&#x60;.',
  `content` TEXT NOT NULL COMMENT 'The contents of the tool message.',
  `tool_call_id` TEXT NOT NULL COMMENT 'Tool call that this message is responding to.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ChatCompletionRequestUserMessage` generated from model 'ChatCompletionRequestUserMessage'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionRequestUserMessage` (
  `content` TEXT NOT NULL,
  `role` ENUM('user') NOT NULL COMMENT 'The role of the messages author, in this case &#x60;user&#x60;.',
  `name` TEXT DEFAULT NULL COMMENT 'An optional name for the participant. Provides the model information to differentiate between participants of the same role.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ChatCompletionResponseMessage` generated from model 'ChatCompletionResponseMessage'
-- A chat completion message generated by the model.
--

CREATE TABLE IF NOT EXISTS `ChatCompletionResponseMessage` (
  `content` TEXT NOT NULL COMMENT 'The contents of the message.',
  `tool_calls` JSON DEFAULT NULL COMMENT 'The tool calls generated by the model, such as function calls.',
  `role` ENUM('assistant') NOT NULL COMMENT 'The role of the author of this message.',
  `function_call` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A chat completion message generated by the model.';

--
-- Table structure for table `ChatCompletionStreamResponseDelta` generated from model 'ChatCompletionStreamResponseDelta'
-- A chat completion delta generated by streamed model responses.
--

CREATE TABLE IF NOT EXISTS `ChatCompletionStreamResponseDelta` (
  `content` TEXT DEFAULT NULL COMMENT 'The contents of the chunk message.',
  `function_call` TEXT DEFAULT NULL,
  `tool_calls` JSON DEFAULT NULL,
  `role` ENUM('system', 'user', 'assistant', 'tool') DEFAULT NULL COMMENT 'The role of the author of this message.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A chat completion delta generated by streamed model responses.';

--
-- Table structure for table `ChatCompletionStreamResponseDelta_function_call` generated from model 'ChatCompletionStreamResponseDeltaUnderscorefunctionUnderscorecall'
-- Deprecated and replaced by &#x60;tool_calls&#x60;. The name and arguments of a function that should be called, as generated by the model.
--

CREATE TABLE IF NOT EXISTS `ChatCompletionStreamResponseDelta_function_call` (
  `arguments` TEXT DEFAULT NULL COMMENT 'The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.',
  `name` TEXT DEFAULT NULL COMMENT 'The name of the function to call.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Deprecated and replaced by &#x60;tool_calls&#x60;. The name and arguments of a function that should be called, as generated by the model.';

--
-- Table structure for table `ChatCompletionTokenLogprob` generated from model 'ChatCompletionTokenLogprob'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionTokenLogprob` (
  `token` TEXT NOT NULL COMMENT 'The token.',
  `logprob` DECIMAL(20, 9) NOT NULL COMMENT 'The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value &#x60;-9999.0&#x60; is used to signify that the token is very unlikely.',
  `bytes` JSON NOT NULL COMMENT 'A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be &#x60;null&#x60; if there is no bytes representation for the token.',
  `top_logprobs` JSON NOT NULL COMMENT 'List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested &#x60;top_logprobs&#x60; returned.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ChatCompletionTokenLogprob_top_logprobs_inner` generated from model 'ChatCompletionTokenLogprobUnderscoretopUnderscorelogprobsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionTokenLogprob_top_logprobs_inner` (
  `token` TEXT NOT NULL COMMENT 'The token.',
  `logprob` DECIMAL(20, 9) NOT NULL COMMENT 'The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value &#x60;-9999.0&#x60; is used to signify that the token is very unlikely.',
  `bytes` JSON NOT NULL COMMENT 'A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be &#x60;null&#x60; if there is no bytes representation for the token.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ChatCompletionTool` generated from model 'ChatCompletionTool'
--

CREATE TABLE IF NOT EXISTS `ChatCompletionTool` (
  `type` ENUM('function') NOT NULL COMMENT 'The type of the tool. Currently, only &#x60;function&#x60; is supported.',
  `function` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ChatCompletionToolChoiceOption` generated from model 'ChatCompletionToolChoiceOption'
-- Controls which (if any) function is called by the model. &#x60;none&#x60; means the model will not call a function and instead generates a message. &#x60;auto&#x60; means the model can pick between generating a message or calling a function. Specifying a particular function via &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that function.  &#x60;none&#x60; is the default when no functions are present. &#x60;auto&#x60; is the default if functions are present. 
--

CREATE TABLE IF NOT EXISTS `ChatCompletionToolChoiceOption` (
  `type` ENUM('function') NOT NULL COMMENT 'The type of the tool. Currently, only &#x60;function&#x60; is supported.',
  `function` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Controls which (if any) function is called by the model. &#x60;none&#x60; means the model will not call a function and instead generates a message. &#x60;auto&#x60; means the model can pick between generating a message or calling a function. Specifying a particular function via &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that function.  &#x60;none&#x60; is the default when no functions are present. &#x60;auto&#x60; is the default if functions are present. ';

--
-- Table structure for table `CompletionUsage` generated from model 'CompletionUsage'
-- Usage statistics for the completion request.
--

CREATE TABLE IF NOT EXISTS `CompletionUsage` (
  `completion_tokens` INT NOT NULL COMMENT 'Number of tokens in the generated completion.',
  `prompt_tokens` INT NOT NULL COMMENT 'Number of tokens in the prompt.',
  `total_tokens` INT NOT NULL COMMENT 'Total number of tokens used in the request (prompt + completion).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Usage statistics for the completion request.';

--
-- Table structure for table `CreateAssistantFileRequest` generated from model 'CreateAssistantFileRequest'
--

CREATE TABLE IF NOT EXISTS `CreateAssistantFileRequest` (
  `file_id` TEXT NOT NULL COMMENT 'A [File](/docs/api-reference/files) ID (with &#x60;purpose&#x3D;\&quot;assistants\&quot;&#x60;) that the assistant should use. Useful for tools like &#x60;retrieval&#x60; and &#x60;code_interpreter&#x60; that can access files.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateAssistantRequest` generated from model 'CreateAssistantRequest'
--

CREATE TABLE IF NOT EXISTS `CreateAssistantRequest` (
  `model` TEXT NOT NULL,
  `name` TEXT DEFAULT NULL COMMENT 'The name of the assistant. The maximum length is 256 characters. ',
  `description` TEXT DEFAULT NULL COMMENT 'The description of the assistant. The maximum length is 512 characters. ',
  `instructions` MEDIUMTEXT DEFAULT NULL COMMENT 'The system instructions that the assistant uses. The maximum length is 256,000 characters. ',
  `tools` JSON COMMENT 'A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. ',
  `file_ids` JSON COMMENT 'A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. ',
  `metadata` JSON DEFAULT NULL COMMENT 'Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateChatCompletionFunctionResponse` generated from model 'CreateChatCompletionFunctionResponse'
-- Represents a chat completion response returned by model, based on the provided input.
--

CREATE TABLE IF NOT EXISTS `CreateChatCompletionFunctionResponse` (
  `id` TEXT NOT NULL COMMENT 'A unique identifier for the chat completion.',
  `choices` JSON NOT NULL COMMENT 'A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1.',
  `created` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) of when the chat completion was created.',
  `model` TEXT NOT NULL COMMENT 'The model used for the chat completion.',
  `system_fingerprint` TEXT DEFAULT NULL COMMENT 'This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. ',
  `object` ENUM('chat.completion') NOT NULL COMMENT 'The object type, which is always &#x60;chat.completion&#x60;.',
  `usage` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Represents a chat completion response returned by model, based on the provided input.';

--
-- Table structure for table `CreateChatCompletionFunctionResponse_choices_inner` generated from model 'CreateChatCompletionFunctionResponseUnderscorechoicesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `CreateChatCompletionFunctionResponse_choices_inner` (
  `finish_reason` ENUM('stop', 'length', 'function_call', 'content_filter') NOT NULL COMMENT 'The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, or &#x60;function_call&#x60; if the model called a function. ',
  `index` INT NOT NULL COMMENT 'The index of the choice in the list of choices.',
  `message` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateChatCompletionRequest` generated from model 'CreateChatCompletionRequest'
--

CREATE TABLE IF NOT EXISTS `CreateChatCompletionRequest` (
  `messages` JSON NOT NULL COMMENT 'A list of messages comprising the conversation so far. [Example Python code](https://cookbook.openai.com/examples/how_to_format_inputs_to_chatgpt_models).',
  `model` TEXT NOT NULL,
  `frequency_penalty` DECIMAL(20, 9) DEFAULT '0' COMMENT 'Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model&#39;s likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) ',
  `logit_bias` JSON DEFAULT NULL COMMENT 'Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. ',
  `logprobs` TINYINT(1) DEFAULT false COMMENT 'Whether to return log probabilities of the output tokens or not. If true, returns the log probabilities of each output token returned in the &#x60;content&#x60; of &#x60;message&#x60;.',
  `top_logprobs` TINYINT UNSIGNED DEFAULT NULL COMMENT 'An integer between 0 and 20 specifying the number of most likely tokens to return at each token position, each with an associated log probability. &#x60;logprobs&#x60; must be set to &#x60;true&#x60; if this parameter is used.',
  `max_tokens` INT DEFAULT NULL COMMENT 'The maximum number of [tokens](/tokenizer) that can be generated in the chat completion.  The total length of input tokens and generated tokens is limited by the model&#39;s context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. ',
  `n` TINYINT UNSIGNED DEFAULT 1 COMMENT 'How many chat completion choices to generate for each input message. Note that you will be charged based on the number of generated tokens across all of the choices. Keep &#x60;n&#x60; as &#x60;1&#x60; to minimize costs.',
  `presence_penalty` DECIMAL(20, 9) DEFAULT '0' COMMENT 'Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model&#39;s likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) ',
  `response_format` TEXT DEFAULT NULL,
  `seed` BIGINT DEFAULT NULL COMMENT 'This feature is in Beta. If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same &#x60;seed&#x60; and parameters should return the same result. Determinism is not guaranteed, and you should refer to the &#x60;system_fingerprint&#x60; response parameter to monitor changes in the backend. ',
  `stop` TEXT DEFAULT NULL,
  `stream` TINYINT(1) DEFAULT false COMMENT 'If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a &#x60;data: [DONE]&#x60; message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). ',
  `temperature` DECIMAL(20, 9) UNSIGNED DEFAULT '1' COMMENT 'What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both. ',
  `top_p` DECIMAL(20, 9) UNSIGNED DEFAULT '1' COMMENT 'An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both. ',
  `tools` JSON DEFAULT NULL COMMENT 'A list of tools the model may call. Currently, only functions are supported as a tool. Use this to provide a list of functions the model may generate JSON inputs for. A max of 128 functions are supported. ',
  `tool_choice` TEXT DEFAULT NULL,
  `user` TEXT DEFAULT NULL COMMENT 'A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ',
  `function_call` TEXT DEFAULT NULL,
  `functions` JSON DEFAULT NULL COMMENT 'Deprecated in favor of &#x60;tools&#x60;.  A list of functions the model may generate JSON inputs for. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateChatCompletionRequest_function_call` generated from model 'CreateChatCompletionRequestUnderscorefunctionUnderscorecall'
-- Deprecated in favor of &#x60;tool_choice&#x60;.  Controls which (if any) function is called by the model. &#x60;none&#x60; means the model will not call a function and instead generates a message. &#x60;auto&#x60; means the model can pick between generating a message or calling a function. Specifying a particular function via &#x60;{\&quot;name\&quot;: \&quot;my_function\&quot;}&#x60; forces the model to call that function.  &#x60;none&#x60; is the default when no functions are present. &#x60;auto&#x60; is the default if functions are present. 
--

CREATE TABLE IF NOT EXISTS `CreateChatCompletionRequest_function_call` (
  `name` TEXT NOT NULL COMMENT 'The name of the function to call.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Deprecated in favor of &#x60;tool_choice&#x60;.  Controls which (if any) function is called by the model. &#x60;none&#x60; means the model will not call a function and instead generates a message. &#x60;auto&#x60; means the model can pick between generating a message or calling a function. Specifying a particular function via &#x60;{\&quot;name\&quot;: \&quot;my_function\&quot;}&#x60; forces the model to call that function.  &#x60;none&#x60; is the default when no functions are present. &#x60;auto&#x60; is the default if functions are present. ';

--
-- Table structure for table `CreateChatCompletionRequest_response_format` generated from model 'CreateChatCompletionRequestUnderscoreresponseUnderscoreformat'
-- An object specifying the format that the model must output. Compatible with [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than &#x60;gpt-3.5-turbo-1106&#x60;.  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_object\&quot; }&#x60; enables JSON mode, which guarantees the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \&quot;stuck\&quot; request. Also note that the message content may be partially cut off if &#x60;finish_reason&#x3D;\&quot;length\&quot;&#x60;, which indicates the generation exceeded &#x60;max_tokens&#x60; or the conversation exceeded the max context length. 
--

CREATE TABLE IF NOT EXISTS `CreateChatCompletionRequest_response_format` (
  `type` ENUM('text', 'json_object') DEFAULT 'text' COMMENT 'Must be one of &#x60;text&#x60; or &#x60;json_object&#x60;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An object specifying the format that the model must output. Compatible with [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than &#x60;gpt-3.5-turbo-1106&#x60;.  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_object\&quot; }&#x60; enables JSON mode, which guarantees the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \&quot;stuck\&quot; request. Also note that the message content may be partially cut off if &#x60;finish_reason&#x3D;\&quot;length\&quot;&#x60;, which indicates the generation exceeded &#x60;max_tokens&#x60; or the conversation exceeded the max context length. ';

--
-- Table structure for table `CreateChatCompletionResponse` generated from model 'CreateChatCompletionResponse'
-- Represents a chat completion response returned by model, based on the provided input.
--

CREATE TABLE IF NOT EXISTS `CreateChatCompletionResponse` (
  `id` TEXT NOT NULL COMMENT 'A unique identifier for the chat completion.',
  `choices` JSON NOT NULL COMMENT 'A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1.',
  `created` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) of when the chat completion was created.',
  `model` TEXT NOT NULL COMMENT 'The model used for the chat completion.',
  `system_fingerprint` TEXT DEFAULT NULL COMMENT 'This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. ',
  `object` ENUM('chat.completion') NOT NULL COMMENT 'The object type, which is always &#x60;chat.completion&#x60;.',
  `usage` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Represents a chat completion response returned by model, based on the provided input.';

--
-- Table structure for table `CreateChatCompletionResponse_choices_inner` generated from model 'CreateChatCompletionResponseUnderscorechoicesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `CreateChatCompletionResponse_choices_inner` (
  `finish_reason` ENUM('stop', 'length', 'tool_calls', 'content_filter', 'function_call') NOT NULL COMMENT 'The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, &#x60;tool_calls&#x60; if the model called a tool, or &#x60;function_call&#x60; (deprecated) if the model called a function. ',
  `index` INT NOT NULL COMMENT 'The index of the choice in the list of choices.',
  `message` TEXT NOT NULL,
  `logprobs` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateChatCompletionResponse_choices_inner_logprobs` generated from model 'CreateChatCompletionResponseUnderscorechoicesUnderscoreinnerUnderscorelogprobs'
-- Log probability information for the choice.
--

CREATE TABLE IF NOT EXISTS `CreateChatCompletionResponse_choices_inner_logprobs` (
  `content` JSON NOT NULL COMMENT 'A list of message content tokens with log probability information.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Log probability information for the choice.';

--
-- Table structure for table `CreateChatCompletionStreamResponse` generated from model 'CreateChatCompletionStreamResponse'
-- Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
--

CREATE TABLE IF NOT EXISTS `CreateChatCompletionStreamResponse` (
  `id` TEXT NOT NULL COMMENT 'A unique identifier for the chat completion. Each chunk has the same ID.',
  `choices` JSON NOT NULL COMMENT 'A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1.',
  `created` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.',
  `model` TEXT NOT NULL COMMENT 'The model to generate the completion.',
  `system_fingerprint` TEXT DEFAULT NULL COMMENT 'This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. ',
  `object` ENUM('chat.completion.chunk') NOT NULL COMMENT 'The object type, which is always &#x60;chat.completion.chunk&#x60;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Represents a streamed chunk of a chat completion response returned by model, based on the provided input.';

--
-- Table structure for table `CreateChatCompletionStreamResponse_choices_inner` generated from model 'CreateChatCompletionStreamResponseUnderscorechoicesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `CreateChatCompletionStreamResponse_choices_inner` (
  `delta` TEXT NOT NULL,
  `logprobs` TEXT DEFAULT NULL,
  `finish_reason` ENUM('stop', 'length', 'tool_calls', 'content_filter', 'function_call') NOT NULL COMMENT 'The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, &#x60;tool_calls&#x60; if the model called a tool, or &#x60;function_call&#x60; (deprecated) if the model called a function. ',
  `index` INT NOT NULL COMMENT 'The index of the choice in the list of choices.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateCompletionRequest` generated from model 'CreateCompletionRequest'
--

CREATE TABLE IF NOT EXISTS `CreateCompletionRequest` (
  `model` TEXT NOT NULL,
  `prompt` TEXT NOT NULL,
  `best_of` TINYINT UNSIGNED DEFAULT 1 COMMENT 'Generates &#x60;best_of&#x60; completions server-side and returns the \&quot;best\&quot; (the one with the highest log probability per token). Results cannot be streamed.  When used with &#x60;n&#x60;, &#x60;best_of&#x60; controls the number of candidate completions and &#x60;n&#x60; specifies how many to return – &#x60;best_of&#x60; must be greater than &#x60;n&#x60;.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for &#x60;max_tokens&#x60; and &#x60;stop&#x60;. ',
  `echo` TINYINT(1) DEFAULT false COMMENT 'Echo back the prompt in addition to the completion ',
  `frequency_penalty` DECIMAL(20, 9) DEFAULT '0' COMMENT 'Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model&#39;s likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) ',
  `logit_bias` JSON DEFAULT NULL COMMENT 'Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view&#x3D;bpe) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass &#x60;{\&quot;50256\&quot;: -100}&#x60; to prevent the &lt;|endoftext|&gt; token from being generated. ',
  `logprobs` TINYINT UNSIGNED DEFAULT NULL COMMENT 'Include the log probabilities on the &#x60;logprobs&#x60; most likely output tokens, as well the chosen tokens. For example, if &#x60;logprobs&#x60; is 5, the API will return a list of the 5 most likely tokens. The API will always return the &#x60;logprob&#x60; of the sampled token, so there may be up to &#x60;logprobs+1&#x60; elements in the response.  The maximum value for &#x60;logprobs&#x60; is 5. ',
  `max_tokens` INT UNSIGNED DEFAULT 16 COMMENT 'The maximum number of [tokens](/tokenizer) that can be generated in the completion.  The token count of your prompt plus &#x60;max_tokens&#x60; cannot exceed the model&#39;s context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. ',
  `n` TINYINT UNSIGNED DEFAULT 1 COMMENT 'How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for &#x60;max_tokens&#x60; and &#x60;stop&#x60;. ',
  `presence_penalty` DECIMAL(20, 9) DEFAULT '0' COMMENT 'Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model&#39;s likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) ',
  `seed` BIGINT DEFAULT NULL COMMENT 'If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same &#x60;seed&#x60; and parameters should return the same result.  Determinism is not guaranteed, and you should refer to the &#x60;system_fingerprint&#x60; response parameter to monitor changes in the backend. ',
  `stop` TEXT DEFAULT NULL,
  `stream` TINYINT(1) DEFAULT false COMMENT 'Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a &#x60;data: [DONE]&#x60; message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). ',
  `suffix` TEXT DEFAULT NULL COMMENT 'The suffix that comes after a completion of inserted text.  This parameter is only supported for &#x60;gpt-3.5-turbo-instruct&#x60;. ',
  `temperature` DECIMAL(20, 9) UNSIGNED DEFAULT '1' COMMENT 'What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both. ',
  `top_p` DECIMAL(20, 9) UNSIGNED DEFAULT '1' COMMENT 'An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both. ',
  `user` TEXT DEFAULT NULL COMMENT 'A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateCompletionResponse` generated from model 'CreateCompletionResponse'
-- Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 
--

CREATE TABLE IF NOT EXISTS `CreateCompletionResponse` (
  `id` TEXT NOT NULL COMMENT 'A unique identifier for the completion.',
  `choices` JSON NOT NULL COMMENT 'The list of completion choices the model generated for the input prompt.',
  `created` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) of when the completion was created.',
  `model` TEXT NOT NULL COMMENT 'The model used for completion.',
  `system_fingerprint` TEXT DEFAULT NULL COMMENT 'This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. ',
  `object` ENUM('text_completion') NOT NULL COMMENT 'The object type, which is always \&quot;text_completion\&quot;',
  `usage` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). ';

--
-- Table structure for table `CreateCompletionResponse_choices_inner` generated from model 'CreateCompletionResponseUnderscorechoicesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `CreateCompletionResponse_choices_inner` (
  `finish_reason` ENUM('stop', 'length', 'content_filter') NOT NULL COMMENT 'The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, or &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters. ',
  `index` INT NOT NULL,
  `logprobs` TEXT NOT NULL,
  `text` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateCompletionResponse_choices_inner_logprobs` generated from model 'CreateCompletionResponseUnderscorechoicesUnderscoreinnerUnderscorelogprobs'
--

CREATE TABLE IF NOT EXISTS `CreateCompletionResponse_choices_inner_logprobs` (
  `text_offset` JSON DEFAULT NULL,
  `token_logprobs` JSON DEFAULT NULL,
  `tokens` JSON DEFAULT NULL,
  `top_logprobs` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateEmbeddingRequest` generated from model 'CreateEmbeddingRequest'
--

CREATE TABLE IF NOT EXISTS `CreateEmbeddingRequest` (
  `input` TEXT NOT NULL,
  `model` TEXT NOT NULL,
  `encoding_format` ENUM('float', 'base64') DEFAULT 'float' COMMENT 'The format to return the embeddings in. Can be either &#x60;float&#x60; or [&#x60;base64&#x60;](https://pypi.org/project/pybase64/).',
  `dimensions` INT UNSIGNED DEFAULT NULL COMMENT 'The number of dimensions the resulting output embeddings should have. Only supported in &#x60;text-embedding-3&#x60; and later models. ',
  `user` TEXT DEFAULT NULL COMMENT 'A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateEmbeddingResponse` generated from model 'CreateEmbeddingResponse'
--

CREATE TABLE IF NOT EXISTS `CreateEmbeddingResponse` (
  `data` JSON NOT NULL COMMENT 'The list of embeddings generated by the model.',
  `model` TEXT NOT NULL COMMENT 'The name of the model used to generate the embedding.',
  `object` ENUM('list') NOT NULL COMMENT 'The object type, which is always \&quot;list\&quot;.',
  `usage` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateEmbeddingResponse_usage` generated from model 'CreateEmbeddingResponseUnderscoreusage'
-- The usage information for the request.
--

CREATE TABLE IF NOT EXISTS `CreateEmbeddingResponse_usage` (
  `prompt_tokens` INT NOT NULL COMMENT 'The number of tokens used by the prompt.',
  `total_tokens` INT NOT NULL COMMENT 'The total number of tokens used by the request.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The usage information for the request.';

--
-- Table structure for table `CreateFineTuningJobRequest` generated from model 'CreateFineTuningJobRequest'
--

CREATE TABLE IF NOT EXISTS `CreateFineTuningJobRequest` (
  `model` TEXT NOT NULL,
  `training_file` TEXT NOT NULL COMMENT 'The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. ',
  `hyperparameters` TEXT DEFAULT NULL,
  `suffix` VARCHAR(40) DEFAULT NULL COMMENT 'A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a &#x60;suffix&#x60; of \&quot;custom-model-name\&quot; would produce a model name like &#x60;ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel&#x60;. ',
  `validation_file` TEXT DEFAULT NULL COMMENT 'The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. ',
  `integrations` JSON DEFAULT NULL COMMENT 'A list of integrations to enable for your fine-tuning job.',
  `seed` INT UNSIGNED DEFAULT NULL COMMENT 'The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateFineTuningJobRequest_hyperparameters` generated from model 'CreateFineTuningJobRequestUnderscorehyperparameters'
-- The hyperparameters used for the fine-tuning job.
--

CREATE TABLE IF NOT EXISTS `CreateFineTuningJobRequest_hyperparameters` (
  `batch_size` TEXT DEFAULT NULL,
  `learning_rate_multiplier` TEXT DEFAULT NULL,
  `n_epochs` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The hyperparameters used for the fine-tuning job.';

--
-- Table structure for table `CreateFineTuningJobRequest_integrations_inner` generated from model 'CreateFineTuningJobRequestUnderscoreintegrationsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `CreateFineTuningJobRequest_integrations_inner` (
  `type` TEXT NOT NULL,
  `wandb` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateFineTuningJobRequest_integrations_inner_wandb` generated from model 'CreateFineTuningJobRequestUnderscoreintegrationsUnderscoreinnerUnderscorewandb'
-- The settings for your integration with Weights and Biases. This payload specifies the project that metrics will be sent to. Optionally, you can set an explicit display name for your run, add tags to your run, and set a default entity (team, username, etc) to be associated with your run. 
--

CREATE TABLE IF NOT EXISTS `CreateFineTuningJobRequest_integrations_inner_wandb` (
  `project` TEXT NOT NULL COMMENT 'The name of the project that the new run will be created under. ',
  `name` TEXT DEFAULT NULL COMMENT 'A display name to set for the run. If not set, we will use the Job ID as the name. ',
  `entity` TEXT DEFAULT NULL COMMENT 'The entity to use for the run. This allows you to set the team or username of the WandB user that you would like associated with the run. If not set, the default entity for the registered WandB API key is used. ',
  `tags` JSON DEFAULT NULL COMMENT 'A list of tags to be attached to the newly created run. These tags are passed through directly to WandB. Some default tags are generated by OpenAI: \&quot;openai/finetune\&quot;, \&quot;openai/{base-model}\&quot;, \&quot;openai/{ftjob-abcdef}\&quot;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The settings for your integration with Weights and Biases. This payload specifies the project that metrics will be sent to. Optionally, you can set an explicit display name for your run, add tags to your run, and set a default entity (team, username, etc) to be associated with your run. ';

--
-- Table structure for table `CreateImageRequest` generated from model 'CreateImageRequest'
--

CREATE TABLE IF NOT EXISTS `CreateImageRequest` (
  `prompt` TEXT NOT NULL COMMENT 'A text description of the desired image(s). The maximum length is 1000 characters for &#x60;dall-e-2&#x60; and 4000 characters for &#x60;dall-e-3&#x60;.',
  `model` TEXT DEFAULT NULL,
  `n` TINYINT UNSIGNED DEFAULT 1 COMMENT 'The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported.',
  `quality` ENUM('standard', 'hd') DEFAULT 'standard' COMMENT 'The quality of the image that will be generated. &#x60;hd&#x60; creates images with finer details and greater consistency across the image. This param is only supported for &#x60;dall-e-3&#x60;.',
  `response_format` ENUM('url', 'b64_json') DEFAULT 'url' COMMENT 'The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.',
  `size` ENUM('256x256', '512x512', '1024x1024', '1792x1024', '1024x1792') DEFAULT '1024x1024' COMMENT 'The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60; for &#x60;dall-e-2&#x60;. Must be one of &#x60;1024x1024&#x60;, &#x60;1792x1024&#x60;, or &#x60;1024x1792&#x60; for &#x60;dall-e-3&#x60; models.',
  `style` ENUM('vivid', 'natural') DEFAULT 'vivid' COMMENT 'The style of the generated images. Must be one of &#x60;vivid&#x60; or &#x60;natural&#x60;. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for &#x60;dall-e-3&#x60;.',
  `user` TEXT DEFAULT NULL COMMENT 'A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateMessageRequest` generated from model 'CreateMessageRequest'
--

CREATE TABLE IF NOT EXISTS `CreateMessageRequest` (
  `role` ENUM('user', 'assistant') NOT NULL COMMENT 'The role of the entity that is creating the message. Allowed values include: - &#x60;user&#x60;: Indicates the message is sent by an actual user and should be used in most cases to represent user-generated messages. - &#x60;assistant&#x60;: Indicates the message is generated by the assistant. Use this value to insert messages from the assistant into the conversation. ',
  `content` MEDIUMTEXT NOT NULL COMMENT 'The content of the message.',
  `file_ids` JSON COMMENT 'A list of [File](/docs/api-reference/files) IDs that the message should use. There can be a maximum of 10 files attached to a message. Useful for tools like &#x60;retrieval&#x60; and &#x60;code_interpreter&#x60; that can access and use files.',
  `metadata` JSON DEFAULT NULL COMMENT 'Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateModerationRequest` generated from model 'CreateModerationRequest'
--

CREATE TABLE IF NOT EXISTS `CreateModerationRequest` (
  `input` TEXT NOT NULL,
  `model` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateModerationResponse` generated from model 'CreateModerationResponse'
-- Represents if a given text input is potentially harmful.
--

CREATE TABLE IF NOT EXISTS `CreateModerationResponse` (
  `id` TEXT NOT NULL COMMENT 'The unique identifier for the moderation request.',
  `model` TEXT NOT NULL COMMENT 'The model used to generate the moderation results.',
  `results` JSON NOT NULL COMMENT 'A list of moderation objects.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Represents if a given text input is potentially harmful.';

--
-- Table structure for table `CreateModerationResponse_results_inner` generated from model 'CreateModerationResponseUnderscoreresultsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `CreateModerationResponse_results_inner` (
  `flagged` TINYINT(1) NOT NULL COMMENT 'Whether any of the below categories are flagged.',
  `categories` TEXT NOT NULL,
  `category_scores` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateModerationResponse_results_inner_categories` generated from model 'CreateModerationResponseUnderscoreresultsUnderscoreinnerUnderscorecategories'
-- A list of the categories, and whether they are flagged or not.
--

CREATE TABLE IF NOT EXISTS `CreateModerationResponse_results_inner_categories` (
  `hate` TINYINT(1) NOT NULL COMMENT 'Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.',
  `hate/threatening` TINYINT(1) NOT NULL COMMENT 'Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.',
  `harassment` TINYINT(1) NOT NULL COMMENT 'Content that expresses, incites, or promotes harassing language towards any target.',
  `harassment/threatening` TINYINT(1) NOT NULL COMMENT 'Harassment content that also includes violence or serious harm towards any target.',
  `self-harm` TINYINT(1) NOT NULL COMMENT 'Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.',
  `self-harm/intent` TINYINT(1) NOT NULL COMMENT 'Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.',
  `self-harm/instructions` TINYINT(1) NOT NULL COMMENT 'Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.',
  `sexual` TINYINT(1) NOT NULL COMMENT 'Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).',
  `sexual/minors` TINYINT(1) NOT NULL COMMENT 'Sexual content that includes an individual who is under 18 years old.',
  `violence` TINYINT(1) NOT NULL COMMENT 'Content that depicts death, violence, or physical injury.',
  `violence/graphic` TINYINT(1) NOT NULL COMMENT 'Content that depicts death, violence, or physical injury in graphic detail.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A list of the categories, and whether they are flagged or not.';

--
-- Table structure for table `CreateModerationResponse_results_inner_category_scores` generated from model 'CreateModerationResponseUnderscoreresultsUnderscoreinnerUnderscorecategoryUnderscorescores'
-- A list of the categories along with their scores as predicted by model.
--

CREATE TABLE IF NOT EXISTS `CreateModerationResponse_results_inner_category_scores` (
  `hate` DECIMAL(20, 9) NOT NULL COMMENT 'The score for the category &#39;hate&#39;.',
  `hate/threatening` DECIMAL(20, 9) NOT NULL COMMENT 'The score for the category &#39;hate/threatening&#39;.',
  `harassment` DECIMAL(20, 9) NOT NULL COMMENT 'The score for the category &#39;harassment&#39;.',
  `harassment/threatening` DECIMAL(20, 9) NOT NULL COMMENT 'The score for the category &#39;harassment/threatening&#39;.',
  `self-harm` DECIMAL(20, 9) NOT NULL COMMENT 'The score for the category &#39;self-harm&#39;.',
  `self-harm/intent` DECIMAL(20, 9) NOT NULL COMMENT 'The score for the category &#39;self-harm/intent&#39;.',
  `self-harm/instructions` DECIMAL(20, 9) NOT NULL COMMENT 'The score for the category &#39;self-harm/instructions&#39;.',
  `sexual` DECIMAL(20, 9) NOT NULL COMMENT 'The score for the category &#39;sexual&#39;.',
  `sexual/minors` DECIMAL(20, 9) NOT NULL COMMENT 'The score for the category &#39;sexual/minors&#39;.',
  `violence` DECIMAL(20, 9) NOT NULL COMMENT 'The score for the category &#39;violence&#39;.',
  `violence/graphic` DECIMAL(20, 9) NOT NULL COMMENT 'The score for the category &#39;violence/graphic&#39;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A list of the categories along with their scores as predicted by model.';

--
-- Table structure for table `CreateRunRequest` generated from model 'CreateRunRequest'
--

CREATE TABLE IF NOT EXISTS `CreateRunRequest` (
  `assistant_id` TEXT NOT NULL COMMENT 'The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.',
  `model` TEXT DEFAULT NULL,
  `instructions` TEXT DEFAULT NULL COMMENT 'Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.',
  `additional_instructions` TEXT DEFAULT NULL COMMENT 'Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.',
  `additional_messages` JSON DEFAULT NULL COMMENT 'Adds additional messages to the thread before creating the run.',
  `tools` JSON DEFAULT NULL COMMENT 'Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.',
  `metadata` JSON DEFAULT NULL COMMENT 'Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ',
  `temperature` DECIMAL(20, 9) UNSIGNED DEFAULT '1' COMMENT 'What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. ',
  `stream` TINYINT(1) DEFAULT NULL COMMENT 'If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message. ',
  `max_prompt_tokens` INT UNSIGNED DEFAULT NULL COMMENT 'The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status &#x60;complete&#x60;. See &#x60;incomplete_details&#x60; for more info. ',
  `max_completion_tokens` INT UNSIGNED DEFAULT NULL COMMENT 'The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status &#x60;complete&#x60;. See &#x60;incomplete_details&#x60; for more info. ',
  `truncation_strategy` TEXT DEFAULT NULL,
  `tool_choice` TEXT DEFAULT NULL,
  `response_format` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateSpeechRequest` generated from model 'CreateSpeechRequest'
--

CREATE TABLE IF NOT EXISTS `CreateSpeechRequest` (
  `model` TEXT NOT NULL,
  `input` TEXT NOT NULL COMMENT 'The text to generate audio for. The maximum length is 4096 characters.',
  `voice` ENUM('alloy', 'echo', 'fable', 'onyx', 'nova', 'shimmer') NOT NULL COMMENT 'The voice to use when generating the audio. Supported voices are &#x60;alloy&#x60;, &#x60;echo&#x60;, &#x60;fable&#x60;, &#x60;onyx&#x60;, &#x60;nova&#x60;, and &#x60;shimmer&#x60;. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).',
  `response_format` ENUM('mp3', 'opus', 'aac', 'flac', 'wav', 'pcm') DEFAULT 'mp3' COMMENT 'The format to audio in. Supported formats are &#x60;mp3&#x60;, &#x60;opus&#x60;, &#x60;aac&#x60;, &#x60;flac&#x60;, &#x60;wav&#x60;, and &#x60;pcm&#x60;.',
  `speed` DECIMAL(20, 9) UNSIGNED DEFAULT '1.0' COMMENT 'The speed of the generated audio. Select a value from &#x60;0.25&#x60; to &#x60;4.0&#x60;. &#x60;1.0&#x60; is the default.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateThreadAndRunRequest` generated from model 'CreateThreadAndRunRequest'
--

CREATE TABLE IF NOT EXISTS `CreateThreadAndRunRequest` (
  `assistant_id` TEXT NOT NULL COMMENT 'The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.',
  `thread` TEXT DEFAULT NULL,
  `model` TEXT DEFAULT NULL,
  `instructions` TEXT DEFAULT NULL COMMENT 'Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.',
  `tools` JSON DEFAULT NULL COMMENT 'Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.',
  `metadata` JSON DEFAULT NULL COMMENT 'Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ',
  `temperature` DECIMAL(20, 9) UNSIGNED DEFAULT '1' COMMENT 'What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. ',
  `stream` TINYINT(1) DEFAULT NULL COMMENT 'If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message. ',
  `max_prompt_tokens` INT UNSIGNED DEFAULT NULL COMMENT 'The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status &#x60;complete&#x60;. See &#x60;incomplete_details&#x60; for more info. ',
  `max_completion_tokens` INT UNSIGNED DEFAULT NULL COMMENT 'The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info. ',
  `truncation_strategy` TEXT DEFAULT NULL,
  `tool_choice` TEXT DEFAULT NULL,
  `response_format` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateThreadAndRunRequest_tools_inner` generated from model 'CreateThreadAndRunRequestUnderscoretoolsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `CreateThreadAndRunRequest_tools_inner` (
  `type` ENUM('code_interpreter', 'retrieval', 'function') NOT NULL COMMENT 'The type of tool being defined: &#x60;code_interpreter&#x60;',
  `function` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateThreadRequest` generated from model 'CreateThreadRequest'
--

CREATE TABLE IF NOT EXISTS `CreateThreadRequest` (
  `messages` JSON DEFAULT NULL COMMENT 'A list of [messages](/docs/api-reference/messages) to start the thread with.',
  `metadata` JSON DEFAULT NULL COMMENT 'Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `createTranscription_200_response` generated from model 'createTranscriptionUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `createTranscription_200_response` (
  `text` TEXT NOT NULL COMMENT 'The transcribed text.',
  `language` TEXT NOT NULL COMMENT 'The language of the input audio.',
  `duration` TEXT NOT NULL COMMENT 'The duration of the input audio.',
  `words` JSON DEFAULT NULL COMMENT 'Extracted words and their corresponding timestamps.',
  `segments` JSON DEFAULT NULL COMMENT 'Segments of the transcribed text and their corresponding details.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateTranscriptionResponseJson` generated from model 'CreateTranscriptionResponseJson'
-- Represents a transcription response returned by model, based on the provided input.
--

CREATE TABLE IF NOT EXISTS `CreateTranscriptionResponseJson` (
  `text` TEXT NOT NULL COMMENT 'The transcribed text.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Represents a transcription response returned by model, based on the provided input.';

--
-- Table structure for table `CreateTranscriptionResponseVerboseJson` generated from model 'CreateTranscriptionResponseVerboseJson'
-- Represents a verbose json transcription response returned by model, based on the provided input.
--

CREATE TABLE IF NOT EXISTS `CreateTranscriptionResponseVerboseJson` (
  `language` TEXT NOT NULL COMMENT 'The language of the input audio.',
  `duration` TEXT NOT NULL COMMENT 'The duration of the input audio.',
  `text` TEXT NOT NULL COMMENT 'The transcribed text.',
  `words` JSON DEFAULT NULL COMMENT 'Extracted words and their corresponding timestamps.',
  `segments` JSON DEFAULT NULL COMMENT 'Segments of the transcribed text and their corresponding details.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Represents a verbose json transcription response returned by model, based on the provided input.';

--
-- Table structure for table `createTranslation_200_response` generated from model 'createTranslationUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `createTranslation_200_response` (
  `text` TEXT NOT NULL COMMENT 'The translated text.',
  `language` TEXT NOT NULL COMMENT 'The language of the output translation (always &#x60;english&#x60;).',
  `duration` TEXT NOT NULL COMMENT 'The duration of the input audio.',
  `segments` JSON DEFAULT NULL COMMENT 'Segments of the translated text and their corresponding details.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateTranslationResponseJson` generated from model 'CreateTranslationResponseJson'
--

CREATE TABLE IF NOT EXISTS `CreateTranslationResponseJson` (
  `text` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateTranslationResponseVerboseJson` generated from model 'CreateTranslationResponseVerboseJson'
--

CREATE TABLE IF NOT EXISTS `CreateTranslationResponseVerboseJson` (
  `language` TEXT NOT NULL COMMENT 'The language of the output translation (always &#x60;english&#x60;).',
  `duration` TEXT NOT NULL COMMENT 'The duration of the input audio.',
  `text` TEXT NOT NULL COMMENT 'The translated text.',
  `segments` JSON DEFAULT NULL COMMENT 'Segments of the translated text and their corresponding details.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DeleteAssistantFileResponse` generated from model 'DeleteAssistantFileResponse'
-- Deletes the association between the assistant and the file, but does not delete the [File](/docs/api-reference/files) object itself.
--

CREATE TABLE IF NOT EXISTS `DeleteAssistantFileResponse` (
  `id` TEXT NOT NULL,
  `deleted` TINYINT(1) NOT NULL,
  `object` ENUM('assistant.file.deleted') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Deletes the association between the assistant and the file, but does not delete the [File](/docs/api-reference/files) object itself.';

--
-- Table structure for table `DeleteAssistantResponse` generated from model 'DeleteAssistantResponse'
--

CREATE TABLE IF NOT EXISTS `DeleteAssistantResponse` (
  `id` TEXT NOT NULL,
  `deleted` TINYINT(1) NOT NULL,
  `object` ENUM('assistant.deleted') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DeleteFileResponse` generated from model 'DeleteFileResponse'
--

CREATE TABLE IF NOT EXISTS `DeleteFileResponse` (
  `id` TEXT NOT NULL,
  `object` ENUM('file') NOT NULL,
  `deleted` TINYINT(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DeleteMessageResponse` generated from model 'DeleteMessageResponse'
--

CREATE TABLE IF NOT EXISTS `DeleteMessageResponse` (
  `id` TEXT NOT NULL,
  `deleted` TINYINT(1) NOT NULL,
  `object` ENUM('thread.message.deleted') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DeleteModelResponse` generated from model 'DeleteModelResponse'
--

CREATE TABLE IF NOT EXISTS `DeleteModelResponse` (
  `id` TEXT NOT NULL,
  `deleted` TINYINT(1) NOT NULL,
  `object` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DeleteThreadResponse` generated from model 'DeleteThreadResponse'
--

CREATE TABLE IF NOT EXISTS `DeleteThreadResponse` (
  `id` TEXT NOT NULL,
  `deleted` TINYINT(1) NOT NULL,
  `object` ENUM('thread.deleted') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DoneEvent` generated from model 'DoneEvent'
-- Occurs when a stream ends.
--

CREATE TABLE IF NOT EXISTS `DoneEvent` (
  `event` ENUM('done') NOT NULL,
  `data` ENUM('[DONE]') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Occurs when a stream ends.';

--
-- Table structure for table `Embedding` generated from model 'Embedding'
-- Represents an embedding vector returned by embedding endpoint. 
--

CREATE TABLE IF NOT EXISTS `Embedding` (
  `index` INT NOT NULL COMMENT 'The index of the embedding in the list of embeddings.',
  `embedding` JSON NOT NULL COMMENT 'The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). ',
  `object` ENUM('embedding') NOT NULL COMMENT 'The object type, which is always \&quot;embedding\&quot;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Represents an embedding vector returned by embedding endpoint. ';

--
-- Table structure for table `Error` generated from model 'Error'
--

CREATE TABLE IF NOT EXISTS `Error` (
  `code` TEXT NOT NULL,
  `message` TEXT NOT NULL,
  `param` TEXT NOT NULL,
  `type` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ErrorEvent` generated from model 'ErrorEvent'
-- Occurs when an [error](/docs/guides/error-codes/api-errors) occurs. This can happen due to an internal server error or a timeout.
--

CREATE TABLE IF NOT EXISTS `ErrorEvent` (
  `event` ENUM('error') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Occurs when an [error](/docs/guides/error-codes/api-errors) occurs. This can happen due to an internal server error or a timeout.';

--
-- Table structure for table `ErrorResponse` generated from model 'ErrorResponse'
--

CREATE TABLE IF NOT EXISTS `ErrorResponse` (
  `error` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `FineTuningIntegration` generated from model 'FineTuningIntegration'
--

CREATE TABLE IF NOT EXISTS `FineTuningIntegration` (
  `type` ENUM('wandb') NOT NULL COMMENT 'The type of the integration being enabled for the fine-tuning job',
  `wandb` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `FineTuningJob` generated from model 'FineTuningJob'
-- The &#x60;fine_tuning.job&#x60; object represents a fine-tuning job that has been created through the API. 
--

CREATE TABLE IF NOT EXISTS `FineTuningJob` (
  `id` TEXT NOT NULL COMMENT 'The object identifier, which can be referenced in the API endpoints.',
  `created_at` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) for when the fine-tuning job was created.',
  `error` TEXT NOT NULL,
  `fine_tuned_model` TEXT NOT NULL COMMENT 'The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.',
  `finished_at` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.',
  `hyperparameters` TEXT NOT NULL,
  `model` TEXT NOT NULL COMMENT 'The base model that is being fine-tuned.',
  `object` ENUM('fine_tuning.job') NOT NULL COMMENT 'The object type, which is always \&quot;fine_tuning.job\&quot;.',
  `organization_id` TEXT NOT NULL COMMENT 'The organization that owns the fine-tuning job.',
  `result_files` JSON NOT NULL COMMENT 'The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).',
  `status` ENUM('validating_files', 'queued', 'running', 'succeeded', 'failed', 'cancelled') NOT NULL COMMENT 'The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;.',
  `trained_tokens` INT NOT NULL COMMENT 'The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.',
  `training_file` TEXT NOT NULL COMMENT 'The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).',
  `validation_file` TEXT NOT NULL COMMENT 'The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).',
  `integrations` JSON DEFAULT NULL COMMENT 'A list of integrations to enable for this fine-tuning job.',
  `seed` INT NOT NULL COMMENT 'The seed used for the fine-tuning job.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The &#x60;fine_tuning.job&#x60; object represents a fine-tuning job that has been created through the API. ';

--
-- Table structure for table `FineTuningJobCheckpoint` generated from model 'FineTuningJobCheckpoint'
-- The &#x60;fine_tuning.job.checkpoint&#x60; object represents a model checkpoint for a fine-tuning job that is ready to use. 
--

CREATE TABLE IF NOT EXISTS `FineTuningJobCheckpoint` (
  `id` TEXT NOT NULL COMMENT 'The checkpoint identifier, which can be referenced in the API endpoints.',
  `created_at` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) for when the checkpoint was created.',
  `fine_tuned_model_checkpoint` TEXT NOT NULL COMMENT 'The name of the fine-tuned checkpoint model that is created.',
  `step_number` INT NOT NULL COMMENT 'The step number that the checkpoint was created at.',
  `metrics` TEXT NOT NULL,
  `fine_tuning_job_id` TEXT NOT NULL COMMENT 'The name of the fine-tuning job that this checkpoint was created from.',
  `object` ENUM('fine_tuning.job.checkpoint') NOT NULL COMMENT 'The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The &#x60;fine_tuning.job.checkpoint&#x60; object represents a model checkpoint for a fine-tuning job that is ready to use. ';

--
-- Table structure for table `FineTuningJobCheckpoint_metrics` generated from model 'FineTuningJobCheckpointUnderscoremetrics'
-- Metrics at the step number during the fine-tuning job.
--

CREATE TABLE IF NOT EXISTS `FineTuningJobCheckpoint_metrics` (
  `step` DECIMAL(20, 9) DEFAULT NULL,
  `train_loss` DECIMAL(20, 9) DEFAULT NULL,
  `train_mean_token_accuracy` DECIMAL(20, 9) DEFAULT NULL,
  `valid_loss` DECIMAL(20, 9) DEFAULT NULL,
  `valid_mean_token_accuracy` DECIMAL(20, 9) DEFAULT NULL,
  `full_valid_loss` DECIMAL(20, 9) DEFAULT NULL,
  `full_valid_mean_token_accuracy` DECIMAL(20, 9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Metrics at the step number during the fine-tuning job.';

--
-- Table structure for table `FineTuningJob_error` generated from model 'FineTuningJobUnderscoreerror'
-- For fine-tuning jobs that have &#x60;failed&#x60;, this will contain more information on the cause of the failure.
--

CREATE TABLE IF NOT EXISTS `FineTuningJob_error` (
  `code` TEXT NOT NULL COMMENT 'A machine-readable error code.',
  `message` TEXT NOT NULL COMMENT 'A human-readable error message.',
  `param` TEXT NOT NULL COMMENT 'The parameter that was invalid, usually &#x60;training_file&#x60; or &#x60;validation_file&#x60;. This field will be null if the failure was not parameter-specific.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='For fine-tuning jobs that have &#x60;failed&#x60;, this will contain more information on the cause of the failure.';

--
-- Table structure for table `FineTuningJobEvent` generated from model 'FineTuningJobEvent'
-- Fine-tuning job event object
--

CREATE TABLE IF NOT EXISTS `FineTuningJobEvent` (
  `id` TEXT NOT NULL,
  `created_at` INT NOT NULL,
  `level` ENUM('info', 'warn', 'error') NOT NULL,
  `message` TEXT NOT NULL,
  `object` ENUM('fine_tuning.job.event') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Fine-tuning job event object';

--
-- Table structure for table `FineTuningJob_hyperparameters` generated from model 'FineTuningJobUnderscorehyperparameters'
-- The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
--

CREATE TABLE IF NOT EXISTS `FineTuningJob_hyperparameters` (
  `n_epochs` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.';

--
-- Table structure for table `FineTuningJob_integrations_inner` generated from model 'FineTuningJobUnderscoreintegrationsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `FineTuningJob_integrations_inner` (
  `type` ENUM('wandb') NOT NULL COMMENT 'The type of the integration being enabled for the fine-tuning job',
  `wandb` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `FunctionObject` generated from model 'FunctionObject'
--

CREATE TABLE IF NOT EXISTS `FunctionObject` (
  `description` TEXT DEFAULT NULL COMMENT 'A description of what the function does, used by the model to choose when and how to call the function.',
  `name` TEXT NOT NULL COMMENT 'The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.',
  `parameters` JSON DEFAULT NULL COMMENT 'The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/text-generation/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting &#x60;parameters&#x60; defines a function with an empty parameter list.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Image` generated from model 'Image'
-- Represents the url or the content of an image generated by the OpenAI API.
--

CREATE TABLE IF NOT EXISTS `Image` (
  `b64_json` TEXT DEFAULT NULL COMMENT 'The base64-encoded JSON of the generated image, if &#x60;response_format&#x60; is &#x60;b64_json&#x60;.',
  `url` TEXT DEFAULT NULL COMMENT 'The URL of the generated image, if &#x60;response_format&#x60; is &#x60;url&#x60; (default).',
  `revised_prompt` TEXT DEFAULT NULL COMMENT 'The prompt that was used to generate the image, if there was any revision to the prompt.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Represents the url or the content of an image generated by the OpenAI API.';

--
-- Table structure for table `ImagesResponse` generated from model 'ImagesResponse'
--

CREATE TABLE IF NOT EXISTS `ImagesResponse` (
  `created` INT NOT NULL,
  `data` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ListAssistantFilesResponse` generated from model 'ListAssistantFilesResponse'
--

CREATE TABLE IF NOT EXISTS `ListAssistantFilesResponse` (
  `object` TEXT NOT NULL,
  `data` JSON NOT NULL,
  `first_id` TEXT NOT NULL,
  `last_id` TEXT NOT NULL,
  `has_more` TINYINT(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ListAssistantsResponse` generated from model 'ListAssistantsResponse'
--

CREATE TABLE IF NOT EXISTS `ListAssistantsResponse` (
  `object` TEXT NOT NULL,
  `data` JSON NOT NULL,
  `first_id` TEXT NOT NULL,
  `last_id` TEXT NOT NULL,
  `has_more` TINYINT(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ListFilesResponse` generated from model 'ListFilesResponse'
--

CREATE TABLE IF NOT EXISTS `ListFilesResponse` (
  `data` JSON NOT NULL,
  `object` ENUM('list') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ListFineTuningJobCheckpointsResponse` generated from model 'ListFineTuningJobCheckpointsResponse'
--

CREATE TABLE IF NOT EXISTS `ListFineTuningJobCheckpointsResponse` (
  `data` JSON NOT NULL,
  `object` ENUM('list') NOT NULL,
  `first_id` TEXT DEFAULT NULL,
  `last_id` TEXT DEFAULT NULL,
  `has_more` TINYINT(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ListFineTuningJobEventsResponse` generated from model 'ListFineTuningJobEventsResponse'
--

CREATE TABLE IF NOT EXISTS `ListFineTuningJobEventsResponse` (
  `data` JSON NOT NULL,
  `object` ENUM('list') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ListMessageFilesResponse` generated from model 'ListMessageFilesResponse'
--

CREATE TABLE IF NOT EXISTS `ListMessageFilesResponse` (
  `object` TEXT NOT NULL,
  `data` JSON NOT NULL,
  `first_id` TEXT NOT NULL,
  `last_id` TEXT NOT NULL,
  `has_more` TINYINT(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ListMessagesResponse` generated from model 'ListMessagesResponse'
--

CREATE TABLE IF NOT EXISTS `ListMessagesResponse` (
  `object` TEXT NOT NULL,
  `data` JSON NOT NULL,
  `first_id` TEXT NOT NULL,
  `last_id` TEXT NOT NULL,
  `has_more` TINYINT(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ListModelsResponse` generated from model 'ListModelsResponse'
--

CREATE TABLE IF NOT EXISTS `ListModelsResponse` (
  `object` ENUM('list') NOT NULL,
  `data` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ListPaginatedFineTuningJobsResponse` generated from model 'ListPaginatedFineTuningJobsResponse'
--

CREATE TABLE IF NOT EXISTS `ListPaginatedFineTuningJobsResponse` (
  `data` JSON NOT NULL,
  `has_more` TINYINT(1) NOT NULL,
  `object` ENUM('list') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ListRunStepsResponse` generated from model 'ListRunStepsResponse'
--

CREATE TABLE IF NOT EXISTS `ListRunStepsResponse` (
  `object` TEXT NOT NULL,
  `data` JSON NOT NULL,
  `first_id` TEXT NOT NULL,
  `last_id` TEXT NOT NULL,
  `has_more` TINYINT(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ListRunsResponse` generated from model 'ListRunsResponse'
--

CREATE TABLE IF NOT EXISTS `ListRunsResponse` (
  `object` TEXT NOT NULL,
  `data` JSON NOT NULL,
  `first_id` TEXT NOT NULL,
  `last_id` TEXT NOT NULL,
  `has_more` TINYINT(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ListThreadsResponse` generated from model 'ListThreadsResponse'
--

CREATE TABLE IF NOT EXISTS `ListThreadsResponse` (
  `object` TEXT NOT NULL,
  `data` JSON NOT NULL,
  `first_id` TEXT NOT NULL,
  `last_id` TEXT NOT NULL,
  `has_more` TINYINT(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MessageContentImageFileObject` generated from model 'MessageContentImageFileObject'
-- References an image [File](/docs/api-reference/files) in the content of a message.
--

CREATE TABLE IF NOT EXISTS `MessageContentImageFileObject` (
  `type` ENUM('image_file') NOT NULL COMMENT 'Always &#x60;image_file&#x60;.',
  `image_file` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='References an image [File](/docs/api-reference/files) in the content of a message.';

--
-- Table structure for table `MessageContentImageFileObject_image_file` generated from model 'MessageContentImageFileObjectUnderscoreimageUnderscorefile'
--

CREATE TABLE IF NOT EXISTS `MessageContentImageFileObject_image_file` (
  `file_id` TEXT NOT NULL COMMENT 'The [File](/docs/api-reference/files) ID of the image in the message content.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MessageContentTextAnnotationsFileCitationObject` generated from model 'MessageContentTextAnnotationsFileCitationObject'
-- A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;retrieval\&quot; tool to search files.
--

CREATE TABLE IF NOT EXISTS `MessageContentTextAnnotationsFileCitationObject` (
  `type` ENUM('file_citation') NOT NULL COMMENT 'Always &#x60;file_citation&#x60;.',
  `text` TEXT NOT NULL COMMENT 'The text in the message content that needs to be replaced.',
  `file_citation` TEXT NOT NULL,
  `start_index` INT UNSIGNED NOT NULL,
  `end_index` INT UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;retrieval\&quot; tool to search files.';

--
-- Table structure for table `MessageContentTextAnnotationsFileCitationObject_file_citation` generated from model 'MessageContentTextAnnotationsFileCitationObjectUnderscorefileUnderscorecitation'
--

CREATE TABLE IF NOT EXISTS `MessageContentTextAnnotationsFileCitationObject_file_citation` (
  `file_id` TEXT NOT NULL COMMENT 'The ID of the specific File the citation is from.',
  `quote` TEXT NOT NULL COMMENT 'The specific quote in the file.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MessageContentTextAnnotationsFilePathObject` generated from model 'MessageContentTextAnnotationsFilePathObject'
-- A URL for the file that&#39;s generated when the assistant used the &#x60;code_interpreter&#x60; tool to generate a file.
--

CREATE TABLE IF NOT EXISTS `MessageContentTextAnnotationsFilePathObject` (
  `type` ENUM('file_path') NOT NULL COMMENT 'Always &#x60;file_path&#x60;.',
  `text` TEXT NOT NULL COMMENT 'The text in the message content that needs to be replaced.',
  `file_path` TEXT NOT NULL,
  `start_index` INT UNSIGNED NOT NULL,
  `end_index` INT UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A URL for the file that&#39;s generated when the assistant used the &#x60;code_interpreter&#x60; tool to generate a file.';

--
-- Table structure for table `MessageContentTextAnnotationsFilePathObject_file_path` generated from model 'MessageContentTextAnnotationsFilePathObjectUnderscorefileUnderscorepath'
--

CREATE TABLE IF NOT EXISTS `MessageContentTextAnnotationsFilePathObject_file_path` (
  `file_id` TEXT NOT NULL COMMENT 'The ID of the file that was generated.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MessageContentTextObject` generated from model 'MessageContentTextObject'
-- The text content that is part of a message.
--

CREATE TABLE IF NOT EXISTS `MessageContentTextObject` (
  `type` ENUM('text') NOT NULL COMMENT 'Always &#x60;text&#x60;.',
  `text` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The text content that is part of a message.';

--
-- Table structure for table `MessageContentTextObject_text` generated from model 'MessageContentTextObjectUnderscoretext'
--

CREATE TABLE IF NOT EXISTS `MessageContentTextObject_text` (
  `value` TEXT NOT NULL COMMENT 'The data that makes up the text.',
  `annotations` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MessageContentTextObject_text_annotations_inner` generated from model 'MessageContentTextObjectUnderscoretextUnderscoreannotationsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `MessageContentTextObject_text_annotations_inner` (
  `type` ENUM('file_citation', 'file_path') NOT NULL COMMENT 'Always &#x60;file_citation&#x60;.',
  `text` TEXT NOT NULL COMMENT 'The text in the message content that needs to be replaced.',
  `file_citation` TEXT NOT NULL,
  `start_index` INT UNSIGNED NOT NULL,
  `end_index` INT UNSIGNED NOT NULL,
  `file_path` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MessageDeltaContentImageFileObject` generated from model 'MessageDeltaContentImageFileObject'
-- References an image [File](/docs/api-reference/files) in the content of a message.
--

CREATE TABLE IF NOT EXISTS `MessageDeltaContentImageFileObject` (
  `index` INT NOT NULL COMMENT 'The index of the content part in the message.',
  `type` ENUM('image_file') NOT NULL COMMENT 'Always &#x60;image_file&#x60;.',
  `image_file` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='References an image [File](/docs/api-reference/files) in the content of a message.';

--
-- Table structure for table `MessageDeltaContentImageFileObject_image_file` generated from model 'MessageDeltaContentImageFileObjectUnderscoreimageUnderscorefile'
--

CREATE TABLE IF NOT EXISTS `MessageDeltaContentImageFileObject_image_file` (
  `file_id` TEXT DEFAULT NULL COMMENT 'The [File](/docs/api-reference/files) ID of the image in the message content.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MessageDeltaContentTextAnnotationsFileCitationObject` generated from model 'MessageDeltaContentTextAnnotationsFileCitationObject'
-- A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;retrieval\&quot; tool to search files.
--

CREATE TABLE IF NOT EXISTS `MessageDeltaContentTextAnnotationsFileCitationObject` (
  `index` INT NOT NULL COMMENT 'The index of the annotation in the text content part.',
  `type` ENUM('file_citation') NOT NULL COMMENT 'Always &#x60;file_citation&#x60;.',
  `text` TEXT DEFAULT NULL COMMENT 'The text in the message content that needs to be replaced.',
  `file_citation` TEXT DEFAULT NULL,
  `start_index` INT UNSIGNED DEFAULT NULL,
  `end_index` INT UNSIGNED DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;retrieval\&quot; tool to search files.';

--
-- Table structure for table `MessageDeltaContentTextAnnotationsFileCitationObject_file_citati` generated from model 'MessageDeltaContentTextAnnotationsFileCitationObjectUnderscorefileUnderscorecitation'
--

CREATE TABLE IF NOT EXISTS `MessageDeltaContentTextAnnotationsFileCitationObject_file_citati` (
  `file_id` TEXT DEFAULT NULL COMMENT 'The ID of the specific File the citation is from.',
  `quote` TEXT DEFAULT NULL COMMENT 'The specific quote in the file.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MessageDeltaContentTextAnnotationsFilePathObject` generated from model 'MessageDeltaContentTextAnnotationsFilePathObject'
-- A URL for the file that&#39;s generated when the assistant used the &#x60;code_interpreter&#x60; tool to generate a file.
--

CREATE TABLE IF NOT EXISTS `MessageDeltaContentTextAnnotationsFilePathObject` (
  `index` INT NOT NULL COMMENT 'The index of the annotation in the text content part.',
  `type` ENUM('file_path') NOT NULL COMMENT 'Always &#x60;file_path&#x60;.',
  `text` TEXT DEFAULT NULL COMMENT 'The text in the message content that needs to be replaced.',
  `file_path` TEXT DEFAULT NULL,
  `start_index` INT UNSIGNED DEFAULT NULL,
  `end_index` INT UNSIGNED DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A URL for the file that&#39;s generated when the assistant used the &#x60;code_interpreter&#x60; tool to generate a file.';

--
-- Table structure for table `MessageDeltaContentTextAnnotationsFilePathObject_file_path` generated from model 'MessageDeltaContentTextAnnotationsFilePathObjectUnderscorefileUnderscorepath'
--

CREATE TABLE IF NOT EXISTS `MessageDeltaContentTextAnnotationsFilePathObject_file_path` (
  `file_id` TEXT DEFAULT NULL COMMENT 'The ID of the file that was generated.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MessageDeltaContentTextObject` generated from model 'MessageDeltaContentTextObject'
-- The text content that is part of a message.
--

CREATE TABLE IF NOT EXISTS `MessageDeltaContentTextObject` (
  `index` INT NOT NULL COMMENT 'The index of the content part in the message.',
  `type` ENUM('text') NOT NULL COMMENT 'Always &#x60;text&#x60;.',
  `text` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The text content that is part of a message.';

--
-- Table structure for table `MessageDeltaContentTextObject_text` generated from model 'MessageDeltaContentTextObjectUnderscoretext'
--

CREATE TABLE IF NOT EXISTS `MessageDeltaContentTextObject_text` (
  `value` TEXT DEFAULT NULL COMMENT 'The data that makes up the text.',
  `annotations` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MessageDeltaContentTextObject_text_annotations_inner` generated from model 'MessageDeltaContentTextObjectUnderscoretextUnderscoreannotationsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `MessageDeltaContentTextObject_text_annotations_inner` (
  `index` INT NOT NULL COMMENT 'The index of the annotation in the text content part.',
  `type` ENUM('file_citation', 'file_path') NOT NULL COMMENT 'Always &#x60;file_citation&#x60;.',
  `text` TEXT DEFAULT NULL COMMENT 'The text in the message content that needs to be replaced.',
  `file_citation` TEXT DEFAULT NULL,
  `start_index` INT UNSIGNED DEFAULT NULL,
  `end_index` INT UNSIGNED DEFAULT NULL,
  `file_path` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MessageDeltaObject` generated from model 'MessageDeltaObject'
-- Represents a message delta i.e. any changed fields on a message during streaming. 
--

CREATE TABLE IF NOT EXISTS `MessageDeltaObject` (
  `id` TEXT NOT NULL COMMENT 'The identifier of the message, which can be referenced in API endpoints.',
  `object` ENUM('thread.message.delta') NOT NULL COMMENT 'The object type, which is always &#x60;thread.message.delta&#x60;.',
  `delta` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Represents a message delta i.e. any changed fields on a message during streaming. ';

--
-- Table structure for table `MessageDeltaObject_delta` generated from model 'MessageDeltaObjectUnderscoredelta'
-- The delta containing the fields that have changed on the Message.
--

CREATE TABLE IF NOT EXISTS `MessageDeltaObject_delta` (
  `role` ENUM('user', 'assistant') DEFAULT NULL COMMENT 'The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.',
  `content` JSON DEFAULT NULL COMMENT 'The content of the message in array of text and/or images.',
  `file_ids` JSON COMMENT 'A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The delta containing the fields that have changed on the Message.';

--
-- Table structure for table `MessageDeltaObject_delta_content_inner` generated from model 'MessageDeltaObjectUnderscoredeltaUnderscorecontentUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `MessageDeltaObject_delta_content_inner` (
  `index` INT NOT NULL COMMENT 'The index of the content part in the message.',
  `type` ENUM('image_file', 'text') NOT NULL COMMENT 'Always &#x60;image_file&#x60;.',
  `image_file` TEXT DEFAULT NULL,
  `text` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MessageFileObject` generated from model 'MessageFileObject'
-- A list of files attached to a &#x60;message&#x60;.
--

CREATE TABLE IF NOT EXISTS `MessageFileObject` (
  `id` TEXT NOT NULL COMMENT 'The identifier, which can be referenced in API endpoints.',
  `object` ENUM('thread.message.file') NOT NULL COMMENT 'The object type, which is always &#x60;thread.message.file&#x60;.',
  `created_at` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) for when the message file was created.',
  `message_id` TEXT NOT NULL COMMENT 'The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A list of files attached to a &#x60;message&#x60;.';

--
-- Table structure for table `MessageObject` generated from model 'MessageObject'
-- Represents a message within a [thread](/docs/api-reference/threads).
--

CREATE TABLE IF NOT EXISTS `MessageObject` (
  `id` TEXT NOT NULL COMMENT 'The identifier, which can be referenced in API endpoints.',
  `object` ENUM('thread.message') NOT NULL COMMENT 'The object type, which is always &#x60;thread.message&#x60;.',
  `created_at` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) for when the message was created.',
  `thread_id` TEXT NOT NULL COMMENT 'The [thread](/docs/api-reference/threads) ID that this message belongs to.',
  `status` ENUM('in_progress', 'incomplete', 'completed') NOT NULL COMMENT 'The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;.',
  `incomplete_details` TEXT NOT NULL,
  `completed_at` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) for when the message was completed.',
  `incomplete_at` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) for when the message was marked as incomplete.',
  `role` ENUM('user', 'assistant') NOT NULL COMMENT 'The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.',
  `content` JSON NOT NULL COMMENT 'The content of the message in array of text and/or images.',
  `assistant_id` TEXT NOT NULL COMMENT 'If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.',
  `run_id` TEXT NOT NULL COMMENT 'The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints.',
  `file_ids` JSON NOT NULL COMMENT 'A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.',
  `metadata` JSON NOT NULL COMMENT 'Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Represents a message within a [thread](/docs/api-reference/threads).';

--
-- Table structure for table `MessageObject_content_inner` generated from model 'MessageObjectUnderscorecontentUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `MessageObject_content_inner` (
  `type` ENUM('image_file', 'text') NOT NULL COMMENT 'Always &#x60;image_file&#x60;.',
  `image_file` TEXT NOT NULL,
  `text` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MessageObject_incomplete_details` generated from model 'MessageObjectUnderscoreincompleteUnderscoredetails'
-- On an incomplete message, details about why the message is incomplete.
--

CREATE TABLE IF NOT EXISTS `MessageObject_incomplete_details` (
  `reason` ENUM('content_filter', 'max_tokens', 'run_cancelled', 'run_expired', 'run_failed') NOT NULL COMMENT 'The reason the message is incomplete.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='On an incomplete message, details about why the message is incomplete.';

--
-- Table structure for table `MessageStreamEvent` generated from model 'MessageStreamEvent'
--

CREATE TABLE IF NOT EXISTS `MessageStreamEvent` (
  `event` ENUM('thread.message.incomplete') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MessageStreamEvent_oneOf` generated from model 'MessageStreamEventUnderscoreoneOf'
-- Occurs when a [message](/docs/api-reference/messages/object) is created.
--

CREATE TABLE IF NOT EXISTS `MessageStreamEvent_oneOf` (
  `event` ENUM('thread.message.created') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Occurs when a [message](/docs/api-reference/messages/object) is created.';

--
-- Table structure for table `MessageStreamEvent_oneOf_1` generated from model 'MessageStreamEventUnderscoreoneOfUnderscore1'
-- Occurs when a [message](/docs/api-reference/messages/object) moves to an &#x60;in_progress&#x60; state.
--

CREATE TABLE IF NOT EXISTS `MessageStreamEvent_oneOf_1` (
  `event` ENUM('thread.message.in_progress') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Occurs when a [message](/docs/api-reference/messages/object) moves to an &#x60;in_progress&#x60; state.';

--
-- Table structure for table `MessageStreamEvent_oneOf_2` generated from model 'MessageStreamEventUnderscoreoneOfUnderscore2'
-- Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
--

CREATE TABLE IF NOT EXISTS `MessageStreamEvent_oneOf_2` (
  `event` ENUM('thread.message.delta') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.';

--
-- Table structure for table `MessageStreamEvent_oneOf_3` generated from model 'MessageStreamEventUnderscoreoneOfUnderscore3'
-- Occurs when a [message](/docs/api-reference/messages/object) is completed.
--

CREATE TABLE IF NOT EXISTS `MessageStreamEvent_oneOf_3` (
  `event` ENUM('thread.message.completed') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Occurs when a [message](/docs/api-reference/messages/object) is completed.';

--
-- Table structure for table `MessageStreamEvent_oneOf_4` generated from model 'MessageStreamEventUnderscoreoneOfUnderscore4'
-- Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.
--

CREATE TABLE IF NOT EXISTS `MessageStreamEvent_oneOf_4` (
  `event` ENUM('thread.message.incomplete') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.';

--
-- Table structure for table `Model` generated from model 'Model'
-- Describes an OpenAI model offering that can be used with the API.
--

CREATE TABLE IF NOT EXISTS `Model` (
  `id` TEXT NOT NULL COMMENT 'The model identifier, which can be referenced in the API endpoints.',
  `created` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) when the model was created.',
  `object` ENUM('model') NOT NULL COMMENT 'The object type, which is always \&quot;model\&quot;.',
  `owned_by` TEXT NOT NULL COMMENT 'The organization that owns the model.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Describes an OpenAI model offering that can be used with the API.';

--
-- Table structure for table `ModifyAssistantRequest` generated from model 'ModifyAssistantRequest'
--

CREATE TABLE IF NOT EXISTS `ModifyAssistantRequest` (
  `model` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL COMMENT 'The name of the assistant. The maximum length is 256 characters. ',
  `description` TEXT DEFAULT NULL COMMENT 'The description of the assistant. The maximum length is 512 characters. ',
  `instructions` MEDIUMTEXT DEFAULT NULL COMMENT 'The system instructions that the assistant uses. The maximum length is 256,000 characters. ',
  `tools` JSON COMMENT 'A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. ',
  `file_ids` JSON COMMENT 'A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant. ',
  `metadata` JSON DEFAULT NULL COMMENT 'Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ModifyMessageRequest` generated from model 'ModifyMessageRequest'
--

CREATE TABLE IF NOT EXISTS `ModifyMessageRequest` (
  `metadata` JSON DEFAULT NULL COMMENT 'Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ModifyRunRequest` generated from model 'ModifyRunRequest'
--

CREATE TABLE IF NOT EXISTS `ModifyRunRequest` (
  `metadata` JSON DEFAULT NULL COMMENT 'Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ModifyThreadRequest` generated from model 'ModifyThreadRequest'
--

CREATE TABLE IF NOT EXISTS `ModifyThreadRequest` (
  `metadata` JSON DEFAULT NULL COMMENT 'Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `OpenAIFile` generated from model 'OpenAIFile'
-- The &#x60;File&#x60; object represents a document that has been uploaded to OpenAI.
--

CREATE TABLE IF NOT EXISTS `OpenAIFile` (
  `id` TEXT NOT NULL COMMENT 'The file identifier, which can be referenced in the API endpoints.',
  `bytes` INT NOT NULL COMMENT 'The size of the file, in bytes.',
  `created_at` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) for when the file was created.',
  `filename` TEXT NOT NULL COMMENT 'The name of the file.',
  `object` ENUM('file') NOT NULL COMMENT 'The object type, which is always &#x60;file&#x60;.',
  `purpose` ENUM('fine-tune', 'fine-tune-results', 'assistants', 'assistants_output') NOT NULL COMMENT 'The intended purpose of the file. Supported values are &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60;, &#x60;assistants&#x60;, and &#x60;assistants_output&#x60;.',
  `status` ENUM('uploaded', 'processed', 'error') NOT NULL COMMENT 'Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;.',
  `status_details` TEXT DEFAULT NULL COMMENT 'Deprecated. For details on why a fine-tuning training file failed validation, see the &#x60;error&#x60; field on &#x60;fine_tuning.job&#x60;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The &#x60;File&#x60; object represents a document that has been uploaded to OpenAI.';

--
-- Table structure for table `RunCompletionUsage` generated from model 'RunCompletionUsage'
-- Usage statistics related to the run. This value will be &#x60;null&#x60; if the run is not in a terminal state (i.e. &#x60;in_progress&#x60;, &#x60;queued&#x60;, etc.).
--

CREATE TABLE IF NOT EXISTS `RunCompletionUsage` (
  `completion_tokens` INT NOT NULL COMMENT 'Number of completion tokens used over the course of the run.',
  `prompt_tokens` INT NOT NULL COMMENT 'Number of prompt tokens used over the course of the run.',
  `total_tokens` INT NOT NULL COMMENT 'Total number of tokens used (prompt + completion).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Usage statistics related to the run. This value will be &#x60;null&#x60; if the run is not in a terminal state (i.e. &#x60;in_progress&#x60;, &#x60;queued&#x60;, etc.).';

--
-- Table structure for table `RunObject` generated from model 'RunObject'
-- Represents an execution run on a [thread](/docs/api-reference/threads).
--

CREATE TABLE IF NOT EXISTS `RunObject` (
  `id` TEXT NOT NULL COMMENT 'The identifier, which can be referenced in API endpoints.',
  `object` ENUM('thread.run') NOT NULL COMMENT 'The object type, which is always &#x60;thread.run&#x60;.',
  `created_at` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) for when the run was created.',
  `thread_id` TEXT NOT NULL COMMENT 'The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.',
  `assistant_id` TEXT NOT NULL COMMENT 'The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.',
  `status` ENUM('queued', 'in_progress', 'requires_action', 'cancelling', 'cancelled', 'failed', 'completed', 'expired') NOT NULL COMMENT 'The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;.',
  `required_action` TEXT NOT NULL,
  `last_error` TEXT NOT NULL,
  `expires_at` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) for when the run will expire.',
  `started_at` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) for when the run was started.',
  `cancelled_at` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) for when the run was cancelled.',
  `failed_at` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) for when the run failed.',
  `completed_at` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) for when the run was completed.',
  `incomplete_details` TEXT NOT NULL,
  `model` TEXT NOT NULL COMMENT 'The model that the [assistant](/docs/api-reference/assistants) used for this run.',
  `instructions` TEXT NOT NULL COMMENT 'The instructions that the [assistant](/docs/api-reference/assistants) used for this run.',
  `tools` JSON NOT NULL COMMENT 'The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.',
  `file_ids` JSON NOT NULL COMMENT 'The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run.',
  `metadata` JSON NOT NULL COMMENT 'Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ',
  `usage` TEXT NOT NULL,
  `temperature` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The sampling temperature used for this run. If not set, defaults to 1.',
  `max_prompt_tokens` INT UNSIGNED NOT NULL COMMENT 'The maximum number of prompt tokens specified to have been used over the course of the run. ',
  `max_completion_tokens` INT UNSIGNED NOT NULL COMMENT 'The maximum number of completion tokens specified to have been used over the course of the run. ',
  `truncation_strategy` TEXT NOT NULL,
  `tool_choice` TEXT NOT NULL,
  `response_format` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Represents an execution run on a [thread](/docs/api-reference/threads).';

--
-- Table structure for table `RunObject_incomplete_details` generated from model 'RunObjectUnderscoreincompleteUnderscoredetails'
-- Details on why the run is incomplete. Will be &#x60;null&#x60; if the run is not incomplete.
--

CREATE TABLE IF NOT EXISTS `RunObject_incomplete_details` (
  `reason` ENUM('max_completion_tokens', 'max_prompt_tokens') DEFAULT NULL COMMENT 'The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Details on why the run is incomplete. Will be &#x60;null&#x60; if the run is not incomplete.';

--
-- Table structure for table `RunObject_last_error` generated from model 'RunObjectUnderscorelastUnderscoreerror'
-- The last error associated with this run. Will be &#x60;null&#x60; if there are no errors.
--

CREATE TABLE IF NOT EXISTS `RunObject_last_error` (
  `code` ENUM('server_error', 'rate_limit_exceeded', 'invalid_prompt') NOT NULL COMMENT 'One of &#x60;server_error&#x60;, &#x60;rate_limit_exceeded&#x60;, or &#x60;invalid_prompt&#x60;.',
  `message` TEXT NOT NULL COMMENT 'A human-readable description of the error.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The last error associated with this run. Will be &#x60;null&#x60; if there are no errors.';

--
-- Table structure for table `RunObject_required_action` generated from model 'RunObjectUnderscorerequiredUnderscoreaction'
-- Details on the action required to continue the run. Will be &#x60;null&#x60; if no action is required.
--

CREATE TABLE IF NOT EXISTS `RunObject_required_action` (
  `type` ENUM('submit_tool_outputs') NOT NULL COMMENT 'For now, this is always &#x60;submit_tool_outputs&#x60;.',
  `submit_tool_outputs` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Details on the action required to continue the run. Will be &#x60;null&#x60; if no action is required.';

--
-- Table structure for table `RunObject_required_action_submit_tool_outputs` generated from model 'RunObjectUnderscorerequiredUnderscoreactionUnderscoresubmitUnderscoretoolUnderscoreoutputs'
-- Details on the tool outputs needed for this run to continue.
--

CREATE TABLE IF NOT EXISTS `RunObject_required_action_submit_tool_outputs` (
  `tool_calls` JSON NOT NULL COMMENT 'A list of the relevant tool calls.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Details on the tool outputs needed for this run to continue.';

--
-- Table structure for table `RunStepCompletionUsage` generated from model 'RunStepCompletionUsage'
-- Usage statistics related to the run step. This value will be &#x60;null&#x60; while the run step&#39;s status is &#x60;in_progress&#x60;.
--

CREATE TABLE IF NOT EXISTS `RunStepCompletionUsage` (
  `completion_tokens` INT NOT NULL COMMENT 'Number of completion tokens used over the course of the run step.',
  `prompt_tokens` INT NOT NULL COMMENT 'Number of prompt tokens used over the course of the run step.',
  `total_tokens` INT NOT NULL COMMENT 'Total number of tokens used (prompt + completion).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Usage statistics related to the run step. This value will be &#x60;null&#x60; while the run step&#39;s status is &#x60;in_progress&#x60;.';

--
-- Table structure for table `RunStepDeltaObject` generated from model 'RunStepDeltaObject'
-- Represents a run step delta i.e. any changed fields on a run step during streaming. 
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaObject` (
  `id` TEXT NOT NULL COMMENT 'The identifier of the run step, which can be referenced in API endpoints.',
  `object` ENUM('thread.run.step.delta') NOT NULL COMMENT 'The object type, which is always &#x60;thread.run.step.delta&#x60;.',
  `delta` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Represents a run step delta i.e. any changed fields on a run step during streaming. ';

--
-- Table structure for table `RunStepDeltaObject_delta` generated from model 'RunStepDeltaObjectUnderscoredelta'
-- The delta containing the fields that have changed on the run step.
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaObject_delta` (
  `step_details` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The delta containing the fields that have changed on the run step.';

--
-- Table structure for table `RunStepDeltaObject_delta_step_details` generated from model 'RunStepDeltaObjectUnderscoredeltaUnderscorestepUnderscoredetails'
-- The details of the run step.
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaObject_delta_step_details` (
  `type` ENUM('message_creation', 'tool_calls') NOT NULL COMMENT 'Always &#x60;message_creation&#x60;.',
  `message_creation` TEXT DEFAULT NULL,
  `tool_calls` JSON DEFAULT NULL COMMENT 'An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The details of the run step.';

--
-- Table structure for table `RunStepDeltaStepDetailsMessageCreationObject` generated from model 'RunStepDeltaStepDetailsMessageCreationObject'
-- Details of the message creation by the run step.
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsMessageCreationObject` (
  `type` ENUM('message_creation') NOT NULL COMMENT 'Always &#x60;message_creation&#x60;.',
  `message_creation` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Details of the message creation by the run step.';

--
-- Table structure for table `RunStepDeltaStepDetailsMessageCreationObject_message_creation` generated from model 'RunStepDeltaStepDetailsMessageCreationObjectUnderscoremessageUnderscorecreation'
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsMessageCreationObject_message_creation` (
  `message_id` TEXT DEFAULT NULL COMMENT 'The ID of the message that was created by this run step.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RunStepDeltaStepDetailsToolCallsCodeObject` generated from model 'RunStepDeltaStepDetailsToolCallsCodeObject'
-- Details of the Code Interpreter tool call the run step was involved in.
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsToolCallsCodeObject` (
  `index` INT NOT NULL COMMENT 'The index of the tool call in the tool calls array.',
  `id` TEXT DEFAULT NULL COMMENT 'The ID of the tool call.',
  `type` ENUM('code_interpreter') NOT NULL COMMENT 'The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.',
  `code_interpreter` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Details of the Code Interpreter tool call the run step was involved in.';

--
-- Table structure for table `RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter` generated from model 'RunStepDeltaStepDetailsToolCallsCodeObjectUnderscorecodeUnderscoreinterpreter'
-- The Code Interpreter tool call definition.
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter` (
  `input` TEXT DEFAULT NULL COMMENT 'The input to the Code Interpreter tool call.',
  `outputs` JSON DEFAULT NULL COMMENT 'The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (&#x60;logs&#x60;) or images (&#x60;image&#x60;). Each of these are represented by a different object type.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The Code Interpreter tool call definition.';

--
-- Table structure for table `RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outp` generated from model 'RunStepDeltaStepDetailsToolCallsCodeObjectUnderscorecodeUnderscoreinterpreterUnderscoreoutputsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outp` (
  `index` INT NOT NULL COMMENT 'The index of the output in the outputs array.',
  `type` ENUM('logs', 'image') NOT NULL COMMENT 'Always &#x60;logs&#x60;.',
  `logs` TEXT DEFAULT NULL COMMENT 'The text output from the Code Interpreter tool call.',
  `image` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RunStepDeltaStepDetailsToolCallsCodeOutputImageObject` generated from model 'RunStepDeltaStepDetailsToolCallsCodeOutputImageObject'
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsToolCallsCodeOutputImageObject` (
  `index` INT NOT NULL COMMENT 'The index of the output in the outputs array.',
  `type` ENUM('image') NOT NULL COMMENT 'Always &#x60;image&#x60;.',
  `image` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image` generated from model 'RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectUnderscoreimage'
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image` (
  `file_id` TEXT DEFAULT NULL COMMENT 'The [file](/docs/api-reference/files) ID of the image.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject` generated from model 'RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject'
-- Text output from the Code Interpreter tool call as part of a run step.
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject` (
  `index` INT NOT NULL COMMENT 'The index of the output in the outputs array.',
  `type` ENUM('logs') NOT NULL COMMENT 'Always &#x60;logs&#x60;.',
  `logs` TEXT DEFAULT NULL COMMENT 'The text output from the Code Interpreter tool call.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Text output from the Code Interpreter tool call as part of a run step.';

--
-- Table structure for table `RunStepDeltaStepDetailsToolCallsFunctionObject` generated from model 'RunStepDeltaStepDetailsToolCallsFunctionObject'
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsToolCallsFunctionObject` (
  `index` INT NOT NULL COMMENT 'The index of the tool call in the tool calls array.',
  `id` TEXT DEFAULT NULL COMMENT 'The ID of the tool call object.',
  `type` ENUM('function') NOT NULL COMMENT 'The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call.',
  `function` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RunStepDeltaStepDetailsToolCallsFunctionObject_function` generated from model 'RunStepDeltaStepDetailsToolCallsFunctionObjectUnderscorefunction'
-- The definition of the function that was called.
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsToolCallsFunctionObject_function` (
  `name` TEXT DEFAULT NULL COMMENT 'The name of the function.',
  `arguments` TEXT DEFAULT NULL COMMENT 'The arguments passed to the function.',
  `output` TEXT DEFAULT NULL COMMENT 'The output of the function. This will be &#x60;null&#x60; if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The definition of the function that was called.';

--
-- Table structure for table `RunStepDeltaStepDetailsToolCallsObject` generated from model 'RunStepDeltaStepDetailsToolCallsObject'
-- Details of the tool call.
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsToolCallsObject` (
  `type` ENUM('tool_calls') NOT NULL COMMENT 'Always &#x60;tool_calls&#x60;.',
  `tool_calls` JSON DEFAULT NULL COMMENT 'An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Details of the tool call.';

--
-- Table structure for table `RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner` generated from model 'RunStepDeltaStepDetailsToolCallsObjectUnderscoretoolUnderscorecallsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner` (
  `index` INT NOT NULL COMMENT 'The index of the tool call in the tool calls array.',
  `id` TEXT DEFAULT NULL COMMENT 'The ID of the tool call object.',
  `type` ENUM('code_interpreter', 'retrieval', 'function') NOT NULL COMMENT 'The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.',
  `code_interpreter` TEXT DEFAULT NULL,
  `retrieval` JSON DEFAULT NULL COMMENT 'For now, this is always going to be an empty object.',
  `function` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RunStepDeltaStepDetailsToolCallsRetrievalObject` generated from model 'RunStepDeltaStepDetailsToolCallsRetrievalObject'
--

CREATE TABLE IF NOT EXISTS `RunStepDeltaStepDetailsToolCallsRetrievalObject` (
  `index` INT NOT NULL COMMENT 'The index of the tool call in the tool calls array.',
  `id` TEXT DEFAULT NULL COMMENT 'The ID of the tool call object.',
  `type` ENUM('retrieval') NOT NULL COMMENT 'The type of tool call. This is always going to be &#x60;retrieval&#x60; for this type of tool call.',
  `retrieval` JSON DEFAULT NULL COMMENT 'For now, this is always going to be an empty object.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RunStepDetailsMessageCreationObject` generated from model 'RunStepDetailsMessageCreationObject'
-- Details of the message creation by the run step.
--

CREATE TABLE IF NOT EXISTS `RunStepDetailsMessageCreationObject` (
  `type` ENUM('message_creation') NOT NULL COMMENT 'Always &#x60;message_creation&#x60;.',
  `message_creation` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Details of the message creation by the run step.';

--
-- Table structure for table `RunStepDetailsMessageCreationObject_message_creation` generated from model 'RunStepDetailsMessageCreationObjectUnderscoremessageUnderscorecreation'
--

CREATE TABLE IF NOT EXISTS `RunStepDetailsMessageCreationObject_message_creation` (
  `message_id` TEXT NOT NULL COMMENT 'The ID of the message that was created by this run step.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RunStepDetailsToolCallsCodeObject` generated from model 'RunStepDetailsToolCallsCodeObject'
-- Details of the Code Interpreter tool call the run step was involved in.
--

CREATE TABLE IF NOT EXISTS `RunStepDetailsToolCallsCodeObject` (
  `id` TEXT NOT NULL COMMENT 'The ID of the tool call.',
  `type` ENUM('code_interpreter') NOT NULL COMMENT 'The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.',
  `code_interpreter` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Details of the Code Interpreter tool call the run step was involved in.';

--
-- Table structure for table `RunStepDetailsToolCallsCodeObject_code_interpreter` generated from model 'RunStepDetailsToolCallsCodeObjectUnderscorecodeUnderscoreinterpreter'
-- The Code Interpreter tool call definition.
--

CREATE TABLE IF NOT EXISTS `RunStepDetailsToolCallsCodeObject_code_interpreter` (
  `input` TEXT NOT NULL COMMENT 'The input to the Code Interpreter tool call.',
  `outputs` JSON NOT NULL COMMENT 'The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (&#x60;logs&#x60;) or images (&#x60;image&#x60;). Each of these are represented by a different object type.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The Code Interpreter tool call definition.';

--
-- Table structure for table `RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner` generated from model 'RunStepDetailsToolCallsCodeObjectUnderscorecodeUnderscoreinterpreterUnderscoreoutputsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner` (
  `type` ENUM('logs', 'image') NOT NULL COMMENT 'Always &#x60;logs&#x60;.',
  `logs` TEXT NOT NULL COMMENT 'The text output from the Code Interpreter tool call.',
  `image` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RunStepDetailsToolCallsCodeOutputImageObject` generated from model 'RunStepDetailsToolCallsCodeOutputImageObject'
--

CREATE TABLE IF NOT EXISTS `RunStepDetailsToolCallsCodeOutputImageObject` (
  `type` ENUM('image') NOT NULL COMMENT 'Always &#x60;image&#x60;.',
  `image` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RunStepDetailsToolCallsCodeOutputImageObject_image` generated from model 'RunStepDetailsToolCallsCodeOutputImageObjectUnderscoreimage'
--

CREATE TABLE IF NOT EXISTS `RunStepDetailsToolCallsCodeOutputImageObject_image` (
  `file_id` TEXT NOT NULL COMMENT 'The [file](/docs/api-reference/files) ID of the image.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RunStepDetailsToolCallsCodeOutputLogsObject` generated from model 'RunStepDetailsToolCallsCodeOutputLogsObject'
-- Text output from the Code Interpreter tool call as part of a run step.
--

CREATE TABLE IF NOT EXISTS `RunStepDetailsToolCallsCodeOutputLogsObject` (
  `type` ENUM('logs') NOT NULL COMMENT 'Always &#x60;logs&#x60;.',
  `logs` TEXT NOT NULL COMMENT 'The text output from the Code Interpreter tool call.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Text output from the Code Interpreter tool call as part of a run step.';

--
-- Table structure for table `RunStepDetailsToolCallsFunctionObject` generated from model 'RunStepDetailsToolCallsFunctionObject'
--

CREATE TABLE IF NOT EXISTS `RunStepDetailsToolCallsFunctionObject` (
  `id` TEXT NOT NULL COMMENT 'The ID of the tool call object.',
  `type` ENUM('function') NOT NULL COMMENT 'The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call.',
  `function` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RunStepDetailsToolCallsFunctionObject_function` generated from model 'RunStepDetailsToolCallsFunctionObjectUnderscorefunction'
-- The definition of the function that was called.
--

CREATE TABLE IF NOT EXISTS `RunStepDetailsToolCallsFunctionObject_function` (
  `name` TEXT NOT NULL COMMENT 'The name of the function.',
  `arguments` TEXT NOT NULL COMMENT 'The arguments passed to the function.',
  `output` TEXT NOT NULL COMMENT 'The output of the function. This will be &#x60;null&#x60; if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The definition of the function that was called.';

--
-- Table structure for table `RunStepDetailsToolCallsObject` generated from model 'RunStepDetailsToolCallsObject'
-- Details of the tool call.
--

CREATE TABLE IF NOT EXISTS `RunStepDetailsToolCallsObject` (
  `type` ENUM('tool_calls') NOT NULL COMMENT 'Always &#x60;tool_calls&#x60;.',
  `tool_calls` JSON NOT NULL COMMENT 'An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Details of the tool call.';

--
-- Table structure for table `RunStepDetailsToolCallsObject_tool_calls_inner` generated from model 'RunStepDetailsToolCallsObjectUnderscoretoolUnderscorecallsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `RunStepDetailsToolCallsObject_tool_calls_inner` (
  `id` TEXT NOT NULL COMMENT 'The ID of the tool call object.',
  `type` ENUM('code_interpreter', 'retrieval', 'function') NOT NULL COMMENT 'The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.',
  `code_interpreter` TEXT NOT NULL,
  `retrieval` JSON NOT NULL COMMENT 'For now, this is always going to be an empty object.',
  `function` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RunStepDetailsToolCallsRetrievalObject` generated from model 'RunStepDetailsToolCallsRetrievalObject'
--

CREATE TABLE IF NOT EXISTS `RunStepDetailsToolCallsRetrievalObject` (
  `id` TEXT NOT NULL COMMENT 'The ID of the tool call object.',
  `type` ENUM('retrieval') NOT NULL COMMENT 'The type of tool call. This is always going to be &#x60;retrieval&#x60; for this type of tool call.',
  `retrieval` JSON NOT NULL COMMENT 'For now, this is always going to be an empty object.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RunStepObject` generated from model 'RunStepObject'
-- Represents a step in execution of a run. 
--

CREATE TABLE IF NOT EXISTS `RunStepObject` (
  `id` TEXT NOT NULL COMMENT 'The identifier of the run step, which can be referenced in API endpoints.',
  `object` ENUM('thread.run.step') NOT NULL COMMENT 'The object type, which is always &#x60;thread.run.step&#x60;.',
  `created_at` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) for when the run step was created.',
  `assistant_id` TEXT NOT NULL COMMENT 'The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.',
  `thread_id` TEXT NOT NULL COMMENT 'The ID of the [thread](/docs/api-reference/threads) that was run.',
  `run_id` TEXT NOT NULL COMMENT 'The ID of the [run](/docs/api-reference/runs) that this run step is a part of.',
  `type` ENUM('message_creation', 'tool_calls') NOT NULL COMMENT 'The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;.',
  `status` ENUM('in_progress', 'cancelled', 'failed', 'completed', 'expired') NOT NULL COMMENT 'The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;.',
  `step_details` TEXT NOT NULL,
  `last_error` TEXT NOT NULL,
  `expired_at` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.',
  `cancelled_at` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) for when the run step was cancelled.',
  `failed_at` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) for when the run step failed.',
  `completed_at` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) for when the run step completed.',
  `metadata` JSON NOT NULL COMMENT 'Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ',
  `usage` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Represents a step in execution of a run. ';

--
-- Table structure for table `RunStepObject_last_error` generated from model 'RunStepObjectUnderscorelastUnderscoreerror'
-- The last error associated with this run step. Will be &#x60;null&#x60; if there are no errors.
--

CREATE TABLE IF NOT EXISTS `RunStepObject_last_error` (
  `code` ENUM('server_error', 'rate_limit_exceeded') NOT NULL COMMENT 'One of &#x60;server_error&#x60; or &#x60;rate_limit_exceeded&#x60;.',
  `message` TEXT NOT NULL COMMENT 'A human-readable description of the error.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The last error associated with this run step. Will be &#x60;null&#x60; if there are no errors.';

--
-- Table structure for table `RunStepObject_step_details` generated from model 'RunStepObjectUnderscorestepUnderscoredetails'
-- The details of the run step.
--

CREATE TABLE IF NOT EXISTS `RunStepObject_step_details` (
  `type` ENUM('message_creation', 'tool_calls') NOT NULL COMMENT 'Always &#x60;message_creation&#x60;.',
  `message_creation` TEXT NOT NULL,
  `tool_calls` JSON NOT NULL COMMENT 'An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The details of the run step.';

--
-- Table structure for table `RunStepStreamEvent` generated from model 'RunStepStreamEvent'
--

CREATE TABLE IF NOT EXISTS `RunStepStreamEvent` (
  `event` ENUM('thread.run.step.expired') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RunStepStreamEvent_oneOf` generated from model 'RunStepStreamEventUnderscoreoneOf'
-- Occurs when a [run step](/docs/api-reference/runs/step-object) is created.
--

CREATE TABLE IF NOT EXISTS `RunStepStreamEvent_oneOf` (
  `event` ENUM('thread.run.step.created') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Occurs when a [run step](/docs/api-reference/runs/step-object) is created.';

--
-- Table structure for table `RunStepStreamEvent_oneOf_1` generated from model 'RunStepStreamEventUnderscoreoneOfUnderscore1'
-- Occurs when a [run step](/docs/api-reference/runs/step-object) moves to an &#x60;in_progress&#x60; state.
--

CREATE TABLE IF NOT EXISTS `RunStepStreamEvent_oneOf_1` (
  `event` ENUM('thread.run.step.in_progress') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Occurs when a [run step](/docs/api-reference/runs/step-object) moves to an &#x60;in_progress&#x60; state.';

--
-- Table structure for table `RunStepStreamEvent_oneOf_2` generated from model 'RunStepStreamEventUnderscoreoneOfUnderscore2'
-- Occurs when parts of a [run step](/docs/api-reference/runs/step-object) are being streamed.
--

CREATE TABLE IF NOT EXISTS `RunStepStreamEvent_oneOf_2` (
  `event` ENUM('thread.run.step.delta') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Occurs when parts of a [run step](/docs/api-reference/runs/step-object) are being streamed.';

--
-- Table structure for table `RunStepStreamEvent_oneOf_3` generated from model 'RunStepStreamEventUnderscoreoneOfUnderscore3'
-- Occurs when a [run step](/docs/api-reference/runs/step-object) is completed.
--

CREATE TABLE IF NOT EXISTS `RunStepStreamEvent_oneOf_3` (
  `event` ENUM('thread.run.step.completed') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Occurs when a [run step](/docs/api-reference/runs/step-object) is completed.';

--
-- Table structure for table `RunStepStreamEvent_oneOf_4` generated from model 'RunStepStreamEventUnderscoreoneOfUnderscore4'
-- Occurs when a [run step](/docs/api-reference/runs/step-object) fails.
--

CREATE TABLE IF NOT EXISTS `RunStepStreamEvent_oneOf_4` (
  `event` ENUM('thread.run.step.failed') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Occurs when a [run step](/docs/api-reference/runs/step-object) fails.';

--
-- Table structure for table `RunStepStreamEvent_oneOf_5` generated from model 'RunStepStreamEventUnderscoreoneOfUnderscore5'
-- Occurs when a [run step](/docs/api-reference/runs/step-object) is cancelled.
--

CREATE TABLE IF NOT EXISTS `RunStepStreamEvent_oneOf_5` (
  `event` ENUM('thread.run.step.cancelled') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Occurs when a [run step](/docs/api-reference/runs/step-object) is cancelled.';

--
-- Table structure for table `RunStepStreamEvent_oneOf_6` generated from model 'RunStepStreamEventUnderscoreoneOfUnderscore6'
-- Occurs when a [run step](/docs/api-reference/runs/step-object) expires.
--

CREATE TABLE IF NOT EXISTS `RunStepStreamEvent_oneOf_6` (
  `event` ENUM('thread.run.step.expired') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Occurs when a [run step](/docs/api-reference/runs/step-object) expires.';

--
-- Table structure for table `RunStreamEvent` generated from model 'RunStreamEvent'
--

CREATE TABLE IF NOT EXISTS `RunStreamEvent` (
  `event` ENUM('thread.run.expired') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RunStreamEvent_oneOf` generated from model 'RunStreamEventUnderscoreoneOf'
-- Occurs when a new [run](/docs/api-reference/runs/object) is created.
--

CREATE TABLE IF NOT EXISTS `RunStreamEvent_oneOf` (
  `event` ENUM('thread.run.created') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Occurs when a new [run](/docs/api-reference/runs/object) is created.';

--
-- Table structure for table `RunStreamEvent_oneOf_1` generated from model 'RunStreamEventUnderscoreoneOfUnderscore1'
-- Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;queued&#x60; status.
--

CREATE TABLE IF NOT EXISTS `RunStreamEvent_oneOf_1` (
  `event` ENUM('thread.run.queued') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;queued&#x60; status.';

--
-- Table structure for table `RunStreamEvent_oneOf_2` generated from model 'RunStreamEventUnderscoreoneOfUnderscore2'
-- Occurs when a [run](/docs/api-reference/runs/object) moves to an &#x60;in_progress&#x60; status.
--

CREATE TABLE IF NOT EXISTS `RunStreamEvent_oneOf_2` (
  `event` ENUM('thread.run.in_progress') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Occurs when a [run](/docs/api-reference/runs/object) moves to an &#x60;in_progress&#x60; status.';

--
-- Table structure for table `RunStreamEvent_oneOf_3` generated from model 'RunStreamEventUnderscoreoneOfUnderscore3'
-- Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;requires_action&#x60; status.
--

CREATE TABLE IF NOT EXISTS `RunStreamEvent_oneOf_3` (
  `event` ENUM('thread.run.requires_action') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;requires_action&#x60; status.';

--
-- Table structure for table `RunStreamEvent_oneOf_4` generated from model 'RunStreamEventUnderscoreoneOfUnderscore4'
-- Occurs when a [run](/docs/api-reference/runs/object) is completed.
--

CREATE TABLE IF NOT EXISTS `RunStreamEvent_oneOf_4` (
  `event` ENUM('thread.run.completed') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Occurs when a [run](/docs/api-reference/runs/object) is completed.';

--
-- Table structure for table `RunStreamEvent_oneOf_5` generated from model 'RunStreamEventUnderscoreoneOfUnderscore5'
-- Occurs when a [run](/docs/api-reference/runs/object) fails.
--

CREATE TABLE IF NOT EXISTS `RunStreamEvent_oneOf_5` (
  `event` ENUM('thread.run.failed') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Occurs when a [run](/docs/api-reference/runs/object) fails.';

--
-- Table structure for table `RunStreamEvent_oneOf_6` generated from model 'RunStreamEventUnderscoreoneOfUnderscore6'
-- Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;cancelling&#x60; status.
--

CREATE TABLE IF NOT EXISTS `RunStreamEvent_oneOf_6` (
  `event` ENUM('thread.run.cancelling') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;cancelling&#x60; status.';

--
-- Table structure for table `RunStreamEvent_oneOf_7` generated from model 'RunStreamEventUnderscoreoneOfUnderscore7'
-- Occurs when a [run](/docs/api-reference/runs/object) is cancelled.
--

CREATE TABLE IF NOT EXISTS `RunStreamEvent_oneOf_7` (
  `event` ENUM('thread.run.cancelled') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Occurs when a [run](/docs/api-reference/runs/object) is cancelled.';

--
-- Table structure for table `RunStreamEvent_oneOf_8` generated from model 'RunStreamEventUnderscoreoneOfUnderscore8'
-- Occurs when a [run](/docs/api-reference/runs/object) expires.
--

CREATE TABLE IF NOT EXISTS `RunStreamEvent_oneOf_8` (
  `event` ENUM('thread.run.expired') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Occurs when a [run](/docs/api-reference/runs/object) expires.';

--
-- Table structure for table `RunToolCallObject` generated from model 'RunToolCallObject'
-- Tool call objects
--

CREATE TABLE IF NOT EXISTS `RunToolCallObject` (
  `id` TEXT NOT NULL COMMENT 'The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.',
  `type` ENUM('function') NOT NULL COMMENT 'The type of tool call the output is required for. For now, this is always &#x60;function&#x60;.',
  `function` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Tool call objects';

--
-- Table structure for table `RunToolCallObject_function` generated from model 'RunToolCallObjectUnderscorefunction'
-- The function definition.
--

CREATE TABLE IF NOT EXISTS `RunToolCallObject_function` (
  `name` TEXT NOT NULL COMMENT 'The name of the function.',
  `arguments` TEXT NOT NULL COMMENT 'The arguments that the model expects you to pass to the function.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The function definition.';

--
-- Table structure for table `SubmitToolOutputsRunRequest` generated from model 'SubmitToolOutputsRunRequest'
--

CREATE TABLE IF NOT EXISTS `SubmitToolOutputsRunRequest` (
  `tool_outputs` JSON NOT NULL COMMENT 'A list of tools for which the outputs are being submitted.',
  `stream` TINYINT(1) DEFAULT NULL COMMENT 'If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SubmitToolOutputsRunRequest_tool_outputs_inner` generated from model 'SubmitToolOutputsRunRequestUnderscoretoolUnderscoreoutputsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `SubmitToolOutputsRunRequest_tool_outputs_inner` (
  `tool_call_id` TEXT DEFAULT NULL COMMENT 'The ID of the tool call in the &#x60;required_action&#x60; object within the run object the output is being submitted for.',
  `output` TEXT DEFAULT NULL COMMENT 'The output of the tool call to be submitted to continue the run.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ThreadObject` generated from model 'ThreadObject'
-- Represents a thread that contains [messages](/docs/api-reference/messages).
--

CREATE TABLE IF NOT EXISTS `ThreadObject` (
  `id` TEXT NOT NULL COMMENT 'The identifier, which can be referenced in API endpoints.',
  `object` ENUM('thread') NOT NULL COMMENT 'The object type, which is always &#x60;thread&#x60;.',
  `created_at` INT NOT NULL COMMENT 'The Unix timestamp (in seconds) for when the thread was created.',
  `metadata` JSON NOT NULL COMMENT 'Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Represents a thread that contains [messages](/docs/api-reference/messages).';

--
-- Table structure for table `ThreadStreamEvent` generated from model 'ThreadStreamEvent'
--

CREATE TABLE IF NOT EXISTS `ThreadStreamEvent` (
  `event` ENUM('thread.created') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ThreadStreamEvent_oneOf` generated from model 'ThreadStreamEventUnderscoreoneOf'
-- Occurs when a new [thread](/docs/api-reference/threads/object) is created.
--

CREATE TABLE IF NOT EXISTS `ThreadStreamEvent_oneOf` (
  `event` ENUM('thread.created') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Occurs when a new [thread](/docs/api-reference/threads/object) is created.';

--
-- Table structure for table `TranscriptionSegment` generated from model 'TranscriptionSegment'
--

CREATE TABLE IF NOT EXISTS `TranscriptionSegment` (
  `id` INT NOT NULL COMMENT 'Unique identifier of the segment.',
  `seek` INT NOT NULL COMMENT 'Seek offset of the segment.',
  `start` DECIMAL(20, 9) NOT NULL COMMENT 'Start time of the segment in seconds.',
  `end` DECIMAL(20, 9) NOT NULL COMMENT 'End time of the segment in seconds.',
  `text` TEXT NOT NULL COMMENT 'Text content of the segment.',
  `tokens` JSON NOT NULL COMMENT 'Array of token IDs for the text content.',
  `temperature` DECIMAL(20, 9) NOT NULL COMMENT 'Temperature parameter used for generating the segment.',
  `avg_logprob` DECIMAL(20, 9) NOT NULL COMMENT 'Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.',
  `compression_ratio` DECIMAL(20, 9) NOT NULL COMMENT 'Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.',
  `no_speech_prob` DECIMAL(20, 9) NOT NULL COMMENT 'Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TranscriptionWord` generated from model 'TranscriptionWord'
--

CREATE TABLE IF NOT EXISTS `TranscriptionWord` (
  `word` TEXT NOT NULL COMMENT 'The text content of the word.',
  `start` DECIMAL(20, 9) NOT NULL COMMENT 'Start time of the word in seconds.',
  `end` DECIMAL(20, 9) NOT NULL COMMENT 'End time of the word in seconds.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TruncationObject` generated from model 'TruncationObject'
--

CREATE TABLE IF NOT EXISTS `TruncationObject` (
  `type` ENUM('auto', 'last_messages') DEFAULT NULL COMMENT 'The truncation strategy to use for the thread. The default is &#x60;auto&#x60;. If set to &#x60;last_messages&#x60;, the thread will be truncated to the n most recent messages in the thread. When set to &#x60;auto&#x60;, messages in the middle of the thread will be dropped to fit the context length of the model, &#x60;max_prompt_tokens&#x60;.',
  `last_messages` INT UNSIGNED DEFAULT NULL COMMENT 'The number of most recent messages from the thread when constructing the context for the run.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


