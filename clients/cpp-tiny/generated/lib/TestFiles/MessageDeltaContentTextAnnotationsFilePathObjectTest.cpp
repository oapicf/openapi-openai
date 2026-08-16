
#include "MessageDeltaContentTextAnnotationsFilePathObject.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_MessageDeltaContentTextAnnotationsFilePathObject_index_is_assigned_from_json()
{
    bourne::json input =
    {
        "index", 1
    };

    MessageDeltaContentTextAnnotationsFilePathObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getIndex());








}


void test_MessageDeltaContentTextAnnotationsFilePathObject_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    MessageDeltaContentTextAnnotationsFilePathObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_MessageDeltaContentTextAnnotationsFilePathObject_text_is_assigned_from_json()
{


    bourne::json input =
    {
        "text", "hello"
    };

    MessageDeltaContentTextAnnotationsFilePathObject obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getText().c_str());






}



void test_MessageDeltaContentTextAnnotationsFilePathObject_start_index_is_assigned_from_json()
{
    bourne::json input =
    {
        "start_index", 1
    };

    MessageDeltaContentTextAnnotationsFilePathObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getStartIndex());








}


void test_MessageDeltaContentTextAnnotationsFilePathObject_end_index_is_assigned_from_json()
{
    bourne::json input =
    {
        "end_index", 1
    };

    MessageDeltaContentTextAnnotationsFilePathObject obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getEndIndex());








}



void test_MessageDeltaContentTextAnnotationsFilePathObject_index_is_converted_to_json()
{
    bourne::json input =
    {
        "index", 1
    };

    MessageDeltaContentTextAnnotationsFilePathObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["index"] == output["index"]);




}


void test_MessageDeltaContentTextAnnotationsFilePathObject_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    MessageDeltaContentTextAnnotationsFilePathObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_MessageDeltaContentTextAnnotationsFilePathObject_text_is_converted_to_json()
{

    bourne::json input =
    {
        "text", "hello"
    };

    MessageDeltaContentTextAnnotationsFilePathObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["text"] == output["text"]);



}



void test_MessageDeltaContentTextAnnotationsFilePathObject_start_index_is_converted_to_json()
{
    bourne::json input =
    {
        "start_index", 1
    };

    MessageDeltaContentTextAnnotationsFilePathObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["start_index"] == output["start_index"]);




}


void test_MessageDeltaContentTextAnnotationsFilePathObject_end_index_is_converted_to_json()
{
    bourne::json input =
    {
        "end_index", 1
    };

    MessageDeltaContentTextAnnotationsFilePathObject obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["end_index"] == output["end_index"]);




}


