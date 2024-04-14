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



#include "ModifyMessageRequest.h"

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

ModifyMessageRequest::ModifyMessageRequest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string ModifyMessageRequest::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void ModifyMessageRequest::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ModifyMessageRequest::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	return pt;
}

void ModifyMessageRequest::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
}

std::string ModifyMessageRequest::getMetadata() const
{
    return m_Metadata;
}

void ModifyMessageRequest::setMetadata(std::string value)
{
    m_Metadata = value;
}



std::vector<ModifyMessageRequest> createModifyMessageRequestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ModifyMessageRequest>();
    for (const auto& child: pt) {
        vec.emplace_back(ModifyMessageRequest(child.second));
    }

    return vec;
}

}
}
}
}

