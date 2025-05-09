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



#include "MessageContentTextAnnotationsFileCitationObject_file_citation.h"

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

MessageContentTextAnnotationsFileCitationObject_file_citation::MessageContentTextAnnotationsFileCitationObject_file_citation(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string MessageContentTextAnnotationsFileCitationObject_file_citation::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void MessageContentTextAnnotationsFileCitationObject_file_citation::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree MessageContentTextAnnotationsFileCitationObject_file_citation::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("file_id", m_File_id);
	pt.put("quote", m_Quote);
	return pt;
}

void MessageContentTextAnnotationsFileCitationObject_file_citation::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_File_id = pt.get("file_id", "");
	m_Quote = pt.get("quote", "");
}

std::string MessageContentTextAnnotationsFileCitationObject_file_citation::getFileId() const
{
    return m_File_id;
}

void MessageContentTextAnnotationsFileCitationObject_file_citation::setFileId(std::string value)
{
    m_File_id = value;
}


std::string MessageContentTextAnnotationsFileCitationObject_file_citation::getQuote() const
{
    return m_Quote;
}

void MessageContentTextAnnotationsFileCitationObject_file_citation::setQuote(std::string value)
{
    m_Quote = value;
}



std::vector<MessageContentTextAnnotationsFileCitationObject_file_citation> createMessageContentTextAnnotationsFileCitationObject_file_citationVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<MessageContentTextAnnotationsFileCitationObject_file_citation>();
    for (const auto& child: pt) {
        vec.emplace_back(MessageContentTextAnnotationsFileCitationObject_file_citation(child.second));
    }

    return vec;
}

}
}
}
}

