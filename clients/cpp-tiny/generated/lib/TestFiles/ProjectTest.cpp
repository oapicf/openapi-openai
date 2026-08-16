
#include "Project.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Project_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    Project obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_Project_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    Project obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_Project_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    Project obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_Project_created_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    Project obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedAt());








}


void test_Project_archived_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "archived_at", 1
    };

    Project obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getArchivedAt());








}


void test_Project_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "status", "hello"
    };

    Project obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatus().c_str());






}



void test_Project_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    Project obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_Project_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    Project obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_Project_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    Project obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_Project_created_at_is_converted_to_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    Project obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_at"] == output["created_at"]);




}


void test_Project_archived_at_is_converted_to_json()
{
    bourne::json input =
    {
        "archived_at", 1
    };

    Project obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["archived_at"] == output["archived_at"]);




}


void test_Project_status_is_converted_to_json()
{

    bourne::json input =
    {
        "status", "hello"
    };

    Project obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status"] == output["status"]);



}


