-module(openapi_chat_completion_request_assistant_message).

-export([encode/1]).

-export_type([openapi_chat_completion_request_assistant_message/0]).

-type openapi_chat_completion_request_assistant_message() ::
    #{ 'content' => binary(),
       'role' := binary(),
       'name' => binary(),
       'tool_calls' => list(),
       'function_call' => openapi_chat_completion_request_assistant_message_function_call:openapi_chat_completion_request_assistant_message_function_call()
     }.

encode(#{ 'content' := Content,
          'role' := Role,
          'name' := Name,
          'tool_calls' := ToolCalls,
          'function_call' := FunctionCall
        }) ->
    #{ 'content' => Content,
       'role' => Role,
       'name' => Name,
       'tool_calls' => ToolCalls,
       'function_call' => FunctionCall
     }.
