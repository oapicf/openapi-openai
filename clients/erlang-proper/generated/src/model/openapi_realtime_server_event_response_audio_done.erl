-module(openapi_realtime_server_event_response_audio_done).

-include("openapi.hrl").

-export([openapi_realtime_server_event_response_audio_done/0]).

-export([openapi_realtime_server_event_response_audio_done/1]).

-export_type([openapi_realtime_server_event_response_audio_done/0]).

-type openapi_realtime_server_event_response_audio_done() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'response_id', binary() }
  | {'item_id', binary() }
  | {'output_index', integer() }
  | {'content_index', integer() }
  ].


openapi_realtime_server_event_response_audio_done() ->
    openapi_realtime_server_event_response_audio_done([]).

openapi_realtime_server_event_response_audio_done(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"response.audio.done">>]) }
            , {'response_id', binary() }
            , {'item_id', binary() }
            , {'output_index', integer() }
            , {'content_index', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

