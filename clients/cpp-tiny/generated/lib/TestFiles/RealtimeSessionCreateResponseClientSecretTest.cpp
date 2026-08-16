
#include "RealtimeSessionCreateResponse_client_secret.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RealtimeSessionCreateResponse_client_secret_value_is_assigned_from_json()
{


    bourne::json input =
    {
        "value", "hello"
    };

    RealtimeSessionCreateResponse_client_secret obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getValue().c_str());






}


void test_RealtimeSessionCreateResponse_client_secret_expires_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "expires_at", 1
    };

    RealtimeSessionCreateResponse_client_secret obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getExpiresAt());








}



void test_RealtimeSessionCreateResponse_client_secret_value_is_converted_to_json()
{

    bourne::json input =
    {
        "value", "hello"
    };

    RealtimeSessionCreateResponse_client_secret obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["value"] == output["value"]);



}


void test_RealtimeSessionCreateResponse_client_secret_expires_at_is_converted_to_json()
{
    bourne::json input =
    {
        "expires_at", 1
    };

    RealtimeSessionCreateResponse_client_secret obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["expires_at"] == output["expires_at"]);




}


