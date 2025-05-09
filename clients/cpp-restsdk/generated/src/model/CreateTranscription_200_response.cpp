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



#include "CppRestOpenAPIClient/model/CreateTranscription_200_response.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


void CreateTranscription_200_response::validate()
{
    // TODO: implement validation
}

const CreateTranscription_200_response::VariantType& CreateTranscription_200_response::getVariant() const
{
    return m_variantValue;
}

void CreateTranscription_200_response::setVariant(CreateTranscription_200_response::VariantType value)
{
    m_variantValue = value;
}

web::json::value CreateTranscription_200_response::toJson() const
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

void CreateTranscription_200_response::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    std::visit([&](auto&& arg) {
        using T = std::decay_t<decltype(arg)>;
        if constexpr (!std::is_same_v<T, std::monostate>) {
          arg.toMultipart(multipart, prefix);
        }
    }, m_variantValue);
}

template bool CreateTranscription_200_response::fromJson<CreateTranscriptionResponseJson>(const web::json::value& json);
template bool CreateTranscription_200_response::fromMultiPart<CreateTranscriptionResponseJson>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);
template bool CreateTranscription_200_response::fromJson<CreateTranscriptionResponseVerboseJson>(const web::json::value& json);
template bool CreateTranscription_200_response::fromMultiPart<CreateTranscriptionResponseVerboseJson>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);


}
}
}
}


