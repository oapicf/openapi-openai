-module(openapi_run_tool_call_object).

-include("openapi.hrl").

-export([openapi_run_tool_call_object/0]).

-export([openapi_run_tool_call_object/1]).

-export_type([openapi_run_tool_call_object/0]).

-type openapi_run_tool_call_object() ::
  [ {'id', binary() }
  | {'type', binary() }
  | {'function', openapi_run_tool_call_object_function:openapi_run_tool_call_object_function() }
  ].


openapi_run_tool_call_object() ->
    openapi_run_tool_call_object([]).

openapi_run_tool_call_object(Fields) ->
  Default = [ {'id', binary() }
            , {'type', elements([<<"function">>]) }
            , {'function', openapi_run_tool_call_object_function:openapi_run_tool_call_object_function() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

