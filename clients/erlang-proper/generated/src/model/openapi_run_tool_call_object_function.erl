-module(openapi_run_tool_call_object_function).

-include("openapi.hrl").

-export([openapi_run_tool_call_object_function/0]).

-export([openapi_run_tool_call_object_function/1]).

-export_type([openapi_run_tool_call_object_function/0]).

-type openapi_run_tool_call_object_function() ::
  [ {'name', binary() }
  | {'arguments', binary() }
  ].


openapi_run_tool_call_object_function() ->
    openapi_run_tool_call_object_function([]).

openapi_run_tool_call_object_function(Fields) ->
  Default = [ {'name', binary() }
            , {'arguments', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

