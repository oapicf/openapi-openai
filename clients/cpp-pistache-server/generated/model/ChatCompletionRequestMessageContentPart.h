/**
* OpenAI API
* The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * ChatCompletionRequestMessageContentPart.h
 *
 * 
 */

#ifndef ChatCompletionRequestMessageContentPart_H_
#define ChatCompletionRequestMessageContentPart_H_


#include "ChatCompletionRequestMessageContentPartImage_image_url.h"
#include "ChatCompletionRequestMessageContentPartText.h"
#include <string>
#include "ChatCompletionRequestMessageContentPartImage.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  ChatCompletionRequestMessageContentPart
{
public:
    ChatCompletionRequestMessageContentPart();
    virtual ~ChatCompletionRequestMessageContentPart() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const ChatCompletionRequestMessageContentPart& rhs) const;
    bool operator!=(const ChatCompletionRequestMessageContentPart& rhs) const;

    /////////////////////////////////////////////
    /// ChatCompletionRequestMessageContentPart members

    /// <summary>
    /// The type of the content part.
    /// </summary>
    std::string getType() const;
    void setType(std::string const& value);
    /// <summary>
    /// The text content.
    /// </summary>
    std::string getText() const;
    void setText(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::ChatCompletionRequestMessageContentPartImage_image_url getImageUrl() const;
    void setImageUrl(org::openapitools::server::model::ChatCompletionRequestMessageContentPartImage_image_url const& value);

    friend  void to_json(nlohmann::json& j, const ChatCompletionRequestMessageContentPart& o);
    friend  void from_json(const nlohmann::json& j, ChatCompletionRequestMessageContentPart& o);
protected:
    std::string m_Type;

    std::string m_Text;

    org::openapitools::server::model::ChatCompletionRequestMessageContentPartImage_image_url m_Image_url;

    
};

} // namespace org::openapitools::server::model

#endif /* ChatCompletionRequestMessageContentPart_H_ */