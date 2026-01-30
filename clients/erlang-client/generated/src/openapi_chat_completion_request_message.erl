-module(openapi_chat_completion_request_message).

-export([encode/1]).

-export_type([openapi_chat_completion_request_message/0]).

-type openapi_chat_completion_request_message() ::
    #{ 'content' := binary(),
       'role' := binary(),
       'name' := binary(),
       'refusal' => binary(),
       'audio' => openapi_chat_completion_request_assistant_message_audio:openapi_chat_completion_request_assistant_message_audio(),
       'tool_calls' => list(),
       'function_call' => openapi_chat_completion_request_assistant_message_function_call:openapi_chat_completion_request_assistant_message_function_call(),
       'tool_call_id' := binary()
     }.

encode(#{ 'content' := Content,
          'role' := Role,
          'name' := Name,
          'refusal' := Refusal,
          'audio' := Audio,
          'tool_calls' := ToolCalls,
          'function_call' := FunctionCall,
          'tool_call_id' := ToolCallId
        }) ->
    #{ 'content' => Content,
       'role' => Role,
       'name' => Name,
       'refusal' => Refusal,
       'audio' => Audio,
       'tool_calls' => ToolCalls,
       'function_call' => FunctionCall,
       'tool_call_id' => ToolCallId
     }.
