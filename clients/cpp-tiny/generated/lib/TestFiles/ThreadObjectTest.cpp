
#include "ThreadObject.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ThreadObject_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    ThreadObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_ThreadObject_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    ThreadObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_ThreadObject_created_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    ThreadObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedAt());








}





void test_ThreadObject_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    ThreadObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_ThreadObject_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    ThreadObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_ThreadObject_created_at_is_converted_to_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    ThreadObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_at"] == output["created_at"]);




}




