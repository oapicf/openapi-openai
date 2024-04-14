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
 * FineTuningJob_error.h
 *
 * For fine-tuning jobs that have &#x60;failed&#x60;, this will contain more information on the cause of the failure.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_FineTuningJob_error_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_FineTuningJob_error_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// For fine-tuning jobs that have &#x60;failed&#x60;, this will contain more information on the cause of the failure.
/// </summary>
class  FineTuningJob_error
    : public ModelBase
{
public:
    FineTuningJob_error();
    virtual ~FineTuningJob_error();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// FineTuningJob_error members

    /// <summary>
    /// A machine-readable error code.
    /// </summary>
    utility::string_t getCode() const;
    bool codeIsSet() const;
    void unsetCode();

    void setCode(const utility::string_t& value);

    /// <summary>
    /// A human-readable error message.
    /// </summary>
    utility::string_t getMessage() const;
    bool messageIsSet() const;
    void unsetMessage();

    void setMessage(const utility::string_t& value);

    /// <summary>
    /// The parameter that was invalid, usually &#x60;training_file&#x60; or &#x60;validation_file&#x60;. This field will be null if the failure was not parameter-specific.
    /// </summary>
    utility::string_t getParam() const;
    bool paramIsSet() const;
    void unsetParam();

    void setParam(const utility::string_t& value);


protected:
    utility::string_t m_Code;
    bool m_CodeIsSet;
    utility::string_t m_Message;
    bool m_MessageIsSet;
    utility::string_t m_Param;
    bool m_ParamIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_FineTuningJob_error_H_ */
