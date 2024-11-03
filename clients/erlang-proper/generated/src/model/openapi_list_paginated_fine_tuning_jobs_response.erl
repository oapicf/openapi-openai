-module(openapi_list_paginated_fine_tuning_jobs_response).

-include("openapi.hrl").

-export([openapi_list_paginated_fine_tuning_jobs_response/0]).

-export([openapi_list_paginated_fine_tuning_jobs_response/1]).

-export_type([openapi_list_paginated_fine_tuning_jobs_response/0]).

-type openapi_list_paginated_fine_tuning_jobs_response() ::
  [ {'data', list(openapi_fine_tuning_job:openapi_fine_tuning_job()) }
  | {'has_more', boolean() }
  | {'object', binary() }
  ].


openapi_list_paginated_fine_tuning_jobs_response() ->
    openapi_list_paginated_fine_tuning_jobs_response([]).

openapi_list_paginated_fine_tuning_jobs_response(Fields) ->
  Default = [ {'data', list(openapi_fine_tuning_job:openapi_fine_tuning_job()) }
            , {'has_more', boolean() }
            , {'object', elements([<<"list">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

