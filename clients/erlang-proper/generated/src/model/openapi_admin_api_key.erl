-module(openapi_admin_api_key).

-include("openapi.hrl").

-export([openapi_admin_api_key/0]).

-export([openapi_admin_api_key/1]).

-export_type([openapi_admin_api_key/0]).

-type openapi_admin_api_key() ::
  [ {'object', binary() }
  | {'id', binary() }
  | {'name', binary() }
  | {'redacted_value', binary() }
  | {'value', binary() }
  | {'created_at', integer() }
  | {'owner', openapi_admin_api_key_owner:openapi_admin_api_key_owner() }
  ].


openapi_admin_api_key() ->
    openapi_admin_api_key([]).

openapi_admin_api_key(Fields) ->
  Default = [ {'object', binary() }
            , {'id', binary() }
            , {'name', binary() }
            , {'redacted_value', binary() }
            , {'value', binary() }
            , {'created_at', integer() }
            , {'owner', openapi_admin_api_key_owner:openapi_admin_api_key_owner() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

