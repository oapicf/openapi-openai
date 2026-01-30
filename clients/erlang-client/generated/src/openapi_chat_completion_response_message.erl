-module(openapi_chat_completion_response_message).

-export([encode/1]).

-export_type([openapi_chat_completion_response_message/0]).

-type openapi_chat_completion_response_message() ::
    #{ 'content' := binary(),
       'refusal' := binary(),
       'tool_calls' => list(),
       'role' := binary(),
       'function_call' => openapi_chat_completion_response_message_function_call:openapi_chat_completion_response_message_function_call(),
       'audio' => openapi_chat_completion_response_message_audio:openapi_chat_completion_response_message_audio()
     }.

encode(#{ 'content' := Content,
          'refusal' := Refusal,
          'tool_calls' := ToolCalls,
          'role' := Role,
          'function_call' := FunctionCall,
          'audio' := Audio
        }) ->
    #{ 'content' => Content,
       'refusal' => Refusal,
       'tool_calls' => ToolCalls,
       'role' => Role,
       'function_call' => FunctionCall,
       'audio' => Audio
     }.
