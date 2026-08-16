
#include "SubmitToolOutputsRunRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_SubmitToolOutputsRunRequest_stream_is_assigned_from_json()
{




    bourne::json input =
    {
        "stream", true
    };

    SubmitToolOutputsRunRequest obj(input.dump());

    TEST_ASSERT(true == obj.isStream());




}




void test_SubmitToolOutputsRunRequest_stream_is_converted_to_json()
{


    bourne::json input =
    {
        "stream", true
    };

    SubmitToolOutputsRunRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["stream"] == output["stream"]);


}


