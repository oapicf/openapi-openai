-module(openapi_project_api_key_list_response).

-include("openapi.hrl").

-export([openapi_project_api_key_list_response/0]).

-export([openapi_project_api_key_list_response/1]).

-export_type([openapi_project_api_key_list_response/0]).

-type openapi_project_api_key_list_response() ::
  [ {'object', binary() }
  | {'data', list(openapi_project_api_key:openapi_project_api_key()) }
  | {'first_id', binary() }
  | {'last_id', binary() }
  | {'has_more', boolean() }
  ].


openapi_project_api_key_list_response() ->
    openapi_project_api_key_list_response([]).

openapi_project_api_key_list_response(Fields) ->
  Default = [ {'object', elements([<<"list">>]) }
            , {'data', list(openapi_project_api_key:openapi_project_api_key()) }
            , {'first_id', binary() }
            , {'last_id', binary() }
            , {'has_more', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

