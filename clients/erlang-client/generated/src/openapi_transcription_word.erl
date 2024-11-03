-module(openapi_transcription_word).

-export([encode/1]).

-export_type([openapi_transcription_word/0]).

-type openapi_transcription_word() ::
    #{ 'word' := binary(),
       'start' := integer(),
       'End_' := integer()
     }.

encode(#{ 'word' := Word,
          'start' := Start,
          'End_' := End
        }) ->
    #{ 'word' => Word,
       'start' => Start,
       'end' => End
     }.
