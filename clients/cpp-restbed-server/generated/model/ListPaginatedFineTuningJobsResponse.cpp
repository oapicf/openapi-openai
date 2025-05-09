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



#include "ListPaginatedFineTuningJobsResponse.h"

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

ListPaginatedFineTuningJobsResponse::ListPaginatedFineTuningJobsResponse(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string ListPaginatedFineTuningJobsResponse::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void ListPaginatedFineTuningJobsResponse::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ListPaginatedFineTuningJobsResponse::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	// generate tree for Data
    tmp_node.clear();
	if (!m_Data.empty()) {
        tmp_node = toPt(m_Data);
		pt.add_child("data", tmp_node);
		tmp_node.clear();
	}
	pt.put("has_more", m_Has_more);
	pt.put("object", m_object);
	return pt;
}

void ListPaginatedFineTuningJobsResponse::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	// push all items of Data into member
	if (pt.get_child_optional("data")) {
        m_Data = fromPt<std::vector<FineTuningJob>>(pt.get_child("data"));
	}
	m_Has_more = pt.get("has_more", false);
	setObject(pt.get("object", ""));
}

std::vector<FineTuningJob> ListPaginatedFineTuningJobsResponse::getData() const
{
    return m_Data;
}

void ListPaginatedFineTuningJobsResponse::setData(std::vector<FineTuningJob> value)
{
    m_Data = value;
}


bool ListPaginatedFineTuningJobsResponse::isHasMore() const
{
    return m_Has_more;
}

void ListPaginatedFineTuningJobsResponse::setHasMore(bool value)
{
    m_Has_more = value;
}


std::string ListPaginatedFineTuningJobsResponse::getObject() const
{
    return m_object;
}

void ListPaginatedFineTuningJobsResponse::setObject(std::string value)
{
    static const std::array<std::string, 1> allowedValues = {
        "list"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_object = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}



std::vector<ListPaginatedFineTuningJobsResponse> createListPaginatedFineTuningJobsResponseVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ListPaginatedFineTuningJobsResponse>();
    for (const auto& child: pt) {
        vec.emplace_back(ListPaginatedFineTuningJobsResponse(child.second));
    }

    return vec;
}

}
}
}
}

