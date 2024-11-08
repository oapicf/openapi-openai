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



#include "CreateTranscription_200_response.h"

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

CreateTranscription_200_response::CreateTranscription_200_response(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CreateTranscription_200_response::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CreateTranscription_200_response::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CreateTranscription_200_response::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("text", m_Text);
	pt.put("language", m_Language);
	pt.put("duration", m_Duration);
	// generate tree for Words
    tmp_node.clear();
	if (!m_Words.empty()) {
        tmp_node = toPt(m_Words);
		pt.add_child("words", tmp_node);
		tmp_node.clear();
	}
	// generate tree for Segments
    tmp_node.clear();
	if (!m_Segments.empty()) {
        tmp_node = toPt(m_Segments);
		pt.add_child("segments", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void CreateTranscription_200_response::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Text = pt.get("text", "");
	m_Language = pt.get("language", "");
	m_Duration = pt.get("duration", "");
	// push all items of Words into member
	if (pt.get_child_optional("words")) {
        m_Words = fromPt<std::vector<TranscriptionWord>>(pt.get_child("words"));
	}
	// push all items of Segments into member
	if (pt.get_child_optional("segments")) {
        m_Segments = fromPt<std::vector<TranscriptionSegment>>(pt.get_child("segments"));
	}
}

std::string CreateTranscription_200_response::getText() const
{
    return m_Text;
}

void CreateTranscription_200_response::setText(std::string value)
{
    m_Text = value;
}


std::string CreateTranscription_200_response::getLanguage() const
{
    return m_Language;
}

void CreateTranscription_200_response::setLanguage(std::string value)
{
    m_Language = value;
}


std::string CreateTranscription_200_response::getDuration() const
{
    return m_Duration;
}

void CreateTranscription_200_response::setDuration(std::string value)
{
    m_Duration = value;
}


std::vector<TranscriptionWord> CreateTranscription_200_response::getWords() const
{
    return m_Words;
}

void CreateTranscription_200_response::setWords(std::vector<TranscriptionWord> value)
{
    m_Words = value;
}


std::vector<TranscriptionSegment> CreateTranscription_200_response::getSegments() const
{
    return m_Segments;
}

void CreateTranscription_200_response::setSegments(std::vector<TranscriptionSegment> value)
{
    m_Segments = value;
}



std::vector<CreateTranscription_200_response> createCreateTranscription_200_responseVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CreateTranscription_200_response>();
    for (const auto& child: pt) {
        vec.emplace_back(CreateTranscription_200_response(child.second));
    }

    return vec;
}

}
}
}
}

