-module(openapi_realtime_server_event_input_audio_buffer_speech_started).

-include("openapi.hrl").

-export([openapi_realtime_server_event_input_audio_buffer_speech_started/0]).

-export([openapi_realtime_server_event_input_audio_buffer_speech_started/1]).

-export_type([openapi_realtime_server_event_input_audio_buffer_speech_started/0]).

-type openapi_realtime_server_event_input_audio_buffer_speech_started() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'audio_start_ms', integer() }
  | {'item_id', binary() }
  ].


openapi_realtime_server_event_input_audio_buffer_speech_started() ->
    openapi_realtime_server_event_input_audio_buffer_speech_started([]).

openapi_realtime_server_event_input_audio_buffer_speech_started(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"input_audio_buffer.speech_started">>]) }
            , {'audio_start_ms', integer() }
            , {'item_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

