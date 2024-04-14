-module(openapi_run_stream_event_one_of).

-include("openapi.hrl").

-export([openapi_run_stream_event_one_of/0]).

-export([openapi_run_stream_event_one_of/1]).

-export_type([openapi_run_stream_event_one_of/0]).

-type openapi_run_stream_event_one_of() ::
  [ {'event', binary() }
  | {'data', openapi_run_object:openapi_run_object() }
  ].


openapi_run_stream_event_one_of() ->
    openapi_run_stream_event_one_of([]).

openapi_run_stream_event_one_of(Fields) ->
  Default = [ {'event', elements([<<"thread.run.created">>]) }
            , {'data', openapi_run_object:openapi_run_object() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

