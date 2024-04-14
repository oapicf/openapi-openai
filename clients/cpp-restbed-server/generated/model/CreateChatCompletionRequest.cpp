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



#include "CreateChatCompletionRequest.h"

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

CreateChatCompletionRequest::CreateChatCompletionRequest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CreateChatCompletionRequest::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CreateChatCompletionRequest::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CreateChatCompletionRequest::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.add_child("model", m_Model.toPropertyTree());
	// generate tree for Messages
    tmp_node.clear();
	if (!m_Messages.empty()) {
        tmp_node = toPt(m_Messages);
		pt.add_child("messages", tmp_node);
		tmp_node.clear();
	}
	// generate tree for Functions
    tmp_node.clear();
	if (!m_Functions.empty()) {
        tmp_node = toPt(m_Functions);
		pt.add_child("functions", tmp_node);
		tmp_node.clear();
	}
	pt.add_child("function_call", m_Function_call.toPropertyTree());
	pt.put("temperature", m_Temperature);
	pt.put("top_p", m_Top_p);
	pt.put("n", m_n);
	pt.put("stream", m_Stream);
	pt.add_child("stop", m_Stop.toPropertyTree());
	pt.put("max_tokens", m_Max_tokens);
	pt.put("presence_penalty", m_Presence_penalty);
	pt.put("frequency_penalty", m_Frequency_penalty);
	pt.put("user", m_User);
	return pt;
}

void CreateChatCompletionRequest::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("model")) {
        m_Model = fromPt<CreateChatCompletionRequest_model>(pt.get_child("model"));
	}
	// push all items of Messages into member
	if (pt.get_child_optional("messages")) {
        m_Messages = fromPt<std::vector<ChatCompletionRequestMessage>>(pt.get_child("messages"));
	}
	// push all items of Functions into member
	if (pt.get_child_optional("functions")) {
        m_Functions = fromPt<std::vector<ChatCompletionFunctions>>(pt.get_child("functions"));
	}
	if (pt.get_child_optional("function_call")) {
        m_Function_call = fromPt<CreateChatCompletionRequest_function_call>(pt.get_child("function_call"));
	}
	m_Temperature = pt.get("temperature", 1);
	m_Top_p = pt.get("top_p", 1);
	m_n = pt.get("n", 1);
	m_Stream = pt.get("stream", false);
	if (pt.get_child_optional("stop")) {
        m_Stop = fromPt<CreateChatCompletionRequest_stop>(pt.get_child("stop"));
	}
	m_Max_tokens = pt.get("max_tokens", 0);
	m_Presence_penalty = pt.get("presence_penalty", 0);
	m_Frequency_penalty = pt.get("frequency_penalty", 0);
	m_User = pt.get("user", "");
}

CreateChatCompletionRequest_model CreateChatCompletionRequest::getModel() const
{
    return m_Model;
}

void CreateChatCompletionRequest::setModel(CreateChatCompletionRequest_model value)
{
    m_Model = value;
}


std::vector<ChatCompletionRequestMessage> CreateChatCompletionRequest::getMessages() const
{
    return m_Messages;
}

void CreateChatCompletionRequest::setMessages(std::vector<ChatCompletionRequestMessage> value)
{
    m_Messages = value;
}


std::vector<ChatCompletionFunctions> CreateChatCompletionRequest::getFunctions() const
{
    return m_Functions;
}

void CreateChatCompletionRequest::setFunctions(std::vector<ChatCompletionFunctions> value)
{
    m_Functions = value;
}


CreateChatCompletionRequest_function_call CreateChatCompletionRequest::getFunctionCall() const
{
    return m_Function_call;
}

void CreateChatCompletionRequest::setFunctionCall(CreateChatCompletionRequest_function_call value)
{
    m_Function_call = value;
}


double CreateChatCompletionRequest::getTemperature() const
{
    return m_Temperature;
}

void CreateChatCompletionRequest::setTemperature(double value)
{
    m_Temperature = value;
}


double CreateChatCompletionRequest::getTopP() const
{
    return m_Top_p;
}

void CreateChatCompletionRequest::setTopP(double value)
{
    m_Top_p = value;
}


int32_t CreateChatCompletionRequest::getN() const
{
    return m_n;
}

void CreateChatCompletionRequest::setN(int32_t value)
{
    m_n = value;
}


bool CreateChatCompletionRequest::isStream() const
{
    return m_Stream;
}

void CreateChatCompletionRequest::setStream(bool value)
{
    m_Stream = value;
}


CreateChatCompletionRequest_stop CreateChatCompletionRequest::getStop() const
{
    return m_Stop;
}

void CreateChatCompletionRequest::setStop(CreateChatCompletionRequest_stop value)
{
    m_Stop = value;
}


int32_t CreateChatCompletionRequest::getMaxTokens() const
{
    return m_Max_tokens;
}

void CreateChatCompletionRequest::setMaxTokens(int32_t value)
{
    m_Max_tokens = value;
}


double CreateChatCompletionRequest::getPresencePenalty() const
{
    return m_Presence_penalty;
}

void CreateChatCompletionRequest::setPresencePenalty(double value)
{
    m_Presence_penalty = value;
}


double CreateChatCompletionRequest::getFrequencyPenalty() const
{
    return m_Frequency_penalty;
}

void CreateChatCompletionRequest::setFrequencyPenalty(double value)
{
    m_Frequency_penalty = value;
}


std::string CreateChatCompletionRequest::getLogitBias() const
{
    return m_Logit_bias;
}

void CreateChatCompletionRequest::setLogitBias(std::string value)
{
    m_Logit_bias = value;
}


std::string CreateChatCompletionRequest::getUser() const
{
    return m_User;
}

void CreateChatCompletionRequest::setUser(std::string value)
{
    m_User = value;
}



std::vector<CreateChatCompletionRequest> createCreateChatCompletionRequestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CreateChatCompletionRequest>();
    for (const auto& child: pt) {
        vec.emplace_back(CreateChatCompletionRequest(child.second));
    }

    return vec;
}

}
}
}
}
