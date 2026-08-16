
#include "UsageResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UsageResponse_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    UsageResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}



void test_UsageResponse_has_more_is_assigned_from_json()
{




    bourne::json input =
    {
        "has_more", true
    };

    UsageResponse obj(input.dump());

    TEST_ASSERT(true == obj.isHasMore());




}


void test_UsageResponse_next_page_is_assigned_from_json()
{


    bourne::json input =
    {
        "next_page", "hello"
    };

    UsageResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getNextPage().c_str());






}



void test_UsageResponse_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    UsageResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}



void test_UsageResponse_has_more_is_converted_to_json()
{


    bourne::json input =
    {
        "has_more", true
    };

    UsageResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["has_more"] == output["has_more"]);


}


void test_UsageResponse_next_page_is_converted_to_json()
{

    bourne::json input =
    {
        "next_page", "hello"
    };

    UsageResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["next_page"] == output["next_page"]);



}


