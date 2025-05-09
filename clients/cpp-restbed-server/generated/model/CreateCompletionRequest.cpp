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



#include "CreateCompletionRequest.h"

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

CreateCompletionRequest::CreateCompletionRequest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CreateCompletionRequest::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CreateCompletionRequest::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CreateCompletionRequest::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.add_child("model", m_Model.toPropertyTree());
	pt.add_child("prompt", m_Prompt.toPropertyTree());
	pt.put("best_of", m_Best_of);
	pt.put("echo", m_Echo);
	pt.put("frequency_penalty", m_Frequency_penalty);
	// generate tree for Logit_bias
    if (!m_Logit_bias.empty()) {
        tmp_node = toPt(m_Logit_bias);
        pt.add_child("logit_bias", tmp_node);
    }
    tmp_node.clear();
	pt.put("logprobs", m_Logprobs);
	pt.put("max_tokens", m_Max_tokens);
	pt.put("n", m_n);
	pt.put("presence_penalty", m_Presence_penalty);
	pt.put("seed", m_Seed);
	pt.add_child("stop", m_Stop.toPropertyTree());
	pt.put("stream", m_Stream);
	pt.put("suffix", m_Suffix);
	pt.put("temperature", m_Temperature);
	pt.put("top_p", m_Top_p);
	pt.put("user", m_User);
	return pt;
}

void CreateCompletionRequest::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("model")) {
        m_Model = fromPt<CreateCompletionRequest_model>(pt.get_child("model"));
	}
	if (pt.get_child_optional("prompt")) {
        m_Prompt = fromPt<CreateCompletionRequest_prompt>(pt.get_child("prompt"));
	}
	m_Best_of = pt.get("best_of", 1);
	m_Echo = pt.get("echo", false);
	m_Frequency_penalty = pt.get("frequency_penalty", 0);
    if (pt.get_child_optional("logit_bias")) {
        m_Logit_bias = fromPt<std::map<std::string, int32_t>>(pt.get_child("logit_bias"));
    }
	m_Logprobs = pt.get("logprobs", 0);
	m_Max_tokens = pt.get("max_tokens", 16);
	m_n = pt.get("n", 1);
	m_Presence_penalty = pt.get("presence_penalty", 0);
	m_Seed = pt.get("seed", 0);
	if (pt.get_child_optional("stop")) {
        m_Stop = fromPt<CreateCompletionRequest_stop>(pt.get_child("stop"));
	}
	m_Stream = pt.get("stream", false);
	m_Suffix = pt.get("suffix", "");
	m_Temperature = pt.get("temperature", 1);
	m_Top_p = pt.get("top_p", 1);
	m_User = pt.get("user", "");
}

CreateCompletionRequest_model CreateCompletionRequest::getModel() const
{
    return m_Model;
}

void CreateCompletionRequest::setModel(CreateCompletionRequest_model value)
{
    m_Model = value;
}


CreateCompletionRequest_prompt CreateCompletionRequest::getPrompt() const
{
    return m_Prompt;
}

void CreateCompletionRequest::setPrompt(CreateCompletionRequest_prompt value)
{
    m_Prompt = value;
}


int32_t CreateCompletionRequest::getBestOf() const
{
    return m_Best_of;
}

void CreateCompletionRequest::setBestOf(int32_t value)
{
    m_Best_of = value;
}


bool CreateCompletionRequest::isEcho() const
{
    return m_Echo;
}

void CreateCompletionRequest::setEcho(bool value)
{
    m_Echo = value;
}


double CreateCompletionRequest::getFrequencyPenalty() const
{
    return m_Frequency_penalty;
}

void CreateCompletionRequest::setFrequencyPenalty(double value)
{
    m_Frequency_penalty = value;
}


std::map<std::string, int32_t> CreateCompletionRequest::getLogitBias() const
{
    return m_Logit_bias;
}

void CreateCompletionRequest::setLogitBias(std::map<std::string, int32_t> value)
{
    m_Logit_bias = value;
}


int32_t CreateCompletionRequest::getLogprobs() const
{
    return m_Logprobs;
}

void CreateCompletionRequest::setLogprobs(int32_t value)
{
    m_Logprobs = value;
}


int32_t CreateCompletionRequest::getMaxTokens() const
{
    return m_Max_tokens;
}

void CreateCompletionRequest::setMaxTokens(int32_t value)
{
    m_Max_tokens = value;
}


int32_t CreateCompletionRequest::getN() const
{
    return m_n;
}

void CreateCompletionRequest::setN(int32_t value)
{
    m_n = value;
}


double CreateCompletionRequest::getPresencePenalty() const
{
    return m_Presence_penalty;
}

void CreateCompletionRequest::setPresencePenalty(double value)
{
    m_Presence_penalty = value;
}


int32_t CreateCompletionRequest::getSeed() const
{
    return m_Seed;
}

void CreateCompletionRequest::setSeed(int32_t value)
{
    m_Seed = value;
}


CreateCompletionRequest_stop CreateCompletionRequest::getStop() const
{
    return m_Stop;
}

void CreateCompletionRequest::setStop(CreateCompletionRequest_stop value)
{
    m_Stop = value;
}


bool CreateCompletionRequest::isStream() const
{
    return m_Stream;
}

void CreateCompletionRequest::setStream(bool value)
{
    m_Stream = value;
}


std::string CreateCompletionRequest::getSuffix() const
{
    return m_Suffix;
}

void CreateCompletionRequest::setSuffix(std::string value)
{
    m_Suffix = value;
}


double CreateCompletionRequest::getTemperature() const
{
    return m_Temperature;
}

void CreateCompletionRequest::setTemperature(double value)
{
    m_Temperature = value;
}


double CreateCompletionRequest::getTopP() const
{
    return m_Top_p;
}

void CreateCompletionRequest::setTopP(double value)
{
    m_Top_p = value;
}


std::string CreateCompletionRequest::getUser() const
{
    return m_User;
}

void CreateCompletionRequest::setUser(std::string value)
{
    m_User = value;
}



std::vector<CreateCompletionRequest> createCreateCompletionRequestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CreateCompletionRequest>();
    for (const auto& child: pt) {
        vec.emplace_back(CreateCompletionRequest(child.second));
    }

    return vec;
}

}
}
}
}

