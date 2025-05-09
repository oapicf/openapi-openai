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



#include "MessageDeltaContentTextAnnotationsFilePathObject.h"

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

MessageDeltaContentTextAnnotationsFilePathObject::MessageDeltaContentTextAnnotationsFilePathObject(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string MessageDeltaContentTextAnnotationsFilePathObject::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void MessageDeltaContentTextAnnotationsFilePathObject::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree MessageDeltaContentTextAnnotationsFilePathObject::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("index", m_Index);
	pt.put("type", m_Type);
	pt.put("text", m_Text);
	pt.add_child("file_path", m_File_path.toPropertyTree());
	pt.put("start_index", m_Start_index);
	pt.put("end_index", m_End_index);
	return pt;
}

void MessageDeltaContentTextAnnotationsFilePathObject::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Index = pt.get("index", 0);
	setType(pt.get("type", ""));
	m_Text = pt.get("text", "");
	if (pt.get_child_optional("file_path")) {
        m_File_path = fromPt<MessageDeltaContentTextAnnotationsFilePathObject_file_path>(pt.get_child("file_path"));
	}
	m_Start_index = pt.get("start_index", 0);
	m_End_index = pt.get("end_index", 0);
}

int32_t MessageDeltaContentTextAnnotationsFilePathObject::getIndex() const
{
    return m_Index;
}

void MessageDeltaContentTextAnnotationsFilePathObject::setIndex(int32_t value)
{
    m_Index = value;
}


std::string MessageDeltaContentTextAnnotationsFilePathObject::getType() const
{
    return m_Type;
}

void MessageDeltaContentTextAnnotationsFilePathObject::setType(std::string value)
{
    static const std::array<std::string, 1> allowedValues = {
        "file_path"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Type = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


std::string MessageDeltaContentTextAnnotationsFilePathObject::getText() const
{
    return m_Text;
}

void MessageDeltaContentTextAnnotationsFilePathObject::setText(std::string value)
{
    m_Text = value;
}


MessageDeltaContentTextAnnotationsFilePathObject_file_path MessageDeltaContentTextAnnotationsFilePathObject::getFilePath() const
{
    return m_File_path;
}

void MessageDeltaContentTextAnnotationsFilePathObject::setFilePath(MessageDeltaContentTextAnnotationsFilePathObject_file_path value)
{
    m_File_path = value;
}


int32_t MessageDeltaContentTextAnnotationsFilePathObject::getStartIndex() const
{
    return m_Start_index;
}

void MessageDeltaContentTextAnnotationsFilePathObject::setStartIndex(int32_t value)
{
    m_Start_index = value;
}


int32_t MessageDeltaContentTextAnnotationsFilePathObject::getEndIndex() const
{
    return m_End_index;
}

void MessageDeltaContentTextAnnotationsFilePathObject::setEndIndex(int32_t value)
{
    m_End_index = value;
}



std::vector<MessageDeltaContentTextAnnotationsFilePathObject> createMessageDeltaContentTextAnnotationsFilePathObjectVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<MessageDeltaContentTextAnnotationsFilePathObject>();
    for (const auto& child: pt) {
        vec.emplace_back(MessageDeltaContentTextAnnotationsFilePathObject(child.second));
    }

    return vec;
}

}
}
}
}

