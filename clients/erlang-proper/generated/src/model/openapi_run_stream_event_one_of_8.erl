-module(openapi_run_stream_event_one_of_8).

-include("openapi.hrl").

-export([openapi_run_stream_event_one_of_8/0]).

-export([openapi_run_stream_event_one_of_8/1]).

-export_type([openapi_run_stream_event_one_of_8/0]).

-type openapi_run_stream_event_one_of_8() ::
  [ {'event', binary() }
  | {'data', openapi_run_object:openapi_run_object() }
  ].


openapi_run_stream_event_one_of_8() ->
    openapi_run_stream_event_one_of_8([]).

openapi_run_stream_event_one_of_8(Fields) ->
  Default = [ {'event', elements([<<"thread.run.expired">>]) }
            , {'data', openapi_run_object:openapi_run_object() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

