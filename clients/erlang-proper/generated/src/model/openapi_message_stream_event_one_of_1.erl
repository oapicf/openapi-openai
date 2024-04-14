-module(openapi_message_stream_event_one_of_1).

-include("openapi.hrl").

-export([openapi_message_stream_event_one_of_1/0]).

-export([openapi_message_stream_event_one_of_1/1]).

-export_type([openapi_message_stream_event_one_of_1/0]).

-type openapi_message_stream_event_one_of_1() ::
  [ {'event', binary() }
  | {'data', openapi_message_object:openapi_message_object() }
  ].


openapi_message_stream_event_one_of_1() ->
    openapi_message_stream_event_one_of_1([]).

openapi_message_stream_event_one_of_1(Fields) ->
  Default = [ {'event', elements([<<"thread.message.in_progress">>]) }
            , {'data', openapi_message_object:openapi_message_object() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

