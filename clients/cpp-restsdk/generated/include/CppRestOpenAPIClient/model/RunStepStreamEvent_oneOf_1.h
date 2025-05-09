/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * RunStepStreamEvent_oneOf_1.h
 *
 * Occurs when a [run step](/docs/api-reference/runs/step-object) moves to an &#x60;in_progress&#x60; state.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepStreamEvent_oneOf_1_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepStreamEvent_oneOf_1_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/model/RunStepObject.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class RunStepObject;


/// <summary>
/// Occurs when a [run step](/docs/api-reference/runs/step-object) moves to an &#x60;in_progress&#x60; state.
/// </summary>
class  RunStepStreamEvent_oneOf_1
    : public ModelBase
{
public:
    RunStepStreamEvent_oneOf_1();
    virtual ~RunStepStreamEvent_oneOf_1();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// RunStepStreamEvent_oneOf_1 members

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
    std::shared_ptr<RunStepObject> getData() const;
    bool dataIsSet() const;
    void unsetData();

    void setData(const std::shared_ptr<RunStepObject>& value);


protected:
    utility::string_t m_Event;
    bool m_EventIsSet;
    std::shared_ptr<RunStepObject> m_Data;
    bool m_DataIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepStreamEvent_oneOf_1_H_ */
