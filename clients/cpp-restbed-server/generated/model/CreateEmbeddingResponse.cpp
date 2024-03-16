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



#include "CreateEmbeddingResponse.h"

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

CreateEmbeddingResponse::CreateEmbeddingResponse(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CreateEmbeddingResponse::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CreateEmbeddingResponse::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CreateEmbeddingResponse::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("object", m_object);
	pt.put("model", m_Model);
	// generate tree for Data
    tmp_node.clear();
	if (!m_Data.empty()) {
        tmp_node = toPt(m_Data);
		pt.add_child("data", tmp_node);
		tmp_node.clear();
	}
	pt.add_child("usage", m_Usage.toPropertyTree());
	return pt;
}

void CreateEmbeddingResponse::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_object = pt.get("object", "");
	m_Model = pt.get("model", "");
	// push all items of Data into member
	if (pt.get_child_optional("data")) {
        m_Data = fromPt<std::vector<CreateEmbeddingResponse_data_inner>>(pt.get_child("data"));
	}
	if (pt.get_child_optional("usage")) {
        m_Usage = fromPt<CreateEmbeddingResponse_usage>(pt.get_child("usage"));
	}
}

std::string CreateEmbeddingResponse::getObject() const
{
    return m_object;
}

void CreateEmbeddingResponse::setObject(std::string value)
{
    m_object = value;
}


std::string CreateEmbeddingResponse::getModel() const
{
    return m_Model;
}

void CreateEmbeddingResponse::setModel(std::string value)
{
    m_Model = value;
}


std::vector<CreateEmbeddingResponse_data_inner> CreateEmbeddingResponse::getData() const
{
    return m_Data;
}

void CreateEmbeddingResponse::setData(std::vector<CreateEmbeddingResponse_data_inner> value)
{
    m_Data = value;
}


CreateEmbeddingResponse_usage CreateEmbeddingResponse::getUsage() const
{
    return m_Usage;
}

void CreateEmbeddingResponse::setUsage(CreateEmbeddingResponse_usage value)
{
    m_Usage = value;
}



std::vector<CreateEmbeddingResponse> createCreateEmbeddingResponseVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CreateEmbeddingResponse>();
    for (const auto& child: pt) {
        vec.emplace_back(CreateEmbeddingResponse(child.second));
    }

    return vec;
}

}
}
}
}
