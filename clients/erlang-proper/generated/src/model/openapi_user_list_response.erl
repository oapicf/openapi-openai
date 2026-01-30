-module(openapi_user_list_response).

-include("openapi.hrl").

-export([openapi_user_list_response/0]).

-export([openapi_user_list_response/1]).

-export_type([openapi_user_list_response/0]).

-type openapi_user_list_response() ::
  [ {'object', binary() }
  | {'data', list(openapi_user:openapi_user()) }
  | {'first_id', binary() }
  | {'last_id', binary() }
  | {'has_more', boolean() }
  ].


openapi_user_list_response() ->
    openapi_user_list_response([]).

openapi_user_list_response(Fields) ->
  Default = [ {'object', elements([<<"list">>]) }
            , {'data', list(openapi_user:openapi_user()) }
            , {'first_id', binary() }
            , {'last_id', binary() }
            , {'has_more', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

