
#include "ListFineTuningJobEventsResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_ListFineTuningJobEventsResponse_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    ListFineTuningJobEventsResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}




void test_ListFineTuningJobEventsResponse_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    ListFineTuningJobEventsResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


