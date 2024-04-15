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
	pt.put("content", m_Content);
	pt.put("role", m_Role);
	pt.put("name", m_Name);
	// generate tree for Tool_calls
    tmp_node.clear();
	if (!m_Tool_calls.empty()) {
        tmp_node = toPt(m_Tool_calls);
		pt.add_child("tool_calls", tmp_node);
		tmp_node.clear();
	}
	pt.add_child("function_call", m_Function_call.toPropertyTree());
	pt.put("tool_call_id", m_Tool_call_id);
	return pt;
}

void ChatCompletionRequestMessage::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Content = pt.get("content", "");
	setRole(pt.get("role", ""));
	m_Name = pt.get("name", "");
	// push all items of Tool_calls into member
	if (pt.get_child_optional("tool_calls")) {
        m_Tool_calls = fromPt<std::vector<ChatCompletionMessageToolCall>>(pt.get_child("tool_calls"));
	}
	if (pt.get_child_optional("function_call")) {
        m_Function_call = fromPt<ChatCompletionRequestAssistantMessage_function_call>(pt.get_child("function_call"));
	}
	m_Tool_call_id = pt.get("tool_call_id", "");
}

std::string ChatCompletionRequestMessage::getContent() const
{
    return m_Content;
}

void ChatCompletionRequestMessage::setContent(std::string value)
{
    m_Content = value;
}


std::string ChatCompletionRequestMessage::getRole() const
{
    return m_Role;
}

void ChatCompletionRequestMessage::setRole(std::string value)
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


std::string ChatCompletionRequestMessage::getName() const
{
    return m_Name;
}

void ChatCompletionRequestMessage::setName(std::string value)
{
    m_Name = value;
}


std::vector<ChatCompletionMessageToolCall> ChatCompletionRequestMessage::getToolCalls() const
{
    return m_Tool_calls;
}

void ChatCompletionRequestMessage::setToolCalls(std::vector<ChatCompletionMessageToolCall> value)
{
    m_Tool_calls = value;
}


ChatCompletionRequestAssistantMessage_function_call ChatCompletionRequestMessage::getFunctionCall() const
{
    return m_Function_call;
}

void ChatCompletionRequestMessage::setFunctionCall(ChatCompletionRequestAssistantMessage_function_call value)
{
    m_Function_call = value;
}


std::string ChatCompletionRequestMessage::getToolCallId() const
{
    return m_Tool_call_id;
}

void ChatCompletionRequestMessage::setToolCallId(std::string value)
{
    m_Tool_call_id = value;
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
