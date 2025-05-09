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
 * ChatCompletionMessageToolCallChunk.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ChatCompletionMessageToolCallChunk_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ChatCompletionMessageToolCallChunk_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/model/ChatCompletionMessageToolCallChunk_function.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class ChatCompletionMessageToolCallChunk_function;


/// <summary>
/// 
/// </summary>
class  ChatCompletionMessageToolCallChunk
    : public ModelBase
{
public:
    ChatCompletionMessageToolCallChunk();
    virtual ~ChatCompletionMessageToolCallChunk();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ChatCompletionMessageToolCallChunk members

    /// <summary>
    /// 
    /// </summary>
    int32_t getIndex() const;
    bool indexIsSet() const;
    void unsetIndex();

    void setIndex(int32_t value);

    /// <summary>
    /// The ID of the tool call.
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// The type of the tool. Currently, only &#x60;function&#x60; is supported.
    /// </summary>
    utility::string_t getType() const;
    bool typeIsSet() const;
    void unsetType();

    void setType(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ChatCompletionMessageToolCallChunk_function> getFunction() const;
    bool functionIsSet() const;
    void unsetFunction();

    void setFunction(const std::shared_ptr<ChatCompletionMessageToolCallChunk_function>& value);


protected:
    int32_t m_Index;
    bool m_IndexIsSet;
    utility::string_t m_Id;
    bool m_IdIsSet;
    utility::string_t m_Type;
    bool m_TypeIsSet;
    std::shared_ptr<ChatCompletionMessageToolCallChunk_function> m_Function;
    bool m_FunctionIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ChatCompletionMessageToolCallChunk_H_ */
