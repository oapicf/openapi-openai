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



#include "RunStepDetailsMessageCreationObject_message_creation.h"

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

RunStepDetailsMessageCreationObject_message_creation::RunStepDetailsMessageCreationObject_message_creation(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string RunStepDetailsMessageCreationObject_message_creation::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void RunStepDetailsMessageCreationObject_message_creation::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree RunStepDetailsMessageCreationObject_message_creation::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("message_id", m_Message_id);
	return pt;
}

void RunStepDetailsMessageCreationObject_message_creation::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Message_id = pt.get("message_id", "");
}

std::string RunStepDetailsMessageCreationObject_message_creation::getMessageId() const
{
    return m_Message_id;
}

void RunStepDetailsMessageCreationObject_message_creation::setMessageId(std::string value)
{
    m_Message_id = value;
}



std::vector<RunStepDetailsMessageCreationObject_message_creation> createRunStepDetailsMessageCreationObject_message_creationVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<RunStepDetailsMessageCreationObject_message_creation>();
    for (const auto& child: pt) {
        vec.emplace_back(RunStepDetailsMessageCreationObject_message_creation(child.second));
    }

    return vec;
}

}
}
}
}

