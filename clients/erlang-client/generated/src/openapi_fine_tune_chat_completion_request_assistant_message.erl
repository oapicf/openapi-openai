-module(openapi_fine_tune_chat_completion_request_assistant_message).

-export([encode/1]).

-export_type([openapi_fine_tune_chat_completion_request_assistant_message/0]).

-type openapi_fine_tune_chat_completion_request_assistant_message() ::
    #{ 'content' => openapi_chat_completion_request_assistant_message_content:openapi_chat_completion_request_assistant_message_content(),
       'refusal' => binary(),
       'role' := binary(),
       'name' => binary(),
       'audio' => openapi_chat_completion_request_assistant_message_audio:openapi_chat_completion_request_assistant_message_audio(),
       'tool_calls' => list(),
       'function_call' => openapi_chat_completion_request_assistant_message_function_call:openapi_chat_completion_request_assistant_message_function_call(),
       'weight' => integer()
     }.

encode(#{ 'content' := Content,
          'refusal' := Refusal,
          'role' := Role,
          'name' := Name,
          'audio' := Audio,
          'tool_calls' := ToolCalls,
          'function_call' := FunctionCall,
          'weight' := Weight
        }) ->
    #{ 'content' => Content,
       'refusal' => Refusal,
       'role' => Role,
       'name' => Name,
       'audio' => Audio,
       'tool_calls' => ToolCalls,
       'function_call' => FunctionCall,
       'weight' => Weight
     }.
