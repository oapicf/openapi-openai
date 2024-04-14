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
 * CreateCompletionResponse.h
 *
 * Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 
 */

#ifndef CreateCompletionResponse_H_
#define CreateCompletionResponse_H_


#include <string>
#include "CreateCompletionResponse_choices_inner.h"
#include "CompletionUsage.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 
/// </summary>
class  CreateCompletionResponse
{
public:
    CreateCompletionResponse();
    virtual ~CreateCompletionResponse() = default;


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

    bool operator==(const CreateCompletionResponse& rhs) const;
    bool operator!=(const CreateCompletionResponse& rhs) const;

    /////////////////////////////////////////////
    /// CreateCompletionResponse members

    /// <summary>
    /// A unique identifier for the completion.
    /// </summary>
    std::string getId() const;
    void setId(std::string const& value);
    /// <summary>
    /// The list of completion choices the model generated for the input prompt.
    /// </summary>
    std::vector<org::openapitools::server::model::CreateCompletionResponse_choices_inner> getChoices() const;
    void setChoices(std::vector<org::openapitools::server::model::CreateCompletionResponse_choices_inner> const& value);
    /// <summary>
    /// The Unix timestamp (in seconds) of when the completion was created.
    /// </summary>
    int32_t getCreated() const;
    void setCreated(int32_t const value);
    /// <summary>
    /// The model used for completion.
    /// </summary>
    std::string getModel() const;
    void setModel(std::string const& value);
    /// <summary>
    /// This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. 
    /// </summary>
    std::string getSystemFingerprint() const;
    void setSystemFingerprint(std::string const& value);
    bool systemFingerprintIsSet() const;
    void unsetSystem_fingerprint();
    /// <summary>
    /// The object type, which is always \&quot;text_completion\&quot;
    /// </summary>
    std::string getObject() const;
    void setObject(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::CompletionUsage getUsage() const;
    void setUsage(org::openapitools::server::model::CompletionUsage const& value);
    bool usageIsSet() const;
    void unsetUsage();

    friend  void to_json(nlohmann::json& j, const CreateCompletionResponse& o);
    friend  void from_json(const nlohmann::json& j, CreateCompletionResponse& o);
protected:
    std::string m_Id;

    std::vector<org::openapitools::server::model::CreateCompletionResponse_choices_inner> m_Choices;

    int32_t m_Created;

    std::string m_Model;

    std::string m_System_fingerprint;
    bool m_System_fingerprintIsSet;
    std::string m_object;

    org::openapitools::server::model::CompletionUsage m_Usage;
    bool m_UsageIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* CreateCompletionResponse_H_ */
