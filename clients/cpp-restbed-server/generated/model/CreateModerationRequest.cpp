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



#include "CreateModerationRequest.h"

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

CreateModerationRequest::CreateModerationRequest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CreateModerationRequest::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CreateModerationRequest::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CreateModerationRequest::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.add_child("input", m_Input.toPropertyTree());
	pt.add_child("model", m_Model.toPropertyTree());
	return pt;
}

void CreateModerationRequest::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("input")) {
        m_Input = fromPt<CreateModerationRequest_input>(pt.get_child("input"));
	}
	if (pt.get_child_optional("model")) {
        m_Model = fromPt<CreateModerationRequest_model>(pt.get_child("model"));
	}
}

CreateModerationRequest_input CreateModerationRequest::getInput() const
{
    return m_Input;
}

void CreateModerationRequest::setInput(CreateModerationRequest_input value)
{
    m_Input = value;
}


CreateModerationRequest_model CreateModerationRequest::getModel() const
{
    return m_Model;
}

void CreateModerationRequest::setModel(CreateModerationRequest_model value)
{
    m_Model = value;
}



std::vector<CreateModerationRequest> createCreateModerationRequestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CreateModerationRequest>();
    for (const auto& child: pt) {
        vec.emplace_back(CreateModerationRequest(child.second));
    }

    return vec;
}

}
}
}
}

