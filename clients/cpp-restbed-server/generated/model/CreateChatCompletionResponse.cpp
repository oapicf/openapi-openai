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



#include "CreateChatCompletionResponse.h"

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

CreateChatCompletionResponse::CreateChatCompletionResponse(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CreateChatCompletionResponse::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CreateChatCompletionResponse::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CreateChatCompletionResponse::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("id", m_Id);
	// generate tree for Choices
    tmp_node.clear();
	if (!m_Choices.empty()) {
        tmp_node = toPt(m_Choices);
		pt.add_child("choices", tmp_node);
		tmp_node.clear();
	}
	pt.put("created", m_Created);
	pt.put("model", m_Model);
	pt.put("system_fingerprint", m_System_fingerprint);
	pt.put("object", m_object);
	pt.add_child("usage", m_Usage.toPropertyTree());
	return pt;
}

void CreateChatCompletionResponse::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", "");
	// push all items of Choices into member
	if (pt.get_child_optional("choices")) {
        m_Choices = fromPt<std::vector<CreateChatCompletionResponse_choices_inner>>(pt.get_child("choices"));
	}
	m_Created = pt.get("created", 0);
	m_Model = pt.get("model", "");
	m_System_fingerprint = pt.get("system_fingerprint", "");
	setObject(pt.get("object", ""));
	if (pt.get_child_optional("usage")) {
        m_Usage = fromPt<CompletionUsage>(pt.get_child("usage"));
	}
}

std::string CreateChatCompletionResponse::getId() const
{
    return m_Id;
}

void CreateChatCompletionResponse::setId(std::string value)
{
    m_Id = value;
}


std::vector<CreateChatCompletionResponse_choices_inner> CreateChatCompletionResponse::getChoices() const
{
    return m_Choices;
}

void CreateChatCompletionResponse::setChoices(std::vector<CreateChatCompletionResponse_choices_inner> value)
{
    m_Choices = value;
}


int32_t CreateChatCompletionResponse::getCreated() const
{
    return m_Created;
}

void CreateChatCompletionResponse::setCreated(int32_t value)
{
    m_Created = value;
}


std::string CreateChatCompletionResponse::getModel() const
{
    return m_Model;
}

void CreateChatCompletionResponse::setModel(std::string value)
{
    m_Model = value;
}


std::string CreateChatCompletionResponse::getSystemFingerprint() const
{
    return m_System_fingerprint;
}

void CreateChatCompletionResponse::setSystemFingerprint(std::string value)
{
    m_System_fingerprint = value;
}


std::string CreateChatCompletionResponse::getObject() const
{
    return m_object;
}

void CreateChatCompletionResponse::setObject(std::string value)
{
    static const std::array<std::string, 1> allowedValues = {
        "chat.completion"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_object = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


CompletionUsage CreateChatCompletionResponse::getUsage() const
{
    return m_Usage;
}

void CreateChatCompletionResponse::setUsage(CompletionUsage value)
{
    m_Usage = value;
}



std::vector<CreateChatCompletionResponse> createCreateChatCompletionResponseVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CreateChatCompletionResponse>();
    for (const auto& child: pt) {
        vec.emplace_back(CreateChatCompletionResponse(child.second));
    }

    return vec;
}

}
}
}
}

