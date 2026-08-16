
#include "AuditLog_organization_updated_changes_requested_settings.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AuditLog_organization_updated_changes_requested_settings_threads_ui_visibility_is_assigned_from_json()
{


    bourne::json input =
    {
        "threads_ui_visibility", "hello"
    };

    AuditLog_organization_updated_changes_requested_settings obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getThreadsUiVisibility().c_str());






}


void test_AuditLog_organization_updated_changes_requested_settings_usage_dashboard_visibility_is_assigned_from_json()
{


    bourne::json input =
    {
        "usage_dashboard_visibility", "hello"
    };

    AuditLog_organization_updated_changes_requested_settings obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUsageDashboardVisibility().c_str());






}



void test_AuditLog_organization_updated_changes_requested_settings_threads_ui_visibility_is_converted_to_json()
{

    bourne::json input =
    {
        "threads_ui_visibility", "hello"
    };

    AuditLog_organization_updated_changes_requested_settings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["threads_ui_visibility"] == output["threads_ui_visibility"]);



}


void test_AuditLog_organization_updated_changes_requested_settings_usage_dashboard_visibility_is_converted_to_json()
{

    bourne::json input =
    {
        "usage_dashboard_visibility", "hello"
    };

    AuditLog_organization_updated_changes_requested_settings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["usage_dashboard_visibility"] == output["usage_dashboard_visibility"]);



}


