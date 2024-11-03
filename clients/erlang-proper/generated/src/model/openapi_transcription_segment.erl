-module(openapi_transcription_segment).

-include("openapi.hrl").

-export([openapi_transcription_segment/0]).

-export([openapi_transcription_segment/1]).

-export_type([openapi_transcription_segment/0]).

-type openapi_transcription_segment() ::
  [ {'id', integer() }
  | {'seek', integer() }
  | {'start', integer() }
  | {'End_', integer() }
  | {'text', binary() }
  | {'tokens', list(integer()) }
  | {'temperature', integer() }
  | {'avg_logprob', integer() }
  | {'compression_ratio', integer() }
  | {'no_speech_prob', integer() }
  ].


openapi_transcription_segment() ->
    openapi_transcription_segment([]).

openapi_transcription_segment(Fields) ->
  Default = [ {'id', integer() }
            , {'seek', integer() }
            , {'start', integer() }
            , {'end', integer() }
            , {'text', binary() }
            , {'tokens', list(integer()) }
            , {'temperature', integer() }
            , {'avg_logprob', integer() }
            , {'compression_ratio', integer() }
            , {'no_speech_prob', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

