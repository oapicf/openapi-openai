-module(openapi_run_step_delta_step_details_tool_calls_retrieval_object).

-include("openapi.hrl").

-export([openapi_run_step_delta_step_details_tool_calls_retrieval_object/0]).

-export([openapi_run_step_delta_step_details_tool_calls_retrieval_object/1]).

-export_type([openapi_run_step_delta_step_details_tool_calls_retrieval_object/0]).

-type openapi_run_step_delta_step_details_tool_calls_retrieval_object() ::
  [ {'index', integer() }
  | {'id', binary() }
  | {'type', binary() }
  | {'retrieval', map() }
  ].


openapi_run_step_delta_step_details_tool_calls_retrieval_object() ->
    openapi_run_step_delta_step_details_tool_calls_retrieval_object([]).

openapi_run_step_delta_step_details_tool_calls_retrieval_object(Fields) ->
  Default = [ {'index', integer() }
            , {'id', binary() }
            , {'type', elements([<<"retrieval">>]) }
            , {'retrieval', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

