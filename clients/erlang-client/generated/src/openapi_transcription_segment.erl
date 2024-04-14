-module(openapi_transcription_segment).

-export([encode/1]).

-export_type([openapi_transcription_segment/0]).

-type openapi_transcription_segment() ::
    #{ 'id' := integer(),
       'seek' := integer(),
       'start' := integer(),
       'End_' := integer(),
       'text' := binary(),
       'tokens' := list(),
       'temperature' := integer(),
       'avg_logprob' := integer(),
       'compression_ratio' := integer(),
       'no_speech_prob' := integer()
     }.

encode(#{ 'id' := Id,
          'seek' := Seek,
          'start' := Start,
          'End_' := End,
          'text' := Text,
          'tokens' := Tokens,
          'temperature' := Temperature,
          'avg_logprob' := AvgLogprob,
          'compression_ratio' := CompressionRatio,
          'no_speech_prob' := NoSpeechProb
        }) ->
    #{ 'id' => Id,
       'seek' => Seek,
       'start' => Start,
       'end' => End,
       'text' => Text,
       'tokens' => Tokens,
       'temperature' => Temperature,
       'avg_logprob' => AvgLogprob,
       'compression_ratio' => CompressionRatio,
       'no_speech_prob' => NoSpeechProb
     }.
