-module(openapi_list_vector_stores_response).

-include("openapi.hrl").

-export([openapi_list_vector_stores_response/0]).

-export([openapi_list_vector_stores_response/1]).

-export_type([openapi_list_vector_stores_response/0]).

-type openapi_list_vector_stores_response() ::
  [ {'object', binary() }
  | {'data', list(openapi_vector_store_object:openapi_vector_store_object()) }
  | {'first_id', binary() }
  | {'last_id', binary() }
  | {'has_more', boolean() }
  ].


openapi_list_vector_stores_response() ->
    openapi_list_vector_stores_response([]).

openapi_list_vector_stores_response(Fields) ->
  Default = [ {'object', binary() }
            , {'data', list(openapi_vector_store_object:openapi_vector_store_object()) }
            , {'first_id', binary() }
            , {'last_id', binary() }
            , {'has_more', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

