-module(openapi_create_translation_response_json).

-include("openapi.hrl").

-export([openapi_create_translation_response_json/0]).

-export([openapi_create_translation_response_json/1]).

-export_type([openapi_create_translation_response_json/0]).

-type openapi_create_translation_response_json() ::
  [ {'text', binary() }
  ].


openapi_create_translation_response_json() ->
    openapi_create_translation_response_json([]).

openapi_create_translation_response_json(Fields) ->
  Default = [ {'text', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

