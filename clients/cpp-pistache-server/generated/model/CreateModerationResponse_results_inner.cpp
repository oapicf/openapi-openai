/**
* OpenAI API
* The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "CreateModerationResponse_results_inner.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CreateModerationResponse_results_inner::CreateModerationResponse_results_inner()
{
    m_Flagged = false;
    
}

void CreateModerationResponse_results_inner::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CreateModerationResponse_results_inner::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CreateModerationResponse_results_inner::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CreateModerationResponse_results_inner" : pathPrefix;

            
    if (!m_Categories.validate()) {
        msg << _pathPrefix << ": Categories is invalid;";
        success = false;
    }    
    if (!m_Category_scores.validate()) {
        msg << _pathPrefix << ": Category_scores is invalid;";
        success = false;
    }
    return success;
}

bool CreateModerationResponse_results_inner::operator==(const CreateModerationResponse_results_inner& rhs) const
{
    return
    
    
    (isFlagged() == rhs.isFlagged())
     &&
    
    (getCategories() == rhs.getCategories())
     &&
    
    (getCategoryScores() == rhs.getCategoryScores())
    
    
    ;
}

bool CreateModerationResponse_results_inner::operator!=(const CreateModerationResponse_results_inner& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CreateModerationResponse_results_inner& o)
{
    j = nlohmann::json::object();
    j["flagged"] = o.m_Flagged;
    j["categories"] = o.m_Categories;
    j["category_scores"] = o.m_Category_scores;
    
}

void from_json(const nlohmann::json& j, CreateModerationResponse_results_inner& o)
{
    j.at("flagged").get_to(o.m_Flagged);
    j.at("categories").get_to(o.m_Categories);
    j.at("category_scores").get_to(o.m_Category_scores);
    
}

bool CreateModerationResponse_results_inner::isFlagged() const
{
    return m_Flagged;
}
void CreateModerationResponse_results_inner::setFlagged(bool const value)
{
    m_Flagged = value;
}
org::openapitools::server::model::CreateModerationResponse_results_inner_categories CreateModerationResponse_results_inner::getCategories() const
{
    return m_Categories;
}
void CreateModerationResponse_results_inner::setCategories(org::openapitools::server::model::CreateModerationResponse_results_inner_categories const& value)
{
    m_Categories = value;
}
org::openapitools::server::model::CreateModerationResponse_results_inner_category_scores CreateModerationResponse_results_inner::getCategoryScores() const
{
    return m_Category_scores;
}
void CreateModerationResponse_results_inner::setCategoryScores(org::openapitools::server::model::CreateModerationResponse_results_inner_category_scores const& value)
{
    m_Category_scores = value;
}


} // namespace org::openapitools::server::model

