-module(openapi_realtime_session_input_audio_transcription).

-export([encode/1]).

-export_type([openapi_realtime_session_input_audio_transcription/0]).

-type openapi_realtime_session_input_audio_transcription() ::
    #{ 'model' => binary()
     }.

encode(#{ 'model' := Model
        }) ->
    #{ 'model' => Model
     }.
