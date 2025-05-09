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
 * RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H_

#include <variant>

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


class  RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner
{
public:
    RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner() = default;
    ~RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner() = default;

    /////////////////////////////////////////////

    void validate();

    web::json::value toJson() const;

    template<typename Target>
    bool fromJson(const web::json::value& json) {
        // convert json to Target type
        Target target;
        if (!target.fromJson(json)) {
            return false;
        }

        m_variantValue = target;
        return true;
    }

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const;

    template<typename Target>
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) {
        // convert multipart to Target type
        Target target;
        if (!target.fromMultiPart(multipart, namePrefix)) {
            return false;
        }

        m_variantValue = target;
        return true;
    }

    /////////////////////////////////////////////
    /// RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner members

    using VariantType = std::variant<RunStepDetailsToolCallsCodeOutputImageObject, RunStepDetailsToolCallsCodeOutputLogsObject>;

    const VariantType& getVariant() const;
    void setVariant(VariantType value);

protected:
    VariantType m_variantValue;
};



}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H_ */
