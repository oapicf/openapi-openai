-module(openapi_chat_completion_response_message).

-export([encode/1]).

-export_type([openapi_chat_completion_response_message/0]).

-type openapi_chat_completion_response_message() ::
    #{ 'content' := binary(),
       'tool_calls' => list(),
       'role' := binary(),
       'function_call' => openapi_chat_completion_request_assistant_message_function_call:openapi_chat_completion_request_assistant_message_function_call()
     }.

encode(#{ 'content' := Content,
          'tool_calls' := ToolCalls,
          'role' := Role,
          'function_call' := FunctionCall
        }) ->
    #{ 'content' => Content,
       'tool_calls' => ToolCalls,
       'role' => Role,
       'function_call' => FunctionCall
     }.
