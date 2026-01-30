-module(openapi_realtime_session_input_audio_transcription).

-include("openapi.hrl").

-export([openapi_realtime_session_input_audio_transcription/0]).

-export([openapi_realtime_session_input_audio_transcription/1]).

-export_type([openapi_realtime_session_input_audio_transcription/0]).

-type openapi_realtime_session_input_audio_transcription() ::
  [ {'model', binary() }
  ].


openapi_realtime_session_input_audio_transcription() ->
    openapi_realtime_session_input_audio_transcription([]).

openapi_realtime_session_input_audio_transcription(Fields) ->
  Default = [ {'model', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

