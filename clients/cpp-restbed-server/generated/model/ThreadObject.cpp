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



#include "ThreadObject.h"

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

ThreadObject::ThreadObject(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string ThreadObject::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void ThreadObject::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ThreadObject::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("id", m_Id);
	pt.put("object", m_object);
	pt.put("created_at", m_Created_at);
	return pt;
}

void ThreadObject::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", "");
	setObject(pt.get("object", ""));
	m_Created_at = pt.get("created_at", 0);
}

std::string ThreadObject::getId() const
{
    return m_Id;
}

void ThreadObject::setId(std::string value)
{
    m_Id = value;
}


std::string ThreadObject::getObject() const
{
    return m_object;
}

void ThreadObject::setObject(std::string value)
{
    static const std::array<std::string, 1> allowedValues = {
        "thread"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_object = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


int32_t ThreadObject::getCreatedAt() const
{
    return m_Created_at;
}

void ThreadObject::setCreatedAt(int32_t value)
{
    m_Created_at = value;
}


std::string ThreadObject::getMetadata() const
{
    return m_Metadata;
}

void ThreadObject::setMetadata(std::string value)
{
    m_Metadata = value;
}



std::vector<ThreadObject> createThreadObjectVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ThreadObject>();
    for (const auto& child: pt) {
        vec.emplace_back(ThreadObject(child.second));
    }

    return vec;
}

}
}
}
}

