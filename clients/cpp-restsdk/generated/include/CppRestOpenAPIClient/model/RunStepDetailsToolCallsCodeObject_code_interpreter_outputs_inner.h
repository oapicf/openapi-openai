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
 * RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/RunStepDetailsToolCallsCodeOutputLogsObject.h"
#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/model/RunStepDetailsToolCallsCodeOutputImageObject.h"
#include "CppRestOpenAPIClient/model/RunStepDetailsToolCallsCodeOutputImageObject_image.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class RunStepDetailsToolCallsCodeOutputImageObject_image;

/// <summary>
/// 
/// </summary>
class  RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner
    : public ModelBase
{
public:
    RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner();
    virtual ~RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner members

    /// <summary>
    /// Always &#x60;logs&#x60;.
    /// </summary>
    utility::string_t getType() const;
    bool typeIsSet() const;
    void unsetType();

    void setType(const utility::string_t& value);

    /// <summary>
    /// The text output from the Code Interpreter tool call.
    /// </summary>
    utility::string_t getLogs() const;
    bool logsIsSet() const;
    void unsetLogs();

    void setLogs(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<RunStepDetailsToolCallsCodeOutputImageObject_image> getImage() const;
    bool imageIsSet() const;
    void unsetImage();

    void setImage(const std::shared_ptr<RunStepDetailsToolCallsCodeOutputImageObject_image>& value);


protected:
    utility::string_t m_Type;
    bool m_TypeIsSet;
    utility::string_t m_Logs;
    bool m_LogsIsSet;
    std::shared_ptr<RunStepDetailsToolCallsCodeOutputImageObject_image> m_Image;
    bool m_ImageIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H_ */