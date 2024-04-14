-module(openapi_images_response).

-include("openapi.hrl").

-export([openapi_images_response/0]).

-export([openapi_images_response/1]).

-export_type([openapi_images_response/0]).

-type openapi_images_response() ::
  [ {'created', integer() }
  | {'data', list(openapi_image:openapi_image()) }
  ].


openapi_images_response() ->
    openapi_images_response([]).

openapi_images_response(Fields) ->
  Default = [ {'created', integer() }
            , {'data', list(openapi_image:openapi_image()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

