-module(openapi_realtime_server_event_session_created).

-include("openapi.hrl").

-export([openapi_realtime_server_event_session_created/0]).

-export([openapi_realtime_server_event_session_created/1]).

-export_type([openapi_realtime_server_event_session_created/0]).

-type openapi_realtime_server_event_session_created() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'session', openapi_realtime_session:openapi_realtime_session() }
  ].


openapi_realtime_server_event_session_created() ->
    openapi_realtime_server_event_session_created([]).

openapi_realtime_server_event_session_created(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"session.created">>]) }
            , {'session', openapi_realtime_session:openapi_realtime_session() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

