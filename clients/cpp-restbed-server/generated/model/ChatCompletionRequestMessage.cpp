/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "ChatCompletionRequestMessage.h"

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

ChatCompletionRequestMessage::ChatCompletionRequestMessage(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string ChatCompletionRequestMessage::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void ChatCompletionRequestMessage::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ChatCompletionRequestMessage::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("role", m_Role);
	pt.put("content", m_Content);
	pt.put("name", m_Name);
	pt.add_child("function_call", m_Function_call.toPropertyTree());
	return pt;
}

void ChatCompletionRequestMessage::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	setRole(pt.get("role", ""));
	m_Content = pt.get("content", "");
	m_Name = pt.get("name", "");
	if (pt.get_child_optional("function_call")) {
        m_Function_call = fromPt<ChatCompletionRequestMessage_function_call>(pt.get_child("function_call"));
	}
}

std::string ChatCompletionRequestMessage::getRole() const
{
    return m_Role;
}

void ChatCompletionRequestMessage::setRole(std::string value)
{
    static const std::array<std::string, 4> allowedValues = {
        "system", "user", "assistant", "function"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Role = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


std::string ChatCompletionRequestMessage::getContent() const
{
    return m_Content;
}

void ChatCompletionRequestMessage::setContent(std::string value)
{
    m_Content = value;
}


std::string ChatCompletionRequestMessage::getName() const
{
    return m_Name;
}

void ChatCompletionRequestMessage::setName(std::string value)
{
    m_Name = value;
}


ChatCompletionRequestMessage_function_call ChatCompletionRequestMessage::getFunctionCall() const
{
    return m_Function_call;
}

void ChatCompletionRequestMessage::setFunctionCall(ChatCompletionRequestMessage_function_call value)
{
    m_Function_call = value;
}



std::vector<ChatCompletionRequestMessage> createChatCompletionRequestMessageVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ChatCompletionRequestMessage>();
    for (const auto& child: pt) {
        vec.emplace_back(ChatCompletionRequestMessage(child.second));
    }

    return vec;
}

}
}
}
}

