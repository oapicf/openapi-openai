-module(openapi_usage_images_result).

-include("openapi.hrl").

-export([openapi_usage_images_result/0]).

-export([openapi_usage_images_result/1]).

-export_type([openapi_usage_images_result/0]).

-type openapi_usage_images_result() ::
  [ {'object', binary() }
  | {'images', integer() }
  | {'num_model_requests', integer() }
  | {'source', binary() }
  | {'size', binary() }
  | {'project_id', binary() }
  | {'user_id', binary() }
  | {'api_key_id', binary() }
  | {'model', binary() }
  ].


openapi_usage_images_result() ->
    openapi_usage_images_result([]).

openapi_usage_images_result(Fields) ->
  Default = [ {'object', elements([<<"organization.usage.images.result">>]) }
            , {'images', integer() }
            , {'num_model_requests', integer() }
            , {'source', binary() }
            , {'size', binary() }
            , {'project_id', binary() }
            , {'user_id', binary() }
            , {'api_key_id', binary() }
            , {'model', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

