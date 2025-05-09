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



#include "CreateChatCompletionResponse_choices_inner.h"

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

CreateChatCompletionResponse_choices_inner::CreateChatCompletionResponse_choices_inner(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CreateChatCompletionResponse_choices_inner::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CreateChatCompletionResponse_choices_inner::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CreateChatCompletionResponse_choices_inner::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("finish_reason", m_Finish_reason);
	pt.put("index", m_Index);
	pt.add_child("message", m_Message.toPropertyTree());
	pt.add_child("logprobs", m_Logprobs.toPropertyTree());
	return pt;
}

void CreateChatCompletionResponse_choices_inner::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	setFinishReason(pt.get("finish_reason", ""));
	m_Index = pt.get("index", 0);
	if (pt.get_child_optional("message")) {
        m_Message = fromPt<ChatCompletionResponseMessage>(pt.get_child("message"));
	}
	if (pt.get_child_optional("logprobs")) {
        m_Logprobs = fromPt<CreateChatCompletionResponse_choices_inner_logprobs>(pt.get_child("logprobs"));
	}
}

std::string CreateChatCompletionResponse_choices_inner::getFinishReason() const
{
    return m_Finish_reason;
}

void CreateChatCompletionResponse_choices_inner::setFinishReason(std::string value)
{
    static const std::array<std::string, 5> allowedValues = {
        "stop", "length", "tool_calls", "content_filter", "function_call"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Finish_reason = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


int32_t CreateChatCompletionResponse_choices_inner::getIndex() const
{
    return m_Index;
}

void CreateChatCompletionResponse_choices_inner::setIndex(int32_t value)
{
    m_Index = value;
}


ChatCompletionResponseMessage CreateChatCompletionResponse_choices_inner::getMessage() const
{
    return m_Message;
}

void CreateChatCompletionResponse_choices_inner::setMessage(ChatCompletionResponseMessage value)
{
    m_Message = value;
}


CreateChatCompletionResponse_choices_inner_logprobs CreateChatCompletionResponse_choices_inner::getLogprobs() const
{
    return m_Logprobs;
}

void CreateChatCompletionResponse_choices_inner::setLogprobs(CreateChatCompletionResponse_choices_inner_logprobs value)
{
    m_Logprobs = value;
}



std::vector<CreateChatCompletionResponse_choices_inner> createCreateChatCompletionResponse_choices_innerVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CreateChatCompletionResponse_choices_inner>();
    for (const auto& child: pt) {
        vec.emplace_back(CreateChatCompletionResponse_choices_inner(child.second));
    }

    return vec;
}

}
}
}
}

