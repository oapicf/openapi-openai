
#include "Invite.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Invite_object_is_assigned_from_json()
{


    bourne::json input =
    {
        "object", "hello"
    };

    Invite obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getObject().c_str());






}


void test_Invite_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    Invite obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_Invite_email_is_assigned_from_json()
{


    bourne::json input =
    {
        "email", "hello"
    };

    Invite obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEmail().c_str());






}


void test_Invite_role_is_assigned_from_json()
{


    bourne::json input =
    {
        "role", "hello"
    };

    Invite obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRole().c_str());






}


void test_Invite_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "status", "hello"
    };

    Invite obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatus().c_str());






}


void test_Invite_invited_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "invited_at", 1
    };

    Invite obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getInvitedAt());








}


void test_Invite_expires_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "expires_at", 1
    };

    Invite obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getExpiresAt());








}


void test_Invite_accepted_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "accepted_at", 1
    };

    Invite obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getAcceptedAt());








}




void test_Invite_object_is_converted_to_json()
{

    bourne::json input =
    {
        "object", "hello"
    };

    Invite obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["object"] == output["object"]);



}


void test_Invite_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    Invite obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_Invite_email_is_converted_to_json()
{

    bourne::json input =
    {
        "email", "hello"
    };

    Invite obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["email"] == output["email"]);



}


void test_Invite_role_is_converted_to_json()
{

    bourne::json input =
    {
        "role", "hello"
    };

    Invite obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["role"] == output["role"]);



}


void test_Invite_status_is_converted_to_json()
{

    bourne::json input =
    {
        "status", "hello"
    };

    Invite obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status"] == output["status"]);



}


void test_Invite_invited_at_is_converted_to_json()
{
    bourne::json input =
    {
        "invited_at", 1
    };

    Invite obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["invited_at"] == output["invited_at"]);




}


void test_Invite_expires_at_is_converted_to_json()
{
    bourne::json input =
    {
        "expires_at", 1
    };

    Invite obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["expires_at"] == output["expires_at"]);




}


void test_Invite_accepted_at_is_converted_to_json()
{
    bourne::json input =
    {
        "accepted_at", 1
    };

    Invite obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["accepted_at"] == output["accepted_at"]);




}



