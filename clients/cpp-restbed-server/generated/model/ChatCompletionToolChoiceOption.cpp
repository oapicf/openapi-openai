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



#include "ChatCompletionToolChoiceOption.h"

#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
#include <algorithm>
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

ChatCompletionToolChoiceOption::ChatCompletionToolChoiceOption(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string ChatCompletionToolChoiceOption::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void ChatCompletionToolChoiceOption::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ChatCompletionToolChoiceOption::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("type", m_Type);
	pt.add_child("function", m_Function.toPropertyTree());
	return pt;
}

void ChatCompletionToolChoiceOption::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	setType(pt.get("type", ""));
	if (pt.get_child_optional("function")) {
        m_Function = fromPt<ChatCompletionNamedToolChoice_function>(pt.get_child("function"));
	}
}

std::string ChatCompletionToolChoiceOption::getType() const
{
    return m_Type;
}

void ChatCompletionToolChoiceOption::setType(std::string value)
{
    static const std::array<std::string, 1> allowedValues = {
        "function"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Type = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


ChatCompletionNamedToolChoice_function ChatCompletionToolChoiceOption::getFunction() const
{
    return m_Function;
}

void ChatCompletionToolChoiceOption::setFunction(ChatCompletionNamedToolChoice_function value)
{
    m_Function = value;
}



std::vector<ChatCompletionToolChoiceOption> createChatCompletionToolChoiceOptionVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ChatCompletionToolChoiceOption>();
    for (const auto& child: pt) {
        vec.emplace_back(ChatCompletionToolChoiceOption(child.second));
    }

    return vec;
}

}
}
}
}

