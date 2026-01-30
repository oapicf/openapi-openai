-module(openapi_realtime_server_event_conversation_created).

-include("openapi.hrl").

-export([openapi_realtime_server_event_conversation_created/0]).

-export([openapi_realtime_server_event_conversation_created/1]).

-export_type([openapi_realtime_server_event_conversation_created/0]).

-type openapi_realtime_server_event_conversation_created() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'conversation', openapi_realtime_server_event_conversation_created_conversation:openapi_realtime_server_event_conversation_created_conversation() }
  ].


openapi_realtime_server_event_conversation_created() ->
    openapi_realtime_server_event_conversation_created([]).

openapi_realtime_server_event_conversation_created(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"conversation.created">>]) }
            , {'conversation', openapi_realtime_server_event_conversation_created_conversation:openapi_realtime_server_event_conversation_created_conversation() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

