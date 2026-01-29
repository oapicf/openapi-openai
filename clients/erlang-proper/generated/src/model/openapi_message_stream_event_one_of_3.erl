-module(openapi_message_stream_event_one_of_3).

-include("openapi.hrl").

-export([openapi_message_stream_event_one_of_3/0]).

-export([openapi_message_stream_event_one_of_3/1]).

-export_type([openapi_message_stream_event_one_of_3/0]).

-type openapi_message_stream_event_one_of_3() ::
  [ {'event', binary() }
  | {'data', openapi_message_object:openapi_message_object() }
  ].


openapi_message_stream_event_one_of_3() ->
    openapi_message_stream_event_one_of_3([]).

openapi_message_stream_event_one_of_3(Fields) ->
  Default = [ {'event', elements([<<"thread.message.completed">>]) }
            , {'data', openapi_message_object:openapi_message_object() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

