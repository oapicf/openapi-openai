-module(openapi_realtime_server_event_response_audio_delta).

-include("openapi.hrl").

-export([openapi_realtime_server_event_response_audio_delta/0]).

-export([openapi_realtime_server_event_response_audio_delta/1]).

-export_type([openapi_realtime_server_event_response_audio_delta/0]).

-type openapi_realtime_server_event_response_audio_delta() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'response_id', binary() }
  | {'item_id', binary() }
  | {'output_index', integer() }
  | {'content_index', integer() }
  | {'delta', binary() }
  ].


openapi_realtime_server_event_response_audio_delta() ->
    openapi_realtime_server_event_response_audio_delta([]).

openapi_realtime_server_event_response_audio_delta(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"response.audio.delta">>]) }
            , {'response_id', binary() }
            , {'item_id', binary() }
            , {'output_index', integer() }
            , {'content_index', integer() }
            , {'delta', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

