-module(openapi_audio_response_format).

-include("openapi.hrl").

-export([openapi_audio_response_format/0]).

-export_type([openapi_audio_response_format/0]).

-type openapi_audio_response_format() ::
  binary().

openapi_audio_response_format() ->
  elements([<<"json">>, <<"text">>, <<"srt">>, <<"verbose_json">>, <<"vtt">>]).

