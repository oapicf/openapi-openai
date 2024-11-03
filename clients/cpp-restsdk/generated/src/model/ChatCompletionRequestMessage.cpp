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



#include "CppRestOpenAPIClient/model/ChatCompletionRequestMessage.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


void ChatCompletionRequestMessage::validate()
{
    // TODO: implement validation
}

const ChatCompletionRequestMessage::VariantType& ChatCompletionRequestMessage::getVariant() const
{
    return m_variantValue;
}

void ChatCompletionRequestMessage::setVariant(ChatCompletionRequestMessage::VariantType value)
{
    m_variantValue = value;
}

web::json::value ChatCompletionRequestMessage::toJson() const
{
    web::json::value val = web::json::value::object();

    std::visit([&](auto&& arg) {
        using T = std::decay_t<decltype(arg)>;
        if constexpr (std::is_same_v<T, std::monostate>) {
            val = web::json::value::null();
        } else {
            val = arg.toJson();
        }
    }, m_variantValue);

    return val;
}

void ChatCompletionRequestMessage::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    std::visit([&](auto&& arg) {
        using T = std::decay_t<decltype(arg)>;
        if constexpr (!std::is_same_v<T, std::monostate>) {
          arg.toMultipart(multipart, prefix);
        }
    }, m_variantValue);
}

template bool ChatCompletionRequestMessage::fromJson<ChatCompletionRequestAssistantMessage>(const web::json::value& json);
template bool ChatCompletionRequestMessage::fromMultiPart<ChatCompletionRequestAssistantMessage>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);
template bool ChatCompletionRequestMessage::fromJson<ChatCompletionRequestFunctionMessage>(const web::json::value& json);
template bool ChatCompletionRequestMessage::fromMultiPart<ChatCompletionRequestFunctionMessage>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);
template bool ChatCompletionRequestMessage::fromJson<ChatCompletionRequestSystemMessage>(const web::json::value& json);
template bool ChatCompletionRequestMessage::fromMultiPart<ChatCompletionRequestSystemMessage>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);
template bool ChatCompletionRequestMessage::fromJson<ChatCompletionRequestToolMessage>(const web::json::value& json);
template bool ChatCompletionRequestMessage::fromMultiPart<ChatCompletionRequestToolMessage>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);
template bool ChatCompletionRequestMessage::fromJson<ChatCompletionRequestUserMessage>(const web::json::value& json);
template bool ChatCompletionRequestMessage::fromMultiPart<ChatCompletionRequestUserMessage>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);


}
}
}
}


