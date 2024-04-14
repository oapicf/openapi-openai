-module(openapi_transcription_word).

-include("openapi.hrl").

-export([openapi_transcription_word/0]).

-export([openapi_transcription_word/1]).

-export_type([openapi_transcription_word/0]).

-type openapi_transcription_word() ::
  [ {'word', binary() }
  | {'start', integer() }
  | {'End_', integer() }
  ].


openapi_transcription_word() ->
    openapi_transcription_word([]).

openapi_transcription_word(Fields) ->
  Default = [ {'word', binary() }
            , {'start', integer() }
            , {'end', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

