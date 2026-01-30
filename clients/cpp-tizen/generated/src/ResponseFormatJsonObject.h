/*
 * ResponseFormatJsonObject.h
 *
 * 
 */

#ifndef _ResponseFormatJsonObject_H_
#define _ResponseFormatJsonObject_H_


#include <string>
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

class ResponseFormatJsonObject : public Object {
public:
	/*! \brief Constructor.
	 */
	ResponseFormatJsonObject();
	ResponseFormatJsonObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ResponseFormatJsonObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The type of response format being defined: `json_object`
	 */
	std::string getType();

	/*! \brief Set The type of response format being defined: `json_object`
	 */
	void setType(std::string  type);

private:
	std::string type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ResponseFormatJsonObject_H_ */
