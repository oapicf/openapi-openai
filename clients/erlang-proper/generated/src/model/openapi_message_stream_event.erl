-module(openapi_message_stream_event).

-include("openapi.hrl").

-export([openapi_message_stream_event/0]).

-export([openapi_message_stream_event/1]).

-export_type([openapi_message_stream_event/0]).

-type openapi_message_stream_event() ::
  [ {'event', binary() }
  | {'data', openapi_message_object:openapi_message_object() }
  ].


openapi_message_stream_event() ->
    openapi_message_stream_event([]).

openapi_message_stream_event(Fields) ->
  Default = [ {'event', elements([<<"thread.message.incomplete">>]) }
            , {'data', openapi_message_object:openapi_message_object() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

