-module(openapi_realtime_session_turn_detection).

-include("openapi.hrl").

-export([openapi_realtime_session_turn_detection/0]).

-export([openapi_realtime_session_turn_detection/1]).

-export_type([openapi_realtime_session_turn_detection/0]).

-type openapi_realtime_session_turn_detection() ::
  [ {'type', binary() }
  | {'threshold', integer() }
  | {'prefix_padding_ms', integer() }
  | {'silence_duration_ms', integer() }
  ].


openapi_realtime_session_turn_detection() ->
    openapi_realtime_session_turn_detection([]).

openapi_realtime_session_turn_detection(Fields) ->
  Default = [ {'type', elements([<<"server_vad">>]) }
            , {'threshold', integer() }
            , {'prefix_padding_ms', integer() }
            , {'silence_duration_ms', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

