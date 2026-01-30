-module(openapi_upload).

-include("openapi.hrl").

-export([openapi_upload/0]).

-export([openapi_upload/1]).

-export_type([openapi_upload/0]).

-type openapi_upload() ::
  [ {'id', binary() }
  | {'created_at', integer() }
  | {'filename', binary() }
  | {'bytes', integer() }
  | {'purpose', binary() }
  | {'status', binary() }
  | {'expires_at', integer() }
  | {'object', binary() }
  | {'file', openapi_open_ai_file:openapi_open_ai_file() }
  ].


openapi_upload() ->
    openapi_upload([]).

openapi_upload(Fields) ->
  Default = [ {'id', binary() }
            , {'created_at', integer() }
            , {'filename', binary() }
            , {'bytes', integer() }
            , {'purpose', binary() }
            , {'status', elements([<<"pending">>, <<"completed">>, <<"cancelled">>, <<"expired">>]) }
            , {'expires_at', integer() }
            , {'object', elements([<<"upload">>]) }
            , {'file', openapi_open_ai_file:openapi_open_ai_file() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

