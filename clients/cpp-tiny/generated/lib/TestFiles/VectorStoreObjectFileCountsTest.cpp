
#include "VectorStoreObject_file_counts.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_VectorStoreObject_file_counts_in_progress_is_assigned_from_json()
{
    bourne::json input =
    {
        "in_progress", 1
    };

    VectorStoreObject_file_counts obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getInProgress());








}


void test_VectorStoreObject_file_counts_completed_is_assigned_from_json()
{
    bourne::json input =
    {
        "completed", 1
    };

    VectorStoreObject_file_counts obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCompleted());








}


void test_VectorStoreObject_file_counts_failed_is_assigned_from_json()
{
    bourne::json input =
    {
        "failed", 1
    };

    VectorStoreObject_file_counts obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFailed());








}


void test_VectorStoreObject_file_counts_cancelled_is_assigned_from_json()
{
    bourne::json input =
    {
        "cancelled", 1
    };

    VectorStoreObject_file_counts obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCancelled());








}


void test_VectorStoreObject_file_counts_total_is_assigned_from_json()
{
    bourne::json input =
    {
        "total", 1
    };

    VectorStoreObject_file_counts obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTotal());








}



void test_VectorStoreObject_file_counts_in_progress_is_converted_to_json()
{
    bourne::json input =
    {
        "in_progress", 1
    };

    VectorStoreObject_file_counts obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["in_progress"] == output["in_progress"]);




}


void test_VectorStoreObject_file_counts_completed_is_converted_to_json()
{
    bourne::json input =
    {
        "completed", 1
    };

    VectorStoreObject_file_counts obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["completed"] == output["completed"]);




}


void test_VectorStoreObject_file_counts_failed_is_converted_to_json()
{
    bourne::json input =
    {
        "failed", 1
    };

    VectorStoreObject_file_counts obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["failed"] == output["failed"]);




}


void test_VectorStoreObject_file_counts_cancelled_is_converted_to_json()
{
    bourne::json input =
    {
        "cancelled", 1
    };

    VectorStoreObject_file_counts obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cancelled"] == output["cancelled"]);




}


void test_VectorStoreObject_file_counts_total_is_converted_to_json()
{
    bourne::json input =
    {
        "total", 1
    };

    VectorStoreObject_file_counts obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["total"] == output["total"]);




}


