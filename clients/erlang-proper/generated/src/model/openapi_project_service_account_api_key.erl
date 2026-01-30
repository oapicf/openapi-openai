-module(openapi_project_service_account_api_key).

-include("openapi.hrl").

-export([openapi_project_service_account_api_key/0]).

-export([openapi_project_service_account_api_key/1]).

-export_type([openapi_project_service_account_api_key/0]).

-type openapi_project_service_account_api_key() ::
  [ {'object', binary() }
  | {'value', binary() }
  | {'name', binary() }
  | {'created_at', integer() }
  | {'id', binary() }
  ].


openapi_project_service_account_api_key() ->
    openapi_project_service_account_api_key([]).

openapi_project_service_account_api_key(Fields) ->
  Default = [ {'object', elements([<<"organization.project.service_account.api_key">>]) }
            , {'value', binary() }
            , {'name', binary() }
            , {'created_at', integer() }
            , {'id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

