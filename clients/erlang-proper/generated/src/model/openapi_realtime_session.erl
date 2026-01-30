-module(openapi_realtime_session).

-include("openapi.hrl").

-export([openapi_realtime_session/0]).

-export([openapi_realtime_session/1]).

-export_type([openapi_realtime_session/0]).

-type openapi_realtime_session() ::
  [ {'id', binary() }
  | {'modalities', list(binary()) }
  | {'model', openapi_realtime_session_model:openapi_realtime_session_model() }
  | {'instructions', binary() }
  | {'voice', binary() }
  | {'input_audio_format', binary() }
  | {'output_audio_format', binary() }
  | {'input_audio_transcription', openapi_realtime_session_input_audio_transcription:openapi_realtime_session_input_audio_transcription() }
  | {'turn_detection', openapi_realtime_session_turn_detection:openapi_realtime_session_turn_detection() }
  | {'tools', list(openapi_realtime_response_create_params_tools_inner:openapi_realtime_response_create_params_tools_inner()) }
  | {'tool_choice', binary() }
  | {'temperature', integer() }
  | {'max_response_output_tokens', openapi_realtime_response_create_params_max_response_output_tokens:openapi_realtime_response_create_params_max_response_output_tokens() }
  ].


openapi_realtime_session() ->
    openapi_realtime_session([]).

openapi_realtime_session(Fields) ->
  Default = [ {'id', binary() }
            , {'modalities', list(binary()) }
            , {'model', openapi_realtime_session_model:openapi_realtime_session_model() }
            , {'instructions', binary() }
            , {'voice', elements([<<"alloy">>, <<"ash">>, <<"ballad">>, <<"coral">>, <<"echo">>, <<"sage">>, <<"shimmer">>, <<"verse">>]) }
            , {'input_audio_format', elements([<<"pcm16">>, <<"g711_ulaw">>, <<"g711_alaw">>]) }
            , {'output_audio_format', elements([<<"pcm16">>, <<"g711_ulaw">>, <<"g711_alaw">>]) }
            , {'input_audio_transcription', openapi_realtime_session_input_audio_transcription:openapi_realtime_session_input_audio_transcription() }
            , {'turn_detection', openapi_realtime_session_turn_detection:openapi_realtime_session_turn_detection() }
            , {'tools', list(openapi_realtime_response_create_params_tools_inner:openapi_realtime_response_create_params_tools_inner()) }
            , {'tool_choice', binary() }
            , {'temperature', integer() }
            , {'max_response_output_tokens', openapi_realtime_response_create_params_max_response_output_tokens:openapi_realtime_response_create_params_max_response_output_tokens() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

