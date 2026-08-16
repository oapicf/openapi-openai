
#include "VectorStoreExpirationAfter.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_VectorStoreExpirationAfter_anchor_is_assigned_from_json()
{


    bourne::json input =
    {
        "anchor", "hello"
    };

    VectorStoreExpirationAfter obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAnchor().c_str());






}


void test_VectorStoreExpirationAfter_days_is_assigned_from_json()
{
    bourne::json input =
    {
        "days", 1
    };

    VectorStoreExpirationAfter obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getDays());








}



void test_VectorStoreExpirationAfter_anchor_is_converted_to_json()
{

    bourne::json input =
    {
        "anchor", "hello"
    };

    VectorStoreExpirationAfter obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["anchor"] == output["anchor"]);



}


void test_VectorStoreExpirationAfter_days_is_converted_to_json()
{
    bourne::json input =
    {
        "days", 1
    };

    VectorStoreExpirationAfter obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["days"] == output["days"]);




}


