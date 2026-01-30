-module(openapi_complete_upload_request).

-include("openapi.hrl").

-export([openapi_complete_upload_request/0]).

-export([openapi_complete_upload_request/1]).

-export_type([openapi_complete_upload_request/0]).

-type openapi_complete_upload_request() ::
  [ {'part_ids', list(binary()) }
  | {'md5', binary() }
  ].


openapi_complete_upload_request() ->
    openapi_complete_upload_request([]).

openapi_complete_upload_request(Fields) ->
  Default = [ {'part_ids', list(binary()) }
            , {'md5', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

