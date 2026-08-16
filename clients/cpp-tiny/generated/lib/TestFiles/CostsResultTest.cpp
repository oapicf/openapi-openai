
#include "CostsResult.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CostsResult_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    CostsResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}



void test_CostsResult_line_item_is_assigned_from_json()
{


    bourne::json input =
    {
        "line_item", "hello"
    };

    CostsResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLineItem().c_str());






}


void test_CostsResult_project_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "project_id", "hello"
    };

    CostsResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getProjectId().c_str());






}



void test_CostsResult_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    CostsResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}



void test_CostsResult_line_item_is_converted_to_json()
{

    bourne::json input =
    {
        "line_item", "hello"
    };

    CostsResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["line_item"] == output["line_item"]);



}


void test_CostsResult_project_id_is_converted_to_json()
{

    bourne::json input =
    {
        "project_id", "hello"
    };

    CostsResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["project_id"] == output["project_id"]);



}


