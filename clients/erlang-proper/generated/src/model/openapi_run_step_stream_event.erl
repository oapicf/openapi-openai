-module(openapi_run_step_stream_event).

-include("openapi.hrl").

-export([openapi_run_step_stream_event/0]).

-export([openapi_run_step_stream_event/1]).

-export_type([openapi_run_step_stream_event/0]).

-type openapi_run_step_stream_event() ::
  [ {'event', binary() }
  | {'data', openapi_run_step_object:openapi_run_step_object() }
  ].


openapi_run_step_stream_event() ->
    openapi_run_step_stream_event([]).

openapi_run_step_stream_event(Fields) ->
  Default = [ {'event', elements([<<"thread.run.step.expired">>]) }
            , {'data', openapi_run_step_object:openapi_run_step_object() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

