/*
 * ResponseFormatJsonSchema_json_schema.h
 *
 * 
 */

#ifndef _ResponseFormatJsonSchema_json_schema_H_
#define _ResponseFormatJsonSchema_json_schema_H_


#include <string>
#include "AnyType.h"
#include <map>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ResponseFormatJsonSchema_json_schema : public Object {
public:
	/*! \brief Constructor.
	 */
	ResponseFormatJsonSchema_json_schema();
	ResponseFormatJsonSchema_json_schema(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ResponseFormatJsonSchema_json_schema();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::map<std::string, std::string> getSchema();

	/*! \brief Set The schema for the response format, described as a JSON Schema object.
	 */
	void setSchema(std::map <std::string, std::string> schema);
	/*! \brief Get Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).
	 */
	bool getStrict();

	/*! \brief Set Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).
	 */
	void setStrict(bool  strict);

private:
	std::string description;
	std::string name;
	std::map <std::string, std::string>schema;
	bool strict;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ResponseFormatJsonSchema_json_schema_H_ */
