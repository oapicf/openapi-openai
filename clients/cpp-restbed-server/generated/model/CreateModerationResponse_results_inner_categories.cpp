/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CreateModerationResponse_results_inner_categories.h"

#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
#include <boost/lexical_cast.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include "helpers.h"

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

CreateModerationResponse_results_inner_categories::CreateModerationResponse_results_inner_categories(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CreateModerationResponse_results_inner_categories::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CreateModerationResponse_results_inner_categories::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CreateModerationResponse_results_inner_categories::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("hate", m_Hate);
	pt.put("hate/threatening", m_Hate_threatening);
	pt.put("harassment", m_Harassment);
	pt.put("harassment/threatening", m_Harassment_threatening);
	pt.put("self-harm", m_Self_harm);
	pt.put("self-harm/intent", m_Self_harm_intent);
	pt.put("self-harm/instructions", m_Self_harm_instructions);
	pt.put("sexual", m_Sexual);
	pt.put("sexual/minors", m_Sexual_minors);
	pt.put("violence", m_Violence);
	pt.put("violence/graphic", m_Violence_graphic);
	return pt;
}

void CreateModerationResponse_results_inner_categories::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Hate = pt.get("hate", false);
	m_Hate_threatening = pt.get("hate/threatening", false);
	m_Harassment = pt.get("harassment", false);
	m_Harassment_threatening = pt.get("harassment/threatening", false);
	m_Self_harm = pt.get("self-harm", false);
	m_Self_harm_intent = pt.get("self-harm/intent", false);
	m_Self_harm_instructions = pt.get("self-harm/instructions", false);
	m_Sexual = pt.get("sexual", false);
	m_Sexual_minors = pt.get("sexual/minors", false);
	m_Violence = pt.get("violence", false);
	m_Violence_graphic = pt.get("violence/graphic", false);
}

bool CreateModerationResponse_results_inner_categories::isHate() const
{
    return m_Hate;
}

void CreateModerationResponse_results_inner_categories::setHate(bool value)
{
    m_Hate = value;
}


bool CreateModerationResponse_results_inner_categories::isHateThreatening() const
{
    return m_Hate_threatening;
}

void CreateModerationResponse_results_inner_categories::setHateThreatening(bool value)
{
    m_Hate_threatening = value;
}


bool CreateModerationResponse_results_inner_categories::isHarassment() const
{
    return m_Harassment;
}

void CreateModerationResponse_results_inner_categories::setHarassment(bool value)
{
    m_Harassment = value;
}


bool CreateModerationResponse_results_inner_categories::isHarassmentThreatening() const
{
    return m_Harassment_threatening;
}

void CreateModerationResponse_results_inner_categories::setHarassmentThreatening(bool value)
{
    m_Harassment_threatening = value;
}


bool CreateModerationResponse_results_inner_categories::isSelfHarm() const
{
    return m_Self_harm;
}

void CreateModerationResponse_results_inner_categories::setSelfHarm(bool value)
{
    m_Self_harm = value;
}


bool CreateModerationResponse_results_inner_categories::isSelfHarmIntent() const
{
    return m_Self_harm_intent;
}

void CreateModerationResponse_results_inner_categories::setSelfHarmIntent(bool value)
{
    m_Self_harm_intent = value;
}


bool CreateModerationResponse_results_inner_categories::isSelfHarmInstructions() const
{
    return m_Self_harm_instructions;
}

void CreateModerationResponse_results_inner_categories::setSelfHarmInstructions(bool value)
{
    m_Self_harm_instructions = value;
}


bool CreateModerationResponse_results_inner_categories::isSexual() const
{
    return m_Sexual;
}

void CreateModerationResponse_results_inner_categories::setSexual(bool value)
{
    m_Sexual = value;
}


bool CreateModerationResponse_results_inner_categories::isSexualMinors() const
{
    return m_Sexual_minors;
}

void CreateModerationResponse_results_inner_categories::setSexualMinors(bool value)
{
    m_Sexual_minors = value;
}


bool CreateModerationResponse_results_inner_categories::isViolence() const
{
    return m_Violence;
}

void CreateModerationResponse_results_inner_categories::setViolence(bool value)
{
    m_Violence = value;
}


bool CreateModerationResponse_results_inner_categories::isViolenceGraphic() const
{
    return m_Violence_graphic;
}

void CreateModerationResponse_results_inner_categories::setViolenceGraphic(bool value)
{
    m_Violence_graphic = value;
}



std::vector<CreateModerationResponse_results_inner_categories> createCreateModerationResponse_results_inner_categoriesVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CreateModerationResponse_results_inner_categories>();
    for (const auto& child: pt) {
        vec.emplace_back(CreateModerationResponse_results_inner_categories(child.second));
    }

    return vec;
}

}
}
}
}

