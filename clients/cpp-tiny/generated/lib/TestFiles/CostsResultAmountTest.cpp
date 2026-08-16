
#include "CostsResult_amount.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CostsResult_amount_value_is_assigned_from_json()
{








}


void test_CostsResult_amount_currency_is_assigned_from_json()
{


    bourne::json input =
    {
        "currency", "hello"
    };

    CostsResult_amount obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCurrency().c_str());






}



void test_CostsResult_amount_value_is_converted_to_json()
{




}


void test_CostsResult_amount_currency_is_converted_to_json()
{

    bourne::json input =
    {
        "currency", "hello"
    };

    CostsResult_amount obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["currency"] == output["currency"]);



}


