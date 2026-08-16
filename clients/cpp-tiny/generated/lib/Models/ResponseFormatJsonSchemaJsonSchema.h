
/*
 * ResponseFormatJsonSchema_json_schema.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ResponseFormatJsonSchema_json_schema_H_
#define TINY_CPP_CLIENT_ResponseFormatJsonSchema_json_schema_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"
#include <map>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ResponseFormatJsonSchema_json_schema{
public:

    /*! \brief Constructor.
	 */
    ResponseFormatJsonSchema_json_schema();
    ResponseFormatJsonSchema_json_schema(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ResponseFormatJsonSchema_json_schema();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get A description of what the response format is for, used by the model to determine how to respond in the format.
	 */
	std::string getDescription();

	/*! \brief Set A description of what the response format is for, used by the model to determine how to respond in the format.
	 */
	void setDescription(std::string  description);
	/*! \brief Get The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
	 */
	std::string getName();

	/*! \brief Set The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
	 */
	void setName(std::string  name);
	/*! \brief Get The schema for the response format, described as a JSON Schema object.
	 */
	Map<std::string, std::string> getSchema();

	/*! \brief Set The schema for the response format, described as a JSON Schema object.
	 */
	void setSchema(Map <std::string, std::string> schema);
	/*! \brief Get Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).
	 */
	bool isStrict();

	/*! \brief Set Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).
	 */
	void setStrict(bool  strict);


    private:
    std::string description{};
    std::string name{};
    Map<std::string, std::string> schema;
    bool strict{};
};
}

#endif /* TINY_CPP_CLIENT_ResponseFormatJsonSchema_json_schema_H_ */
