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
 * RunStepDeltaStepDetailsToolCallsFunctionObject_function.h
 *
 * The definition of the function that was called.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepDeltaStepDetailsToolCallsFunctionObject_function_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepDeltaStepDetailsToolCallsFunctionObject_function_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// The definition of the function that was called.
/// </summary>
class  RunStepDeltaStepDetailsToolCallsFunctionObject_function
    : public ModelBase
{
public:
    RunStepDeltaStepDetailsToolCallsFunctionObject_function();
    virtual ~RunStepDeltaStepDetailsToolCallsFunctionObject_function();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// RunStepDeltaStepDetailsToolCallsFunctionObject_function members

    /// <summary>
    /// The name of the function.
    /// </summary>
    utility::string_t getName() const;
    bool nameIsSet() const;
    void unsetName();

    void setName(const utility::string_t& value);

    /// <summary>
    /// The arguments passed to the function.
    /// </summary>
    utility::string_t getArguments() const;
    bool argumentsIsSet() const;
    void unsetArguments();

    void setArguments(const utility::string_t& value);

    /// <summary>
    /// The output of the function. This will be &#x60;null&#x60; if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
    /// </summary>
    utility::string_t getOutput() const;
    bool outputIsSet() const;
    void unsetOutput();

    void setOutput(const utility::string_t& value);


protected:
    utility::string_t m_Name;
    bool m_NameIsSet;
    utility::string_t m_Arguments;
    bool m_ArgumentsIsSet;
    utility::string_t m_Output;
    bool m_OutputIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_RunStepDeltaStepDetailsToolCallsFunctionObject_function_H_ */
