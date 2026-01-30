-module(openapi_fine_tune_preference_request_input_preferred_completion_inner).

-export([encode/1]).

-export_type([openapi_fine_tune_preference_request_input_preferred_completion_inner/0]).

-type openapi_fine_tune_preference_request_input_preferred_completion_inner() ::
    #{ 'content' => openapi_chat_completion_request_assistant_message_content:openapi_chat_completion_request_assistant_message_content(),
       'refusal' => binary(),
       'role' := binary(),
       'name' => binary(),
       'audio' => openapi_chat_completion_request_assistant_message_audio:openapi_chat_completion_request_assistant_message_audio(),
       'tool_calls' => list(),
       'function_call' => openapi_chat_completion_request_assistant_message_function_call:openapi_chat_completion_request_assistant_message_function_call()
     }.

encode(#{ 'content' := Content,
          'refusal' := Refusal,
          'role' := Role,
          'name' := Name,
          'audio' := Audio,
          'tool_calls' := ToolCalls,
          'function_call' := FunctionCall
        }) ->
    #{ 'content' => Content,
       'refusal' => Refusal,
       'role' => Role,
       'name' => Name,
       'audio' => Audio,
       'tool_calls' => ToolCalls,
       'function_call' => FunctionCall
     }.
