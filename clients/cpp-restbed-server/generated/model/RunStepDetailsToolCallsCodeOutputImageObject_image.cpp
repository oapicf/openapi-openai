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



#include "RunStepDetailsToolCallsCodeOutputImageObject_image.h"

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

RunStepDetailsToolCallsCodeOutputImageObject_image::RunStepDetailsToolCallsCodeOutputImageObject_image(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string RunStepDetailsToolCallsCodeOutputImageObject_image::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void RunStepDetailsToolCallsCodeOutputImageObject_image::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree RunStepDetailsToolCallsCodeOutputImageObject_image::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("file_id", m_File_id);
	return pt;
}

void RunStepDetailsToolCallsCodeOutputImageObject_image::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_File_id = pt.get("file_id", "");
}

std::string RunStepDetailsToolCallsCodeOutputImageObject_image::getFileId() const
{
    return m_File_id;
}

void RunStepDetailsToolCallsCodeOutputImageObject_image::setFileId(std::string value)
{
    m_File_id = value;
}



std::vector<RunStepDetailsToolCallsCodeOutputImageObject_image> createRunStepDetailsToolCallsCodeOutputImageObject_imageVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<RunStepDetailsToolCallsCodeOutputImageObject_image>();
    for (const auto& child: pt) {
        vec.emplace_back(RunStepDetailsToolCallsCodeOutputImageObject_image(child.second));
    }

    return vec;
}

}
}
}
}

