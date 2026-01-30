-module(openapi_chat_completion_stream_response_delta).

-export([encode/1]).

-export_type([openapi_chat_completion_stream_response_delta/0]).

-type openapi_chat_completion_stream_response_delta() ::
    #{ 'content' => binary(),
       'function_call' => openapi_chat_completion_stream_response_delta_function_call:openapi_chat_completion_stream_response_delta_function_call(),
       'tool_calls' => list(),
       'role' => binary(),
       'refusal' => binary()
     }.

encode(#{ 'content' := Content,
          'function_call' := FunctionCall,
          'tool_calls' := ToolCalls,
          'role' := Role,
          'refusal' := Refusal
        }) ->
    #{ 'content' => Content,
       'function_call' => FunctionCall,
       'tool_calls' => ToolCalls,
       'role' => Role,
       'refusal' => Refusal
     }.
