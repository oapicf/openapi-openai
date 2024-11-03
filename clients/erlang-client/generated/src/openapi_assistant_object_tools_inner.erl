-module(openapi_assistant_object_tools_inner).

-export([encode/1]).

-export_type([openapi_assistant_object_tools_inner/0]).

-type openapi_assistant_object_tools_inner() ::
    #{ 'type' := binary(),
       'function' := openapi_function_object:openapi_function_object()
     }.

encode(#{ 'type' := Type,
          'function' := Function
        }) ->
    #{ 'type' => Type,
       'function' => Function
     }.
