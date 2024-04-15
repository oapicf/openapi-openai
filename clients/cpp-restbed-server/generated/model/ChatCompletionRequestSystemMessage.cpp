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



#include "ChatCompletionRequestSystemMessage.h"

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

ChatCompletionRequestSystemMessage::ChatCompletionRequestSystemMessage(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string ChatCompletionRequestSystemMessage::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void ChatCompletionRequestSystemMessage::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ChatCompletionRequestSystemMessage::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("content", m_Content);
	pt.put("role", m_Role);
	pt.put("name", m_Name);
	return pt;
}

void ChatCompletionRequestSystemMessage::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Content = pt.get("content", "");
	setRole(pt.get("role", ""));
	m_Name = pt.get("name", "");
}

std::string ChatCompletionRequestSystemMessage::getContent() const
{
    return m_Content;
}

void ChatCompletionRequestSystemMessage::setContent(std::string value)
{
    m_Content = value;
}


std::string ChatCompletionRequestSystemMessage::getRole() const
{
    return m_Role;
}

void ChatCompletionRequestSystemMessage::setRole(std::string value)
{
    static const std::array<std::string, 1> allowedValues = {
        "system"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Role = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


std::string ChatCompletionRequestSystemMessage::getName() const
{
    return m_Name;
}

void ChatCompletionRequestSystemMessage::setName(std::string value)
{
    m_Name = value;
}



std::vector<ChatCompletionRequestSystemMessage> createChatCompletionRequestSystemMessageVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ChatCompletionRequestSystemMessage>();
    for (const auto& child: pt) {
        vec.emplace_back(ChatCompletionRequestSystemMessage(child.second));
    }

    return vec;
}

}
}
}
}
