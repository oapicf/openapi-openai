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



#include "CreateThreadAndRunRequest.h"

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

CreateThreadAndRunRequest::CreateThreadAndRunRequest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CreateThreadAndRunRequest::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CreateThreadAndRunRequest::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CreateThreadAndRunRequest::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("assistant_id", m_Assistant_id);
	pt.add_child("thread", m_Thread.toPropertyTree());
	pt.add_child("model", m_Model.toPropertyTree());
	pt.put("instructions", m_Instructions);
	// generate tree for Tools
    tmp_node.clear();
	if (!m_Tools.empty()) {
        tmp_node = toPt(m_Tools);
		pt.add_child("tools", tmp_node);
		tmp_node.clear();
	}
	pt.put("temperature", m_Temperature);
	pt.put("stream", m_Stream);
	pt.put("max_prompt_tokens", m_Max_prompt_tokens);
	pt.put("max_completion_tokens", m_Max_completion_tokens);
	pt.add_child("truncation_strategy", m_Truncation_strategy.toPropertyTree());
	pt.add_child("tool_choice", m_Tool_choice.toPropertyTree());
	pt.add_child("response_format", m_Response_format.toPropertyTree());
	return pt;
}

void CreateThreadAndRunRequest::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Assistant_id = pt.get("assistant_id", "");
	if (pt.get_child_optional("thread")) {
        m_Thread = fromPt<CreateThreadRequest>(pt.get_child("thread"));
	}
	if (pt.get_child_optional("model")) {
        m_Model = fromPt<CreateRunRequest_model>(pt.get_child("model"));
	}
	m_Instructions = pt.get("instructions", "");
	// push all items of Tools into member
	if (pt.get_child_optional("tools")) {
        m_Tools = fromPt<std::vector<CreateThreadAndRunRequest_tools_inner>>(pt.get_child("tools"));
	}
	m_Temperature = pt.get("temperature", 1);
	m_Stream = pt.get("stream", false);
	m_Max_prompt_tokens = pt.get("max_prompt_tokens", 0);
	m_Max_completion_tokens = pt.get("max_completion_tokens", 0);
	if (pt.get_child_optional("truncation_strategy")) {
        m_Truncation_strategy = fromPt<TruncationObject>(pt.get_child("truncation_strategy"));
	}
	if (pt.get_child_optional("tool_choice")) {
        m_Tool_choice = fromPt<AssistantsApiToolChoiceOption>(pt.get_child("tool_choice"));
	}
	if (pt.get_child_optional("response_format")) {
        m_Response_format = fromPt<AssistantsApiResponseFormatOption>(pt.get_child("response_format"));
	}
}

std::string CreateThreadAndRunRequest::getAssistantId() const
{
    return m_Assistant_id;
}

void CreateThreadAndRunRequest::setAssistantId(std::string value)
{
    m_Assistant_id = value;
}


CreateThreadRequest CreateThreadAndRunRequest::getThread() const
{
    return m_Thread;
}

void CreateThreadAndRunRequest::setThread(CreateThreadRequest value)
{
    m_Thread = value;
}


CreateRunRequest_model CreateThreadAndRunRequest::getModel() const
{
    return m_Model;
}

void CreateThreadAndRunRequest::setModel(CreateRunRequest_model value)
{
    m_Model = value;
}


std::string CreateThreadAndRunRequest::getInstructions() const
{
    return m_Instructions;
}

void CreateThreadAndRunRequest::setInstructions(std::string value)
{
    m_Instructions = value;
}


std::vector<CreateThreadAndRunRequest_tools_inner> CreateThreadAndRunRequest::getTools() const
{
    return m_Tools;
}

void CreateThreadAndRunRequest::setTools(std::vector<CreateThreadAndRunRequest_tools_inner> value)
{
    m_Tools = value;
}


std::string CreateThreadAndRunRequest::getMetadata() const
{
    return m_Metadata;
}

void CreateThreadAndRunRequest::setMetadata(std::string value)
{
    m_Metadata = value;
}


double CreateThreadAndRunRequest::getTemperature() const
{
    return m_Temperature;
}

void CreateThreadAndRunRequest::setTemperature(double value)
{
    m_Temperature = value;
}


bool CreateThreadAndRunRequest::isStream() const
{
    return m_Stream;
}

void CreateThreadAndRunRequest::setStream(bool value)
{
    m_Stream = value;
}


int32_t CreateThreadAndRunRequest::getMaxPromptTokens() const
{
    return m_Max_prompt_tokens;
}

void CreateThreadAndRunRequest::setMaxPromptTokens(int32_t value)
{
    m_Max_prompt_tokens = value;
}


int32_t CreateThreadAndRunRequest::getMaxCompletionTokens() const
{
    return m_Max_completion_tokens;
}

void CreateThreadAndRunRequest::setMaxCompletionTokens(int32_t value)
{
    m_Max_completion_tokens = value;
}


TruncationObject CreateThreadAndRunRequest::getTruncationStrategy() const
{
    return m_Truncation_strategy;
}

void CreateThreadAndRunRequest::setTruncationStrategy(TruncationObject value)
{
    m_Truncation_strategy = value;
}


AssistantsApiToolChoiceOption CreateThreadAndRunRequest::getToolChoice() const
{
    return m_Tool_choice;
}

void CreateThreadAndRunRequest::setToolChoice(AssistantsApiToolChoiceOption value)
{
    m_Tool_choice = value;
}


AssistantsApiResponseFormatOption CreateThreadAndRunRequest::getResponseFormat() const
{
    return m_Response_format;
}

void CreateThreadAndRunRequest::setResponseFormat(AssistantsApiResponseFormatOption value)
{
    m_Response_format = value;
}



std::vector<CreateThreadAndRunRequest> createCreateThreadAndRunRequestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CreateThreadAndRunRequest>();
    for (const auto& child: pt) {
        vec.emplace_back(CreateThreadAndRunRequest(child.second));
    }

    return vec;
}

}
}
}
}

