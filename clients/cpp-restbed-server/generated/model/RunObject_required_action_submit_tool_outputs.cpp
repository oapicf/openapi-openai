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



#include "RunObject_required_action_submit_tool_outputs.h"

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

RunObject_required_action_submit_tool_outputs::RunObject_required_action_submit_tool_outputs(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string RunObject_required_action_submit_tool_outputs::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void RunObject_required_action_submit_tool_outputs::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree RunObject_required_action_submit_tool_outputs::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	// generate tree for Tool_calls
    tmp_node.clear();
	if (!m_Tool_calls.empty()) {
        tmp_node = toPt(m_Tool_calls);
		pt.add_child("tool_calls", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void RunObject_required_action_submit_tool_outputs::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	// push all items of Tool_calls into member
	if (pt.get_child_optional("tool_calls")) {
        m_Tool_calls = fromPt<std::vector<RunToolCallObject>>(pt.get_child("tool_calls"));
	}
}

std::vector<RunToolCallObject> RunObject_required_action_submit_tool_outputs::getToolCalls() const
{
    return m_Tool_calls;
}

void RunObject_required_action_submit_tool_outputs::setToolCalls(std::vector<RunToolCallObject> value)
{
    m_Tool_calls = value;
}



std::vector<RunObject_required_action_submit_tool_outputs> createRunObject_required_action_submit_tool_outputsVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<RunObject_required_action_submit_tool_outputs>();
    for (const auto& child: pt) {
        vec.emplace_back(RunObject_required_action_submit_tool_outputs(child.second));
    }

    return vec;
}

}
}
}
}

