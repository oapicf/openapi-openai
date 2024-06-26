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
 * CreateChatCompletionStreamResponse.h
 *
 * Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
 */

#ifndef CreateChatCompletionStreamResponse_H_
#define CreateChatCompletionStreamResponse_H_


#include <string>
#include <vector>
#include "CreateChatCompletionStreamResponse_choices_inner.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
/// </summary>
class  CreateChatCompletionStreamResponse
{
public:
    CreateChatCompletionStreamResponse();
    virtual ~CreateChatCompletionStreamResponse() = default;


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

    bool operator==(const CreateChatCompletionStreamResponse& rhs) const;
    bool operator!=(const CreateChatCompletionStreamResponse& rhs) const;

    /////////////////////////////////////////////
    /// CreateChatCompletionStreamResponse members

    /// <summary>
    /// A unique identifier for the chat completion. Each chunk has the same ID.
    /// </summary>
    std::string getId() const;
    void setId(std::string const& value);
    /// <summary>
    /// A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1.
    /// </summary>
    std::vector<org::openapitools::server::model::CreateChatCompletionStreamResponse_choices_inner> getChoices() const;
    void setChoices(std::vector<org::openapitools::server::model::CreateChatCompletionStreamResponse_choices_inner> const& value);
    /// <summary>
    /// The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
    /// </summary>
    int32_t getCreated() const;
    void setCreated(int32_t const value);
    /// <summary>
    /// The model to generate the completion.
    /// </summary>
    std::string getModel() const;
    void setModel(std::string const& value);
    /// <summary>
    /// This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. 
    /// </summary>
    std::string getSystemFingerprint() const;
    void setSystemFingerprint(std::string const& value);
    bool systemFingerprintIsSet() const;
    void unsetSystem_fingerprint();
    /// <summary>
    /// The object type, which is always &#x60;chat.completion.chunk&#x60;.
    /// </summary>
    std::string getObject() const;
    void setObject(std::string const& value);

    friend  void to_json(nlohmann::json& j, const CreateChatCompletionStreamResponse& o);
    friend  void from_json(const nlohmann::json& j, CreateChatCompletionStreamResponse& o);
protected:
    std::string m_Id;

    std::vector<org::openapitools::server::model::CreateChatCompletionStreamResponse_choices_inner> m_Choices;

    int32_t m_Created;

    std::string m_Model;

    std::string m_System_fingerprint;
    bool m_System_fingerprintIsSet;
    std::string m_object;

    
};

} // namespace org::openapitools::server::model

#endif /* CreateChatCompletionStreamResponse_H_ */
