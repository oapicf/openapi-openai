
#include "CreateModerationResponse_results_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CreateModerationResponse_results_inner_flagged_is_assigned_from_json()
{




    bourne::json input =
    {
        "flagged", true
    };

    CreateModerationResponse_results_inner obj(input.dump());

    TEST_ASSERT(true == obj.isFlagged());




}






void test_CreateModerationResponse_results_inner_flagged_is_converted_to_json()
{


    bourne::json input =
    {
        "flagged", true
    };

    CreateModerationResponse_results_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["flagged"] == output["flagged"]);


}





