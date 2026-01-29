-module(openapi_list_models_response).

-include("openapi.hrl").

-export([openapi_list_models_response/0]).

-export([openapi_list_models_response/1]).

-export_type([openapi_list_models_response/0]).

-type openapi_list_models_response() ::
  [ {'object', binary() }
  | {'data', list(openapi_model:openapi_model()) }
  ].


openapi_list_models_response() ->
    openapi_list_models_response([]).

openapi_list_models_response(Fields) ->
  Default = [ {'object', elements([<<"list">>]) }
            , {'data', list(openapi_model:openapi_model()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

