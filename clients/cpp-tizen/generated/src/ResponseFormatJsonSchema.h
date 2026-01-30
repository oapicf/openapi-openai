/*
 * ResponseFormatJsonSchema.h
 *
 * 
 */

#ifndef _ResponseFormatJsonSchema_H_
#define _ResponseFormatJsonSchema_H_


#include <string>
#include "ResponseFormatJsonSchema_json_schema.h"
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

class ResponseFormatJsonSchema : public Object {
public:
	/*! \brief Constructor.
	 */
	ResponseFormatJsonSchema();
	ResponseFormatJsonSchema(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ResponseFormatJsonSchema();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The type of response format being defined: `json_schema`
	 */
	std::string getType();

	/*! \brief Set The type of response format being defined: `json_schema`
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	ResponseFormatJsonSchema_json_schema getJsonSchema();

	/*! \brief Set 
	 */
	void setJsonSchema(ResponseFormatJsonSchema_json_schema  json_schema);

private:
	std::string type;
	ResponseFormatJsonSchema_json_schema json_schema;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ResponseFormatJsonSchema_H_ */
