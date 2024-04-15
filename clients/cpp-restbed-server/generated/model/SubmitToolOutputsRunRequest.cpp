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



#include "SubmitToolOutputsRunRequest.h"

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

SubmitToolOutputsRunRequest::SubmitToolOutputsRunRequest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string SubmitToolOutputsRunRequest::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void SubmitToolOutputsRunRequest::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree SubmitToolOutputsRunRequest::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	// generate tree for Tool_outputs
    tmp_node.clear();
	if (!m_Tool_outputs.empty()) {
        tmp_node = toPt(m_Tool_outputs);
		pt.add_child("tool_outputs", tmp_node);
		tmp_node.clear();
	}
	pt.put("stream", m_Stream);
	return pt;
}

void SubmitToolOutputsRunRequest::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	// push all items of Tool_outputs into member
	if (pt.get_child_optional("tool_outputs")) {
        m_Tool_outputs = fromPt<std::vector<SubmitToolOutputsRunRequest_tool_outputs_inner>>(pt.get_child("tool_outputs"));
	}
	m_Stream = pt.get("stream", false);
}

std::vector<SubmitToolOutputsRunRequest_tool_outputs_inner> SubmitToolOutputsRunRequest::getToolOutputs() const
{
    return m_Tool_outputs;
}

void SubmitToolOutputsRunRequest::setToolOutputs(std::vector<SubmitToolOutputsRunRequest_tool_outputs_inner> value)
{
    m_Tool_outputs = value;
}


bool SubmitToolOutputsRunRequest::isStream() const
{
    return m_Stream;
}

void SubmitToolOutputsRunRequest::setStream(bool value)
{
    m_Stream = value;
}



std::vector<SubmitToolOutputsRunRequest> createSubmitToolOutputsRunRequestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<SubmitToolOutputsRunRequest>();
    for (const auto& child: pt) {
        vec.emplace_back(SubmitToolOutputsRunRequest(child.second));
    }

    return vec;
}

}
}
}
}
