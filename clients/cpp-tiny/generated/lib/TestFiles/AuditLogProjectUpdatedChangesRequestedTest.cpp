
#include "AuditLog_project_updated_changes_requested.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AuditLog_project_updated_changes_requested_title_is_assigned_from_json()
{


    bourne::json input =
    {
        "title", "hello"
    };

    AuditLog_project_updated_changes_requested obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTitle().c_str());






}



void test_AuditLog_project_updated_changes_requested_title_is_converted_to_json()
{

    bourne::json input =
    {
        "title", "hello"
    };

    AuditLog_project_updated_changes_requested obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["title"] == output["title"]);



}


