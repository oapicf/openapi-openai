-module(openapi_create_transcription_200_response).

-include("openapi.hrl").

-export([openapi_create_transcription_200_response/0]).

-export([openapi_create_transcription_200_response/1]).

-export_type([openapi_create_transcription_200_response/0]).

-type openapi_create_transcription_200_response() ::
  [ {'text', binary() }
  | {'language', binary() }
  | {'duration', binary() }
  | {'words', list(openapi_transcription_word:openapi_transcription_word()) }
  | {'segments', list(openapi_transcription_segment:openapi_transcription_segment()) }
  ].


openapi_create_transcription_200_response() ->
    openapi_create_transcription_200_response([]).

openapi_create_transcription_200_response(Fields) ->
  Default = [ {'text', binary() }
            , {'language', binary() }
            , {'duration', binary() }
            , {'words', list(openapi_transcription_word:openapi_transcription_word()) }
            , {'segments', list(openapi_transcription_segment:openapi_transcription_segment()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

