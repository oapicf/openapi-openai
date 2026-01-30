-module(openapi_create_run_request).

-export([encode/1]).

-export_type([openapi_create_run_request/0]).

-type openapi_create_run_request() ::
    #{ 'assistant_id' := binary(),
       'model' => openapi_create_run_request_model:openapi_create_run_request_model(),
       'instructions' => binary(),
       'additional_instructions' => binary(),
       'additional_messages' => list(),
       'tools' => list(),
       'metadata' => maps:map(),
       'temperature' => integer(),
       'top_p' => integer(),
       'stream' => boolean(),
       'max_prompt_tokens' => integer(),
       'max_completion_tokens' => integer(),
       'truncation_strategy' => openapi_truncation_object:openapi_truncation_object(),
       'tool_choice' => openapi_assistants_api_tool_choice_option:openapi_assistants_api_tool_choice_option(),
       'parallel_tool_calls' => boolean(),
       'response_format' => openapi_assistants_api_response_format_option:openapi_assistants_api_response_format_option()
     }.

encode(#{ 'assistant_id' := AssistantId,
          'model' := Model,
          'instructions' := Instructions,
          'additional_instructions' := AdditionalInstructions,
          'additional_messages' := AdditionalMessages,
          'tools' := Tools,
          'metadata' := Metadata,
          'temperature' := Temperature,
          'top_p' := TopP,
          'stream' := Stream,
          'max_prompt_tokens' := MaxPromptTokens,
          'max_completion_tokens' := MaxCompletionTokens,
          'truncation_strategy' := TruncationStrategy,
          'tool_choice' := ToolChoice,
          'parallel_tool_calls' := ParallelToolCalls,
          'response_format' := ResponseFormat
        }) ->
    #{ 'assistant_id' => AssistantId,
       'model' => Model,
       'instructions' => Instructions,
       'additional_instructions' => AdditionalInstructions,
       'additional_messages' => AdditionalMessages,
       'tools' => Tools,
       'metadata' => Metadata,
       'temperature' => Temperature,
       'top_p' => TopP,
       'stream' => Stream,
       'max_prompt_tokens' => MaxPromptTokens,
       'max_completion_tokens' => MaxCompletionTokens,
       'truncation_strategy' => TruncationStrategy,
       'tool_choice' => ToolChoice,
       'parallel_tool_calls' => ParallelToolCalls,
       'response_format' => ResponseFormat
     }.
