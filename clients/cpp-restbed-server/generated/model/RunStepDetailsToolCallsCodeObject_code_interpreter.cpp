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



#include "RunStepDetailsToolCallsCodeObject_code_interpreter.h"

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

RunStepDetailsToolCallsCodeObject_code_interpreter::RunStepDetailsToolCallsCodeObject_code_interpreter(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string RunStepDetailsToolCallsCodeObject_code_interpreter::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void RunStepDetailsToolCallsCodeObject_code_interpreter::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree RunStepDetailsToolCallsCodeObject_code_interpreter::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("input", m_Input);
	// generate tree for Outputs
    tmp_node.clear();
	if (!m_Outputs.empty()) {
        tmp_node = toPt(m_Outputs);
		pt.add_child("outputs", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void RunStepDetailsToolCallsCodeObject_code_interpreter::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Input = pt.get("input", "");
	// push all items of Outputs into member
	if (pt.get_child_optional("outputs")) {
        m_Outputs = fromPt<std::vector<RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner>>(pt.get_child("outputs"));
	}
}

std::string RunStepDetailsToolCallsCodeObject_code_interpreter::getInput() const
{
    return m_Input;
}

void RunStepDetailsToolCallsCodeObject_code_interpreter::setInput(std::string value)
{
    m_Input = value;
}


std::vector<RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner> RunStepDetailsToolCallsCodeObject_code_interpreter::getOutputs() const
{
    return m_Outputs;
}

void RunStepDetailsToolCallsCodeObject_code_interpreter::setOutputs(std::vector<RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner> value)
{
    m_Outputs = value;
}



std::vector<RunStepDetailsToolCallsCodeObject_code_interpreter> createRunStepDetailsToolCallsCodeObject_code_interpreterVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<RunStepDetailsToolCallsCodeObject_code_interpreter>();
    for (const auto& child: pt) {
        vec.emplace_back(RunStepDetailsToolCallsCodeObject_code_interpreter(child.second));
    }

    return vec;
}

}
}
}
}

