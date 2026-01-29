-module(openapi_message_stream_event_one_of_4).

-include("openapi.hrl").

-export([openapi_message_stream_event_one_of_4/0]).

-export([openapi_message_stream_event_one_of_4/1]).

-export_type([openapi_message_stream_event_one_of_4/0]).

-type openapi_message_stream_event_one_of_4() ::
  [ {'event', binary() }
  | {'data', openapi_message_object:openapi_message_object() }
  ].


openapi_message_stream_event_one_of_4() ->
    openapi_message_stream_event_one_of_4([]).

openapi_message_stream_event_one_of_4(Fields) ->
  Default = [ {'event', elements([<<"thread.message.incomplete">>]) }
            , {'data', openapi_message_object:openapi_message_object() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

