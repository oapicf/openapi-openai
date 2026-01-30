-module(openapi_realtime_server_event_error).

-include("openapi.hrl").

-export([openapi_realtime_server_event_error/0]).

-export([openapi_realtime_server_event_error/1]).

-export_type([openapi_realtime_server_event_error/0]).

-type openapi_realtime_server_event_error() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'error', openapi_realtime_server_event_error_error:openapi_realtime_server_event_error_error() }
  ].


openapi_realtime_server_event_error() ->
    openapi_realtime_server_event_error([]).

openapi_realtime_server_event_error(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"error">>]) }
            , {'error', openapi_realtime_server_event_error_error:openapi_realtime_server_event_error_error() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

