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



#include "MessageDeltaObject_delta_content_inner.h"

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

MessageDeltaObject_delta_content_inner::MessageDeltaObject_delta_content_inner(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string MessageDeltaObject_delta_content_inner::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void MessageDeltaObject_delta_content_inner::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree MessageDeltaObject_delta_content_inner::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("index", m_Index);
	pt.put("type", m_Type);
	pt.add_child("image_file", m_Image_file.toPropertyTree());
	pt.add_child("text", m_Text.toPropertyTree());
	return pt;
}

void MessageDeltaObject_delta_content_inner::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Index = pt.get("index", 0);
	setType(pt.get("type", ""));
	if (pt.get_child_optional("image_file")) {
        m_Image_file = fromPt<MessageDeltaContentImageFileObject_image_file>(pt.get_child("image_file"));
	}
	if (pt.get_child_optional("text")) {
        m_Text = fromPt<MessageDeltaContentTextObject_text>(pt.get_child("text"));
	}
}

int32_t MessageDeltaObject_delta_content_inner::getIndex() const
{
    return m_Index;
}

void MessageDeltaObject_delta_content_inner::setIndex(int32_t value)
{
    m_Index = value;
}


std::string MessageDeltaObject_delta_content_inner::getType() const
{
    return m_Type;
}

void MessageDeltaObject_delta_content_inner::setType(std::string value)
{
    static const std::array<std::string, 2> allowedValues = {
        "image_file", "text"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Type = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


MessageDeltaContentImageFileObject_image_file MessageDeltaObject_delta_content_inner::getImageFile() const
{
    return m_Image_file;
}

void MessageDeltaObject_delta_content_inner::setImageFile(MessageDeltaContentImageFileObject_image_file value)
{
    m_Image_file = value;
}


MessageDeltaContentTextObject_text MessageDeltaObject_delta_content_inner::getText() const
{
    return m_Text;
}

void MessageDeltaObject_delta_content_inner::setText(MessageDeltaContentTextObject_text value)
{
    m_Text = value;
}



std::vector<MessageDeltaObject_delta_content_inner> createMessageDeltaObject_delta_content_innerVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<MessageDeltaObject_delta_content_inner>();
    for (const auto& child: pt) {
        vec.emplace_back(MessageDeltaObject_delta_content_inner(child.second));
    }

    return vec;
}

}
}
}
}
