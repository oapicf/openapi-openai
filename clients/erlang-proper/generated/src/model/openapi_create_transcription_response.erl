-module(openapi_create_transcription_response).

-include("openapi.hrl").

-export([openapi_create_transcription_response/0]).

-export([openapi_create_transcription_response/1]).

-export_type([openapi_create_transcription_response/0]).

-type openapi_create_transcription_response() ::
  [ {'text', binary() }
  ].


openapi_create_transcription_response() ->
    openapi_create_transcription_response([]).

openapi_create_transcription_response(Fields) ->
  Default = [ {'text', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

