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
/*
 * CreateModerationResponse_results_inner.h
 *
 * 
 */

#ifndef CreateModerationResponse_results_inner_H_
#define CreateModerationResponse_results_inner_H_


#include "CreateModerationResponse_results_inner_categories.h"
#include "CreateModerationResponse_results_inner_category_scores.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  CreateModerationResponse_results_inner
{
public:
    CreateModerationResponse_results_inner();
    virtual ~CreateModerationResponse_results_inner() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const CreateModerationResponse_results_inner& rhs) const;
    bool operator!=(const CreateModerationResponse_results_inner& rhs) const;

    /////////////////////////////////////////////
    /// CreateModerationResponse_results_inner members

    /// <summary>
    /// Whether any of the below categories are flagged.
    /// </summary>
    bool isFlagged() const;
    void setFlagged(bool const value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::CreateModerationResponse_results_inner_categories getCategories() const;
    void setCategories(org::openapitools::server::model::CreateModerationResponse_results_inner_categories const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::CreateModerationResponse_results_inner_category_scores getCategoryScores() const;
    void setCategoryScores(org::openapitools::server::model::CreateModerationResponse_results_inner_category_scores const& value);

    friend  void to_json(nlohmann::json& j, const CreateModerationResponse_results_inner& o);
    friend  void from_json(const nlohmann::json& j, CreateModerationResponse_results_inner& o);
protected:
    bool m_Flagged;

    org::openapitools::server::model::CreateModerationResponse_results_inner_categories m_Categories;

    org::openapitools::server::model::CreateModerationResponse_results_inner_category_scores m_Category_scores;

    
};

} // namespace org::openapitools::server::model

#endif /* CreateModerationResponse_results_inner_H_ */