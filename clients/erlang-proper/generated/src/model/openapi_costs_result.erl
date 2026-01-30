-module(openapi_costs_result).

-include("openapi.hrl").

-export([openapi_costs_result/0]).

-export([openapi_costs_result/1]).

-export_type([openapi_costs_result/0]).

-type openapi_costs_result() ::
  [ {'object', binary() }
  | {'amount', openapi_costs_result_amount:openapi_costs_result_amount() }
  | {'line_item', binary() }
  | {'project_id', binary() }
  ].


openapi_costs_result() ->
    openapi_costs_result([]).

openapi_costs_result(Fields) ->
  Default = [ {'object', elements([<<"organization.costs.result">>]) }
            , {'amount', openapi_costs_result_amount:openapi_costs_result_amount() }
            , {'line_item', binary() }
            , {'project_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

