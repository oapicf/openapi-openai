-module(openapi_project_service_account_create_response).

-include("openapi.hrl").

-export([openapi_project_service_account_create_response/0]).

-export([openapi_project_service_account_create_response/1]).

-export_type([openapi_project_service_account_create_response/0]).

-type openapi_project_service_account_create_response() ::
  [ {'object', binary() }
  | {'id', binary() }
  | {'name', binary() }
  | {'role', binary() }
  | {'created_at', integer() }
  | {'api_key', openapi_project_service_account_api_key:openapi_project_service_account_api_key() }
  ].


openapi_project_service_account_create_response() ->
    openapi_project_service_account_create_response([]).

openapi_project_service_account_create_response(Fields) ->
  Default = [ {'object', elements([<<"organization.project.service_account">>]) }
            , {'id', binary() }
            , {'name', binary() }
            , {'role', elements([<<"member">>]) }
            , {'created_at', integer() }
            , {'api_key', openapi_project_service_account_api_key:openapi_project_service_account_api_key() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

