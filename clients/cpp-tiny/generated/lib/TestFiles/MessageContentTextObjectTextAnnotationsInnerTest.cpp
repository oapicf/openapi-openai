
#include "MessageContentTextObject_text_annotations_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_MessageContentTextObject_text_annotations_inner_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    MessageContentTextObject_text_annotations_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_MessageContentTextObject_text_annotations_inner_text_is_assigned_from_json()
{


    bourne::json input =
    {
        "text", "hello"
    };

    MessageContentTextObject_text_annotations_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getText().c_str());






}



void test_MessageContentTextObject_text_annotations_inner_start_index_is_assigned_from_json()
{
    bourne::json input =
    {
        "start_index", 1
    };

    MessageContentTextObject_text_annotations_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getStartIndex());








}


void test_MessageContentTextObject_text_annotations_inner_end_index_is_assigned_from_json()
{
    bourne::json input =
    {
        "end_index", 1
    };

    MessageContentTextObject_text_annotations_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getEndIndex());








}




void test_MessageContentTextObject_text_annotations_inner_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    MessageContentTextObject_text_annotations_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_MessageContentTextObject_text_annotations_inner_text_is_converted_to_json()
{

    bourne::json input =
    {
        "text", "hello"
    };

    MessageContentTextObject_text_annotations_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["text"] == output["text"]);



}



void test_MessageContentTextObject_text_annotations_inner_start_index_is_converted_to_json()
{
    bourne::json input =
    {
        "start_index", 1
    };

    MessageContentTextObject_text_annotations_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["start_index"] == output["start_index"]);




}


void test_MessageContentTextObject_text_annotations_inner_end_index_is_converted_to_json()
{
    bourne::json input =
    {
        "end_index", 1
    };

    MessageContentTextObject_text_annotations_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["end_index"] == output["end_index"]);




}



