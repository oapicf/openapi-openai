-module(openapi_user).

-include("openapi.hrl").

-export([openapi_user/0]).

-export([openapi_user/1]).

-export_type([openapi_user/0]).

-type openapi_user() ::
  [ {'object', binary() }
  | {'id', binary() }
  | {'name', binary() }
  | {'email', binary() }
  | {'role', binary() }
  | {'added_at', integer() }
  ].


openapi_user() ->
    openapi_user([]).

openapi_user(Fields) ->
  Default = [ {'object', elements([<<"organization.user">>]) }
            , {'id', binary() }
            , {'name', binary() }
            , {'email', binary() }
            , {'role', elements([<<"owner">>, <<"reader">>]) }
            , {'added_at', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

