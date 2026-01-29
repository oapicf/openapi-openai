-module(openapi_run_tool_call_object).

-export([encode/1]).

-export_type([openapi_run_tool_call_object/0]).

-type openapi_run_tool_call_object() ::
    #{ 'id' := binary(),
       'type' := binary(),
       'function' := openapi_run_tool_call_object_function:openapi_run_tool_call_object_function()
     }.

encode(#{ 'id' := Id,
          'type' := Type,
          'function' := Function
        }) ->
    #{ 'id' => Id,
       'type' => Type,
       'function' => Function
     }.
