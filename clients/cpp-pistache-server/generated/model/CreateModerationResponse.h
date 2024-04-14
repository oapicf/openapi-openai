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
 * CreateModerationResponse.h
 *
 * Represents if a given text input is potentially harmful.
 */

#ifndef CreateModerationResponse_H_
#define CreateModerationResponse_H_


#include "CreateModerationResponse_results_inner.h"
#include <string>
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Represents if a given text input is potentially harmful.
/// </summary>
class  CreateModerationResponse
{
public:
    CreateModerationResponse();
    virtual ~CreateModerationResponse() = default;


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

    bool operator==(const CreateModerationResponse& rhs) const;
    bool operator!=(const CreateModerationResponse& rhs) const;

    /////////////////////////////////////////////
    /// CreateModerationResponse members

    /// <summary>
    /// The unique identifier for the moderation request.
    /// </summary>
    std::string getId() const;
    void setId(std::string const& value);
    /// <summary>
    /// The model used to generate the moderation results.
    /// </summary>
    std::string getModel() const;
    void setModel(std::string const& value);
    /// <summary>
    /// A list of moderation objects.
    /// </summary>
    std::vector<org::openapitools::server::model::CreateModerationResponse_results_inner> getResults() const;
    void setResults(std::vector<org::openapitools::server::model::CreateModerationResponse_results_inner> const& value);

    friend  void to_json(nlohmann::json& j, const CreateModerationResponse& o);
    friend  void from_json(const nlohmann::json& j, CreateModerationResponse& o);
protected:
    std::string m_Id;

    std::string m_Model;

    std::vector<org::openapitools::server::model::CreateModerationResponse_results_inner> m_Results;

    
};

} // namespace org::openapitools::server::model

#endif /* CreateModerationResponse_H_ */
