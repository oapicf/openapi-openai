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



#include "RunStepCompletionUsage.h"

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

RunStepCompletionUsage::RunStepCompletionUsage(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string RunStepCompletionUsage::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void RunStepCompletionUsage::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree RunStepCompletionUsage::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("completion_tokens", m_Completion_tokens);
	pt.put("prompt_tokens", m_Prompt_tokens);
	pt.put("total_tokens", m_Total_tokens);
	return pt;
}

void RunStepCompletionUsage::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Completion_tokens = pt.get("completion_tokens", 0);
	m_Prompt_tokens = pt.get("prompt_tokens", 0);
	m_Total_tokens = pt.get("total_tokens", 0);
}

int32_t RunStepCompletionUsage::getCompletionTokens() const
{
    return m_Completion_tokens;
}

void RunStepCompletionUsage::setCompletionTokens(int32_t value)
{
    m_Completion_tokens = value;
}


int32_t RunStepCompletionUsage::getPromptTokens() const
{
    return m_Prompt_tokens;
}

void RunStepCompletionUsage::setPromptTokens(int32_t value)
{
    m_Prompt_tokens = value;
}


int32_t RunStepCompletionUsage::getTotalTokens() const
{
    return m_Total_tokens;
}

void RunStepCompletionUsage::setTotalTokens(int32_t value)
{
    m_Total_tokens = value;
}



std::vector<RunStepCompletionUsage> createRunStepCompletionUsageVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<RunStepCompletionUsage>();
    for (const auto& child: pt) {
        vec.emplace_back(RunStepCompletionUsage(child.second));
    }

    return vec;
}

}
}
}
}

