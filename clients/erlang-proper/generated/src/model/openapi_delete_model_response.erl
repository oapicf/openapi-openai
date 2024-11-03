-module(openapi_delete_model_response).

-include("openapi.hrl").

-export([openapi_delete_model_response/0]).

-export([openapi_delete_model_response/1]).

-export_type([openapi_delete_model_response/0]).

-type openapi_delete_model_response() ::
  [ {'id', binary() }
  | {'deleted', boolean() }
  | {'object', binary() }
  ].


openapi_delete_model_response() ->
    openapi_delete_model_response([]).

openapi_delete_model_response(Fields) ->
  Default = [ {'id', binary() }
            , {'deleted', boolean() }
            , {'object', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

