-module(openapi_message_stream_event_one_of_2).

-include("openapi.hrl").

-export([openapi_message_stream_event_one_of_2/0]).

-export([openapi_message_stream_event_one_of_2/1]).

-export_type([openapi_message_stream_event_one_of_2/0]).

-type openapi_message_stream_event_one_of_2() ::
  [ {'event', binary() }
  | {'data', openapi_message_delta_object:openapi_message_delta_object() }
  ].


openapi_message_stream_event_one_of_2() ->
    openapi_message_stream_event_one_of_2([]).

openapi_message_stream_event_one_of_2(Fields) ->
  Default = [ {'event', elements([<<"thread.message.delta">>]) }
            , {'data', openapi_message_delta_object:openapi_message_delta_object() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

