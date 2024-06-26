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
 * MessageDeltaContentTextObject_text.h
 *
 * 
 */

#ifndef MessageDeltaContentTextObject_text_H_
#define MessageDeltaContentTextObject_text_H_


#include <string>
#include "MessageDeltaContentTextObject_text_annotations_inner.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  MessageDeltaContentTextObject_text
{
public:
    MessageDeltaContentTextObject_text();
    virtual ~MessageDeltaContentTextObject_text() = default;


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

    bool operator==(const MessageDeltaContentTextObject_text& rhs) const;
    bool operator!=(const MessageDeltaContentTextObject_text& rhs) const;

    /////////////////////////////////////////////
    /// MessageDeltaContentTextObject_text members

    /// <summary>
    /// The data that makes up the text.
    /// </summary>
    std::string getValue() const;
    void setValue(std::string const& value);
    bool valueIsSet() const;
    void unsetValue();
    /// <summary>
    /// 
    /// </summary>
    std::vector<org::openapitools::server::model::MessageDeltaContentTextObject_text_annotations_inner> getAnnotations() const;
    void setAnnotations(std::vector<org::openapitools::server::model::MessageDeltaContentTextObject_text_annotations_inner> const& value);
    bool annotationsIsSet() const;
    void unsetAnnotations();

    friend  void to_json(nlohmann::json& j, const MessageDeltaContentTextObject_text& o);
    friend  void from_json(const nlohmann::json& j, MessageDeltaContentTextObject_text& o);
protected:
    std::string m_Value;
    bool m_ValueIsSet;
    std::vector<org::openapitools::server::model::MessageDeltaContentTextObject_text_annotations_inner> m_Annotations;
    bool m_AnnotationsIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* MessageDeltaContentTextObject_text_H_ */
