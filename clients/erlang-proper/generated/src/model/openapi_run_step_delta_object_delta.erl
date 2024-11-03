-module(openapi_run_step_delta_object_delta).

-include("openapi.hrl").

-export([openapi_run_step_delta_object_delta/0]).

-export([openapi_run_step_delta_object_delta/1]).

-export_type([openapi_run_step_delta_object_delta/0]).

-type openapi_run_step_delta_object_delta() ::
  [ {'step_details', openapi_run_step_delta_object_delta_step_details:openapi_run_step_delta_object_delta_step_details() }
  ].


openapi_run_step_delta_object_delta() ->
    openapi_run_step_delta_object_delta([]).

openapi_run_step_delta_object_delta(Fields) ->
  Default = [ {'step_details', openapi_run_step_delta_object_delta_step_details:openapi_run_step_delta_object_delta_step_details() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

