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



#include "CppRestOpenAPIClient/model/ChatCompletionRequestMessageContentPartImage.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



ChatCompletionRequestMessageContentPartImage::ChatCompletionRequestMessageContentPartImage()
{
    m_Type = utility::conversions::to_string_t("");
    m_TypeIsSet = false;
    m_Image_urlIsSet = false;
}

ChatCompletionRequestMessageContentPartImage::~ChatCompletionRequestMessageContentPartImage()
{
}

void ChatCompletionRequestMessageContentPartImage::validate()
{
    // TODO: implement validation
}

web::json::value ChatCompletionRequestMessageContentPartImage::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_TypeIsSet)
    {
        val[utility::conversions::to_string_t(U("type"))] = ModelBase::toJson(m_Type);
    }
    if(m_Image_urlIsSet)
    {
        val[utility::conversions::to_string_t(U("image_url"))] = ModelBase::toJson(m_Image_url);
    }

    return val;
}

bool ChatCompletionRequestMessageContentPartImage::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("type")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setType);
            setType(refVal_setType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("image_url"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("image_url")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<ChatCompletionRequestMessageContentPartImage_image_url> refVal_setImageUrl;
            ok &= ModelBase::fromJson(fieldValue, refVal_setImageUrl);
            setImageUrl(refVal_setImageUrl);
        }
    }
    return ok;
}

void ChatCompletionRequestMessageContentPartImage::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_TypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("type")), m_Type));
    }
    if(m_Image_urlIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("image_url")), m_Image_url));
    }
}

bool ChatCompletionRequestMessageContentPartImage::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("type"))))
    {
        utility::string_t refVal_setType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("type"))), refVal_setType );
        setType(refVal_setType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("image_url"))))
    {
        std::shared_ptr<ChatCompletionRequestMessageContentPartImage_image_url> refVal_setImageUrl;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("image_url"))), refVal_setImageUrl );
        setImageUrl(refVal_setImageUrl);
    }
    return ok;
}

utility::string_t ChatCompletionRequestMessageContentPartImage::getType() const
{
    return m_Type;
}

void ChatCompletionRequestMessageContentPartImage::setType(const utility::string_t& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}

bool ChatCompletionRequestMessageContentPartImage::typeIsSet() const
{
    return m_TypeIsSet;
}

void ChatCompletionRequestMessageContentPartImage::unsetType()
{
    m_TypeIsSet = false;
}
std::shared_ptr<ChatCompletionRequestMessageContentPartImage_image_url> ChatCompletionRequestMessageContentPartImage::getImageUrl() const
{
    return m_Image_url;
}

void ChatCompletionRequestMessageContentPartImage::setImageUrl(const std::shared_ptr<ChatCompletionRequestMessageContentPartImage_image_url>& value)
{
    m_Image_url = value;
    m_Image_urlIsSet = true;
}

bool ChatCompletionRequestMessageContentPartImage::imageUrlIsSet() const
{
    return m_Image_urlIsSet;
}

void ChatCompletionRequestMessageContentPartImage::unsetImage_url()
{
    m_Image_urlIsSet = false;
}
}
}
}
}


