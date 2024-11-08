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



#include "TranscriptionSegment.h"

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

TranscriptionSegment::TranscriptionSegment(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string TranscriptionSegment::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void TranscriptionSegment::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree TranscriptionSegment::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("id", m_Id);
	pt.put("seek", m_Seek);
	pt.put("start", m_Start);
	pt.put("end", m_End);
	pt.put("text", m_Text);
	// generate tree for Tokens
    tmp_node.clear();
	if (!m_Tokens.empty()) {
        tmp_node = toPt(m_Tokens);
		pt.add_child("tokens", tmp_node);
		tmp_node.clear();
	}
	pt.put("temperature", m_Temperature);
	pt.put("avg_logprob", m_Avg_logprob);
	pt.put("compression_ratio", m_Compression_ratio);
	pt.put("no_speech_prob", m_No_speech_prob);
	return pt;
}

void TranscriptionSegment::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", 0);
	m_Seek = pt.get("seek", 0);
	m_Start = pt.get("start", 0.0f);
	m_End = pt.get("end", 0.0f);
	m_Text = pt.get("text", "");
	// push all items of Tokens into member
	if (pt.get_child_optional("tokens")) {
        m_Tokens = fromPt<std::vector<int32_t>>(pt.get_child("tokens"));
	}
	m_Temperature = pt.get("temperature", 0.0f);
	m_Avg_logprob = pt.get("avg_logprob", 0.0f);
	m_Compression_ratio = pt.get("compression_ratio", 0.0f);
	m_No_speech_prob = pt.get("no_speech_prob", 0.0f);
}

int32_t TranscriptionSegment::getId() const
{
    return m_Id;
}

void TranscriptionSegment::setId(int32_t value)
{
    m_Id = value;
}


int32_t TranscriptionSegment::getSeek() const
{
    return m_Seek;
}

void TranscriptionSegment::setSeek(int32_t value)
{
    m_Seek = value;
}


float TranscriptionSegment::getStart() const
{
    return m_Start;
}

void TranscriptionSegment::setStart(float value)
{
    m_Start = value;
}


float TranscriptionSegment::getEnd() const
{
    return m_End;
}

void TranscriptionSegment::setEnd(float value)
{
    m_End = value;
}


std::string TranscriptionSegment::getText() const
{
    return m_Text;
}

void TranscriptionSegment::setText(std::string value)
{
    m_Text = value;
}


std::vector<int32_t> TranscriptionSegment::getTokens() const
{
    return m_Tokens;
}

void TranscriptionSegment::setTokens(std::vector<int32_t> value)
{
    m_Tokens = value;
}


float TranscriptionSegment::getTemperature() const
{
    return m_Temperature;
}

void TranscriptionSegment::setTemperature(float value)
{
    m_Temperature = value;
}


float TranscriptionSegment::getAvgLogprob() const
{
    return m_Avg_logprob;
}

void TranscriptionSegment::setAvgLogprob(float value)
{
    m_Avg_logprob = value;
}


float TranscriptionSegment::getCompressionRatio() const
{
    return m_Compression_ratio;
}

void TranscriptionSegment::setCompressionRatio(float value)
{
    m_Compression_ratio = value;
}


float TranscriptionSegment::getNoSpeechProb() const
{
    return m_No_speech_prob;
}

void TranscriptionSegment::setNoSpeechProb(float value)
{
    m_No_speech_prob = value;
}



std::vector<TranscriptionSegment> createTranscriptionSegmentVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<TranscriptionSegment>();
    for (const auto& child: pt) {
        vec.emplace_back(TranscriptionSegment(child.second));
    }

    return vec;
}

}
}
}
}

