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
 * MessageContentImageFileObject_image_file.h
 *
 * 
 */

#ifndef MessageContentImageFileObject_image_file_H_
#define MessageContentImageFileObject_image_file_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  MessageContentImageFileObject_image_file
{
public:
    MessageContentImageFileObject_image_file();
    virtual ~MessageContentImageFileObject_image_file() = default;


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

    bool operator==(const MessageContentImageFileObject_image_file& rhs) const;
    bool operator!=(const MessageContentImageFileObject_image_file& rhs) const;

    /////////////////////////////////////////////
    /// MessageContentImageFileObject_image_file members

    /// <summary>
    /// The [File](/docs/api-reference/files) ID of the image in the message content.
    /// </summary>
    std::string getFileId() const;
    void setFileId(std::string const& value);

    friend  void to_json(nlohmann::json& j, const MessageContentImageFileObject_image_file& o);
    friend  void from_json(const nlohmann::json& j, MessageContentImageFileObject_image_file& o);
protected:
    std::string m_File_id;

    
};

} // namespace org::openapitools::server::model

#endif /* MessageContentImageFileObject_image_file_H_ */
