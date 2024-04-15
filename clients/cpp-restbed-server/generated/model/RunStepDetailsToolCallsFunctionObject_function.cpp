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



#include "RunStepDetailsToolCallsFunctionObject_function.h"

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

RunStepDetailsToolCallsFunctionObject_function::RunStepDetailsToolCallsFunctionObject_function(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string RunStepDetailsToolCallsFunctionObject_function::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void RunStepDetailsToolCallsFunctionObject_function::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree RunStepDetailsToolCallsFunctionObject_function::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("name", m_Name);
	pt.put("arguments", m_Arguments);
	pt.put("output", m_Output);
	return pt;
}

void RunStepDetailsToolCallsFunctionObject_function::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Name = pt.get("name", "");
	m_Arguments = pt.get("arguments", "");
	m_Output = pt.get("output", "");
}

std::string RunStepDetailsToolCallsFunctionObject_function::getName() const
{
    return m_Name;
}

void RunStepDetailsToolCallsFunctionObject_function::setName(std::string value)
{
    m_Name = value;
}


std::string RunStepDetailsToolCallsFunctionObject_function::getArguments() const
{
    return m_Arguments;
}

void RunStepDetailsToolCallsFunctionObject_function::setArguments(std::string value)
{
    m_Arguments = value;
}


std::string RunStepDetailsToolCallsFunctionObject_function::getOutput() const
{
    return m_Output;
}

void RunStepDetailsToolCallsFunctionObject_function::setOutput(std::string value)
{
    m_Output = value;
}



std::vector<RunStepDetailsToolCallsFunctionObject_function> createRunStepDetailsToolCallsFunctionObject_functionVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<RunStepDetailsToolCallsFunctionObject_function>();
    for (const auto& child: pt) {
        vec.emplace_back(RunStepDetailsToolCallsFunctionObject_function(child.second));
    }

    return vec;
}

}
}
}
}
