-module(openapi_image).

-include("openapi.hrl").

-export([openapi_image/0]).

-export([openapi_image/1]).

-export_type([openapi_image/0]).

-type openapi_image() ::
  [ {'b64_json', binary() }
  | {'url', binary() }
  | {'revised_prompt', binary() }
  ].


openapi_image() ->
    openapi_image([]).

openapi_image(Fields) ->
  Default = [ {'b64_json', binary() }
            , {'url', binary() }
            , {'revised_prompt', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

