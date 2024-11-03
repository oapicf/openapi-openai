-module(openapi_create_translation_200_response).

-export([encode/1]).

-export_type([openapi_create_translation_200_response/0]).

-type openapi_create_translation_200_response() ::
    #{ 'text' := binary(),
       'language' := binary(),
       'duration' := binary(),
       'segments' => list()
     }.

encode(#{ 'text' := Text,
          'language' := Language,
          'duration' := Duration,
          'segments' := Segments
        }) ->
    #{ 'text' => Text,
       'language' => Language,
       'duration' => Duration,
       'segments' => Segments
     }.
