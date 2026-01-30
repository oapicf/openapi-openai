-module(openapi_realtime_server_event_conversation_item_input_audio_transcription_failed_error).

-include("openapi.hrl").

-export([openapi_realtime_server_event_conversation_item_input_audio_transcription_failed_error/0]).

-export([openapi_realtime_server_event_conversation_item_input_audio_transcription_failed_error/1]).

-export_type([openapi_realtime_server_event_conversation_item_input_audio_transcription_failed_error/0]).

-type openapi_realtime_server_event_conversation_item_input_audio_transcription_failed_error() ::
  [ {'type', binary() }
  | {'code', binary() }
  | {'message', binary() }
  | {'param', binary() }
  ].


openapi_realtime_server_event_conversation_item_input_audio_transcription_failed_error() ->
    openapi_realtime_server_event_conversation_item_input_audio_transcription_failed_error([]).

openapi_realtime_server_event_conversation_item_input_audio_transcription_failed_error(Fields) ->
  Default = [ {'type', binary() }
            , {'code', binary() }
            , {'message', binary() }
            , {'param', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

