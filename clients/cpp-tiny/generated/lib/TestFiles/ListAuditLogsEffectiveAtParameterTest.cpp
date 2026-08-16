
#include "List_audit_logs_effective_at_parameter.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_List_audit_logs_effective_at_parameter_gt_is_assigned_from_json()
{
    bourne::json input =
    {
        "gt", 1
    };

    List_audit_logs_effective_at_parameter obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getGt());








}


void test_List_audit_logs_effective_at_parameter_gte_is_assigned_from_json()
{
    bourne::json input =
    {
        "gte", 1
    };

    List_audit_logs_effective_at_parameter obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getGte());








}


void test_List_audit_logs_effective_at_parameter_lt_is_assigned_from_json()
{
    bourne::json input =
    {
        "lt", 1
    };

    List_audit_logs_effective_at_parameter obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLt());








}


void test_List_audit_logs_effective_at_parameter_lte_is_assigned_from_json()
{
    bourne::json input =
    {
        "lte", 1
    };

    List_audit_logs_effective_at_parameter obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLte());








}



void test_List_audit_logs_effective_at_parameter_gt_is_converted_to_json()
{
    bourne::json input =
    {
        "gt", 1
    };

    List_audit_logs_effective_at_parameter obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["gt"] == output["gt"]);




}


void test_List_audit_logs_effective_at_parameter_gte_is_converted_to_json()
{
    bourne::json input =
    {
        "gte", 1
    };

    List_audit_logs_effective_at_parameter obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["gte"] == output["gte"]);




}


void test_List_audit_logs_effective_at_parameter_lt_is_converted_to_json()
{
    bourne::json input =
    {
        "lt", 1
    };

    List_audit_logs_effective_at_parameter obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["lt"] == output["lt"]);




}


void test_List_audit_logs_effective_at_parameter_lte_is_converted_to_json()
{
    bourne::json input =
    {
        "lte", 1
    };

    List_audit_logs_effective_at_parameter obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["lte"] == output["lte"]);




}


