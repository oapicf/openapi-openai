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
 * CreateChatCompletionFunctionResponse_choices_inner.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CreateChatCompletionFunctionResponse_choices_inner_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CreateChatCompletionFunctionResponse_choices_inner_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/model/ChatCompletionResponseMessage.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class ChatCompletionResponseMessage;


/// <summary>
/// 
/// </summary>
class  CreateChatCompletionFunctionResponse_choices_inner
    : public ModelBase
{
public:
    CreateChatCompletionFunctionResponse_choices_inner();
    virtual ~CreateChatCompletionFunctionResponse_choices_inner();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CreateChatCompletionFunctionResponse_choices_inner members

    /// <summary>
    /// The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, or &#x60;function_call&#x60; if the model called a function. 
    /// </summary>
    utility::string_t getFinishReason() const;
    bool finishReasonIsSet() const;
    void unsetFinish_reason();

    void setFinishReason(const utility::string_t& value);

    /// <summary>
    /// The index of the choice in the list of choices.
    /// </summary>
    int32_t getIndex() const;
    bool indexIsSet() const;
    void unsetIndex();

    void setIndex(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ChatCompletionResponseMessage> getMessage() const;
    bool messageIsSet() const;
    void unsetMessage();

    void setMessage(const std::shared_ptr<ChatCompletionResponseMessage>& value);


protected:
    utility::string_t m_Finish_reason;
    bool m_Finish_reasonIsSet;
    int32_t m_Index;
    bool m_IndexIsSet;
    std::shared_ptr<ChatCompletionResponseMessage> m_Message;
    bool m_MessageIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CreateChatCompletionFunctionResponse_choices_inner_H_ */
