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
 * ChatCompletionRequestMessageContentPartImage_image_url.h
 *
 * 
 */

#ifndef ChatCompletionRequestMessageContentPartImage_image_url_H_
#define ChatCompletionRequestMessageContentPartImage_image_url_H_



#include <string>
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ChatCompletionRequestMessageContentPartImage_image_url 
{
public:
    ChatCompletionRequestMessageContentPartImage_image_url() = default;
    explicit ChatCompletionRequestMessageContentPartImage_image_url(boost::property_tree::ptree const& pt);
    virtual ~ChatCompletionRequestMessageContentPartImage_image_url() = default;

    ChatCompletionRequestMessageContentPartImage_image_url(const ChatCompletionRequestMessageContentPartImage_image_url& other) = default; // copy constructor
    ChatCompletionRequestMessageContentPartImage_image_url(ChatCompletionRequestMessageContentPartImage_image_url&& other) noexcept = default; // move constructor

    ChatCompletionRequestMessageContentPartImage_image_url& operator=(const ChatCompletionRequestMessageContentPartImage_image_url& other) = default; // copy assignment
    ChatCompletionRequestMessageContentPartImage_image_url& operator=(ChatCompletionRequestMessageContentPartImage_image_url&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ChatCompletionRequestMessageContentPartImage_image_url members

    /// <summary>
    /// Either a URL of the image or the base64 encoded image data.
    /// </summary>
    std::string getUrl() const;
    void setUrl(std::string value);

    /// <summary>
    /// Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
    /// </summary>
    std::string getDetail() const;
    void setDetail(std::string value);

protected:
    std::string m_Url = "";
    std::string m_Detail = "auto";
};

std::vector<ChatCompletionRequestMessageContentPartImage_image_url> createChatCompletionRequestMessageContentPartImage_image_urlVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ChatCompletionRequestMessageContentPartImage_image_url>(const ChatCompletionRequestMessageContentPartImage_image_url& val) {
    return val.toPropertyTree();
}

template<>
inline ChatCompletionRequestMessageContentPartImage_image_url fromPt<ChatCompletionRequestMessageContentPartImage_image_url>(const boost::property_tree::ptree& pt) {
    ChatCompletionRequestMessageContentPartImage_image_url ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ChatCompletionRequestMessageContentPartImage_image_url_H_ */
