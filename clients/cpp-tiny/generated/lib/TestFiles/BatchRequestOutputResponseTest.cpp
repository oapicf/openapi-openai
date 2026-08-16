
#include "BatchRequestOutput_response.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_BatchRequestOutput_response_status_code_is_assigned_from_json()
{
    bourne::json input =
    {
        "status_code", 1
    };

    BatchRequestOutput_response obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getStatusCode());








}


void test_BatchRequestOutput_response_request_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "request_id", "hello"
    };

    BatchRequestOutput_response obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRequestId().c_str());






}




void test_BatchRequestOutput_response_status_code_is_converted_to_json()
{
    bourne::json input =
    {
        "status_code", 1
    };

    BatchRequestOutput_response obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status_code"] == output["status_code"]);




}


void test_BatchRequestOutput_response_request_id_is_converted_to_json()
{

    bourne::json input =
    {
        "request_id", "hello"
    };

    BatchRequestOutput_response obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["request_id"] == output["request_id"]);



}



