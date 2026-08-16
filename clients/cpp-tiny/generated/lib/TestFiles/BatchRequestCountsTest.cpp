
#include "Batch_request_counts.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Batch_request_counts_total_is_assigned_from_json()
{
    bourne::json input =
    {
        "total", 1
    };

    Batch_request_counts obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTotal());








}


void test_Batch_request_counts_completed_is_assigned_from_json()
{
    bourne::json input =
    {
        "completed", 1
    };

    Batch_request_counts obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCompleted());








}


void test_Batch_request_counts_failed_is_assigned_from_json()
{
    bourne::json input =
    {
        "failed", 1
    };

    Batch_request_counts obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFailed());








}



void test_Batch_request_counts_total_is_converted_to_json()
{
    bourne::json input =
    {
        "total", 1
    };

    Batch_request_counts obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["total"] == output["total"]);




}


void test_Batch_request_counts_completed_is_converted_to_json()
{
    bourne::json input =
    {
        "completed", 1
    };

    Batch_request_counts obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["completed"] == output["completed"]);




}


void test_Batch_request_counts_failed_is_converted_to_json()
{
    bourne::json input =
    {
        "failed", 1
    };

    Batch_request_counts obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["failed"] == output["failed"]);




}


