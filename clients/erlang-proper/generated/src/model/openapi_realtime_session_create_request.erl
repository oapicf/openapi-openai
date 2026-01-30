-module(openapi_realtime_session_create_request).

-include("openapi.hrl").

-export([openapi_realtime_session_create_request/0]).

-export([openapi_realtime_session_create_request/1]).

-export_type([openapi_realtime_session_create_request/0]).

-type openapi_realtime_session_create_request() ::
  [ {'modalities', list(binary()) }
  | {'model', binary() }
  | {'instructions', binary() }
  | {'voice', binary() }
  | {'input_audio_format', binary() }
  | {'output_audio_format', binary() }
  | {'input_audio_transcription', openapi_realtime_session_input_audio_transcription:openapi_realtime_session_input_audio_transcription() }
  | {'turn_detection', openapi_realtime_session_create_request_turn_detection:openapi_realtime_session_create_request_turn_detection() }
  | {'tools', list(openapi_realtime_response_create_params_tools_inner:openapi_realtime_response_create_params_tools_inner()) }
  | {'tool_choice', binary() }
  | {'temperature', integer() }
  | {'max_response_output_tokens', openapi_realtime_response_create_params_max_response_output_tokens:openapi_realtime_response_create_params_max_response_output_tokens() }
  ].


openapi_realtime_session_create_request() ->
    openapi_realtime_session_create_request([]).

openapi_realtime_session_create_request(Fields) ->
  Default = [ {'modalities', list(binary()) }
            , {'model', elements([<<"gpt-4o-realtime-preview">>, <<"gpt-4o-realtime-preview-2024-10-01">>, <<"gpt-4o-realtime-preview-2024-12-17">>, <<"gpt-4o-mini-realtime-preview">>, <<"gpt-4o-mini-realtime-preview-2024-12-17">>]) }
            , {'instructions', binary() }
            , {'voice', elements([<<"alloy">>, <<"ash">>, <<"ballad">>, <<"coral">>, <<"echo">>, <<"sage">>, <<"shimmer">>, <<"verse">>]) }
            , {'input_audio_format', elements([<<"pcm16">>, <<"g711_ulaw">>, <<"g711_alaw">>]) }
            , {'output_audio_format', elements([<<"pcm16">>, <<"g711_ulaw">>, <<"g711_alaw">>]) }
            , {'input_audio_transcription', openapi_realtime_session_input_audio_transcription:openapi_realtime_session_input_audio_transcription() }
            , {'turn_detection', openapi_realtime_session_create_request_turn_detection:openapi_realtime_session_create_request_turn_detection() }
            , {'tools', list(openapi_realtime_response_create_params_tools_inner:openapi_realtime_response_create_params_tools_inner()) }
            , {'tool_choice', binary() }
            , {'temperature', integer() }
            , {'max_response_output_tokens', openapi_realtime_response_create_params_max_response_output_tokens:openapi_realtime_response_create_params_max_response_output_tokens() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

