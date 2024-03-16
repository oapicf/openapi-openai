/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "ImagesResponse.h"

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

ImagesResponse::ImagesResponse(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string ImagesResponse::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void ImagesResponse::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ImagesResponse::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("created", m_Created);
	// generate tree for Data
    tmp_node.clear();
	if (!m_Data.empty()) {
        tmp_node = toPt(m_Data);
		pt.add_child("data", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void ImagesResponse::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Created = pt.get("created", 0);
	// push all items of Data into member
	if (pt.get_child_optional("data")) {
        m_Data = fromPt<std::vector<ImagesResponse_data_inner>>(pt.get_child("data"));
	}
}

int32_t ImagesResponse::getCreated() const
{
    return m_Created;
}

void ImagesResponse::setCreated(int32_t value)
{
    m_Created = value;
}


std::vector<ImagesResponse_data_inner> ImagesResponse::getData() const
{
    return m_Data;
}

void ImagesResponse::setData(std::vector<ImagesResponse_data_inner> value)
{
    m_Data = value;
}



std::vector<ImagesResponse> createImagesResponseVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ImagesResponse>();
    for (const auto& child: pt) {
        vec.emplace_back(ImagesResponse(child.second));
    }

    return vec;
}

}
}
}
}

