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



#include "RunStepDetailsToolCallsCodeOutputImageObject.h"

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

RunStepDetailsToolCallsCodeOutputImageObject::RunStepDetailsToolCallsCodeOutputImageObject(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string RunStepDetailsToolCallsCodeOutputImageObject::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void RunStepDetailsToolCallsCodeOutputImageObject::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree RunStepDetailsToolCallsCodeOutputImageObject::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("type", m_Type);
	pt.add_child("image", m_Image.toPropertyTree());
	return pt;
}

void RunStepDetailsToolCallsCodeOutputImageObject::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	setType(pt.get("type", ""));
	if (pt.get_child_optional("image")) {
        m_Image = fromPt<RunStepDetailsToolCallsCodeOutputImageObject_image>(pt.get_child("image"));
	}
}

std::string RunStepDetailsToolCallsCodeOutputImageObject::getType() const
{
    return m_Type;
}

void RunStepDetailsToolCallsCodeOutputImageObject::setType(std::string value)
{
    static const std::array<std::string, 1> allowedValues = {
        "image"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Type = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


RunStepDetailsToolCallsCodeOutputImageObject_image RunStepDetailsToolCallsCodeOutputImageObject::getImage() const
{
    return m_Image;
}

void RunStepDetailsToolCallsCodeOutputImageObject::setImage(RunStepDetailsToolCallsCodeOutputImageObject_image value)
{
    m_Image = value;
}



std::vector<RunStepDetailsToolCallsCodeOutputImageObject> createRunStepDetailsToolCallsCodeOutputImageObjectVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<RunStepDetailsToolCallsCodeOutputImageObject>();
    for (const auto& child: pt) {
        vec.emplace_back(RunStepDetailsToolCallsCodeOutputImageObject(child.second));
    }

    return vec;
}

}
}
}
}

