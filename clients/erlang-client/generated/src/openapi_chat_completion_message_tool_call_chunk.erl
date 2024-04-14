-module(openapi_chat_completion_message_tool_call_chunk).

-export([encode/1]).

-export_type([openapi_chat_completion_message_tool_call_chunk/0]).

-type openapi_chat_completion_message_tool_call_chunk() ::
    #{ 'index' := integer(),
       'id' => binary(),
       'type' => binary(),
       'function' => openapi_chat_completion_message_tool_call_chunk_function:openapi_chat_completion_message_tool_call_chunk_function()
     }.

encode(#{ 'index' := Index,
          'id' := Id,
          'type' := Type,
          'function' := Function
        }) ->
    #{ 'index' => Index,
       'id' => Id,
       'type' => Type,
       'function' => Function
     }.
