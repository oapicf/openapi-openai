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
 * FunctionObject.h
 *
 * 
 */

#ifndef FunctionObject_H_
#define FunctionObject_H_


#include <nlohmann/json.hpp>
#include <string>
#include <map>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  FunctionObject
{
public:
    FunctionObject();
    virtual ~FunctionObject() = default;


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

    bool operator==(const FunctionObject& rhs) const;
    bool operator!=(const FunctionObject& rhs) const;

    /////////////////////////////////////////////
    /// FunctionObject members

    /// <summary>
    /// A description of what the function does, used by the model to choose when and how to call the function.
    /// </summary>
    std::string getDescription() const;
    void setDescription(std::string const& value);
    bool descriptionIsSet() const;
    void unsetDescription();
    /// <summary>
    /// The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
    /// </summary>
    std::string getName() const;
    void setName(std::string const& value);
    /// <summary>
    /// The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/text-generation/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting &#x60;parameters&#x60; defines a function with an empty parameter list.
    /// </summary>
    std::map<std::string, nlohmann::json> getParameters() const;
    void setParameters(std::map<std::string, nlohmann::json> const& value);
    bool parametersIsSet() const;
    void unsetParameters();

    friend  void to_json(nlohmann::json& j, const FunctionObject& o);
    friend  void from_json(const nlohmann::json& j, FunctionObject& o);
protected:
    std::string m_Description;
    bool m_DescriptionIsSet;
    std::string m_Name;

    std::map<std::string, nlohmann::json> m_Parameters;
    bool m_ParametersIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* FunctionObject_H_ */
