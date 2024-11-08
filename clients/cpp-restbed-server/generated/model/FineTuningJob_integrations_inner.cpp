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



#include "FineTuningJob_integrations_inner.h"

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

FineTuningJob_integrations_inner::FineTuningJob_integrations_inner(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string FineTuningJob_integrations_inner::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void FineTuningJob_integrations_inner::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree FineTuningJob_integrations_inner::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("type", m_Type);
	pt.add_child("wandb", m_Wandb.toPropertyTree());
	return pt;
}

void FineTuningJob_integrations_inner::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	setType(pt.get("type", ""));
	if (pt.get_child_optional("wandb")) {
        m_Wandb = fromPt<CreateFineTuningJobRequest_integrations_inner_wandb>(pt.get_child("wandb"));
	}
}

std::string FineTuningJob_integrations_inner::getType() const
{
    return m_Type;
}

void FineTuningJob_integrations_inner::setType(std::string value)
{
    static const std::array<std::string, 1> allowedValues = {
        "wandb"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Type = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


CreateFineTuningJobRequest_integrations_inner_wandb FineTuningJob_integrations_inner::getWandb() const
{
    return m_Wandb;
}

void FineTuningJob_integrations_inner::setWandb(CreateFineTuningJobRequest_integrations_inner_wandb value)
{
    m_Wandb = value;
}



std::vector<FineTuningJob_integrations_inner> createFineTuningJob_integrations_innerVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<FineTuningJob_integrations_inner>();
    for (const auto& child: pt) {
        vec.emplace_back(FineTuningJob_integrations_inner(child.second));
    }

    return vec;
}

}
}
}
}

