-module(openapi_realtime_server_event_input_audio_buffer_speech_stopped).

-include("openapi.hrl").

-export([openapi_realtime_server_event_input_audio_buffer_speech_stopped/0]).

-export([openapi_realtime_server_event_input_audio_buffer_speech_stopped/1]).

-export_type([openapi_realtime_server_event_input_audio_buffer_speech_stopped/0]).

-type openapi_realtime_server_event_input_audio_buffer_speech_stopped() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'audio_end_ms', integer() }
  | {'item_id', binary() }
  ].


openapi_realtime_server_event_input_audio_buffer_speech_stopped() ->
    openapi_realtime_server_event_input_audio_buffer_speech_stopped([]).

openapi_realtime_server_event_input_audio_buffer_speech_stopped(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"input_audio_buffer.speech_stopped">>]) }
            , {'audio_end_ms', integer() }
            , {'item_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

