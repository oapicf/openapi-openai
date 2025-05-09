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



#include "ChatCompletionRequestFunctionMessage.h"

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

ChatCompletionRequestFunctionMessage::ChatCompletionRequestFunctionMessage(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string ChatCompletionRequestFunctionMessage::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void ChatCompletionRequestFunctionMessage::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ChatCompletionRequestFunctionMessage::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("role", m_Role);
	pt.put("content", m_Content);
	pt.put("name", m_Name);
	return pt;
}

void ChatCompletionRequestFunctionMessage::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	setRole(pt.get("role", ""));
	m_Content = pt.get("content", "");
	m_Name = pt.get("name", "");
}

std::string ChatCompletionRequestFunctionMessage::getRole() const
{
    return m_Role;
}

void ChatCompletionRequestFunctionMessage::setRole(std::string value)
{
    static const std::array<std::string, 1> allowedValues = {
        "function"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Role = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


std::string ChatCompletionRequestFunctionMessage::getContent() const
{
    return m_Content;
}

void ChatCompletionRequestFunctionMessage::setContent(std::string value)
{
    m_Content = value;
}


std::string ChatCompletionRequestFunctionMessage::getName() const
{
    return m_Name;
}

void ChatCompletionRequestFunctionMessage::setName(std::string value)
{
    m_Name = value;
}



std::vector<ChatCompletionRequestFunctionMessage> createChatCompletionRequestFunctionMessageVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ChatCompletionRequestFunctionMessage>();
    for (const auto& child: pt) {
        vec.emplace_back(ChatCompletionRequestFunctionMessage(child.second));
    }

    return vec;
}

}
}
}
}

