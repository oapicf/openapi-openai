-module(openapi_admin_api_keys_delete_200_response).

-include("openapi.hrl").

-export([openapi_admin_api_keys_delete_200_response/0]).

-export([openapi_admin_api_keys_delete_200_response/1]).

-export_type([openapi_admin_api_keys_delete_200_response/0]).

-type openapi_admin_api_keys_delete_200_response() ::
  [ {'id', binary() }
  | {'object', binary() }
  | {'deleted', boolean() }
  ].


openapi_admin_api_keys_delete_200_response() ->
    openapi_admin_api_keys_delete_200_response([]).

openapi_admin_api_keys_delete_200_response(Fields) ->
  Default = [ {'id', binary() }
            , {'object', binary() }
            , {'deleted', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

