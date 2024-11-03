-module(openapi_run_stream_event_one_of_1).

-include("openapi.hrl").

-export([openapi_run_stream_event_one_of_1/0]).

-export([openapi_run_stream_event_one_of_1/1]).

-export_type([openapi_run_stream_event_one_of_1/0]).

-type openapi_run_stream_event_one_of_1() ::
  [ {'event', binary() }
  | {'data', openapi_run_object:openapi_run_object() }
  ].


openapi_run_stream_event_one_of_1() ->
    openapi_run_stream_event_one_of_1([]).

openapi_run_stream_event_one_of_1(Fields) ->
  Default = [ {'event', elements([<<"thread.run.queued">>]) }
            , {'data', openapi_run_object:openapi_run_object() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

