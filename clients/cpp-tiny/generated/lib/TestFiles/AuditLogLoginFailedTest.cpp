
#include "AuditLog_login_failed.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AuditLog_login_failed_error_code_is_assigned_from_json()
{


    bourne::json input =
    {
        "error_code", "hello"
    };

    AuditLog_login_failed obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getErrorCode().c_str());






}


void test_AuditLog_login_failed_error_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "error_message", "hello"
    };

    AuditLog_login_failed obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getErrorMessage().c_str());






}



void test_AuditLog_login_failed_error_code_is_converted_to_json()
{

    bourne::json input =
    {
        "error_code", "hello"
    };

    AuditLog_login_failed obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["error_code"] == output["error_code"]);



}


void test_AuditLog_login_failed_error_message_is_converted_to_json()
{

    bourne::json input =
    {
        "error_message", "hello"
    };

    AuditLog_login_failed obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["error_message"] == output["error_message"]);



}


