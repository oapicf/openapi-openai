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
 * RunStepDeltaStepDetailsMessageCreationObject_message_creation.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepDeltaStepDetailsMessageCreationObject_message_creation_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepDeltaStepDetailsMessageCreationObject_message_creation_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  RunStepDeltaStepDetailsMessageCreationObject_message_creation
    : public ModelBase
{
public:
    RunStepDeltaStepDetailsMessageCreationObject_message_creation();
    virtual ~RunStepDeltaStepDetailsMessageCreationObject_message_creation();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// RunStepDeltaStepDetailsMessageCreationObject_message_creation members

    /// <summary>
    /// The ID of the message that was created by this run step.
    /// </summary>
    utility::string_t getMessageId() const;
    bool messageIdIsSet() const;
    void unsetMessage_id();

    void setMessageId(const utility::string_t& value);


protected:
    utility::string_t m_Message_id;
    bool m_Message_idIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepDeltaStepDetailsMessageCreationObject_message_creation_H_ */
