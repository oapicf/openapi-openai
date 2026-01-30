-module(openapi_realtime_server_event_error_error).

-include("openapi.hrl").

-export([openapi_realtime_server_event_error_error/0]).

-export([openapi_realtime_server_event_error_error/1]).

-export_type([openapi_realtime_server_event_error_error/0]).

-type openapi_realtime_server_event_error_error() ::
  [ {'type', binary() }
  | {'code', binary() }
  | {'message', binary() }
  | {'param', binary() }
  | {'event_id', binary() }
  ].


openapi_realtime_server_event_error_error() ->
    openapi_realtime_server_event_error_error([]).

openapi_realtime_server_event_error_error(Fields) ->
  Default = [ {'type', binary() }
            , {'code', binary() }
            , {'message', binary() }
            , {'param', binary() }
            , {'event_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

