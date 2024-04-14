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



#include "Model.h"

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

Model::Model(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string Model::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void Model::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree Model::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("id", m_Id);
	pt.put("created", m_Created);
	pt.put("object", m_object);
	pt.put("owned_by", m_Owned_by);
	return pt;
}

void Model::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", "");
	m_Created = pt.get("created", 0);
	setObject(pt.get("object", ""));
	m_Owned_by = pt.get("owned_by", "");
}

std::string Model::getId() const
{
    return m_Id;
}

void Model::setId(std::string value)
{
    m_Id = value;
}


int32_t Model::getCreated() const
{
    return m_Created;
}

void Model::setCreated(int32_t value)
{
    m_Created = value;
}


std::string Model::getObject() const
{
    return m_object;
}

void Model::setObject(std::string value)
{
    static const std::array<std::string, 1> allowedValues = {
        "model"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_object = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


std::string Model::getOwnedBy() const
{
    return m_Owned_by;
}

void Model::setOwnedBy(std::string value)
{
    m_Owned_by = value;
}



std::vector<Model> createModelVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<Model>();
    for (const auto& child: pt) {
        vec.emplace_back(Model(child.second));
    }

    return vec;
}

}
}
}
}

