-module(openapi_create_thread_and_run_request).

-export([encode/1]).

-export_type([openapi_create_thread_and_run_request/0]).

-type openapi_create_thread_and_run_request() ::
    #{ 'assistant_id' := binary(),
       'thread' => openapi_create_thread_request:openapi_create_thread_request(),
       'model' => openapi_create_run_request_model:openapi_create_run_request_model(),
       'instructions' => binary(),
       'tools' => list(),
       'metadata' => maps:map(),
       'temperature' => integer(),
       'stream' => boolean(),
       'max_prompt_tokens' => integer(),
       'max_completion_tokens' => integer(),
       'truncation_strategy' => openapi_truncation_object:openapi_truncation_object(),
       'tool_choice' => openapi_assistants_api_tool_choice_option:openapi_assistants_api_tool_choice_option(),
       'response_format' => openapi_assistants_api_response_format_option:openapi_assistants_api_response_format_option()
     }.

encode(#{ 'assistant_id' := AssistantId,
          'thread' := Thread,
          'model' := Model,
          'instructions' := Instructions,
          'tools' := Tools,
          'metadata' := Metadata,
          'temperature' := Temperature,
          'stream' := Stream,
          'max_prompt_tokens' := MaxPromptTokens,
          'max_completion_tokens' := MaxCompletionTokens,
          'truncation_strategy' := TruncationStrategy,
          'tool_choice' := ToolChoice,
          'response_format' := ResponseFormat
        }) ->
    #{ 'assistant_id' => AssistantId,
       'thread' => Thread,
       'model' => Model,
       'instructions' => Instructions,
       'tools' => Tools,
       'metadata' => Metadata,
       'temperature' => Temperature,
       'stream' => Stream,
       'max_prompt_tokens' => MaxPromptTokens,
       'max_completion_tokens' => MaxCompletionTokens,
       'truncation_strategy' => TruncationStrategy,
       'tool_choice' => ToolChoice,
       'response_format' => ResponseFormat
     }.
