-module(openapi_api_key_list).

-include("openapi.hrl").

-export([openapi_api_key_list/0]).

-export([openapi_api_key_list/1]).

-export_type([openapi_api_key_list/0]).

-type openapi_api_key_list() ::
  [ {'object', binary() }
  | {'data', list(openapi_admin_api_key:openapi_admin_api_key()) }
  | {'has_more', boolean() }
  | {'first_id', binary() }
  | {'last_id', binary() }
  ].


openapi_api_key_list() ->
    openapi_api_key_list([]).

openapi_api_key_list(Fields) ->
  Default = [ {'object', binary() }
            , {'data', list(openapi_admin_api_key:openapi_admin_api_key()) }
            , {'has_more', boolean() }
            , {'first_id', binary() }
            , {'last_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

