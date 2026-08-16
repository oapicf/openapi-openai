
#include "Batch_errors_data_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Batch_errors_data_inner_code_is_assigned_from_json()
{


    bourne::json input =
    {
        "code", "hello"
    };

    Batch_errors_data_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCode().c_str());






}


void test_Batch_errors_data_inner_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "message", "hello"
    };

    Batch_errors_data_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMessage().c_str());






}


void test_Batch_errors_data_inner_param_is_assigned_from_json()
{


    bourne::json input =
    {
        "param", "hello"
    };

    Batch_errors_data_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getParam().c_str());






}


void test_Batch_errors_data_inner_line_is_assigned_from_json()
{
    bourne::json input =
    {
        "line", 1
    };

    Batch_errors_data_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLine());








}



void test_Batch_errors_data_inner_code_is_converted_to_json()
{

    bourne::json input =
    {
        "code", "hello"
    };

    Batch_errors_data_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["code"] == output["code"]);



}


void test_Batch_errors_data_inner_message_is_converted_to_json()
{

    bourne::json input =
    {
        "message", "hello"
    };

    Batch_errors_data_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["message"] == output["message"]);



}


void test_Batch_errors_data_inner_param_is_converted_to_json()
{

    bourne::json input =
    {
        "param", "hello"
    };

    Batch_errors_data_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["param"] == output["param"]);



}


void test_Batch_errors_data_inner_line_is_converted_to_json()
{
    bourne::json input =
    {
        "line", 1
    };

    Batch_errors_data_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["line"] == output["line"]);




}


