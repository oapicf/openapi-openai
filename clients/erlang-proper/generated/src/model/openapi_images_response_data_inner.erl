-module(openapi_images_response_data_inner).

-include("openapi.hrl").

-export([openapi_images_response_data_inner/0]).

-export([openapi_images_response_data_inner/1]).

-export_type([openapi_images_response_data_inner/0]).

-type openapi_images_response_data_inner() ::
  [ {'url', binary() }
  | {'b64_json', binary() }
  ].


openapi_images_response_data_inner() ->
    openapi_images_response_data_inner([]).

openapi_images_response_data_inner(Fields) ->
  Default = [ {'url', binary() }
            , {'b64_json', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

