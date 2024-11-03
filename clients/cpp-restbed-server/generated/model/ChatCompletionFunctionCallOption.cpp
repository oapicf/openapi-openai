/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "ChatCompletionFunctionCallOption.h"

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

ChatCompletionFunctionCallOption::ChatCompletionFunctionCallOption(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string ChatCompletionFunctionCallOption::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void ChatCompletionFunctionCallOption::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ChatCompletionFunctionCallOption::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("name", m_Name);
	return pt;
}

void ChatCompletionFunctionCallOption::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Name = pt.get("name", "");
}

std::string ChatCompletionFunctionCallOption::getName() const
{
    return m_Name;
}

void ChatCompletionFunctionCallOption::setName(std::string value)
{
    m_Name = value;
}



std::vector<ChatCompletionFunctionCallOption> createChatCompletionFunctionCallOptionVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ChatCompletionFunctionCallOption>();
    for (const auto& child: pt) {
        vec.emplace_back(ChatCompletionFunctionCallOption(child.second));
    }

    return vec;
}

}
}
}
}

