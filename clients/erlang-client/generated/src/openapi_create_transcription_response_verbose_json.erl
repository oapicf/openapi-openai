-module(openapi_create_transcription_response_verbose_json).

-export([encode/1]).

-export_type([openapi_create_transcription_response_verbose_json/0]).

-type openapi_create_transcription_response_verbose_json() ::
    #{ 'language' := binary(),
       'duration' := binary(),
       'text' := binary(),
       'words' => list(),
       'segments' => list()
     }.

encode(#{ 'language' := Language,
          'duration' := Duration,
          'text' := Text,
          'words' := Words,
          'segments' := Segments
        }) ->
    #{ 'language' => Language,
       'duration' => Duration,
       'text' => Text,
       'words' => Words,
       'segments' => Segments
     }.
