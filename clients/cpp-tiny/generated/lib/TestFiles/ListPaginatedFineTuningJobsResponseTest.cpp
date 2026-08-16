
#include "ListPaginatedFineTuningJobsResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_ListPaginatedFineTuningJobsResponse_has_more_is_assigned_from_json()
{




    bourne::json input =
    {
        "has_more", true
    };

    ListPaginatedFineTuningJobsResponse obj(input.dump());

    TEST_ASSERT(true == obj.isHasMore());




}


void test_ListPaginatedFineTuningJobsResponse_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    ListPaginatedFineTuningJobsResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}




void test_ListPaginatedFineTuningJobsResponse_has_more_is_converted_to_json()
{


    bourne::json input =
    {
        "has_more", true
    };

    ListPaginatedFineTuningJobsResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["has_more"] == output["has_more"]);


}


void test_ListPaginatedFineTuningJobsResponse_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    ListPaginatedFineTuningJobsResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


