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



#include "RunStepStreamEvent_oneOf_6.h"

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

RunStepStreamEvent_oneOf_6::RunStepStreamEvent_oneOf_6(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string RunStepStreamEvent_oneOf_6::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void RunStepStreamEvent_oneOf_6::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree RunStepStreamEvent_oneOf_6::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("event", m_Event);
	pt.add_child("data", m_Data.toPropertyTree());
	return pt;
}

void RunStepStreamEvent_oneOf_6::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	setEvent(pt.get("event", ""));
	if (pt.get_child_optional("data")) {
        m_Data = fromPt<RunStepObject>(pt.get_child("data"));
	}
}

std::string RunStepStreamEvent_oneOf_6::getEvent() const
{
    return m_Event;
}

void RunStepStreamEvent_oneOf_6::setEvent(std::string value)
{
    static const std::array<std::string, 1> allowedValues = {
        "thread.run.step.expired"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Event = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


RunStepObject RunStepStreamEvent_oneOf_6::getData() const
{
    return m_Data;
}

void RunStepStreamEvent_oneOf_6::setData(RunStepObject value)
{
    m_Data = value;
}



std::vector<RunStepStreamEvent_oneOf_6> createRunStepStreamEvent_oneOf_6VectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<RunStepStreamEvent_oneOf_6>();
    for (const auto& child: pt) {
        vec.emplace_back(RunStepStreamEvent_oneOf_6(child.second));
    }

    return vec;
}

}
}
}
}

