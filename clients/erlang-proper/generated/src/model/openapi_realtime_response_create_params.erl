-module(openapi_realtime_response_create_params).

-include("openapi.hrl").

-export([openapi_realtime_response_create_params/0]).

-export([openapi_realtime_response_create_params/1]).

-export_type([openapi_realtime_response_create_params/0]).

-type openapi_realtime_response_create_params() ::
  [ {'modalities', list(binary()) }
  | {'instructions', binary() }
  | {'voice', binary() }
  | {'output_audio_format', binary() }
  | {'tools', list(openapi_realtime_response_create_params_tools_inner:openapi_realtime_response_create_params_tools_inner()) }
  | {'tool_choice', binary() }
  | {'temperature', integer() }
  | {'max_response_output_tokens', openapi_realtime_response_create_params_max_response_output_tokens:openapi_realtime_response_create_params_max_response_output_tokens() }
  | {'conversation', openapi_realtime_response_create_params_conversation:openapi_realtime_response_create_params_conversation() }
  | {'metadata', map() }
  | {'input', list(openapi_realtime_conversation_item:openapi_realtime_conversation_item()) }
  ].


openapi_realtime_response_create_params() ->
    openapi_realtime_response_create_params([]).

openapi_realtime_response_create_params(Fields) ->
  Default = [ {'modalities', list(binary()) }
            , {'instructions', binary() }
            , {'voice', elements([<<"alloy">>, <<"ash">>, <<"ballad">>, <<"coral">>, <<"echo">>, <<"sage">>, <<"shimmer">>, <<"verse">>]) }
            , {'output_audio_format', elements([<<"pcm16">>, <<"g711_ulaw">>, <<"g711_alaw">>]) }
            , {'tools', list(openapi_realtime_response_create_params_tools_inner:openapi_realtime_response_create_params_tools_inner()) }
            , {'tool_choice', binary() }
            , {'temperature', integer() }
            , {'max_response_output_tokens', openapi_realtime_response_create_params_max_response_output_tokens:openapi_realtime_response_create_params_max_response_output_tokens() }
            , {'conversation', openapi_realtime_response_create_params_conversation:openapi_realtime_response_create_params_conversation() }
            , {'metadata', map() }
            , {'input', list(openapi_realtime_conversation_item:openapi_realtime_conversation_item()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

