
#include "ImagesResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ImagesResponse_created_is_assigned_from_json()
{
    bourne::json input =
    {
        "created", 1
    };

    ImagesResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreated());








}




void test_ImagesResponse_created_is_converted_to_json()
{
    bourne::json input =
    {
        "created", 1
    };

    ImagesResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created"] == output["created"]);




}



