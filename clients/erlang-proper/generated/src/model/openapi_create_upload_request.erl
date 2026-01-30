-module(openapi_create_upload_request).

-include("openapi.hrl").

-export([openapi_create_upload_request/0]).

-export([openapi_create_upload_request/1]).

-export_type([openapi_create_upload_request/0]).

-type openapi_create_upload_request() ::
  [ {'filename', binary() }
  | {'purpose', binary() }
  | {'bytes', integer() }
  | {'mime_type', binary() }
  ].


openapi_create_upload_request() ->
    openapi_create_upload_request([]).

openapi_create_upload_request(Fields) ->
  Default = [ {'filename', binary() }
            , {'purpose', elements([<<"assistants">>, <<"batch">>, <<"fine-tune">>, <<"vision">>]) }
            , {'bytes', integer() }
            , {'mime_type', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

