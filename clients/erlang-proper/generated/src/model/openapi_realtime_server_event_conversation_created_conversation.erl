-module(openapi_realtime_server_event_conversation_created_conversation).

-include("openapi.hrl").

-export([openapi_realtime_server_event_conversation_created_conversation/0]).

-export([openapi_realtime_server_event_conversation_created_conversation/1]).

-export_type([openapi_realtime_server_event_conversation_created_conversation/0]).

-type openapi_realtime_server_event_conversation_created_conversation() ::
  [ {'id', binary() }
  | {'object', binary() }
  ].


openapi_realtime_server_event_conversation_created_conversation() ->
    openapi_realtime_server_event_conversation_created_conversation([]).

openapi_realtime_server_event_conversation_created_conversation(Fields) ->
  Default = [ {'id', binary() }
            , {'object', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

