
#include "CreateModerationResponse_results_inner_categories.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CreateModerationResponse_results_inner_categories_hate_is_assigned_from_json()
{




    bourne::json input =
    {
        "hate", true
    };

    CreateModerationResponse_results_inner_categories obj(input.dump());

    TEST_ASSERT(true == obj.isHate());




}


void test_CreateModerationResponse_results_inner_categories_hatethreatening_is_assigned_from_json()
{




    bourne::json input =
    {
        "hatethreatening", true
    };

    CreateModerationResponse_results_inner_categories obj(input.dump());

    TEST_ASSERT(true == obj.isHatethreatening());




}


void test_CreateModerationResponse_results_inner_categories_harassment_is_assigned_from_json()
{




    bourne::json input =
    {
        "harassment", true
    };

    CreateModerationResponse_results_inner_categories obj(input.dump());

    TEST_ASSERT(true == obj.isHarassment());




}


void test_CreateModerationResponse_results_inner_categories_harassmentthreatening_is_assigned_from_json()
{




    bourne::json input =
    {
        "harassmentthreatening", true
    };

    CreateModerationResponse_results_inner_categories obj(input.dump());

    TEST_ASSERT(true == obj.isHarassmentthreatening());




}


void test_CreateModerationResponse_results_inner_categories_illicit_is_assigned_from_json()
{




    bourne::json input =
    {
        "illicit", true
    };

    CreateModerationResponse_results_inner_categories obj(input.dump());

    TEST_ASSERT(true == obj.isIllicit());




}


void test_CreateModerationResponse_results_inner_categories_illicitviolent_is_assigned_from_json()
{




    bourne::json input =
    {
        "illicitviolent", true
    };

    CreateModerationResponse_results_inner_categories obj(input.dump());

    TEST_ASSERT(true == obj.isIllicitviolent());




}


void test_CreateModerationResponse_results_inner_categories_selfharm_is_assigned_from_json()
{




    bourne::json input =
    {
        "selfharm", true
    };

    CreateModerationResponse_results_inner_categories obj(input.dump());

    TEST_ASSERT(true == obj.isSelfharm());




}


void test_CreateModerationResponse_results_inner_categories_selfharmintent_is_assigned_from_json()
{




    bourne::json input =
    {
        "selfharmintent", true
    };

    CreateModerationResponse_results_inner_categories obj(input.dump());

    TEST_ASSERT(true == obj.isSelfharmintent());




}


void test_CreateModerationResponse_results_inner_categories_selfharminstructions_is_assigned_from_json()
{




    bourne::json input =
    {
        "selfharminstructions", true
    };

    CreateModerationResponse_results_inner_categories obj(input.dump());

    TEST_ASSERT(true == obj.isSelfharminstructions());




}


void test_CreateModerationResponse_results_inner_categories_sexual_is_assigned_from_json()
{




    bourne::json input =
    {
        "sexual", true
    };

    CreateModerationResponse_results_inner_categories obj(input.dump());

    TEST_ASSERT(true == obj.isSexual());




}


void test_CreateModerationResponse_results_inner_categories_sexualminors_is_assigned_from_json()
{




    bourne::json input =
    {
        "sexualminors", true
    };

    CreateModerationResponse_results_inner_categories obj(input.dump());

    TEST_ASSERT(true == obj.isSexualminors());




}


void test_CreateModerationResponse_results_inner_categories_violence_is_assigned_from_json()
{




    bourne::json input =
    {
        "violence", true
    };

    CreateModerationResponse_results_inner_categories obj(input.dump());

    TEST_ASSERT(true == obj.isViolence());




}


void test_CreateModerationResponse_results_inner_categories_violencegraphic_is_assigned_from_json()
{




    bourne::json input =
    {
        "violencegraphic", true
    };

    CreateModerationResponse_results_inner_categories obj(input.dump());

    TEST_ASSERT(true == obj.isViolencegraphic());




}



void test_CreateModerationResponse_results_inner_categories_hate_is_converted_to_json()
{


    bourne::json input =
    {
        "hate", true
    };

    CreateModerationResponse_results_inner_categories obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["hate"] == output["hate"]);


}


void test_CreateModerationResponse_results_inner_categories_hatethreatening_is_converted_to_json()
{


    bourne::json input =
    {
        "hatethreatening", true
    };

    CreateModerationResponse_results_inner_categories obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["hatethreatening"] == output["hatethreatening"]);


}


void test_CreateModerationResponse_results_inner_categories_harassment_is_converted_to_json()
{


    bourne::json input =
    {
        "harassment", true
    };

    CreateModerationResponse_results_inner_categories obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["harassment"] == output["harassment"]);


}


void test_CreateModerationResponse_results_inner_categories_harassmentthreatening_is_converted_to_json()
{


    bourne::json input =
    {
        "harassmentthreatening", true
    };

    CreateModerationResponse_results_inner_categories obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["harassmentthreatening"] == output["harassmentthreatening"]);


}


void test_CreateModerationResponse_results_inner_categories_illicit_is_converted_to_json()
{


    bourne::json input =
    {
        "illicit", true
    };

    CreateModerationResponse_results_inner_categories obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["illicit"] == output["illicit"]);


}


void test_CreateModerationResponse_results_inner_categories_illicitviolent_is_converted_to_json()
{


    bourne::json input =
    {
        "illicitviolent", true
    };

    CreateModerationResponse_results_inner_categories obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["illicitviolent"] == output["illicitviolent"]);


}


void test_CreateModerationResponse_results_inner_categories_selfharm_is_converted_to_json()
{


    bourne::json input =
    {
        "selfharm", true
    };

    CreateModerationResponse_results_inner_categories obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["selfharm"] == output["selfharm"]);


}


void test_CreateModerationResponse_results_inner_categories_selfharmintent_is_converted_to_json()
{


    bourne::json input =
    {
        "selfharmintent", true
    };

    CreateModerationResponse_results_inner_categories obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["selfharmintent"] == output["selfharmintent"]);


}


void test_CreateModerationResponse_results_inner_categories_selfharminstructions_is_converted_to_json()
{


    bourne::json input =
    {
        "selfharminstructions", true
    };

    CreateModerationResponse_results_inner_categories obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["selfharminstructions"] == output["selfharminstructions"]);


}


void test_CreateModerationResponse_results_inner_categories_sexual_is_converted_to_json()
{


    bourne::json input =
    {
        "sexual", true
    };

    CreateModerationResponse_results_inner_categories obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["sexual"] == output["sexual"]);


}


void test_CreateModerationResponse_results_inner_categories_sexualminors_is_converted_to_json()
{


    bourne::json input =
    {
        "sexualminors", true
    };

    CreateModerationResponse_results_inner_categories obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["sexualminors"] == output["sexualminors"]);


}


void test_CreateModerationResponse_results_inner_categories_violence_is_converted_to_json()
{


    bourne::json input =
    {
        "violence", true
    };

    CreateModerationResponse_results_inner_categories obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["violence"] == output["violence"]);


}


void test_CreateModerationResponse_results_inner_categories_violencegraphic_is_converted_to_json()
{


    bourne::json input =
    {
        "violencegraphic", true
    };

    CreateModerationResponse_results_inner_categories obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["violencegraphic"] == output["violencegraphic"]);


}


