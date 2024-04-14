-module(openapi_run_step_details_tool_calls_retrieval_object).

-include("openapi.hrl").

-export([openapi_run_step_details_tool_calls_retrieval_object/0]).

-export([openapi_run_step_details_tool_calls_retrieval_object/1]).

-export_type([openapi_run_step_details_tool_calls_retrieval_object/0]).

-type openapi_run_step_details_tool_calls_retrieval_object() ::
  [ {'id', binary() }
  | {'type', binary() }
  | {'retrieval', map() }
  ].


openapi_run_step_details_tool_calls_retrieval_object() ->
    openapi_run_step_details_tool_calls_retrieval_object([]).

openapi_run_step_details_tool_calls_retrieval_object(Fields) ->
  Default = [ {'id', binary() }
            , {'type', elements([<<"retrieval">>]) }
            , {'retrieval', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

