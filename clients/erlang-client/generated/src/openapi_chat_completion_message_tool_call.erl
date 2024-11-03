-module(openapi_chat_completion_message_tool_call).

-export([encode/1]).

-export_type([openapi_chat_completion_message_tool_call/0]).

-type openapi_chat_completion_message_tool_call() ::
    #{ 'id' := binary(),
       'type' := binary(),
       'function' := openapi_chat_completion_message_tool_call_function:openapi_chat_completion_message_tool_call_function()
     }.

encode(#{ 'id' := Id,
          'type' := Type,
          'function' := Function
        }) ->
    #{ 'id' => Id,
       'type' => Type,
       'function' => Function
     }.
