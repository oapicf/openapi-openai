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
 * MessageStreamEvent.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_MessageStreamEvent_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_MessageStreamEvent_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/MessageObject.h"
#include "CppRestOpenAPIClient/model/MessageStreamEvent_oneOf_1.h"
#include "CppRestOpenAPIClient/model/MessageStreamEvent_oneOf_4.h"
#include "CppRestOpenAPIClient/model/MessageStreamEvent_oneOf_2.h"
#include "CppRestOpenAPIClient/model/MessageStreamEvent_oneOf_3.h"
#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/model/MessageStreamEvent_oneOf.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class MessageObject;

/// <summary>
/// 
/// </summary>
class  MessageStreamEvent
    : public ModelBase
{
public:
    MessageStreamEvent();
    virtual ~MessageStreamEvent();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// MessageStreamEvent members

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
    std::shared_ptr<MessageObject> getData() const;
    bool dataIsSet() const;
    void unsetData();

    void setData(const std::shared_ptr<MessageObject>& value);


protected:
    utility::string_t m_Event;
    bool m_EventIsSet;
    std::shared_ptr<MessageObject> m_Data;
    bool m_DataIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_MessageStreamEvent_H_ */
