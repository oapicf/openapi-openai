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
 * ChatCompletionRequestMessageContentPartImage.h
 *
 * 
 */

#ifndef ChatCompletionRequestMessageContentPartImage_H_
#define ChatCompletionRequestMessageContentPartImage_H_



#include "ChatCompletionRequestMessageContentPartImage_image_url.h"
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
class  ChatCompletionRequestMessageContentPartImage 
{
public:
    ChatCompletionRequestMessageContentPartImage() = default;
    explicit ChatCompletionRequestMessageContentPartImage(boost::property_tree::ptree const& pt);
    virtual ~ChatCompletionRequestMessageContentPartImage() = default;

    ChatCompletionRequestMessageContentPartImage(const ChatCompletionRequestMessageContentPartImage& other) = default; // copy constructor
    ChatCompletionRequestMessageContentPartImage(ChatCompletionRequestMessageContentPartImage&& other) noexcept = default; // move constructor

    ChatCompletionRequestMessageContentPartImage& operator=(const ChatCompletionRequestMessageContentPartImage& other) = default; // copy assignment
    ChatCompletionRequestMessageContentPartImage& operator=(ChatCompletionRequestMessageContentPartImage&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ChatCompletionRequestMessageContentPartImage members

    /// <summary>
    /// The type of the content part.
    /// </summary>
    std::string getType() const;
    void setType(std::string value);

    /// <summary>
    /// 
    /// </summary>
    ChatCompletionRequestMessageContentPartImage_image_url getImageUrl() const;
    void setImageUrl(ChatCompletionRequestMessageContentPartImage_image_url value);

protected:
    std::string m_Type = "";
    ChatCompletionRequestMessageContentPartImage_image_url m_Image_url;
};

std::vector<ChatCompletionRequestMessageContentPartImage> createChatCompletionRequestMessageContentPartImageVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ChatCompletionRequestMessageContentPartImage>(const ChatCompletionRequestMessageContentPartImage& val) {
    return val.toPropertyTree();
}

template<>
inline ChatCompletionRequestMessageContentPartImage fromPt<ChatCompletionRequestMessageContentPartImage>(const boost::property_tree::ptree& pt) {
    ChatCompletionRequestMessageContentPartImage ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ChatCompletionRequestMessageContentPartImage_H_ */
