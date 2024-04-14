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



#include "ChatCompletionRequestMessageContentPart.h"

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

ChatCompletionRequestMessageContentPart::ChatCompletionRequestMessageContentPart(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string ChatCompletionRequestMessageContentPart::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void ChatCompletionRequestMessageContentPart::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ChatCompletionRequestMessageContentPart::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("type", m_Type);
	pt.put("text", m_Text);
	pt.add_child("image_url", m_Image_url.toPropertyTree());
	return pt;
}

void ChatCompletionRequestMessageContentPart::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	setType(pt.get("type", ""));
	m_Text = pt.get("text", "");
	if (pt.get_child_optional("image_url")) {
        m_Image_url = fromPt<ChatCompletionRequestMessageContentPartImage_image_url>(pt.get_child("image_url"));
	}
}

std::string ChatCompletionRequestMessageContentPart::getType() const
{
    return m_Type;
}

void ChatCompletionRequestMessageContentPart::setType(std::string value)
{
    static const std::array<std::string, 2> allowedValues = {
        "text", "image_url"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Type = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


std::string ChatCompletionRequestMessageContentPart::getText() const
{
    return m_Text;
}

void ChatCompletionRequestMessageContentPart::setText(std::string value)
{
    m_Text = value;
}


ChatCompletionRequestMessageContentPartImage_image_url ChatCompletionRequestMessageContentPart::getImageUrl() const
{
    return m_Image_url;
}

void ChatCompletionRequestMessageContentPart::setImageUrl(ChatCompletionRequestMessageContentPartImage_image_url value)
{
    m_Image_url = value;
}



std::vector<ChatCompletionRequestMessageContentPart> createChatCompletionRequestMessageContentPartVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ChatCompletionRequestMessageContentPart>();
    for (const auto& child: pt) {
        vec.emplace_back(ChatCompletionRequestMessageContentPart(child.second));
    }

    return vec;
}

}
}
}
}

