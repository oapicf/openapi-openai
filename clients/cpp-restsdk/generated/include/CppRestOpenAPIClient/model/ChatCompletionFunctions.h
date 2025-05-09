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
 * ChatCompletionFunctions.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ChatCompletionFunctions_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ChatCompletionFunctions_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include <map>
#include "CppRestOpenAPIClient/AnyType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// 
/// </summary>
class  ChatCompletionFunctions
    : public ModelBase
{
public:
    ChatCompletionFunctions();
    virtual ~ChatCompletionFunctions();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ChatCompletionFunctions members

    /// <summary>
    /// A description of what the function does, used by the model to choose when and how to call the function.
    /// </summary>
    utility::string_t getDescription() const;
    bool descriptionIsSet() const;
    void unsetDescription();

    void setDescription(const utility::string_t& value);

    /// <summary>
    /// The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
    /// </summary>
    utility::string_t getName() const;
    bool nameIsSet() const;
    void unsetName();

    void setName(const utility::string_t& value);

    /// <summary>
    /// The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/text-generation/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting &#x60;parameters&#x60; defines a function with an empty parameter list.
    /// </summary>
    std::map<utility::string_t, std::shared_ptr<AnyType>>& getParameters();
    bool parametersIsSet() const;
    void unsetParameters();

    void setParameters(const std::map<utility::string_t, std::shared_ptr<AnyType>>& value);


protected:
    utility::string_t m_Description;
    bool m_DescriptionIsSet;
    utility::string_t m_Name;
    bool m_NameIsSet;
    std::map<utility::string_t, std::shared_ptr<AnyType>> m_Parameters;
    bool m_ParametersIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ChatCompletionFunctions_H_ */
