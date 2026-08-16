
#include "Error.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Error_code_is_assigned_from_json()
{


    bourne::json input =
    {
        "code", "hello"
    };

    Error obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCode().c_str());






}


void test_Error_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "message", "hello"
    };

    Error obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMessage().c_str());






}


void test_Error_param_is_assigned_from_json()
{


    bourne::json input =
    {
        "param", "hello"
    };

    Error obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getParam().c_str());






}


void test_Error_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    Error obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}



void test_Error_code_is_converted_to_json()
{

    bourne::json input =
    {
        "code", "hello"
    };

    Error obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["code"] == output["code"]);



}


void test_Error_message_is_converted_to_json()
{

    bourne::json input =
    {
        "message", "hello"
    };

    Error obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["message"] == output["message"]);



}


void test_Error_param_is_converted_to_json()
{

    bourne::json input =
    {
        "param", "hello"
    };

    Error obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["param"] == output["param"]);



}


void test_Error_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    Error obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


