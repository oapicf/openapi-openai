-module(openapi_project_api_key_owner).

-include("openapi.hrl").

-export([openapi_project_api_key_owner/0]).

-export([openapi_project_api_key_owner/1]).

-export_type([openapi_project_api_key_owner/0]).

-type openapi_project_api_key_owner() ::
  [ {'type', binary() }
  | {'user', openapi_project_user:openapi_project_user() }
  | {'service_account', openapi_project_service_account:openapi_project_service_account() }
  ].


openapi_project_api_key_owner() ->
    openapi_project_api_key_owner([]).

openapi_project_api_key_owner(Fields) ->
  Default = [ {'type', elements([<<"user">>, <<"service_account">>]) }
            , {'user', openapi_project_user:openapi_project_user() }
            , {'service_account', openapi_project_service_account:openapi_project_service_account() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

