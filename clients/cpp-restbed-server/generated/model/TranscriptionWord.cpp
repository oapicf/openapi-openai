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



#include "TranscriptionWord.h"

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

TranscriptionWord::TranscriptionWord(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string TranscriptionWord::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void TranscriptionWord::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree TranscriptionWord::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("word", m_Word);
	pt.put("start", m_Start);
	pt.put("end", m_End);
	return pt;
}

void TranscriptionWord::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Word = pt.get("word", "");
	m_Start = pt.get("start", 0.0f);
	m_End = pt.get("end", 0.0f);
}

std::string TranscriptionWord::getWord() const
{
    return m_Word;
}

void TranscriptionWord::setWord(std::string value)
{
    m_Word = value;
}


float TranscriptionWord::getStart() const
{
    return m_Start;
}

void TranscriptionWord::setStart(float value)
{
    m_Start = value;
}


float TranscriptionWord::getEnd() const
{
    return m_End;
}

void TranscriptionWord::setEnd(float value)
{
    m_End = value;
}



std::vector<TranscriptionWord> createTranscriptionWordVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<TranscriptionWord>();
    for (const auto& child: pt) {
        vec.emplace_back(TranscriptionWord(child.second));
    }

    return vec;
}

}
}
}
}

