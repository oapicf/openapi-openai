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



#include "ListRunStepsResponse.h"

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

ListRunStepsResponse::ListRunStepsResponse(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string ListRunStepsResponse::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void ListRunStepsResponse::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ListRunStepsResponse::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("object", m_object);
	// generate tree for Data
    tmp_node.clear();
	if (!m_Data.empty()) {
        tmp_node = toPt(m_Data);
		pt.add_child("data", tmp_node);
		tmp_node.clear();
	}
	pt.put("first_id", m_First_id);
	pt.put("last_id", m_Last_id);
	pt.put("has_more", m_Has_more);
	return pt;
}

void ListRunStepsResponse::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_object = pt.get("object", "");
	// push all items of Data into member
	if (pt.get_child_optional("data")) {
        m_Data = fromPt<std::vector<RunStepObject>>(pt.get_child("data"));
	}
	m_First_id = pt.get("first_id", "");
	m_Last_id = pt.get("last_id", "");
	m_Has_more = pt.get("has_more", false);
}

std::string ListRunStepsResponse::getObject() const
{
    return m_object;
}

void ListRunStepsResponse::setObject(std::string value)
{
    m_object = value;
}


std::vector<RunStepObject> ListRunStepsResponse::getData() const
{
    return m_Data;
}

void ListRunStepsResponse::setData(std::vector<RunStepObject> value)
{
    m_Data = value;
}


std::string ListRunStepsResponse::getFirstId() const
{
    return m_First_id;
}

void ListRunStepsResponse::setFirstId(std::string value)
{
    m_First_id = value;
}


std::string ListRunStepsResponse::getLastId() const
{
    return m_Last_id;
}

void ListRunStepsResponse::setLastId(std::string value)
{
    m_Last_id = value;
}


bool ListRunStepsResponse::isHasMore() const
{
    return m_Has_more;
}

void ListRunStepsResponse::setHasMore(bool value)
{
    m_Has_more = value;
}



std::vector<ListRunStepsResponse> createListRunStepsResponseVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ListRunStepsResponse>();
    for (const auto& child: pt) {
        vec.emplace_back(ListRunStepsResponse(child.second));
    }

    return vec;
}

}
}
}
}
