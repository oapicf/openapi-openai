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
 * FunctionObject.h
 *
 * 
 */

#ifndef FunctionObject_H_
#define FunctionObject_H_



#include <string>
#include <map>
#include "AnyType.h"
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  FunctionObject 
{
public:
    FunctionObject() = default;
    explicit FunctionObject(boost::property_tree::ptree const& pt);
    virtual ~FunctionObject() = default;

    FunctionObject(const FunctionObject& other) = default; // copy constructor
    FunctionObject(FunctionObject&& other) noexcept = default; // move constructor

    FunctionObject& operator=(const FunctionObject& other) = default; // copy assignment
    FunctionObject& operator=(FunctionObject&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// FunctionObject members

    /// <summary>
    /// A description of what the function does, used by the model to choose when and how to call the function.
    /// </summary>
    std::string getDescription() const;
    void setDescription(std::string value);

    /// <summary>
    /// The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

    /// <summary>
    /// The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/text-generation/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting &#x60;parameters&#x60; defines a function with an empty parameter list.
    /// </summary>
    std::map<std::string, AnyType> getParameters() const;
    void setParameters(std::map<std::string, AnyType> value);

protected:
    std::string m_Description = "";
    std::string m_Name = "";
    std::map<std::string, AnyType> m_Parameters;
};

std::vector<FunctionObject> createFunctionObjectVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<FunctionObject>(const FunctionObject& val) {
    return val.toPropertyTree();
}

template<>
inline FunctionObject fromPt<FunctionObject>(const boost::property_tree::ptree& pt) {
    FunctionObject ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* FunctionObject_H_ */
