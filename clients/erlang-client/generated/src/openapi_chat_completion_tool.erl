-module(openapi_chat_completion_tool).

-export([encode/1]).

-export_type([openapi_chat_completion_tool/0]).

-type openapi_chat_completion_tool() ::
    #{ 'type' := binary(),
       'function' := openapi_function_object:openapi_function_object()
     }.

encode(#{ 'type' := Type,
          'function' := Function
        }) ->
    #{ 'type' => Type,
       'function' => Function
     }.
