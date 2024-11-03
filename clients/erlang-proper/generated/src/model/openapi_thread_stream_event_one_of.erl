-module(openapi_thread_stream_event_one_of).

-include("openapi.hrl").

-export([openapi_thread_stream_event_one_of/0]).

-export([openapi_thread_stream_event_one_of/1]).

-export_type([openapi_thread_stream_event_one_of/0]).

-type openapi_thread_stream_event_one_of() ::
  [ {'event', binary() }
  | {'data', openapi_thread_object:openapi_thread_object() }
  ].


openapi_thread_stream_event_one_of() ->
    openapi_thread_stream_event_one_of([]).

openapi_thread_stream_event_one_of(Fields) ->
  Default = [ {'event', elements([<<"thread.created">>]) }
            , {'data', openapi_thread_object:openapi_thread_object() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

