-module(openapi_thread_stream_event).

-include("openapi.hrl").

-export([openapi_thread_stream_event/0]).

-export([openapi_thread_stream_event/1]).

-export_type([openapi_thread_stream_event/0]).

-type openapi_thread_stream_event() ::
  [ {'event', binary() }
  | {'data', openapi_thread_object:openapi_thread_object() }
  ].


openapi_thread_stream_event() ->
    openapi_thread_stream_event([]).

openapi_thread_stream_event(Fields) ->
  Default = [ {'event', elements([<<"thread.created">>]) }
            , {'data', openapi_thread_object:openapi_thread_object() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

