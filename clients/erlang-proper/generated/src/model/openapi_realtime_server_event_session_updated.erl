-module(openapi_realtime_server_event_session_updated).

-include("openapi.hrl").

-export([openapi_realtime_server_event_session_updated/0]).

-export([openapi_realtime_server_event_session_updated/1]).

-export_type([openapi_realtime_server_event_session_updated/0]).

-type openapi_realtime_server_event_session_updated() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'session', openapi_realtime_session:openapi_realtime_session() }
  ].


openapi_realtime_server_event_session_updated() ->
    openapi_realtime_server_event_session_updated([]).

openapi_realtime_server_event_session_updated(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"session.updated">>]) }
            , {'session', openapi_realtime_session:openapi_realtime_session() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

