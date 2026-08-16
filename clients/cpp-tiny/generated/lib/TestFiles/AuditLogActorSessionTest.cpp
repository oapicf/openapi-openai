
#include "AuditLogActorSession.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_AuditLogActorSession_ip_address_is_assigned_from_json()
{


    bourne::json input =
    {
        "ip_address", "hello"
    };

    AuditLogActorSession obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getIpAddress().c_str());






}




void test_AuditLogActorSession_ip_address_is_converted_to_json()
{

    bourne::json input =
    {
        "ip_address", "hello"
    };

    AuditLogActorSession obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ip_address"] == output["ip_address"]);



}


