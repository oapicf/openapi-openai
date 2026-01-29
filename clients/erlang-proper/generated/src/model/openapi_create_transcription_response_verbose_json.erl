-module(openapi_create_transcription_response_verbose_json).

-include("openapi.hrl").

-export([openapi_create_transcription_response_verbose_json/0]).

-export([openapi_create_transcription_response_verbose_json/1]).

-export_type([openapi_create_transcription_response_verbose_json/0]).

-type openapi_create_transcription_response_verbose_json() ::
  [ {'language', binary() }
  | {'duration', binary() }
  | {'text', binary() }
  | {'words', list(openapi_transcription_word:openapi_transcription_word()) }
  | {'segments', list(openapi_transcription_segment:openapi_transcription_segment()) }
  ].


openapi_create_transcription_response_verbose_json() ->
    openapi_create_transcription_response_verbose_json([]).

openapi_create_transcription_response_verbose_json(Fields) ->
  Default = [ {'language', binary() }
            , {'duration', binary() }
            , {'text', binary() }
            , {'words', list(openapi_transcription_word:openapi_transcription_word()) }
            , {'segments', list(openapi_transcription_segment:openapi_transcription_segment()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

