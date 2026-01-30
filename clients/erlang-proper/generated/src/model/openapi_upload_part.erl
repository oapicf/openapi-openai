-module(openapi_upload_part).

-include("openapi.hrl").

-export([openapi_upload_part/0]).

-export([openapi_upload_part/1]).

-export_type([openapi_upload_part/0]).

-type openapi_upload_part() ::
  [ {'id', binary() }
  | {'created_at', integer() }
  | {'upload_id', binary() }
  | {'object', binary() }
  ].


openapi_upload_part() ->
    openapi_upload_part([]).

openapi_upload_part(Fields) ->
  Default = [ {'id', binary() }
            , {'created_at', integer() }
            , {'upload_id', binary() }
            , {'object', elements([<<"upload.part">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

