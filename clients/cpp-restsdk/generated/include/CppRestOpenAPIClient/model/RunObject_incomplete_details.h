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
 * RunObject_incomplete_details.h
 *
 * Details on why the run is incomplete. Will be &#x60;null&#x60; if the run is not incomplete.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_RunObject_incomplete_details_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_RunObject_incomplete_details_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// Details on why the run is incomplete. Will be &#x60;null&#x60; if the run is not incomplete.
/// </summary>
class  RunObject_incomplete_details
    : public ModelBase
{
public:
    RunObject_incomplete_details();
    virtual ~RunObject_incomplete_details();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// RunObject_incomplete_details members

    /// <summary>
    /// The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
    /// </summary>
    utility::string_t getReason() const;
    bool reasonIsSet() const;
    void unsetReason();

    void setReason(const utility::string_t& value);


protected:
    utility::string_t m_Reason;
    bool m_ReasonIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_RunObject_incomplete_details_H_ */
