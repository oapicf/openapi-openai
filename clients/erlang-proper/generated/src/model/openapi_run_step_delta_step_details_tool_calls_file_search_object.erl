-module(openapi_run_step_delta_step_details_tool_calls_file_search_object).

-include("openapi.hrl").

-export([openapi_run_step_delta_step_details_tool_calls_file_search_object/0]).

-export([openapi_run_step_delta_step_details_tool_calls_file_search_object/1]).

-export_type([openapi_run_step_delta_step_details_tool_calls_file_search_object/0]).

-type openapi_run_step_delta_step_details_tool_calls_file_search_object() ::
  [ {'index', integer() }
  | {'id', binary() }
  | {'type', binary() }
  | {'file_search', map() }
  ].


openapi_run_step_delta_step_details_tool_calls_file_search_object() ->
    openapi_run_step_delta_step_details_tool_calls_file_search_object([]).

openapi_run_step_delta_step_details_tool_calls_file_search_object(Fields) ->
  Default = [ {'index', integer() }
            , {'id', binary() }
            , {'type', elements([<<"file_search">>]) }
            , {'file_search', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

