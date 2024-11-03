-module(openapi_assistant_tools_function).

-export([encode/1]).

-export_type([openapi_assistant_tools_function/0]).

-type openapi_assistant_tools_function() ::
    #{ 'type' := binary(),
       'function' := openapi_function_object:openapi_function_object()
     }.

encode(#{ 'type' := Type,
          'function' := Function
        }) ->
    #{ 'type' => Type,
       'function' => Function
     }.
