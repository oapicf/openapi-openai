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
 * RunStreamEvent_oneOf_5.h
 *
 * Occurs when a [run](/docs/api-reference/runs/object) fails.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_RunStreamEvent_oneOf_5_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_RunStreamEvent_oneOf_5_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/RunObject.h"
#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class RunObject;

/// <summary>
/// Occurs when a [run](/docs/api-reference/runs/object) fails.
/// </summary>
class  RunStreamEvent_oneOf_5
    : public ModelBase
{
public:
    RunStreamEvent_oneOf_5();
    virtual ~RunStreamEvent_oneOf_5();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// RunStreamEvent_oneOf_5 members

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
    std::shared_ptr<RunObject> getData() const;
    bool dataIsSet() const;
    void unsetData();

    void setData(const std::shared_ptr<RunObject>& value);


protected:
    utility::string_t m_Event;
    bool m_EventIsSet;
    std::shared_ptr<RunObject> m_Data;
    bool m_DataIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_RunStreamEvent_oneOf_5_H_ */
