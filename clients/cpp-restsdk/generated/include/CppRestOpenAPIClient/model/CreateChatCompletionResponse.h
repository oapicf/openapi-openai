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

/*
 * CreateChatCompletionResponse.h
 *
 * Represents a chat completion response returned by model, based on the provided input.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CreateChatCompletionResponse_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CreateChatCompletionResponse_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/CompletionUsage.h"
#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/model/CreateChatCompletionResponse_choices_inner.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class CreateChatCompletionResponse_choices_inner;
class CompletionUsage;

/// <summary>
/// Represents a chat completion response returned by model, based on the provided input.
/// </summary>
class  CreateChatCompletionResponse
    : public ModelBase
{
public:
    CreateChatCompletionResponse();
    virtual ~CreateChatCompletionResponse();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CreateChatCompletionResponse members

    /// <summary>
    /// A unique identifier for the chat completion.
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1.
    /// </summary>
    std::vector<std::shared_ptr<CreateChatCompletionResponse_choices_inner>>& getChoices();
    bool choicesIsSet() const;
    void unsetChoices();

    void setChoices(const std::vector<std::shared_ptr<CreateChatCompletionResponse_choices_inner>>& value);

    /// <summary>
    /// The Unix timestamp (in seconds) of when the chat completion was created.
    /// </summary>
    int32_t getCreated() const;
    bool createdIsSet() const;
    void unsetCreated();

    void setCreated(int32_t value);

    /// <summary>
    /// The model used for the chat completion.
    /// </summary>
    utility::string_t getModel() const;
    bool modelIsSet() const;
    void unsetModel();

    void setModel(const utility::string_t& value);

    /// <summary>
    /// This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. 
    /// </summary>
    utility::string_t getSystemFingerprint() const;
    bool systemFingerprintIsSet() const;
    void unsetSystem_fingerprint();

    void setSystemFingerprint(const utility::string_t& value);

    /// <summary>
    /// The object type, which is always &#x60;chat.completion&#x60;.
    /// </summary>
    utility::string_t getObject() const;
    bool objectIsSet() const;
    void unsetobject();

    void setObject(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CompletionUsage> getUsage() const;
    bool usageIsSet() const;
    void unsetUsage();

    void setUsage(const std::shared_ptr<CompletionUsage>& value);


protected:
    utility::string_t m_Id;
    bool m_IdIsSet;
    std::vector<std::shared_ptr<CreateChatCompletionResponse_choices_inner>> m_Choices;
    bool m_ChoicesIsSet;
    int32_t m_Created;
    bool m_CreatedIsSet;
    utility::string_t m_Model;
    bool m_ModelIsSet;
    utility::string_t m_System_fingerprint;
    bool m_System_fingerprintIsSet;
    utility::string_t m_object;
    bool m_objectIsSet;
    std::shared_ptr<CompletionUsage> m_Usage;
    bool m_UsageIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CreateChatCompletionResponse_H_ */
