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



#include "CppRestOpenAPIClient/model/ChatCompletionRequestMessageContentPartImage_image_url.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



ChatCompletionRequestMessageContentPartImage_image_url::ChatCompletionRequestMessageContentPartImage_image_url()
{
    m_Url = utility::conversions::to_string_t("");
    m_UrlIsSet = false;
    m_Detail = utility::conversions::to_string_t("");
    m_DetailIsSet = false;
}

ChatCompletionRequestMessageContentPartImage_image_url::~ChatCompletionRequestMessageContentPartImage_image_url()
{
}

void ChatCompletionRequestMessageContentPartImage_image_url::validate()
{
    // TODO: implement validation
}

web::json::value ChatCompletionRequestMessageContentPartImage_image_url::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_UrlIsSet)
    {
        val[utility::conversions::to_string_t(U("url"))] = ModelBase::toJson(m_Url);
    }
    if(m_DetailIsSet)
    {
        val[utility::conversions::to_string_t(U("detail"))] = ModelBase::toJson(m_Detail);
    }

    return val;
}

bool ChatCompletionRequestMessageContentPartImage_image_url::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("url"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("url")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setUrl;
            ok &= ModelBase::fromJson(fieldValue, refVal_setUrl);
            setUrl(refVal_setUrl);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("detail"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("detail")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setDetail;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDetail);
            setDetail(refVal_setDetail);
        }
    }
    return ok;
}

void ChatCompletionRequestMessageContentPartImage_image_url::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_UrlIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("url")), m_Url));
    }
    if(m_DetailIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("detail")), m_Detail));
    }
}

bool ChatCompletionRequestMessageContentPartImage_image_url::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("url"))))
    {
        utility::string_t refVal_setUrl;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("url"))), refVal_setUrl );
        setUrl(refVal_setUrl);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("detail"))))
    {
        utility::string_t refVal_setDetail;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("detail"))), refVal_setDetail );
        setDetail(refVal_setDetail);
    }
    return ok;
}

utility::string_t ChatCompletionRequestMessageContentPartImage_image_url::getUrl() const
{
    return m_Url;
}

void ChatCompletionRequestMessageContentPartImage_image_url::setUrl(const utility::string_t& value)
{
    m_Url = value;
    m_UrlIsSet = true;
}

bool ChatCompletionRequestMessageContentPartImage_image_url::urlIsSet() const
{
    return m_UrlIsSet;
}

void ChatCompletionRequestMessageContentPartImage_image_url::unsetUrl()
{
    m_UrlIsSet = false;
}
utility::string_t ChatCompletionRequestMessageContentPartImage_image_url::getDetail() const
{
    return m_Detail;
}

void ChatCompletionRequestMessageContentPartImage_image_url::setDetail(const utility::string_t& value)
{
    m_Detail = value;
    m_DetailIsSet = true;
}

bool ChatCompletionRequestMessageContentPartImage_image_url::detailIsSet() const
{
    return m_DetailIsSet;
}

void ChatCompletionRequestMessageContentPartImage_image_url::unsetDetail()
{
    m_DetailIsSet = false;
}
}
}
}
}


