-module(openapi_message_stream_event_one_of).

-include("openapi.hrl").

-export([openapi_message_stream_event_one_of/0]).

-export([openapi_message_stream_event_one_of/1]).

-export_type([openapi_message_stream_event_one_of/0]).

-type openapi_message_stream_event_one_of() ::
  [ {'event', binary() }
  | {'data', openapi_message_object:openapi_message_object() }
  ].


openapi_message_stream_event_one_of() ->
    openapi_message_stream_event_one_of([]).

openapi_message_stream_event_one_of(Fields) ->
  Default = [ {'event', elements([<<"thread.message.created">>]) }
            , {'data', openapi_message_object:openapi_message_object() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

