-module(openapi_create_translation_response_verbose_json).

-export([encode/1]).

-export_type([openapi_create_translation_response_verbose_json/0]).

-type openapi_create_translation_response_verbose_json() ::
    #{ 'language' := binary(),
       'duration' := binary(),
       'text' := binary(),
       'segments' => list()
     }.

encode(#{ 'language' := Language,
          'duration' := Duration,
          'text' := Text,
          'segments' := Segments
        }) ->
    #{ 'language' => Language,
       'duration' => Duration,
       'text' => Text,
       'segments' => Segments
     }.
