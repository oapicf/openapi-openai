-module(openapi_chat_completion_message_tool_call_chunk_function).

-export([encode/1]).

-export_type([openapi_chat_completion_message_tool_call_chunk_function/0]).

-type openapi_chat_completion_message_tool_call_chunk_function() ::
    #{ 'name' => binary(),
       'arguments' => binary()
     }.

encode(#{ 'name' := Name,
          'arguments' := Arguments
        }) ->
    #{ 'name' => Name,
       'arguments' => Arguments
     }.
