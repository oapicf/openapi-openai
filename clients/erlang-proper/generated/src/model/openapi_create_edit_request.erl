-module(openapi_create_edit_request).

-include("openapi.hrl").

-export([openapi_create_edit_request/0]).

-export([openapi_create_edit_request/1]).

-export_type([openapi_create_edit_request/0]).

-type openapi_create_edit_request() ::
  [ {'model', openapi_create_edit_request_model:openapi_create_edit_request_model() }
  | {'input', binary() }
  | {'instruction', binary() }
  | {'n', integer() }
  | {'temperature', integer() }
  | {'top_p', integer() }
  ].


openapi_create_edit_request() ->
    openapi_create_edit_request([]).

openapi_create_edit_request(Fields) ->
  Default = [ {'model', openapi_create_edit_request_model:openapi_create_edit_request_model() }
            , {'input', binary() }
            , {'instruction', binary() }
            , {'n', integer(1, 20) }
            , {'temperature', integer() }
            , {'top_p', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

