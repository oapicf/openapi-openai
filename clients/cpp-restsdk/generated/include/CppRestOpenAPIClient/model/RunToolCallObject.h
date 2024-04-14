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
 * RunToolCallObject.h
 *
 * Tool call objects
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_RunToolCallObject_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_RunToolCallObject_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/model/RunToolCallObject_function.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class RunToolCallObject_function;

/// <summary>
/// Tool call objects
/// </summary>
class  RunToolCallObject
    : public ModelBase
{
public:
    RunToolCallObject();
    virtual ~RunToolCallObject();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// RunToolCallObject members

    /// <summary>
    /// The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// The type of tool call the output is required for. For now, this is always &#x60;function&#x60;.
    /// </summary>
    utility::string_t getType() const;
    bool typeIsSet() const;
    void unsetType();

    void setType(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<RunToolCallObject_function> getFunction() const;
    bool functionIsSet() const;
    void unsetFunction();

    void setFunction(const std::shared_ptr<RunToolCallObject_function>& value);


protected:
    utility::string_t m_Id;
    bool m_IdIsSet;
    utility::string_t m_Type;
    bool m_TypeIsSet;
    std::shared_ptr<RunToolCallObject_function> m_Function;
    bool m_FunctionIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_RunToolCallObject_H_ */
