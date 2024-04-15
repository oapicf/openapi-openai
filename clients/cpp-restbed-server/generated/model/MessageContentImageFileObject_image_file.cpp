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



#include "MessageContentImageFileObject_image_file.h"

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

MessageContentImageFileObject_image_file::MessageContentImageFileObject_image_file(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string MessageContentImageFileObject_image_file::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void MessageContentImageFileObject_image_file::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree MessageContentImageFileObject_image_file::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("file_id", m_File_id);
	return pt;
}

void MessageContentImageFileObject_image_file::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_File_id = pt.get("file_id", "");
}

std::string MessageContentImageFileObject_image_file::getFileId() const
{
    return m_File_id;
}

void MessageContentImageFileObject_image_file::setFileId(std::string value)
{
    m_File_id = value;
}



std::vector<MessageContentImageFileObject_image_file> createMessageContentImageFileObject_image_fileVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<MessageContentImageFileObject_image_file>();
    for (const auto& child: pt) {
        vec.emplace_back(MessageContentImageFileObject_image_file(child.second));
    }

    return vec;
}

}
}
}
}
