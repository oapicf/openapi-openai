-module(openapi_project_api_key).

-include("openapi.hrl").

-export([openapi_project_api_key/0]).

-export([openapi_project_api_key/1]).

-export_type([openapi_project_api_key/0]).

-type openapi_project_api_key() ::
  [ {'object', binary() }
  | {'redacted_value', binary() }
  | {'name', binary() }
  | {'created_at', integer() }
  | {'id', binary() }
  | {'owner', openapi_project_api_key_owner:openapi_project_api_key_owner() }
  ].


openapi_project_api_key() ->
    openapi_project_api_key([]).

openapi_project_api_key(Fields) ->
  Default = [ {'object', elements([<<"organization.project.api_key">>]) }
            , {'redacted_value', binary() }
            , {'name', binary() }
            , {'created_at', integer() }
            , {'id', binary() }
            , {'owner', openapi_project_api_key_owner:openapi_project_api_key_owner() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

