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



#include "CreateModerationResponse_results_inner.h"

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

CreateModerationResponse_results_inner::CreateModerationResponse_results_inner(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CreateModerationResponse_results_inner::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CreateModerationResponse_results_inner::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CreateModerationResponse_results_inner::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("flagged", m_Flagged);
	pt.add_child("categories", m_Categories.toPropertyTree());
	pt.add_child("category_scores", m_Category_scores.toPropertyTree());
	return pt;
}

void CreateModerationResponse_results_inner::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Flagged = pt.get("flagged", false);
	if (pt.get_child_optional("categories")) {
        m_Categories = fromPt<CreateModerationResponse_results_inner_categories>(pt.get_child("categories"));
	}
	if (pt.get_child_optional("category_scores")) {
        m_Category_scores = fromPt<CreateModerationResponse_results_inner_category_scores>(pt.get_child("category_scores"));
	}
}

bool CreateModerationResponse_results_inner::isFlagged() const
{
    return m_Flagged;
}

void CreateModerationResponse_results_inner::setFlagged(bool value)
{
    m_Flagged = value;
}


CreateModerationResponse_results_inner_categories CreateModerationResponse_results_inner::getCategories() const
{
    return m_Categories;
}

void CreateModerationResponse_results_inner::setCategories(CreateModerationResponse_results_inner_categories value)
{
    m_Categories = value;
}


CreateModerationResponse_results_inner_category_scores CreateModerationResponse_results_inner::getCategoryScores() const
{
    return m_Category_scores;
}

void CreateModerationResponse_results_inner::setCategoryScores(CreateModerationResponse_results_inner_category_scores value)
{
    m_Category_scores = value;
}



std::vector<CreateModerationResponse_results_inner> createCreateModerationResponse_results_innerVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CreateModerationResponse_results_inner>();
    for (const auto& child: pt) {
        vec.emplace_back(CreateModerationResponse_results_inner(child.second));
    }

    return vec;
}

}
}
}
}

