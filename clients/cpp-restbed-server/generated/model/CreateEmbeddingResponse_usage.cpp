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



#include "CreateEmbeddingResponse_usage.h"

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

CreateEmbeddingResponse_usage::CreateEmbeddingResponse_usage(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CreateEmbeddingResponse_usage::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CreateEmbeddingResponse_usage::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CreateEmbeddingResponse_usage::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("prompt_tokens", m_Prompt_tokens);
	pt.put("total_tokens", m_Total_tokens);
	return pt;
}

void CreateEmbeddingResponse_usage::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Prompt_tokens = pt.get("prompt_tokens", 0);
	m_Total_tokens = pt.get("total_tokens", 0);
}

int32_t CreateEmbeddingResponse_usage::getPromptTokens() const
{
    return m_Prompt_tokens;
}

void CreateEmbeddingResponse_usage::setPromptTokens(int32_t value)
{
    m_Prompt_tokens = value;
}


int32_t CreateEmbeddingResponse_usage::getTotalTokens() const
{
    return m_Total_tokens;
}

void CreateEmbeddingResponse_usage::setTotalTokens(int32_t value)
{
    m_Total_tokens = value;
}



std::vector<CreateEmbeddingResponse_usage> createCreateEmbeddingResponse_usageVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CreateEmbeddingResponse_usage>();
    for (const auto& child: pt) {
        vec.emplace_back(CreateEmbeddingResponse_usage(child.second));
    }

    return vec;
}

}
}
}
}
