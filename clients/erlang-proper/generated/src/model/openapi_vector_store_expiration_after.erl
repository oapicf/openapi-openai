-module(openapi_vector_store_expiration_after).

-include("openapi.hrl").

-export([openapi_vector_store_expiration_after/0]).

-export([openapi_vector_store_expiration_after/1]).

-export_type([openapi_vector_store_expiration_after/0]).

-type openapi_vector_store_expiration_after() ::
  [ {'anchor', binary() }
  | {'days', integer() }
  ].


openapi_vector_store_expiration_after() ->
    openapi_vector_store_expiration_after([]).

openapi_vector_store_expiration_after(Fields) ->
  Default = [ {'anchor', elements([<<"last_active_at">>]) }
            , {'days', integer(1, 365) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

