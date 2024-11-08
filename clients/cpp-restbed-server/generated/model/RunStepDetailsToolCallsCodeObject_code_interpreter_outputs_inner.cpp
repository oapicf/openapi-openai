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



#include "RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner.h"

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

RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("type", m_Type);
	pt.put("logs", m_Logs);
	pt.add_child("image", m_Image.toPropertyTree());
	return pt;
}

void RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	setType(pt.get("type", ""));
	m_Logs = pt.get("logs", "");
	if (pt.get_child_optional("image")) {
        m_Image = fromPt<RunStepDetailsToolCallsCodeOutputImageObject_image>(pt.get_child("image"));
	}
}

std::string RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::getType() const
{
    return m_Type;
}

void RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::setType(std::string value)
{
    static const std::array<std::string, 2> allowedValues = {
        "logs", "image"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Type = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


std::string RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::getLogs() const
{
    return m_Logs;
}

void RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::setLogs(std::string value)
{
    m_Logs = value;
}


RunStepDetailsToolCallsCodeOutputImageObject_image RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::getImage() const
{
    return m_Image;
}

void RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::setImage(RunStepDetailsToolCallsCodeOutputImageObject_image value)
{
    m_Image = value;
}



std::vector<RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner> createRunStepDetailsToolCallsCodeObject_code_interpreter_outputs_innerVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner>();
    for (const auto& child: pt) {
        vec.emplace_back(RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner(child.second));
    }

    return vec;
}

}
}
}
}

