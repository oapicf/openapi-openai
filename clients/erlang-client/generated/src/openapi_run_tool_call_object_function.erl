-module(openapi_run_tool_call_object_function).

-export([encode/1]).

-export_type([openapi_run_tool_call_object_function/0]).

-type openapi_run_tool_call_object_function() ::
    #{ 'name' := binary(),
       'arguments' := binary()
     }.

encode(#{ 'name' := Name,
          'arguments' := Arguments
        }) ->
    #{ 'name' => Name,
       'arguments' => Arguments
     }.
