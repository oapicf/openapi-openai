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
 * Image.h
 *
 * Represents the url or the content of an image generated by the OpenAI API.
 */

#ifndef Image_H_
#define Image_H_



#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Represents the url or the content of an image generated by the OpenAI API.
/// </summary>
class  Image 
{
public:
    Image() = default;
    explicit Image(boost::property_tree::ptree const& pt);
    virtual ~Image() = default;

    Image(const Image& other) = default; // copy constructor
    Image(Image&& other) noexcept = default; // move constructor

    Image& operator=(const Image& other) = default; // copy assignment
    Image& operator=(Image&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// Image members

    /// <summary>
    /// The base64-encoded JSON of the generated image, if &#x60;response_format&#x60; is &#x60;b64_json&#x60;.
    /// </summary>
    std::string getB64Json() const;
    void setB64Json(std::string value);

    /// <summary>
    /// The URL of the generated image, if &#x60;response_format&#x60; is &#x60;url&#x60; (default).
    /// </summary>
    std::string getUrl() const;
    void setUrl(std::string value);

    /// <summary>
    /// The prompt that was used to generate the image, if there was any revision to the prompt.
    /// </summary>
    std::string getRevisedPrompt() const;
    void setRevisedPrompt(std::string value);

protected:
    std::string m_B64_json = "";
    std::string m_Url = "";
    std::string m_Revised_prompt = "";
};

std::vector<Image> createImageVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<Image>(const Image& val) {
    return val.toPropertyTree();
}

template<>
inline Image fromPt<Image>(const boost::property_tree::ptree& pt) {
    Image ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* Image_H_ */
