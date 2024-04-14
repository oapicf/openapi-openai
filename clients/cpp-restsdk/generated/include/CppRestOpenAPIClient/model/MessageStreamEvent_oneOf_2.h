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
 * MessageStreamEvent_oneOf_2.h
 *
 * Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_MessageStreamEvent_oneOf_2_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_MessageStreamEvent_oneOf_2_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/model/MessageDeltaObject.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class MessageDeltaObject;

/// <summary>
/// Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
/// </summary>
class  MessageStreamEvent_oneOf_2
    : public ModelBase
{
public:
    MessageStreamEvent_oneOf_2();
    virtual ~MessageStreamEvent_oneOf_2();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// MessageStreamEvent_oneOf_2 members

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getEvent() const;
    bool eventIsSet() const;
    void unsetEvent();

    void setEvent(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<MessageDeltaObject> getData() const;
    bool dataIsSet() const;
    void unsetData();

    void setData(const std::shared_ptr<MessageDeltaObject>& value);


protected:
    utility::string_t m_Event;
    bool m_EventIsSet;
    std::shared_ptr<MessageDeltaObject> m_Data;
    bool m_DataIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_MessageStreamEvent_oneOf_2_H_ */
