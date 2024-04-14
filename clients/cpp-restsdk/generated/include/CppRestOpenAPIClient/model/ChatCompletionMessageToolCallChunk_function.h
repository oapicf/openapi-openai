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
 * ChatCompletionMessageToolCallChunk_function.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ChatCompletionMessageToolCallChunk_function_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ChatCompletionMessageToolCallChunk_function_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  ChatCompletionMessageToolCallChunk_function
    : public ModelBase
{
public:
    ChatCompletionMessageToolCallChunk_function();
    virtual ~ChatCompletionMessageToolCallChunk_function();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ChatCompletionMessageToolCallChunk_function members

    /// <summary>
    /// The name of the function to call.
    /// </summary>
    utility::string_t getName() const;
    bool nameIsSet() const;
    void unsetName();

    void setName(const utility::string_t& value);

    /// <summary>
    /// The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
    /// </summary>
    utility::string_t getArguments() const;
    bool argumentsIsSet() const;
    void unsetArguments();

    void setArguments(const utility::string_t& value);


protected:
    utility::string_t m_Name;
    bool m_NameIsSet;
    utility::string_t m_Arguments;
    bool m_ArgumentsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ChatCompletionMessageToolCallChunk_function_H_ */
