-module(openapi_user_role_update_request).

-include("openapi.hrl").

-export([openapi_user_role_update_request/0]).

-export([openapi_user_role_update_request/1]).

-export_type([openapi_user_role_update_request/0]).

-type openapi_user_role_update_request() ::
  [ {'role', binary() }
  ].


openapi_user_role_update_request() ->
    openapi_user_role_update_request([]).

openapi_user_role_update_request(Fields) ->
  Default = [ {'role', elements([<<"owner">>, <<"reader">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

