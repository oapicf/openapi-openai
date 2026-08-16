
#include "ResponseFormatJsonSchema_json_schema.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ResponseFormatJsonSchema_json_schema_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    ResponseFormatJsonSchema_json_schema obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_ResponseFormatJsonSchema_json_schema_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    ResponseFormatJsonSchema_json_schema obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}



void test_ResponseFormatJsonSchema_json_schema_strict_is_assigned_from_json()
{




    bourne::json input =
    {
        "strict", true
    };

    ResponseFormatJsonSchema_json_schema obj(input.dump());

    TEST_ASSERT(true == obj.isStrict());




}



void test_ResponseFormatJsonSchema_json_schema_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    ResponseFormatJsonSchema_json_schema obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_ResponseFormatJsonSchema_json_schema_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    ResponseFormatJsonSchema_json_schema obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}



void test_ResponseFormatJsonSchema_json_schema_strict_is_converted_to_json()
{


    bourne::json input =
    {
        "strict", true
    };

    ResponseFormatJsonSchema_json_schema obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["strict"] == output["strict"]);


}


