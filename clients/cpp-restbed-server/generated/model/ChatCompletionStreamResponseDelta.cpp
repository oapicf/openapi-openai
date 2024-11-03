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



#include "ChatCompletionStreamResponseDelta.h"

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

ChatCompletionStreamResponseDelta::ChatCompletionStreamResponseDelta(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string ChatCompletionStreamResponseDelta::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void ChatCompletionStreamResponseDelta::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ChatCompletionStreamResponseDelta::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("content", m_Content);
	pt.add_child("function_call", m_Function_call.toPropertyTree());
	// generate tree for Tool_calls
    tmp_node.clear();
	if (!m_Tool_calls.empty()) {
        tmp_node = toPt(m_Tool_calls);
		pt.add_child("tool_calls", tmp_node);
		tmp_node.clear();
	}
	pt.put("role", m_Role);
	return pt;
}

void ChatCompletionStreamResponseDelta::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Content = pt.get("content", "");
	if (pt.get_child_optional("function_call")) {
        m_Function_call = fromPt<ChatCompletionStreamResponseDelta_function_call>(pt.get_child("function_call"));
	}
	// push all items of Tool_calls into member
	if (pt.get_child_optional("tool_calls")) {
        m_Tool_calls = fromPt<std::vector<ChatCompletionMessageToolCallChunk>>(pt.get_child("tool_calls"));
	}
	setRole(pt.get("role", ""));
}

std::string ChatCompletionStreamResponseDelta::getContent() const
{
    return m_Content;
}

void ChatCompletionStreamResponseDelta::setContent(std::string value)
{
    m_Content = value;
}


ChatCompletionStreamResponseDelta_function_call ChatCompletionStreamResponseDelta::getFunctionCall() const
{
    return m_Function_call;
}

void ChatCompletionStreamResponseDelta::setFunctionCall(ChatCompletionStreamResponseDelta_function_call value)
{
    m_Function_call = value;
}


std::vector<ChatCompletionMessageToolCallChunk> ChatCompletionStreamResponseDelta::getToolCalls() const
{
    return m_Tool_calls;
}

void ChatCompletionStreamResponseDelta::setToolCalls(std::vector<ChatCompletionMessageToolCallChunk> value)
{
    m_Tool_calls = value;
}


std::string ChatCompletionStreamResponseDelta::getRole() const
{
    return m_Role;
}

void ChatCompletionStreamResponseDelta::setRole(std::string value)
{
    static const std::array<std::string, 4> allowedValues = {
        "system", "user", "assistant", "tool"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Role = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}



std::vector<ChatCompletionStreamResponseDelta> createChatCompletionStreamResponseDeltaVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ChatCompletionStreamResponseDelta>();
    for (const auto& child: pt) {
        vec.emplace_back(ChatCompletionStreamResponseDelta(child.second));
    }

    return vec;
}

}
}
}
}

