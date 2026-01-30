-module(openapi_admin_api_keys_create_request).

-include("openapi.hrl").

-export([openapi_admin_api_keys_create_request/0]).

-export([openapi_admin_api_keys_create_request/1]).

-export_type([openapi_admin_api_keys_create_request/0]).

-type openapi_admin_api_keys_create_request() ::
  [ {'name', binary() }
  ].


openapi_admin_api_keys_create_request() ->
    openapi_admin_api_keys_create_request([]).

openapi_admin_api_keys_create_request(Fields) ->
  Default = [ {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

