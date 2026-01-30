-module(openapi_admin_api_key_owner).

-include("openapi.hrl").

-export([openapi_admin_api_key_owner/0]).

-export([openapi_admin_api_key_owner/1]).

-export_type([openapi_admin_api_key_owner/0]).

-type openapi_admin_api_key_owner() ::
  [ {'type', binary() }
  | {'id', binary() }
  | {'name', binary() }
  | {'created_at', integer() }
  | {'role', binary() }
  ].


openapi_admin_api_key_owner() ->
    openapi_admin_api_key_owner([]).

openapi_admin_api_key_owner(Fields) ->
  Default = [ {'type', binary() }
            , {'id', binary() }
            , {'name', binary() }
            , {'created_at', integer() }
            , {'role', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

