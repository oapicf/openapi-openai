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



#include "CppRestOpenAPIClient/model/ChatCompletionRole.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

ChatCompletionRole::eChatCompletionRole toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("system")))
        return ChatCompletionRole::eChatCompletionRole::ChatCompletionRole_SYSTEM;
    if (val == utility::conversions::to_string_t(U("user")))
        return ChatCompletionRole::eChatCompletionRole::ChatCompletionRole_USER;
    if (val == utility::conversions::to_string_t(U("assistant")))
        return ChatCompletionRole::eChatCompletionRole::ChatCompletionRole_ASSISTANT;
    if (val == utility::conversions::to_string_t(U("tool")))
        return ChatCompletionRole::eChatCompletionRole::ChatCompletionRole_TOOL;
    if (val == utility::conversions::to_string_t(U("function")))
        return ChatCompletionRole::eChatCompletionRole::ChatCompletionRole_FUNCTION;
    return {};
}

EnumUnderlyingType fromEnum(ChatCompletionRole::eChatCompletionRole e)
{
    switch (e)
    {
    case ChatCompletionRole::eChatCompletionRole::ChatCompletionRole_SYSTEM:
        return U("system");
    case ChatCompletionRole::eChatCompletionRole::ChatCompletionRole_USER:
        return U("user");
    case ChatCompletionRole::eChatCompletionRole::ChatCompletionRole_ASSISTANT:
        return U("assistant");
    case ChatCompletionRole::eChatCompletionRole::ChatCompletionRole_TOOL:
        return U("tool");
    case ChatCompletionRole::eChatCompletionRole::ChatCompletionRole_FUNCTION:
        return U("function");
    default:
        break;
    }
    return {};
}
}

ChatCompletionRole::ChatCompletionRole()
{
}

ChatCompletionRole::~ChatCompletionRole()
{
}

void ChatCompletionRole::validate()
{
    // TODO: implement validation
}

web::json::value ChatCompletionRole::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool ChatCompletionRole::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void ChatCompletionRole::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool ChatCompletionRole::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }
    {
        EnumUnderlyingType e;
        ok = ModelBase::fromHttpContent(multipart->getContent(namePrefix), e);
        if (ok)
        {
            auto v = toEnum(e);
            setValue(v);
        }
    }
    return ok;
}

ChatCompletionRole::eChatCompletionRole ChatCompletionRole::getValue() const
{
   return m_value;
}

void ChatCompletionRole::setValue(ChatCompletionRole::eChatCompletionRole const value)
{
   m_value = value;
}


}
}
}
}


