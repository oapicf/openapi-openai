-module(openapi_create_transcription_200_response).

-export([encode/1]).

-export_type([openapi_create_transcription_200_response/0]).

-type openapi_create_transcription_200_response() ::
    #{ 'text' := binary(),
       'language' := binary(),
       'duration' := binary(),
       'words' => list(),
       'segments' => list()
     }.

encode(#{ 'text' := Text,
          'language' := Language,
          'duration' := Duration,
          'words' := Words,
          'segments' := Segments
        }) ->
    #{ 'text' => Text,
       'language' => Language,
       'duration' => Duration,
       'words' => Words,
       'segments' => Segments
     }.
