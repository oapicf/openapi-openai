-module(openapi_run_stream_event_one_of_5).

-include("openapi.hrl").

-export([openapi_run_stream_event_one_of_5/0]).

-export([openapi_run_stream_event_one_of_5/1]).

-export_type([openapi_run_stream_event_one_of_5/0]).

-type openapi_run_stream_event_one_of_5() ::
  [ {'event', binary() }
  | {'data', openapi_run_object:openapi_run_object() }
  ].


openapi_run_stream_event_one_of_5() ->
    openapi_run_stream_event_one_of_5([]).

openapi_run_stream_event_one_of_5(Fields) ->
  Default = [ {'event', elements([<<"thread.run.failed">>]) }
            , {'data', openapi_run_object:openapi_run_object() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

